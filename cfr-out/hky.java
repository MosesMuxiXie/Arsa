/*
 * Decompiled with CFR 0.152.
 */
public class hky
extends hmg {
    private static final float a = 0.3f;
    private static final float b = 0.1f;
    private static final float F = 0.5f;
    private static final float G = 0.3f;
    private static final int H = 200;
    private static final int I = 300;

    hky(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        this.D = true;
        this.C = 0.96f;
        this.c *= 0.75f;
        this.r *= (double)0.8f;
        this.q *= (double)0.8f;
        this.s *= (double)0.8f;
    }

    @Override
    public hmg.b b() {
        return hmg.b.d;
    }

    @Override
    public int a(float $$0) {
        return (int)(255.0f * hky.b(this.f((float)this.z + $$0), 0.1f, 0.3f));
    }

    @Override
    public void a() {
        super.a();
        if (!this.j.a_(is.a(this.n, this.o, this.p)).l()) {
            this.k();
            return;
        }
        this.e(hky.b(this.f(this.z), 0.3f, 0.5f));
        if (this.y.i() > 0.95f || this.z == 1) {
            this.b(-0.05f + 0.1f * this.y.i(), -0.05f + 0.1f * this.y.i(), -0.05f + 0.1f * this.y.i());
        }
    }

    private float f(float $$0) {
        return bgj.a($$0 / (float)this.A, 0.0f, 1.0f);
    }

    private static float b(float $$0, float $$1, float $$2) {
        if ($$0 >= 1.0f - $$1) {
            return (1.0f - $$0) / $$1;
        }
        if ($$0 <= $$2) {
            return $$0 / $$2;
        }
        return 1.0f;
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hky $$9 = new hky($$1, $$2, $$3, $$4, 0.5 - $$8.j(), $$8.h() ? $$6 : -$$6, 0.5 - $$8.j(), this.a.a($$8));
            $$9.a($$8.a(200, 300));
            $$9.d(1.5f);
            $$9.e(0.0f);
            return $$9;
        }
    }
}

