/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

public class qz {
    private static final amt<fjo> N = qz.a("empty");
    public static final amt<fjo> a = qz.a("zombie_plains");
    public static final amt<fjo> b = qz.a("zombie_savanna");
    public static final amt<fjo> c = qz.a("zombie_snowy");
    public static final amt<fjo> d = qz.a("zombie_taiga");
    public static final amt<fjo> e = qz.a("zombie_desert");
    public static final amt<fjo> f = qz.a("mossify_10_percent");
    public static final amt<fjo> g = qz.a("mossify_20_percent");
    public static final amt<fjo> h = qz.a("mossify_70_percent");
    public static final amt<fjo> i = qz.a("street_plains");
    public static final amt<fjo> j = qz.a("street_savanna");
    public static final amt<fjo> k = qz.a("street_snowy_or_taiga");
    public static final amt<fjo> l = qz.a("farm_plains");
    public static final amt<fjo> m = qz.a("farm_savanna");
    public static final amt<fjo> n = qz.a("farm_snowy");
    public static final amt<fjo> o = qz.a("farm_taiga");
    public static final amt<fjo> p = qz.a("farm_desert");
    public static final amt<fjo> q = qz.a("outpost_rot");
    public static final amt<fjo> r = qz.a("bottom_rampart");
    public static final amt<fjo> s = qz.a("treasure_rooms");
    public static final amt<fjo> t = qz.a("housing");
    public static final amt<fjo> u = qz.a("side_wall_degradation");
    public static final amt<fjo> v = qz.a("stable_degradation");
    public static final amt<fjo> w = qz.a("bastion_generic_degradation");
    public static final amt<fjo> x = qz.a("rampart_degradation");
    public static final amt<fjo> y = qz.a("entrance_replacement");
    public static final amt<fjo> z = qz.a("bridge");
    public static final amt<fjo> A = qz.a("roof");
    public static final amt<fjo> B = qz.a("high_wall");
    public static final amt<fjo> C = qz.a("high_rampart");
    public static final amt<fjo> D = qz.a("fossil_rot");
    public static final amt<fjo> E = qz.a("fossil_coal");
    public static final amt<fjo> F = qz.a("fossil_diamonds");
    public static final amt<fjo> G = qz.a("ancient_city_start_degradation");
    public static final amt<fjo> H = qz.a("ancient_city_generic_degradation");
    public static final amt<fjo> I = qz.a("ancient_city_walls_degradation");
    public static final amt<fjo> J = qz.a("trail_ruins_houses_archaeology");
    public static final amt<fjo> K = qz.a("trail_ruins_roads_archaeology");
    public static final amt<fjo> L = qz.a("trail_ruins_tower_top_archaeology");
    public static final amt<fjo> M = qz.a("trial_chambers_copper_bulb_degradation");

    private static amt<fjo> a(String $$0) {
        return amt.a(mj.bq, amo.b($$0));
    }

    private static void a(qr<fjo> $$0, amt<fjo> $$1, List<fjn> $$2) {
        $$0.a($$1, new fjo($$2));
    }

