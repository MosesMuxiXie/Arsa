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
import java.util.Optional;
import java.util.Set;

public class dau {
    protected static final ImmutableList<? extends cse<? extends csd<? super dat>>> a = ImmutableList.of(cse.c, cse.d);
    protected static final ImmutableList<? extends cqw<?>> b = ImmutableList.of(cqw.g, cqw.h, cqw.k, cqw.l, cqw.m, cqw.o, cqw.n, cqw.F, cqw.u, cqw.p, cqw.q);

    static void a(cim<dat> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<dat>>)ImmutableList.of((Object)new cmb<dat>(0.8f){

            @Override
            protected boolean a(axf $$0, dat $$1) {
                return $$1.gP() && super.a($$0, (chl)$$1);
            }
        }, (Object)new ckk(45, 90), (Object)new cko()));
    }

    static void b(cim<dat> $$02) {
        $$02.a(dfl.b, 10, (ImmutableList<cje<dat>>)ImmutableList.of(clt.a((axf $$0, E $$1) -> $$1.hb(), (axf $$0, E $$1) -> $$1.ev().c(cqw.l)), cle.a(8.0f, ccn.a(30, 60)), new clb(ImmutableList.of((Object)Pair.of(ckw.a(0.3f), (Object)2), (Object)Pair.of(cll.a(0.3f, 3), (Object)2), (Object)Pair.of((Object)new cjo(30, 60), (Object)1)))));
    }

    static void a(dat $$0, cim<dat> $$12) {
        $$12.a(dfl.k, 10, (ImmutableList<cje<dat>>)ImmutableList.of(clj.a(1.0f), ckl.a(dat::gP, 40), clw.a((axf $$1, chl $$2) -> !dau.a($$0, $$2))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.p, (Object)((Object)cqx.a))));
    }

    private static boolean a(dat $$0, chl $$12) {
        Optional<List<ddm>> $$2 = $$0.ev().c(cqw.m);
        return $$2.map($$1 -> {
            ddm $$2;
            return $$12 instanceof ddm && $$1.contains($$2 = (ddm)$$12);
        }).orElse(false);
    }

    public static cim.b<dat> a() {
        return cim.a(b, a);
    }

    public static cim<dat> b(dat $$0, cim<dat> $$1) {
        dau.a($$1);
        dau.b($$1);
        dau.a($$0, $$1);
        $$1.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$1.b(dfl.b);
        $$1.e();
        return $$1;
    }

    public static void a(dat $$0) {
        if (!$$0.gP()) {
            $$0.ev().e();
        } else {
            $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.k, (Object)dfl.b));
        }
    }
}

