/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class dwz {
    private static final Logger d = LogUtils.getLogger();
    private static final int e = 24;
    public static final int a = 8;
    public static final int b = 128;
    public static final int c = bgj.b(8.0f / bgj.g);
    static final int f = (int)Math.pow(17.0, 2.0);
    private static final cho[] g = (cho[])Stream.of(cho.values()).filter($$0 -> $$0 != cho.h).toArray(cho[]::new);

    private dwz() {
    }

    public static d a(int $$0, Iterable<cgk> $$1, b $$2, dwx $$3) {
        dxc $$4 = new dxc();
        Object2IntOpenHashMap $$5 = new Object2IntOpenHashMap();
        for (cgk $$62 : $$1) {
            cho $$8;
            chn $$7;
            if ($$62 instanceof chn && (($$7 = (chn)$$62).gA() || $$7.ab()) || ($$8 = $$62.ay().f()) == cho.h) continue;
            is $$9 = $$62.dK();
            $$2.query(dvu.a($$9), $$6 -> {
                dya.b $$7 = dwz.a($$9, (eqf)$$6).a().a($$62.ay());
                if ($$7 != null) {
                    $$4.a($$62.dK(), $$7.b());
                }
                if ($$62 instanceof chn) {
                    $$3.a($$6.f(), $$8);
                }
                $$5.addTo((Object)$$8, 1);
            });
        }
        return new d($$0, (Object2IntOpenHashMap<cho>)$$5, $$4, $$3);
    }

    static dxo a(is $$0, eqf $$1) {
        return $$1.getNoiseBiome(jo.a($$0.u()), jo.a($$0.v()), jo.a($$0.w())).a();
    }

    public static List<cho> a(d $$0, boolean $$1, boolean $$2, boolean $$3) {
        ArrayList<cho> $$4 = new ArrayList<cho>(g.length);
        for (cho $$5 : g) {
            if (!$$1 && $$5.d() || !$$2 && !$$5.d() || !$$3 && $$5.e() || !$$0.a($$5)) continue;
            $$4.add($$5);
        }
        return $$4;
    }

    public static void a(axf $$0, eqq $$1, d $$2, List<cho> $$3) {
        bzm $$4 = bzl.a();
        $$4.a("spawner");
        for (cho $$5 : $$3) {
            if (!$$2.a($$5, $$1.f())) continue;
            dwz.a($$5, $$0, $$1, $$2::a, $$2::a);
        }
        $$4.c();
    }

    public static void a(cho $$0, axf $$1, eqq $$2, c $$3, a $$4) {
        is $$5 = dwz.a((dwo)$$1, $$2);
        if ($$5.v() < $$1.K_() + 1) {
            return;
        }
        dwz.a($$0, $$1, $$2, $$5, $$3, $$4);
    }

    @bht
    public static void a(cho $$02, axf $$12, is $$22) {
        dwz.a($$02, $$12, $$12.E($$22), $$22, (cgu<?> $$0, is $$1, eqf $$2) -> true, (chn $$0, eqf $$1) -> {});
    }

    public static void a(cho $$0, axf $$1, eqf $$2, is $$3, c $$4, a $$5) {
        dxk $$6 = $$1.b();
        eqg $$7 = $$1.p().g();
        int $$8 = $$3.v();
        eoh $$9 = $$2.a_($$3);
        if ($$9.d($$2, $$3)) {
            return;
        }
        is.a $$10 = new is.a();
        int $$11 = 0;
        block0: for (int $$12 = 0; $$12 < 3; ++$$12) {
            int $$13 = $$3.u();
            int $$14 = $$3.w();
            int $$15 = 6;
            dya.c $$16 = null;
            cie $$17 = null;
            int $$18 = bgj.d($$1.y.i() * 4.0f);
            int $$19 = 0;
            for (int $$20 = 0; $$20 < $$18; ++$$20) {
                double $$24;
                $$10.d($$13 += $$1.y.a(6) - $$1.y.a(6), $$8, $$14 += $$1.y.a(6) - $$1.y.a(6));
                double $$21 = (double)$$13 + 0.5;
                double $$22 = (double)$$14 + 0.5;
                ddm $$23 = $$1.a($$21, (double)$$8, $$22, -1.0, false);
                if ($$23 == null || !dwz.a($$1, $$2, $$10, $$24 = $$23.h($$21, $$8, $$22))) continue;
                if ($$16 == null) {
                    Optional<dya.c> $$25 = dwz.a($$1, $$6, $$7, $$0, $$1.y, (is)$$10);
                    if ($$25.isEmpty()) continue block0;
                    $$16 = $$25.get();
                    $$18 = $$16.b() + $$1.y.a(1 + $$16.c() - $$16.b());
                }
                if (!dwz.a($$1, $$0, $$6, $$7, $$16, $$10, $$24) || !$$4.test($$16.a(), $$10, $$2)) continue;
                chn $$26 = dwz.a($$1, $$16.a());
                if ($$26 == null) {
                    return;
                }
                $$26.b($$21, $$8, $$22, $$1.y.i() * 360.0f, 0.0f);
                if (!dwz.a($$1, $$26, $$24)) continue;
                $$17 = $$26.a((dxf)$$1, $$1.c($$26.dK()), cgt.a, $$17);
                ++$$19;
                $$1.a_($$26);
                $$5.run($$26, $$2);
                if (++$$11 >= $$26.aj()) {
                    return;
                }
                if ($$26.q($$19)) continue block0;
            }
        }
    }

    private static boolean a(axf $$0, eqf $$1, is.a $$2, double $$3) {
        if ($$3 <= 576.0) {
            return false;
        }
        fne.a $$4 = $$0.C();
        if ($$4.a() == $$0.aq() && $$4.b().a(new ftm((double)$$2.u() + 0.5, $$2.v(), (double)$$2.w() + 0.5), 24.0)) {
            return false;
        }
        dvu $$5 = new dvu($$2);
        return Objects.equals($$5, $$1.f()) || $$0.c($$5);
    }

    private static boolean a(axf $$0, cho $$1, dxk $$2, eqg $$3, dya.c $$4, is.a $$5, double $$6) {
        cgu<?> $$7 = $$4.a();
        if ($$7.f() == cho.h) {
            return false;
        }
        if (!$$7.e() && $$6 > (double)($$7.f().f() * $$7.f().f())) {
            return false;
        }
        if (!$$7.c() || !dwz.a($$0, $$2, $$3, $$1, $$4, (is)$$5)) {
            return false;
        }
        if (!cih.a($$7, $$0, $$5)) {
            return false;
        }
        if (!cih.a($$7, $$0, cgt.a, $$5, $$0.y)) {
            return false;
        }
        return $$0.b($$7.a((double)$$5.u() + 0.5, $$5.v(), (double)$$5.w() + 0.5));
    }

    private static @Nullable chn a(axf $$0, cgu<?> $$1) {
        try {
            Object obj = $$1.a($$0, cgt.a);
            if (obj instanceof chn) {
                chn $$2 = (chn)obj;
                return $$2;
            }
            d.warn("Can't spawn entity of type: {}", (Object)mi.g.b($$1));
        }
        catch (Exception $$3) {
            d.warn("Failed to create mob", (Throwable)$$3);
        }
        return null;
    }

    private static boolean a(axf $$0, chn $$1, double $$2) {
        if ($$2 > (double)($$1.ay().f().f() * $$1.ay().f().f()) && $$1.i($$2)) {
            return false;
        }
        return $$1.a((dwp)$$0, cgt.a) && $$1.a((dwr)$$0);
    }

    private static Optional<dya.c> a(axf $$0, dxk $$1, eqg $$2, cho $$3, bgr $$4, is $$5) {
        jd<dxo> $$6 = $$0.z($$5);
        if ($$3 == cho.g && $$6.a(bdo.aj) && $$4.i() < 0.98f) {
            return Optional.empty();
        }
        return dwz.a($$0, $$1, $$2, $$3, $$5, $$6).a($$4);
    }

    private static boolean a(axf $$0, dxk $$1, eqg $$2, cho $$3, dya.c $$4, is $$5) {
        return dwz.a($$0, $$1, $$2, $$3, $$5, null).b($$4);
    }

    private static cbn<dya.c> a(axf $$0, dxk $$1, eqg $$2, cho $$3, is $$4, @Nullable jd<dxo> $$5) {
        if (dwz.a($$4, $$0, $$3, $$1)) {
            return fhv.d;
        }
        return $$2.a($$5 != null ? $$5 : $$0.z($$4), $$1, $$3, $$4);
    }

    public static boolean a(is $$0, axf $$1, cho $$2, dxk $$3) {
        if ($$2 != cho.a || !$$1.a_($$0.e()).a(dzs.gc)) {
            return false;
        }
        ffo $$4 = $$3.b().f(mj.bs).c(ffi.o);
        if ($$4 == null) {
            return false;
        }
        return $$3.a($$0, $$4).b();
    }

    private static is a(dwo $$0, eqq $$1) {
        dvu $$2 = $$1.f();
        int $$3 = $$2.e() + $$0.y.a(16);
        int $$4 = $$2.f() + $$0.y.a(16);
        int $$5 = $$1.a(euq.a.b, $$3, $$4) + 1;
        int $$6 = bgj.b($$0.y, $$0.K_(), $$5);
        return new is($$3, $$6, $$4);
    }

    public static boolean a(dvt $$0, is $$1, eoh $$2, flb $$3, cgu<?> $$4) {
        if ($$2.m($$0, $$1)) {
            return false;
        }
        if ($$2.p()) {
            return false;
        }
        if (!$$3.c()) {
            return false;
        }
        if ($$2.a(bdp.bj)) {
            return false;
        }
        return !$$4.a($$2);
    }

    /*
     * WARNING - void declaration
     */
    public static void a(dxf $$0, jd<dxo> $$1, dvu $$2, bgr $$3) {
        dya $$4 = $$1.a().a();
        cbn<dya.c> $$5 = $$4.a(cho.b);
        if ($$5.c() || !$$0.a().U().a(eua.V).booleanValue()) {
            return;
        }
        int $$6 = $$2.e();
        int $$7 = $$2.f();
        while ($$3.i() < $$4.a()) {
            Optional<dya.c> $$8 = $$5.a($$3);
            if ($$8.isEmpty()) continue;
            dya.c $$9 = $$8.get();
            int $$10 = $$9.b() + $$3.a(1 + $$9.c() - $$9.b());
            cie $$11 = null;
            int $$12 = $$6 + $$3.a(16);
            int $$13 = $$7 + $$3.a(16);
            int $$14 = $$12;
            int $$15 = $$13;
            for (int $$16 = 0; $$16 < $$10; ++$$16) {
                boolean $$17 = false;
                for (int $$18 = 0; !$$17 && $$18 < 4; ++$$18) {
                    is $$19 = dwz.a((dwr)$$0, $$9.a(), $$12, $$13);
                    if ($$9.a().c() && cih.a($$9.a(), $$0, $$19)) {
                        chn $$26;
                        void $$25;
                        float $$20 = $$9.a().l();
                        double $$21 = bgj.a((double)$$12, (double)$$6 + (double)$$20, (double)$$6 + 16.0 - (double)$$20);
                        double $$22 = bgj.a((double)$$13, (double)$$7 + (double)$$20, (double)$$7 + 16.0 - (double)$$20);
                        if (!$$0.b($$9.a().a($$21, $$19.v(), $$22)) || !cih.a($$9.a(), $$0, cgt.b, is.a($$21, (double)$$19.v(), $$22), $$0.G_())) continue;
                        try {
                            Object $$23 = $$9.a().a($$0.a(), cgt.a);
                        }
                        catch (Exception $$24) {
                            d.warn("Failed to create mob", (Throwable)$$24);
                            continue;
                        }
                        if ($$25 == null) continue;
                        $$25.b($$21, $$19.v(), $$22, $$3.i() * 360.0f, 0.0f);
                        if ($$25 instanceof chn && ($$26 = (chn)$$25).a($$0, cgt.b) && $$26.a($$0)) {
                            $$11 = $$26.a($$0, $$0.c($$26.dK()), cgt.b, $$11);
                            $$0.a_($$26);
                            $$17 = true;
                        }
                    }
                    $$12 += $$3.a(5) - $$3.a(5);
                    $$13 += $$3.a(5) - $$3.a(5);
                    while ($$12 < $$6 || $$12 >= $$6 + 16 || $$13 < $$7 || $$13 >= $$7 + 16) {
                        $$12 = $$14 + $$3.a(5) - $$3.a(5);
                        $$13 = $$15 + $$3.a(5) - $$3.a(5);
                    }
                }
            }
        }
    }

    private static is a(dwr $$0, cgu<?> $$1, int $$2, int $$3) {
        int $$4 = $$0.a(cih.b($$1), $$2, $$3);
        is.a $$5 = new is.a($$2, $$4, $$3);
        if ($$0.F_().f()) {
            do {
                $$5.c(iz.a);
            } while (!$$0.a_($$5).l());
            do {
                $$5.c(iz.a);
            } while ($$0.a_($$5).l() && $$5.v() > $$0.K_());
        }
        return cih.a($$1).a($$0, $$5.j());
    }

    @FunctionalInterface
    public static interface b {
        public void query(long var1, Consumer<eqq> var3);
    }

    public static class d {
        private final int a;
        private final Object2IntOpenHashMap<cho> b;
        private final dxc c;
        private final Object2IntMap<cho> d;
        private final dwx e;
        private @Nullable is f;
        private @Nullable cgu<?> g;
        private double h;

        d(int $$0, Object2IntOpenHashMap<cho> $$1, dxc $$2, dwx $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.e = $$3;
            this.d = Object2IntMaps.unmodifiable($$1);
        }

        private boolean a(cgu<?> $$0, is $$1, eqf $$2) {
            double $$4;
            this.f = $$1;
            this.g = $$0;
            dya.b $$3 = dwz.a($$1, $$2).a().a($$0);
            if ($$3 == null) {
                this.h = 0.0;
                return true;
            }
            this.h = $$4 = $$3.b();
            double $$5 = this.c.b($$1, $$4);
            return $$5 <= $$3.a();
        }

        private void a(chn $$0, eqf $$1) {
            double $$7;
            cgu<?> $$2 = $$0.ay();
            is $$3 = $$0.dK();
            if ($$3.equals(this.f) && $$2 == this.g) {
                double $$4 = this.h;
            } else {
                dya.b $$5 = dwz.a($$3, $$1).a().a($$2);
                if ($$5 != null) {
                    double $$6 = $$5.b();
                } else {
                    $$7 = 0.0;
                }
            }
            this.c.a($$3, $$7);
            cho $$8 = $$2.f();
            this.b.addTo((Object)$$8, 1);
            this.e.a(new dvu($$3), $$8);
        }

        public int a() {
            return this.a;
        }

        public Object2IntMap<cho> b() {
            return this.d;
        }

        boolean a(cho $$0) {
            int $$1 = $$0.b() * this.a / f;
            return this.b.getInt((Object)$$0) < $$1;
        }

        boolean a(cho $$0, dvu $$1) {
            return this.e.a($$0, $$1) || w.ar;
        }
    }

    @FunctionalInterface
    public static interface c {
        public boolean test(cgu<?> var1, is var2, eqf var3);
    }

    @FunctionalInterface
    public static interface a {
        public void run(chn var1, eqf var2);
    }
}

