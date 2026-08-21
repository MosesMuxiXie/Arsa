/*
 * Decompiled with CFR 0.152.
 */
public abstract class ffm
extends ffs {
    protected final int a;
    protected final int b;
    protected final int c;
    protected int d = -1;

    protected ffm(fgf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, iz $$7) {
        super($$0, 0, ffs.a($$1, $$2, $$3, $$7, $$4, $$5, $$6));
        this.a = $$4;
        this.b = $$5;
        this.c = $$6;
        this.a($$7);
    }

    protected ffm(fgf $$0, uz $$1) {
        super($$0, $$1);
        this.a = $$1.b("Width", 0);
        this.b = $$1.b("Height", 0);
        this.c = $$1.b("Depth", 0);
        this.d = $$1.b("HPos", 0);
    }

    @Override
    protected void a(fge $$0, uz $$1) {
        $$1.a("Width", this.a);
        $$1.a("Height", this.b);
        $$1.a("Depth", this.c);
        $$1.a("HPos", this.d);
    }

    protected boolean a(dwp $$0, ffg $$1, int $$2) {
        if (this.d >= 0) {
            return true;
        }
        int $$3 = 0;
        int $$4 = 0;
        is.a $$5 = new is.a();
        for (int $$6 = this.f.j(); $$6 <= this.f.m(); ++$$6) {
            for (int $$7 = this.f.h(); $$7 <= this.f.k(); ++$$7) {
                $$5.d($$7, 64, $$6);
                if (!$$1.b($$5)) continue;
                $$3 += $$0.a(euq.a.f, (is)$$5).v();
                ++$$4;
            }
        }
        if ($$4 == 0) {
            return false;
        }
        this.d = $$3 / $$4;
        this.f.a(0, this.d - this.f.i() + $$2, 0);
        return true;
    }

    protected boolean a(dwp $$0, int $$1) {
        if (this.d >= 0) {
            return true;
        }
        int $$2 = $$0.aw() + 1;
        boolean $$3 = false;
        is.a $$4 = new is.a();
        for (int $$5 = this.f.j(); $$5 <= this.f.m(); ++$$5) {
            for (int $$6 = this.f.h(); $$6 <= this.f.k(); ++$$6) {
                $$4.d($$6, 0, $$5);
                $$2 = Math.min($$2, $$0.a(euq.a.f, (is)$$4).v());
                $$3 = true;
            }
        }
        if (!$$3) {
            return false;
        }
        this.d = $$2;
        this.f.a(0, this.d - this.f.i() + $$1, 0);
        return true;
    }
}

