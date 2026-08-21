/*
 * Decompiled with CFR 0.152.
 */
public class hkm
extends hmg {
    private static final int a = 11993298;
    private static final int b = 14614777;
    private static final float F = 0.7176471f;
    private static final float G = 0.0f;
    private static final float H = 0.8235294f;
    private static final float I = 0.8745098f;
    private static final float J = 0.0f;
    private static final float K = 0.9764706f;
    private boolean L;
    private final hmo M;

    hkm(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, $$7.a());
        this.C = 0.96f;
        this.q = $$4;
        this.r = $$5;
        this.s = $$6;
        this.d = bgj.a(this.y, 0.7176471f, 0.8745098f);
        this.e = bgj.a(this.y, 0.0f, 0.0f);
        this.f = bgj.a(this.y, 0.8235294f, 0.9764706f);
        this.c *= 0.75f;
        this.A = (int)(20.0 / ((double)this.y.i() * 0.8 + 0.2));
        this.L = false;
        this.u = false;
        this.M = $$7;
        this.a($$7);
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
        this.a(this.M);
        if (this.t) {
            this.r = 0.0;
            this.L = true;
        }
        if (this.L) {
            this.r += 0.002;
        }
        this.a(this.q, this.r, this.s);
        if (this.o == this.l) {
            this.q *= 1.1;
            this.s *= 1.1;
        }
        this.q *= (double)this.C;
        this.s *= (double)this.C;
        if (this.L) {
            this.r *= (double)this.C;
        }
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public float b(float $$0) {
        return this.c * bgj.a(((float)this.z + $$0) / (float)this.A * 32.0f, 0.0f, 1.0f);
    }

    public static class a
    implements hlu<lz> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(lz $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hkm $$9 = new hkm($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$9.c($$0.b());
            return $$9;
        }
    }
}

