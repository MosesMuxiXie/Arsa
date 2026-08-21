/*
 * Decompiled with CFR 0.152.
 */
public class hlb
extends hmg {
    private final double a;
    private final double b;
    private final double F;
    private final int G;
    private final int H;

    hlb(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, int $$7, int $$8, ilp $$9) {
        super($$0, $$1, $$2, $$3, $$9);
        this.q = $$4;
        this.r = $$5;
        this.s = $$6;
        this.a = $$1;
        this.b = $$2;
        this.F = $$3;
        this.k = $$1 + $$4;
        this.l = $$2 + $$5;
        this.m = $$3 + $$6;
        this.n = this.k;
        this.o = this.l;
        this.p = this.m;
        this.c = 0.1f * (this.y.i() * 0.5f + 0.2f);
        this.u = false;
        this.A = (int)(this.y.i() * 5.0f) + 25;
        this.G = $$7;
        this.H = $$8;
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public void a(double $$0, double $$1, double $$2) {
    }

    @Override
    public int a(float $$0) {
        return 240;
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
        float $$0 = (float)this.z / (float)this.A;
        float $$1 = 1.0f - $$0;
        this.n = this.a + this.q * (double)$$1;
        this.o = this.b + this.r * (double)$$1;
        this.p = this.F + this.s * (double)$$1;
        int $$2 = bel.a($$0, this.G, this.H);
        this.a((float)bel.c($$2) / 255.0f, (float)bel.d($$2) / 255.0f, (float)bel.e($$2) / 255.0f);
        this.e((float)bel.b($$2) / 255.0f);
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hlb $$9 = new hlb($$1, $$2, $$3, $$4, $$5, $$6, $$7, -12210434, -1, this.a.a($$8));
            $$9.d(bgj.b($$1.G_(), 3.0f, 5.0f));
            return $$9;
        }
    }
}

