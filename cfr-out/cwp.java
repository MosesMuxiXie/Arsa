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
import java.util.function.Predicate;

public class cwp {
    private static final float d = 1.0f;
    private static final float e = 1.3f;
    private static final float f = 0.4f;
    private static final float g = 1.6f;
    private static final ccn h = ccn.a(2400, 3600);
    private static final float i = 0.6f;
    private static final float j = 2.0f;
    private static final int k = 400;
    private static final int l = 80;
    private static final double m = 12.0;
    private static final double n = 11.0;
    protected static final csk a = csk.a().a(($$0, $$1) -> ($$1.U().a(eua.F) != false || !$$0.ay().equals(cgu.h)) && $$1.w().a($$0.dj()));
    protected static final ImmutableList<cse<? extends csd<? super cwo>>> b = ImmutableList.of(cse.c, cse.o, cse.d, cse.f, cse.t);
    protected static final ImmutableList<cqw<?>> c = ImmutableList.of(cqw.o, cqw.h, cqw.n, cqw.F, cqw.u, cqw.L, cqw.Q, cqw.S, cqw.P, cqw.s, cqw.aa, cqw.p, (Object[])new cqw[]{cqw.af, cqw.y, cqw.am, cqw.ag});

    protected static void a(cwn $$0, bgr $$1) {
        $$0.ev().a(cqw.ag, h.a($$1));
    }

    protected static cim.b<cwo> a() {
        return cim.a(c, b);
    }

    protected static cim<?> a(cim<cwo> $$0) {
        cwp.b($$0);
        cwp.c($$0);
        cwp.d($$0);
        $$0.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<cwo> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<cwo>>)ImmutableList.of(new ciy(1.6f), (Object)new ckk(45, 90), (Object)new cko(), (Object)new cjk(cqw.Q), (Object)new cjk(cqw.af), (Object)new cjk(cqw.ag)));
    }

    private static void c(cim<cwo> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<cwo>>>)ImmutableList.of((Object)Pair.of((Object)1, (Object)new cix(cgu.aM, 0.4f, 2)), (Object)Pair.of((Object)2, (Object)new cjr($$0 -> Float.valueOf(1.3f), $$0 -> $$0.e_() ? 2.5 : 3.5)), (Object)Pair.of((Object)3, clt.a(cwp::a)), (Object)Pair.of((Object)4, new cjs((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b)), (Set<cqw<?>>)ImmutableSet.of(), cjs.a.a, cjs.b.b, ImmutableList.of((Object)Pair.of(ckw.c(1.0f), (Object)2), (Object)Pair.of(cll.a(1.0f, 3), (Object)3))))));
    }

    private static void d(cim<cwo> $$0) {
        $$0.a(dfl.k, (ImmutableList<Pair<Integer, cje<cwo>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new cji(80, a, 0.6f, 2.0f, 12.0, 11.0, bda.sU))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.p, (Object)((Object)cqx.a)), (Object)Pair.of(cqw.P, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.s, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.af, (Object)((Object)cqx.b))));
    }

    protected static Optional<? extends chl> a(axf $$0, cwn $$1) {
        if (cjf.a($$1) || !$$1.by() || $$1.e_() || $$1.p()) {
            return Optional.empty();
        }
        Optional<chl> $$22 = cjf.a((chl)$$1, cqw.am).filter($$2 -> $$2.by() && csd.d($$0, $$1, $$2));
        if ($$22.isPresent()) {
            return $$22;
        }
        if ($$1.ev().a(cqw.ag)) {
            return Optional.empty();
        }
        $$1.ev().a(cqw.ag, h.a($$0.y));
        if ($$0.y.i() < 0.5f) {
            return Optional.empty();
        }
        Optional<chl> $$3 = $$1.ev().c(cqw.h).orElse(cqy.a()).a(cwp::a);
        return $$3;
    }

    protected static void a(axf $$0, cwn $$1, chl $$2) {
        if (csd.d($$0, $$1, $$2)) {
            $$1.ev().b(cqw.F);
            $$1.ev().a(cqw.am, $$2.cY(), 400L);
        }
    }

    private static boolean a(chl $$0) {
        return $$0.by() && $$0.ay().a(bdt.S);
    }

    public static void a(cwo $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.k, (Object)dfl.b));
    }

    public static Predicate<dlt> b() {
        return $$0 -> $$0.a(bdy.bj);
    }
}

