/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class cwl {
    private static final float a = 1.0f;
    private static final float b = 1.25f;
    private static final float c = 1.1f;
    private static final double d = 3.0;
    private static final ccn e = ccn.a(3, 16);
    private static final ImmutableList<cse<? extends csd<? super cwk>>> f = ImmutableList.of(cse.c, cse.f, cse.r, cse.p, cse.d);
    private static final ImmutableList<cqw<?>> g = ImmutableList.of(cqw.n, cqw.o, cqw.F, cqw.u, cqw.h, cqw.P, cqw.Q, cqw.S, cqw.s, cqw.aa, cqw.y, cqw.L, (Object[])new cqw[]{cqw.j, cqw.k, cqw.l, cqw.m});

    public static cim.b<cwk> a() {
        return cim.a(g, f);
    }

    protected static cim<?> a(cim<cwk> $$0) {
        cwl.b($$0);
        cwl.c($$0);
        cwl.d($$0);
        $$0.a(Set.of(dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<cwk> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<cwk>>)ImmutableList.of(new cmb(0.8f), new ciy(2.0f, 0), (Object)new ckk(45, 90), (Object)new cko(), (Object)new cjk(cqw.Q)));
    }

    private static void c(cim<cwk> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<cwk>>>)ImmutableList.of((Object)Pair.of((Object)1, (Object)new cjr($$0 -> Float.valueOf(1.25f), $$0 -> 3.0, true)), (Object)Pair.of((Object)2, cja.a(e, $$0 -> Float.valueOf(1.1f), cqw.k, true)), (Object)Pair.of((Object)3, cja.a(e, $$0 -> Float.valueOf(1.1f), cqw.L, true)), (Object)Pair.of((Object)4, new clb(ImmutableList.of((Object)Pair.of(ckw.b(1.0f), (Object)1), (Object)Pair.of(cll.a(1.0f, 3), (Object)1))))));
    }

    private static void d(cim<cwk> $$0) {
        $$0.a(dfl.g, (ImmutableList<Pair<Integer, cje<cwk>>>)ImmutableList.of(), Set.of(Pair.of(cqw.aa, (Object)((Object)cqx.a))));
    }

    public static void a(cwk $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.g, (Object)dfl.b));
    }
}

