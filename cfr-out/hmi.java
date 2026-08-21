/*
 * Decompiled with CFR 0.152.
 */
public class hmi
extends hmg {
    private final hmo a;

    protected hmi(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, $$7.a());
        this.B = 0.225f;
        this.C = 1.0f;
        this.a = $$7;
        this.q = $$4 + (double)((this.y.i() * 2.0f - 1.0f) * 0.05f);
        this.r = $$5 + (double)((this.y.i() * 2.0f - 1.0f) * 0.05f);
        this.s = $$6 + (double)((this.y.i() * 2.0f - 1.0f) * 0.05f);
        this.c = 0.1f * (this.y.i() * this.y.i() * 1.0f + 1.0f);
        this.A = (int)(16.0 / ((double)this.y.i() * 0.8 + 0.2)) + 2;
        this.a($$7);
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public void a() {
        super.a();
        this.a(this.a);
        this.q *= (double)0.95f;
        this.r *= (double)0.9f;
        this.s *= (double)0.95f;
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hmi $$9 = new hmi($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$9.a(0.923f, 0.964f, 0.999f);
            return $$9;
        }
    }
}

