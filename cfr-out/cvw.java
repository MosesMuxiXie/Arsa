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

public class cvw {
    private static final float a = 2.0f;
    private static final float b = 0.5f;
    private static final float c = 1.25f;

    protected static cim<?> a(cim<cvv> $$0) {
        cvw.b($$0);
        cvw.c($$0);
        $$0.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<cvv> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<cvv>>)ImmutableList.of(new ciy(2.0f), (Object)new ckk(45, 90), (Object)new cko(), (Object)new cjk(cqw.Q)));
    }

    private static void c(cim<cvv> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<cvv>>>)ImmutableList.of((Object)Pair.of((Object)0, cle.a(cgu.cb, 6.0f, ccn.a(30, 60))), (Object)Pair.of((Object)1, (Object)new cjr($$0 -> Float.valueOf(1.25f))), (Object)Pair.of((Object)2, new cjs((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b)), (Set<cqw<?>>)ImmutableSet.of(), cjs.a.a, cjs.b.b, ImmutableList.of((Object)Pair.of(ckw.c(0.5f), (Object)2), (Object)Pair.of(cll.a(0.5f, 3), (Object)3), (Object)Pair.of(cmv.a(cgk::by), (Object)5))))));
    }

    public static void a(cvv $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.b));
    }
}

