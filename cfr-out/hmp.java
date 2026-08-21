/*
 * Decompiled with CFR 0.152.
 */
public class hmp
extends hmf {
    hmp(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, int $$7, hmo $$8) {
        super($$0, $$1, $$2, $$3, $$8, 0.0f);
        this.C = 0.92f;
        this.c = 0.5f;
        this.e(1.0f);
        this.a(bel.n($$7), bel.o($$7), bel.p($$7));
        this.A = (int)(this.c * 12.0f / (this.y.i() * 0.8f + 0.2f));
        this.a($$8);
        this.u = false;
        this.q = $$4;
        this.r = $$5;
        this.s = $$6;
    }

    @Override
    public void a() {
        super.a();
        if (!this.v) {
            this.a(this.a);
            if (this.z > this.A / 2) {
                this.e(1.0f - ((float)this.z - (float)(this.A / 2)) / (float)this.A);
            }
            if (this.j.a_(is.a(this.n, this.o, this.p)).l()) {
                this.r -= (double)0.0074f;
            }
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
            return new hmp($$1, $$2, $$3, $$4, $$5, $$6, $$7, bel.a(1.0f, 0.2f, 0.8f, 0.6f), this.a);
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
            return new hmp($$1, $$2, $$3, $$4, $$5, $$6, $$7, -16777216, this.a);
        }
    }
}

