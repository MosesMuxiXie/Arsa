/*
 * Decompiled with CFR 0.152.
 */
public class hmj
extends hlh {
    protected hmj(hif $$0, double $$1, double $$2, double $$3, double $$4, hmo $$5) {
        super($$0, $$1, $$2, $$3, $$4, $$5);
        this.A = 16;
        this.c = 1.5f;
        this.a($$5);
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hmj($$1, $$2, $$3, $$4, $$5, this.a);
        }
    }
}

