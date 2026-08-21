/*
 * Decompiled with CFR 0.152.
 */
public class hkl
extends hmg {
    hkl(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$7);
        float $$8;
        this.C = 0.7f;
        this.B = 0.5f;
        this.q *= (double)0.1f;
        this.r *= (double)0.1f;
        this.s *= (double)0.1f;
        this.q += $$4 * 0.4;
        this.r += $$5 * 0.4;
        this.s += $$6 * 0.4;
        this.d = $$8 = this.y.i() * 0.3f + 0.6f;
        this.e = $$8;
        this.f = $$8;
        this.c *= 0.75f;
        this.A = Math.max((int)(6.0 / ((double)this.y.i() * 0.8 + 0.6)), 1);
        this.u = false;
        this.a();
    }

    @Override
    public float b(float $$0) {
        return this.c * bgj.a(((float)this.z + $$0) / (float)this.A * 32.0f, 0.0f, 1.0f);
    }

    @Override
    public void a() {
        super.a();
        this.e *= 0.96f;
        this.f *= 0.9f;
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hkl $$9 = new hkl($$1, $$2, $$3, $$4, $$5, $$6 + 1.0, $$7, this.a.a($$8));
            $$9.a(20);
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
            hkl $$9 = new hkl($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            $$9.d *= 0.3f;
            $$9.e *= 0.8f;
            return $$9;
        }
    }

    public static class c
    implements hlu<md> {
        private final hmo a;

        public c(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hkl $$9 = new hkl($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            return $$9;
        }
    }
}

