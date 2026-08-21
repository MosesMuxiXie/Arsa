/*
 * Decompiled with CFR 0.152.
 */
public class hll
extends hmh {
    protected hll(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, 2.5f, $$7);
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hll($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }
    }
}

