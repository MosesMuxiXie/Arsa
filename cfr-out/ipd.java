/*
 * Decompiled with CFR 0.152.
 */
public class ipd
extends iot {
    private static final float n = 0.0f;
    private static final float o = 1.0f;
    private static final float p = 0.7f;
    private static final float q = 0.5f;
    private final czx r;

    public ipd(czx $$0) {
        super(bda.ni, bdb.f, ipm.u());
        this.r = $$0;
        this.k = ipm.a.a;
        this.i = true;
        this.j = 0;
    }

    @Override
    public boolean s() {
        return !this.r.bq();
    }

    @Override
    public void q() {
        if (this.r.eh() || this.r.ag_() != null) {
            this.n();
            return;
        }
        this.f = (float)this.r.dP();
        this.g = (float)this.r.dR();
        this.h = (float)this.r.dV();
        float $$0 = this.r.N(0.0f);
        this.d = 0.0f + 1.0f * $$0 * $$0;
        this.e = 0.7f + 0.5f * $$0;
    }
}

