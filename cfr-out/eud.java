/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class eud
implements euk.c {
    public static final int a = 12;
    private static final int g = 24;
    private static final float[] h = bhs.a(new float[13824], (? super T $$0) -> {
        for (int $$1 = 0; $$1 < 24; ++$$1) {
            for (int $$2 = 0; $$2 < 24; ++$$2) {
                for (int $$3 = 0; $$3 < 24; ++$$3) {
                    $$0[$$1 * 24 * 24 + $$2 * 24 + $$3] = (float)eud.a($$2 - 12, $$3 - 12, $$1 - 12);
                }
            }
        }
    });
    public static final eud b = new eud(List.of(), List.of(), null);
    private final List<a> i;
    private final List<fgr> j;
    private final @Nullable ffg k;

    public static eud a(dxk $$02, dvu $$1) {
        List<ffw> $$2 = $$02.a($$1, (ffo $$0) -> $$0.d() != ffz.a);
        if ($$2.isEmpty()) {
            return b;
        }
        int $$3 = $$1.e();
        int $$4 = $$1.f();
        ArrayList<a> $$5 = new ArrayList<a>();
        ArrayList<fgr> $$6 = new ArrayList<fgr>();
        ffg $$7 = null;
        for (ffw $$8 : $$2) {
            ffz $$9 = $$8.h().d();
            for (ffs $$10 : $$8.i()) {
                if (!$$10.a($$1, 12)) continue;
                if ($$10 instanceof ffk) {
                    ffk $$11 = (ffk)$$10;
                    fgy.a $$12 = $$11.b().g();
                    if ($$12 == fgy.a.b) {
                        $$5.add(new a($$11.f(), $$9, $$11.d()));
                        $$7 = eud.a($$7, $$10.f());
                    }
                    for (fgr $$13 : $$11.e()) {
                        int $$14 = $$13.a();
                        int $$15 = $$13.c();
                        if ($$14 <= $$3 - 12 || $$15 <= $$4 - 12 || $$14 >= $$3 + 15 + 12 || $$15 >= $$4 + 15 + 12) continue;
                        $$6.add($$13);
                        ffg $$16 = new ffg(new is($$14, $$13.b(), $$15));
                        $$7 = eud.a($$7, $$16);
                    }
                    continue;
                }
                $$5.add(new a($$10.f(), $$9, 0));
                $$7 = eud.a($$7, $$10.f());
            }
        }
        if ($$7 == null) {
            return b;
        }
        ffg $$17 = $$7.a(24);
        return new eud(List.copyOf($$5), List.copyOf($$6), $$17);
    }

    private static ffg a(@Nullable ffg $$0, ffg $$1) {
        if ($$0 == null) {
            return $$1;
        }
        return ffg.a($$0, $$1);
    }

    @VisibleForTesting
    public eud(List<a> $$0, List<fgr> $$1, @Nullable ffg $$2) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
    }

    @Override
    public void a(double[] $$0, euj.a $$1) {
        if (this.k == null) {
            Arrays.fill($$0, 0.0);
        } else {
            euk.c.super.a($$0, $$1);
        }
    }

    @Override
    public double a(euj.b $$0) {
        int $$3;
        int $$2;
        if (this.k == null) {
            return 0.0;
        }
        int $$1 = $$0.a();
        if (!this.k.d($$1, $$2 = $$0.b(), $$3 = $$0.c())) {
            return 0.0;
        }
        double $$4 = 0.0;
        for (a $$5 : this.i) {
            ffg $$6 = $$5.a();
            int $$7 = $$5.c();
            int $$8 = Math.max(0, Math.max($$6.h() - $$1, $$1 - $$6.k()));
            int $$9 = Math.max(0, Math.max($$6.j() - $$3, $$3 - $$6.m()));
            int $$10 = $$6.i() + $$7;
            int $$11 = $$2 - $$10;
            int $$12 = switch ($$5.b()) {
                default -> throw new MatchException(null, null);
                case ffz.a -> 0;
                case ffz.b, ffz.c -> $$11;
                case ffz.d -> Math.max(0, Math.max($$10 - $$2, $$2 - $$6.l()));
                case ffz.e -> Math.max(0, Math.max($$6.i() - $$2, $$2 - $$6.l()));
            };
            $$4 += (switch ($$5.b()) {
                default -> throw new MatchException(null, null);
                case ffz.a -> 0.0;
                case ffz.b -> eud.a((double)$$8, (double)$$12 / 2.0, (double)$$9);
                case ffz.c, ffz.d -> eud.a($$8, $$12, $$9, $$11) * 0.8;
                case ffz.e -> eud.a((double)$$8 / 2.0, (double)$$12 / 2.0, (double)$$9 / 2.0) * 0.8;
            });
        }
        for (fgr $$13 : this.j) {
            int $$14 = $$1 - $$13.a();
            int $$15 = $$2 - $$13.b();
            int $$16 = $$3 - $$13.c();
            $$4 += eud.a($$14, $$15, $$16, $$15) * 0.4;
        }
        return $$4;
    }

    @Override
    public double a() {
        return Double.NEGATIVE_INFINITY;
    }

    @Override
    public double b() {
        return Double.POSITIVE_INFINITY;
    }

    private static double a(double $$0, double $$1, double $$2) {
        double $$3 = bgj.g($$0, $$1, $$2);
        return bgj.a($$3, 0.0, 6.0, 1.0, 0.0);
    }

    private static double a(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = $$0 + 12;
        int $$5 = $$1 + 12;
        int $$6 = $$2 + 12;
        if (!(eud.a($$4) && eud.a($$5) && eud.a($$6))) {
            return 0.0;
        }
        double $$7 = (double)$$3 + 0.5;
        double $$8 = bgj.f((double)$$0, $$7, (double)$$2);
        double $$9 = -$$7 * bgj.j($$8 / 2.0) / 2.0;
        return $$9 * (double)h[$$6 * 24 * 24 + $$4 * 24 + $$5];
    }

    private static boolean a(int $$0) {
        return $$0 >= 0 && $$0 < 24;
    }

    private static double a(int $$0, int $$1, int $$2) {
        return eud.a($$0, (double)$$1 + 0.5, $$2);
    }

    private static double a(int $$0, double $$1, int $$2) {
        double $$3 = bgj.f((double)$$0, $$1, (double)$$2);
        double $$4 = Math.pow(Math.E, -$$3 / 16.0);
        return $$4;
    }

    @VisibleForTesting
    public record a(ffg a, ffz b, int c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "box;terrainAdjustment;groundLevelDelta", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "box;terrainAdjustment;groundLevelDelta", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "box;terrainAdjustment;groundLevelDelta", "a", "b", "c"}, this, $$0);
        }
    }
}

