/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.Lifecycle
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class amp {
    private static final Logger d = LogUtils.getLogger();
    private static final Comparator<amt<?>> e = Comparator.comparing(amt::b).thenComparing(amt::a);
    private static final jp f = new jp(Optional.empty(), Lifecycle.experimental());
    private static final Function<Optional<bag>, jp> g = bhs.b((T $$02) -> {
        Lifecycle $$1 = $$02.map(bag::a).map($$0 -> Lifecycle.stable()).orElse(Lifecycle.experimental());
        return new jp((Optional<bag>)$$02, $$1);
    });
    public static final List<d<?>> a = List.of(new d<esh>(mj.bd, esh.h), new d<dxo>(mj.aS, dxo.a), new d<yd>(mj.aU, yd.a), new d(mj.aX, ewu.a), new d(mj.aY, exi.a), new d<fes>(mj.bp, fes.a), new d<ffo>(mj.bs, ffo.a), new d<ffu>(mj.br, ffu.a), new d<fjo>(mj.bq, fjp.c), new d<fgy>(mj.bt, fgy.a), new d<euv>(mj.bl, euv.a), new d<fke.a>(mj.bm, fke.a.a), new d<euj>(mj.bb, euj.c), new d<ffd>(mj.bD, ffd.a), new d<fdp>(mj.bg, fdp.a), new d<dut>(mj.bA, dut.a), new d<dur>(mj.bz, dur.a), new d<eni>(mj.bx, eni.b), new d<cxx>(mj.bB, cxx.a, true), new d<cxv>(mj.bC, cxv.a, true), new d<cxc>(mj.bo, cxc.a, true), new d<cvs>(mj.bh, cvs.a, true), new d<cvc>(mj.aT, cvc.a, true), new d<cui>(mj.aZ, cui.a, true), new d<cud>(mj.aV, cud.a, true), new d<cws>(mj.aW, cws.a, true), new d<czh>(mj.bn, czh.a, true), new d<cez>(mj.ba, cez.a), new d<dyc>(mj.bk, dyc.a), new d<ekq>(mj.aR, ekq.a), new d<dso>(mj.bf, dso.b), new d<dtz>(mj.be, dtz.a), new d<dlz>(mj.bj, dlz.a), new d<dlm>(mj.bi, dlm.a), new d<tv>(mj.bu, tv.a), new d<tb>(mj.bv, tb.b), new d<asj>(mj.bc, asj.c), new d<fvn>(mj.bw, fvn.b));
    public static final List<d<?>> b = List.of(new d<esi>(mj.bF, esi.a));
    public static final List<d<?>> c = List.of(new d<dxo>(mj.aS, dxo.b), new d<yd>(mj.aU, yd.a), new d<dut>(mj.bA, dut.a), new d<dur>(mj.bz, dur.a), new d<cxx>(mj.bB, cxx.b, true), new d<cxv>(mj.bC, cxv.b, true), new d<cxc>(mj.bo, cxc.b, true), new d<cvs>(mj.bh, cvs.b, true), new d<cvc>(mj.aT, cvc.b, true), new d<cui>(mj.aZ, cui.b, true), new d<cud>(mj.aV, cud.b, true), new d<cws>(mj.aW, cws.b, true), new d<czh>(mj.bn, czh.a, true), new d<esh>(mj.bd, esh.i), new d<cez>(mj.ba, cez.a), new d<ekq>(mj.aR, ekq.a), new d<dso>(mj.bf, dso.b), new d<dlz>(mj.bj, dlz.a), new d<dlm>(mj.bi, dlm.a), new d<tv>(mj.bu, tv.a), new d<tb>(mj.bv, tb.b), new d<asj>(mj.bc, asj.c), new d<fvn>(mj.bw, fvn.c));

    public static jr.b a(baz $$0, List<jf.b<?>> $$12, List<d<?>> $$22) {
        return amp.a((a<?> $$1, ams.c $$2) -> $$1.a($$0, $$2), $$12, $$22);
    }

    public static jr.b a(Map<amt<? extends jq<?>>, c> $$0, bbc $$1, List<jf.b<?>> $$22, List<d<?>> $$32) {
        return amp.a((a<?> $$2, ams.c $$3) -> $$2.a($$0, $$1, $$3), $$22, $$32);
    }

    private static jr.b a(b $$0, List<jf.b<?>> $$12, List<d<?>> $$22) {
        HashMap $$3 = new HashMap();
        List<a<?>> $$4 = $$22.stream().map($$1 -> $$1.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
        ams.c $$5 = amp.a($$12, $$4);
        $$4.forEach($$2 -> $$0.apply((a<?>)$$2, $$5));
        $$4.forEach($$1 -> {
            jz $$2 = $$1.b();
            try {
                $$2.n();
            }
            catch (Exception $$3) {
                $$3.put($$2.g(), $$3);
            }
            if ($$1.a.c && $$2.d() == 0) {
                $$3.put($$2.g(), new IllegalStateException("Registry must be non-empty: " + String.valueOf($$2.g().a())));
            }
        });
        if (!$$3.isEmpty()) {
            throw amp.a($$3);
        }
        return new jr.c($$4.stream().map(a::b).toList()).e();
    }

    private static ams.c a(List<jf.b<?>> $$0, List<a<?>> $$12) {
        final HashMap $$2 = new HashMap();
        $$0.forEach($$1 -> $$2.put($$1.g(), amp.a($$1)));
        $$12.forEach($$1 -> $$2.put($$1.b.g(), amp.a($$1.b)));
        return new ams.c(){

            @Override
            public <T> Optional<ams.b<T>> a(amt<? extends jq<? extends T>> $$0) {
                return Optional.ofNullable((ams.b)$$2.get($$0));
            }
        };
    }

    private static <T> ams.b<T> a(jz<T> $$0) {
        return new ams.b<T>($$0, $$0.p(), $$0.h());
    }

    private static <T> ams.b<T> a(jf.b<T> $$0) {
        return new ams.b<T>($$0, $$0, $$0.h());
    }

    private static v a(Map<amt<?>, Exception> $$0) {
        amp.b($$0);
        return amp.c($$0);
    }

    private static void b(Map<amt<?>, Exception> $$02) {
        StringWriter $$1 = new StringWriter();
        PrintWriter $$2 = new PrintWriter($$1);
        Map<amo, Map<amo, Exception>> $$3 = $$02.entrySet().stream().collect(Collectors.groupingBy($$0 -> ((amt)$$0.getKey()).b(), Collectors.toMap($$0 -> ((amt)$$0.getKey()).a(), Map.Entry::getValue)));
        $$3.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach($$12 -> {
            $$2.printf(Locale.ROOT, "> Errors in registry %s:%n", $$12.getKey());
            ((Map)$$12.getValue()).entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach($$1 -> {
                $$2.printf(Locale.ROOT, ">> Errors in element %s:%n", $$1.getKey());
                ((Exception)$$1.getValue()).printStackTrace($$2);
            });
        });
        $$2.flush();
        d.error("Registry loading errors:\n{}", (Object)$$1);
    }

    private static v c(Map<amt<?>, Exception> $$0) {
        m $$1 = m.a(new IllegalStateException("Failed to load registries due to errors"), "Registry Loading");
        n $$2 = $$1.a("Loading info");
        $$2.a("Errors", () -> {
            StringBuilder $$12 = new StringBuilder();
            $$0.entrySet().stream().sorted(Map.Entry.comparingByKey(e)).forEach($$1 -> $$12.append("\n\t\t").append(((amt)$$1.getKey()).b()).append("/").append(((amt)$$1.getKey()).a()).append(": ").append(((Exception)$$1.getValue()).getMessage()));
            return $$12.toString();
        });
        return new v($$1);
    }

    private static <E> void a(jz<E> $$0, Decoder<E> $$1, ams<JsonElement> $$2, amt<E> $$3, bax $$4, jp $$5) throws IOException {
        try (BufferedReader $$6 = $$4.e();){
            JsonElement $$7 = bhf.a($$6);
            DataResult $$8 = $$1.parse($$2, (Object)$$7);
            Object $$9 = $$8.getOrThrow();
            $$0.a($$3, $$9, $$5);
        }
    }

    static <E> void a(baz $$0, ams.c $$1, jz<E> $$2, Decoder<E> $$3, Map<amt<?>, Exception> $$4) {
        amm $$5 = amm.a($$2.g());
        ams<JsonElement> $$6 = ams.a(JsonOps.INSTANCE, $$1);
        for (Map.Entry<amo, bax> $$7 : $$5.a($$0).entrySet()) {
            amo $$8 = $$7.getKey();
            amt $$9 = amt.a($$2.g(), $$5.b($$8));
            bax $$10 = $$7.getValue();
            jp $$11 = g.apply($$10.c());
            try {
                amp.a($$2, $$3, $$6, $$9, $$10, $$11);
            }
            catch (Exception $$12) {
                $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), $$12));
            }
        }
        beg.a($$0, $$2);
    }

    static <E> void a(Map<amt<? extends jq<?>>, c> $$0, bbc $$1, ams.c $$2, jz<E> $$3, Decoder<E> $$4, Map<amt<?>, Exception> $$5) {
        c $$6 = $$0.get($$3.g());
        if ($$6 == null) {
            return;
        }
        ams<vz> $$7 = ams.a(vn.a, $$2);
        ams<JsonElement> $$8 = ams.a(JsonOps.INSTANCE, $$2);
        amm $$9 = amm.a($$3.g());
        for (ju.a $$10 : $$6.a) {
            amt $$11 = amt.a($$3.g(), $$10.a());
            Optional<vz> $$12 = $$10.b();
            if ($$12.isPresent()) {
                try {
                    DataResult $$13 = $$4.parse($$7, (Object)$$12.get());
                    Object $$14 = $$13.getOrThrow();
                    $$3.a($$11, $$14, f);
                }
                catch (Exception $$15) {
                    $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$12.get()), $$15));
                }
                continue;
            }
            amo $$16 = $$9.a($$10.a());
            try {
                bax $$17 = $$1.getResourceOrThrow($$16);
                amp.a($$3, $$4, $$8, $$11, $$17, f);
            }
            catch (Exception $$18) {
                $$5.put($$11, new IllegalStateException("Failed to parse local data", $$18));
            }
        }
        beg.a($$6.b, $$3);
    }

    @FunctionalInterface
    static interface b {
        public void apply(a<?> var1, ams.c var2);
    }

    public static final class c
    extends Record {
        final List<ju.a> a;
        final beh.a b;

        public c(List<ju.a> $$0, beh.a $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "elements;tags", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "elements;tags", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "elements;tags", "a", "b"}, this, $$0);
        }

        public List<ju.a> a() {
            return this.a;
        }

        public beh.a b() {
            return this.b;
        }
    }

    static final class a<T>
    extends Record {
        final d<T> a;
        final jz<T> b;
        private final Map<amt<?>, Exception> c;

        a(d<T> $$0, jz<T> $$1, Map<amt<?>, Exception> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(baz $$0, ams.c $$1) {
            amp.a($$0, $$1, this.b, this.a.b, this.c);
        }

        public void a(Map<amt<? extends jq<?>>, c> $$0, bbc $$1, ams.c $$2) {
            amp.a($$0, $$1, $$2, this.b, this.a.b, this.c);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "data;registry;loadingErrors", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "data;registry;loadingErrors", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "data;registry;loadingErrors", "a", "b", "c"}, this, $$0);
        }

        public d<T> a() {
            return this.a;
        }

        public jz<T> b() {
            return this.b;
        }

        public Map<amt<?>, Exception> c() {
            return this.c;
        }
    }

    public static final class d<T>
    extends Record {
        private final amt<? extends jq<T>> a;
        final Codec<T> b;
        final boolean c;

        d(amt<? extends jq<T>> $$0, Codec<T> $$1) {
            this($$0, $$1, false);
        }

        public d(amt<? extends jq<T>> $$0, Codec<T> $$1, boolean $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        a<T> a(Lifecycle $$0, Map<amt<?>, Exception> $$1) {
            jl $$2 = new jl(this.a, $$0);
            return new a(this, $$2, $$1);
        }

        public void a(BiConsumer<amt<? extends jq<T>>, Codec<T>> $$0) {
            $$0.accept(this.a, this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "key;elementCodec;requiredNonEmpty", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "key;elementCodec;requiredNonEmpty", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "key;elementCodec;requiredNonEmpty", "a", "b", "c"}, this, $$0);
        }

        public amt<? extends jq<T>> a() {
            return this.a;
        }

        public Codec<T> b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }
    }
}

