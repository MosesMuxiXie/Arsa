/*
 * Decompiled with CFR 0.152.
 */
public class drj
extends dqi {
    public drj(dqf $$0) {
        super($$0);
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        if ($$0.e() != 2) {
            return false;
        }
        boolean $$2 = false;
        boolean $$3 = false;
        for (int $$4 = 0; $$4 < $$0.a(); ++$$4) {
            dlt $$5 = $$0.a($$4);
            if ($$5.f()) continue;
            if ($$5.h() instanceof djz) {
                if ($$3) {
                    return false;
                }
                $$3 = true;
                continue;
            }
            if ($$5.a(dlx.xH)) {
                if ($$2) {
                    return false;
                }
                ekr $$6 = $$5.a(ki.at, ekr.a);
                if (!$$6.b().isEmpty()) {
                    return false;
                }
                $$2 = true;
                continue;
            }
            return false;
        }
        return $$2 && $$3;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        dlt $$2 = dlt.l;
        dlt $$3 = dlt.l;
        for (int $$4 = 0; $$4 < $$0.a(); ++$$4) {
            dlt $$5 = $$0.a($$4);
            if ($$5.f()) continue;
            if ($$5.h() instanceof djz) {
                $$2 = $$5;
                continue;
            }
            if (!$$5.a(dlx.xH)) continue;
            $$3 = $$5.v();
        }
        if ($$3.f()) {
            return $$3;
        }
        $$3.b(ki.at, $$2.a(ki.at));
        $$3.b(ki.au, ((djz)$$2.h()).a());
        return $$3;
    }

    @Override
    public drc<drj> a() {
        return drc.l;
    }
}

