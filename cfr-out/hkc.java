/*
 * Decompiled with CFR 0.152.
 */
public class hkc
extends hke {
    protected hkc(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, hmo $$8) {
        super($$0, $$1, $$2, $$3, 0.1f, -0.1f, 0.1f, $$4, $$5, $$6, $$7, $$8, 0.5f, 20, 0.1f, false);
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hkc($$1, $$2, $$3, $$4, 0.0, 0.0, 0.0, 1.0f, this.a);
        }
    }
}

