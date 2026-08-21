/*
 * Decompiled with CFR 0.152.
 */
public class hmy
extends hmg {
    private final hmo a;

    hmy(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$7.a());
        this.a = $$7;
        this.q *= (double)0.3f;
        this.r = this.y.i() * 0.2f + 0.1f;
        this.s *= (double)0.3f;
        this.b(0.01f, 0.01f);
        this.A = (int)(8.0 / ((double)this.y.i() * 0.8 + 0.2));
        this.a($$7);
        this.B = 0.0f;
        this.q = $$4;
        this.r = $$5;
        this.s = $$6;
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public void a() {
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        int $$0 = 60 - this.A;
        if (this.A-- <= 0) {
            this.k();
            return;
        }
        this.r -= (double)this.B;
        this.a(this.q, this.r, this.s);
        this.q *= (double)0.98f;
        this.r *= (double)0.98f;
        this.s *= (double)0.98f;
        float $$1 = (float)$$0 * 0.001f;
        this.b($$1, $$1);
        this.a(this.a.a($$0 % 4, 4));
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hmy($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }
    }
}

