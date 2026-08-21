/*
 * Decompiled with CFR 0.152.
 */
public class drt
extends dqi {
    public drt(dqf $$0) {
        super($$0);
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        if ($$0.f() != 3 || $$0.g() != 3 || $$0.e() != 9) {
            return false;
        }
        for (int $$2 = 0; $$2 < $$0.g(); ++$$2) {
            for (int $$3 = 0; $$3 < $$0.f(); ++$$3) {
                dlt $$4 = $$0.a($$3, $$2);
                if ($$4.f()) {
                    return false;
                }
                if (!($$3 == 1 && $$2 == 1 ? !$$4.a(dlx.xG) : !$$4.a(dlx.pX))) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        dlt $$2 = $$0.a(1, 1);
        if (!$$2.a(dlx.xG)) {
            return dlt.l;
        }
        dlt $$3 = new dlt(dlx.xF, 8);
        $$3.b(ki.Y, $$2.a(ki.Y));
        return $$3;
    }

    @Override
    public drc<drt> a() {
        return drc.j;
    }
}

