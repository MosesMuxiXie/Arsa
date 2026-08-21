/*
 * Decompiled with CFR 0.152.
 */
public class dez
extends dfa {
    public dez(cgu<? extends dez> $$0, dwo $$1) {
        super((cgu<? extends dfa>)$$0, $$1);
    }

    public dez(dwo $$0, chl $$1, dlt $$2) {
        super(cgu.bs, $$1, $$0, $$2);
    }

    public dez(dwo $$0, double $$1, double $$2, double $$3, dlt $$4) {
        super(cgu.bs, $$1, $$2, $$3, $$0, $$4);
    }

    @Override
    protected dlp f() {
        return dlx.so;
    }

    private lw i() {
        dlt $$0 = this.e();
        return $$0.f() ? ly.aa : new lu(ly.V, $$0);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 3) {
            lw $$1 = this.i();
            for (int $$2 = 0; $$2 < 8; ++$$2) {
                this.ao().a($$1, this.dP(), this.dR(), this.dV(), 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void a(ftj $$0) {
        super.a($$0);
        cgk $$1 = $$0.a();
        int $$2 = $$1 instanceof czo ? 3 : 0;
        $$1.a(this.en().b((cgk)this, this.p()), (float)$$2);
    }

    @Override
    protected void b(ftk $$0) {
        super.b($$0);
        if (!this.ao().B_()) {
            this.ao().a((cgk)this, (byte)3);
            this.aC();
        }
    }
}

