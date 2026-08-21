/*
 * Decompiled with CFR 0.152.
 */
public class hki
extends hmg {
    hki(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2, $$3, $$7);
        this.b(0.02f, 0.02f);
        this.c *= this.y.i() * 0.6f + 0.2f;
        this.q = $$4 * (double)0.2f + (double)((this.y.i() * 2.0f - 1.0f) * 0.02f);
        this.r = $$5 * (double)0.2f + (double)((this.y.i() * 2.0f - 1.0f) * 0.02f);
        this.s = $$6 * (double)0.2f + (double)((this.y.i() * 2.0f - 1.0f) * 0.02f);
        this.A = (int)(8.0 / ((double)this.y.i() * 0.8 + 0.2));
    }

    @Override
    public void a() {
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        if (this.A-- <= 0) {
            this.k();
            return;
        }
        this.r += 0.002;
        this.a(this.q, this.r, this.s);
        this.q *= (double)0.85f;
        this.r *= (double)0.85f;
        this.s *= (double)0.85f;
        if (!this.j.b_(is.a(this.n, this.o, this.p)).a(bdv.a)) {
            this.k();
        }
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
            hki $$9 = new hki($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            return $$9;
        }
    }
}

