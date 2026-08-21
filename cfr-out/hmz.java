/*
 * Decompiled with CFR 0.152.
 */
public class hmz
extends hmg {
    private float a;

    hmz(hif $$0, double $$1, double $$2, double $$3, ilp $$4) {
        super($$0, $$1, $$2, $$3, $$4);
        this.A = (int)(this.y.i() * 60.0f) + 30;
        this.u = false;
        this.q = 0.0;
        this.r = -0.05;
        this.s = 0.0;
        this.b(0.02f, 0.02f);
        this.c *= this.y.i() * 0.6f + 0.2f;
        this.B = 0.002f;
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
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
        float $$0 = 0.6f;
        this.q += (double)(0.6f * bgj.b((double)this.a));
        this.s += (double)(0.6f * bgj.a((double)this.a));
        this.q *= 0.07;
        this.s *= 0.07;
        this.a(this.q, this.r, this.s);
        if (!this.j.b_(is.a(this.n, this.o, this.p)).a(bdv.a) || this.t) {
            this.k();
        }
        this.a += 0.08f;
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hmz($$1, $$2, $$3, $$4, this.a.a($$8));
        }
    }
}

