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

public class dax {
    public static final int a = 8;
    public static final int b = 4;
    private static final ccn c = bhn.a(5, 20);
    private static final int d = 200;
    private static final int e = 8;
    private static final int f = 15;
    private static final int g = 40;
    private static final int h = 15;
    private static final int i = 200;
    private static final ccn j = ccn.a(5, 16);
    private static final float k = 1.0f;
    private static final float l = 1.3f;
    private static final float m = 0.6f;
    private static final float n = 0.4f;
    private static final float o = 0.6f;

    protected static cim<?> a(cim<daw> $$0) {
        dax.b($$0);
        dax.c($$0);
        dax.d($$0);
        dax.e($$0);
        $$0.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<daw> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<daw>>)ImmutableList.of((Object)new ckk(45, 90), (Object)new cko()));
    }

    private static void c(cim<daw> $$0) {
        $$0.a(dfl.b, 10, (ImmutableList<cje<daw>>)ImmutableList.of(cjc.a(cqw.aH, 200), (Object)new cix(cgu.ao, 0.6f, 2), cli.a(cqw.aH, 1.0f, 8, true), clt.a(dax::a), cmv.a(daw::gP, cli.b(cqw.aB, 0.4f, 8, false)), cle.a(8.0f, ccn.a(30, 60)), cja.a(j, 0.6f), dax.a()));
    }

    private static void d(cim<daw> $$0) {
        $$0.a(dfl.k, 10, (ImmutableList<cje<daw>>)ImmutableList.of(cjc.a(cqw.aH, 200), (Object)new cix(cgu.ao, 0.6f, 2), clj.a(1.0f), cmv.a(daw::gP, ckl.a(40)), cmv.a(cfy::e_, ckl.a(15)), clw.a(), cjq.a(dax::h, cqw.p)), cqw.p);
    }

    private static void e(cim<daw> $$0) {
        $$0.a(dfl.n, 10, (ImmutableList<cje<daw>>)ImmutableList.of(cli.b(cqw.A, 1.3f, 15, false), dax.a(), cle.a(8.0f, ccn.a(30, 60)), cjq.a(dax::d, cqw.A)), cqw.A);
    }

    private static clb<daw> a() {
        return new clb<daw>((List<Pair<cje<daw>, Integer>>)ImmutableList.of((Object)Pair.of(ckw.a(0.4f), (Object)2), (Object)Pair.of(cll.a(0.4f, 3), (Object)2), (Object)Pair.of((Object)new cjo(30, 60), (Object)1)));
    }

    protected static void a(daw $$0) {
        cim<daw> $$1 = $$0.ev();
        dfl $$2 = $$1.f().orElse(null);
        $$1.a((List<dfl>)ImmutableList.of((Object)dfl.k, (Object)dfl.n, (Object)dfl.b));
        dfl $$3 = $$1.f().orElse(null);
        if ($$2 != $$3) {
            dax.b($$0).ifPresent($$0::b);
        }
        $$0.w($$1.a(cqw.p));
    }

    protected static void a(daw $$0, chl $$1) {
        if ($$0.e_()) {
            return;
        }
        if ($$1.ay() == cgu.aZ && dax.e($$0)) {
            dax.d($$0, $$1);
            dax.b($$0, $$1);
            return;
        }
        dax.f($$0, $$1);
    }

    private static void b(daw $$0, chl $$12) {
        dax.f($$0).forEach($$1 -> dax.c($$1, $$12));
    }

    private static void c(daw $$0, chl $$1) {
        chl $$2 = $$1;
        cim<daw> $$3 = $$0.ev();
        $$2 = cjf.a((chl)$$0, $$3.c(cqw.A), $$2);
        $$2 = cjf.a((chl)$$0, $$3.c(cqw.p), $$2);
        dax.d($$0, $$2);
    }

    private static void d(daw $$0, chl $$1) {
        $$0.ev().b(cqw.p);
        $$0.ev().b(cqw.n);
        $$0.ev().a(cqw.A, $$1, c.a($$0.ao().y));
    }

    private static Optional<? extends chl> a(axf $$0, daw $$1) {
        if (dax.c($$1) || dax.h($$1)) {
            return Optional.empty();
        }
        return $$1.ev().c(cqw.l);
    }

    static boolean a(daw $$0, is $$1) {
        Optional<is> $$2 = $$0.ev().c(cqw.aH);
        return $$2.isPresent() && $$2.get().a($$1, 8.0);
    }

    private static boolean d(daw $$0) {
        return $$0.gP() && !dax.e($$0);
    }

    private static boolean e(daw $$0) {
        int $$2;
        if ($$0.e_()) {
            return false;
        }
        int $$1 = $$0.ev().c(cqw.aD).orElse(0);
        return $$1 > ($$2 = $$0.ev().c(cqw.aE).orElse(0) + 1);
    }

    protected static void a(axf $$0, daw $$1, chl $$2) {
        cim<daw> $$3 = $$1.ev();
        $$3.b(cqw.aI);
        $$3.b(cqw.s);
        if ($$1.e_()) {
            dax.c($$1, $$2);
            return;
        }
        dax.b($$0, $$1, $$2);
    }

    private static void b(axf $$0, daw $$1, chl $$2) {
        if ($$1.ev().c(dfl.n) && $$2.ay() == cgu.aZ) {
            return;
        }
        if ($$2.ay() == cgu.ao) {
            return;
        }
        if (cjf.a((chl)$$1, $$2, 4.0)) {
            return;
        }
        if (!csd.c($$0, $$1, $$2)) {
            return;
        }
        dax.e($$1, $$2);
        dax.f($$1, $$2);
    }

    private static void e(daw $$0, chl $$1) {
        cim<daw> $$2 = $$0.ev();
        $$2.b(cqw.F);
        $$2.b(cqw.s);
        $$2.a(cqw.p, $$1, 200L);
    }

    private static void f(daw $$0, chl $$12) {
        dax.f($$0).forEach($$1 -> dax.g($$1, $$12));
    }

    private static void g(daw $$0, chl $$1) {
        if (dax.c($$0)) {
            return;
        }
        Optional<chl> $$2 = $$0.ev().c(cqw.p);
        chl $$3 = cjf.a((chl)$$0, $$2, $$1);
        dax.e($$0, $$3);
    }

    public static Optional<bcz> b(daw $$0) {
        return $$0.ev().f().map($$1 -> dax.a($$0, $$1));
    }

    private static bcz a(daw $$0, dfl $$1) {
        if ($$1 == dfl.n || $$0.gR()) {
            return bda.os;
        }
        if ($$1 == dfl.k) {
            return bda.on;
        }
        if (dax.g($$0)) {
            return bda.os;
        }
        return bda.om;
    }

    private static List<daw> f(daw $$0) {
        return $$0.ev().c(cqw.aA).orElse((List<daw>)ImmutableList.of());
    }

    private static boolean g(daw $$0) {
        return $$0.ev().a(cqw.aH);
    }

    private static boolean h(daw $$0) {
        return $$0.ev().a(cqw.s);
    }

    protected static boolean c(daw $$0) {
        return $$0.ev().a(cqw.aI);
    }
}

