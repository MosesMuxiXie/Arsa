/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.slf4j.Logger;

public class cit {
    private static final Logger a = LogUtils.getLogger();
    private static final Map<cgu<? extends chl>, cir> b = ImmutableMap.builder().put(cgu.e, (Object)ctl.k().a()).put(cgu.g, (Object)cto.p().a()).put(cgu.h, (Object)cyy.k().a()).put(cgu.j, (Object)ctr.gR().a()).put(cgu.m, (Object)cte.k().a()).put(cgu.n, (Object)ctw.hf().a()).put(cgu.q, (Object)czo.k().a()).put(cgu.s, (Object)dbw.gT().a()).put(cgu.x, (Object)cvb.hh().a()).put(cgu.v, (Object)cty.p().a()).put(cgu.w, (Object)cty.p().a()).put(cgu.y, (Object)dcc.k().a()).put(cgu.C, (Object)cuc.p().a()).put(cgu.D, (Object)cvg.k().a()).put(cgu.E, (Object)cwc.k().a()).put(cgu.G, (Object)cuh.p().a()).put(cgu.H, (Object)dat.p().a()).put(cgu.I, (Object)czp.k().a()).put(cgu.L, (Object)cum.gQ().a()).put(cgu.M, (Object)cuo.p().a()).put(cgu.O, (Object)dcl.k().a()).put(cgu.Q, (Object)czr.k().a()).put(cgu.R, (Object)czs.k().a()).put(cgu.S, (Object)czt.k().a()).put(cgu.T, (Object)cyc.p().a()).put(cgu.W, (Object)dbb.gP().a()).put(cgu.t, (Object)dal.k().a()).put(cgu.ae, (Object)cvo.p().a()).put(cgu.af, (Object)cvq.gR().a()).put(cgu.ah, (Object)czv.gL().a()).put(cgu.ai, (Object)cwk.p().a()).put(cgu.aj, (Object)czw.k().a()).put(cgu.al, (Object)cxp.gR().a()).put(cgu.am, (Object)cvy.gP().a()).put(cgu.an, (Object)czx.gQ().a()).put(cgu.ao, (Object)daw.p().a()).put(cgu.aq, (Object)cup.hx().a()).put(cgu.ar, (Object)dcn.gT().a()).put(cgu.as, (Object)dbc.gP().a()).put(cgu.au, (Object)cwh.k().a()).put(cgu.aC, (Object)cus.hd().a()).put(cgu.aE, (Object)czy.k().a()).put(cgu.aH, (Object)chl.ex().a()).put(cgu.aK, (Object)cuh.p().a()).put(cgu.aL, (Object)cuo.p().a()).put(cgu.aM, (Object)cwo.hd().a()).put(cgu.aP, (Object)cve.p().a()).put(cgu.aU, (Object)cww.he().a()).put(cgu.aV, (Object)dbx.gT().a()).put(cgu.aW, (Object)cwy.hd().a()).put(cgu.aX, (Object)czz.gW().a()).put(cgu.aY, (Object)cxb.p().a()).put(cgu.aZ, (Object)dbj.gX().a()).put(cgu.ba, (Object)dbm.gP().a()).put(cgu.bb, (Object)dbd.gZ().a()).put(cgu.cb, (Object)ddm.gz().a()).put(cgu.bc, (Object)cxf.p().a()).put(cgu.bf, (Object)cvg.k().a()).put(cgu.bg, (Object)cxh.gP().a()).put(cgu.bh, (Object)dad.gP().a()).put(cgu.bi, (Object)cvg.k().a()).put(cgu.bj, (Object)cxj.p().a()).put(cgu.bk, (Object)dae.k().a()).put(cgu.bm, (Object)daf.k().a()).put(cgu.bn, (Object)dbv.k().a()).put(cgu.bo, (Object)cuv.p().a()).put(cgu.bp, (Object)czz.gW().a()).put(cgu.br, (Object)cxm.p().a()).put(cgu.bt, (Object)cwi.k().a()).put(cgu.bw, (Object)dcd.p().a()).put(cgu.bz, (Object)cxq.gR().a()).put(cgu.bA, (Object)dbv.k().a()).put(cgu.bB, (Object)dah.gP().a()).put(cgu.bC, (Object)cvv.gQ().a()).put(cgu.bG, (Object)cus.hd().a()).put(cgu.bI, (Object)cvg.k().a()).put(cgu.bJ, (Object)cxs.gQ().a()).put(cgu.bK, (Object)dai.k().a()).put(cgu.bL, (Object)dcx.gT().a()).put(cgu.bM, (Object)dbf.gP().a()).put(cgu.bO, (Object)dch.k().a()).put(cgu.bN, (Object)chn.E().a()).put(cgu.bQ, (Object)daj.gY().a()).put(cgu.bR, (Object)cyw.p().a()).put(cgu.bS, (Object)dbv.k().a()).put(cgu.bU, (Object)cxu.he().a()).put(cgu.bV, (Object)dak.k().a()).put(cgu.bW, (Object)dcn.gT().a()).put(cgu.bX, (Object)cuz.p().a()).put(cgu.bY, (Object)cwq.hn().a()).put(cgu.bZ, (Object)dcn.gT().a()).put(cgu.ca, (Object)dcp.gS().a()).build();

    public static cir a(cgu<? extends chl> $$0) {
        return b.get($$0);
    }

    public static boolean b(cgu<?> $$0) {
        return b.containsKey($$0);
    }

    public static void a() {
        mi.g.s().filter($$0 -> $$0.f() != cho.h).filter($$0 -> !cit.b($$0)).map(mi.g::b).forEach($$0 -> bhs.b("Entity " + String.valueOf($$0) + " has no attributes"));
    }
}

