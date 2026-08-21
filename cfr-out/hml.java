/*
 * Decompiled with CFR 0.152.
 */
public class hml
extends hmg {
    private static final bgr a = bgr.a();
    private final hmo b;
    private float F = 1.0f;

    hml(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, 0.5 - a.j(), $$5, 0.5 - a.j(), $$7.a());
        this.C = 0.96f;
        this.B = -0.1f;
        this.D = true;
        this.b = $$7;
        this.r *= (double)0.2f;
        if ($$4 == 0.0 && $$6 == 0.0) {
            this.q *= (double)0.1f;
            this.s *= (double)0.1f;
        }
        this.c *= 0.75f;
        this.A = (int)(8.0 / ((double)this.y.i() * 0.8 + 0.2));
        this.u = false;
        this.a($$7);
        if (this.g()) {
            this.e(0.0f);
        }
    }

    @Override
    public hmg.b b() {
        return hmg.b.d;
    }

    @Override
    public void a() {
        super.a();
        this.a(this.b);
        this.g = this.g() ? 0.0f : bgj.h(0.05f, this.g, this.F);
    }

    @Override
    protected void e(float $$0) {
        super.e($$0);
        this.F = $$0;
    }

    private boolean g() {
        gfj $$0 = gfj.V();
        hnh $$1 = $$0.s;
        return $$1 != null && $$1.bV().c(this.n, this.o, this.p) <= 9.0 && $$0.k.aV().a() && $$1.hj();
    }

    public static class a
    implements hlu<me> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(me $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hml $$9 = new hml($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$9.a($$0.b(), $$0.c(), $$0.d());
            $$9.c($$0.e());
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
            hml $$9 = new hml($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            float $$10 = $$8.i() * 0.5f + 0.35f;
            $$9.a(1.0f * $$10, 0.0f * $$10, 1.0f * $$10);
            return $$9;
        }
    }

    public static class b
    implements hlu<lq> {
        private final hmo a;

        public b(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(lq $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hml $$9 = new hml($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$9.a($$0.b(), $$0.c(), $$0.d());
            $$9.e($$0.e());
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
            return new hml($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }
    }
}

