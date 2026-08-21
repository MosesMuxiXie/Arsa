/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import java.util.List;

public class cow
extends cop {
    public final cus a;
    private double b;
    private static final int c = 8;
    private int d;

    public cow(cus $$0, double $$1) {
        this.a = $$0;
        this.b = $$1;
        this.a(EnumSet.of(cop.a.a));
    }

    @Override
    public boolean b() {
        if (this.a.S_() || this.a.hi()) {
            return false;
        }
        List<cgk> $$02 = this.a.ao().a((cgk)this.a, this.a.dj().c(9.0, 4.0, 9.0), $$0 -> {
            cgu<?> $$1 = $$0.ay();
            return $$1 == cgu.aC || $$1 == cgu.bG;
        });
        chj $$1 = null;
        double $$2 = Double.MAX_VALUE;
        for (cgk $$3 : $$02) {
            double $$5;
            cus $$4 = (cus)$$3;
            if (!$$4.hi() || $$4.hh() || ($$5 = this.a.g((cgk)$$4)) > $$2) continue;
            $$2 = $$5;
            $$1 = $$4;
        }
        if ($$1 == null) {
            for (cgk $$6 : $$02) {
                double $$8;
                cus $$7 = (cus)$$6;
                if (!$$7.S_() || $$7.hh() || ($$8 = this.a.g((cgk)$$7)) > $$2) continue;
                $$2 = $$8;
                $$1 = $$7;
            }
        }
        if ($$1 == null) {
            return false;
        }
        if ($$2 < 4.0) {
            return false;
        }
        if (!$$1.S_() && !this.a((cus)$$1, 1)) {
            return false;
        }
        this.a.a((cus)$$1);
        return true;
    }

    @Override
    public boolean c() {
        if (!(this.a.hi() && this.a.hj().cb() && this.a(this.a, 0))) {
            return false;
        }
        double $$0 = this.a.g((cgk)this.a.hj());
        if ($$0 > 676.0) {
            if (this.b <= 3.0) {
                this.b *= 1.2;
                this.d = cow.b(40);
                return true;
            }
            if (this.d == 0) {
                return false;
            }
        }
        if (this.d > 0) {
            --this.d;
        }
        return true;
    }

    @Override
    public void e() {
        this.a.hg();
        this.b = 2.1;
    }

    @Override
    public void a() {
        if (!this.a.hi()) {
            return;
        }
        if (this.a.C() instanceof czd) {
            return;
        }
        cus $$0 = this.a.hj();
        double $$1 = this.a.f((cgk)$$0);
        float $$2 = 2.0f;
        ftm $$3 = new ftm($$0.dP() - this.a.dP(), $$0.dR() - this.a.dR(), $$0.dV() - this.a.dV()).d().c(Math.max($$1 - 2.0, 0.0));
        this.a.N().a(this.a.dP() + $$3.g, this.a.dR() + $$3.h, this.a.dV() + $$3.i, this.b);
    }

    private boolean a(cus $$0, int $$1) {
        if ($$1 > 8) {
            return false;
        }
        if ($$0.hi()) {
            if ($$0.hj().S_()) {
                return true;
            }
            return this.a($$0.hj(), ++$$1);
        }
        return false;
    }
}

