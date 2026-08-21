/*
 * Decompiled with CFR 0.152.
 */
public class div
extends dji {
    private final dit a;
    private final ddm b;
    private int g;
    private final dvk h;

    public div(ddm $$0, dvk $$1, dit $$2, int $$3, int $$4, int $$5) {
        super($$2, $$3, $$4, $$5);
        this.b = $$0;
        this.h = $$1;
        this.a = $$2;
    }

    @Override
    public boolean a(dlt $$0) {
        return false;
    }

    @Override
    public dlt a(int $$0) {
        if (this.h()) {
            this.g += Math.min($$0, this.g().N());
        }
        return super.a($$0);
    }

    @Override
    protected void a(dlt $$0, int $$1) {
        this.g += $$1;
        this.c_($$0);
    }

    @Override
    protected void c_(dlt $$0) {
        $$0.a(this.b, this.g);
        this.g = 0;
    }

    @Override
    public void a(ddm $$0, dlt $$1) {
        this.c_($$1);
        dvl $$2 = this.a.h();
        if ($$2 != null) {
            dlt $$4;
            dlt $$3 = this.a.a(0);
            if ($$2.b($$3, $$4 = this.a.a(1)) || $$2.b($$4, $$3)) {
                this.h.a($$2);
                $$0.a(bdk.V);
                this.a.a(0, $$3);
                this.a.a(1, $$4);
            }
            this.h.a(this.h.d() + $$2.q());
        }
    }
}

