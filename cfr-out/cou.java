/*
 * Decompiled with CFR 0.152.
 */
public class cou
extends cop {
    private final cwz a;
    private boolean b;

    public cou(cwz $$0) {
        this.a = $$0;
    }

    @Override
    public boolean b() {
        chl chl2 = this.a.U_();
        if (chl2 instanceof axg) {
            axg $$0 = (axg)chl2;
            boolean $$1 = !$$0.au() && !$$0.gL().b && !$$0.by() && !$$0.aJ;
            return !this.a.gR() && $$1 && this.a.hg();
        }
        return false;
    }

    @Override
    public boolean W_() {
        return !this.b;
    }

    @Override
    public void d() {
        this.b = false;
    }

    @Override
    public void a() {
        if (this.b || this.a.gQ() || this.a.S_()) {
            return;
        }
        chl chl2 = this.a.U_();
        if (chl2 instanceof axg) {
            axg $$0 = (axg)chl2;
            if (this.a.dj().c($$0.dj())) {
                this.b = this.a.b($$0);
            }
        }
    }
}

