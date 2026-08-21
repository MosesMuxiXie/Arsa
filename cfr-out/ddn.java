/*
 * Decompiled with CFR 0.152.
 */
public class ddn
extends cgo {
    private final ddm b;

    public ddn(ddm $$0) {
        this.b = $$0;
    }

    @Override
    public dlt a(cgv $$0, dlt $$1) {
        if ($$0 == cgv.a) {
            return this.b.gK().b($$1);
        }
        return super.a($$0, $$1);
    }

    @Override
    public dlt a(cgv $$0) {
        if ($$0 == cgv.a) {
            return this.b.gK().h();
        }
        return super.a($$0);
    }

    @Override
    public boolean a() {
        return this.b.gK().h().f() && super.a();
    }
}

