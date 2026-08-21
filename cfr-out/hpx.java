/*
 * Decompiled with CFR 0.152.
 */
public class hpx {
    private static final float a = 0.8888889f;
    private final ilp b;
    private final ilp c;
    private final ilp d;
    private final ilp e;
    private final ilp f;

    public hpx(inu $$0) {
        this.b = $$0.a(inx.c);
        this.c = $$0.a(inx.d);
        this.d = $$0.a(inx.e);
        this.e = $$0.a(inx.f);
        this.f = $$0.a(inx.g);
    }

    private static boolean a(flb $$0, flb $$1) {
        return $$1.a().a($$0.a());
    }

    private static boolean a(iz $$0, float $$1, eoh $$2) {
        fug $$3 = $$2.a($$0.g());
        if ($$3 == fud.a()) {
            return false;
        }
        if ($$3 == fud.b()) {
            boolean $$4 = $$1 == 1.0f;
            return $$0 != iz.b || $$4;
        }
        fug $$5 = fud.a(0.0, 0.0, 0.0, 1.0, $$1, 1.0);
        return fud.a($$5, $$3, $$0);
    }

    private static boolean b(iz $$0, float $$1, eoh $$2) {
        return hpx.a($$0, $$1, $$2);
    }

    private static boolean a(eoh $$0, iz $$1) {
        return hpx.a($$1.g(), 1.0f, $$0);
    }

    public static boolean a(flb $$0, eoh $$1, iz $$2, flb $$3) {
        return !hpx.a($$1, $$2) && !hpx.a($$0, $$3);
    }