    public static void a(qr<fjo> $$0) {
        je<dzq> $$1 = $$0.a(mj.i);
        fjf $$2 = new fjf(new fjh(dzs.qr, 0.01f), fin.b, dzs.qC.m());
        fjf $$3 = new fjf(new fjh(dzs.qC, 0.5f), fin.b, dzs.qr.m());
        qz.a($$0, N, (List<fjn>)ImmutableList.of());
        qz.a($$0, a, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.m, 0.8f), fin.b, dzs.cJ.m()), (Object)new fjf(new fjs(bdp.o), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.cL), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.cM), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.m, 0.07f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.cJ, 0.07f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.ia, 0.07f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.X, 0.05f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.n, 0.1f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.cR, 0.1f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.aq, 0.02f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.fG, 0.5f), fin.b, dzs.bz.m()), (Object[])new fjf[]{new fjf(new fiu((eoh)((eoh)dzs.fG.m().b(edy.a, true)).b(edy.c, true)), fin.b, (eoh)((eoh)dzs.iC.m().b(edy.a, true)).b(edy.c, true)), new fjf(new fiu((eoh)((eoh)dzs.fG.m().b(edy.b, true)).b(edy.d, true)), fin.b, (eoh)((eoh)dzs.iC.m().b(edy.b, true)).b(edy.d, true)), new fjf(new fjh(dzs.cY, 0.3f), fin.b, dzs.hj.m()), new fjf(new fjh(dzs.cY, 0.2f), fin.b, dzs.hk.m()), new fjf(new fjh(dzs.cY, 0.1f), fin.b, dzs.lz.m())}))));
        qz.a($$0, b, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjs(bdp.o), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.cL), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.cM), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.r, 0.2f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.iG, 0.2f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.ab, 0.05f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.ax, 0.05f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.ib, 0.05f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.ie, 0.05f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.io, 0.05f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.fG, 0.5f), fin.b, dzs.bz.m()), (Object)new fjf(new fiu((eoh)((eoh)dzs.fG.m().b(edy.a, true)).b(edy.c, true)), fin.b, (eoh)((eoh)dzs.iC.m().b(edy.a, true)).b(edy.c, true)), (Object[])new fjf[]{new fjf(new fiu((eoh)((eoh)dzs.fG.m().b(edy.b, true)).b(edy.d, true)), fin.b, (eoh)((eoh)dzs.iC.m().b(edy.b, true)).b(edy.d, true)), new fjf(new fjh(dzs.cY, 0.1f), fin.b, dzs.fM.m())}))));
        qz.a($$0, c, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjs(bdp.o), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.cL), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.cM), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.pb), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.o, 0.2f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.km, 0.4f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.aj, 0.05f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.aC, 0.05f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.fG, 0.5f), fin.b, dzs.bz.m()), (Object)new fjf(new fiu((eoh)((eoh)dzs.fG.m().b(edy.a, true)).b(edy.c, true)), fin.b, (eoh)((eoh)dzs.iC.m().b(edy.a, true)).b(edy.c, true)), (Object)new fjf(new fiu((eoh)((eoh)dzs.fG.m().b(edy.b, true)).b(edy.d, true)), fin.b, (eoh)((eoh)dzs.iC.m().b(edy.b, true)).b(edy.d, true)), (Object)new fjf(new fjh(dzs.cY, 0.1f), fin.b, dzs.hj.m()), (Object[])new fjf[]{new fjf(new fjh(dzs.cY, 0.8f), fin.b, dzs.hk.m())}))));
        qz.a($$0, d, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.m, 0.8f), fin.b, dzs.cJ.m()), (Object)new fjf(new fjs(bdp.o), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.cL), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.cM), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.pe), fin.b, (eoh)dzs.pe.m().b(eag.b, false)), (Object)new fjf(new fjh(dzs.m, 0.08f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.Y, 0.08f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.fG, 0.5f), fin.b, dzs.bz.m()), (Object)new fjf(new fiu((eoh)((eoh)dzs.fG.m().b(edy.a, true)).b(edy.c, true)), fin.b, (eoh)((eoh)dzs.iC.m().b(edy.a, true)).b(edy.c, true)), (Object)new fjf(new fiu((eoh)((eoh)dzs.fG.m().b(edy.b, true)).b(edy.d, true)), fin.b, (eoh)((eoh)dzs.iC.m().b(edy.b, true)).b(edy.d, true)), (Object)new fjf(new fjh(dzs.cY, 0.3f), fin.b, dzs.fL.m()), (Object)new fjf(new fjh(dzs.cY, 0.2f), fin.b, dzs.hk.m()), (Object[])new fjf[0]))));
        qz.a($$0, e, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjs(bdp.o), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.cL), fin.b, dzs.a.m()), (Object)new fjf(new fis(dzs.cM), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.kL, 0.08f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.be, 0.1f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.js, 0.08f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.oi, 0.08f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.ov, 0.08f), fin.b, dzs.bz.m()), (Object)new fjf(new fjh(dzs.cY, 0.2f), fin.b, dzs.lz.m()), (Object)new fjf(new fjh(dzs.cY, 0.1f), fin.b, dzs.fM.m())))));
        qz.a($$0, f, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.m, 0.1f), fin.b, dzs.cJ.m())))));
        qz.a($$0, g, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.m, 0.2f), fin.b, dzs.cJ.m())))));
        qz.a($$0, h, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.m, 0.7f), fin.b, dzs.cJ.m())))));
        qz.a($$0, i, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fis(dzs.lA), new fis(dzs.J), dzs.n.m()), (Object)new fjf(new fjh(dzs.lA, 0.1f), fin.b, dzs.i.m()), (Object)new fjf(new fis(dzs.i), new fis(dzs.J), dzs.J.m()), (Object)new fjf(new fis(dzs.j), new fis(dzs.J), dzs.J.m())))));
        qz.a($$0, j, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fis(dzs.lA), new fis(dzs.J), dzs.r.m()), (Object)new fjf(new fjh(dzs.lA, 0.2f), fin.b, dzs.i.m()), (Object)new fjf(new fis(dzs.i), new fis(dzs.J), dzs.J.m()), (Object)new fjf(new fis(dzs.j), new fis(dzs.J), dzs.J.m())))));
        qz.a($$0, k, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fis(dzs.lA), new fis(dzs.J), dzs.o.m()), (Object)new fjf(new fis(dzs.lA), new fis(dzs.eq), dzs.o.m()), (Object)new fjf(new fjh(dzs.lA, 0.2f), fin.b, dzs.i.m()), (Object)new fjf(new fis(dzs.i), new fis(dzs.J), dzs.J.m()), (Object)new fjf(new fis(dzs.j), new fis(dzs.J), dzs.J.m())))));
        qz.a($$0, l, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.cY, 0.3f), fin.b, dzs.hj.m()), (Object)new fjf(new fjh(dzs.cY, 0.2f), fin.b, dzs.hk.m()), (Object)new fjf(new fjh(dzs.cY, 0.1f), fin.b, dzs.lz.m())))));
        qz.a($$0, m, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.cY, 0.1f), fin.b, dzs.fM.m())))));
        qz.a($$0, n, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.cY, 0.1f), fin.b, dzs.hj.m()), (Object)new fjf(new fjh(dzs.cY, 0.8f), fin.b, dzs.hk.m())))));
        qz.a($$0, o, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.cY, 0.3f), fin.b, dzs.fL.m()), (Object)new fjf(new fjh(dzs.cY, 0.2f), fin.b, dzs.hk.m())))));
        qz.a($$0, p, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.cY, 0.2f), fin.b, dzs.lz.m()), (Object)new fjf(new fjh(dzs.cY, 0.1f), fin.b, dzs.fM.m())))));
        qz.a($$0, q, (List<fjn>)ImmutableList.of((Object)new fit(0.05f)));
        qz.a($$0, r, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.lF, 0.75f), fin.b, dzs.qx.m()), (Object)new fjf(new fjh(dzs.qx, 0.15f), fin.b, dzs.qw.m()), (Object)$$3, (Object)$$2))));
        qz.a($$0, s, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.qw, 0.35f), fin.b, dzs.qx.m()), (Object)new fjf(new fjh(dzs.qy, 0.1f), fin.b, dzs.qx.m()), (Object)$$3, (Object)$$2))));
        qz.a($$0, t, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.qw, 0.3f), fin.b, dzs.qx.m()), (Object)new fjf(new fjh(dzs.qr, 1.0E-4f), fin.b, dzs.a.m()), (Object)$$3, (Object)$$2))));
        qz.a($$0, u, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.qy, 0.5f), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.cr, 0.1f), fin.b, dzs.qx.m()), (Object)$$3, (Object)$$2))));
        qz.a($$0, v, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.qw, 0.1f), fin.b, dzs.qx.m()), (Object)new fjf(new fjh(dzs.qr, 1.0E-4f), fin.b, dzs.a.m()), (Object)$$3, (Object)$$2))));
        qz.a($$0, w, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.qw, 0.3f), fin.b, dzs.qx.m()), (Object)new fjf(new fjh(dzs.qr, 1.0E-4f), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.cr, 0.3f), fin.b, dzs.qx.m()), (Object)$$3, (Object)$$2))));
        qz.a($$0, x, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.qw, 0.4f), fin.b, dzs.qx.m()), (Object)new fjf(new fjh(dzs.qr, 0.01f), fin.b, dzs.qx.m()), (Object)new fjf(new fjh(dzs.qw, 1.0E-4f), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.qr, 1.0E-4f), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.cr, 0.3f), fin.b, dzs.qx.m()), (Object)$$3, (Object)$$2))));
        qz.a($$0, y, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.qy, 0.5f), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.cr, 0.6f), fin.b, dzs.qx.m()), (Object)$$3, (Object)$$2))));
        qz.a($$0, z, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.qw, 0.3f), fin.b, dzs.qx.m()), (Object)new fjf(new fjh(dzs.qr, 1.0E-4f), fin.b, dzs.a.m())))));
        qz.a($$0, A, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.qw, 0.3f), fin.b, dzs.qx.m()), (Object)new fjf(new fjh(dzs.qw, 0.15f), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.qw, 0.3f), fin.b, dzs.qr.m())))));
        qz.a($$0, B, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.qw, 0.01f), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.qw, 0.5f), fin.b, dzs.qx.m()), (Object)new fjf(new fjh(dzs.qw, 0.3f), fin.b, dzs.qr.m()), (Object)$$3))));
        qz.a($$0, C, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.cr, 0.3f), fin.b, dzs.qx.m()), (Object)new fjf(fin.b, fin.b, new fio(0.0f, 0.05f, 0, 100, iz.a.b), dzs.a.m()), (Object)$$3))));
        qz.a($$0, D, (List<fjn>)ImmutableList.of((Object)new fit(0.9f), (Object)new fjg(bdp.cd)));
        qz.a($$0, E, (List<fjn>)ImmutableList.of((Object)new fit(0.1f), (Object)new fjg(bdp.cd)));
        qz.a($$0, F, (List<fjn>)ImmutableList.of((Object)new fit(0.1f), (Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fis(dzs.U), fin.b, dzs.cV.m()))), (Object)new fjg(bdp.cd)));
        qz.a($$0, G, (List<fjn>)ImmutableList.of((Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.uv, 0.3f), fin.b, dzs.uA.m()), (Object)new fjf(new fjh(dzs.ur, 0.3f), fin.b, dzs.uB.m()), (Object)new fjf(new fjh(dzs.pc, 0.05f), fin.b, dzs.a.m()))), (Object)new fjg(bdp.cd)));
        qz.a($$0, H, (List<fjn>)ImmutableList.of((Object)new fit($$1.b(bdp.cj), 0.95f), (Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.uv, 0.3f), fin.b, dzs.uA.m()), (Object)new fjf(new fjh(dzs.ur, 0.3f), fin.b, dzs.uB.m()), (Object)new fjf(new fjh(dzs.pc, 0.05f), fin.b, dzs.a.m()))), (Object)new fjg(bdp.cd)));
        qz.a($$0, I, (List<fjn>)ImmutableList.of((Object)new fit($$1.b(bdp.cj), 0.95f), (Object)new fjj((List<? extends fjf>)ImmutableList.of((Object)new fjf(new fjh(dzs.uv, 0.3f), fin.b, dzs.uA.m()), (Object)new fjf(new fjh(dzs.ur, 0.3f), fin.b, dzs.uB.m()), (Object)new fjf(new fjh(dzs.ut, 0.3f), fin.b, dzs.a.m()), (Object)new fjf(new fjh(dzs.pc, 0.05f), fin.b, dzs.a.m()))), (Object)new fjg(bdp.cd)));
        qz.a($$0, J, List.of(new fjj(List.of(new fjf(new fjh(dzs.O, 0.2f), fin.b, dzs.j.m()), new fjf(new fjh(dzs.O, 0.1f), fin.b, dzs.k.m()), new fjf(new fjh(dzs.fs, 0.1f), fin.b, dzs.fr.m()))), qz.a(fnv.bl, 6), qz.a(fnv.bm, 3)));
        qz.a($$0, K, List.of(new fjj(List.of(new fjf(new fjh(dzs.O, 0.2f), fin.b, dzs.j.m()), new fjf(new fjh(dzs.O, 0.1f), fin.b, dzs.k.m()), new fjf(new fjh(dzs.fs, 0.1f), fin.b, dzs.fr.m()))), qz.a(fnv.bl, 2)));
        qz.a($$0, L, List.of(qz.a(fnv.bl, 2)));
        qz.a($$0, M, List.of(new fjj(List.of(new fjf(new fjh(dzs.to, 0.1f), fin.b, (eoh)dzs.tr.m().b(ebf.c, true)), new fjf(new fjh(dzs.to, 0.33333334f), fin.b, (eoh)dzs.tq.m().b(ebf.c, true)), new fjf(new fjh(dzs.to, 0.5f), fin.b, (eoh)dzs.tp.m().b(ebf.c, true)))), new fjg(bdp.cd)));
    }

    private static fiv a(amt<fof> $$0, int $$1) {
        return new fiv(new fjj(List.of(new fjf(new fjs(bdp.cL), fin.b, fjc.b, dzs.P.m(), new fju($$0)))), cce.a($$1));
    }
}

