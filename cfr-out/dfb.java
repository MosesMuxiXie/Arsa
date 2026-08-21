/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class dfb
extends dfa {
    private static final cgn b = cgn.c(0.0f, 0.0f);

    public dfb(cgu<? extends dfb> $$0, dwo $$1) {
        super((cgu<? extends dfa>)$$0, $$1);
    }

    public dfb(dwo $$0, chl $$1, dlt $$2) {
        super(cgu.P, $$1, $$0, $$2);
    }

    public dfb(dwo $$0, double $$1, double $$2, double $$3, dlt $$4) {
        super(cgu.P, $$1, $$2, $$3, $$0, $$4);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 3) {
            double $$1 = 0.08;
            for (int $$2 = 0; $$2 < 8; ++$$2) {
                this.ao().a(new lu(ly.V, this.e()), this.dP(), this.dR(), this.dV(), ((double)this.as.i() - 0.5) * 0.08, ((double)this.as.i() - 0.5) * 0.08, ((double)this.as.i() - 0.5) * 0.08);
            }
        }
    }

    @Override
    protected void a(ftj $$0) {
        super.a($$0);
        $$0.a().a(this.en().b((cgk)this, this.p()), 0.0f);
    }

    @Override
    protected void b(ftk $$02) {
        super.b($$02);
        if (!this.ao().B_()) {
            if (this.as.a(8) == 0) {
                int $$1 = 1;
                if (this.as.a(32) == 0) {
                    $$1 = 4;
                }
                for (int $$2 = 0; $$2 < $$1; ++$$2) {
                    cuc $$3 = cgu.C.a(this.ao(), cgt.k);
                    if ($$3 == null) continue;
                    $$3.d_(-24000);
                    $$3.b(this.dP(), this.dR(), this.dV(), this.ec(), 0.0f);
                    Optional.ofNullable(this.e().a(ki.aQ)).flatMap($$0 -> $$0.a(this.eo())).ifPresent($$3::b);
                    if (!$$3.a(b)) break;
                    this.ao().b($$3);
                }
            }
            this.ao().a((cgk)this, (byte)3);
            this.aC();
        }
    }

    @Override
    protected dlp f() {
        return dlx.sD;
    }
}

