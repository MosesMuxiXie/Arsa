/*
 * Decompiled with CFR 0.152.
 */
public class cod
extends cot {
    private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
    private final cum b;
    private final int c;
    private boolean d;

    public cod(cum $$0, int $$1) {
        this.b = $$0;
        this.c = cod.b($$1);
    }

    @Override
    public boolean b() {
        if (this.b.ep().a(this.c) != 0) {
            return false;
        }
        iz $$0 = this.b.dh();
        int $$1 = $$0.j();
        int $$2 = $$0.l();
        is $$3 = this.b.dK();
        for (int $$4 : a) {
            if (this.a($$3, $$1, $$2, $$4) && this.b($$3, $$1, $$2, $$4)) continue;
            return false;
        }
        return true;
    }

    private boolean a(is $$0, int $$1, int $$2, int $$3) {
        is $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
        return this.b.ao().b_($$4).a(bdv.a) && !this.b.ao().a_($$4).d();
    }

    private boolean b(is $$0, int $$1, int $$2, int $$3) {
        return this.b.ao().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).l() && this.b.ao().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).l();
    }

    @Override
    public boolean c() {
        double $$0 = this.b.dN().h;
        return !($$0 * $$0 < (double)0.03f && this.b.ee() != 0.0f && Math.abs(this.b.ee()) < 10.0f && this.b.by() || this.b.aV());
    }

    @Override
    public boolean W_() {
        return false;
    }

    @Override
    public void d() {
        iz $$0 = this.b.dh();
        this.b.k(this.b.dN().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
        this.b.N().n();
    }

    @Override
    public void e() {
        this.b.w(0.0f);
    }

    @Override
    public void a() {
        boolean $$0 = this.d;
        if (!$$0) {
            flb $$1 = this.b.ao().b_(this.b.dK());
            this.d = $$1.a(bdv.a);
        }
        if (this.d && !$$0) {
            this.b.a(bda.iA, 1.0f, 1.0f);
        }
        ftm $$2 = this.b.dN();
        if ($$2.h * $$2.h < (double)0.03f && this.b.ee() != 0.0f) {
            this.b.w(bgj.i(0.2f, this.b.ee(), 0.0f));
        } else if ($$2.g() > (double)1.0E-5f) {
            double $$3 = $$2.i();
            double $$4 = Math.atan2(-$$2.h, $$3) * 57.2957763671875;
            this.b.w((float)$$4);
        }
    }
}

