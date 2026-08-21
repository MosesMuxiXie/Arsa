/*
 * Decompiled with CFR 0.152.
 */
public class hkr
extends hke {
    private static final int a = 12235202;

    protected hkr(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, hmo $$8) {
        super($$0, $$1, $$2, $$3, 0.7f, 0.6f, 0.7f, $$4, $$5 + (double)0.15f, $$6, $$7, $$8, 0.5f, 7, 0.5f, false);
        float $$9 = this.y.i() * 0.2f;
        this.d = (float)bel.c(12235202) / 255.0f - $$9;
        this.e = (float)bel.d(12235202) / 255.0f - $$9;
        this.f = (float)bel.e(12235202) / 255.0f - $$9;
    }

    @Override
    public void a() {
        this.B = 0.88f * this.B;
        this.C = 0.92f * this.C;
        super.a();
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hkr($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0f, this.a);
        }
    }
}

