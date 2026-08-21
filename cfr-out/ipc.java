/*
 * Decompiled with CFR 0.152.
 */
public class ipc
extends iot {
    private final cgk n;

    public ipc(bcz $$0, bdb $$1, float $$2, float $$3, cgk $$4, long $$5) {
        super($$0, $$1, bgr.a($$5));
        this.d = $$2;
        this.e = $$3;
        this.n = $$4;
        this.f = (float)this.n.dP();
        this.g = (float)this.n.dR();
        this.h = (float)this.n.dV();
    }

    @Override
    public boolean s() {
        return !this.n.bq();
    }

    @Override
    public void q() {
        if (this.n.eh()) {
            this.n();
            return;
        }
        this.f = (float)this.n.dP();
        this.g = (float)this.n.dR();
        this.h = (float)this.n.dV();
    }
}

