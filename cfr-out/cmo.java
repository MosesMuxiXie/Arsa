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
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class cmo {
    private static final float d = 0.4f;
    public static final int a = 5;
    public static final int b = 2;
    public static final float c = 0.5f;

    public static ImmutableList<Pair<Integer, ? extends cje<? super dcx>>> a(jd<dda> $$02, float $$12) {
        return ImmutableList.of((Object)Pair.of((Object)0, new cmb(0.8f)), (Object)Pair.of((Object)0, ckc.a()), (Object)Pair.of((Object)0, (Object)new ckk(45, 90)), (Object)Pair.of((Object)0, (Object)new cmq()), (Object)Pair.of((Object)0, cmr.a()), (Object)Pair.of((Object)0, ckx.a()), (Object)Pair.of((Object)0, clh.a()), (Object)Pair.of((Object)0, cml.a($$02.a().b(), cqw.c)), (Object)Pair.of((Object)0, cml.a($$02.a().c(), cqw.d)), (Object)Pair.of((Object)1, (Object)new cko()), (Object)Pair.of((Object)2, ckr.a()), (Object)Pair.of((Object)3, (Object)new ckj($$12)), (Object[])new Pair[]{Pair.of((Object)5, cjy.a($$12, false, 4)), Pair.of((Object)6, ciw.a($$02.a().c(), cqw.c, cqw.d, true, Optional.empty(), ($$0, $$1) -> true)), Pair.of((Object)7, (Object)new cjw($$12)), Pair.of((Object)8, cmu.a($$12)), Pair.of((Object)10, ciw.a($$0 -> $$0.a(ctb.n), cqw.b, false, Optional.of((byte)14), cmo::a)), Pair.of((Object)10, ciw.a($$0 -> $$0.a(ctb.o), cqw.e, true, Optional.of((byte)14))), Pair.of((Object)10, ciz.a()), Pair.of((Object)10, cky.a())});
    }

    private static boolean a(axf $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        return $$2.a(bdp.R) && $$2.c(dzj.c) == false;
    }

    public static ImmutableList<Pair<Integer, ? extends cje<? super dcx>>> b(jd<dda> $$0, float $$1) {
        cmt $$3;
        if ($$0.a(dda.g)) {
            cms $$2 = new cms();
        } else {
            $$3 = new cmt();
        }
        return ImmutableList.of(cmo.b(), (Object)Pair.of((Object)5, new clb(ImmutableList.of((Object)Pair.of((Object)$$3, (Object)7), (Object)Pair.of(cly.a(cqw.c, 0.4f, 4), (Object)2), (Object)Pair.of(clz.a(cqw.c, 0.4f, 1, 10), (Object)5), (Object)Pair.of(cma.a(cqw.f, $$1, 1, 6, cqw.c), (Object)5), (Object)Pair.of((Object)new cjz(), (Object)($$0.a(dda.g) ? 2 : 5)), (Object)Pair.of((Object)new cmk(), (Object)($$0.a(dda.g) ? 4 : 7))))), (Object)Pair.of((Object)10, (Object)new clm(400, 1600)), (Object)Pair.of((Object)10, clg.a(cgu.cb, 4)), (Object)Pair.of((Object)2, clk.a(cqw.c, $$1, 9, 100, 1200)), (Object)Pair.of((Object)3, (Object)new cjt(100)), (Object)Pair.of((Object)99, cmj.a()));
    }

    public static ImmutableList<Pair<Integer, ? extends cje<? super dcx>>> a(float $$0) {
        return ImmutableList.of((Object)Pair.of((Object)0, (Object)new cko(80, 120)), cmo.a(), (Object)Pair.of((Object)5, ckq.a()), (Object)Pair.of((Object)5, new clb((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.i, (Object)((Object)cqx.b)), ImmutableList.of((Object)Pair.of(ckb.a(cgu.bL, 8, cqw.r, $$0, 2), (Object)2), (Object)Pair.of(ckb.a(cgu.x, 8, cqw.r, $$0, 2), (Object)1), (Object)Pair.of(cmm.a($$0), (Object)1), (Object)Pair.of(cll.a($$0, 2), (Object)1), (Object)Pair.of((Object)new ckd($$0), (Object)2), (Object)Pair.of((Object)new cjo(20, 40), (Object)2)))), (Object)Pair.of((Object)99, cmj.a()));
    }

    public static ImmutableList<Pair<Integer, ? extends cje<? super dcx>>> c(jd<dda> $$02, float $$1) {
        return ImmutableList.of((Object)Pair.of((Object)2, clk.a(cqw.b, $$1, 1, 150, 1200)), (Object)Pair.of((Object)3, cml.a((jd<cta> $$0) -> $$0.a(ctb.n), cqw.b)), (Object)Pair.of((Object)3, (Object)new clo()), (Object)Pair.of((Object)5, new clb((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.b, (Object)((Object)cqx.b)), ImmutableList.of((Object)Pair.of(clc.a($$1), (Object)1), (Object)Pair.of(cka.a($$1), (Object)4), (Object)Pair.of(cjv.a($$1, 4), (Object)2), (Object)Pair.of((Object)new cjo(20, 40), (Object)2)))), cmo.b(), (Object)Pair.of((Object)99, cmj.a()));
    }

    public static ImmutableList<Pair<Integer, ? extends cje<? super dcx>>> d(jd<dda> $$02, float $$1) {
        return ImmutableList.of((Object)Pair.of((Object)2, cme.a(ImmutableList.of((Object)Pair.of(cly.a(cqw.e, 0.4f, 40), (Object)2), (Object)Pair.of(clp.a(), (Object)2)))), (Object)Pair.of((Object)10, (Object)new clm(400, 1600)), (Object)Pair.of((Object)10, clg.a(cgu.cb, 4)), (Object)Pair.of((Object)2, clk.a(cqw.e, $$1, 6, 100, 200)), (Object)Pair.of((Object)3, (Object)new cjt(100)), (Object)Pair.of((Object)3, cml.a((jd<cta> $$0) -> $$0.a(ctb.o), cqw.e)), (Object)Pair.of((Object)3, new cjs((Map<cqw<?>, cqx>)ImmutableMap.of(), (Set<cqw<?>>)ImmutableSet.of(cqw.r), cjs.a.a, cjs.b.a, ImmutableList.of((Object)Pair.of((Object)new cmc(), (Object)1)))), cmo.a(), (Object)Pair.of((Object)99, cmj.a()));
    }

    public static ImmutableList<Pair<Integer, ? extends cje<? super dcx>>> e(jd<dda> $$0, float $$1) {
        return ImmutableList.of((Object)Pair.of((Object)2, new clb(ImmutableList.of((Object)Pair.of(ckb.a(cgu.bL, 8, cqw.r, $$1, 2), (Object)2), (Object)Pair.of(ckb.a(cgu.bL, 8, cfy::Y_, cfy::Y_, cqw.s, $$1, 2), (Object)1), (Object)Pair.of(ckb.a(cgu.x, 8, cqw.r, $$1, 2), (Object)1), (Object)Pair.of(cmm.a($$1), (Object)1), (Object)Pair.of(cll.a($$1, 2), (Object)1), (Object)Pair.of((Object)new ckd($$1), (Object)1), (Object)Pair.of((Object)new cjo(30, 60), (Object)1)))), (Object)Pair.of((Object)3, (Object)new cjt(100)), (Object)Pair.of((Object)3, clg.a(cgu.cb, 4)), (Object)Pair.of((Object)3, (Object)new clm(400, 1600)), (Object)Pair.of((Object)3, new cjs((Map<cqw<?>, cqx>)ImmutableMap.of(), (Set<cqw<?>>)ImmutableSet.of(cqw.r), cjs.a.a, cjs.b.a, ImmutableList.of((Object)Pair.of((Object)new cmc(), (Object)1)))), (Object)Pair.of((Object)3, new cjs((Map<cqw<?>, cqx>)ImmutableMap.of(), (Set<cqw<?>>)ImmutableSet.of(cqw.s), cjs.a.a, cjs.b.a, ImmutableList.of((Object)Pair.of((Object)new cmp(), (Object)1)))), cmo.a(), (Object)Pair.of((Object)99, cmj.a()));
    }

    public static ImmutableList<Pair<Integer, ? extends cje<? super dcx>>> f(jd<dda> $$0, float $$1) {
        float $$2 = $$1 * 1.5f;
        return ImmutableList.of((Object)Pair.of((Object)0, cmn.a()), (Object)Pair.of((Object)1, cli.b(cqw.B, $$2, 6, false)), (Object)Pair.of((Object)1, cli.b(cqw.z, $$2, 6, false)), (Object)Pair.of((Object)3, cmm.a($$2, 2, 2)), cmo.b());
    }

    public static ImmutableList<Pair<Integer, ? extends cje<? super dcx>>> g(jd<dda> $$0, float $$1) {
        return ImmutableList.of((Object)Pair.of((Object)0, cla.a()), (Object)Pair.of((Object)0, cme.a(ImmutableList.of((Object)Pair.of(clk.a(cqw.e, $$1 * 1.5f, 2, 150, 200), (Object)6), (Object)Pair.of(cmm.a($$1 * 1.5f), (Object)2)))), cmo.b(), (Object)Pair.of((Object)99, ckz.a()));
    }

    public static ImmutableList<Pair<Integer, ? extends cje<? super dcx>>> h(jd<dda> $$0, float $$1) {
        return ImmutableList.of((Object)Pair.of((Object)0, cmv.a(cmv.a(cmo::b), cme.a(ImmutableList.of((Object)Pair.of(ckn.a($$1), (Object)5), (Object)Pair.of(cmm.a($$1 * 1.1f), (Object)2))))), (Object)Pair.of((Object)0, (Object)new cjh(600, 600)), (Object)Pair.of((Object)2, cmv.a(cmv.a(cmo::a), cke.a(24, $$1 * 1.4f, 1))), cmo.b(), (Object)Pair.of((Object)99, ckz.a()));
    }

    public static ImmutableList<Pair<Integer, ? extends cje<? super dcx>>> i(jd<dda> $$0, float $$1) {
        int $$2 = 2;
        return ImmutableList.of((Object)Pair.of((Object)0, clf.a(15, 3)), (Object)Pair.of((Object)1, cke.a(32, $$1 * 1.25f, 2)), cmo.b());
    }

    private static Pair<Integer, cje<chl>> a() {
        return Pair.of((Object)5, new clb(ImmutableList.of((Object)Pair.of(cld.a(cgu.x, 8.0f), (Object)8), (Object)Pair.of(cld.a(cgu.bL, 8.0f), (Object)2), (Object)Pair.of(cld.a(cgu.cb, 8.0f), (Object)2), (Object)Pair.of(cld.a(cho.b, 8.0f), (Object)1), (Object)Pair.of(cld.a(cho.f, 8.0f), (Object)1), (Object)Pair.of(cld.a(cho.d, 8.0f), (Object)1), (Object)Pair.of(cld.a(cho.e, 8.0f), (Object)1), (Object)Pair.of(cld.a(cho.g, 8.0f), (Object)1), (Object)Pair.of(cld.a(cho.a, 8.0f), (Object)1), (Object)Pair.of((Object)new cjo(30, 60), (Object)2))));
    }

    private static Pair<Integer, cje<chl>> b() {
        return Pair.of((Object)5, new clb(ImmutableList.of((Object)Pair.of(cld.a(cgu.bL, 8.0f), (Object)2), (Object)Pair.of(cld.a(cgu.cb, 8.0f), (Object)2), (Object)Pair.of((Object)new cjo(30, 60), (Object)8))));
    }

    private static boolean a(axf $$0, chl $$1) {
        dfh $$2 = $$0.f($$1.dK());
        return $$2 != null && $$2.r() && !$$2.e() && !$$2.f();
    }

    private static boolean b(axf $$0, chl $$1) {
        dfh $$2 = $$0.f($$1.dK());
        return $$2 != null && $$2.e();
    }
}

