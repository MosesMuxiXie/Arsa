/*
 * Decompiled with CFR 0.152.
 */
public class dqj
extends dqi {
    public dqj(dqf $$0) {
        super($$0);
    }

    private static dlt c(dqg $$0) {
        return $$0.a(1, 0);
    }

    private static dlt d(dqg $$0) {
        return $$0.a(0, 1);
    }

    private static dlt e(dqg $$0) {
        return $$0.a(2, 1);
    }

    private static dlt f(dqg $$0) {
        return $$0.a(1, 2);
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        if ($$0.f() != 3 || $$0.g() != 3 || $$0.e() != 4) {
            return false;
        }
        return dqj.c($$0).a(bdy.bZ) && dqj.d($$0).a(bdy.bZ) && dqj.e($$0).a(bdy.bZ) && dqj.f($$0).a(bdy.bZ);
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        eml $$2 = new eml(dqj.c($$0).h(), dqj.d($$0).h(), dqj.e($$0).h(), dqj.f($$0).h());
        return elu.a($$2);
    }

    @Override
    public drc<dqj> a() {
        return drc.v;
    }
}

