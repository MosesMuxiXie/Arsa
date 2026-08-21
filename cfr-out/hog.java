/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class hog {
    private final gfj a;
    private final hif b;
    private final Map<is, ipm> c = new HashMap<is, ipm>();

    public hog(gfj $$0, hif $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public void a(int $$0, is $$1, int $$2) {
        switch ($$0) {
            case 1023: 
            case 1028: 
            case 1038: {
                ger $$3 = this.a.i.p();
                if (!$$3.i()) break;
                ftm $$4 = ftm.b($$1).d($$3.b()).d();
                ftm $$5 = $$3.b().e($$4.c(2.0));
                if ($$0 == 1023) {
                    this.b.a($$5.g, $$5.h, $$5.i, bda.Ga, bdb.f, 1.0f, 1.0f, false);
                    break;
                }
                if ($$0 == 1038) {
                    this.b.a($$5.g, $$5.h, $$5.i, bda.ke, bdb.f, 1.0f, 1.0f, false);
                    break;
                }
                this.b.a($$5.g, $$5.h, $$5.i, bda.jJ, bdb.f, 5.0f, 1.0f, false);
            }
        }
    }

    public void b(int $$0, is $$12, int $$2) {
        bgr $$3 = this.b.y;
        switch ($$0) {
            case 1035: {
                this.b.a($$12, bda.dd, bdb.e, 1.0f, 1.0f, false);
                break;
            }
            case 1033: {
                this.b.a($$12, bda.fH, bdb.e, 1.0f, 1.0f, false);
                break;
            }
            case 1034: {
                this.b.a($$12, bda.fG, bdb.e, 1.0f, 1.0f, false);
                break;
            }
            case 1032: {
                this.a.ap().a(iph.b(bda.xu, $$3.i() * 0.4f + 0.8f, 0.25f));
                break;
            }
            case 1001: {
                this.b.a($$12, bda.is, bdb.e, 1.0f, 1.2f, false);
                break;
            }
            case 1000: {
                this.b.a($$12, bda.ir, bdb.e, 1.0f, 1.0f, false);
                break;
            }
            case 1049: {
                this.b.a($$12, bda.hl, bdb.e, 1.0f, 1.0f, false);
                break;
            }
            case 1050: {
                this.b.a($$12, bda.hm, bdb.e, 1.0f, 1.0f, false);
                break;
            }
            case 1004: {
                this.b.a($$12, bda.kE, bdb.g, 1.0f, 1.2f, false);
                break;
            }
            case 1002: {
                this.b.a($$12, bda.it, bdb.e, 1.0f, 1.2f, false);
                break;
            }
            case 1051: {
                this.b.a($$12, bda.FK, bdb.e, 0.5f, 0.4f / (this.b.G_().i() * 0.4f + 0.8f), false);
                break;
            }
            case 2010: {
                this.a($$2, $$12, $$3, ly.aj);
                break;
            }
            case 2000: {
                this.a($$2, $$12, $$3, ly.ai);
                break;
            }
            case 2003: {
                double $$4 = (double)$$12.u() + 0.5;
                double $$5 = $$12.v();
                double $$6 = (double)$$12.w() + 0.5;
                for (int $$7 = 0; $$7 < 8; ++$$7) {
                    this.b.a(new lu(ly.V, new dlt(dlx.uw)), $$4, $$5, $$6, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
                }
                for (double $$8 = 0.0; $$8 < Math.PI * 2; $$8 += 0.15707963267948966) {
                    this.b.a(ly.ag, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -5.0, 0.0, Math.sin($$8) * -5.0);
                    this.b.a(ly.ag, $$4 + Math.cos($$8) * 5.0, $$5 - 0.4, $$6 + Math.sin($$8) * 5.0, Math.cos($$8) * -7.0, 0.0, Math.sin($$8) * -7.0);
                }
                break;
            }
            case 2002: 
            case 2007: {
                ftm $$9 = ftm.c($$12);
                for (int $$10 = 0; $$10 < 8; ++$$10) {
                    this.b.a(new lu(ly.V, new dlt(dlx.xD)), $$9.g, $$9.h, $$9.i, $$3.k() * 0.15, $$3.j() * 0.2, $$3.k() * 0.15);
                }
                float $$11 = (float)($$2 >> 16 & 0xFF) / 255.0f;
                float $$122 = (float)($$2 >> 8 & 0xFF) / 255.0f;
                float $$13 = (float)($$2 >> 0 & 0xFF) / 255.0f;
                lx<me> $$14 = $$0 == 2007 ? ly.U : ly.q;
                for (int $$15 = 0; $$15 < 100; ++$$15) {
                    double $$16 = $$3.j() * 4.0;
                    double $$17 = $$3.j() * Math.PI * 2.0;
                    double $$18 = Math.cos($$17) * $$16;
                    double $$19 = 0.01 + $$3.j() * 0.5;
                    double $$20 = Math.sin($$17) * $$16;
                    float $$21 = 0.75f + $$3.i() * 0.25f;
                    me $$22 = me.a($$14, $$11 * $$21, $$122 * $$21, $$13 * $$21, (float)$$16);
                    this.b.a($$22, $$9.g + $$18 * 0.1, $$9.h + 0.3, $$9.i + $$20 * 0.1, $$18, $$19, $$20);
                }
                this.b.a($$12, bda.Ch, bdb.g, 1.0f, $$3.i() * 0.1f + 0.9f, false);
                break;
            }
            case 2001: {
                eoh $$23 = dzq.a($$2);
                if (!$$23.l()) {
                    ehs $$24 = $$23.A();
                    this.b.a($$12, $$24.c(), bdb.e, ($$24.a() + 1.0f) / 2.0f, $$24.b() * 0.8f, false);
                }
                this.b.b($$12, $$23);
                break;
            }
            case 3008: {
                eoh $$25 = dzq.a($$2);
                dzq $$13 = $$25.b();
                if ($$13 instanceof dzw) {
                    dzw $$26 = (dzw)$$13;
                    this.b.a($$12, $$26.d(), bdb.h, 1.0f, 1.0f, false);
                }
                this.b.b($$12, $$25);
                break;
            }
            case 2004: {
                for (int $$27 = 0; $$27 < 20; ++$$27) {
                    double $$28 = (double)$$12.u() + 0.5 + ($$3.j() - 0.5) * 2.0;
                    double $$29 = (double)$$12.v() + 0.5 + ($$3.j() - 0.5) * 2.0;
                    double $$30 = (double)$$12.w() + 0.5 + ($$3.j() - 0.5) * 2.0;
                    this.b.a(ly.ai, $$28, $$29, $$30, 0.0, 0.0, 0.0);
                    this.b.a(ly.G, $$28, $$29, $$30, 0.0, 0.0, 0.0);
                }
                break;
            }
            case 3011: {
                enh.a(this.b, $$12, $$3, enh.a.a((int)$$2).c);
                break;
            }
            case 3012: {
                this.b.a($$12, bda.nW, bdb.e, 1.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, true);
                enh.a(this.b, $$12, $$3, enh.a.a((int)$$2).c);
                break;
            }
            case 3021: {
                this.b.a($$12, bda.nY, bdb.e, 1.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, true);
                enh.a(this.b, $$12, $$3, enh.a.a((int)$$2).c);
                break;
            }
            case 3013: {
                this.b.a($$12, bda.oa, bdb.e, 1.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, true);
                enh.a(this.b, $$12, $$3, $$2, ly.bc);
                break;
            }
            case 3019: {
                this.b.a($$12, bda.oa, bdb.e, 1.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, true);
                enh.a(this.b, $$12, $$3, $$2, ly.bd);
                break;
            }
            case 3020: {
                this.b.a($$12, bda.ob, bdb.e, $$2 == 0 ? 0.3f : 1.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, true);
                enh.a(this.b, $$12, $$3, 0, ly.bd);
                enh.a((dwo)this.b, $$12, $$3);
                break;
            }
            case 3014: {
                this.b.a($$12, bda.og, bdb.e, 1.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, true);
                enh.b(this.b, $$12, $$3);
                break;
            }
            case 3017: {
                enh.b(this.b, $$12, $$3);
                break;
            }
            case 3015: {
                elb $$28 = this.b.c_($$12);
                if (!($$28 instanceof enn)) break;
                enn $$31 = (enn)$$28;
                enn.a.a((dwo)this.b, $$31.aD_(), $$31.o(), $$31.c(), $$2 == 0 ? ly.aN : ly.O);
                this.b.a($$12, bda.DS, bdb.e, 1.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, true);
                break;
            }
            case 3016: {
                enn.a.a((dwo)this.b, $$12, $$2 == 0 ? ly.aN : ly.O);
                this.b.a($$12, bda.DW, bdb.e, 1.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, true);
                break;
            }
            case 3018: {
                for (int $$32 = 0; $$32 < 10; ++$$32) {
                    double $$33 = $$3.k() * 0.02;
                    double $$34 = $$3.k() * 0.02;
                    double $$35 = $$3.k() * 0.02;
                    this.b.a(ly.af, (double)$$12.u() + $$3.j(), (double)$$12.v() + $$3.j(), (double)$$12.w() + $$3.j(), $$33, $$34, $$35);
                }
                this.b.a($$12, bda.fL, bdb.e, 1.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, true);
                break;
            }
            case 1505: {
                dkd.a((dwp)this.b, $$12, $$2);
                this.b.a($$12, bda.cJ, bdb.e, 1.0f, 1.0f, false);
                break;
            }
            case 2011: {
                bgm.a((dwp)this.b, $$12, $$2, (lw)ly.R);
                break;
            }
            case 2012: {
                bgm.a((dwp)this.b, $$12, $$2, (lw)ly.R);
                break;
            }
            case 3009: {
                bgm.a((dwo)this.b, $$12, ly.ba, ccn.a(3, 6));
                break;
            }
            case 3002: {
                if ($$2 >= 0 && $$2 < iz.a.d.length) {
                    bgm.a(iz.a.d[$$2], this.b, $$12, 0.125, ly.aX, ccn.a(10, 19));
                    break;
                }
                bgm.a((dwo)this.b, $$12, ly.aX, ccn.a(3, 5));
                break;
            }
            case 2013: {
                bgm.a(this.b, $$12, $$2);
                break;
            }
            case 3006: {
                int $$36 = $$2 >> 6;
                if ($$36 > 0) {
                    if ($$3.i() < 0.3f + (float)$$36 * 0.1f) {
                        float $$37 = 0.15f + 0.02f * (float)$$36 * (float)$$36 * $$3.i();
                        float $$38 = 0.4f + 0.3f * (float)$$36 * $$3.i();
                        this.b.a($$12, bda.yP, bdb.e, $$37, $$38, false);
                    }
                    byte $$39 = (byte)($$2 & 0x3F);
                    ccn $$40 = ccn.a(0, $$36);
                    float $$41 = 0.005f;
                    Supplier<ftm> $$42 = () -> new ftm(bgj.a($$3, (double)-0.005f, (double)0.005f), bgj.a($$3, (double)-0.005f, (double)0.005f), bgj.a($$3, (double)-0.005f, (double)0.005f));
                    if ($$39 == 0) {
                        for (iz $$43 : iz.values()) {
                            float $$44 = $$43 == iz.a ? (float)Math.PI : 0.0f;
                            double $$45 = $$43.o() == iz.a.b ? 0.65 : 0.57;
                            bgm.a(this.b, $$12, new mb($$44), $$40, $$43, $$42, $$45);
                        }
                    } else {
                        for (iz $$46 : eey.a($$39)) {
                            float $$47 = $$46 == iz.b ? (float)Math.PI : 0.0f;
                            double $$48 = 0.35;
                            bgm.a(this.b, $$12, new mb($$47), $$40, $$46, $$42, 0.35);
                        }
                    }
                } else {
                    this.b.a($$12, bda.yP, bdb.e, 1.0f, 1.0f, false);
                    boolean $$49 = this.b.a_($$12).m(this.b, $$12);
                    int $$50 = $$49 ? 40 : 20;
                    float $$51 = $$49 ? 0.45f : 0.25f;
                    float $$52 = 0.07f;
                    for (int $$53 = 0; $$53 < $$50; ++$$53) {
                        float $$54 = 2.0f * $$3.i() - 1.0f;
                        float $$55 = 2.0f * $$3.i() - 1.0f;
                        float $$56 = 2.0f * $$3.i() - 1.0f;
                        this.b.a(ly.N, (double)$$12.u() + 0.5 + (double)($$54 * $$51), (double)$$12.v() + 0.5 + (double)($$55 * $$51), (double)$$12.w() + 0.5 + (double)($$56 * $$51), (double)($$54 * 0.07f), (double)($$55 * 0.07f), $$56 * 0.07f);
                    }
                }
                break;
            }
            case 3007: {
                boolean $$59;
                for (int $$57 = 0; $$57 < 10; ++$$57) {
                    this.b.a(new mc($$57 * 5), (double)$$12.u() + 0.5, (double)$$12.v() + egu.e, (double)$$12.w() + 0.5, 0.0, 0.0, 0.0);
                }
                eoh $$58 = this.b.a_($$12);
                boolean bl2 = $$59 = $$58.b(eox.I) && $$58.c(eox.I) != false;
                if ($$59) break;
                this.b.a((double)$$12.u() + 0.5, (double)$$12.v() + egu.e, (double)$$12.w() + 0.5, bda.zm, bdb.e, 2.0f, 0.6f + this.b.y.i() * 0.4f, false);
                break;
            }
            case 3003: {
                bgm.a((dwo)this.b, $$12, ly.aV, ccn.a(3, 5));
                this.b.a($$12, bda.oA, bdb.e, 1.0f, 1.0f, false);
                break;
            }
            case 3004: {
                bgm.a((dwo)this.b, $$12, ly.aW, ccn.a(3, 5));
                break;
            }
            case 3005: {
                bgm.a((dwo)this.b, $$12, ly.aY, ccn.a(3, 5));
                break;
            }
            case 2008: {
                this.b.a(ly.x, (double)$$12.u() + 0.5, (double)$$12.v() + 0.5, (double)$$12.w() + 0.5, 0.0, 0.0, 0.0);
                break;
            }
            case 1500: {
                ebc.a((dwo)this.b, $$12, $$2 > 0);
                break;
            }
            case 1504: {
                efq.a((dwo)this.b, $$12, this.b.a_($$12));
                break;
            }
            case 1501: {
                this.b.a($$12, bda.pU, bdb.e, 0.5f, 2.6f + ($$3.i() - $$3.i()) * 0.8f, false);
                for (int $$60 = 0; $$60 < 8; ++$$60) {
                    this.b.a(ly.ab, (double)$$12.u() + $$3.j(), (double)$$12.v() + 1.2, (double)$$12.w() + $$3.j(), 0.0, 0.0, 0.0);
                }
                break;
            }
            case 1502: {
                this.b.a($$12, bda.yg, bdb.e, 0.5f, 2.6f + ($$3.i() - $$3.i()) * 0.8f, false);
                for (int $$61 = 0; $$61 < 5; ++$$61) {
                    double $$62 = (double)$$12.u() + $$3.j() * 0.6 + 0.2;
                    double $$63 = (double)$$12.v() + $$3.j() * 0.6 + 0.2;
                    double $$64 = (double)$$12.w() + $$3.j() * 0.6 + 0.2;
                    this.b.a(ly.ai, $$62, $$63, $$64, 0.0, 0.0, 0.0);
                }
                break;
            }
            case 1503: {
                this.b.a($$12, bda.kd, bdb.e, 1.0f, 1.0f, false);
                for (int $$65 = 0; $$65 < 16; ++$$65) {
                    double $$66 = (double)$$12.u() + (5.0 + $$3.j() * 6.0) / 16.0;
                    double $$67 = (double)$$12.v() + 0.8125;
                    double $$68 = (double)$$12.w() + (5.0 + $$3.j() * 6.0) / 16.0;
                    this.b.a(ly.ai, $$66, $$67, $$68, 0.0, 0.0, 0.0);
                }
                break;
            }
            case 2006: {
                for (int $$69 = 0; $$69 < 200; ++$$69) {
                    float $$70 = $$3.i() * 4.0f;
                    float $$71 = $$3.i() * ((float)Math.PI * 2);
                    double $$72 = bgj.b((double)$$71) * $$70;
                    double $$73 = 0.01 + $$3.j() * 0.5;
                    double $$74 = bgj.a((double)$$71) * $$70;
                    this.b.a(lz.a(ly.i, $$70), (double)$$12.u() + $$72 * 0.1, (double)$$12.v() + 0.3, (double)$$12.w() + $$74 * 0.1, $$72, $$73, $$74);
                }
                if ($$2 != 1) break;
                this.b.a($$12, bda.jK, bdb.f, 1.0f, $$3.i() * 0.1f + 0.9f, false);
                break;
            }
            case 2009: {
                for (int $$75 = 0; $$75 < 8; ++$$75) {
                    this.b.a(ly.e, (double)$$12.u() + $$3.j(), (double)$$12.v() + 1.2, (double)$$12.w() + $$3.j(), 0.0, 0.0, 0.0);
                }
                break;
            }
            case 1009: {
                if ($$2 == 0) {
                    this.b.a($$12, bda.kI, bdb.e, 0.5f, 2.6f + ($$3.i() - $$3.i()) * 0.8f, false);
                    break;
                }
                if ($$2 != 1) break;
                this.b.a($$12, bda.lT, bdb.e, 0.7f, 1.6f + ($$3.i() - $$3.i()) * 0.4f, false);
                break;
            }
            case 1029: {
                this.b.a($$12, bda.V, bdb.e, 1.0f, $$3.i() * 0.1f + 0.9f, false);
                break;
            }
            case 1030: {
                this.b.a($$12, bda.ab, bdb.e, 1.0f, $$3.i() * 0.1f + 0.9f, false);
                break;
            }
            case 1044: {
                this.b.a($$12, bda.BB, bdb.e, 1.0f, this.b.y.i() * 0.1f + 0.9f, false);
                break;
            }
            case 1031: {
                this.b.a($$12, bda.Y, bdb.e, 0.3f, this.b.y.i() * 0.1f + 0.9f, false);
                break;
            }
            case 1039: {
                this.b.a($$12, bda.wh, bdb.f, 0.3f, this.b.y.i() * 0.1f + 0.9f, false);
                break;
            }
            case 1010: {
                this.b.J_().f(mj.bj).c($$2).ifPresent($$1 -> this.a((jd<dlz>)$$1, $$12));
                break;
            }
            case 1011: {
                this.b($$12);
                break;
            }
            case 1015: {
                this.b.a($$12, bda.md, bdb.f, 10.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.b.a($$12, bda.jO, bdb.f, 10.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.b.a($$12, bda.mc, bdb.f, 10.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1019: {
                this.b.a($$12, bda.GH, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1022: {
                this.b.a($$12, bda.FS, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1021: {
                this.b.a($$12, bda.GJ, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1020: {
                this.b.a($$12, bda.GI, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1018: {
                this.b.a($$12, bda.cw, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1024: {
                this.b.a($$12, bda.FV, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1026: {
                this.b.a($$12, bda.GT, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1027: {
                this.b.a($$12, bda.Hm, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1040: {
                this.b.a($$12, bda.GK, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1041: {
                this.b.a($$12, bda.oZ, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1025: {
                this.b.a($$12, bda.bV, bdb.g, 0.05f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
                break;
            }
            case 1042: {
                this.b.a($$12, bda.ne, bdb.e, 1.0f, this.b.y.i() * 0.1f + 0.9f, false);
                break;
            }
            case 1043: {
                this.b.a($$12, bda.cK, bdb.e, 1.0f, this.b.y.i() * 0.1f + 0.9f, false);
                break;
            }
            case 3000: {
                this.b.a(ly.w, true, (double)$$12.u() + 0.5, (double)$$12.v() + 0.5, (double)$$12.w() + 0.5, 0.0, 0.0, 0.0);
                this.b.a($$12, bda.kc, bdb.e, 10.0f, (1.0f + (this.b.y.i() - this.b.y.i()) * 0.2f) * 0.7f, false);
                break;
            }
            case 3001: {
                this.b.a($$12, bda.jM, bdb.f, 64.0f, 0.8f + this.b.y.i() * 0.3f, false);
                break;
            }
            case 1045: {
                this.b.a($$12, bda.je, bdb.e, 2.0f, this.b.y.i() * 0.1f + 0.9f, false);
                break;
            }
            case 1046: {
                this.b.a($$12, bda.jh, bdb.e, 2.0f, this.b.y.i() * 0.1f + 0.9f, false);
                break;
            }
            case 1047: {
                this.b.a($$12, bda.ji, bdb.e, 2.0f, this.b.y.i() * 0.1f + 0.9f, false);
                break;
            }
            case 1048: {
                this.b.a($$12, bda.Aj, bdb.f, 2.0f, ($$3.i() - $$3.i()) * 0.2f + 1.0f, false);
            }
        }
    }

    private void a(int $$0, is $$1, bgr $$2, md $$3) {
        iz $$4 = iz.a($$0);
        int $$5 = $$4.j();
        int $$6 = $$4.k();
        int $$7 = $$4.l();
        for (int $$8 = 0; $$8 < 10; ++$$8) {
            double $$9 = $$2.j() * 0.2 + 0.01;
            double $$10 = (double)$$1.u() + (double)$$5 * 0.6 + 0.5 + (double)$$5 * 0.01 + ($$2.j() - 0.5) * (double)$$7 * 0.5;
            double $$11 = (double)$$1.v() + (double)$$6 * 0.6 + 0.5 + (double)$$6 * 0.01 + ($$2.j() - 0.5) * (double)$$6 * 0.5;
            double $$12 = (double)$$1.w() + (double)$$7 * 0.6 + 0.5 + (double)$$7 * 0.01 + ($$2.j() - 0.5) * (double)$$5 * 0.5;
            double $$13 = (double)$$5 * $$9 + $$2.k() * 0.01;
            double $$14 = (double)$$6 * $$9 + $$2.k() * 0.01;
            double $$15 = (double)$$7 * $$9 + $$2.k() * 0.01;
            this.b.a($$3, $$10, $$11, $$12, $$13, $$14, $$15);
        }
    }

    private void a(jd<dlz> $$0, is $$1) {
        this.a($$1);
        dlz $$2 = $$0.a();
        bcz $$3 = $$2.b().a();
        iph $$4 = iph.a($$3, ftm.b($$1));
        this.c.put($$1, $$4);
        this.a.ap().a($$4);
        this.a.j.a($$2.c());
        this.a(this.b, $$1, true);
    }

    private void a(is $$0) {
        ipm $$1 = this.c.remove($$0);
        if ($$1 != null) {
            this.a.ap().b($$1);
        }
    }

    private void b(is $$0) {
        this.a($$0);
        this.a(this.b, $$0, false);
    }

    private void a(dwo $$0, is $$1, boolean $$2) {
        List<chl> $$3 = $$0.a(chl.class, new fth($$1).g(3.0));
        for (chl $$4 : $$3) {
            $$4.a($$1, $$2);
        }
    }
}

