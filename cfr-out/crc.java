/*
 * Decompiled with CFR 0.152.
 */
public class crc
extends cre {
    public crc(chn $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    protected flr a(int $$0) {
        this.o = new flm();
        return new flr(this.o, $$0);
    }

    @Override
    protected boolean a(ftm $$0, ftm $$1) {
        return crc.a(this.a, $$0, $$1, true);
    }

    @Override
    protected boolean a() {
        return this.p() && this.a.bB() || !this.a.cq();
    }

    @Override
    protected ftm b() {
        return this.a.dI();
    }

    @Override
    public flp a(cgk $$0, int $$1) {
        return this.a($$0.dK(), $$1);
    }

    @Override
    public void d() {
        ++this.e;
        if (this.m) {
            this.i();
        }
        if (this.l()) {
            return;
        }
        if (this.a()) {
            this.k();
        } else if (this.c != null && !this.c.c()) {
            ftm $$0 = this.c.a(this.a);
            if (this.a.dO() == bgj.c($$0.g) && this.a.dQ() == bgj.c($$0.h) && this.a.dU() == bgj.c($$0.i)) {
                this.c.a();
            }
        }
        if (this.l()) {
            return;
        }
        ftm $$1 = this.c.a(this.a);
        this.a.K().a($$1.g, $$1.h, $$1.i, this.d);
    }

    @Override
    public boolean a(is $$0) {
        return this.b.a_($$0).b((dvt)this.b, $$0, this.a);
    }

    @Override
    public boolean c() {
        return false;
    }
}

