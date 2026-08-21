/*
 * Decompiled with CFR 0.152.
 */
public class dqc
extends dqi {
    public dqc(dqf $$0) {
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
            if ($$5.c(ki.ac)) {
                if ($$3) {
                    return false;
                }
                $$3 = true;
                continue;
            }
            if ($$5.a(bdy.cm)) {
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
            if ($$5.c(ki.ac)) {
                if (!$$3.f()) {
                    return dlt.l;
                }
                $$3 = $$5;
                continue;
            }
            if ($$5.a(bdy.cm)) {
                ++$$2;
                continue;
            }
            return dlt.l;
        }
        dpl $$6 = $$3.a(ki.ac);
        if ($$3.f() || $$2 < 1 || $$6 == null) {
            return dlt.l;
        }
        dpl $$7 = $$6.b();
        if ($$7 == null) {
            return dlt.l;
        }
        dlt $$8 = $$3.c($$2);
        $$8.b(ki.ac, $$7);
        return $$8;
    }

    @Override
    public jm<dlt> a(dqg $$0) {
        jm<dlt> $$1 = jm.a($$0.a(), dlt.l);
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            dlt $$3 = $$0.a($$2);
            dlt $$4 = $$3.h().i();
            if (!$$4.f()) {
                $$1.set($$2, $$4);
                continue;
            }
            if (!$$3.c(ki.ac)) continue;
            $$1.set($$2, $$3.c(1));
            break;
        }
        return $$1;
    }

    @Override
    public drc<dqc> a() {
        return drc.d;
    }
}

