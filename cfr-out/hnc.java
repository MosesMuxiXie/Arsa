/*
 * Decompiled with CFR 0.152.
 */
public class hnc
extends hke {
    private static final int a = 12235202;

    protected hnc(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, hmo $$8) {
        super($$0, $$1, $$2, $$3, 0.1f, 0.1f, 0.1f, $$4, $$5, $$6, $$7, $$8, 0.3f, 8, -0.1f, true);
        this.d = 0.7294118f;
        this.e = 0.69411767f;
        this.f = 0.7607843f;
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hnc($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0f, this.a);
        }
    }
}

