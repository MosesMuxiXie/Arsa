/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class fia {
    static final fjn a = fia.a(dzs.L, dzs.M, fnv.bn);
    static final fjn b = fia.a(dzs.O, dzs.P, fnv.bo);
    private static final amo[] c = new amo[]{amo.b("underwater_ruin/warm_1"), amo.b("underwater_ruin/warm_2"), amo.b("underwater_ruin/warm_3"), amo.b("underwater_ruin/warm_4"), amo.b("underwater_ruin/warm_5"), amo.b("underwater_ruin/warm_6"), amo.b("underwater_ruin/warm_7"), amo.b("underwater_ruin/warm_8")};
    private static final amo[] d = new amo[]{amo.b("underwater_ruin/brick_1"), amo.b("underwater_ruin/brick_2"), amo.b("underwater_ruin/brick_3"), amo.b("underwater_ruin/brick_4"), amo.b("underwater_ruin/brick_5"), amo.b("underwater_ruin/brick_6"), amo.b("underwater_ruin/brick_7"), amo.b("underwater_ruin/brick_8")};
    private static final amo[] e = new amo[]{amo.b("underwater_ruin/cracked_1"), amo.b("underwater_ruin/cracked_2"), amo.b("underwater_ruin/cracked_3"), amo.b("underwater_ruin/cracked_4"), amo.b("underwater_ruin/cracked_5"), amo.b("underwater_ruin/cracked_6"), amo.b("underwater_ruin/cracked_7"), amo.b("underwater_ruin/cracked_8")};
    private static final amo[] f = new amo[]{amo.b("underwater_ruin/mossy_1"), amo.b("underwater_ruin/mossy_2"), amo.b("underwater_ruin/mossy_3"), amo.b("underwater_ruin/mossy_4"), amo.b("underwater_ruin/mossy_5"), amo.b("underwater_ruin/mossy_6"), amo.b("underwater_ruin/mossy_7"), amo.b("underwater_ruin/mossy_8")};
    private static final amo[] g = new amo[]{amo.b("underwater_ruin/big_brick_1"), amo.b("underwater_ruin/big_brick_2"), amo.b("underwater_ruin/big_brick_3"), amo.b("underwater_ruin/big_brick_8")};
    private static final amo[] h = new amo[]{amo.b("underwater_ruin/big_mossy_1"), amo.b("underwater_ruin/big_mossy_2"), amo.b("underwater_ruin/big_mossy_3"), amo.b("underwater_ruin/big_mossy_8")};
    private static final amo[] i = new amo[]{amo.b("underwater_ruin/big_cracked_1"), amo.b("underwater_ruin/big_cracked_2"), amo.b("underwater_ruin/big_cracked_3"), amo.b("underwater_ruin/big_cracked_8")};
    private static final amo[] j = new amo[]{amo.b("underwater_ruin/big_warm_4"), amo.b("underwater_ruin/big_warm_5"), amo.b("underwater_ruin/big_warm_6"), amo.b("underwater_ruin/big_warm_7")};

    private static fjn a(dzq $$0, dzq $$1, amt<fof> $$2) {
        return new fiv(new fjj(List.of(new fjf(new fis($$0), fin.b, fjc.b, $$1.m(), new fju($$2)))), cce.a(5));
    }

    private static amo a(bgr $$0) {
        return bhs.a(c, $$0);
    }

    private static amo b(bgr $$0) {
        return bhs.a(j, $$0);
    }

    public static void a(fjr $$0, is $$1, egm $$2, fft $$3, bgr $$4, fib $$5) {
        boolean $$6 = $$4.i() <= $$5.f;
        float $$7 = $$6 ? 0.9f : 0.8f;
        fia.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        if ($$6 && $$4.i() <= $$5.g) {
            fia.a($$0, $$4, $$2, $$1, $$5, $$3);
        }
    }

    private static void a(fjr $$0, bgr $$1, egm $$2, is $$3, fib $$4, fft $$5) {
        is $$6 = new is($$3.u(), 90, $$3.w());
        is $$7 = fjq.a(new is(15, 0, 15), eev.a, $$2, is.c).a($$6);
        ffg $$8 = ffg.a((jy)$$6, (jy)$$7);
        is $$9 = new is(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
        List<is> $$10 = fia.a($$1, $$9);
        int $$11 = bgj.a($$1, 4, 8);
        for (int $$12 = 0; $$12 < $$11; ++$$12) {
            egm $$15;
            is $$16;
            int $$13;
            is $$14;
            ffg $$17;
            if ($$10.isEmpty() || ($$17 = ffg.a((jy)($$14 = $$10.remove($$13 = $$1.a($$10.size()))), (jy)($$16 = fjq.a(new is(5, 0, 6), eev.a, $$15 = egm.a($$1), is.c).a($$14)))).a($$8)) continue;
            fia.a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8f);
        }
    }

    private static List<is> a(bgr $$0, is $$1) {
        ArrayList $$2 = Lists.newArrayList();
        $$2.add($$1.b(-16 + bgj.a($$0, 1, 8), 0, 16 + bgj.a($$0, 1, 7)));
        $$2.add($$1.b(-16 + bgj.a($$0, 1, 8), 0, bgj.a($$0, 1, 7)));
        $$2.add($$1.b(-16 + bgj.a($$0, 1, 8), 0, -16 + bgj.a($$0, 4, 8)));
        $$2.add($$1.b(bgj.a($$0, 1, 7), 0, 16 + bgj.a($$0, 1, 7)));
        $$2.add($$1.b(bgj.a($$0, 1, 7), 0, -16 + bgj.a($$0, 4, 6)));
        $$2.add($$1.b(16 + bgj.a($$0, 1, 7), 0, 16 + bgj.a($$0, 3, 8)));
        $$2.add($$1.b(16 + bgj.a($$0, 1, 7), 0, bgj.a($$0, 1, 7)));
        $$2.add($$1.b(16 + bgj.a($$0, 1, 7), 0, -16 + bgj.a($$0, 4, 8)));
        return $$2;
    }

    private static void a(fjr $$0, is $$1, egm $$2, fft $$3, bgr $$4, fib $$5, boolean $$6, float $$7) {
        switch ($$5.e) {
            default: {
                amo $$8 = $$6 ? fia.b($$4) : fia.a($$4);
                $$3.a(new a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
                break;
            }
            case b: {
                amo[] $$9 = $$6 ? g : d;
                amo[] $$10 = $$6 ? i : e;
                amo[] $$11 = $$6 ? h : f;
                int $$12 = $$4.a($$9.length);
                $$3.a(new a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
                $$3.a(new a($$0, $$10[$$12], $$1, $$2, 0.7f, $$5.e, $$6));
                $$3.a(new a($$0, $$11[$$12], $$1, $$2, 0.5f, $$5.e, $$6));
            }
        }
    }

    public static class a
    extends ffy {
        private final fib.a h;
        private final float i;
        private final boolean j;

        public a(fjr $$0, amo $$1, is $$2, egm $$3, float $$4, fib.a $$5, boolean $$6) {
            super(fgf.H, 0, $$0, $$1, $$1.toString(), fia$a.a($$3, $$4, $$5), $$2);
            this.i = $$4;
            this.h = $$5;
            this.j = $$6;
        }

        private a(fjr $$0, uz $$1, egm $$2, float $$32, fib.a $$4, boolean $$5) {
            super(fgf.H, $$1, $$0, $$3 -> fia$a.a($$2, $$32, $$4));
            this.i = $$32;
            this.h = $$4;
            this.j = $$5;
        }

        private static fjm a(egm $$0, float $$1, fib.a $$2) {
            fjn $$3 = $$2 == fib.a.b ? b : a;
            return new fjm().a($$0).a(eev.a).a(new fit($$1)).a(fir.d).a($$3);
        }

        public static a a(fjr $$0, uz $$1) {
            egm $$2 = $$1.a("Rot", egm.h).orElseThrow();
            float $$3 = $$1.b("Integrity", 0.0f);
            fib.a $$4 = $$1.a("BiomeType", fib.a.d).orElseThrow();
            boolean $$5 = $$1.b("IsLarge", false);
            return new a($$0, $$1, $$2, $$3, $$4, $$5);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Rot", egm.h, this.c.d());
            $$1.a("Integrity", this.i);
            $$1.a("BiomeType", fib.a.d, this.h);
            $$1.a("IsLarge", this.j);
        }

        @Override
        protected void a(String $$0, is $$1, dxf $$2, bgr $$3, ffg $$4) {
            dcl $$6;
            if ("chest".equals($$0)) {
                $$2.a($$1, (eoh)dzs.cS.m().b(eau.e, $$2.b_($$1).a(bdv.a)), 2);
                elb $$5 = $$2.c_($$1);
                if ($$5 instanceof elj) {
                    ((elj)$$5).a(this.j ? fnv.E : fnv.D, $$3.g());
                }
            } else if ("drowned".equals($$0) && ($$6 = cgu.O.a($$2.a(), cgt.d)) != null) {
                $$6.gz();
                $$6.a($$1, 0.0f, 0.0f);
                $$6.a($$2, $$2.c($$1), cgt.d, null);
                $$2.a_($$6);
                if ($$1.v() > $$2.V()) {
                    $$2.a($$1, dzs.a.m(), 2);
                } else {
                    $$2.a($$1, dzs.J.m(), 2);
                }
            }
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            int $$7 = $$0.a(euq.a.c, this.d.u(), this.d.w());
            this.d = new is(this.d.u(), $$7, this.d.w());
            is $$8 = fjq.a(new is(this.b.a().u() - 1, 0, this.b.a().w() - 1), eev.a, this.c.d(), is.c).a(this.d);
            this.d = new is(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }

        private int a(is $$0, dvt $$1, is $$2) {
            int $$3 = $$0.v();
            int $$4 = 512;
            int $$5 = $$3 - 1;
            int $$6 = 0;
            for (is $$7 : is.c($$0, $$2)) {
                int $$8 = $$7.u();
                int $$9 = $$7.w();
                int $$10 = $$0.v() - 1;
                is.a $$11 = new is.a($$8, $$10, $$9);
                eoh $$12 = $$1.a_($$11);
                flb $$13 = $$1.b_($$11);
                while (($$12.l() || $$13.a(bdv.a) || $$12.a(bdp.aC)) && $$10 > $$1.K_() + 1) {
                    $$11.d($$8, --$$10, $$9);
                    $$12 = $$1.a_($$11);
                    $$13 = $$1.b_($$11);
                }
                $$4 = Math.min($$4, $$10);
                if ($$10 >= $$5 - 2) continue;
                ++$$6;
            }
            int $$14 = Math.abs($$0.u() - $$2.u());
            if ($$5 - $$4 > 2 && $$6 > $$14 - 2) {
                $$3 = $$4 + 1;
            }
            return $$3;
        }
    }
}

