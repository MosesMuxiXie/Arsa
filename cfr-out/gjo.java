/*
 * Decompiled with CFR 0.152.
 */
public class gjo
extends gjb {
    private final gio c;
    private final gjz d;

    public gjo(int $$0, int $$1, int $$2, int $$3, yh $$4, gio $$5) {
        super($$0, $$1, $$2, $$3, $$4);
        this.c = $$5;
        this.d = new gjz($$4, $$5).a(this.aS_() - this.c());
    }

    @Override
    public void c(int $$0) {
        super.c($$0);
        this.d.a(this.aS_() - this.c());
    }

    @Override
    protected int d() {
        return this.d.aR_();
    }

    public void u() {
        if (!this.v()) {
            this.d(this.d() + this.c());
        }
    }

    @Override
    protected double p() {
        return this.c.b;
    }

    @Override
    protected void b(gir $$0) {
        super.b($$0);
    }

    public boolean v() {
        return super.k();
    }

    @Override
    protected void c(gir $$0, int $$1, int $$2, float $$3) {
        $$0.e().pushMatrix();
        $$0.e().translate((float)this.e(), (float)this.t());
        this.d.a($$0, $$1, $$2, $$3);
        $$0.e().popMatrix();
    }

    @Override
    protected void a(gpd $$0) {
        $$0.a(gpc.a, this.B());
    }

    @Override
    public void a_(yh $$0) {
        super.a_($$0);
        this.d.a_($$0);
    }
}

