/*
 * Decompiled with CFR 0.152.
 */
public class hmn
extends hna {
    hmn(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2, $$3, $$7);
        this.B = 0.04f;
        if ($$5 == 0.0 && ($$4 != 0.0 || $$6 != 0.0)) {
            this.q = $$4;
            this.r = 0.1;
            this.s = $$6;
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
            return new hmn($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a.a($$8));
        }
    }
}

