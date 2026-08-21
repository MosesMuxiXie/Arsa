/*
 * Decompiled with CFR 0.152.
 */
public class hmh
extends hke {
    protected hmh(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, hmo $$8) {
        super($$0, $$1, $$2, $$3, 0.1f, 0.1f, 0.1f, $$4, $$5, $$6, $$7, $$8, 0.3f, 8, -0.1f, true);
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hmh($$1, $$2, $$3, $$4, $$5, $$6, $$7, 1.0f, this.a);
        }
    }
}

