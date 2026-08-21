/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;

public class ikj {
    private static final bfm.b<amo, MapCodec<? extends iki.b>> b = new bfm.b();
    public static final Codec<iki.b> a = b.a(amo.a).dispatch(iki.b::a, $$0 -> $$0);
    private static final Map<dzq, iki.b> c = ImmutableMap.builder().put((Object)dzs.hv, (Object)new ikh.a(ehh.b.c)).put((Object)dzs.hz, (Object)new ikh.a(ehh.b.f)).put((Object)dzs.hD, (Object)new ikh.a(ehh.b.g)).put((Object)dzs.hF, (Object)new ikh.a(ehh.b.i)).put((Object)dzs.hH, (Object)new ikh.a(ehh.b.h)).put((Object)dzs.hB, (Object)new ike.a()).put((Object)dzs.hx, (Object)new ikh.a(ehh.b.d)).put((Object)dzs.hw, (Object)new ikh.a(ehh.b.c)).put((Object)dzs.hA, (Object)new ikh.a(ehh.b.f)).put((Object)dzs.hE, (Object)new ikh.a(ehh.b.g)).put((Object)dzs.hG, (Object)new ikh.a(ehh.b.i)).put((Object)dzs.hI, (Object)new ikh.a(ehh.b.h)).put((Object)dzs.hC, (Object)new ike.a()).put((Object)dzs.hy, (Object)new ikh.a(ehh.b.d)).put((Object)dzs.jB, (Object)new ijw.a(dkr.a)).put((Object)dzs.jC, (Object)new ijw.a(dkr.b)).put((Object)dzs.jD, (Object)new ijw.a(dkr.c)).put((Object)dzs.jE, (Object)new ijw.a(dkr.d)).put((Object)dzs.jF, (Object)new ijw.a(dkr.e)).put((Object)dzs.jG, (Object)new ijw.a(dkr.f)).put((Object)dzs.jH, (Object)new ijw.a(dkr.g)).put((Object)dzs.jI, (Object)new ijw.a(dkr.h)).put((Object)dzs.jJ, (Object)new ijw.a(dkr.i)).put((Object)dzs.jK, (Object)new ijw.a(dkr.j)).put((Object)dzs.jL, (Object)new ijw.a(dkr.k)).put((Object)dzs.jM, (Object)new ijw.a(dkr.l)).put((Object)dzs.jN, (Object)new ijw.a(dkr.m)).put((Object)dzs.jO, (Object)new ijw.a(dkr.n)).put((Object)dzs.jP, (Object)new ijw.a(dkr.o)).put((Object)dzs.jQ, (Object)new ijw.a(dkr.p)).put((Object)dzs.jR, (Object)new ijw.a(dkr.a)).put((Object)dzs.jS, (Object)new ijw.a(dkr.b)).put((Object)dzs.jT, (Object)new ijw.a(dkr.c)).put((Object)dzs.jU, (Object)new ijw.a(dkr.d)).put((Object)dzs.jV, (Object)new ijw.a(dkr.e)).put((Object)dzs.jW, (Object)new ijw.a(dkr.f)).put((Object)dzs.jX, (Object)new ijw.a(dkr.g)).put((Object)dzs.jY, (Object)new ijw.a(dkr.h)).put((Object)dzs.jZ, (Object)new ijw.a(dkr.i)).put((Object)dzs.ka, (Object)new ijw.a(dkr.j)).put((Object)dzs.kb, (Object)new ijw.a(dkr.k)).put((Object)dzs.kc, (Object)new ijw.a(dkr.l)).put((Object)dzs.kd, (Object)new ijw.a(dkr.m)).put((Object)dzs.ke, (Object)new ijw.a(dkr.n)).put((Object)dzs.kf, (Object)new ijw.a(dkr.o)).put((Object)dzs.kg, (Object)new ijw.a(dkr.p)).put((Object)dzs.bg, (Object)new ijx.a(dkr.a)).put((Object)dzs.bh, (Object)new ijx.a(dkr.b)).put((Object)dzs.bi, (Object)new ijx.a(dkr.c)).put((Object)dzs.bj, (Object)new ijx.a(dkr.d)).put((Object)dzs.bk, (Object)new ijx.a(dkr.e)).put((Object)dzs.bl, (Object)new ijx.a(dkr.f)).put((Object)dzs.bm, (Object)new ijx.a(dkr.g)).put((Object)dzs.bn, (Object)new ijx.a(dkr.h)).put((Object)dzs.bo, (Object)new ijx.a(dkr.i)).put((Object)dzs.bp, (Object)new ijx.a(dkr.j)).put((Object)dzs.bq, (Object)new ijx.a(dkr.k)).put((Object)dzs.br, (Object)new ijx.a(dkr.l)).put((Object)dzs.bs, (Object)new ijx.a(dkr.m)).put((Object)dzs.bt, (Object)new ijx.a(dkr.n)).put((Object)dzs.bu, (Object)new ijx.a(dkr.o)).put((Object)dzs.bv, (Object)new ijx.a(dkr.p)).put((Object)dzs.lL, (Object)new ikg.a()).put((Object)dzs.lM, (Object)new ikg.a(dkr.a)).put((Object)dzs.lN, (Object)new ikg.a(dkr.b)).put((Object)dzs.lO, (Object)new ikg.a(dkr.c)).put((Object)dzs.lP, (Object)new ikg.a(dkr.d)).put((Object)dzs.lQ, (Object)new ikg.a(dkr.e)).put((Object)dzs.lR, (Object)new ikg.a(dkr.f)).put((Object)dzs.lS, (Object)new ikg.a(dkr.g)).put((Object)dzs.lT, (Object)new ikg.a(dkr.h)).put((Object)dzs.lU, (Object)new ikg.a(dkr.i)).put((Object)dzs.lV, (Object)new ikg.a(dkr.j)).put((Object)dzs.lW, (Object)new ikg.a(dkr.k)).put((Object)dzs.lX, (Object)new ikg.a(dkr.l)).put((Object)dzs.lY, (Object)new ikg.a(dkr.m)).put((Object)dzs.lZ, (Object)new ikg.a(dkr.n)).put((Object)dzs.ma, (Object)new ikg.a(dkr.o)).put((Object)dzs.mb, (Object)new ikg.a(dkr.p)).put((Object)dzs.db, (Object)new ikk.a(epw.b)).put((Object)dzs.dc, (Object)new ikk.a(epw.c)).put((Object)dzs.dd, (Object)new ikk.a(epw.d)).put((Object)dzs.de, (Object)new ikk.a(epw.e)).put((Object)dzs.df, (Object)new ikk.a(epw.f)).put((Object)dzs.dg, (Object)new ikk.a(epw.g)).put((Object)dzs.dh, (Object)new ikk.a(epw.h)).put((Object)dzs.di, (Object)new ikk.a(epw.i)).put((Object)dzs.dj, (Object)new ikk.a(epw.l)).put((Object)dzs.dk, (Object)new ikk.a(epw.m)).put((Object)dzs.pU, (Object)new ikk.a(epw.j)).put((Object)dzs.pV, (Object)new ikk.a(epw.k)).put((Object)dzs.dp, (Object)new ikk.a(epw.b)).put((Object)dzs.dq, (Object)new ikk.a(epw.c)).put((Object)dzs.dr, (Object)new ikk.a(epw.d)).put((Object)dzs.ds, (Object)new ikk.a(epw.e)).put((Object)dzs.dt, (Object)new ikk.a(epw.f)).put((Object)dzs.du, (Object)new ikk.a(epw.g)).put((Object)dzs.dv, (Object)new ikk.a(epw.h)).put((Object)dzs.dw, (Object)new ikk.a(epw.i)).put((Object)dzs.dx, (Object)new ikk.a(epw.l)).put((Object)dzs.dy, (Object)new ikk.a(epw.m)).put((Object)dzs.pW, (Object)new ikk.a(epw.j)).put((Object)dzs.pX, (Object)new ikk.a(epw.k)).put((Object)dzs.dz, (Object)new ikc.a(epw.b)).put((Object)dzs.dA, (Object)new ikc.a(epw.c)).put((Object)dzs.dB, (Object)new ikc.a(epw.d)).put((Object)dzs.dC, (Object)new ikc.a(epw.e)).put((Object)dzs.dD, (Object)new ikc.a(epw.f)).put((Object)dzs.dE, (Object)new ikc.a(epw.g)).put((Object)dzs.dF, (Object)new ikc.a(epw.h)).put((Object)dzs.dG, (Object)new ikc.a(epw.i)).put((Object)dzs.dJ, (Object)new ikc.a(epw.l)).put((Object)dzs.dK, (Object)new ikc.a(epw.m)).put((Object)dzs.dH, (Object)new ikc.a(epw.j)).put((Object)dzs.dI, (Object)new ikc.a(epw.k)).put((Object)dzs.dL, (Object)new ikc.a(epw.b)).put((Object)dzs.dM, (Object)new ikc.a(epw.c)).put((Object)dzs.dN, (Object)new ikc.a(epw.d)).put((Object)dzs.dO, (Object)new ikc.a(epw.e)).put((Object)dzs.dP, (Object)new ikc.a(epw.f)).put((Object)dzs.dQ, (Object)new ikc.a(epw.g)).put((Object)dzs.dR, (Object)new ikc.a(epw.h)).put((Object)dzs.dS, (Object)new ikc.a(epw.i)).put((Object)dzs.dT, (Object)new ikc.a(epw.l)).put((Object)dzs.dW, (Object)new ikc.a(epw.m)).put((Object)dzs.dU, (Object)new ikc.a(epw.j)).put((Object)dzs.dV, (Object)new ikc.a(epw.k)).put((Object)dzs.nU, (Object)new ijz.a()).put((Object)dzs.cS, (Object)new ijy.a(ijy.b)).put((Object)dzs.hM, (Object)new ijy.a(ijy.c)).put((Object)dzs.gv, (Object)new ijy.a(ijy.d)).put((Object)dzs.ts, (Object)new ijy.a(ijy.e)).put((Object)dzs.tt, (Object)new ijy.a(ijy.f)).put((Object)dzs.tu, (Object)new ijy.a(ijy.g)).put((Object)dzs.tv, (Object)new ijy.a(ijy.h)).put((Object)dzs.tw, (Object)new ijy.a(ijy.e)).put((Object)dzs.tx, (Object)new ijy.a(ijy.f)).put((Object)dzs.ty, (Object)new ijy.a(ijy.g)).put((Object)dzs.tz, (Object)new ijy.a(ijy.h)).put((Object)dzs.tA, (Object)new ika.a(ejq.a.a, ebh.a.a)).put((Object)dzs.tB, (Object)new ika.a(ejq.a.b, ebh.a.a)).put((Object)dzs.tC, (Object)new ika.a(ejq.a.c, ebh.a.a)).put((Object)dzs.tD, (Object)new ika.a(ejq.a.d, ebh.a.a)).put((Object)dzs.tE, (Object)new ika.a(ejq.a.a, ebh.a.a)).put((Object)dzs.tF, (Object)new ika.a(ejq.a.b, ebh.a.a)).put((Object)dzs.tG, (Object)new ika.a(ejq.a.c, ebh.a.a)).put((Object)dzs.tH, (Object)new ika.a(ejq.a.d, ebh.a.a)).put((Object)dzs.uO, (Object)new ikb.a()).build();
    private static final ijy.a d = new ijy.a(ijy.a);

