/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Interner
 *  com.google.common.collect.Interners
 *  com.mojang.logging.LogUtils
 *  org.joml.Vector3fc
 *  org.slf4j.Logger
 */
import com.google.common.collect.Interner;
import com.google.common.collect.Interners;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.joml.Vector3fc;
import org.slf4j.Logger;

public class inx {
    public static final ins a = hpj.n.a("fire_0");
    public static final ins b = hpj.n.a("fire_1");
    public static final ins c = hpj.n.a("lava_still");
    public static final ins d = hpj.n.a("lava_flow");
    public static final ins e = hpj.n.a("water_still");
    public static final ins f = hpj.n.a("water_flow");
    public static final ins g = hpj.n.a("water_overlay");
    public static final ins h = new ins(hpj.c, amo.b("entity/banner_base"));
    public static final ins i = new ins(hpj.d, amo.b("entity/shield_base"));
    public static final ins j = new ins(hpj.d, amo.b("entity/shield_base_nopattern"));
    public static final int k = 10;
    public static final List<amo> l = IntStream.range(0, 10).mapToObj($$0 -> amo.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
    public static final List<amo> m = l.stream().map($$02 -> $$02.a($$0 -> "textures/" + $$0 + ".png")).collect(Collectors.toList());
    public static final List<ijs> n = m.stream().map(ijt::t).collect(Collectors.toList());
    static final Logger o = LogUtils.getLogger();
    private final hdc p;
    private final inu q;
    private final hou r;
    private final Map<eoh, hqh.c> s;
    private final Map<amo, ihf> t;
    final Map<amo, iof> u;
    final iof v;

    public inx(hdc $$0, inu $$1, hou $$2, Map<eoh, hqh.c> $$3, Map<amo, ihf> $$4, Map<amo, iof> $$5, iof $$6) {
        this.p = $$0;
        this.q = $$1;
        this.r = $$2;
        this.s = $$3;
        this.t = $$4;
        this.u = $$5;
        this.v = $$6;
    }

    public CompletableFuture<a> a(iog $$0, Executor $$12) {
        d $$22 = new d();
        b $$32 = inx$b.a(this.v, $$0, $$22);
        c $$4 = new c($$0, $$22, $$32);
        CompletableFuture<Map<eoh, hqh>> $$5 = cbt.a(this.s, (K $$1, U $$2) -> {
            try {
                return $$2.a((eoh)$$1, $$4);
            }
            catch (Exception $$3) {
                o.warn("Unable to bake model: '{}': {}", $$1, (Object)$$3);
                return null;
            }
        }, $$12);
        CompletableFuture<Map<amo, ihj>> $$6 = cbt.a(this.t, (K $$2, U $$3) -> {
            try {
                return $$3.a().a(new ihj.a($$4, this.p, this.q, this.r, $$1.c, $$3.c()));
            }
            catch (Exception $$4) {
                o.warn("Unable to bake item model: '{}'", $$2, (Object)$$4);
                return null;
            }
        }, $$12);
        HashMap $$7 = new HashMap(this.t.size());
        this.t.forEach(($$1, $$2) -> {
            ihf.a $$3 = $$2.b();
            if (!$$3.equals(ihf.a.a)) {
                $$7.put($$1, $$3);
            }
        });
        return $$5.thenCombine($$6, ($$2, $$3) -> new a($$32, (Map<eoh, hqh>)$$2, (Map<amo, ihj>)$$3, $$7));
    }

    static class d
    implements inw.a {
        private final Interner<Vector3fc> a = Interners.newStrongInterner();

        d() {
        }

        @Override
        public Vector3fc a(Vector3fc $$0) {
            return (Vector3fc)this.a.intern((Object)$$0);
        }
    }

    public static final class b
    extends Record {
        final hqg a;
        private final hqh b;
        final ihj c;

        public b(hqg $$0, hqh $$1, ihj $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public static b a(iof $$0, final iog $$1, final inw.a $$2) {
            inw $$3 = new inw(){

                @Override
                public iof a(amo $$0) {
                    throw new IllegalStateException("Missing model can't have dependencies, but asked for " + String.valueOf($$0));
                }

                @Override
                public hqg a() {
                    throw new IllegalStateException();
                }

                @Override
                public <T> T a(inw.b<T> $$0) {
                    return $$0.compute(this);
                }

                @Override
                public iog b() {
                    return $$1;
                }

                @Override
                public inw.a c() {
                    return $$2;
                }
            };
            hqp $$4 = $$0.g();
            boolean $$5 = $$0.c();
            boolean $$6 = $$0.d().a();
            hql $$7 = $$0.e();
            iod $$8 = $$0.a($$4, $$3, inm.a);
            ilp $$9 = $$0.a($$4, $$3);
            hqm $$10 = new hqm($$8, $$5, $$9);
            hqo $$11 = new hqo($$10);
            ihn $$12 = new ihn($$8.a(), new iho($$6, $$9, $$7));
            return new b($$10, $$11, $$12);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "blockPart;block;item", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "blockPart;block;item", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "blockPart;block;item", "a", "b", "c"}, this, $$0);
        }

        public hqg a() {
            return this.a;
        }

        public hqh b() {
            return this.b;
        }

        public ihj c() {
            return this.c;
        }
    }

    class c
    implements inw {
        private final iog b;
        private final inw.a c;
        private final b d;
        private final Map<inw.b<Object>, Object> e = new ConcurrentHashMap<inw.b<Object>, Object>();
        private final Function<inw.b<Object>, Object> f = $$0 -> $$0.compute(this);

        c(iog $$02, inw.a $$1, b $$2) {
            this.b = $$02;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public hqg a() {
            return this.d.a;
        }

        @Override
        public iog b() {
            return this.b;
        }

        @Override
        public inw.a c() {
            return this.c;
        }

        @Override
        public iof a(amo $$0) {
            iof $$1 = inx.this.u.get($$0);
            if ($$1 == null) {
                o.warn("Requested a model that was not discovered previously: {}", (Object)$$0);
                return inx.this.v;
            }
            return $$1;
        }

        @Override
        public <T> T a(inw.b<T> $$0) {
            return (T)this.e.computeIfAbsent($$0, this.f);
        }
    }

    public record a(b a, Map<eoh, hqh> b, Map<amo, ihj> c, Map<amo, ihf.a> d) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "missingModels;blockStateModels;itemStackModels;itemProperties", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "missingModels;blockStateModels;itemStackModels;itemProperties", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "missingModels;blockStateModels;itemStackModels;itemProperties", "a", "b", "c", "d"}, this, $$0);
        }
    }
}

