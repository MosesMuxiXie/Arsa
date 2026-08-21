/*
 * Decompiled with CFR 0.152.
 */
public class ipb
extends iot {
    public static final int n = 20;
    private final hnh o;
    private int p;

    public ipb(hnh $$0) {
        super(bda.jE, bdb.h, ipm.u());
        this.o = $$0;
        this.i = true;
        this.j = 0;
        this.d = 0.1f;
    }

    @Override
    public void q() {
        ++this.p;
        if (this.o.eh() || this.p > 20 && !this.o.gj()) {
            this.n();
            return;
        }
        this.f = (float)this.o.dP();
        this.g = (float)this.o.dR();
        this.h = (float)this.o.dV();
        float $$0 = (float)this.o.dN().h();
        this.d = (double)$$0 >= 1.0E-7 ? bgj.a($$0 / 4.0f, 0.0f, 1.0f) : 0.0f;
        if (this.p < 20) {
            this.d = 0.0f;
        } else if (this.p < 40) {
            this.d *= (float)(this.p - 20) / 20.0f;
        }
        float $$1 = 0.8f;
        this.e = this.d > 0.8f ? 1.0f + (this.d - 0.8f) : 1.0f;
    }
}

