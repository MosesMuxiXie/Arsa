/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class fhl {
    private static final int a = 8;
    static final b b = new b(){

        @Override
        public void a() {
        }

        @Override
        public boolean a(fjr $$0, int $$1, a $$2, is $$3, List<ffs> $$4, bgr $$5) {
            if ($$1 > 8) {
                return false;
            }
            egm $$6 = $$2.e().d();
            a $$7 = fhl.a($$4, fhl.a($$0, $$2, $$3, "base_floor", $$6, true));
            int $$8 = $$5.a(3);
            if ($$8 == 0) {
                $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(-1, 4, -1), "base_roof", $$6, true));
            } else if ($$8 == 1) {
                $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(-1, 0, -1), "second_floor_2", $$6, false));
                $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(-1, 8, -1), "second_roof", $$6, false));
                fhl.a($$0, d, $$1 + 1, $$7, null, $$4, $$5);
            } else if ($$8 == 2) {
                $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(-1, 0, -1), "second_floor_2", $$6, false));
                $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(-1, 4, -1), "third_floor_2", $$6, false));
                $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(-1, 8, -1), "third_roof", $$6, true));
                fhl.a($$0, d, $$1 + 1, $$7, null, $$4, $$5);
            }
            return true;
        }
    };
    static final List<bhq<egm, is>> c = Lists.newArrayList((Object[])new bhq[]{new bhq<egm, is>(egm.a, new is(1, -1, 0)), new bhq<egm, is>(egm.b, new is(6, -1, 1)), new bhq<egm, is>(egm.d, new is(0, -1, 5)), new bhq<egm, is>(egm.c, new is(5, -1, 6))});
    static final b d = new b(){

        @Override
        public void a() {
        }

        @Override
        public boolean a(fjr $$0, int $$1, a $$2, is $$3, List<ffs> $$4, bgr $$5) {
            egm $$6 = $$2.e().d();
            a $$7 = $$2;
            $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(3 + $$5.a(2), -3, 3 + $$5.a(2)), "tower_base", $$6, true));
            $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(0, 7, 0), "tower_piece", $$6, true));
            a $$8 = $$5.a(3) == 0 ? $$7 : null;
            int $$9 = 1 + $$5.a(3);
            for (int $$10 = 0; $$10 < $$9; ++$$10) {
                $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(0, 4, 0), "tower_piece", $$6, true));
                if ($$10 >= $$9 - 1 || !$$5.h()) continue;
                $$8 = $$7;
            }
            if ($$8 != null) {
                for (bhq<egm, is> $$11 : c) {
                    if (!$$5.h()) continue;
                    a $$12 = fhl.a($$4, fhl.a($$0, $$8, $$11.b(), "bridge_end", $$6.a($$11.a()), true));
                    fhl.a($$0, e, $$1 + 1, $$12, null, $$4, $$5);
                }
                $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(-1, 4, -1), "tower_top", $$6, true));
            } else if ($$1 == 7) {
                $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(-1, 4, -1), "tower_top", $$6, true));
            } else {
                return fhl.a($$0, g, $$1 + 1, $$7, null, $$4, $$5);
            }
            return true;
        }
    };
    static final b e = new b(){
        public boolean a;

        @Override
        public void a() {
            this.a = false;
        }

        @Override
        public boolean a(fjr $$0, int $$1, a $$2, is $$3, List<ffs> $$4, bgr $$5) {
            egm $$6 = $$2.e().d();
            int $$7 = $$5.a(4) + 1;
            a $$8 = fhl.a($$4, fhl.a($$0, $$2, new is(0, 0, -4), "bridge_piece", $$6, true));
            $$8.a(-1);
            int $$9 = 0;
            for (int $$10 = 0; $$10 < $$7; ++$$10) {
                if ($$5.h()) {
                    $$8 = fhl.a($$4, fhl.a($$0, $$8, new is(0, $$9, -4), "bridge_piece", $$6, true));
                    $$9 = 0;
                    continue;
                }
                $$8 = $$5.h() ? fhl.a($$4, fhl.a($$0, $$8, new is(0, $$9, -4), "bridge_steep_stairs", $$6, true)) : fhl.a($$4, fhl.a($$0, $$8, new is(0, $$9, -8), "bridge_gentle_stairs", $$6, true));
                $$9 = 4;
            }
            if (this.a || $$5.a(10 - $$1) != 0) {
                if (!fhl.a($$0, b, $$1 + 1, $$8, new is(-3, $$9 + 1, -11), $$4, $$5)) {
                    return false;
                }
            } else {
                fhl.a($$4, fhl.a($$0, $$8, new is(-8 + $$5.a(8), $$9, -70 + $$5.a(10)), "ship", $$6, true));
                this.a = true;
            }
            $$8 = fhl.a($$4, fhl.a($$0, $$8, new is(4, $$9, 0), "bridge_end", $$6.a(egm.c), true));
            $$8.a(-1);
            return true;
        }
    };
    static final List<bhq<egm, is>> f = Lists.newArrayList((Object[])new bhq[]{new bhq<egm, is>(egm.a, new is(4, -1, 0)), new bhq<egm, is>(egm.b, new is(12, -1, 4)), new bhq<egm, is>(egm.d, new is(0, -1, 8)), new bhq<egm, is>(egm.c, new is(8, -1, 12))});
    static final b g = new b(){

        @Override
        public void a() {
        }

        @Override
        public boolean a(fjr $$0, int $$1, a $$2, is $$3, List<ffs> $$4, bgr $$5) {
            egm $$6 = $$2.e().d();
            a $$7 = fhl.a($$4, fhl.a($$0, $$2, new is(-3, 4, -3), "fat_tower_base", $$6, true));
            $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(0, 4, 0), "fat_tower_middle", $$6, true));
            for (int $$8 = 0; $$8 < 2 && $$5.a(3) != 0; ++$$8) {
                $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(0, 8, 0), "fat_tower_middle", $$6, true));
                for (bhq<egm, is> $$9 : f) {
                    if (!$$5.h()) continue;
                    a $$10 = fhl.a($$4, fhl.a($$0, $$7, $$9.b(), "bridge_end", $$6.a($$9.a()), true));
                    fhl.a($$0, e, $$1 + 1, $$10, null, $$4, $$5);
                }
            }
            $$7 = fhl.a($$4, fhl.a($$0, $$7, new is(-2, 8, -2), "fat_tower_top", $$6, true));
            return true;
        }
    };

    static a a(fjr $$0, a $$1, is $$2, String $$3, egm $$4, boolean $$5) {
        a $$6 = new a($$0, $$3, $$1.d(), $$4, $$5);
        is $$7 = $$1.c().a($$1.e(), $$2, $$6.e(), is.c);
        $$6.a($$7.u(), $$7.v(), $$7.w());
        return $$6;
    }

    public static void a(fjr $$0, is $$1, egm $$2, List<ffs> $$3, bgr $$4) {
        g.a();
        b.a();
        e.a();
        d.a();
        a $$5 = fhl.a($$3, new a($$0, "base_floor", $$1, $$2, true));
        $$5 = fhl.a($$3, fhl.a($$0, $$5, new is(-1, 0, -1), "second_floor_1", $$2, false));
        $$5 = fhl.a($$3, fhl.a($$0, $$5, new is(-1, 4, -1), "third_floor_1", $$2, false));
        $$5 = fhl.a($$3, fhl.a($$0, $$5, new is(-1, 8, -1), "third_roof", $$2, true));
        fhl.a($$0, d, 1, $$5, null, $$3, $$4);
    }

    static a a(List<ffs> $$0, a $$1) {
        $$0.add($$1);
        return $$1;
    }

    static boolean a(fjr $$0, b $$1, int $$2, a $$3, is $$4, List<ffs> $$5, bgr $$6) {
        if ($$2 > 8) {
            return false;
        }
        ArrayList $$7 = Lists.newArrayList();
        if ($$1.a($$0, $$2, $$3, $$4, $$7, $$6)) {
            boolean $$8 = false;
            int $$9 = $$6.f();
            for (ffs $$10 : $$7) {
                $$10.a($$9);
                ffs $$11 = ffs.a($$5, $$10.f());
                if ($$11 == null || $$11.g() == $$3.g()) continue;
                $$8 = true;
                break;
            }
            if (!$$8) {
                $$5.addAll($$7);
                return true;
            }
        }
        return false;
    }

    public static class a
    extends ffy {
        public a(fjr $$0, String $$1, is $$2, egm $$3, boolean $$4) {
            super(fgf.Y, 0, $$0, fhl$a.a($$1), $$1, fhl$a.a($$4, $$3), $$2);
        }

        public a(fjr $$0, uz $$12) {
            super(fgf.Y, $$12, $$0, $$1 -> fhl$a.a($$12.b("OW", false), $$12.a("Rot", egm.h).orElseThrow()));
        }

        private static fjm a(boolean $$0, egm $$1) {
            fir $$2 = $$0 ? fir.b : fir.d;
            return new fjm().a(true).a($$2).a($$1);
        }

        @Override
        protected amo b() {
            return fhl$a.a(this.a);
        }

        private static amo a(String $$0) {
            return amo.b("end_city/" + $$0);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Rot", egm.h, this.c.d());
            $$1.a("OW", this.c.i().get(0) == fir.b);
        }

        @Override
        protected void a(String $$0, is $$1, dxf $$2, bgr $$3, ffg $$4) {
            if ($$0.startsWith("Chest")) {
                is $$5 = $$1.e();
                if ($$4.b($$5)) {
                    cdj.a($$2, $$3, $$5, fnv.b);
                }
            } else if ($$4.b($$1) && dwo.p($$1)) {
                if ($$0.startsWith("Sentry")) {
                    dae $$6 = cgu.bk.a($$2.a(), cgt.d);
                    if ($$6 != null) {
                        $$6.a_((double)$$1.u() + 0.5, $$1.v(), (double)$$1.w() + 0.5);
                        $$2.b($$6);
                    }
                } else if ($$0.startsWith("Elytra")) {
                    czc $$7 = new czc($$2.a(), $$1, this.c.d().a(iz.d));
                    $$7.a(new dlt(dlx.pq), false);
                    $$2.b($$7);
                }
            }
        }
    }

    static interface b {
        public void a();

        public boolean a(fjr var1, int var2, a var3, is var4, List<ffs> var5, bgr var6);
    }
}

