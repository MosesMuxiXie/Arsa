/*
 * Decompiled with CFR 0.152.
 */
public class hlg
extends hmg {
    hlg(hif $$0, double $$1, double $$2, double $$3, ilp $$4) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$4);
        this.D = true;
        this.C = 0.86f;
        this.q *= (double)0.01f;
        this.r *= (double)0.01f;
        this.s *= (double)0.01f;
        this.r += 0.1;
        this.c *= 1.5f;
        this.A = 16;
        this.u = false;
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
            hlg $$9 = new hlg($$1, $$2, $$3 + 0.5, $$4, this.a.a($$8));
            $$9.a(1.0f, 1.0f, 1.0f);
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
            hlg $$9 = new hlg($$1, $$2, $$3, $$4, this.a.a($$8));
            return $$9;
        }
    }
}

