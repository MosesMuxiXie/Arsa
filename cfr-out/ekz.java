/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class ekz
extends elb {
    private static final int d = 50;
    private static final int e = 60;
    private static final int f = 60;
    private static final int g = 40;
    private static final int h = 5;
    private static final int i = 48;
    private static final int j = 32;
    private static final int k = 48;
    private long l;
    public int a;
    public boolean b;
    public iz c;
    private List<chl> m;
    private boolean q;
    private int r;

    public ekz(is $$0, eoh $$1) {
        super(eld.F, $$0, $$1);
    }

    @Override
    public boolean a_(int $$0, int $$1) {
        if ($$0 == 1) {
            this.a();
            this.r = 0;
            this.c = iz.a($$1);
            this.a = 0;
            this.b = true;
            return true;
        }
        return super.a_($$0, $$1);
    }

    private static void a(dwo $$0, is $$1, eoh $$2, ekz $$3, a $$4) {
        if ($$3.b) {
            ++$$3.a;
        }
        if ($$3.a >= 50) {
            $$3.b = false;
            $$3.a = 0;
        }
        if ($$3.a >= 5 && $$3.r == 0 && ekz.a($$1, $$3.m)) {
            $$3.q = true;
            $$0.a(null, $$1, bda.cm, bdb.e, 1.0f, 1.0f);
        }
        if ($$3.q) {
            if ($$3.r < 40) {
                ++$$3.r;
            } else {
                $$4.run($$0, $$1, $$3.m);
                $$3.q = false;
            }
        }
    }

    public static void a(dwo $$0, is $$1, eoh $$2, ekz $$3) {
        ekz.a($$0, $$1, $$2, $$3, ekz::b);
    }

    public static void b(dwo $$0, is $$1, eoh $$2, ekz $$3) {
        ekz.a($$0, $$1, $$2, $$3, ekz::a);
    }

    public void a(iz $$0) {
        is $$1 = this.aD_();
        this.c = $$0;
        if (this.b) {
            this.a = 0;
        } else {
            this.b = true;
        }
        this.n.a($$1, this.o().b(), 1, $$0.d());
    }

    private void a() {
        is $$0 = this.aD_();
        if (this.n.au() > this.l + 60L || this.m == null) {
            this.l = this.n.au();
            fth $$1 = new fth($$0).g(48.0);
            this.m = this.n.a(chl.class, $$1);
        }
        if (!this.n.B_()) {
            for (chl $$2 : this.m) {
                if (!$$2.cb() || $$2.eh() || !$$0.a($$2.dI(), 32.0)) continue;
                $$2.ev().a(cqw.E, this.n.au());
            }
        }
    }

    private static boolean a(is $$0, List<chl> $$1) {
        for (chl $$2 : $$1) {
            if (!$$2.cb() || $$2.eh() || !$$0.a($$2.dI(), 32.0) || !$$2.ay().a(bdt.c)) continue;
            return true;
        }
        return false;
    }

    private static void a(dwo $$0, is $$12, List<chl> $$2) {
        $$2.stream().filter($$1 -> ekz.a($$12, $$1)).forEach(ekz::a);
    }

    private static void b(dwo $$0, is $$12, List<chl> $$2) {
        MutableInt $$3 = new MutableInt(16700985);
        int $$42 = (int)$$2.stream().filter($$1 -> $$12.a($$1.dI(), 48.0)).count();
        $$2.stream().filter($$1 -> ekz.a($$12, $$1)).forEach($$4 -> {
            float $$5 = 1.0f;
            double $$6 = Math.sqrt(($$4.dP() - (double)$$12.u()) * ($$4.dP() - (double)$$12.u()) + ($$4.dV() - (double)$$12.w()) * ($$4.dV() - (double)$$12.w()));
            double $$7 = (double)((float)$$12.u() + 0.5f) + 1.0 / $$6 * ($$4.dP() - (double)$$12.u());
            double $$8 = (double)((float)$$12.w() + 0.5f) + 1.0 / $$6 * ($$4.dV() - (double)$$12.w());
            int $$9 = bgj.a(($$42 - 21) / -2, 3, 15);
            for (int $$10 = 0; $$10 < $$9; ++$$10) {
                int $$11 = $$3.addAndGet(5);
                $$0.a(lq.a(ly.v, $$11), $$7, (double)((float)$$12.v() + 0.5f), $$8, 0.0, 0.0, 0.0);
            }
        });
    }

    private static boolean a(is $$0, chl $$1) {
        return $$1.cb() && !$$1.eh() && $$0.a($$1.dI(), 48.0) && $$1.ay().a(bdt.c);
    }

    private static void a(chl $$0) {
        $$0.a(new cfm(cfo.x, 60));
    }

    @FunctionalInterface
    static interface a {
        public void run(dwo var1, is var2, List<chl> var3);
    }
}

