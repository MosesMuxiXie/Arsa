/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cts {
    private static final ccn a = ccn.a(5, 16);
    private static final float b = 0.2f;
    private static final float c = 0.15f;
    private static final float d = 0.5f;
    private static final float e = 0.6f;
    private static final float f = 0.6f;

    protected static cim<?> a(cim<ctr> $$0) {
        cts.d($$0);
        cts.e($$0);
        cts.c($$0);
        cts.b($$0);
        $$0.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<ctr> $$0) {
        $$0.a(dfl.p, (ImmutableList<Pair<Integer, cje<ctr>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new ctt()), (Object)Pair.of((Object)1, cjq.a(cjf::a, cqw.O))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.O, (Object)((Object)cqx.a))), (Set<cqw<?>>)ImmutableSet.of(cqw.O));
    }

    private static void c(cim<ctr> $$0) {
        $$0.a(dfl.k, 0, (ImmutableList<cje<ctr>>)ImmutableList.of(clw.a(ctr::a), clj.a(cts::b), ckl.a(20), cjq.a(cjf::a, cqw.p)), cqw.p);
    }

    private static void d(cim<ctr> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<ctr>>)ImmutableList.of((Object)new ckk(45, 90), (Object)new cko(), ctu.a(), (Object)new cjk(cqw.Q)));
    }

    private static void e(cim<ctr> $$0) {
        $$0.a(dfl.b, (ImmutableList<Pair<Integer, cje<ctr>>>)ImmutableList.of((Object)Pair.of((Object)0, cle.a(cgu.cb, 6.0f, ccn.a(30, 60))), (Object)Pair.of((Object)1, (Object)new cix(cgu.j, 0.2f, 2)), (Object)Pair.of((Object)2, new clb(ImmutableList.of((Object)Pair.of((Object)new cjr(cts::d), (Object)1), (Object)Pair.of(cja.a(a, cts::c, cqw.L, false), (Object)1)))), (Object)Pair.of((Object)3, clt.a(cts::a)), (Object)Pair.of((Object)3, cmh.a(6, 0.15f)), (Object)Pair.of((Object)4, new cjs((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b)), (Set<cqw<?>>)ImmutableSet.of(), cjs.a.a, cjs.b.b, ImmutableList.of((Object)Pair.of(ckw.c(0.5f), (Object)2), (Object)Pair.of(ckw.a(0.15f, false), (Object)2), (Object)Pair.of(cll.a(cts::a, cts::d, 3), (Object)3), (Object)Pair.of(cmv.a(cgk::by), (Object)5), (Object)Pair.of(cmv.a(cgk::aV), (Object)5))))));
    }

    private static boolean a(chl $$0) {
        dwo $$1 = $$0.ao();
        Optional<cks> $$2 = $$0.ev().c(cqw.o);
        if ($$2.isPresent()) {
            is $$3 = $$2.get().b();
            return $$1.F($$3) == $$0.by();
        }
        return false;
    }

    public static void a(ctr $$0) {
        cim<ctr> $$1 = $$0.ev();
        dfl $$2 = $$1.f().orElse(null);
        if ($$2 != dfl.p) {
            $$1.a((List<dfl>)ImmutableList.of((Object)dfl.p, (Object)dfl.k, (Object)dfl.b));
            if ($$2 == dfl.k && $$1.f().orElse(null) != dfl.k) {
                $$1.a(cqw.V, true, 2400L);
            }
        }
    }

    private static float b(chl $$0) {
        return $$0.by() ? 0.6f : 0.15f;
    }

    private static float c(chl $$0) {
        return $$0.by() ? 0.6f : 0.15f;
    }

    private static float d(chl $$0) {
        return $$0.by() ? 0.5f : 0.15f;
    }

    private static Optional<? extends chl> a(axf $$0, ctr $$1) {
        if (cjf.a($$1)) {
            return Optional.empty();
        }
        return $$1.ev().c(cqw.C);
    }
}

