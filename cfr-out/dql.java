/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class dql
extends dqi {
    private static final dqo d = dqo.a((dwn)dlx.sA);
    private static final dqo e = dqo.a((dwn)dlx.ra);
    private static final dqo f = dqo.a((dwn)dlx.wH);

    public dql(dqf $$0) {
        super($$0);
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        if ($$0.e() < 2) {
            return false;
        }
        boolean $$2 = false;
        int $$3 = 0;
        for (int $$4 = 0; $$4 < $$0.a(); ++$$4) {
            dlt $$5 = $$0.a($$4);
            if ($$5.f()) continue;
            if (d.a($$5)) {
                if ($$2) {
                    return false;
                }
                $$2 = true;
                continue;
            }
            if (!(e.a($$5) ? ++$$3 > 3 : !f.a($$5))) continue;
            return false;
        }
        return $$2 && $$3 >= 1;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        ArrayList<dok> $$2 = new ArrayList<dok>();
        int $$3 = 0;
        for (int $$4 = 0; $$4 < $$0.a(); ++$$4) {
            dok $$6;
            dlt $$5 = $$0.a($$4);
            if ($$5.f()) continue;
            if (e.a($$5)) {
                ++$$3;
                continue;
            }
            if (!f.a($$5) || ($$6 = $$5.a(ki.ap)) == null) continue;
            $$2.add($$6);
        }
        dlt $$7 = new dlt(dlx.wG, 3);
        $$7.b(ki.aq, new dol($$3, $$2));
        return $$7;
    }

    @Override
    public drc<dql> a() {
        return drc.g;
    }
}

