/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class cih {
    private static final Map<cgu<?>, a> a = Maps.newHashMap();

    private static <T extends chn> void a(cgu<T> $$0, cif $$1, euq.a $$2, b<T> $$3) {
        a $$4 = a.put($$0, new a($$2, $$1, $$3));
        if ($$4 != null) {
            throw new IllegalStateException("Duplicate registration for type " + String.valueOf(mi.g.b($$0)));
        }
    }

    public static cif a(cgu<?> $$0) {
        a $$1 = a.get($$0);
        return $$1 == null ? cig.a : $$1.b;
    }

    public static boolean a(cgu<?> $$0, dwr $$1, is $$2) {
        return cih.a($$0).isSpawnPositionOk($$1, $$2, $$0);
    }

    public static euq.a b(@Nullable cgu<?> $$0) {
        a $$1 = a.get($$0);
        return $$1 == null ? euq.a.f : $$1.a;
    }

    public static <T extends cgk> boolean a(cgu<T> $$0, dxf $$1, cgt $$2, is $$3, bgr $$4) {
        a $$5 = a.get($$0);
        return $$5 == null || $$5.c.test($$0, $$1, $$2, $$3, $$4);
    }

    static {
        cih.a(cgu.j, cig.b, euq.a.f, ctr::a);
        cih.a(cgu.D, cig.b, euq.a.f, cvm::c);
        cih.a(cgu.L, cig.b, euq.a.f, ctg::b);
        cih.a(cgu.O, cig.b, euq.a.f, dcl::c);
        cih.a(cgu.an, cig.b, euq.a.f, czx::b);
        cih.a(cgu.bf, cig.b, euq.a.f, cvm::c);
        cih.a(cgu.bi, cig.b, euq.a.f, cvm::c);
        cih.a(cgu.bz, cig.b, euq.a.f, ctg::b);
        cih.a(cgu.bI, cig.b, euq.a.f, cvl::b);
        cih.a(cgu.g, cig.d, euq.a.f, cto::c);
        cih.a(cgu.m, cig.d, euq.a.f, cte::b);
        cih.a(cgu.q, cig.d, euq.a.f, czz::c);
        cih.a(cgu.s, cig.d, euq.a.f, czz::a);
        cih.a(cgu.t, cig.d, euq.a.f, czz::c);
        cih.a(cgu.v, cig.d, euq.a.f, cty::c);
        cih.a(cgu.w, cig.d, euq.a.f, czz::b);
        cih.a(cgu.y, cig.d, euq.a.f, czz::a);
        cih.a(cgu.C, cig.d, euq.a.f, cth::b);
        cih.a(cgu.G, cig.d, euq.a.f, cth::b);
        cih.a(cgu.I, cig.d, euq.a.f, czz::a);
        cih.a(cgu.M, cig.d, euq.a.f, cth::b);
        cih.a(cgu.R, cig.d, euq.a.f, czz::a);
        cih.a(cgu.S, cig.d, euq.a.f, czt::b);
        cih.a(cgu.T, cig.d, euq.a.f, chn::a);
        cih.a(cgu.af, cig.d, euq.a.f, cvq::c);
        cih.a(cgu.ah, cig.d, euq.a.f, czv::b);
        cih.a(cgu.ai, cig.d, euq.a.f, cth::b);
        cih.a(cgu.aj, cig.d, euq.a.f, czz::a);
        cih.a(cgu.al, cig.b, euq.a.f, cxp::a);
        cih.a(cgu.am, cig.d, euq.a.f, cvy::c);
        cih.a(cgu.aq, cig.d, euq.a.f, cth::b);
        cih.a(cgu.ar, cig.d, euq.a.f, czz::b);
        cih.a(cgu.au, cig.d, euq.a.f, chn::a);
        cih.a(cgu.aC, cig.d, euq.a.f, cth::b);
        cih.a(cgu.aE, cig.d, euq.a.f, czy::b);
        cih.a(cgu.aK, cig.d, euq.a.f, cuk::c);
        cih.a(cgu.aL, cig.d, euq.a.f, cth::b);
        cih.a(cgu.aM, cig.b, euq.a.f, cwn::c);
        cih.a(cgu.aP, cig.d, euq.a.e, cve::c);
        cih.a(cgu.aW, cig.d, euq.a.e, cwy::c);
        cih.a(cgu.aY, cig.d, euq.a.f, cth::b);
        cih.a(cgu.ao, cig.d, euq.a.f, daw::c);
        cih.a(cgu.aZ, cig.d, euq.a.f, dbj::b);
        cih.a(cgu.bb, cig.d, euq.a.f, daa::b);
        cih.a(cgu.bc, cig.d, euq.a.f, cxf::c);
        cih.a(cgu.bg, cig.d, euq.a.f, cxh::c);
        cih.a(cgu.bj, cig.d, euq.a.f, cth::b);
        cih.a(cgu.bm, cig.d, euq.a.f, daf::b);
        cih.a(cgu.bn, cig.d, euq.a.f, czz::a);
        cih.a(cgu.bo, cig.d, euq.a.f, cuv::c);
        cih.a(cgu.bp, cig.d, euq.a.f, dag::c);
        cih.a(cgu.bt, cig.d, euq.a.f, chn::a);
        cih.a(cgu.bw, cig.d, euq.a.f, czz::a);
        cih.a(cgu.bA, cig.d, euq.a.f, dbz::c);
        cih.a(cgu.aV, cig.d, euq.a.f, czz::b);
        cih.a(cgu.bB, cig.c, euq.a.f, dah::c);
        cih.a(cgu.bJ, cig.d, euq.a.f, cxs::c);
        cih.a(cgu.bL, cig.d, euq.a.f, chn::a);
        cih.a(cgu.bQ, cig.d, euq.a.f, czz::a);
        cih.a(cgu.bR, cig.d, euq.a.f, czz::a);
        cih.a(cgu.bS, cig.d, euq.a.f, czz::a);
        cih.a(cgu.bU, cig.d, euq.a.f, cxu::c);
        cih.a(cgu.bV, cig.d, euq.a.f, czz::c);
        cih.a(cgu.H, cig.d, euq.a.f, czz::a);
        cih.a(cgu.bW, cig.d, euq.a.f, czz::a);
        cih.a(cgu.bX, cig.d, euq.a.f, czz::a);
        cih.a(cgu.ca, cig.d, euq.a.f, dcp::b);
        cih.a(cgu.bZ, cig.d, euq.a.f, czz::a);
        cih.a(cgu.x, cig.d, euq.a.f, cth::b);
        cih.a(cgu.Q, cig.b, euq.a.f, czx::b);
        cih.a(cgu.W, cig.a, euq.a.f, czz::a);
        cih.a(cgu.ae, cig.a, euq.a.f, cvo::c);
        cih.a(cgu.as, cig.a, euq.a.f, czz::a);
        cih.a(cgu.aU, cig.a, euq.a.f, cth::b);
        cih.a(cgu.aX, cig.a, euq.a.f, chn::a);
        cih.a(cgu.bh, cig.d, euq.a.f, czz::a);
        cih.a(cgu.bk, cig.a, euq.a.f, chn::a);
        cih.a(cgu.bG, cig.a, euq.a.f, cth::b);
        cih.a(cgu.bK, cig.a, euq.a.f, czz::a);
        cih.a(cgu.bM, cig.a, euq.a.f, czz::a);
        cih.a(cgu.bN, cig.d, euq.a.f, chn::a);
        cih.a(cgu.bO, cig.a, euq.a.f, czz::a);
    }

    static final class a
    extends Record {
        final euq.a a;
        final cif b;
        final b<?> c;

        a(euq.a $$0, cif $$1, b<?> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "heightMap;placement;predicate", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "heightMap;placement;predicate", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "heightMap;placement;predicate", "a", "b", "c"}, this, $$0);
        }

        public euq.a a() {
            return this.a;
        }

        public cif b() {
            return this.b;
        }

        public b<?> c() {
            return this.c;
        }
    }

    @FunctionalInterface
    public static interface b<T extends cgk> {
        public boolean test(cgu<T> var1, dxf var2, cgt var3, is var4, bgr var5);
    }
}

