/*
 * Decompiled with CFR 0.152.
 */
public class ipe
extends iot {
    private static final float n = 0.0f;
    private static final float o = 0.7f;
    private static final float p = 0.0f;
    private static final float q = 1.0f;
    private static final float r = 0.0025f;
    private final dgi s;
    private float t = 0.0f;

    public ipe(dgi $$0) {
        super(bda.rb, bdb.g, ipm.u());
        this.s = $$0;
        this.i = true;
        this.j = 0;
        this.d = 0.0f;
        this.f = (float)$$0.dP();
        this.g = (float)$$0.dR();
        this.h = (float)$$0.dV();
    }

    @Override
    public boolean s() {
        return !this.s.bq();
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public void q() {
        boolean $$1;
        if (this.s.eh()) {
            this.n();
            return;
        }
        this.f = (float)this.s.dP();
        this.g = (float)this.s.dR();
        this.h = (float)this.s.dV();
        float $$0 = (float)this.s.dN().i();
        boolean bl2 = $$1 = !this.s.cH() && this.s.q() instanceof dgs;
        if ($$0 >= 0.01f && this.s.ao().y().i() && !$$1) {
            this.t = bgj.a(this.t + 0.0025f, 0.0f, 1.0f);
            this.d = bgj.h(bgj.a($$0, 0.0f, 0.5f), 0.0f, 0.7f);
        } else {
            this.t = 0.0f;
            this.d = 0.0f;
        }
    }
}

