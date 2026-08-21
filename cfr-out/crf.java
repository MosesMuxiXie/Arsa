/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class crf
extends crd {
    private @Nullable is p;

    public crf(chn $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    public flp a(is $$0, int $$1) {
        this.p = $$0;
        return super.a($$0, $$1);
    }

    @Override
    public flp a(cgk $$0, int $$1) {
        this.p = $$0.dK();
        return super.a($$0, $$1);
    }

    @Override
    public boolean a(cgk $$0, double $$1) {
        flp $$2 = this.a($$0, 0);
        if ($$2 != null) {
            return this.a($$2, $$1);
        }
        this.p = $$0.dK();
        this.d = $$1;
        return true;
    }

    @Override
    public void d() {
        if (this.l()) {
            if (this.p != null) {
                if (this.p.a(this.a.dI(), (double)this.a.dF()) || this.a.dR() > (double)this.p.v() && is.a((double)this.p.u(), this.a.dR(), (double)this.p.w()).a(this.a.dI(), (double)this.a.dF())) {
                    this.p = null;
                } else {
                    this.a.K().a(this.p.u(), this.p.v(), this.p.w(), this.d);
                }
            }
            return;
        }
        super.d();
    }
}

