/*
 * Decompiled with CFR 0.152.
 */
public class hmr
extends hmg {
    hmr(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        float $$8;
        this.d = $$8 = this.y.i() * 0.1f + 0.2f;
        this.e = $$8;
        this.f = $$8;
        this.b(0.02f, 0.02f);
        this.c *= this.y.i() * 0.6f + 0.5f;
        this.q *= (double)0.02f;
        this.r *= (double)0.02f;
        this.s *= (double)0.02f;
        this.A = (int)(20.0 / ((double)this.y.i() * 0.8 + 0.2));
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public void a(double $$0, double $$1, double $$2) {
        this.a(this.n().d($$0, $$1, $$2));
        this.l();
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
        this.a(this.q, this.r, this.s);
        this.q *= 0.99;
        this.r *= 0.99;
        this.s *= 0.99;
    }

    public static class c
    implements hlu<md> {
        private final hmo a;

        public c(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hmr $$9 = new hmr($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
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
            hmr $$9 = new hmr($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            $$9.a(0.3f, 0.5f, 1.0f);
            $$9.e(1.0f - $$8.i() * 0.7f);
            $$9.a($$9.j() / 2);
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
            hmr $$9 = new hmr($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            $$9.a(1.0f, 1.0f, 1.0f);
            $$9.a(3 + $$1.G_().a(5));
            return $$9;
        }
    }

    public static class d
    implements hlu<md> {
        private final hmo a;

        public d(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hmr $$9 = new hmr($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
            $$9.a(1.0f, 1.0f, 1.0f);
            return $$9;
        }
    }

    public static class e
    implements hlu<md> {
        private final hmo a;

        public e(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hmr($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
        }
    }
}

