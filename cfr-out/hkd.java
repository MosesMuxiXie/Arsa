/*
 * Decompiled with CFR 0.152.
 */
public class hkd
extends hmg {
    private final hmo a;

    hkd(hif $$0, double $$1, double $$2, double $$3, double $$4, hmo $$5) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$5.a());
        float $$6;
        this.a = $$5;
        this.A = 4;
        this.d = $$6 = this.y.i() * 0.6f + 0.4f;
        this.e = $$6;
        this.f = $$6;
        this.c = 1.0f - (float)$$4 * 0.5f;
        this.a($$5);
    }

    @Override
    public int a(float $$0) {
        return 0xF000F0;
    }

    @Override
    public void a() {
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        if (this.z++ >= this.A) {
            this.k();
            return;
        }
        this.a(this.a);
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hkd($$1, $$2, $$3, $$4, $$5, this.a);
        }
    }
}

