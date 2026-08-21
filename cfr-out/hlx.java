/*
 * Decompiled with CFR 0.152.
 */
public class hlx
extends hmg {
    private final hmo a;

    hlx(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$7.a());
        float $$9;
        this.C = 0.96f;
        this.a = $$7;
        float $$8 = 2.5f;
        this.q *= (double)0.1f;
        this.r *= (double)0.1f;
        this.s *= (double)0.1f;
        this.q += $$4;
        this.r += $$5;
        this.s += $$6;
        this.d = $$9 = 1.0f - this.y.i() * 0.3f;
        this.e = $$9;
        this.f = $$9;
        this.c *= 1.875f;
        int $$10 = (int)(8.0 / ((double)this.y.i() * 0.8 + 0.3));
        this.A = (int)Math.max((float)$$10 * 2.5f, 1.0f);
        this.u = false;
        this.a($$7);
    }

    @Override
    public hmg.b b() {
        return hmg.b.d;
    }

    @Override
    public float b(float $$0) {
        return this.c * bgj.a(((float)this.z + $$0) / (float)this.A * 32.0f, 0.0f, 1.0f);
    }

    @Override
    public void a() {
        super.a();
        if (!this.v) {
            double $$1;
            this.a(this.a);
            ddm $$0 = this.j.a(this.n, this.o, this.p, 2.0, false);
            if ($$0 != null && this.o > ($$1 = $$0.dR())) {
                this.o += ($$1 - this.o) * 0.2;
                this.r += ($$0.dN().h - this.r) * 0.2;
                this.c(this.n, this.o, this.p);
            }
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
            hlx $$9 = new hlx($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$9.a(0.22f, 1.0f, 0.53f);
            $$9.e(0.4f);
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
            return new hlx($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }
    }
}

