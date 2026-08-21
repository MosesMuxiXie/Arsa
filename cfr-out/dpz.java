/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class dpz
extends dqi {
    public dpz(dqf $$0) {
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
            if ($$5.a(bdy.cj)) {
                if ($$2) {
                    return false;
                }
                $$2 = true;
                continue;
            }
            if ($$5.h() instanceof dks) {
                $$3 = true;
                continue;
            }
            return false;
        }
        return $$3 && $$2;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        ArrayList<dks> $$2 = new ArrayList<dks>();
        dlt $$3 = dlt.l;
        for (int $$4 = 0; $$4 < $$0.a(); ++$$4) {
            dlt $$5 = $$0.a($$4);
            if ($$5.f()) continue;
            if ($$5.a(bdy.cj)) {
                if (!$$3.f()) {
                    return dlt.l;
                }
                $$3 = $$5.v();
                continue;
            }
            dlp dlp2 = $$5.h();
            if (dlp2 instanceof dks) {
                dks $$6 = (dks)dlp2;
                $$2.add($$6);
                continue;
            }
            return dlt.l;
        }
        if ($$3.f() || $$2.isEmpty()) {
            return dlt.l;
        }
        return doj.a($$3, $$2);
    }

    @Override
    public drc<dpz> a() {
        return drc.c;
    }
}

