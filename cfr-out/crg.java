/*
 * Decompiled with CFR 0.152.
 */
public class crg
extends cre {
    private boolean p;

    public crg(chn $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    protected flr a(int $$0) {
        this.p = this.a.ay() == cgu.L;
        this.o = new flv(this.p);
        this.o.a(false);
        return new flr(this.o, $$0);
    }

    @Override
    protected boolean a() {
        return this.p || this.a.bB();
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
        return crg.a(this.a, $$0, $$1, false);
    }

    @Override
    public boolean a(is $$0) {
        return !this.b.a_($$0).s();
    }

    @Override
    public void a(boolean $$0) {
    }

    @Override
    public boolean c() {
        return false;
    }
}

