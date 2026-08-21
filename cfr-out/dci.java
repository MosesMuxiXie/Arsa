/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class dci {
    private static final float d = 0.5f;
    private static final float e = 0.7f;
    private static final float f = 1.2f;
    private static final int g = 18;
    private static final int h = bgj.d(100.0f);
    public static final int a = bgj.d(133.59999f);
    public static final int b = bgj.d(84.0f);
    private static final int i = bgj.d(83.2f);
    public static final int c = 1200;
    private static final int j = 100;
    private static final List<cse<? extends csd<? super dch>>> k = List.of(cse.d, cse.w);
    private static final List<cqw<?>> l = List.of(cqw.g, cqw.h, cqw.k, cqw.l, cqw.N, cqw.o, cqw.n, cqw.F, cqw.u, cqw.p, cqw.q, cqw.C, cqw.aJ, cqw.aK, cqw.aL, cqw.aM, cqw.aN, cqw.aO, cqw.aP, cqw.aQ, cqw.aR, cqw.aS, cqw.aT, cqw.aU, cqw.aV, cqw.aW);
    private static final cje<dch> m = cmv.a((cmv.b<E> $$0) -> $$0.group($$0.a(cqw.aP)).apply((Applicative)$$0, $$1 -> ($$2, $$3, $$4) -> {
        if ($$0.a($$1).isPresent()) {
            $$1.a(bhr.a, 1200L);
        }
        return true;
    }));

    public static void a(dch $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.y, (Object)dfl.z, (Object)dfl.x, (Object)dfl.k, (Object)dfl.w, (Object)dfl.v, (Object)dfl.b));
    }

    protected static cim<?> a(dch $$0, Dynamic<?> $$1) {
        cim.b $$2 = cim.a(l, k);
        cim<dch> $$3 = $$2.a($$1);
        dci.a($$3);
        dci.b($$3);
        dci.c($$3);
        dci.d($$3);
        dci.g($$3);
        dci.a($$0, $$3);
        dci.e($$3);
        dci.f($$3);
        $$3.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$3.b(dfl.b);
        $$3.e();
        return $$3;
    }

    private static void a(cim<dch> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<dch>>)ImmutableList.of(new cmb(0.8f), cng.a(), (Object)new ckk(45, 90), (Object)new cko()));
    }

    private static void b(cim<dch> $$0) {
        $$0.a(dfl.y, 5, (ImmutableList<cje<dch>>)ImmutableList.of(new cnc(a)), cqw.aN);
    }

    private static void c(cim<dch> $$0) {
        $$0.a(dfl.z, (ImmutableList<Pair<Integer, cje<dch>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new cnd()), (Object)Pair.of((Object)1, new cnb(h))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.aJ, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.aP, (Object)((Object)cqx.b))));
    }

    private static void d(cim<dch> $$0) {
        $$0.a(dfl.b, 10, (ImmutableList<cje<dch>>)ImmutableList.of(cnf.a(dch::gQ), cnj.a(), new clb((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.aM, (Object)((Object)cqx.b)), ImmutableList.of((Object)Pair.of(ckw.a(0.5f), (Object)2), (Object)Pair.of((Object)new cjo(30, 60), (Object)1)))));
    }

    private static void e(cim<dch> $$0) {
        $$0.a(dfl.w, 5, (ImmutableList<cje<dch>>)ImmutableList.of(cnf.a(dch::gQ), cjx.a(cqw.aK, 2, 0.7f)), cqw.aK);
    }

    private static void f(cim<dch> $$0) {
        $$0.a(dfl.v, 5, (ImmutableList<cje<dch>>)ImmutableList.of(cnf.a(dch::gQ), new cnh(i)), cqw.aM);
    }

    private static void g(cim<dch> $$0) {
        $$0.a(dfl.x, 10, (ImmutableList<cje<dch>>)ImmutableList.of((Object)new cne()), cqw.aJ);
    }

    private static void a(dch $$0, cim<dch> $$12) {
        $$12.a(dfl.k, 10, (ImmutableList<cje<dch>>)ImmutableList.of(m, clw.a((axf $$1, chl $$2) -> !$$0.gP().d() || !$$0.H($$2), dci::a, false), cld.a((chl $$1) -> dci.a($$0, $$1), (float)$$0.i(cis.o)), clj.a(1.2f), (Object)new cni(), ckl.a(18)), cqw.p);
    }

    private static boolean a(dch $$0, chl $$12) {
        return $$0.ev().c(cqw.p).filter($$1 -> $$1 == $$12).isPresent();
    }

    private static void a(axf $$0, dch $$1, chl $$2) {
        if (!$$1.H($$2)) {
            $$1.I($$2);
        }
        dci.a((chl)$$1);
    }

    public static void a(chl $$0) {
        if ($$0.ev().a(cqw.aP)) {
            $$0.ev().a(cqw.aP, bhr.a, 1200L);
        }
    }

    public static void a(dch $$0, is $$1) {
        if (!$$0.ao().w().a($$1) || $$0.gQ().isPresent() || $$0.ev().c(cqw.p).isPresent()) {
            return;
        }
        dci.a((chl)$$0);
        $$0.ev().a(cqw.aR, bhr.a, 100L);
        $$0.ev().a(cqw.o, new cjg($$1), 100L);
        $$0.ev().a(cqw.aK, $$1, 100L);
        $$0.ev().b(cqw.n);
    }
}

