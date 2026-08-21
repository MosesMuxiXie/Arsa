/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class elo
extends elb {
    private static final int b = 2;
    private static final int c = 13;
    private static final float d = -0.0375f;
    private static final int e = 16;
    private static final int f = 42;
    private static final int g = 8;
    private static final dzq[] h = new dzq[]{dzs.iR, dzs.iS, dzs.ja, dzs.iT};
    public int a;
    private float i;
    private boolean j;
    private boolean k;
    private final List<is> l = Lists.newArrayList();
    private @Nullable cgr<chl> m;
    private long q;

    public elo(is $$0, eoh $$1) {
        super(eld.A, $$0, $$1);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.m = cgr.a($$0, "Target");
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        cgr.a(this.m, $$0, "Target");
    }

    public adh a() {
        return adh.a(this);
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    public static void a(dwo $$0, is $$1, eoh $$2, elo $$3) {
        ++$$3.a;
        long $$4 = $$0.au();
        List<is> $$5 = $$3.l;
        if ($$4 % 40L == 0L) {
            $$3.j = elo.a($$0, $$1, $$5);
            elo.a($$3, $$5);
        }
        chl $$6 = cgr.b($$3.m, $$0);
        elo.a($$0, $$1, $$5, $$6, $$3.a);
        if ($$3.c()) {
            $$3.i += 1.0f;
        }
    }

    public static void b(dwo $$0, is $$1, eoh $$2, elo $$3) {
        ++$$3.a;
        long $$4 = $$0.au();
        List<is> $$5 = $$3.l;
        if ($$4 % 40L == 0L) {
            boolean $$6 = elo.a($$0, $$1, $$5);
            if ($$6 != $$3.j) {
                bcz $$7 = $$6 ? bda.fX : bda.gb;
                $$0.a(null, $$1, $$7, bdb.e, 1.0f, 1.0f);
            }
            $$3.j = $$6;
            elo.a($$3, $$5);
            if ($$6) {
                elo.b($$0, $$1, $$5);
                elo.a((axf)$$0, $$1, $$2, $$3, $$5.size() >= 42);
            }
        }
        if ($$3.c()) {
            if ($$4 % 80L == 0L) {
                $$0.a(null, $$1, bda.fY, bdb.e, 1.0f, 1.0f);
            }
            if ($$4 > $$3.q) {
                $$3.q = $$4 + 60L + (long)$$0.G_().a(40);
                $$0.a(null, $$1, bda.fZ, bdb.e, 1.0f, 1.0f);
            }
        }
    }

    private static void a(elo $$0, List<is> $$1) {
        $$0.a($$1.size() >= 42);
    }

    private static boolean a(dwo $$0, is $$1, List<is> $$2) {
        $$2.clear();
        for (int $$3 = -1; $$3 <= 1; ++$$3) {
            for (int $$4 = -1; $$4 <= 1; ++$$4) {
                for (int $$5 = -1; $$5 <= 1; ++$$5) {
                    is $$6 = $$1.b($$3, $$4, $$5);
                    if ($$0.F($$6)) continue;
                    return false;
                }
            }
        }
        for (int $$7 = -2; $$7 <= 2; ++$$7) {
            for (int $$8 = -2; $$8 <= 2; ++$$8) {
                for (int $$9 = -2; $$9 <= 2; ++$$9) {
                    int $$10 = Math.abs($$7);
                    int $$11 = Math.abs($$8);
                    int $$12 = Math.abs($$9);
                    if ($$10 <= 1 && $$11 <= 1 && $$12 <= 1 || ($$7 != 0 || $$11 != 2 && $$12 != 2) && ($$8 != 0 || $$10 != 2 && $$12 != 2) && ($$9 != 0 || $$10 != 2 && $$11 != 2)) continue;
                    is $$13 = $$1.b($$7, $$8, $$9);
                    eoh $$14 = $$0.a_($$13);
                    for (dzq $$15 : h) {
                        if (!$$14.a($$15)) continue;
                        $$2.add($$13);
                    }
                }
            }
        }
        return $$2.size() >= 16;
    }

    private static void b(dwo $$0, is $$1, List<is> $$2) {
        int $$7;
        int $$6;
        int $$3 = $$2.size();
        int $$4 = $$3 / 7 * 16;
        int $$5 = $$1.u();
        fth $$8 = new fth($$5, $$6 = $$1.v(), $$7 = $$1.w(), $$5 + 1, $$6 + 1, $$7 + 1).g($$4).b(0.0, $$0.L_(), 0.0);
        List<ddm> $$9 = $$0.a(ddm.class, $$8);
        if ($$9.isEmpty()) {
            return;
        }
        for (ddm $$10 : $$9) {
            if (!$$1.a($$10.dK(), (double)$$4) || !$$10.bA()) continue;
            $$10.a(new cfm(cfo.C, 260, 0, true, true));
        }
    }

    private static void a(axf $$0, is $$1, eoh $$2, elo $$3, boolean $$4) {
        cgr<chl> $$5 = elo.a($$3.m, $$0, $$1, $$4);
        chl $$6 = cgr.b($$5, $$0);
        if ($$6 != null) {
            $$0.a(null, $$6.dP(), $$6.dR(), $$6.dV(), bda.ga, bdb.e, 1.0f, 1.0f);
            $$6.a($$0, $$0.as().q(), 4.0f);
        }
        if (!Objects.equals($$5, $$3.m)) {
            $$3.m = $$5;
            $$0.a($$1, $$2, $$2, 2);
        }
    }

    private static @Nullable cgr<chl> a(@Nullable cgr<chl> $$0, axf $$1, is $$2, boolean $$3) {
        if (!$$3) {
            return null;
        }
        if ($$0 == null) {
            return elo.a($$1, $$2);
        }
        chl $$4 = cgr.b($$0, $$1);
        if ($$4 == null || !$$4.cb() || !$$2.a($$4.dK(), 8.0)) {
            return null;
        }
        return $$0;
    }

    private static @Nullable cgr<chl> a(axf $$02, is $$1) {
        List<chl> $$2 = $$02.a(chl.class, elo.a($$1), $$0 -> $$0 instanceof czu && $$0.bA());
        if ($$2.isEmpty()) {
            return null;
        }
        return cgr.a(bhs.a($$2, $$02.y));
    }

    private static fth a(is $$0) {
        return new fth($$0).g(8.0);
    }

    private static void a(dwo $$0, is $$1, List<is> $$2, @Nullable cgk $$3, int $$4) {
        bgr $$5 = $$0.y;
        double $$6 = bgj.a((double)((float)($$4 + 35) * 0.1f)) / 2.0f + 0.5f;
        $$6 = ($$6 * $$6 + $$6) * (double)0.3f;
        ftm $$7 = new ftm((double)$$1.u() + 0.5, (double)$$1.v() + 1.5 + $$6, (double)$$1.w() + 0.5);
        for (is $$8 : $$2) {
            if ($$5.a(50) != 0) continue;
            is $$9 = $$8.b($$1);
            float $$10 = -0.5f + $$5.i() + (float)$$9.u();
            float $$11 = -2.0f + $$5.i() + (float)$$9.v();
            float $$12 = -0.5f + $$5.i() + (float)$$9.w();
            $$0.a(ly.av, $$7.g, $$7.h, $$7.i, (double)$$10, (double)$$11, $$12);
        }
        if ($$3 != null) {
            ftm $$13 = new ftm($$3.dP(), $$3.dT(), $$3.dV());
            float $$14 = (-0.5f + $$5.i()) * (3.0f + $$3.dF());
            float $$15 = -1.0f + $$5.i() * $$3.dG();
            float $$16 = (-0.5f + $$5.i()) * (3.0f + $$3.dF());
            ftm $$17 = new ftm($$14, $$15, $$16);
            $$0.a(ly.av, $$13.g, $$13.h, $$13.i, $$17.g, $$17.h, $$17.i);
        }
    }

    public boolean c() {
        return this.j;
    }

    public boolean d() {
        return this.k;
    }

    private void a(boolean $$0) {
        this.k = $$0;
    }

    public float a(float $$0) {
        return (this.i + $$0) * -0.0375f;
    }

    public /* synthetic */ aay ax_() {
        return this.a();
    }
}

