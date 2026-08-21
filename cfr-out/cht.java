/*
 * Decompiled with CFR 0.152.
 */
public abstract class cht
extends chn {
    protected static final float cu = 0.0f;

    protected cht(cgu<? extends cht> $$0, dwo $$1) {
        super((cgu<? extends chn>)$$0, $$1);
    }

    public float c(is $$0) {
        return this.a($$0, (dwr)this.ao());
    }

    public float a(is $$0, dwr $$1) {
        return 0.0f;
    }

    @Override
    public boolean a(dwp $$0, cgt $$1) {
        return this.a(this.dK(), $$0) >= 0.0f;
    }

    public boolean gL() {
        return !this.N().l();
    }

    public boolean gM() {
        if (this.ca.a(cqw.aa)) {
            return this.ca.c(cqw.aa).isPresent();
        }
        for (cqe $$0 : this.cs.b()) {
            if (!$$0.h() || !($$0.k() instanceof cpi)) continue;
            return true;
        }
        return false;
    }

    protected boolean gN() {
        return true;
    }

    @Override
    public void e(cgk $$0) {
        super.e($$0);
        if (this.gN() && !this.gM()) {
            this.cs.b(cop.a.a);
            float $$1 = 2.0f;
            float $$2 = this.f($$0);
            ftm $$3 = new ftm($$0.dP() - this.dP(), $$0.dR() - this.dR(), $$0.dV() - this.dV()).d().c((double)Math.max($$2 - 2.0f, 0.0f));
            this.N().a(this.dP() + $$3.g, this.dR() + $$3.h, this.dV() + $$3.i, this.gO());
        }
    }

    @Override
    public void d(cgk $$0) {
        this.a($$0.dK(), (int)this.x() - 1);
        super.d($$0);
    }

    protected double gO() {
        return 1.0;
    }
}

