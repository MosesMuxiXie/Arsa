/*
 * Decompiled with CFR 0.152.
 */
public class crb
extends cre {
    public crb(chn $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    protected flr a(int $$0) {
        this.o = new flk(false);
        return new flr(this.o, $$0);
    }

    @Override
    protected boolean a() {
        return true;
    }

    @Override
    protected ftm b() {
        return new ftm(this.a.dP(), this.a.f(0.5), this.a.dV());
    }

    @Override
    protected double a(ftm $$0) {
        return $$0.h;
    }

    @Override
    protected boolean a(ftm $$0, ftm $$1) {
        if (this.a.bB()) {
            return crb.a(this.a, $$0, $$1, false);
        }
        return false;
    }

    @Override
    public boolean a(is $$0) {
        return !this.b.a_($$0.e()).l();
    }

    @Override
    public void a(boolean $$0) {
    }

    @Override
    public boolean c() {
        return true;
    }
}

