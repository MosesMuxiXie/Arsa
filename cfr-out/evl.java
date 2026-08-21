/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record evl(Map<amt<esi>, esi> b) {
    private final Map<amt<esi>, esi> b;
    public static final MapCodec<evl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.unboundedMap(amt.a(mj.bF), esi.a).fieldOf("dimensions").forGetter(evl::d)).apply((Applicative)$$0, $$0.stable(evl::new)));
    private static final Set<amt<esi>> c = ImmutableSet.of(esi.b, esi.c, esi.d);
    private static final int d = c.size();

    public evl {
        esi $$1 = $$0.get(esi.b);
        if ($$1 == null) {
            throw new IllegalStateException("Overworld settings missing");
        }
    }

    public evl(jq<esi> $$0) {
        this($$0.c().collect(Collectors.toMap(jd.c::h, jd.c::a)));
    }

    public static Stream<amt<esi>> a(Stream<amt<esi>> $$02) {
        return Stream.concat(c.stream(), $$02.filter($$0 -> !c.contains($$0)));
    }

    public evl a(jf.a $$0, eqg $$1) {
        jf.b<esh> $$2 = $$0.e(mj.bd);
        Map<amt<esi>, esi> $$3 = evl.a($$2, this.b, $$1);
        return new evl($$3);
    }

    public static Map<amt<esi>, esi> a(jf<esh> $$0, Map<amt<esi>, esi> $$1, eqg $$2) {
        esi $$3 = $$1.get(esi.b);
        jd<esh> $$4 = $$3 == null ? $$0.b(esf.a) : $$3.a();
        return evl.a($$1, $$4, $$2);
    }

    public static Map<amt<esi>, esi> a(Map<amt<esi>, esi> $$0, jd<esh> $$1, eqg $$2) {
        ImmutableMap.Builder $$3 = ImmutableMap.builder();
        $$3.putAll($$0);
        $$3.put(esi.b, (Object)new esi($$1, $$2));
        return $$3.buildKeepingLast();
    }

    public eqg a() {
        esi $$0 = this.b.get(esi.b);
        if ($$0 == null) {
            throw new IllegalStateException("Overworld settings missing");
        }
        return $$0.b();
    }

    public Optional<esi> a(amt<esi> $$0) {
        return Optional.ofNullable(this.b.get($$0));
    }

    public ImmutableSet<amt<dwo>> b() {
        return (ImmutableSet)this.d().keySet().stream().map(mj::a).collect(ImmutableSet.toImmutableSet());
    }

    public boolean c() {
        return this.a() instanceof euh;
    }

    private static fnm.a b(jq<esi> $$02) {
        return $$02.f(esi.b).map($$0 -> {
            eqg $$1 = $$0.b();
            if ($$1 instanceof euh) {
                return fnm.a.c;
            }
            if ($$1 instanceof eul) {
                return fnm.a.b;
            }
            return fnm.a.a;
        }).orElse(fnm.a.a);
    }

    static Lifecycle a(amt<esi> $$0, esi $$1) {
        return evl.b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
    }

    private static boolean b(amt<esi> $$0, esi $$1) {
        if ($$0 == esi.b) {
            return evl.a($$1);
        }
        if ($$0 == esi.c) {
            return evl.b($$1);
        }
        if ($$0 == esi.d) {
            return evl.c($$1);
        }
        return false;
    }

    private static boolean a(esi $$0) {
        dyb $$2;
        jd<esh> $$1 = $$0.a();
        if (!$$1.a(esf.a) && !$$1.a(esf.d)) {
            return false;
        }
        dxs dxs2 = $$0.b().d();
        return !(dxs2 instanceof dyb) || ($$2 = (dyb)dxs2).a(dyd.b);
    }

    private static boolean b(esi $$0) {
        dyb $$2;
        eut $$1;
        Object object;
        return $$0.a().a(esf.b) && (object = $$0.b()) instanceof eut && ($$1 = (eut)object).a(euv.f) && (object = $$1.d()) instanceof dyb && ($$2 = (dyb)object).a(dyd.a);
    }

    private static boolean c(esi $$0) {
        eut $$1;
        eqg eqg2;
        return $$0.a().a(esf.c) && (eqg2 = $$0.b()) instanceof eut && ($$1 = (eut)eqg2).a(euv.g) && $$1.d() instanceof dyf;
    }

    public b a(jq<esi> $$0) {
        final class A
        extends Record {
            final amt<esi> a;
            final esi b;

            A(amt<esi> $$0, esi $$1) {
                this.a = $$0;
                this.b = $$1;
            }

            jp c() {
                return new jp(Optional.empty(), evl.a(this.a, this.b));
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "key;value", "a", "b"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "key;value", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "key;value", "a", "b"}, this, $$0);
            }

            public amt<esi> a() {
                return this.a;
            }

            public esi b() {
                return this.b;
            }
        }
        Stream<amt<esi>> $$12 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();
        ArrayList $$2 = new ArrayList();
        evl.a($$12).forEach($$22 -> $$0.f((amt<esi>)$$22).or(() -> Optional.ofNullable(this.b.get($$22))).ifPresent($$2 -> $$2.add(new A((amt<esi>)$$22, (esi)$$2))));
        Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
        jl<esi> $$4 = new jl<esi>(mj.bF, $$3);
        $$2.forEach($$1 -> $$4.a($$1.a, $$1.b, $$1.c()));
        jq<esi> $$5 = $$4.n();
        fnm.a $$6 = evl.b($$5);
        return new b($$5.n(), $$6);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{evl.class, "dimensions", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{evl.class, "dimensions", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{evl.class, "dimensions", "b"}, this, $$0);
    }

    public Map<amt<esi>, esi> d() {
        return this.b;
    }

    public record b(jq<esi> a, fnm.a b) {
        private final jq<esi> a;
        private final fnm.a b;

        public Lifecycle a() {
            return this.a.h();
        }

        public jr.b b() {
            return new jr.c(List.of(this.a)).e();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "dimensions;specialWorldProperty", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "dimensions;specialWorldProperty", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "dimensions;specialWorldProperty", "a", "b"}, this, $$0);
        }

        public jq<esi> c() {
            return this.a;
        }

        public fnm.a d() {
            return this.b;
        }
    }
}

