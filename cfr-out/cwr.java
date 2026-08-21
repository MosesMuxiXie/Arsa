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
import java.util.Set;

public class cwr {
    private static final float c = 1.0f;
    private static final float d = 0.9f;
    private static final float e = 0.5f;
    private static final float f = 2.0f;
    private static final int g = 80;
    private static final double h = 12.0;
    private static final double i = 11.0;
    protected static final ImmutableList<cse<? extends csd<? super cwq>>> a = ImmutableList.of(cse.c, cse.o, cse.d, cse.f, cse.t);
    protected static final ImmutableList<cqw<?>> b = ImmutableList.of(cqw.o, cqw.h, cqw.n, cqw.F, cqw.u, cqw.L, cqw.Q, cqw.S, cqw.P, cqw.s, cqw.aa, cqw.p, (Object[])new cqw[]{cqw.af, cqw.y, cqw.am, cqw.ag});

    protected static cim.b<cwq> a() {
        return cim.a(b, a);
    }

    protected static cim<?> a(cim<cwq> $$0) {
        cwr.b($$0);
        cwr.c($$0);
        cwr.d($$0);
        $$0.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<cwq> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<cwq>>)ImmutableList.of((Object)new ckk(45, 90), (Object)new cko(), (Object)new cjk(cqw.Q), (Object)new cjk(cqw.af), (Object)new cjk(cqw.ag)));
    }

    private static void c(cim<cwq> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<cwq>>>)ImmutableList.of((Object)Pair.of((Object)1, (Object)new cjr($$0 -> Float.valueOf(0.9f), $$0 -> $$0.e_() ? 2.5 : 3.5)), (Object)Pair.of((Object)2, clt.a(cwp::a)), (Object)Pair.of((Object)3, new cjs((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b)), (Set<cqw<?>>)ImmutableSet.of(), cjs.a.a, cjs.b.b, ImmutableList.of((Object)Pair.of(ckw.c(1.0f), (Object)2), (Object)Pair.of(cll.a(1.0f, 3), (Object)3))))));
    }

    private static void d(cim<cwq> $$0) {
        $$0.a(dfl.k, (ImmutableList<Pair<Integer, cje<cwq>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new cji(80, cwp.a, 0.5f, 2.0f, 12.0, 11.0, bda.GW))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.p, (Object)((Object)cqx.a)), (Object)Pair.of(cqw.P, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.s, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.af, (Object)((Object)cqx.b))));
    }

    public static void a(cwq $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.k, (Object)dfl.b));
    }
}

