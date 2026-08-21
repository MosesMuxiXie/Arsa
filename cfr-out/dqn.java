/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Map;

public class dqn
extends dqi {
    private static final Map<dlp, dok.a> d = Map.of(dlx.wi, dok.a.b, dlx.qZ, dok.a.e, dlx.um, dok.a.c, dlx.wx, dok.a.d, dlx.wy, dok.a.d, dlx.wB, dok.a.d, dlx.wz, dok.a.d, dlx.wC, dok.a.d, dlx.wA, dok.a.d, dlx.wD, dok.a.d);
    private static final dqo e = dqo.a((dwn)dlx.qa);
    private static final dqo f = dqo.a((dwn)dlx.tc);
    private static final dqo g = dqo.a((dwn)dlx.ra);

    public dqn(dqf $$0) {
        super($$0);
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        if ($$0.e() < 2) {
            return false;
        }
        boolean $$2 = false;
        boolean $$3 = false;
        boolean $$4 = false;
        boolean $$5 = false;
        boolean $$6 = false;
        for (int $$7 = 0; $$7 < $$0.a(); ++$$7) {
            dlt $$8 = $$0.a($$7);
            if ($$8.f()) continue;
            if (d.containsKey($$8.h())) {
                if ($$4) {
                    return false;
                }
                $$4 = true;
                continue;
            }
            if (f.a($$8)) {
                if ($$6) {
                    return false;
                }
                $$6 = true;
                continue;
            }
            if (e.a($$8)) {
                if ($$5) {
                    return false;
                }
                $$5 = true;
                continue;
            }
            if (g.a($$8)) {
                if ($$2) {
                    return false;
                }
                $$2 = true;
                continue;
            }
            if ($$8.h() instanceof dks) {
                $$3 = true;
                continue;
            }
            return false;
        }
        return $$2 && $$3;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        dok.a $$2 = dok.a.a;
        boolean $$3 = false;
        boolean $$4 = false;
        IntArrayList $$5 = new IntArrayList();
        for (int $$6 = 0; $$6 < $$0.a(); ++$$6) {
            dlt $$7 = $$0.a($$6);
            if ($$7.f()) continue;
            dok.a $$8 = d.get($$7.h());
            if ($$8 != null) {
                $$2 = $$8;
                continue;
            }
            if (f.a($$7)) {
                $$3 = true;
                continue;
            }
            if (e.a($$7)) {
                $$4 = true;
                continue;
            }
            dlp dlp2 = $$7.h();
            if (!(dlp2 instanceof dks)) continue;
            dks $$9 = (dks)dlp2;
            $$5.add($$9.a().f());
        }
        dlt $$10 = new dlt(dlx.wH);
        $$10.b(ki.ap, new dok($$2, (IntList)$$5, IntList.of(), $$4, $$3));
        return $$10;
    }

    @Override
    public drc<dqn> a() {
        return drc.h;
    }
}

