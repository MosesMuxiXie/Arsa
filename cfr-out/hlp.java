/*
 * Decompiled with CFR 0.152.
 */
public class hlp
extends hmg {
    hlp(hif $$0, double $$1, double $$2, double $$3, double $$4, ilp $$5) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$5);
        this.C = 0.66f;
        this.D = true;
        this.q *= (double)0.01f;
        this.r *= (double)0.01f;
        this.s *= (double)0.01f;
        this.r += 0.2;
        this.d = Math.max(0.0f, bgj.a((double)(((float)$$4 + 0.0f) * ((float)Math.PI * 2))) * 0.65f + 0.35f);
        this.e = Math.max(0.0f, bgj.a((double)(((float)$$4 + 0.33333334f) * ((float)Math.PI * 2))) * 0.65f + 0.35f);
        this.f = Math.max(0.0f, bgj.a((double)(((float)$$4 + 0.6666667f) * ((float)Math.PI * 2))) * 0.65f + 0.35f);
        this.c *= 1.5f;
        this.A = 6;
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
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hlp $$9 = new hlp($$1, $$2, $$3, $$4, $$5, this.a.a($$8));
            return $$9;
        }
    }
}