    /*
     * WARNING - void declaration
     */
    public void a(dvq $$0, is $$1, fzp $$2, eoh $$3, flb $$4) {
        float $$52;
        float $$47;
        float $$46;
        float $$45;
        float $$44;
        boolean $$5 = $$4.a(bdv.b);
        ilp $$6 = $$5 ? this.b : this.d;
        ilp $$7 = $$5 ? this.c : this.e;
        int $$8 = $$5 ? 0xFFFFFF : hns.d($$0, $$1);
        float $$9 = (float)($$8 >> 16 & 0xFF) / 255.0f;
        float $$10 = (float)($$8 >> 8 & 0xFF) / 255.0f;
        float $$11 = (float)($$8 & 0xFF) / 255.0f;
        eoh $$12 = $$0.a_($$1.a(iz.a));
        flb $$13 = $$12.y();
        eoh $$14 = $$0.a_($$1.a(iz.b));
        flb $$15 = $$14.y();
        eoh $$16 = $$0.a_($$1.a(iz.c));
        flb $$17 = $$16.y();
        eoh $$18 = $$0.a_($$1.a(iz.d));
        flb $$19 = $$18.y();
        eoh $$20 = $$0.a_($$1.a(iz.e));
        flb $$21 = $$20.y();
        eoh $$22 = $$0.a_($$1.a(iz.f));
        flb $$23 = $$22.y();
        boolean $$24 = !hpx.a($$4, $$15);
        boolean $$25 = hpx.a($$4, $$3, iz.a, $$13) && !hpx.b(iz.a, 0.8888889f, $$12);
        boolean $$26 = hpx.a($$4, $$3, iz.c, $$17);
        boolean $$27 = hpx.a($$4, $$3, iz.d, $$19);
        boolean $$28 = hpx.a($$4, $$3, iz.e, $$21);
        boolean $$29 = hpx.a($$4, $$3, iz.f, $$23);
        if (!($$24 || $$25 || $$29 || $$28 || $$26 || $$27)) {
            return;
        }
        float $$30 = $$0.a(iz.a, true);
        float $$31 = $$0.a(iz.b, true);
        float $$32 = $$0.a(iz.c, true);
        float $$33 = $$0.a(iz.e, true);
        fla $$34 = $$4.a();
        float $$35 = this.a($$0, $$34, $$1, $$3, $$4);
        if ($$35 >= 1.0f) {
            float $$36 = 1.0f;
            float $$37 = 1.0f;
            float $$38 = 1.0f;
            float $$39 = 1.0f;
        } else {
            float $$40 = this.a($$0, $$34, $$1.f(), $$16, $$17);
            float $$41 = this.a($$0, $$34, $$1.g(), $$18, $$19);
            float $$42 = this.a($$0, $$34, $$1.i(), $$22, $$23);
            float $$43 = this.a($$0, $$34, $$1.h(), $$20, $$21);
            $$44 = this.a($$0, $$34, $$35, $$40, $$42, $$1.a(iz.c).a(iz.f));
            $$45 = this.a($$0, $$34, $$35, $$40, $$43, $$1.a(iz.c).a(iz.e));
            $$46 = this.a($$0, $$34, $$35, $$41, $$42, $$1.a(iz.d).a(iz.f));
            $$47 = this.a($$0, $$34, $$35, $$41, $$43, $$1.a(iz.d).a(iz.e));
        }
        float $$48 = $$1.u() & 0xF;
        float $$49 = $$1.v() & 0xF;
        float $$50 = $$1.w() & 0xF;
        float $$51 = 0.001f;
        float f2 = $$52 = $$25 ? 0.001f : 0.0f;
        if ($$24 && !hpx.b(iz.b, Math.min(Math.min($$45, $$47), Math.min($$46, $$44)), $$14)) {
            float $$73;
            float $$72;
            float $$71;
            float $$70;
            float $$69;
            float $$68;
            float $$67;
            float $$66;
            $$45 -= 0.001f;
            $$47 -= 0.001f;
            $$46 -= 0.001f;
            $$44 -= 0.001f;
            ftm $$53 = $$4.c($$0, $$1);
            if ($$53.g == 0.0 && $$53.i == 0.0) {
                float $$54 = $$6.a(0.0f);
                float $$55 = $$6.b(0.0f);
                float $$56 = $$54;
                float $$57 = $$6.b(1.0f);
                float $$58 = $$6.a(1.0f);
                float $$59 = $$57;
                float $$60 = $$58;
                float $$61 = $$55;
            } else {
                float $$62 = (float)bgj.d($$53.i, $$53.g) - 1.5707964f;
                float $$63 = bgj.a((double)$$62) * 0.25f;
                float $$64 = bgj.b((double)$$62) * 0.25f;
                float $$65 = 0.5f;
                $$66 = $$7.a(0.5f + (-$$64 - $$63));
                $$67 = $$7.b(0.5f + (-$$64 + $$63));
                $$68 = $$7.a(0.5f + (-$$64 + $$63));
                $$69 = $$7.b(0.5f + ($$64 + $$63));
                $$70 = $$7.a(0.5f + ($$64 + $$63));
                $$71 = $$7.b(0.5f + ($$64 - $$63));
                $$72 = $$7.a(0.5f + ($$64 - $$63));
                $$73 = $$7.b(0.5f + (-$$64 - $$63));
            }
            int $$74 = this.a($$0, $$1);
            float $$75 = $$31 * $$9;
            float $$76 = $$31 * $$10;
            float $$77 = $$31 * $$11;
            this.a($$2, $$48 + 0.0f, $$49 + $$45, $$50 + 0.0f, $$75, $$76, $$77, $$66, $$67, $$74);
            this.a($$2, $$48 + 0.0f, $$49 + $$47, $$50 + 1.0f, $$75, $$76, $$77, $$68, $$69, $$74);
            this.a($$2, $$48 + 1.0f, $$49 + $$46, $$50 + 1.0f, $$75, $$76, $$77, $$70, $$71, $$74);
            this.a($$2, $$48 + 1.0f, $$49 + $$44, $$50 + 0.0f, $$75, $$76, $$77, $$72, $$73, $$74);
            if ($$4.b($$0, $$1.d())) {
                this.a($$2, $$48 + 0.0f, $$49 + $$45, $$50 + 0.0f, $$75, $$76, $$77, $$66, $$67, $$74);
                this.a($$2, $$48 + 1.0f, $$49 + $$44, $$50 + 0.0f, $$75, $$76, $$77, $$72, $$73, $$74);
                this.a($$2, $$48 + 1.0f, $$49 + $$46, $$50 + 1.0f, $$75, $$76, $$77, $$70, $$71, $$74);
                this.a($$2, $$48 + 0.0f, $$49 + $$47, $$50 + 1.0f, $$75, $$76, $$77, $$68, $$69, $$74);
            }
        }
        if ($$25) {
            float $$78 = $$6.c();
            float $$79 = $$6.d();
            float $$80 = $$6.f();
            float $$81 = $$6.g();
            int $$82 = this.a($$0, $$1.e());
            float $$83 = $$30 * $$9;
            float $$84 = $$30 * $$10;
            float $$85 = $$30 * $$11;
            this.a($$2, $$48, $$49 + $$52, $$50 + 1.0f, $$83, $$84, $$85, $$78, $$81, $$82);
            this.a($$2, $$48, $$49 + $$52, $$50, $$83, $$84, $$85, $$78, $$80, $$82);
            this.a($$2, $$48 + 1.0f, $$49 + $$52, $$50, $$83, $$84, $$85, $$79, $$80, $$82);
            this.a($$2, $$48 + 1.0f, $$49 + $$52, $$50 + 1.0f, $$83, $$84, $$85, $$79, $$81, $$82);
        }
        int $$86 = this.a($$0, $$1);
        for (iz $$87 : iz.c.a) {
            dzq $$118;
            boolean $$115;
            float $$114;
            float $$113;
            float $$112;
            float $$111;
            void $$110;
            float $$109;
            switch ($$87) {
                case c: {
                    void $$88 = $$45;
                    float $$89 = $$44;
                    float $$90 = $$48;
                    float $$91 = $$48 + 1.0f;
                    float $$92 = $$50 + 0.001f;
                    float $$93 = $$50 + 0.001f;
                    boolean $$94 = $$26;
                    break;
                }
                case d: {
                    void $$95 = $$46;
                    void $$96 = $$47;
                    float $$97 = $$48 + 1.0f;
                    float $$98 = $$48;
                    float $$99 = $$50 + 1.0f - 0.001f;
                    float $$100 = $$50 + 1.0f - 0.001f;
                    boolean $$101 = $$27;
                    break;
                }
                case e: {
                    void $$102 = $$47;
                    void $$103 = $$45;
                    float $$104 = $$48 + 0.001f;
                    float $$105 = $$48 + 0.001f;
                    float $$106 = $$50 + 1.0f;
                    float $$107 = $$50;
                    boolean $$108 = $$28;
                    break;
                }
                default: {
                    $$109 = $$44;
                    $$110 = $$46;
                    $$111 = $$48 + 1.0f - 0.001f;
                    $$112 = $$48 + 1.0f - 0.001f;
                    $$113 = $$50;
                    $$114 = $$50 + 1.0f;
                    $$115 = $$29;
                }
            }
            if (!$$115 || hpx.b($$87, Math.max($$109, (float)$$110), $$0.a_($$1.a($$87)))) continue;
            is $$116 = $$1.a($$87);
            ilp $$117 = $$7;
            if (!$$5 && (($$118 = $$0.a_($$116).b()) instanceof edm || $$118 instanceof eei)) {
                $$117 = this.f;
            }
            float $$119 = $$117.a(0.0f);
            float $$120 = $$117.a(0.5f);
            float $$121 = $$117.b((1.0f - $$109) * 0.5f);
            float $$122 = $$117.b((1.0f - $$110) * 0.5f);
            float $$123 = $$117.b(0.5f);
            float $$124 = $$87.o() == iz.a.c ? $$32 : $$33;
            float $$125 = $$31 * $$124 * $$9;
            float $$126 = $$31 * $$124 * $$10;
            float $$127 = $$31 * $$124 * $$11;
            this.a($$2, $$111, $$49 + $$109, $$113, $$125, $$126, $$127, $$119, $$121, $$86);
            this.a($$2, $$112, $$49 + $$110, $$114, $$125, $$126, $$127, $$120, $$122, $$86);
            this.a($$2, $$112, $$49 + $$52, $$114, $$125, $$126, $$127, $$120, $$123, $$86);
            this.a($$2, $$111, $$49 + $$52, $$113, $$125, $$126, $$127, $$119, $$123, $$86);
            if ($$117 == this.f) continue;
            this.a($$2, $$111, $$49 + $$52, $$113, $$125, $$126, $$127, $$119, $$123, $$86);
            this.a($$2, $$112, $$49 + $$52, $$114, $$125, $$126, $$127, $$120, $$123, $$86);
            this.a($$2, $$112, $$49 + $$110, $$114, $$125, $$126, $$127, $$120, $$122, $$86);
            this.a($$2, $$111, $$49 + $$109, $$113, $$125, $$126, $$127, $$119, $$121, $$86);
        }
    }

