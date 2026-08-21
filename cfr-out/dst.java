/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class dst {
    public static final amt<dso> a = dst.a("protection");
    public static final amt<dso> b = dst.a("fire_protection");
    public static final amt<dso> c = dst.a("feather_falling");
    public static final amt<dso> d = dst.a("blast_protection");
    public static final amt<dso> e = dst.a("projectile_protection");
    public static final amt<dso> f = dst.a("respiration");
    public static final amt<dso> g = dst.a("aqua_affinity");
    public static final amt<dso> h = dst.a("thorns");
    public static final amt<dso> i = dst.a("depth_strider");
    public static final amt<dso> j = dst.a("frost_walker");
    public static final amt<dso> k = dst.a("binding_curse");
    public static final amt<dso> l = dst.a("soul_speed");
    public static final amt<dso> m = dst.a("swift_sneak");
    public static final amt<dso> n = dst.a("sharpness");
    public static final amt<dso> o = dst.a("smite");
    public static final amt<dso> p = dst.a("bane_of_arthropods");
    public static final amt<dso> q = dst.a("knockback");
    public static final amt<dso> r = dst.a("fire_aspect");
    public static final amt<dso> s = dst.a("looting");
    public static final amt<dso> t = dst.a("sweeping_edge");
    public static final amt<dso> u = dst.a("efficiency");
    public static final amt<dso> v = dst.a("silk_touch");
    public static final amt<dso> w = dst.a("unbreaking");
    public static final amt<dso> x = dst.a("fortune");
    public static final amt<dso> y = dst.a("power");
    public static final amt<dso> z = dst.a("punch");
    public static final amt<dso> A = dst.a("flame");
    public static final amt<dso> B = dst.a("infinity");
    public static final amt<dso> C = dst.a("luck_of_the_sea");
    public static final amt<dso> D = dst.a("lure");
    public static final amt<dso> E = dst.a("loyalty");
    public static final amt<dso> F = dst.a("impaling");
    public static final amt<dso> G = dst.a("riptide");
    public static final amt<dso> H = dst.a("channeling");
    public static final amt<dso> I = dst.a("multishot");
    public static final amt<dso> J = dst.a("quick_charge");
    public static final amt<dso> K = dst.a("piercing");
    public static final amt<dso> L = dst.a("density");
    public static final amt<dso> M = dst.a("breach");
    public static final amt<dso> N = dst.a("wind_burst");
    public static final amt<dso> O = dst.a("lunge");
    public static final amt<dso> P = dst.a("mending");
    public static final amt<dso> Q = dst.a("vanishing_curse");

    public static void a(qr<dso> $$0) {
        je<cez> $$1 = $$0.a(mj.ba);
        je<dso> $$2 = $$0.a(mj.bf);
        je<dlp> $$3 = $$0.a(mj.R);
        je<dzq> $$4 = $$0.a(mj.i);
        je<cgu<?>> $$5 = $$0.a(mj.F);
        dst.a($$0, a, dso.a(dso.a($$3.b(bdy.cx), 10, 4, dso.a(1, 11), dso.a(12, 11), 1, cgw.i)).a($$2.b(bds.b)).a(dsp.c, new dsy(dsv.b(1.0f)), frf.a(bg.a.a().a(dn.b(bdq.d)))));
        dst.a($$0, b, dso.a(dso.a($$3.b(bdy.cx), 5, 4, dso.a(10, 8), dso.a(18, 8), 2, cgw.i)).a($$2.b(bds.b)).a(dsp.c, new dsy(dsv.b(2.0f)), fqz.a(frf.a(bg.a.a().a(dn.a(bdq.i)).a(dn.b(bdq.d))))).a(dsp.m, new dtg(amo.b("enchantment.fire_protection"), cis.i, dsv.b(-0.15f), ciq.a.b)));
        dst.a($$0, c, dso.a(dso.a($$3.b(bdy.ct), 5, 4, dso.a(5, 6), dso.a(11, 6), 2, cgw.i)).a(dsp.c, new dsy(dsv.b(3.0f)), frf.a(bg.a.a().a(dn.a(bdq.m)).a(dn.b(bdq.d)))));
        dst.a($$0, d, dso.a(dso.a($$3.b(bdy.cx), 2, 4, dso.a(5, 8), dso.a(13, 8), 4, cgw.i)).a($$2.b(bds.b)).a(dsp.c, new dsy(dsv.b(2.0f)), frf.a(bg.a.a().a(dn.a(bdq.l)).a(dn.b(bdq.d)))).a(dsp.m, new dtg(amo.b("enchantment.blast_protection"), cis.k, dsv.b(0.15f), ciq.a.a)));
        dst.a($$0, e, dso.a(dso.a($$3.b(bdy.cx), 5, 4, dso.a(3, 6), dso.a(9, 6), 2, cgw.i)).a($$2.b(bds.b)).a(dsp.c, new dsy(dsv.b(2.0f)), frf.a(bg.a.a().a(dn.a(bdq.j)).a(dn.b(bdq.d)))));
        dst.a($$0, f, dso.a(dso.a($$3.b(bdy.cw), 2, 3, dso.a(10, 10), dso.a(40, 10), 4, cgw.h)).a(dsp.m, new dtg(amo.b("enchantment.respiration"), cis.y, dsv.b(1.0f), ciq.a.a)));
        dst.a($$0, g, dso.a(dso.a($$3.b(bdy.cw), 2, 1, dso.a(1), dso.a(41), 4, cgw.h)).a(dsp.m, new dtg(amo.b("enchantment.aqua_affinity"), cis.E, dsv.b(4.0f), ciq.a.c)));
        dst.a($$0, h, dso.a(dso.a($$3.b(bdy.cx), $$3.b(bdy.cv), 1, 3, dso.a(10, 20), dso.a(60, 20), 8, cgw.a)).a(dsp.i, dss.c, dss.a, dsz.a(new dte(dsv.a(1.0f), dsv.a(5.0f), $$1.b(cfa.Q)), new dtd(dsv.a(2.0f))), frr.a(fsg.a(dsv.b(0.15f)))));
        dst.a($$0, i, dso.a(dso.a($$3.b(bdy.ct), 2, 3, dso.a(10, 10), dso.a(25, 10), 4, cgw.e)).a($$2.b(bds.c)).a(dsp.m, new dtg(amo.b("enchantment.depth_strider"), cis.H, dsv.b(0.33333334f), ciq.a.a)));
        dst.a($$0, j, dso.a(dso.a($$3.b(bdy.ct), 2, 2, dso.a(10, 10), dso.a(25, 10), 4, cgw.e)).a($$2.b(bds.c)).a(dsp.d, dtf.a, frf.a(bg.a.a().a(dn.a(bdq.E)).a(dn.b(bdq.d)))).a(dsp.o, new dtq(new dsv.a(dsv.a(3.0f, 1.0f), 0.0f, 16.0f), dsv.a(1.0f), new jy(0, -1, 0), Optional.of(evx.a(evx.a(new jy(0, 1, 0), bdp.cV), evx.a(dzs.J), evx.a(flc.c), evx.f())), fcd.a(dzs.lE), Optional.of(etk.i)), fqz.a(frp.a(fnz.c.a, bs.a.a().a(bq.a.a().a(true))), frj.a(frp.a(fnz.c.a, bs.a.a().a(bs.a.a()))))));
        dst.a($$0, k, dso.a(dso.a($$3.b(bdy.cK), 1, 1, dso.a(25), dso.a(50), 8, cgw.i)).a(dsp.F));
        bs.a $$6 = bs.a.a().a(5).a(bq.a.a().f(false).a(true)).a(cs.b(cq.b.b(1.0E-5f))).c(co.a.a().a(as.a.a().a($$4, bdp.bb)));
        fqz.a $$7 = fqz.a(frj.a(frp.a(fnz.c.a, bs.a.a().a(bs.a.a()))), fra.a(fqz.a(frg.c(), frp.a(fnz.c.a, bs.a.a().a(bq.a.a().f(false))), fra.a(frp.a(fnz.c.a, bs.a.a().c(co.a.a().a(as.a.a().a($$4, bdp.bb)))), frp.a(fnz.c.a, bs.a.a().a(bq.a.a().a(false)).b()))), fqz.a(frg.d(), frp.a(fnz.c.a, bs.a.a().c(co.a.a().a(as.a.a().a($$4, bdp.bb))).a(bq.a.a().f(false))))));
        dst.a($$0, l, dso.a(dso.a($$3.b(bdy.ct), 1, 3, dso.a(10, 10), dso.a(25, 10), 8, cgw.e)).a(dsp.o, dsz.a(new dtg(amo.b("enchantment.soul_speed"), cis.x, dsv.a(0.0405f, 0.0105f), ciq.a.a), new dtg(amo.b("enchantment.soul_speed"), cis.w, dsv.a(1.0f), ciq.a.a)), $$7).a(dsp.o, new dtd(dsv.a(1.0f)), fqz.a(frr.a(fsg.a(dsv.a(0.04f))), frp.a(fnz.c.a, bs.a.a().a(bq.a.a().a(true)).c(co.a.a().a(as.a.a().a($$4, bdp.bb)))))).a(dsp.p, new dtv(ly.P, dtv.b(), dtv.a(0.1f), dtv.b(-0.2f), dtv.a(ccd.a(0.1f)), ccd.a(1.0f)), frp.a(fnz.c.a, $$6)).a(dsp.p, new dtn(List.of(bda.AX), ccd.a(0.6f), ccm.b(0.6f, 1.0f)), fqz.a(frr.a(0.35f), frp.a(fnz.c.a, $$6))));
        dst.a($$0, m, dso.a(dso.a($$3.b(bdy.cu), 1, 3, dso.a(25, 25), dso.a(75, 25), 8, cgw.f)).a(dsp.m, new dtg(amo.b("enchantment.swift_sneak"), cis.B, dsv.b(0.15f), ciq.a.a)));
        dst.a($$0, n, dso.a(dso.a($$3.b(bdy.cB), $$3.b(bdy.cy), 10, 5, dso.a(1, 11), dso.a(21, 11), 1, cgw.b)).a($$2.b(bds.f)).a(dsp.e, new dsy(dsv.a(1.0f, 0.5f))));
        dst.a($$0, o, dso.a(dso.a($$3.b(bdy.cC), $$3.b(bdy.cy), 5, 5, dso.a(5, 8), dso.a(25, 8), 2, cgw.b)).a($$2.b(bds.f)).a(dsp.e, new dsy(dsv.b(2.5f)), frp.a(fnz.c.a, bs.a.a().a(bv.a($$5, bdt.E)))));
        dst.a($$0, p, dso.a(dso.a($$3.b(bdy.cC), $$3.b(bdy.cy), 5, 5, dso.a(5, 8), dso.a(25, 8), 2, cgw.b)).a($$2.b(bds.f)).a(dsp.e, new dsy(dsv.b(2.5f)), frp.a(fnz.c.a, bs.a.a().a(bv.a($$5, bdt.D)))).a(dsp.i, dss.a, dss.c, new dtc(jh.a(cfo.b), dsv.a(1.5f), dsv.a(1.5f, 0.5f), dsv.a(3.0f), dsv.a(3.0f)), frp.a(fnz.c.a, bs.a.a().a(bv.a($$5, bdt.D))).and(frf.a(bg.a.a().a(true)))));
        dst.a($$0, q, dso.a(dso.a($$3.b(bdy.cy), 5, 2, dso.a(5, 20), dso.a(55, 20), 2, cgw.b)).a(dsp.g, new dsy(dsv.b(1.0f))));
        dst.a($$0, r, dso.a(dso.a($$3.b(bdy.cA), $$3.b(bdy.cy), 2, 2, dso.a(10, 20), dso.a(60, 20), 4, cgw.b)).a(dsp.i, dss.a, dss.c, new dtl(dsv.b(4.0f)), frf.a(bg.a.a().a(true))));
        dst.a($$0, s, dso.a(dso.a($$3.b(bdy.cy), 2, 3, dso.a(15, 9), dso.a(65, 9), 4, cgw.b)).a(dsp.n, dss.a, dss.c, new dsy(dsv.b(0.01f)), frp.a(fnz.c.b, bs.a.a().a(bv.a($$5, cgu.cb)))));
        dst.a($$0, t, dso.a(dso.a($$3.b(bdy.cz), 2, 3, dso.a(5, 9), dso.a(20, 9), 4, cgw.b)).a(dsp.m, new dtg(amo.b("enchantment.sweeping_edge"), cis.F, new dsv.d(dsv.b(1.0f), dsv.a(2.0f, 1.0f)), ciq.a.a)));
        dst.a($$0, u, dso.a(dso.a($$3.b(bdy.cD), 10, 5, dso.a(1, 10), dso.a(51, 10), 1, cgw.b)).a(dsp.m, new dtg(amo.b("enchantment.efficiency"), cis.v, new dsv.e(1.0f), ciq.a.a)));
        dst.a($$0, v, dso.a(dso.a($$3.b(bdy.cE), 1, 1, dso.a(15), dso.a(65), 8, cgw.b)).a($$2.b(bds.g)).a(dsp.y, new dtu(dsv.a(0.0f))));
        dst.a($$0, w, dso.a(dso.a($$3.b(bdy.cI), 5, 3, dso.a(5, 8), dso.a(55, 8), 2, cgw.a)).a(dsp.l, new dto(new dsv.d(dsv.b(2.0f), dsv.a(10.0f, 5.0f))), frt.a(cg.a.a().a($$3, bdy.cx))).a(dsp.l, new dto(new dsv.d(dsv.b(1.0f), dsv.a(2.0f, 1.0f))), frj.a(frt.a(cg.a.a().a($$3, bdy.cx)))));
        dst.a($$0, x, dso.a(dso.a($$3.b(bdy.cE), 2, 3, dso.a(15, 9), dso.a(65, 9), 4, cgw.b)).a($$2.b(bds.g)));
        dst.a($$0, y, dso.a(dso.a($$3.b(bdy.cJ), 10, 5, dso.a(1, 10), dso.a(16, 10), 1, cgw.b)).a(dsp.e, new dsy(dsv.a(1.0f, 0.5f)), frp.a(fnz.c.c, bs.a.a().a($$5, bdt.g).b())));
        dst.a($$0, z, dso.a(dso.a($$3.b(bdy.cJ), 2, 2, dso.a(12, 20), dso.a(37, 20), 4, cgw.b)).a(dsp.g, new dsy(dsv.b(1.0f)), frp.a(fnz.c.c, bs.a.a().a($$5, bdt.g).b())));
        dst.a($$0, A, dso.a(dso.a($$3.b(bdy.cJ), 2, 1, dso.a(20), dso.a(50), 4, cgw.b)).a(dsp.s, new dtl(dsv.a(100.0f))));
        dst.a($$0, B, dso.a(dso.a($$3.b(bdy.cJ), 1, 1, dso.a(20), dso.a(50), 8, cgw.b)).a($$2.b(bds.d)).a(dsp.q, new dtu(dsv.a(0.0f)), frt.a(cg.a.a().a($$3, dlx.pX))));
        dst.a($$0, C, dso.a(dso.a($$3.b(bdy.cF), 2, 3, dso.a(15, 9), dso.a(65, 9), 4, cgw.b)).a(dsp.x, new dsy(dsv.b(1.0f))));
        dst.a($$0, D, dso.a(dso.a($$3.b(bdy.cF), 2, 3, dso.a(15, 9), dso.a(65, 9), 4, cgw.b)).a(dsp.w, new dsy(dsv.b(5.0f))));
        dst.a($$0, E, dso.a(dso.a($$3.b(bdy.cG), 5, 3, dso.a(12, 7), dso.a(50), 2, cgw.b)).a(dsp.v, new dsy(dsv.b(1.0f))));
        dst.a($$0, F, dso.a(dso.a($$3.b(bdy.cG), 2, 5, dso.a(1, 8), dso.a(21, 8), 4, cgw.b)).a($$2.b(bds.f)).a(dsp.e, new dsy(dsv.b(2.5f)), frp.a(fnz.c.a, bs.a.a().a(bv.a($$5, bdt.C)).b())));
        dst.a($$0, G, dso.a(dso.a($$3.b(bdy.cG), 2, 3, dso.a(17, 7), dso.a(50), 4, cgw.d)).a($$2.b(bds.h)).b(dsp.G, new dsy(dsv.a(1.5f, 0.75f))).b(dsp.D, List.of(bda.CV, bda.CW, bda.CX)));
        dst.a($$0, O, dso.a(dso.a($$3.b(bdy.cH), 5, 3, dso.a(5, 8), dso.a(25, 8), 2, cgw.d)).a(dsp.j, dsz.a(new dtd(new dsv.b(1.0f)), new dtb(dsv.b(4.0f)), new dta(new ftm(0.0, 0.0, 1.0), new ftm(1.0, 0.0, 1.0), dsv.b(0.458f)), new dtn(List.of(bda.qz, bda.qA, bda.qB), ccd.a(1.0f), ccd.a(1.0f))), fqz.a(frj.a(frp.a(fnz.c.a, bs.a.a().a(bs.a.a()))), frp.a(fnz.c.a, bs.a.a().a(bq.a.a().i(false))), frp.a(fnz.c.a, bs.a.a().a(bq.a.a().h(false))))));
        dst.a($$0, H, dso.a(dso.a($$3.b(bdy.cG), 1, 1, dso.a(25), dso.a(50), 8, cgw.b)).a(dsp.i, dss.a, dss.c, dsz.a(new dtw(jh.a(cgu.aB.r()), false), new dtn(List.of(bda.CZ), ccd.a(5.0f), ccd.a(1.0f))), fqz.a(frw.c().b(true), frp.a(fnz.c.a, bs.a.a().a(co.a.a().b(true))), frp.a(fnz.c.c, bs.a.a().a($$5, cgu.bH)))).a(dsp.k, dsz.a(new dtw(jh.a(cgu.aB.r()), false), new dtn(List.of(bda.CZ), ccd.a(5.0f), ccd.a(1.0f))), fqz.a(frw.c().b(true), frp.a(fnz.c.a, bs.a.a().a($$5, cgu.bH)), frk.a(co.a.a().b(true).a(as.a.a().a($$4, bdp.aj))))));
        dst.a($$0, I, dso.a(dso.a($$3.b(bdy.cL), 2, 1, dso.a(20), dso.a(50), 4, cgw.b)).a($$2.b(bds.e)).a(dsp.u, new dsy(dsv.b(2.0f))).a(dsp.t, new dsy(dsv.b(10.0f))));
        dst.a($$0, J, dso.a(dso.a($$3.b(bdy.cL), 5, 3, dso.a(12, 20), dso.a(50), 2, cgw.b, cgw.c)).b(dsp.B, new dsy(dsv.b(-0.25f))).b(dsp.C, List.of(new dkm.b(Optional.of(bda.hP), Optional.empty(), Optional.of(bda.hM)), new dkm.b(Optional.of(bda.hQ), Optional.empty(), Optional.of(bda.hM)), new dkm.b(Optional.of(bda.hR), Optional.empty(), Optional.of(bda.hM)))));
        dst.a($$0, K, dso.a(dso.a($$3.b(bdy.cL), 10, 4, dso.a(1, 10), dso.a(50), 1, cgw.b)).a($$2.b(bds.e)).a(dsp.r, new dsy(dsv.b(1.0f))));
        dst.a($$0, L, dso.a(dso.a($$3.b(bdy.cN), 5, 5, dso.a(5, 8), dso.a(25, 8), 2, cgw.b)).a($$2.b(bds.f)).a(dsp.f, new dsy(dsv.b(0.5f))));
        dst.a($$0, M, dso.a(dso.a($$3.b(bdy.cN), 2, 4, dso.a(15, 9), dso.a(65, 9), 4, cgw.b)).a($$2.b(bds.f)).a(dsp.h, new dsy(dsv.b(-0.15f))));
        dst.a($$0, N, dso.a(dso.a($$3.b(bdy.cN), 2, 3, dso.a(15, 9), dso.a(65, 9), 4, cgw.b)).a(dsp.i, dss.a, dss.a, new dtk(false, Optional.empty(), Optional.of(dsv.a(List.of(Float.valueOf(1.2f), Float.valueOf(1.75f), Float.valueOf(2.2f)), dsv.a(1.5f, 0.35f))), $$4.a(bdp.cQ).map(Function.identity()), ftm.c, dsv.a(3.5f), false, dwo.a.e, ly.B, ly.A, cbn.a(), bda.FJ), frp.a(fnz.c.c, bs.a.a().a(bq.a.a().f(false)).a(cs.d(cq.b.b(1.5))))));
        dst.a($$0, P, dso.a(dso.a($$3.b(bdy.cI), 2, 1, dso.a(25, 25), dso.a(75, 25), 4, cgw.a)).a(dsp.A, new dtm(dsv.a(2.0f))));
        dst.a($$0, Q, dso.a(dso.a($$3.b(bdy.cM), 1, 1, dso.a(25), dso.a(50), 8, cgw.a)).a(dsp.E));
    }

    private static void a(qr<dso> $$0, amt<dso> $$1, dso.a $$2) {
        $$0.a($$1, $$2.a($$1.a()));
    }

    private static amt<dso> a(String $$0) {
        return amt.a(mj.bf, amo.b($$0));
    }
}

