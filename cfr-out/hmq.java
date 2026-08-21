/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class hmq
extends hmg {
    hmq(hif $$0, double $$1, double $$2, double $$3, ilp $$4) {
        super($$0, $$1, $$2 - 0.125, $$3, $$4);
        this.b(0.01f, 0.01f);
        this.c *= this.y.i() * 0.6f + 0.2f;
        this.A = (int)(16.0 / ((double)this.y.i() * 0.8 + 0.2));
        this.u = false;
        this.C = 1.0f;
        this.B = 0.0f;
    }

    hmq(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        super($$0, $$1, $$2 - 0.125, $$3, $$4, $$5, $$6, $$7);
        this.b(0.01f, 0.01f);
        this.c *= this.y.i() * 0.6f + 0.6f;
        this.A = (int)(16.0 / ((double)this.y.i() * 0.8 + 0.2));
        this.u = false;
        this.C = 1.0f;
        this.B = 0.0f;
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    public static class d
    implements hlu<md> {
        private final hmo a;

        public d(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            double $$9 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
            hmq $$10 = new hmq($$1, $$2, $$3, $$4, 0.0, $$9, 0.0, this.a.a($$8));
            $$10.a(0.1f, 0.1f, 0.3f);
            $$10.b(0.001f, 0.001f);
            return $$10;
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
            double $$9 = $$8.k() * (double)1.0E-6f;
            double $$10 = $$8.k() * (double)1.0E-4f;
            double $$11 = $$8.k() * (double)1.0E-6f;
            hmq $$12 = new hmq($$1, $$2, $$3, $$4, $$9, $$10, $$11, this.a.a($$8));
            $$12.a(0.9f, 0.4f, 0.5f);
            return $$12;
        }
    }

    public static class b
    implements hlu<md> {
        private final hmo a;

        public b(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hmq $$9 = new hmq(this, $$1, $$2, $$3, $$4, 0.0, -0.8f, 0.0, this.a.a($$8)){

                @Override
                public Optional<lv> o() {
                    return Optional.of(lv.a);
                }
            };
            $$9.A = bgj.b($$8, 500, 1000);
            $$9.B = 0.01f;
            $$9.a(0.32f, 0.5f, 0.22f);
            return $$9;
        }
    }

    public static class c
    implements hlu<md> {
        private final hmo a;

        public c(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hmq $$9 = new hmq($$1, $$2, $$3, $$4, this.a.a($$8));
            $$9.a(0.4f, 0.4f, 0.7f);
            return $$9;
        }
    }
}