    private float a(dvq $$0, fla $$1, float $$2, float $$3, float $$4, is $$5) {
        if ($$4 >= 1.0f || $$3 >= 1.0f) {
            return 1.0f;
        }
        float[] $$6 = new float[2];
        if ($$4 > 0.0f || $$3 > 0.0f) {
            float $$7 = this.a($$0, $$1, $$5);
            if ($$7 >= 1.0f) {
                return 1.0f;
            }
            this.a($$6, $$7);
        }
        this.a($$6, $$2);
        this.a($$6, $$4);
        this.a($$6, $$3);
        return $$6[0] / $$6[1];
    }

    private void a(float[] $$0, float $$1) {
        if ($$1 >= 0.8f) {
            $$0[0] = $$0[0] + $$1 * 10.0f;
            $$0[1] = $$0[1] + 10.0f;
        } else if ($$1 >= 0.0f) {
            $$0[0] = $$0[0] + $$1;
            $$0[1] = $$0[1] + 1.0f;
        }
    }

    private float a(dvq $$0, fla $$1, is $$2) {
        eoh $$3 = $$0.a_($$2);
        return this.a($$0, $$1, $$2, $$3, $$3.y());
    }

    private float a(dvq $$0, fla $$1, is $$2, eoh $$3, flb $$4) {
        if ($$1.a($$4.a())) {
            eoh $$5 = $$0.a_($$2.d());
            if ($$1.a($$5.y().a())) {
                return 1.0f;
            }
            return $$4.d();
        }
        if (!$$3.e()) {
            return 0.0f;
        }
        return -1.0f;
    }

    private void a(fzp $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, int $$9) {
        $$0.a($$1, $$2, $$3).a($$4, $$5, $$6, 1.0f).a($$7, $$8).c($$9).b(0.0f, 1.0f, 0.0f);
    }

    private int a(dvq $$0, is $$1) {
        int $$2 = hoh.a($$0, $$1);
        int $$3 = hoh.a($$0, $$1.d());
        int $$4 = $$2 & 0xFF;
        int $$5 = $$3 & 0xFF;
        int $$6 = $$2 >> 16 & 0xFF;
        int $$7 = $$3 >> 16 & 0xFF;
        return ($$4 > $$5 ? $$4 : $$5) | ($$6 > $$7 ? $$6 : $$7) << 16;
    }
}

