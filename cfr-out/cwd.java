/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cwd {
    private static final float a = 1.5f;
    private static final float b = 1.0f;
    private static final int c = 32;
    private static final int d = 8;
    private static final int e = 1;
    private static final int f = 9;
    private static final Predicate<eoh> g = $$0 -> $$0.a(bdp.ai);
    private static final Predicate<eoh> h = $$0 -> $$0.a(dzs.cS) || $$0.a(dzs.hM);
    private static final ImmutableList<cse<? extends csd<? super cwc>>> i = ImmutableList.of(cse.c, cse.f);
    private static final ImmutableList<cqw<?>> j = ImmutableList.of(cqw.aa, cqw.y, cqw.z, cqw.g, cqw.h, cqw.n, cqw.o, cqw.F, cqw.u, cqw.R, cqw.ae, cqw.ac, (Object[])new cqw[]{cqw.ad, cqw.w});

    public static cim.b<cwc> a() {
        return cim.a(j, i);
    }

    protected static cim<?> a(cim<cwc> $$0) {
        cwd.b($$0);
        cwd.c($$0);
        $$0.a(Set.of(dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    public static void a(cwc $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.b));
    }

    private static void b(cim<cwc> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<cwc>>)ImmutableList.of(new ciy(1.5f), (Object)new ckk(45, 90), (Object)new cko(), ckc.a(), (Object)new cjk(cqw.R), (Object)new cjk(cqw.ae)));
    }

    private static void c(cim<cwc> $$0) {
        $$0.a(dfl.b, (ImmutableList<Pair<Integer, cje<cwc>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new cmd(1.0f, g, h, 32, 8, cwd.b(), cwd.c(), cwd.d())), (Object)Pair.of((Object)1, cle.a(cgu.cb, 6.0f, ccn.a(40, 80))), (Object)Pair.of((Object)2, new clb((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b), cqw.ae, (Object)((Object)cqx.a)), ImmutableList.of((Object)Pair.of(ckw.a(1.0f, 2, 2), (Object)1), (Object)Pair.of((Object)new cjo(30, 60), (Object)1))))));
    }

    private static Map<cmd.a, cmd.b> b() {
        return Map.of(cmd.a.a, cwd.a(cwg.b, bda.gI), cmd.a.b, cwd.a(cwg.c, bda.gJ), cmd.a.c, cwd.a(cwg.d, bda.gK), cmd.a.d, cwd.a(cwg.e, bda.gL));
    }

    private static cmd.b a(cwg $$0, @Nullable bcz $$1) {
        return ($$2, $$3, $$4) -> {
            if ($$2 instanceof cwc) {
                cwc $$5 = (cwc)$$2;
                ccv $$6 = $$3.b();
                if ($$4 == 1) {
                    $$6.a($$5);
                    $$5.h($$3.a());
                    $$5.a($$0);
                }
                if ($$4 == 9 && $$1 != null) {
                    $$5.a($$1);
                }
                if ($$4 == 60) {
                    if ($$6.am_().contains($$2)) {
                        $$6.b($$5);
                    }
                    $$5.gQ();
                }
            }
        };
    }

    private static Consumer<cht> c() {
        return $$0 -> {
            if ($$0 instanceof cwc) {
                cwc $$1 = (cwc)$$0;
                $$1.gQ();
                $$1.a(cwg.a);
            }
        };
    }

    private static Predicate<cmd.d> d() {
        return $$0 -> {
            elb $$1 = $$0.c();
            if ($$1 instanceof elj) {
                elj $$2 = (elj)$$1;
                return !$$2.am_().isEmpty();
            }
            return false;
        };
    }
}

