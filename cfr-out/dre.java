/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import org.jspecify.annotations.Nullable;

public class dre
extends dqi {
    public dre(dqf $$0) {
        super($$0);
    }

    private static @Nullable Pair<dlt, dlt> c(dqg $$0) {
        if ($$0.e() != 2) {
            return null;
        }
        dlt $$1 = null;
        for (int $$2 = 0; $$2 < $$0.a(); ++$$2) {
            dlt $$3 = $$0.a($$2);
            if ($$3.f()) continue;
            if ($$1 == null) {
                $$1 = $$3;
                continue;
            }
            return dre.a($$1, $$3) ? Pair.of((Object)$$1, (Object)$$3) : null;
        }
        return null;
    }

    private static boolean a(dlt $$0, dlt $$1) {
        return $$1.a($$0.h()) && $$0.N() == 1 && $$1.N() == 1 && $$0.c(ki.d) && $$1.c(ki.d) && $$0.c(ki.e) && $$1.c(ki.e);
    }

    @Override
    public boolean a(dqg $$0, dwo $$1) {
        return dre.c($$0) != null;
    }

    @Override
    public dlt a(dqg $$0, jf.a $$1) {
        Pair<dlt, dlt> $$2 = dre.c($$0);
        if ($$2 == null) {
            return dlt.l;
        }
        dlt $$3 = (dlt)$$2.getFirst();
        dlt $$4 = (dlt)$$2.getSecond();
        int $$5 = Math.max($$3.p(), $$4.p());
        int $$6 = $$3.p() - $$3.o();
        int $$7 = $$4.p() - $$4.o();
        int $$8 = $$6 + $$7 + $$5 * 5 / 100;
        dlt $$9 = new dlt($$3.h());
        $$9.b(ki.d, Integer.valueOf($$5));
        $$9.b(Math.max($$5 - $$8, 0));
        dsu $$10 = dsq.b($$3);
        dsu $$11 = dsq.b($$4);
        dsq.a($$9, (dsu.a $$32) -> $$1.e(mj.bf).c().filter($$0 -> $$0.a(bds.o)).forEach($$3 -> {
            int $$4 = Math.max($$10.a((jd<dso>)$$3), $$11.a((jd<dso>)$$3));
            if ($$4 > 0) {
                $$32.b((jd<dso>)$$3, $$4);
            }
        }));
        return $$9;
    }

    @Override
    public drc<dre> a() {
        return drc.n;
    }
}

