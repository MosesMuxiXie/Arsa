/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class dbn {
    private static final int a = 600;
    private static final int b = 20;
    private static final double c = 0.0125;
    private static final int d = 8;
    private static final int e = 8;
    private static final float f = 0.6f;
    private static final int g = 2;
    private static final int h = 100;
    private static final int i = 5;

    protected static cim<?> a(dbm $$0, cim<dbm> $$1) {
        dbn.b($$0, $$1);
        dbn.c($$0, $$1);
        dbn.d($$0, $$1);
        $$1.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$1.b(dfl.b);
        $$1.e();
        return $$1;
    }

    protected static void a(dbm $$0) {
        jc $$1 = jc.a($$0.ao().aq(), $$0.dK());
        $$0.ev().a(cqw.b, $$1);
    }

    private static void b(dbm $$0, cim<dbm> $$1) {
        $$1.a(dfl.a, 0, (ImmutableList<cje<dbm>>)ImmutableList.of((Object)new ckk(45, 90), (Object)new cko(), ckc.a(), clx.a()));
    }

    private static void c(dbm $$0, cim<dbm> $$1) {
        $$1.a(dfl.b, 10, (ImmutableList<cje<dbm>>)ImmutableList.of(clt.a(dbn::a), dbn.a(), dbn.b(), clg.a(cgu.cb, 4)));
    }

    private static void d(dbm $$0, cim<dbm> $$12) {
        $$12.a(dfl.k, 10, (ImmutableList<cje<dbm>>)ImmutableList.of(clw.a((axf $$1, chl $$2) -> !dbn.a($$1, (dbi)$$0, $$2)), clj.a(1.0f), ckl.a(20)), cqw.p);
    }

    private static clb<dbm> a() {
        return new clb<dbm>((List<Pair<cje<dbm>, Integer>>)ImmutableList.of((Object)Pair.of(cld.a(cgu.cb, 8.0f), (Object)1), (Object)Pair.of(cld.a(cgu.aZ, 8.0f), (Object)1), (Object)Pair.of(cld.a(cgu.ba, 8.0f), (Object)1), (Object)Pair.of(cld.a(8.0f), (Object)1), (Object)Pair.of((Object)new cjo(30, 60), (Object)1)));
    }

    private static clb<dbm> b() {
        return new clb<dbm>((List<Pair<cje<dbm>, Integer>>)ImmutableList.of((Object)Pair.of(ckw.a(0.6f), (Object)2), (Object)Pair.of(ckb.a(cgu.aZ, 8, cqw.r, 0.6f, 2), (Object)2), (Object)Pair.of(ckb.a(cgu.ba, 8, cqw.r, 0.6f, 2), (Object)2), (Object)Pair.of(clz.a(cqw.b, 0.6f, 2, 100), (Object)2), (Object)Pair.of(cly.a(cqw.b, 0.6f, 5), (Object)2), (Object)Pair.of((Object)new cjo(30, 60), (Object)1)));
    }

    protected static void b(dbm $$0) {
        cim<dbm> $$1 = $$0.ev();
        dfl $$2 = $$1.f().orElse(null);
        $$1.a((List<dfl>)ImmutableList.of((Object)dfl.k, (Object)dfl.b));
        dfl $$3 = $$1.f().orElse(null);
        if ($$2 != $$3) {
            dbn.d($$0);
        }
        $$0.w($$1.a(cqw.p));
    }

    private static boolean a(axf $$0, dbi $$12, chl $$2) {
        return dbn.a($$0, $$12).filter($$1 -> $$1 == $$2).isPresent();
    }

    private static Optional<? extends chl> a(axf $$0, dbi $$1) {
        Optional<chl> $$2 = cjf.a((chl)$$1, cqw.am);
        if ($$2.isPresent() && csd.d($$0, $$1, $$2.get())) {
            return $$2;
        }
        Optional<ddm> $$3 = $$1.ev().c(cqw.l);
        if ($$3.isPresent()) {
            return $$3;
        }
        return $$1.ev().c(cqw.N);
    }

    protected static void a(axf $$0, dbm $$1, chl $$2) {
        if ($$2 instanceof dbi) {
            return;
        }
        dbk.a($$0, (dbi)$$1, $$2);
    }

    protected static void a(dbm $$0, chl $$1) {
        $$0.ev().b(cqw.F);
        $$0.ev().a(cqw.am, $$1.cY(), 600L);
    }

    protected static void c(dbm $$0) {
        if ((double)$$0.ao().y.i() < 0.0125) {
            dbn.d($$0);
        }
    }

    private static void d(dbm $$0) {
        $$0.ev().f().ifPresent($$1 -> {
            if ($$1 == dfl.k) {
                $$0.gX();
            }
        });
    }
}

