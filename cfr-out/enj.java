/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class enj {
    private static final a a = enj$a.a("trial_chamber/breeze");
    private static final a b = enj$a.a("trial_chamber/melee/husk");
    private static final a c = enj$a.a("trial_chamber/melee/spider");
    private static final a d = enj$a.a("trial_chamber/melee/zombie");
    private static final a e = enj$a.a("trial_chamber/ranged/poison_skeleton");
    private static final a f = enj$a.a("trial_chamber/ranged/skeleton");
    private static final a g = enj$a.a("trial_chamber/ranged/stray");
    private static final a h = enj$a.a("trial_chamber/slow_ranged/poison_skeleton");
    private static final a i = enj$a.a("trial_chamber/slow_ranged/skeleton");
    private static final a j = enj$a.a("trial_chamber/slow_ranged/stray");
    private static final a k = enj$a.a("trial_chamber/small_melee/baby_zombie");
    private static final a l = enj$a.a("trial_chamber/small_melee/cave_spider");
    private static final a m = enj$a.a("trial_chamber/small_melee/silverfish");
    private static final a n = enj$a.a("trial_chamber/small_melee/slime");

    public static void a(qr<eni> $$02) {
        enj.a($$02, a, eni.b().b(1.0f).d(0.5f).b(20).a(2.0f).c(1.0f).a(cbn.a(enj.a(cgu.t))).a(), eni.b().d(0.5f).b(20).a(4.0f).c(1.0f).a(cbn.a(enj.a(cgu.t))).b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a());
        enj.a($$02, b, enj.c().a(cbn.a(enj.a(cgu.ar))).a(), enj.c().a(cbn.a(enj.a(cgu.ar, fnv.ak))).b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a());
        enj.a($$02, c, enj.c().a(cbn.a(enj.a(cgu.bw))).a(), enj.a().a(cbn.a(enj.a(cgu.bw))).b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a());
        enj.a($$02, d, enj.c().a(cbn.a(enj.a(cgu.bW))).a(), enj.c().b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.a(enj.a(cgu.bW, fnv.ak))).a());
        enj.a($$02, e, enj.c().a(cbn.a(enj.a(cgu.s))).a(), enj.c().b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.a(enj.a(cgu.s, fnv.aj))).a());
        enj.a($$02, f, enj.c().a(cbn.a(enj.a(cgu.bn))).a(), enj.c().b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.a(enj.a(cgu.bn, fnv.aj))).a());
        enj.a($$02, g, enj.c().a(cbn.a(enj.a(cgu.bA))).a(), enj.c().b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.a(enj.a(cgu.bA, fnv.aj))).a());
        enj.a($$02, h, enj.b().a(cbn.a(enj.a(cgu.s))).a(), enj.b().b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.a(enj.a(cgu.s, fnv.aj))).a());
        enj.a($$02, i, enj.b().a(cbn.a(enj.a(cgu.bn))).a(), enj.b().b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.a(enj.a(cgu.bn, fnv.aj))).a());
        enj.a($$02, j, enj.b().a(cbn.a(enj.a(cgu.bA))).a(), enj.b().b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.a(enj.a(cgu.bA, fnv.aj))).a());
        enj.a($$02, k, eni.b().d(0.5f).b(20).a(cbn.a(enj.a(cgu.bW, $$0 -> $$0.a("IsBaby", true), null))).a(), eni.b().d(0.5f).b(20).b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.a(enj.a(cgu.bW, $$0 -> $$0.a("IsBaby", true), fnv.ak))).a());
        enj.a($$02, l, enj.c().a(cbn.a(enj.a(cgu.y))).a(), enj.a().b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.a(enj.a(cgu.y))).a());
        enj.a($$02, m, enj.c().a(cbn.a(enj.a(cgu.bm))).a(), enj.a().b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.a(enj.a(cgu.bm))).a());
        enj.a($$02, n, enj.c().a(cbn.b().a(enj.a(cgu.bp, (uz $$0) -> $$0.a("Size", (byte)1)), 3).a(enj.a(cgu.bp, (uz $$0) -> $$0.a("Size", (byte)2)), 1).a()).a(), enj.a().b(cbn.b().a(fnv.aS, 3).a(fnv.aT, 7).a()).a(cbn.b().a(enj.a(cgu.bp, (uz $$0) -> $$0.a("Size", (byte)1)), 3).a(enj.a(cgu.bp, (uz $$0) -> $$0.a("Size", (byte)2)), 1).a()).a());
    }

    private static <T extends cgk> dxi a(cgu<T> $$02) {
        return enj.a($$02, $$0 -> {}, null);
    }

    private static <T extends cgk> dxi a(cgu<T> $$0, Consumer<uz> $$1) {
        return enj.a($$0, $$1, null);
    }

    private static <T extends cgk> dxi a(cgu<T> $$02, amt<fof> $$1) {
        return enj.a($$02, $$0 -> {}, $$1);
    }

    private static <T extends cgk> dxi a(cgu<T> $$02, Consumer<uz> $$1, @Nullable amt<fof> $$2) {
        uz $$3 = new uz();
        $$3.a("id", mi.g.b($$02).toString());
        $$1.accept($$3);
        Optional<cgx> $$4 = Optional.ofNullable($$2).map($$0 -> new cgx((amt<fof>)$$0, 0.0f));
        return new dxi($$3, Optional.empty(), $$4);
    }

    private static void a(qr<eni> $$0, a $$1, eni $$2, eni $$3) {
        $$0.a($$1.a, $$2);
        $$0.a($$1.b, $$3);
    }

    static amt<eni> a(String $$0) {
        return amt.a(mj.bx, amo.b($$0));
    }

    private static eni.a a() {
        return eni.b().b(4.0f).d(0.5f).b(20).a(12.0f);
    }

    private static eni.a b() {
        return eni.b().b(4.0f).d(2.0f).b(160);
    }

    private static eni.a c() {
        return eni.b().b(3.0f).d(0.5f).b(20);
    }

    static final class a
    extends Record {
        final amt<eni> a;
        final amt<eni> b;

        private a(amt<eni> $$0, amt<eni> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public static a a(String $$0) {
            return new a(enj.a($$0 + "/normal"), enj.a($$0 + "/ominous"));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "normal;ominous", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "normal;ominous", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "normal;ominous", "a", "b"}, this, $$0);
        }

        public amt<eni> a() {
            return this.a;
        }

        public amt<eni> b() {
            return this.b;
        }
    }
}

