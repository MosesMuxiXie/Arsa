/*
 * Decompiled with CFR 0.152.
 */
public class hkj
extends hmg {
    private final hmo a;

    hkj(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, hmo $$7) {
        super($$0, $$1, $$2, $$3, $$7.a());
        this.a = $$7;
        this.A = 4;
        this.B = 0.008f;
        this.q = $$4;
        this.r = $$5;
        this.s = $$6;
        this.a($$7);
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
        this.r -= (double)this.B;
        this.a(this.q, this.r, this.s);
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
            return new hkj($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
        }
    }
}