    public static void a() {
        b.a(amo.b("bed"), ijx.a.a);
        b.a(amo.b("banner"), ijw.a.a);
        b.a(amo.b("conduit"), ijz.a.a);
        b.a(amo.b("chest"), ijy.a.a);
        b.a(amo.b("copper_golem_statue"), ika.a.a);
        b.a(amo.b("head"), ikh.a.a);
        b.a(amo.b("player_head"), ike.a.a);
        b.a(amo.b("shulker_box"), ikg.a.a);
        b.a(amo.b("shield"), ikf.a.b);
        b.a(amo.b("trident"), ikl.a.a);
        b.a(amo.b("decorated_pot"), ikb.a.a);
        b.a(amo.b("standing_sign"), ikk.a.a);
        b.a(amo.b("hanging_sign"), ikc.a.a);
    }

    public static Map<dzq, iki<?>> a(iki.a $$0) {
        HashMap<dzq, iki.b> $$1 = new HashMap<dzq, iki.b>(c);
        if (hrp.a()) {
            $$1.put(dzs.cS, d);
            $$1.put(dzs.hM, d);
        }
        ImmutableMap.Builder $$22 = ImmutableMap.builder();
        $$1.forEach(($$2, $$3) -> {
            iki<?> $$4 = $$3.a($$0);
            if ($$4 != null) {
                $$22.put($$2, $$4);
            }
        });
        return $$22.build();
    }
}

