/*
 * Decompiled with CFR 0.152.
 */
public class hmk
extends hmb {
    private final hmo b;
    protected boolean a;

    hmk(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7.a());
        this.b = $$7;
        this.d(1.5f);
        this.a($$7);
    }

    @Override
    public int a(float $$0) {
        if (this.a) {
            return 240;
        }
        return super.a($$0);
    }

    @Override
    public hmg.b b() {
        return hmg.b.d;
    }

    @Override
    public void a() {
        super.a();
        this.a(this.b);
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hmk $$9 = new hmk($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$9.e(1.0f);
            $$9.a = true;
            return $$9;
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
            hmk $$9 = new hmk($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
            $$9.e(1.0f);
            return $$9;
        }
    }
}

