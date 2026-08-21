/*
 * Decompiled with CFR 0.152.
 */
public class dii
extends dji {
    private final ddm a;
    private int b;

    public dii(ddm $$0, ccv $$1, int $$2, int $$3, int $$4) {
        super($$1, $$2, $$3, $$4);
        this.a = $$0;
    }

    @Override
    public boolean a(dlt $$0) {
        return false;
    }

    @Override
    public dlt a(int $$0) {
        if (this.h()) {
            this.b += Math.min($$0, this.g().N());
        }
        return super.a($$0);
    }

    @Override
    public void a(ddm $$0, dlt $$1) {
        this.c_($$1);
        super.a($$0, $$1);
    }

    @Override
    protected void a(dlt $$0, int $$1) {
        this.b += $$1;
        this.c_($$0);
    }

    @Override
    protected void c_(dlt $$0) {
        $$0.a(this.a, this.b);
        cid cid2 = this.a;
        if (cid2 instanceof axg) {
            axg $$1 = (axg)cid2;
            cid2 = this.c;
            if (cid2 instanceof eko) {
                eko $$2 = (eko)cid2;
                $$2.a($$1);
            }
        }
        this.b = 0;
    }
}

