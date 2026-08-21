/*
 * Decompiled with CFR 0.152.
 */
public class hnb
extends hke {
    private static final int a = 12235202;

    protected hnb(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, hmo $$8) {
        super($$0, $$1, $$2, $$3, 0.1f, -0.1f, 0.1f, $$4, $$5, $$6, $$7, $$8, 0.0f, 20, 0.0125f, false);
        this.d = (float)bel.c(12235202) / 255.0f;
        this.e = (float)bel.d(12235202) / 255.0f;
        this.f = (float)bel.e(12235202) / 255.0f;
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            double $$9 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
            double $$10 = (double)$$8.i() * -0.5 * (double)$$8.i() * 0.1 * 5.0;
            double $$11 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
            return new hnb($$1, $$2, $$3, $$4, $$9, $$10, $$11, 1.0f, this.a);
        }
    }
}

