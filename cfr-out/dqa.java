/*
 * Decompiled with CFR 0.152.
 */
public class dqa
extends dqi {
    public dqa(dqf $$0) {
        super($$0);
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        if ($$0.e() != 2) {
            return false;
        }
        dkr $$2 = null;
        boolean $$3 = false;
        boolean $$4 = false;
        for (int $$5 = 0; $$5 < $$0.a(); ++$$5) {
            dlt $$6 = $$0.a($$5);
            if ($$6.f()) continue;
            dlp $$7 = $$6.h();
            if ($$7 instanceof djz) {
                djz $$8 = (djz)$$7;
                if ($$2 == null) {
                    $$2 = $$8.a();
                } else if ($$2 != $$8.a()) {
                    return false;
                }
            } else {
                return false;
            }
            int $$10 = $$6.a(ki.at, ekr.a).b().size();
            if ($$10 > 6) {
                return false;
            }
            if ($$10 > 0) {
                if ($$4) {
                    return false;
                }
                $$4 = true;
                continue;
            }
            if ($$3) {
                return false;
            }
            $$3 = true;
        }
        return $$4 && $$3;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        for (int $$2 = 0; $$2 < $$0.a(); ++$$2) {
            int $$4;
            dlt $$3 = $$0.a($$2);
            if ($$3.f() || ($$4 = $$3.a(ki.at, ekr.a).b().size()) <= 0 || $$4 > 6) continue;
            return $$3.c(1);
        }
        return dlt.l;
    }

    @Override
    public jm<dlt> a(dqg $$0) {
        jm<dlt> $$1 = jm.a($$0.a(), dlt.l);
        for (int $$2 = 0; $$2 < $$1.size(); ++$$2) {
            dlt $$3 = $$0.a($$2);
            if ($$3.f()) continue;
            dlt $$4 = $$3.h().i();
            if (!$$4.f()) {
                $$1.set($$2, $$4);
                continue;
            }
            if ($$3.a(ki.at, ekr.a).b().isEmpty()) continue;
            $$1.set($$2, $$3.c(1));
        }
        return $$1;
    }

    @Override
    public drc<dqa> a() {
        return drc.k;
    }
}

