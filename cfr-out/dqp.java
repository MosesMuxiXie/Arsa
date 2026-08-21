/*
 * Decompiled with CFR 0.152.
 */
public class dqp
extends dqi {
    public dqp(dqf $$0) {
        super($$0);
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        if ($$0.e() < 2) {
            return false;
        }
        boolean $$2 = false;
        boolean $$3 = false;
        for (int $$4 = 0; $$4 < $$0.a(); ++$$4) {
            dlt $$5 = $$0.a($$4);
            if ($$5.f()) continue;
            if ($$5.c(ki.T)) {
                if ($$3) {
                    return false;
                }
                $$3 = true;
                continue;
            }
            if ($$5.a(dlx.wv)) {
                $$2 = true;
                continue;
            }
            return false;
        }
        return $$3 && $$2;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        int $$2 = 0;
        dlt $$3 = dlt.l;
        for (int $$4 = 0; $$4 < $$0.a(); ++$$4) {
            dlt $$5 = $$0.a($$4);
            if ($$5.f()) continue;
            if ($$5.c(ki.T)) {
                if (!$$3.f()) {
                    return dlt.l;
                }
                $$3 = $$5;
                continue;
            }
            if ($$5.a(dlx.wv)) {
                ++$$2;
                continue;
            }
            return dlt.l;
        }
        if ($$3.f() || $$2 < 1) {
            return dlt.l;
        }
        return $$3.c($$2 + 1);
    }

    @Override
    public drc<dqp> a() {
        return drc.e;
    }
}

