/*
 * Decompiled with CFR 0.152.
 */
public class hkv
extends hmg {
    private final hmo a;

    protected hkv(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, $$7.a());
        float $$8;
        this.B = -0.1f;
        this.C = 0.9f;
        this.a = $$7;
        this.q = $$4 + (double)((this.y.i() * 2.0f - 1.0f) * 0.05f);
        this.r = $$5 + (double)((this.y.i() * 2.0f - 1.0f) * 0.05f);
        this.s = $$6 + (double)((this.y.i() * 2.0f - 1.0f) * 0.05f);
        this.d = $$8 = this.y.i() * 0.3f + 0.7f;
        this.e = $$8;
        this.f = $$8;
        this.c = 0.1f * (this.y.i() * this.y.i() * 6.0f + 1.0f);
        this.A = (int)(16.0 / ((double)this.y.i() * 0.8 + 0.2)) + 2;
        this.a($$7);
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public void a() {
        super.a();
        this.a(this.a);
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hkv($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }
    }
}

