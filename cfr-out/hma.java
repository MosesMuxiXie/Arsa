/*
 * Decompiled with CFR 0.152.
 */
public class hma
extends hly {
    hma(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        this.c *= 1.5f;
        this.A = (int)(this.y.i() * 2.0f) + 60;
    }

    @Override
    public float b(float $$0) {
        float $$1 = 1.0f - ((float)this.z + $$0) / ((float)this.A * 1.5f);
        return this.c * $$1;
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
        this.n += this.q * (double)$$0;
        this.o += this.r * (double)$$0;
        this.p += this.s * (double)$$0;
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hma $$9 = new hma($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            return $$9;
        }
    }
}

