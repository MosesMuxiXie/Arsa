/*
 * Decompiled with CFR 0.152.
 */
public class cnq
implements cnm {
    public static final float a = 5.0E-4f;
    public static final float b = 2.5000003E-7f;
    protected static final int c = 90;
    protected final chn d;
    protected double e;
    protected double f;
    protected double g;
    protected double h;
    protected float i;
    protected float j;
    protected a k = cnq$a.a;

    public cnq(chn $$0) {
        this.d = $$0;
    }

    public boolean b() {
        return this.k == cnq$a.b;
    }

    public double c() {
        return this.h;
    }

    public void a(double $$0, double $$1, double $$2, double $$3) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        if (this.k != cnq$a.d) {
            this.k = cnq$a.b;
        }
    }

    public void a(float $$0, float $$1) {
        this.k = cnq$a.c;
        this.i = $$0;
        this.j = $$1;
        this.h = 0.25;
    }

    public void a() {
        if (this.k == cnq$a.c) {
            float $$8;
            float $$0 = (float)this.d.i(cis.x);
            float $$1 = (float)this.h * $$0;
            float $$2 = this.i;
            float $$3 = this.j;
            float $$4 = bgj.a($$2 * $$2 + $$3 * $$3);
            if ($$4 < 1.0f) {
                $$4 = 1.0f;
            }
            $$4 = $$1 / $$4;
            float $$5 = bgj.a((double)(this.d.ec() * ((float)Math.PI / 180)));
            float $$6 = bgj.b((double)(this.d.ec() * ((float)Math.PI / 180)));
            float $$7 = ($$2 *= $$4) * $$6 - ($$3 *= $$4) * $$5;
            if (!this.b($$7, $$8 = $$3 * $$6 + $$2 * $$5)) {
                this.i = 1.0f;
                this.j = 0.0f;
            }
            this.d.C($$1);
            this.d.I(this.i);
            this.d.K(this.j);
            this.k = cnq$a.a;
        } else if (this.k == cnq$a.b) {
            this.k = cnq$a.a;
            double $$9 = this.e - this.d.dP();
            double $$10 = this.g - this.d.dV();
            double $$11 = this.f - this.d.dR();
            double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
            if ($$12 < 2.500000277905201E-7) {
                this.d.I(0.0f);
                return;
            }
            float $$13 = (float)(bgj.d($$10, $$9) * 57.2957763671875) - 90.0f;
            this.d.v(this.b(this.d.ec(), $$13, 90.0f));
            this.d.C((float)(this.h * this.d.i(cis.x)));
            is $$14 = this.d.dK();
            eoh $$15 = this.d.ao().a_($$14);
            fug $$16 = $$15.g(this.d.ao(), $$14);
            if ($$11 > (double)this.d.eg() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0f, this.d.dF()) || !$$16.c() && this.d.dR() < $$16.c(iz.a.b) + (double)$$14.v() && !$$15.a(bdp.o) && !$$15.a(bdp.S)) {
                this.d.L().a();
                this.k = cnq$a.d;
            }
        } else if (this.k == cnq$a.d) {
            this.d.C((float)(this.h * this.d.i(cis.x)));
            if (this.d.aV() || this.d.bB() && this.d.eG()) {
                this.k = cnq$a.a;
            }
        } else {
            this.d.I(0.0f);
        }
    }

    private boolean b(float $$0, float $$1) {
        flo $$3;
        cre $$2 = this.d.N();
        return $$2 == null || ($$3 = $$2.o()) == null || $$3.a(this.d, is.a(this.d.dP() + (double)$$0, (double)this.d.dQ(), this.d.dV() + (double)$$1)) == fls.c;
    }

    protected float b(float $$0, float $$1, float $$2) {
        float $$4;
        float $$3 = bgj.f($$1 - $$0);
        if ($$3 > $$2) {
            $$3 = $$2;
        }
        if ($$3 < -$$2) {
            $$3 = -$$2;
        }
        if (($$4 = $$0 + $$3) < 0.0f) {
            $$4 += 360.0f;
        } else if ($$4 > 360.0f) {
            $$4 -= 360.0f;
        }
        return $$4;
    }

    public double d() {
        return this.e;
    }

    public double e() {
        return this.f;
    }

    public double f() {
        return this.g;
    }

    public void g() {
        this.k = cnq$a.a;
    }

    protected static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = cnq$a.a();
        }
    }
}

