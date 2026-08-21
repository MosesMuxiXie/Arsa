/*
 * Decompiled with CFR 0.152.
 */
public class hna
extends hmg {
    protected hna(hif $$0, double $$1, double $$2, double $$3, ilp $$4) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$4);
        this.q *= (double)0.3f;
        this.r = this.y.i() * 0.2f + 0.1f;
        this.s *= (double)0.3f;
        this.b(0.01f, 0.01f);
        this.B = 0.06f;
        this.A = (int)(8.0 / ((double)this.y.i() * 0.8 + 0.2));
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public void a() {
        is $$0;
        double $$1;
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        if (this.A-- <= 0) {
            this.k();
            return;
        }
        this.r -= (double)this.B;
        this.a(this.q, this.r, this.s);
        this.q *= (double)0.98f;
        this.r *= (double)0.98f;
        this.s *= (double)0.98f;
        if (this.t) {
            if (this.y.i() < 0.5f) {
                this.k();
            }
            this.q *= (double)0.7f;
            this.s *= (double)0.7f;
        }
        if (($$1 = Math.max(this.j.a_($$0 = is.a(this.n, this.o, this.p)).g(this.j, $$0).b(iz.a.b, this.n - (double)$$0.u(), this.p - (double)$$0.w()), (double)this.j.b_($$0).a(this.j, $$0))) > 0.0 && this.o < (double)$$0.v() + $$1) {
            this.k();
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
            return new hna($$1, $$2, $$3, $$4, this.a.a($$8));
        }
    }
}

