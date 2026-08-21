/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class pc {
    private static final jt a = new jt().a(mj.bd, qu::a).a(mj.aX, qs::a).a(mj.aY, rs::a).a(mj.bp, sh::a).a(mj.bs, rd::a).a(mj.br, rc::a).a(mj.bq, qz::a).a(mj.bt, qy::a).a(mj.aS, rk::a).a(mj.bk, dyd::a).a(mj.bm, qv::a).a(mj.bb, eux::a).a(mj.bl, euv::a).a(mj.bD, ffe::a).a(mj.bg, fdq::a).a(mj.aU, yd::a).a(mj.bA, duu::a).a(mj.bz, dus::a).a(mj.bx, enj::a).a(mj.bB, cxy::a).a(mj.bC, cxw::a).a(mj.bn, czi::a).a(mj.ba, cfa::a).a(mj.aR, eks::a).a(mj.bf, dst::a).a(mj.be, duf::a).a(mj.bj, dmb::a).a(mj.bi, dlo::a).a(mj.bo, cxd::a).a(mj.aZ, cuj::a).a(mj.aV, cue::a).a(mj.aW, cwt::a).a(mj.bu, sw::a).a(mj.bv, tc::a).a(mj.bh, cvt::a).a(mj.aT, cvd::a).a(mj.bc, asn::a).a(mj.bw, fvo::a);

    private static void a(jf.a $$0) {
        pc.a($$0.e(mj.bp), $$0.e(mj.aS));
    }

    public static void a(je<fes> $$0, jf<dxo> $$12) {
        $$12.c().forEach($$1 -> {
            amo $$2 = $$1.h().a();
            List<jh<fes>> $$32 = ((dxo)$$1.a()).c().c();
            $$32.stream().flatMap(jh::a).forEach($$3 -> $$3.d().ifLeft($$2 -> {
                Object $$3 = $$0.b((amt<fes>)$$2);
                if (!pc.a((fes)$$3.a())) {
                    bhs.b("Placed feature " + String.valueOf($$2.a()) + " in biome " + String.valueOf($$2) + " is missing BiomeFilter.biome()");
                }
            }).ifRight($$1 -> {
                if (!pc.a($$1)) {
                    bhs.b("Placed inline feature in biome " + String.valueOf($$1) + " is missing BiomeFilter.biome()");
                }
            }));
        });
    }

    private static boolean a(fes $$0) {
        return $$0.c().contains(feg.a());
    }

    public static jf.a a() {
        jr.b $$0 = jr.a(mi.aR);
        jf.a $$1 = a.a($$0);
        pc.a($$1);
        return $$1;
    }
}

