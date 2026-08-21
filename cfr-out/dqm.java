/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
import it.unimi.dsi.fastutil.ints.IntArrayList;

public class dqm
extends dqi {
    private static final dqo d = dqo.a((dwn)dlx.wH);

    public dqm(dqf $$0) {
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
            if ($$5.h() instanceof dks) {
                $$2 = true;
                continue;
            }
            if (d.a($$5)) {
                if ($$3) {
                    return false;
                }
                $$3 = true;
                continue;
            }
            return false;
        }
        return $$3 && $$2;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        IntArrayList $$2 = new IntArrayList();
        dlt $$3 = null;
        for (int $$4 = 0; $$4 < $$0.a(); ++$$4) {
            dlt $$5 = $$0.a($$4);
            dlp $$6 = $$5.h();
            if ($$6 instanceof dks) {
                dks $$7 = (dks)$$6;
                $$2.add($$7.a().f());
                continue;
            }
            if (!d.a($$5)) continue;
            $$3 = $$5.c(1);
        }
        if ($$3 == null || $$2.isEmpty()) {
            return dlt.l;
        }
        $$3.a(ki.ap, dok.a, $$2, dok::a);
        return $$3;
    }

    @Override
    public drc<dqm> a() {
        return drc.i;
    }
}

