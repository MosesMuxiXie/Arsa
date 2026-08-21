/*
 * Decompiled with CFR 0.152.
 */
public class hlc
extends hmg {
    private final double a;
    private final double b;
    private final double F;
    private final boolean G;
    private final hlq.a H;

    hlc(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, false, hlq.a.a, $$7);
    }

    hlc(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, boolean $$7, hlq.a $$8, ilp $$9) {
        super($$0, $$1, $$2, $$3, $$9);
        this.G = $$7;
        this.H = $$8;
        this.e($$8.b());
        this.q = $$4;
        this.r = $$5;
        this.s = $$6;
        this.a = $$1;
        this.b = $$2;
        this.F = $$3;
        this.k = $$1 + $$4;
        this.l = $$2 + $$5;
        this.m = $$3 + $$6;
        this.n = this.k;
        this.o = this.l;
        this.p = this.m;
        this.c = 0.1f * (this.y.i() * 0.5f + 0.2f);
        float $$10 = this.y.i() * 0.6f + 0.4f;
        this.d = 0.9f * $$10;
        this.e = 0.9f * $$10;
        this.f = $$10;
        this.u = false;
        this.A = (int)(this.y.i() * 10.0f) + 30;
    }

    @Override
    public hmg.b b() {
        if (this.H.a()) {
            return hmg.b.c;
        }
        return hmg.b.d;
    }

    @Override
    public void a(double $$0, double $$1, double $$2) {
        this.a(this.n().d($$0, $$1, $$2));
        this.l();
    }

    @Override
    public int a(float $$0) {
        if (this.G) {
            return 240;
        }
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
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        if (this.z++ >= this.A) {
            this.k();
            return;
        }
        float $$0 = (float)this.z / (float)this.A;
        $$0 = 1.0f - $$0;
        float $$1 = 1.0f - $$0;
        $$1 *= $$1;
        $$1 *= $$1;
        this.n = this.a + this.q * (double)$$0;
        this.o = this.b + this.r * (double)$$0 - (double)($$1 * 1.2f);
        this.p = this.F + this.s * (double)$$0;
    }

    @Override
    public void a(iku $$0, ger $$1, float $$2) {
        this.e(this.H.a(this.z, this.A, $$2));
        super.a($$0, $$1, $$2);
    }

    public static class c
    implements hlu<md> {
        private final hmo a;

        public c(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hlc $$9 = new hlc($$1, $$2, $$3, $$4, $$5, $$6, $$7, true, new hlq.a(0.0f, 0.6f, 0.25f, 1.0f), this.a.a($$8));
            $$9.d(1.5f);
            return $$9;
        }
    }

    public static class b
    implements hlu<md> {
        private final hmo a;

        public b(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hlc $$9 = new hlc($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            return $$9;
        }
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hlc $$9 = new hlc($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            return $$9;
        }
    }
}

