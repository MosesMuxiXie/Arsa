/*
 * Decompiled with CFR 0.152.
 */
public class hmv
extends hmg {
    private final ftm a;

    hmv(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ftm $$7, int $$8, ilp $$9) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$9);
        $$8 = bel.a($$8, 0.875f + this.y.i() * 0.25f, 0.875f + this.y.i() * 0.25f, 0.875f + this.y.i() * 0.25f);
        this.d = (float)bel.c($$8) / 255.0f;
        this.e = (float)bel.d($$8) / 255.0f;
        this.f = (float)bel.e($$8) / 255.0f;
        this.c = 0.26f;
        this.a = $$7;
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
        if (this.z++ >= this.A) {
            this.k();
            return;
        }
        int $$0 = this.A - this.z;
        double $$1 = 1.0 / (double)$$0;
        this.n = bgj.d($$1, this.n, this.a.a());
        this.o = bgj.d($$1, this.o, this.a.b());
        this.p = bgj.d($$1, this.p, this.a.c());
    }

    @Override
    public int a(float $$0) {
        return 0xF000F0;
    }

    public static class a
    implements hlu<mf> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(mf $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hmv $$9 = new hmv($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$0.b(), $$0.c(), this.a.a($$8));
            $$9.a($$0.d());
            return $$9;
        }
    }
}

