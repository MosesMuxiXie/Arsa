/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.LongSerializationPolicy
 *  com.mojang.datafixers.util.Pair
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.LongSerializationPolicy;
import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class cag {
    private static final String b = "bytesPerSecond";
    private static final String c = "count";
    private static final String d = "durationNanosTotal";
    private static final String e = "totalBytes";
    private static final String f = "countPerSecond";
    final Gson a = new GsonBuilder().setPrettyPrinting().setLongSerializationPolicy(LongSerializationPolicy.DEFAULT).create();

    private static void a(cap $$0, JsonObject $$1) {
        $$1.addProperty("protocolId", $$0.b());
        $$1.addProperty("packetId", $$0.c());
    }

    private static void a(caj $$0, JsonObject $$1) {
        $$1.addProperty("level", $$0.a());
        $$1.addProperty("dimension", $$0.b());
        $$1.addProperty("x", (Number)$$0.c());
        $$1.addProperty("z", (Number)$$0.d());
    }

    public String a(cae $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.addProperty("startedEpoch", (Number)$$0.c().toEpochMilli());
        $$1.addProperty("endedEpoch", (Number)$$0.d().toEpochMilli());
        $$1.addProperty("durationMs", (Number)$$0.e().toMillis());
        Duration $$2 = $$0.f();
        if ($$2 != null) {
            $$1.addProperty("worldGenDurationMs", (Number)$$2.toMillis());
        }
        $$1.add("heap", this.a($$0.j()));
        $$1.add("cpuPercent", this.e($$0.i()));
        $$1.add("network", this.c($$0));
        $$1.add("fileIO", this.b($$0));
        $$1.add("fps", this.d($$0.g()));
        $$1.add("serverTick", this.c($$0.h()));
        $$1.add("threadAllocation", this.a($$0.k()));
        $$1.add("chunkGen", this.b($$0.a()));
        $$1.add("structureGen", this.a($$0.s()));
        return this.a.toJson((JsonElement)$$1);
    }

    private JsonElement a(can.a $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.addProperty("allocationRateBytesPerSecond", (Number)$$0.e());
        $$1.addProperty("gcCount", (Number)$$0.d());
        $$1.addProperty("gcOverHeadPercent", (Number)Float.valueOf($$0.a()));
        $$1.addProperty("gcTotalDurationMs", (Number)$$0.c().toMillis());
        return $$1;
    }

    private JsonElement a(List<caq> $$0) {
        JsonObject $$1 = new JsonObject();
        Optional<cau<caq>> $$2 = cau.a($$0);
        if ($$2.isEmpty()) {
            return $$1;
        }
        cau<caq> $$32 = $$2.get();
        JsonArray $$42 = new JsonArray();
        $$1.add("structure", (JsonElement)$$42);
        $$0.stream().collect(Collectors.groupingBy(caq::c)).forEach(($$3, $$4) -> {
            Optional $$5 = cau.a($$4);
            if ($$5.isEmpty()) {
                return;
            }
            cau $$6 = $$5.get();
            JsonObject $$7 = new JsonObject();
            $$42.add((JsonElement)$$7);
            $$7.addProperty("name", $$3);
            $$7.addProperty(c, (Number)$$6.d());
            $$7.addProperty(d, (Number)$$6.f().toNanos());
            $$7.addProperty("durationNanosAvg", (Number)($$6.f().toNanos() / (long)$$6.d()));
            JsonObject $$8 = bhs.a(new JsonObject(), (? super T $$1) -> $$7.add("durationNanosPercentiles", (JsonElement)$$1));
            $$6.e().forEach(($$1, $$2) -> $$8.addProperty("p" + $$1, (Number)$$2));
            Function<caq, JsonElement> $$9 = $$0 -> {
                JsonObject $$1 = new JsonObject();
                $$1.addProperty("durationNanos", (Number)$$0.a().toNanos());
                $$1.addProperty("chunkPosX", (Number)$$0.b().h);
                $$1.addProperty("chunkPosZ", (Number)$$0.b().i);
                $$1.addProperty("structureName", $$0.c());
                $$1.addProperty("level", $$0.d());
                $$1.addProperty("success", Boolean.valueOf($$0.e()));
                return $$1;
            };
            $$1.add("fastest", $$9.apply((caq)$$32.a()));
            $$1.add("slowest", $$9.apply((caq)$$32.b()));
            $$1.add("secondSlowest", (JsonElement)($$32.c() != null ? $$9.apply((caq)$$32.c()) : JsonNull.INSTANCE));
        });
        return $$1;
    }

    private JsonElement b(List<Pair<erj, cau<cai>>> $$02) {
        JsonObject $$12 = new JsonObject();
        if ($$02.isEmpty()) {
            return $$12;
        }
        $$12.addProperty(d, (Number)$$02.stream().mapToDouble($$0 -> ((cau)$$0.getSecond()).f().toNanos()).sum());
        JsonArray $$22 = bhs.a(new JsonArray(), (? super T $$1) -> $$12.add("status", (JsonElement)$$1));
        for (Pair<erj, cau<cai>> $$3 : $$02) {
            cau $$4 = (cau)$$3.getSecond();
            JsonObject $$5 = bhs.a(new JsonObject(), arg_0 -> ((JsonArray)$$22).add(arg_0));
            $$5.addProperty("state", ((erj)$$3.getFirst()).toString());
            $$5.addProperty(c, (Number)$$4.d());
            $$5.addProperty(d, (Number)$$4.f().toNanos());
            $$5.addProperty("durationNanosAvg", (Number)($$4.f().toNanos() / (long)$$4.d()));
            JsonObject $$6 = bhs.a(new JsonObject(), (? super T $$1) -> $$5.add("durationNanosPercentiles", (JsonElement)$$1));
            $$4.e().forEach(($$1, $$2) -> $$6.addProperty("p" + $$1, (Number)$$2));
            Function<cai, JsonElement> $$7 = $$0 -> {
                JsonObject $$1 = new JsonObject();
                $$1.addProperty("durationNanos", (Number)$$0.a().toNanos());
                $$1.addProperty("level", $$0.e());
                $$1.addProperty("chunkPosX", (Number)$$0.b().h);
                $$1.addProperty("chunkPosZ", (Number)$$0.b().i);
                $$1.addProperty("worldPosX", (Number)$$0.c().c());
                $$1.addProperty("worldPosZ", (Number)$$0.c().d());
                return $$1;
            };
            $$5.add("fastest", $$7.apply((cai)$$4.a()));
            $$5.add("slowest", $$7.apply((cai)$$4.b()));
            $$5.add("secondSlowest", (JsonElement)($$4.c() != null ? $$7.apply((cai)$$4.c()) : JsonNull.INSTANCE));
        }
        return $$12;
    }

    private JsonElement a(car.a $$0) {
        JsonArray $$12 = new JsonArray();
        $$0.a().forEach(($$1, $$22) -> $$12.add((JsonElement)bhs.a(new JsonObject(), (? super T $$2) -> {
            $$2.addProperty("thread", $$1);
            $$2.addProperty(b, (Number)$$22);
        })));
        return $$12;
    }

    private JsonElement c(List<cas> $$02) {
        if ($$02.isEmpty()) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$12 = new JsonObject();
        double[] $$22 = $$02.stream().mapToDouble($$0 -> (double)$$0.b().toNanos() / 1000000.0).toArray();
        DoubleSummaryStatistics $$3 = DoubleStream.of($$22).summaryStatistics();
        $$12.addProperty("minMs", (Number)$$3.getMin());
        $$12.addProperty("averageMs", (Number)$$3.getAverage());
        $$12.addProperty("maxMs", (Number)$$3.getMax());
        Map<Integer, Double> $$4 = bzv.a($$22);
        $$4.forEach(($$1, $$2) -> $$12.addProperty("p" + $$1, (Number)$$2));
        return $$12;
    }

    private JsonElement d(List<cam> $$0) {
        if ($$0.isEmpty()) {
            return JsonNull.INSTANCE;
        }
        JsonObject $$12 = new JsonObject();
        int[] $$22 = $$0.stream().mapToInt(cam::a).toArray();
        IntSummaryStatistics $$3 = IntStream.of($$22).summaryStatistics();
        $$12.addProperty("minFPS", (Number)$$3.getMin());
        $$12.addProperty("averageFPS", (Number)$$3.getAverage());
        $$12.addProperty("maxFPS", (Number)$$3.getMax());
        Map<Integer, Double> $$4 = bzv.a($$22);
        $$4.forEach(($$1, $$2) -> $$12.addProperty("p" + $$1, (Number)$$2));
        return $$12;
    }

    private JsonElement b(cae $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.add("write", this.a($$0.p()));
        $$1.add("read", this.a($$0.q()));
        $$1.add("chunksRead", this.a($$0.o(), cag::a));
        $$1.add("chunksWritten", this.a($$0.n(), cag::a));
        return $$1;
    }

    private JsonElement a(cal.a $$0) {
        JsonObject $$12 = new JsonObject();
        $$12.addProperty(e, (Number)$$0.a());
        $$12.addProperty(c, (Number)$$0.c());
        $$12.addProperty(b, (Number)$$0.b());
        $$12.addProperty(f, (Number)$$0.d());
        JsonArray $$2 = new JsonArray();
        $$12.add("topContributors", (JsonElement)$$2);
        $$0.f().forEach($$1 -> {
            JsonObject $$2 = new JsonObject();
            $$2.add((JsonElement)$$2);
            $$2.addProperty("path", (String)$$1.getFirst());
            $$2.addProperty(e, (Number)$$1.getSecond());
        });
        return $$12;
    }

    private JsonElement c(cae $$0) {
        JsonObject $$1 = new JsonObject();
        $$1.add("sent", this.a($$0.m(), cag::a));
        $$1.add("received", this.a($$0.l(), cag::a));
        return $$1;
    }

    private <T> JsonElement a(cao<T> $$0, BiConsumer<T, JsonObject> $$1) {
        JsonObject $$22 = new JsonObject();
        $$22.addProperty(e, (Number)$$0.d());
        $$22.addProperty(c, (Number)$$0.c());
        $$22.addProperty(b, (Number)$$0.b());
        $$22.addProperty(f, (Number)$$0.a());
        JsonArray $$3 = new JsonArray();
        $$22.add("topContributors", (JsonElement)$$3);
        $$0.e().forEach($$2 -> {
            JsonObject $$3 = new JsonObject();
            $$3.add((JsonElement)$$3);
            Object $$4 = $$2.getFirst();
            cao.a $$5 = (cao.a)$$2.getSecond();
            $$1.accept($$4, $$3);
            $$3.addProperty(e, (Number)$$5.c());
            $$3.addProperty(c, (Number)$$5.b());
            $$3.addProperty("averageSize", (Number)Float.valueOf($$5.a()));
        });
        return $$22;
    }

    private JsonElement e(List<cak> $$02) {
        JsonObject $$12 = new JsonObject();
        BiFunction<List, ToDoubleFunction, JsonObject> $$2 = ($$0, $$1) -> {
            JsonObject $$2 = new JsonObject();
            DoubleSummaryStatistics $$3 = $$0.stream().mapToDouble($$1).summaryStatistics();
            $$2.addProperty("min", (Number)$$3.getMin());
            $$2.addProperty("average", (Number)$$3.getAverage());
            $$2.addProperty("max", (Number)$$3.getMax());
            return $$2;
        };
        $$12.add("jvm", (JsonElement)$$2.apply($$02, cak::a));
        $$12.add("userJvm", (JsonElement)$$2.apply($$02, cak::b));
        $$12.add("system", (JsonElement)$$2.apply($$02, cak::c));
        return $$12;
    }
}

