/*
 * Decompiled with CFR 0.152.
 */
public class hle
extends hmg {
    private final hmo a;

    protected hle(hif $$0, double $$1, double $$2, double $$3, hmo $$4) {
        super($$0, $$1, $$2, $$3, $$4.a());
        this.a = $$4;
        this.a($$4);
        this.A = 12 + this.y.a(4);
        this.c = 1.0f;
        this.b(1.0f, 1.0f);
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public int a(float $$0) {
        return 0xF000F0;
    }

    @Override
    public void a() {
        if (this.z++ >= this.A) {
            this.k();
            return;
        }
        this.a(this.a);
    }

    public static class b
    implements hlu<md> {
        private final hmo a;

        public b(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hle $$9 = new hle($$1, $$2, $$3, $$4, this.a);
            ((hlq)$$9).d(0.15f);
            return $$9;
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
            return new hle($$1, $$2, $$3, $$4, this.a);
        }
    }
}

