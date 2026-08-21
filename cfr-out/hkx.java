/*
 * Decompiled with CFR 0.152.
 */
public class hkx
extends hmg {
    private static final float a = 0.0025f;
    private static final int b = 300;
    private static final int F = 300;
    private float G;
    private final float H;
    private final float I;
    private final boolean J;
    private final boolean K;
    private final double L;
    private final double M;
    private final double N;

    protected hkx(hif $$0, double $$1, double $$2, double $$3, ilp $$4, float $$5, float $$6, boolean $$7, boolean $$8, float $$9, float $$10) {
        super($$0, $$1, $$2, $$3, $$4);
        float $$11;
        this.G = (float)Math.toRadians(this.y.h() ? -30.0 : 30.0);
        this.H = (float)Math.toRadians(this.y.h() ? -5.0 : 5.0);
        this.I = $$6;
        this.J = $$7;
        this.K = $$8;
        this.A = 300;
        this.B = $$5 * 1.2f * 0.0025f;
        this.c = $$11 = $$9 * (this.y.h() ? 0.05f : 0.075f);
        this.b($$11, $$11);
        this.C = 1.0f;
        this.r = -$$10;
        float $$12 = this.y.i();
        this.L = Math.cos(Math.toRadians($$12 * 60.0f)) * (double)this.I;
        this.M = Math.sin(Math.toRadians($$12 * 60.0f)) * (double)this.I;
        this.N = Math.toRadians(1000.0f + $$12 * 3000.0f);
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public void a() {
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        if (this.A-- <= 0) {
            this.k();
        }
        if (this.v) {
            return;
        }
        float $$0 = 300 - this.A;
        float $$1 = Math.min($$0 / 300.0f, 1.0f);
        double $$2 = 0.0;
        double $$3 = 0.0;
        if (this.K) {
            $$2 += this.L * Math.pow($$1, 1.25);
            $$3 += this.M * Math.pow($$1, 1.25);
        }
        if (this.J) {
            $$2 += (double)$$1 * Math.cos((double)$$1 * this.N) * (double)this.I;
            $$3 += (double)$$1 * Math.sin((double)$$1 * this.N) * (double)this.I;
        }
        this.q += $$2 * (double)0.0025f;
        this.s += $$3 * (double)0.0025f;
        this.r -= (double)this.B;
        this.G += this.H / 20.0f;
        this.i = this.h;
        this.h += this.G / 20.0f;
        this.a(this.q, this.r, this.s);
        if (this.t || this.A < 299 && (this.q == 0.0 || this.s == 0.0)) {
            this.k();
        }
        if (this.v) {
            return;
        }
        this.q *= (double)this.C;
        this.r *= (double)this.C;
        this.s *= (double)this.C;
    }

    public static class c
    implements hlu<lq> {
        private final hmo a;

        public c(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(lq $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hkx $$9 = new hkx($$1, $$2, $$3, $$4, this.a.a($$8), 0.07f, 10.0f, true, false, 2.0f, 0.021f);
            $$9.a($$0.b(), $$0.c(), $$0.d());
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
            return new hkx($$1, $$2, $$3, $$4, this.a.a($$8), 0.07f, 10.0f, true, false, 2.0f, 0.021f);
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
            return new hkx($$1, $$2, $$3, $$4, this.a.a($$8), 0.25f, 2.0f, false, true, 1.0f, 0.0f);
        }
    }
}

