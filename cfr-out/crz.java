/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class crz
extends csd<chl> {
    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.h, cqw.g, cqw.N, cqw.ax, cqw.aF, cqw.av, (Object[])new cqw[]{cqw.aw, cqw.az, cqw.ay, cqw.aD, cqw.aE, cqw.aH});
    }

    @Override
    protected void a(axf $$02, chl $$1) {
        cim<?> $$2 = $$1.ev();
        $$2.a(cqw.aH, crz.c($$02, $$1));
        Optional<Object> $$3 = Optional.empty();
        Optional<Object> $$4 = Optional.empty();
        Optional<Object> $$5 = Optional.empty();
        Optional<Object> $$6 = Optional.empty();
        Optional<Object> $$7 = Optional.empty();
        Optional<Object> $$8 = Optional.empty();
        Optional<Object> $$9 = Optional.empty();
        int $$10 = 0;
        ArrayList $$11 = Lists.newArrayList();
        ArrayList $$12 = Lists.newArrayList();
        cqy $$13 = $$2.c(cqw.h).orElse(cqy.a());
        for (chl $$14 : $$13.b($$0 -> true)) {
            if ($$14 instanceof daw) {
                daw $$15 = (daw)$$14;
                if ($$15.e_() && $$5.isEmpty()) {
                    $$5 = Optional.of($$15);
                    continue;
                }
                if (!$$15.gP()) continue;
                ++$$10;
                if (!$$4.isEmpty() || !$$15.gS()) continue;
                $$4 = Optional.of($$15);
                continue;
            }
            if ($$14 instanceof dbm) {
                dbm $$16 = (dbm)$$14;
                $$11.add($$16);
                continue;
            }
            if ($$14 instanceof dbj) {
                dbj $$17 = (dbj)$$14;
                if ($$17.e_() && $$6.isEmpty()) {
                    $$6 = Optional.of($$17);
                    continue;
                }
                if (!$$17.gR()) continue;
                $$11.add($$17);
                continue;
            }
            if ($$14 instanceof ddm) {
                ddm $$18 = (ddm)$$14;
                if ($$8.isEmpty() && !dbk.a($$18) && $$1.c($$14)) {
                    $$8 = Optional.of($$18);
                }
                if (!$$9.isEmpty() || $$18.au() || !dbk.b($$18)) continue;
                $$9 = Optional.of($$18);
                continue;
            }
            if ($$3.isEmpty() && ($$14 instanceof dca || $$14 instanceof cyw)) {
                $$3 = Optional.of((chn)$$14);
                continue;
            }
            if (!$$7.isEmpty() || !dbk.a($$14.ay())) continue;
            $$7 = Optional.of($$14);
        }
        List<chl> $$19 = $$2.c(cqw.g).orElse((List<chl>)ImmutableList.of());
        for (chl $$20 : $$19) {
            dbi $$21;
            if (!($$20 instanceof dbi) || !($$21 = (dbi)$$20).gR()) continue;
            $$12.add($$21);
        }
        $$2.a(cqw.N, $$3);
        $$2.a(cqw.av, $$4);
        $$2.a(cqw.aw, $$5);
        $$2.a(cqw.aC, $$7);
        $$2.a(cqw.ax, $$8);
        $$2.a(cqw.aF, $$9);
        $$2.a(cqw.ay, $$12);
        $$2.a(cqw.az, $$11);
        $$2.a(cqw.aD, $$11.size());
        $$2.a(cqw.aE, $$10);
    }

    private static Optional<is> c(axf $$0, chl $$12) {
        return is.a($$12.dK(), 8, 4, $$1 -> crz.a($$0, $$1));
    }

    private static boolean a(axf $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        boolean $$3 = $$2.a(bdp.ax);
        if ($$3 && $$2.a(dzs.pf)) {
            return eag.h($$2);
        }
        return $$3;
    }
}

