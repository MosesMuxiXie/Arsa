/*
 * Decompiled with CFR 0.152.
 */
public class ipi
extends iot {
    private static final float n = 1.0f;
    private static final float o = 1.0f;
    private final cxm p;

    public ipi(cxm $$0) {
        super(bda.BM, bdb.g, ipm.u());
        this.p = $$0;
        this.k = ipm.a.b;
        this.i = false;
        this.j = 0;
    }

    @Override
    public boolean s() {
        return !this.p.bq();
    }

    @Override
    public void q() {
        if (this.p.eh() || this.p.ag_() != null || !this.p.gS()) {
            this.n();
            return;
        }
        this.f = (float)this.p.dP();
        this.g = (float)this.p.dR();
        this.h = (float)this.p.dV();
        this.d = 1.0f;
        this.e = 1.0f;
    }
}

