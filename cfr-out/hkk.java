/*
 * Decompiled with CFR 0.152.
 */
public class hkk
extends hmg {
    hkk(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, boolean $$7, ilp $$8) {
        super($$0, $$1, $$2, $$3, $$8);
        this.d(3.0f);
        this.b(0.25f, 0.25f);
        this.A = $$7 ? this.y.a(50) + 280 : this.y.a(50) + 80;
        this.B = 3.0E-6f;
        this.q = $$4;
        this.r = $$5 + (double)(this.y.i() / 500.0f);
        this.s = $$6;
    }

    @Override
    public void a() {
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        if (this.z++ >= this.A || this.g <= 0.0f) {
            this.k();
            return;
        }
        this.q += (double)(this.y.i() / 5000.0f * (float)(this.y.h() ? 1 : -1));
        this.s += (double)(this.y.i() / 5000.0f * (float)(this.y.h() ? 1 : -1));
        this.r -= (double)this.B;
        this.a(this.q, this.r, this.s);
        if (this.z >= this.A - 60 && this.g > 0.01f) {
            this.g -= 0.015f;
        }
    }

    @Override
    public hmg.b b() {
        return hmg.b.d;
    }

    public static class b
    implements hlu<md> {
        private final hmo a;

        public b(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hkk $$9 = new hkk($$1, $$2, $$3, $$4, $$5, $$6, $$7, true, this.a.a($$8));
            $$9.e(0.95f);
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
            hkk $$9 = new hkk($$1, $$2, $$3, $$4, $$5, $$6, $$7, false, this.a.a($$8));
            $$9.e(0.9f);
            return $$9;
        }
    }
}

