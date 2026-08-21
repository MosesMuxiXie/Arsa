/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.TelemetryEvent
 *  com.mojang.authlib.minecraft.TelemetryPropertyContainer
 *  com.mojang.authlib.minecraft.TelemetrySession
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 */
import com.mojang.authlib.minecraft.TelemetryEvent;
import com.mojang.authlib.minecraft.TelemetryPropertyContainer;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class irb {
    static final Map<String, irb> h = new Object2ObjectLinkedOpenHashMap();
    public static final Codec<irb> a = Codec.STRING.comapFlatMap($$0 -> {
        irb $$1 = h.get($$0);
        if ($$1 != null) {
            return DataResult.success((Object)$$1);
        }
        return DataResult.error(() -> "No TelemetryEventType with key: '" + $$0 + "'");
    }, irb::a);
    private static final List<ird<?>> i = List.of(ird.a, ird.b, ird.c, ird.d, ird.e, ird.f, ird.g, ird.h, ird.m, ird.l);
    private static final List<ird<?>> j = Stream.concat(i.stream(), Stream.of(ird.i, ird.j, ird.k)).toList();
    public static final irb b = irb.a("world_loaded", "WorldLoaded").a(j).a(ird.n).a(ird.o).b();
    public static final irb c = irb.a("performance_metrics", "PerformanceMetrics").a(j).a(ird.r).a(ird.s).a(ird.t).a(ird.u).a(ird.v).a(ird.w).a().b();
    public static final irb d = irb.a("world_load_times", "WorldLoadTimes").a(j).a(ird.x).a(ird.y).a().b();
    public static final irb e = irb.a("world_unloaded", "WorldUnloaded").a(j).a(ird.p).a(ird.q).b();
    public static final irb f = irb.a("advancement_made", "AdvancementMade").a(j).a(ird.D).a(ird.E).a().b();
    public static final irb g = irb.a("game_load_times", "GameLoadTimes").a(i).a(ird.z).a(ird.A).a(ird.B).a(ird.C).a().b();
    private final String k;
    private final String l;
    private final List<ird<?>> m;
    private final boolean n;
    private final MapCodec<iqx> o;

    irb(String $$02, String $$1, List<ird<?>> $$2, boolean $$3) {
        this.k = $$02;
        this.l = $$1;
        this.m = $$2;
        this.n = $$3;
        this.o = ire.a($$2).xmap($$0 -> new iqx(this, (ire)$$0), iqx::b);
    }

    public static a a(String $$0, String $$1) {
        return new a($$0, $$1);
    }

    public String a() {
        return this.k;
    }

    public List<ird<?>> b() {
        return this.m;
    }

    public MapCodec<iqx> c() {
        return this.o;
    }

    public boolean d() {
        return this.n;
    }

    public TelemetryEvent a(TelemetrySession $$0, ire $$1) {
        TelemetryEvent $$2 = $$0.createNewEvent(this.l);
        for (ird<?> $$3 : this.m) {
            $$3.a($$1, (TelemetryPropertyContainer)$$2);
        }
        return $$2;
    }

    public <T> boolean a(ird<T> $$0) {
        return this.m.contains($$0);
    }

    public String toString() {
        return "TelemetryEventType[" + this.k + "]";
    }

    public yw e() {
        return this.a("title");
    }

    public yw f() {
        return this.a("description");
    }

    private yw a(String $$0) {
        return yh.c("telemetry.event." + this.k + "." + $$0);
    }

    public static List<irb> g() {
        return List.copyOf(h.values());
    }

    public static class a {
        private final String a;
        private final String b;
        private final List<ird<?>> c = new ArrayList();
        private boolean d;

        a(String $$0, String $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public a a(List<ird<?>> $$0) {
            this.c.addAll($$0);
            return this;
        }

        public <T> a a(ird<T> $$0) {
            this.c.add($$0);
            return this;
        }

        public a a() {
            this.d = true;
            return this;
        }

        public irb b() {
            irb $$0 = new irb(this.a, this.b, List.copyOf(this.c), this.d);
            if (h.putIfAbsent(this.a, $$0) != null) {
                throw new IllegalStateException("Duplicate TelemetryEventType with key: '" + this.a + "'");
            }
            return $$0;
        }
    }
}

