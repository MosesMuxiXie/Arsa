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
import java.util.function.Predicate;

public class cvr {
    private static final float a = 2.0f;
    private static final float b = 1.0f;
    private static final float c = 1.0f;
    private static final float d = 0.75f;
    private static final ccn e = ccn.a(100, 140);
    private static final int f = 2;
    private static final int g = 4;
    private static final float h = 3.5714288f;
    private static final float i = 1.25f;

    protected static void a(cvq $$0, bgr $$1) {
        $$0.ev().a(cqw.T, e.a($$1));
    }

    protected static cim<?> a(cim<cvq> $$0) {
        cvr.b($$0);
        cvr.c($$0);
        cvr.d($$0);
        cvr.e($$0);
        cvr.g($$0);
        cvr.f($$0);
        $$0.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<cvq> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<cvq>>)ImmutableList.of(new ciy(2.0f), (Object)new ckk(45, 90), (Object)new cko(), (Object)new cjk(cqw.Q), (Object)new cjk(cqw.T)));
    }

    private static void c(cim<cvq> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<cvq>>>)ImmutableList.of((Object)Pair.of((Object)0, cle.a(cgu.cb, 6.0f, ccn.a(30, 60))), (Object)Pair.of((Object)0, (Object)new cix(cgu.af)), (Object)Pair.of((Object)1, (Object)new cjr($$0 -> Float.valueOf(1.25f))), (Object)Pair.of((Object)2, clt.a((axf $$0, E $$1) -> cvr.b($$1), (axf $$0, E $$1) -> $$1.ev().c(cqw.C))), (Object)Pair.of((Object)3, cmf.a(6, 1.0f)), (Object)Pair.of((Object)4, new clb((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b)), ImmutableList.of((Object)Pair.of(ckw.a(1.0f), (Object)1), (Object)Pair.of(cll.a(1.0f, 3), (Object)1), (Object)Pair.of((Object)new cjl(), (Object)3), (Object)Pair.of(cmv.a(cgk::aV), (Object)2))))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.U, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.Y, (Object)((Object)cqx.b))));
    }

    private static void d(cim<cvq> $$02) {
        $$02.a(dfl.t, (ImmutableList<Pair<Integer, cje<cvq>>>)ImmutableList.of((Object)Pair.of((Object)0, cle.a(cgu.cb, 6.0f, ccn.a(30, 60))), (Object)Pair.of((Object)1, (Object)new cjr($$0 -> Float.valueOf(1.25f))), (Object)Pair.of((Object)2, clt.a((axf $$0, E $$1) -> cvr.b($$1), (axf $$0, E $$1) -> $$1.ev().c(cqw.C))), (Object)Pair.of((Object)3, cmf.a(8, 1.5f)), (Object)Pair.of((Object)5, new cjs((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b)), (Set<cqw<?>>)ImmutableSet.of(), cjs.a.a, cjs.b.b, ImmutableList.of((Object)Pair.of(ckw.c(0.75f), (Object)1), (Object)Pair.of(ckw.a(1.0f, true), (Object)1), (Object)Pair.of(cll.a(1.0f, 3), (Object)1), (Object)Pair.of(cmv.a(cgk::by), (Object)5))))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.U, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.Y, (Object)((Object)cqx.a))));
    }

    private static void e(cim<cvq> $$02) {
        $$02.a(dfl.u, (ImmutableList<Pair<Integer, cje<cvq>>>)ImmutableList.of((Object)Pair.of((Object)0, cle.a(cgu.cb, 6.0f, ccn.a(30, 60))), (Object)Pair.of((Object)1, clt.a((axf $$0, E $$1) -> cvr.b($$1), (axf $$0, E $$1) -> $$1.ev().c(cqw.C))), (Object)Pair.of((Object)2, cmg.a(8, 1.0f)), (Object)Pair.of((Object)3, cmi.a(dzs.uM)), (Object)Pair.of((Object)4, new clb(ImmutableList.of((Object)Pair.of(ckw.a(1.0f), (Object)2), (Object)Pair.of(cll.a(1.0f, 3), (Object)1), (Object)Pair.of((Object)new cjl(), (Object)2), (Object)Pair.of(cmv.a(cgk::aV), (Object)1))))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.U, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.Z, (Object)((Object)cqx.a))));
    }

    private static void f(cim<cvq> $$02) {
        $$02.a(dfl.q, (ImmutableList<Pair<Integer, cje<cvq>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new ckf(e, bda.lF)), (Object)Pair.of((Object)1, new ckg<cvq>(e, 2, 4, 3.5714288f, $$0 -> bda.lE, bdp.cg, 0.5f, cvr::a))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.P, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.s, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.T, (Object)((Object)cqx.b)), (Object)Pair.of(cqw.Y, (Object)((Object)cqx.b))));
    }

    private static void g(cim<cvq> $$0) {
        $$0.a(dfl.s, 0, (ImmutableList<cje<cvq>>)ImmutableList.of(clw.a(), (Object)new cvu(bda.lG, bda.lB)), cqw.p);
    }

    private static <E extends chn> boolean a(E $$0, is $$1) {
        dwo $$2 = $$0.ao();
        is $$3 = $$1.e();
        if (!($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c())) {
            return false;
        }
        eoh $$4 = $$2.a_($$1);
        eoh $$5 = $$2.a_($$3);
        if ($$4.a(bdp.cg) || $$5.a(bdp.cg)) {
            return true;
        }
        flu $$6 = new flu($$0.ao(), $$0);
        fls $$7 = flx.a($$6, $$1.k());
        fls $$8 = flx.a($$6, $$3.k());
        if ($$7 == fls.e || $$4.l() && $$8 == fls.e) {
            return true;
        }
        return ckh.a($$0, $$1);
    }

    private static boolean b(cvq $$0) {
        return !cjf.a($$0);
    }

    public static void a(cvq $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.s, (Object)dfl.u, (Object)dfl.q, (Object)dfl.t, (Object)dfl.b));
    }

    public static Predicate<dlt> a() {
        return $$0 -> $$0.a(bdy.aT);
    }
}

