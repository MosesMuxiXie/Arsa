/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class rq {
    public static final amt<exi<?, ?>> a = rs.a("monster_room");
    public static final amt<exi<?, ?>> b = rs.a("fossil_coal");
    public static final amt<exi<?, ?>> c = rs.a("fossil_diamonds");
    public static final amt<exi<?, ?>> d = rs.a("dripstone_cluster");
    public static final amt<exi<?, ?>> e = rs.a("large_dripstone");
    public static final amt<exi<?, ?>> f = rs.a("pointed_dripstone");
    public static final amt<exi<?, ?>> g = rs.a("underwater_magma");
    public static final amt<exi<?, ?>> h = rs.a("glow_lichen");
    public static final amt<exi<?, ?>> i = rs.a("rooted_azalea_tree");
    public static final amt<exi<?, ?>> j = rs.a("cave_vine");
    public static final amt<exi<?, ?>> k = rs.a("cave_vine_in_moss");
    public static final amt<exi<?, ?>> l = rs.a("moss_vegetation");
    public static final amt<exi<?, ?>> m = rs.a("moss_patch");
    public static final amt<exi<?, ?>> n = rs.a("moss_patch_bonemeal");
    public static final amt<exi<?, ?>> o = rs.a("dripleaf");
    public static final amt<exi<?, ?>> p = rs.a("clay_with_dripleaves");
    public static final amt<exi<?, ?>> q = rs.a("clay_pool_with_dripleaves");
    public static final amt<exi<?, ?>> r = rs.a("lush_caves_clay");
    public static final amt<exi<?, ?>> s = rs.a("moss_patch_ceiling");
    public static final amt<exi<?, ?>> t = rs.a("spore_blossom");
    public static final amt<exi<?, ?>> u = rs.a("amethyst_geode");
    public static final amt<exi<?, ?>> v = rs.a("sculk_patch_deep_dark");
    public static final amt<exi<?, ?>> w = rs.a("sculk_patch_ancient_city");
    public static final amt<exi<?, ?>> x = rs.a("sculk_vein");

    private static jd<fes> a(iz $$0) {
        return sh.a(exx.x, new ezs(List.of(ezs.a(new cco(cbn.b().a(ccn.a(0, 4), 2).a((ccn)((Object)cce.a(0)), 1).a()), fcd.a((eoh)dzs.ud.m().b(eox.T, $$0))), ezs.a(cce.a(1), fcd.a((eoh)dzs.uc.m().b(eox.T, $$0)))), iz.b, evx.d, true), new fev[0]);
    }

    private static jd<fes> a() {
        return sh.a(exx.U, new fau(new fcn(cbn.b().a((eoh)dzs.ue.m().b(ehk.d, iz.f), 1).a((eoh)dzs.ue.m().b(ehk.d, iz.e), 1).a((eoh)dzs.ue.m().b(ehk.d, iz.c), 1).a((eoh)dzs.ue.m().b(ehk.d, iz.d), 1))), new fev[0]);
    }

    public static void a(qr<exi<?, ?>> $$0) {
        je<exi<?, ?>> $$1 = $$0.a(mj.aY);
        je<fjo> $$2 = $$0.a(mj.bq);
        rs.a($$0, a, exx.D);
        List<amo> $$3 = List.of(amo.b("fossil/spine_1"), amo.b("fossil/spine_2"), amo.b("fossil/spine_3"), amo.b("fossil/spine_4"), amo.b("fossil/skull_1"), amo.b("fossil/skull_2"), amo.b("fossil/skull_3"), amo.b("fossil/skull_4"));
        List<amo> $$4 = List.of(amo.b("fossil/spine_1_coal"), amo.b("fossil/spine_2_coal"), amo.b("fossil/spine_3_coal"), amo.b("fossil/spine_4_coal"), amo.b("fossil/skull_1_coal"), amo.b("fossil/skull_2_coal"), amo.b("fossil/skull_3_coal"), amo.b("fossil/skull_4_coal"));
        jd.c<fjo> $$5 = $$2.b(qz.D);
        rs.a($$0, b, exx.q, new eyc($$3, $$4, $$5, $$2.b(qz.E), 4));
        rs.a($$0, c, exx.q, new eyc($$3, $$4, $$5, $$2.b(qz.F), 4));
        rs.a($$0, d, exx.al, new ezz(12, ccn.a(3, 6), ccn.a(2, 8), 1, 3, ccn.a(2, 4), ccm.b(0.3f, 0.7f), ccb.a(0.1f, 0.3f, 0.1f, 0.9f), 0.1f, 3, 8));
        rs.a($$0, e, exx.am, new faf(30, ccn.a(3, 19), ccm.b(0.4f, 2.0f), 0.33f, ccm.b(0.3f, 0.9f), ccm.b(0.4f, 1.0f), ccm.b(0.0f, 0.3f), 4, 0.6f));
        rs.a($$0, f, exx.ai, new fav(jh.a(sh.a(exx.an, new fal(0.2f, 0.7f, 0.5f, 0.5f), fel.a(iz.a, evx.c(), evx.d, 12), fex.a(cce.a(1))), sh.a(exx.an, new fal(0.2f, 0.7f, 0.5f, 0.5f), fel.a(iz.b, evx.c(), evx.d, 12), fex.a(cce.a(-1))))));
        rs.a($$0, g, exx.C, new fba(5, 1, 0.5f));
        eez $$6 = (eez)dzs.fO;
        rs.a($$0, h, exx.B, new fah($$6, 20, false, true, true, 0.5f, jh.a(dzq::p, dzs.b, dzs.g, dzs.e, dzs.c, dzs.tR, dzs.rN, dzs.rz, dzs.ui)));
        rs.a($$0, i, exx.A, new fas(sh.a($$1.b(rx.z), new fev[0]), 3, 3, bdp.bJ, fcd.a(dzs.ug), 20, 100, 3, 2, fcd.a(dzs.uf), 20, 2, evx.a(evx.b(evx.c(List.of(dzs.a, dzs.nZ, dzs.nY)), evx.a(bdp.cE)), evx.a(iz.a.q(), bdp.cy))));
        fcn $$7 = new fcn(cbn.b().a(dzs.tT.m(), 4).a((eoh)dzs.tT.m().b(eao.v_, true), 1));
        fcj $$8 = new fcj((fcd)new fcn(cbn.b().a(dzs.tS.m(), 4).a((eoh)dzs.tS.m().b(eao.v_, true), 1)), eap.e, (cch)ccn.a(23, 25));
        rs.a($$0, j, exx.x, new ezs(List.of(ezs.a(new cco(cbn.b().a(ccn.a(0, 19), 2).a(ccn.a(0, 2), 3).a(ccn.a(0, 6), 10).a()), $$7), ezs.a(cce.a(1), $$8)), iz.a, evx.c, true));
        rs.a($$0, k, exx.x, new ezs(List.of(ezs.a(new cco(cbn.b().a(ccn.a(0, 3), 5).a(ccn.a(1, 7), 1).a()), $$7), ezs.a(cce.a(1), $$8)), iz.a, evx.c, true));
        rs.a($$0, l, exx.U, new fau(new fcn(cbn.b().a(dzs.tW.m(), 4).a(dzs.tV.m(), 7).a(dzs.tX.m(), 25).a(dzs.bA.m(), 50).a(dzs.jz.m(), 10))));
        rs.a($$0, m, exx.y, new fbb(bdp.bH, fcd.a(dzs.ub), sh.a($$1.b(l), new fev[0]), fei.b, cce.a(1), 0.0f, 5, 0.8f, ccn.a(4, 7), 0.3f));
        rs.a($$0, n, exx.y, new fbb(bdp.bH, fcd.a(dzs.ub), sh.a($$1.b(l), new fev[0]), fei.b, cce.a(1), 0.0f, 5, 0.6f, ccn.a(1, 2), 0.75f));
        rs.a($$0, o, exx.ai, new fav(jh.a(rq.a(), rq.a(iz.f), rq.a(iz.e), rq.a(iz.d), rq.a(iz.c))));
        rs.a($$0, p, exx.y, new fbb(bdp.bI, fcd.a(dzs.eu), sh.a($$1.b(o), new fev[0]), fei.b, cce.a(3), 0.8f, 2, 0.05f, ccn.a(4, 7), 0.7f));
        rs.a($$0, q, exx.z, new fbb(bdp.bI, fcd.a(dzs.eu), sh.a($$1.b(o), new fev[0]), fei.b, cce.a(3), 0.8f, 5, 0.1f, ccn.a(4, 7), 0.7f));
        rs.a($$0, r, exx.aj, new fan(sh.a($$1.b(p), new fev[0]), sh.a($$1.b(q), new fev[0])));
        rs.a($$0, s, exx.y, new fbb(bdp.bH, fcd.a(dzs.ub), sh.a($$1.b(k), new fev[0]), fei.a, ccn.a(1, 2), 0.0f, 5, 0.08f, ccn.a(4, 7), 0.3f));
        rs.a($$0, t, exx.U, new fau(fcd.a(dzs.tU)));
        rs.a($$0, u, exx.ak, new fad(new eun(fcd.a(dzs.a), fcd.a(dzs.rt), fcd.a(dzs.ru), fcd.a(dzs.rN), fcd.a(dzs.uD), List.of(dzs.ry.m(), dzs.rx.m(), dzs.rw.m(), dzs.rv.m()), bdp.cd, bdp.cf), new eup(1.7, 2.2, 3.2, 4.2), new euo(0.95, 2.0, 2), 0.35, 0.083, true, ccn.a(4, 6), ccn.a(3, 4), ccn.a(1, 2), -16, 16, 0.05, 1));
        rs.a($$0, v, exx.ao, new fat(10, 32, 64, 0, 1, cce.a(0), 0.5f));
        rs.a($$0, w, exx.ao, new fat(10, 32, 64, 0, 1, ccn.a(1, 3), 0.5f));
        eez $$9 = (eez)dzs.rT;
        rs.a($$0, x, exx.B, new fah($$9, 20, true, true, true, 1.0f, jh.a(dzq::p, dzs.b, dzs.g, dzs.e, dzs.c, dzs.tR, dzs.rN, dzs.rz, dzs.ui)));
    }
}

