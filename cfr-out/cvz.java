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
import java.util.Set;

public class cvz {
    public static final int a = 20;
    public static final int b = 7;
    private static final ccn i = ccn.a(5, 16);
    private static final float j = 1.0f;
    private static final float k = 1.25f;
    private static final float l = 1.25f;
    private static final float m = 2.0f;
    private static final float n = 1.25f;
    private static final ccn o = ccn.a(600, 1200);
    public static final int c = 5;
    public static final int d = 5;
    public static final float e = 3.5714288f;
    private static final ccn p = ccn.a(600, 6000);
    private static final ccn q = ccn.a(100, 300);
    private static final csk r = csk.a().a(($$0, $$1) -> !$$0.ay().equals(cgu.am) && ($$1.U().a(eua.F) != false || !$$0.ay().equals(cgu.h)) && $$1.w().a($$0.dj()));
    private static final float s = 3.0f;
    public static final int f = 4;
    public static final float g = 2.5f;
    public static final float h = 1.0f;

    protected static void a(cvy $$0, bgr $$1) {
        $$0.ev().a(cqw.T, o.a($$1));
        $$0.ev().a(cqw.W, p.a($$1));
    }

    protected static cim<?> a(cim<cvy> $$0) {
        cvz.b($$0);
        cvz.c($$0);
        cvz.d($$0);
        cvz.e($$0);
        $$0.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<cvy> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<cvy>>)ImmutableList.of(new cmb(0.8f), new ciy(2.0f), (Object)new ckk(45, 90), (Object)new cko(), (Object)new cjk(cqw.Q), (Object)new cjk(cqw.T), (Object)new cjk(cqw.W)));
    }

    private static void c(cim<cvy> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<cvy>>>)ImmutableList.of((Object)Pair.of((Object)0, cle.a(cgu.cb, 6.0f, ccn.a(30, 60))), (Object)Pair.of((Object)0, (Object)new cix(cgu.am)), (Object)Pair.of((Object)1, (Object)new cjr($$0 -> Float.valueOf(1.25f))), (Object)Pair.of((Object)2, cja.a(i, 1.25f)), (Object)Pair.of((Object)3, new clb(ImmutableList.of((Object)Pair.of(ckw.a(1.0f), (Object)2), (Object)Pair.of(cll.a(1.0f, 3), (Object)2), (Object)Pair.of((Object)new cjo(30, 60), (Object)1))))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.X, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.U, (Object)((Object)cqx.b))));
    }

    private static void d(cim<cvy> $$02) {
        $$02.a(dfl.q, (ImmutableList<Pair<Integer, cje<cvy>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new ckf(o, bda.mT)), (Object)Pair.of((Object)1, new ckh<cvy>(o, 5, 5, 3.5714288f, $$0 -> $$0.hd() ? bda.mP : bda.mG))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.P, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.s, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.n, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.T, (Object)((Object)cqx.b))));
    }

    private static void e(cim<cvy> $$02) {
        $$02.a(dfl.r, (ImmutableList<Pair<Integer, cje<cvy>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new cku($$0 -> $$0.hd() ? q : p, r, 3.0f, $$0 -> $$0.e_() ? 1.0 : 2.5, $$0 -> $$0.hd() ? bda.mS : bda.mJ, $$0 -> bda.mK)), (Object)Pair.of((Object)1, new ckt<cvy>($$0 -> $$0.hd() ? q.a() : p.a(), 4, 7, 1.25f, r, 20, $$0 -> $$0.hd() ? bda.mR : bda.mI))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.P, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.s, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.W, (Object)((Object)cqx.b))));
    }

    public static void a(cvy $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.r, (Object)dfl.q, (Object)dfl.b));
    }
}

