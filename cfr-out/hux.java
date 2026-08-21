/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.DoubleSupplier;

public class hux
implements hug.a {
    private final gfj a;
    private double b = Double.MIN_VALUE;
    private List<cgk> c = Collections.emptyList();

    public hux(gfj $$0) {
        this.a = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        hnh $$8;
        double $$6 = bhs.d();
        if ($$6 - this.b > 1.0E8) {
            this.b = $$6;
            cgk $$7 = this.a.i.p().h();
            this.c = ImmutableList.copyOf($$7.ao().a_($$7, $$7.dj().g(16.0)));
        }
        if (($$8 = this.a.s) != null && $$8.aL.isPresent()) {
            this.a($$8, () -> 0.0, -65536);
        }
        for (cgk $$9 : this.c) {
            if ($$9 == $$8) continue;
            this.a($$9, () -> this.a($$9), -16711936);
        }
    }

    private void a(cgk $$0, DoubleSupplier $$1, int $$2) {
        $$0.aL.ifPresent($$3 -> {
            double $$4 = $$1.getAsDouble();
            is $$5 = $$0.bg();
            this.a($$5, 0.02 + $$4, $$2);
            is $$6 = $$0.be();
            if (!$$6.equals($$5)) {
                this.a($$6, 0.04 + $$4, -16711681);
            }
        });
    }

    private double a(cgk $$0) {
        return 0.02 * (double)(String.valueOf((double)$$0.aA() + 0.132453657).hashCode() % 1000) / 1000.0;
    }

    private void a(is $$0, double $$1, int $$2) {
        double $$3 = (double)$$0.u() - 2.0 * $$1;
        double $$4 = (double)$$0.v() - 2.0 * $$1;
        double $$5 = (double)$$0.w() - 2.0 * $$1;
        double $$6 = $$3 + 1.0 + 4.0 * $$1;
        double $$7 = $$4 + 1.0 + 4.0 * $$1;
        double $$8 = $$5 + 1.0 + 4.0 * $$1;
        um.a(new fth($$3, $$4, $$5, $$6, $$7, $$8), ul.a(bel.a(0.4f, $$2)));
        fug $$9 = this.a.r.a_($$0).b((dvt)this.a.r, $$0, ftr.a()).a($$0);
        ul $$10 = ul.a($$2);
        for (fth $$11 : $$9.e()) {
            um.a($$11, $$10);
        }
    }
}

