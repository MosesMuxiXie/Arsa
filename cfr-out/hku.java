/*
 * Decompiled with CFR 0.152.
 */
public class hku
extends hmf {
    hku(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, $$7, 0.0125f);
        this.q = $$4;
        this.r = $$5;
        this.s = $$6;
        this.c *= 0.75f;
        this.A = 60 + this.y.a(12);
        this.c(15916745);
        this.a($$7);
    }

    @Override
    public void a(double $$0, double $$1, double $$2) {
        this.a(this.n().d($$0, $$1, $$2));
        this.l();
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hku($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }
    }
}

