/*
 * Decompiled with CFR 0.152.
 */
public class hly
extends hmg {
    private final double a;
    private final double b;
    private final double F;

    protected hly(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2, $$3, $$7);
        this.q = $$4;
        this.r = $$5;
        this.s = $$6;
        this.n = $$1;
        this.o = $$2;
        this.p = $$3;
        this.a = this.n;
        this.b = this.o;
        this.F = this.p;
        this.c = 0.1f * (this.y.i() * 0.2f + 0.5f);
        float $$8 = this.y.i() * 0.6f + 0.4f;
        this.d = $$8 * 0.9f;
        this.e = $$8 * 0.3f;
        this.f = $$8;
        this.A = (int)(this.y.i() * 10.0f) + 40;
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public void a(double $$0, double $$1, double $$2) {
        this.a(this.n().d($$0, $$1, $$2));
        this.l();
    }

    @Override
    public float b(float $$0) {
        float $$1 = ((float)this.z + $$0) / (float)this.A;
        $$1 = 1.0f - $$1;
        $$1 *= $$1;
        $$1 = 1.0f - $$1;
        return this.c * $$1;
    }

    @Override
    public int a(float $$0) {
        int $$1 = super.a($$0);
        float $$2 = (float)this.z / (float)this.A;
        $$2 *= $$2;
        $$2 *= $$2;
        int $$3 = $$1 & 0xFF;
        int $$4 = $$1 >> 16 & 0xFF;
        if (($$4 += (int)($$2 * 15.0f * 16.0f)) > 240) {
            $$4 = 240;
        }
        return $$3 | $$4 << 16;
    }

    @Override
    public void a() {
        float $$0;
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        if (this.z++ >= this.A) {
            this.k();
            return;
        }
        float $$1 = $$0 = (float)this.z / (float)this.A;
        $$0 = -$$0 + $$0 * $$0 * 2.0f;
        $$0 = 1.0f - $$0;
        this.n = this.a + this.q * (double)$$0;
        this.o = this.b + this.r * (double)$$0 + (double)(1.0f - $$1);
        this.p = this.F + this.s * (double)$$0;
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hly $$9 = new hly($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            return $$9;
        }
    }
}

