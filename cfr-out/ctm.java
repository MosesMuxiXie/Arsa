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
import java.util.UUID;
import java.util.function.Predicate;

public class ctm {
    private static final float a = 1.0f;
    private static final float b = 2.25f;
    private static final float c = 1.75f;
    private static final float d = 2.5f;
    private static final int e = 4;
    private static final int f = 16;
    private static final int g = 6;
    private static final int h = 30;
    private static final int i = 60;
    private static final int j = 600;
    private static final int k = 32;
    private static final int l = 20;

    protected static cim<?> a(cim<ctl> $$0) {
        ctm.b($$0);
        ctm.c($$0);
        $$0.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<ctl> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<ctl>>)ImmutableList.of(new cmb(0.8f), new ciy(2.5f), (Object)new ckk(45, 90), (Object)new cko(), (Object)new cjk(cqw.aZ), (Object)new cjk(cqw.ba)));
    }

    private static void c(cim<ctl> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<ctl>>>)ImmutableList.of((Object)Pair.of((Object)0, cjy.a($$0 -> true, 1.75f, true, 32)), (Object)Pair.of((Object)1, new cju(ctm::b, 2.25f, 20)), (Object)Pair.of((Object)2, clv.a(ctm::b, Predicate.not(ctm::c), 4, 16, 2.25f)), (Object)Pair.of((Object)3, cle.a(6.0f, ccn.a(30, 60))), (Object)Pair.of((Object)4, new clb(ImmutableList.of((Object)Pair.of(ckw.b(1.0f), (Object)2), (Object)Pair.of(cll.a(1.0f, 3), (Object)2), (Object)Pair.of((Object)new cjo(30, 60), (Object)1))))), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of());
    }

    public static void a(ctl $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.b));
    }

    public static void a(chl $$0, is $$1) {
        cim<?> $$2 = $$0.ev();
        jc $$3 = jc.a($$0.ao().aq(), $$1);
        Optional<jc> $$4 = $$2.c(cqw.aY);
        if ($$4.isEmpty()) {
            $$2.a(cqw.aY, $$3);
            $$2.a(cqw.aZ, 600);
        } else if ($$4.get().equals($$3)) {
            $$2.a(cqw.aZ, 600);
        }
    }

    private static Optional<cks> b(chl $$0) {
        cim<?> $$1 = $$0.ev();
        Optional<jc> $$2 = $$1.c(cqw.aY);
        if ($$2.isPresent()) {
            jc $$3 = $$2.get();
            if (ctm.a($$0, $$1, $$3)) {
                return Optional.of(new cjg($$3.b().d()));
            }
            $$1.b(cqw.aY);
        }
        return ctm.d($$0);
    }

    private static boolean c(chl $$0) {
        cim<czl> $$1 = $$0.ev();
        return $$1.a(cqw.M);
    }

    private static boolean a(chl $$0, cim<?> $$1, jc $$2) {
        Optional<Integer> $$3 = $$1.c(cqw.aZ);
        dwo $$4 = $$0.ao();
        return $$2.a($$4.aq(), $$0.dK(), 1024) && $$4.a_($$2.b()).a(dzs.bf) && $$3.isPresent();
    }

    private static Optional<cks> d(chl $$02) {
        return ctm.a($$02).map($$0 -> new cjp((cgk)$$0, true));
    }

    public static Optional<axg> a(chl $$0) {
        dwo $$1 = $$0.ao();
        if (!$$1.B_() && $$1 instanceof axf) {
            axf $$2 = (axf)$$1;
            Optional<UUID> $$3 = $$0.ev().c(cqw.aX);
            if ($$3.isPresent()) {
                cgk $$4 = $$2.d($$3.get());
                if ($$4 instanceof axg) {
                    axg $$5 = (axg)$$4;
                    if (($$5.h.d() || $$5.h.e()) && $$5.a((cgk)$$0, 64.0)) {
                        return Optional.of($$5);
                    }
                }
                return Optional.empty();
            }
        }
        return Optional.empty();
    }
}

