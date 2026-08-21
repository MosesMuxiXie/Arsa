/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.slf4j.Logger;

public interface lg {
    public static final Logger a = LogUtils.getLogger();
    public static final lg b = ($$0, $$1) -> $$1;

    public dlt dispense(ld var1, dlt var2);

    public static void a() {
        eby.a((dwn)dlx.pX);
        eby.a((dwn)dlx.xF);
        eby.a((dwn)dlx.xE);
        eby.a((dwn)dlx.sD);
        eby.a((dwn)dlx.sE);
        eby.a((dwn)dlx.sF);
        eby.a((dwn)dlx.so);
        eby.a((dwn)dlx.wh);
        eby.a((dwn)dlx.xD);
        eby.a((dwn)dlx.xG);
        eby.a((dwn)dlx.wG);
        eby.a((dwn)dlx.wi);
        eby.a((dwn)dlx.wj);
        lf $$0 = new lf(){

            @Override
            public dlt a(ld $$0, dlt $$1) {
                iz $$2 = $$0.d().c(eby.b);
                cgu<?> $$3 = ((dna)$$1.h()).g($$1);
                if ($$3 == null) {
                    return $$1;
                }
                try {
                    $$3.a($$0.b(), $$1, null, $$0.c().a($$2), cgt.o, $$2 != iz.b, false);
                }
                catch (Exception $$4) {
                    a.error("Error while dispensing spawn egg from dispenser at {}", (Object)$$0.c(), (Object)$$4);
                    return dlt.l;
                }
                $$1.h(1);
                $$0.b().a(null, etk.t, $$0.c());
                return $$1;
            }
        };
        for (dna $$1 : dna.a()) {
            eby.a($$1, $$0);
        }
        eby.a(dlx.wS, new lf(){

            @Override
            public dlt a(ld $$0, dlt $$12) {
                Consumer<cyy> $$5;
                iz $$2 = $$0.d().c(eby.b);
                is $$3 = $$0.c().a($$2);
                axf $$4 = $$0.b();
                cyy $$6 = cgu.h.a($$4, $$5 = cgu.a($$1 -> $$1.v($$2.p()), (dwo)$$4, $$12, null), $$3, cgt.o, false, false);
                if ($$6 != null) {
                    $$12.h(1);
                }
                return $$12;
            }
        });
        eby.a(dlx.ft, new lj(){

            @Override
            public dlt a(ld $$02, dlt $$1) {
                is $$2 = $$02.c().a($$02.d().c(eby.b));
                List<cuo> $$3 = $$02.b().a(cuo.class, new fth($$2), (? super T $$0) -> $$0.cb() && !$$0.gP());
                for (cuo $$4 : $$3) {
                    cic $$5;
                    if (!$$4.hn() || ($$5 = $$4.a_(499)) == null || !$$5.a($$1)) continue;
                    $$1.h(1);
                    this.a(true);
                    return $$1;
                }
                return super.a($$02, $$1);
            }
        });
        eby.a(dlx.pr, new le(cgu.aN));
        eby.a(dlx.pt, new le(cgu.bx));
        eby.a(dlx.pv, new le(cgu.o));
        eby.a(dlx.px, new le(cgu.ay));
        eby.a(dlx.pD, new le(cgu.J));
        eby.a(dlx.pz, new le(cgu.c));
        eby.a(dlx.pB, new le(cgu.z));
        eby.a(dlx.pH, new le(cgu.aF));
        eby.a(dlx.pF, new le(cgu.aS));
        eby.a(dlx.pJ, new le(cgu.l));
        eby.a(dlx.ps, new le(cgu.aO));
        eby.a(dlx.pu, new le(cgu.by));
        eby.a(dlx.pw, new le(cgu.p));
        eby.a(dlx.py, new le(cgu.az));
        eby.a(dlx.pE, new le(cgu.K));
        eby.a(dlx.pA, new le(cgu.d));
        eby.a(dlx.pC, new le(cgu.A));
        eby.a(dlx.pI, new le(cgu.aG));
        eby.a(dlx.pG, new le(cgu.aT));
        eby.a(dlx.pK, new le(cgu.k));
        lf $$2 = new lf(){
            private final lf c = new lf();

            @Override
            public dlt a(ld $$0, dlt $$1) {
                dkp $$2 = (dkp)((Object)$$1.h());
                is $$3 = $$0.c().a($$0.d().c(eby.b));
                axf $$4 = $$0.b();
                if ($$2.a(null, (dwo)$$4, $$3, null)) {
                    $$2.a(null, (dwo)$$4, $$1, $$3);
                    return this.a($$0, $$1, new dlt(dlx.sk));
                }
                return this.c.dispense($$0, $$1);
            }
        };
        eby.a(dlx.sm, $$2);
        eby.a(dlx.sl, $$2);
        eby.a(dlx.sn, $$2);
        eby.a(dlx.ss, $$2);
        eby.a(dlx.st, $$2);
        eby.a(dlx.sr, $$2);
        eby.a(dlx.su, $$2);
        eby.a(dlx.sv, $$2);
        eby.a(dlx.sw, $$2);
        eby.a(dlx.sk, new lf(){

            /*
             * WARNING - void declaration
             */
            @Override
            public dlt a(ld $$0, dlt $$1) {
                void $$9;
                dlt $$7;
                is $$3;
                axf $$2 = $$0.b();
                eoh $$4 = $$2.a_($$3 = $$0.c().a($$0.d().c(eby.b)));
                dzq $$5 = $$4.b();
                if ($$5 instanceof dzy) {
                    dzy $$6 = (dzy)((Object)$$5);
                    $$7 = $$6.a(null, $$2, $$3, $$4);
                    if ($$7.f()) {
                        return super.a($$0, $$1);
                    }
                } else {
                    return super.a($$0, $$1);
                }
                $$2.a(null, etk.y, $$3);
                dlp $$8 = $$7.h();
                return this.a($$0, $$1, new dlt((dwn)$$9));
            }
        });
        eby.a(dlx.pT, new lj(){

            @Override
            protected dlt a(ld $$02, dlt $$1) {
                axf $$2 = $$02.b();
                this.a(true);
                iz $$3 = $$02.d().c(eby.b);
                is $$4 = $$02.c().a($$3);
                eoh $$5 = $$2.a_($$4);
                if (dzd.a((dwo)$$2, $$4, $$3)) {
                    $$2.c($$4, dzd.a($$2, $$4));
                    $$2.a(null, etk.i, $$4);
                } else if (eag.i($$5) || eah.h($$5) || eai.h($$5)) {
                    $$2.c($$4, (eoh)$$5.b(eox.u, true));
                    $$2.a(null, etk.c, $$4);
                } else if ($$5.b() instanceof eis) {
                    if (eis.a($$2, $$4)) {
                        $$2.a($$4, false);
                    } else {
                        this.a(false);
                    }
                } else {
                    this.a(false);
                }
                if (this.b()) {
                    $$1.a(1, $$2, null, $$0 -> {});
                }
                return $$1;
            }
        });
        eby.a(dlx.tC, new lj(){

            @Override
            protected dlt a(ld $$0, dlt $$1) {
                this.a(true);
                axf $$2 = $$0.b();
                is $$3 = $$0.c().a($$0.d().c(eby.b));
                if (dkd.a($$1, $$2, $$3) || dkd.a($$1, $$2, $$3, null)) {
                    if (!$$2.B_()) {
                        $$2.c(1505, $$3, 15);
                    }
                } else {
                    this.a(false);
                }
                return $$1;
            }
        });
        eby.a(dzs.cu, new lj(){

            @Override
            protected dlt a(ld $$0, dlt $$1) {
                axf $$2 = $$0.b();
                if (!$$2.U().a(eua.ad).booleanValue()) {
                    this.a(false);
                    return $$1;
                }
                is $$3 = $$0.c().a($$0.d().c(eby.b));
                czm $$4 = new czm($$2, (double)$$3.u() + 0.5, $$3.v(), (double)$$3.w() + 0.5, null);
                $$2.b($$4);
                $$2.a(null, $$4.dP(), $$4.dR(), $$4.dV(), bda.CQ, bdb.e, 1.0f, 1.0f);
                $$2.a(null, etk.t, $$3);
                $$1.h(1);
                this.a(true);
                return $$1;
            }
        });
        eby.a(dlx.wy, new lj(){

            @Override
            protected dlt a(ld $$0, dlt $$1) {
                axf $$2 = $$0.b();
                iz $$3 = $$0.d().c(eby.b);
                is $$4 = $$0.c().a($$3);
                if ($$2.A($$4) && ekl.b($$2, $$4, $$1)) {
                    $$2.a($$4, (eoh)dzs.hx.m().b(ehh.e, epn.a($$3)), 3);
                    $$2.a(null, etk.i, $$4);
                    elb $$5 = $$2.c_($$4);
                    if ($$5 instanceof emu) {
                        ekl.a((dwo)$$2, $$4, (emu)$$5);
                    }
                    $$1.h(1);
                    this.a(true);
                } else {
                    this.a(lh.b($$0, $$1));
                }
                return $$1;
            }
        });
        eby.a(dzs.eJ, new lj(){

            @Override
            protected dlt a(ld $$0, dlt $$1) {
                axf $$2 = $$0.b();
                is $$3 = $$0.c().a($$0.d().c(eby.b));
                eam $$4 = (eam)dzs.eJ;
                if ($$2.A($$3) && $$4.a((dwr)$$2, $$3)) {
                    if (!$$2.B_()) {
                        $$2.a($$3, $$4.m(), 3);
                        $$2.a(null, etk.i, $$3);
                    }
                    $$1.h(1);
                    this.a(true);
                } else {
                    this.a(lh.b($$0, $$1));
                }
                return $$1;
            }
        });
        eby.a(dzs.lL.h(), new lm());
        for (dkr $$3 : dkr.values()) {
            eby.a(ehd.a($$3).h(), new lm());
        }
        eby.a(dlx.uo.h(), new lj(){

            private dlt b(ld $$0, dlt $$1, dlt $$2) {
                $$0.b().a(null, etk.y, $$0.c());
                return this.a($$0, $$1, $$2);
            }

            @Override
            public dlt a(ld $$02, dlt $$1) {
                this.a(false);
                axf $$2 = $$02.b();
                is $$3 = $$02.c().a($$02.d().c(eby.b));
                eoh $$4 = $$2.a_($$3);
                if ($$4.a(bdp.aU, (eog.a $$0) -> $$0.b(dzk.c) && $$0.b() instanceof dzk) && $$4.c(dzk.c) >= 5) {
                    ((dzk)$$4.b()).a((dwo)$$2, $$4, $$3, null, eky.b.b);
                    this.a(true);
                    return this.b($$02, $$1, new dlt(dlx.zi));
                }
                if ($$2.b_($$3).a(bdv.a)) {
                    this.a(true);
                    return this.b($$02, $$1, dnr.a(dlx.up, dns.a));
                }
                return super.a($$02, $$1);
            }
        });
        eby.a(dlx.gd, new lj(){

            @Override
            public dlt a(ld $$0, dlt $$1) {
                iz $$2 = $$0.d().c(eby.b);
                is $$3 = $$0.c().a($$2);
                axf $$4 = $$0.b();
                eoh $$5 = $$4.a_($$3);
                this.a(true);
                if ($$5.a(dzs.ql)) {
                    if ($$5.c(egh.d) != 4) {
                        egh.a(null, (dwo)$$4, $$3, $$5);
                        $$1.h(1);
                    } else {
                        this.a(false);
                    }
                    return $$1;
                }
                return super.a($$0, $$1);
            }
        });
        eby.a(dlx.tZ.h(), new ll());
        eby.a(dlx.Aa.h(), new lj(){

            @Override
            protected dlt a(ld $$02, dlt $$1) {
                is $$3;
                axf $$2 = $$02.b();
                List<cgk> $$4 = $$2.a(cto.class, new fth($$3 = $$02.c().a($$02.d().c(eby.b))), cgs.f);
                if ($$4.isEmpty()) {
                    this.a(false);
                    return $$1;
                }
                for (cto cto2 : $$4) {
                    if (!cto2.a((cgk)null, $$1)) continue;
                    $$1.a(16, $$2, null, $$0 -> {});
                    return $$1;
                }
                this.a(false);
                return $$1;
            }
        });
        eby.a(dlx.zf, new lj(){

            @Override
            public dlt a(ld $$0, dlt $$1) {
                is $$2 = $$0.c().a($$0.d().c(eby.b));
                axf $$3 = $$0.b();
                eoh $$4 = $$3.a_($$2);
                Optional<eoh> $$5 = dlk.a($$4);
                if ($$5.isPresent()) {
                    $$3.c($$2, $$5.get());
                    $$3.c(3003, $$2, 0);
                    $$1.h(1);
                    this.a(true);
                    return $$1;
                }
                return super.a($$0, $$1);
            }
        });
        eby.a(dlx.up, new lf(){
            private final lf c = new lf();

            @Override
            public dlt a(ld $$0, dlt $$1) {
                dnr $$2 = $$1.a(ki.Y, dnr.a);
                if (!$$2.a(dns.a)) {
                    return this.c.dispense($$0, $$1);
                }
                axf $$3 = $$0.b();
                is $$4 = $$0.c();
                is $$5 = $$0.c().a($$0.d().c(eby.b));
                if ($$3.a_($$5).a(bdp.cz)) {
                    if (!$$3.B_()) {
                        for (int $$6 = 0; $$6 < 5; ++$$6) {
                            $$3.a(ly.aq, (double)$$4.u() + $$3.y.j(), (double)($$4.v() + 1), (double)$$4.w() + $$3.y.j(), 1, 0.0, 0.0, 0.0, 1.0);
                        }
                    }
                    $$3.a(null, $$4, bda.cN, bdb.e, 1.0f, 1.0f);
                    $$3.a(null, etk.z, $$4);
                    $$3.c($$5, dzs.uh.m());
                    return this.a($$0, $$1, new dlt(dlx.uo));
                }
                return this.c.dispense($$0, $$1);
            }
        });
        eby.a(dlx.pi, new li(cgu.aJ));
        eby.a(dlx.pj, new li(cgu.B));
        eby.a(dlx.pk, new li(cgu.ag));
        eby.a(dlx.pl, new li(cgu.bF));
        eby.a(dlx.pm, new li(cgu.ap));
        eby.a(dlx.xb, new li(cgu.F));
    }
}

