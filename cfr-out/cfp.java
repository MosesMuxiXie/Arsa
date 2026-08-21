/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.function.ToIntFunction;

class cfp
extends cfk {
    private static final int d = 2;
    public static final int c = 2;
    private final ToIntFunction<bgr> e;

    protected cfp(cfl $$0, int $$1, ToIntFunction<bgr> $$2) {
        super($$0, $$1, ly.Y);
        this.e = $$2;
    }

    @VisibleForTesting
    protected static int a(int $$0, a $$1, int $$2) {
        if ($$0 < 1) {
            return $$2;
        }
        return bgj.a(0, $$0 - $$1.count($$0), $$2);
    }

    @Override
    public void a(axf $$0, chl $$1, int $$2, cgk.e $$3) {
        if ($$3 != cgk.e.a) {
            return;
        }
        int $$4 = this.e.applyAsInt($$1.ep());
        int $$5 = $$0.U().a(eua.A);
        int $$6 = cfp.a($$5, cfp$a.a($$1), $$4);
        for (int $$7 = 0; $$7 < $$6; ++$$7) {
            this.a($$1.ao(), $$1.dP(), $$1.dR() + 0.5, $$1.dV());
        }
    }

    private void a(dwo $$0, double $$1, double $$2, double $$3) {
        dag $$4 = cgu.bp.a($$0, cgt.k);
        if ($$4 == null) {
            return;
        }
        $$4.a(2, true);
        $$4.b($$1, $$2, $$3, $$0.G_().i() * 360.0f, 0.0f);
        $$0.b($$4);
    }

    @FunctionalInterface
    protected static interface a {
        public int count(int var1);

        public static a a(chl $$0) {
            return $$12 -> {
                ArrayList $$2 = new ArrayList();
                $$0.ao().a(cgu.bp, $$0.dj().g(2.0), $$1 -> $$1 != $$0, $$2, $$12);
                return $$2.size();
            };
        }
    }
}

