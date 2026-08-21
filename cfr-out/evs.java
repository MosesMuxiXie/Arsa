/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableDouble
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Map;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class evs {
    private static final evs a = new evs(new Long2ObjectOpenHashMap(), new Long2ObjectOpenHashMap()){

        @Override
        public a a(int $$0, int $$1) {
            return new a(1.0, 0.0);
        }

        @Override
        public double a(euj.b $$0, double $$1) {
            return $$1;
        }

        @Override
        public dxr a(dxr $$0) {
            return $$0;
        }
    };
    private static final fke b = fke.b(new evr(42L), qv.a);
    private static final int c = jo.d(7) - 1;
    private static final int d = jo.e(c + 3);
    private static final int e = 2;
    private static final int f = jo.e(5);
    private static final double g = 8.0;
    private final Long2ObjectOpenHashMap<evt> h;
    private final Long2ObjectOpenHashMap<evt> i;

    public static evs a() {
        return a;
    }

    public static evs a(@Nullable axn $$0) {
        if (w.aF || $$0 == null) {
            return a;
        }
        dvu $$1 = $$0.b();
        if (!$$0.a($$1, d)) {
            return a;
        }
        Long2ObjectOpenHashMap $$2 = new Long2ObjectOpenHashMap();
        Long2ObjectOpenHashMap $$3 = new Long2ObjectOpenHashMap();
        int $$4 = bgj.i(d + 1);
        for (int $$5 = -d; $$5 <= d; ++$$5) {
            for (int $$6 = -d; $$6 <= d; ++$$6) {
                int $$8;
                int $$7;
                evt $$9;
                if ($$5 * $$5 + $$6 * $$6 > $$4 || ($$9 = evt.a($$0, $$7 = $$1.h + $$5, $$8 = $$1.i + $$6)) == null) continue;
                $$2.put(dvu.d($$7, $$8), (Object)$$9);
                if ($$5 < -f || $$5 > f || $$6 < -f || $$6 > f) continue;
                $$3.put(dvu.d($$7, $$8), (Object)$$9);
            }
        }
        if ($$2.isEmpty() && $$3.isEmpty()) {
            return a;
        }
        return new evs((Long2ObjectOpenHashMap<evt>)$$2, (Long2ObjectOpenHashMap<evt>)$$3);
    }

    evs(Long2ObjectOpenHashMap<evt> $$0, Long2ObjectOpenHashMap<evt> $$1) {
        this.h = $$0;
        this.i = $$1;
    }

    public boolean b() {
        return this.h.isEmpty() && this.i.isEmpty();
    }

    public a a(int $$0, int $$1) {
        int $$3;
        int $$2 = jo.a($$0);
        double $$4 = this.a($$2, 0, $$3 = jo.a($$1), evt::a);
        if ($$4 != Double.MAX_VALUE) {
            return new a(0.0, evs.a($$4));
        }
        MutableDouble $$5 = new MutableDouble(0.0);
        MutableDouble $$6 = new MutableDouble(0.0);
        MutableDouble $$7 = new MutableDouble(Double.POSITIVE_INFINITY);
        this.h.forEach(($$52, $$62) -> $$62.a(jo.d(dvu.a($$52)), jo.d(dvu.b($$52)), ($$5, $$6, $$7) -> {
            double $$8 = bgj.g($$2 - $$5, $$3 - $$6);
            if ($$8 > (double)c) {
                return;
            }
            if ($$8 < $$7.doubleValue()) {
                $$7.setValue($$8);
            }
            double $$9 = 1.0 / ($$8 * $$8 * $$8 * $$8);
            $$6.add($$7 * $$9);
            $$5.add($$9);
        }));
        if ($$7.doubleValue() == Double.POSITIVE_INFINITY) {
            return new a(1.0, 0.0);
        }
        double $$8 = $$6.doubleValue() / $$5.doubleValue();
        double $$9 = bgj.a($$7.doubleValue() / (double)(c + 1), 0.0, 1.0);
        $$9 = 3.0 * $$9 * $$9 - 2.0 * $$9 * $$9 * $$9;
        return new a($$9, evs.a($$8));
    }

    private static double a(double $$0) {
        double $$1 = 1.0;
        double $$2 = $$0 + 0.5;
        double $$3 = bgj.c($$2, 8.0);
        return 1.0 * (32.0 * ($$2 - 128.0) - 3.0 * ($$2 - 120.0) * $$3 + 3.0 * $$3 * $$3) / (128.0 * (32.0 - 3.0 * $$3));
    }

    public double a(euj.b $$0, double $$1) {
        int $$4;
        int $$3;
        int $$2 = jo.a($$0.a());
        double $$5 = this.a($$2, $$3 = $$0.b() / 8, $$4 = jo.a($$0.c()), evt::b);
        if ($$5 != Double.MAX_VALUE) {
            return $$5;
        }
        MutableDouble $$6 = new MutableDouble(0.0);
        MutableDouble $$7 = new MutableDouble(0.0);
        MutableDouble $$8 = new MutableDouble(Double.POSITIVE_INFINITY);
        this.i.forEach(($$62, $$72) -> $$72.a(jo.d(dvu.a($$62)), jo.d(dvu.b($$62)), $$3 - 1, $$3 + 1, (int $$6, int $$7, int $$8, double $$9) -> {
            double $$10 = bgj.g((double)($$2 - $$6), (double)(($$3 - $$7) * 2), (double)($$4 - $$8));
            if ($$10 > 2.0) {
                return;
            }
            if ($$10 < $$8.doubleValue()) {
                $$8.setValue($$10);
            }
            double $$11 = 1.0 / ($$10 * $$10 * $$10 * $$10);
            $$7.add($$9 * $$11);
            $$6.add($$11);
        }));
        if ($$8.doubleValue() == Double.POSITIVE_INFINITY) {
            return $$1;
        }
        double $$9 = $$7.doubleValue() / $$6.doubleValue();
        double $$10 = bgj.a($$8.doubleValue() / 3.0, 0.0, 1.0);
        return bgj.d($$10, $$9, $$1);
    }

    private double a(int $$0, int $$1, int $$2, b $$3) {
        int $$4 = jo.e($$0);
        int $$5 = jo.e($$2);
        boolean $$6 = ($$0 & 3) == 0;
        boolean $$7 = ($$2 & 3) == 0;
        double $$8 = this.a($$3, $$4, $$5, $$0, $$1, $$2);
        if ($$8 == Double.MAX_VALUE) {
            if ($$6 && $$7) {
                $$8 = this.a($$3, $$4 - 1, $$5 - 1, $$0, $$1, $$2);
            }
            if ($$8 == Double.MAX_VALUE) {
                if ($$6) {
                    $$8 = this.a($$3, $$4 - 1, $$5, $$0, $$1, $$2);
                }
                if ($$8 == Double.MAX_VALUE && $$7) {
                    $$8 = this.a($$3, $$4, $$5 - 1, $$0, $$1, $$2);
                }
            }
        }
        return $$8;
    }

    private double a(b $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        evt $$6 = (evt)this.h.get(dvu.d($$1, $$2));
        if ($$6 != null) {
            return $$0.get($$6, $$3 - jo.d($$1), $$4, $$5 - jo.d($$2));
        }
        return Double.MAX_VALUE;
    }

    public dxr a(dxr $$0) {
        return ($$1, $$2, $$3, $$4) -> {
            jd<dxo> $$5 = this.a($$1, $$2, $$3);
            if ($$5 == null) {
                return $$0.getNoiseBiome($$1, $$2, $$3, $$4);
            }
            return $$5;
        };
    }

    /*
     * Issues handling annotations - annotations may be inaccurate
     */
    private @Nullable jd<dxo> a(int $$0, int $$1, int $$2) {
        MutableDouble $$3 = new MutableDouble(Double.POSITIVE_INFINITY);
        @Nullable MutableObject $$4 = new MutableObject();
        this.h.forEach(($$52, $$62) -> $$62.a(jo.d(dvu.a($$52)), $$1, jo.d(dvu.b($$52)), (int $$4, int $$5, jd<dxo> $$6) -> {
            double $$7 = bgj.g($$0 - $$4, $$2 - $$5);
            if ($$7 > (double)c) {
                return;
            }
            if ($$7 < $$3.doubleValue()) {
                $$4.setValue((Object)$$6);
                $$3.setValue($$7);
            }
        }));
        if ($$3.doubleValue() == Double.POSITIVE_INFINITY) {
            return null;
        }
        double $$5 = b.a($$0, 0.0, $$2) * 12.0;
        double $$6 = bgj.a(($$3.doubleValue() + $$5) / (double)(c + 1), 0.0, 1.0);
        if ($$6 > 0.5) {
            return null;
        }
        return (jd)$$4.get();
    }

    public static void a(axn $$0, eqf $$1) {
        if (w.aF) {
            return;
        }
        dvu $$2 = $$1.f();
        boolean $$3 = $$1.u();
        is.a $$4 = new is.a();
        is $$5 = new is($$2.e(), 0, $$2.f());
        evt $$6 = $$1.v();
        if ($$6 == null) {
            return;
        }
        int $$7 = $$6.b().K_();
        int $$8 = $$6.b().aw();
        if ($$3) {
            for (int $$9 = 0; $$9 < 16; ++$$9) {
                for (int $$10 = 0; $$10 < 16; ++$$10) {
                    evs.a($$1, $$4.a($$5, $$9, $$7 - 1, $$10));
                    evs.a($$1, $$4.a($$5, $$9, $$7, $$10));
                    evs.a($$1, $$4.a($$5, $$9, $$8, $$10));
                    evs.a($$1, $$4.a($$5, $$9, $$8 + 1, $$10));
                }
            }
        }
        for (iz $$11 : iz.c.a) {
            if ($$0.a($$2.h + $$11.j(), $$2.i + $$11.l()).u() == $$3) continue;
            int $$12 = $$11 == iz.f ? 15 : 0;
            int $$13 = $$11 == iz.e ? 0 : 15;
            int $$14 = $$11 == iz.d ? 15 : 0;
            int $$15 = $$11 == iz.c ? 0 : 15;
            for (int $$16 = $$12; $$16 <= $$13; ++$$16) {
                for (int $$17 = $$14; $$17 <= $$15; ++$$17) {
                    int $$18 = Math.min($$8, $$1.a(euq.a.e, $$16, $$17)) + 1;
                    for (int $$19 = $$7; $$19 < $$18; ++$$19) {
                        evs.a($$1, $$4.a($$5, $$16, $$19, $$17));
                    }
                }
            }
        }
    }

    private static void a(eqf $$0, is $$1) {
        flb $$3;
        eoh $$2 = $$0.a_($$1);
        if ($$2.a(bdp.M)) {
            $$0.e($$1);
        }
        if (!($$3 = $$0.b_($$1)).c()) {
            $$0.e($$1);
        }
    }

    public static void a(dxn $$0, erb $$12) {
        if (w.aF) {
            return;
        }
        dvu $$22 = $$12.f();
        ImmutableMap.Builder $$32 = ImmutableMap.builder();
        for (ja $$4 : ja.values()) {
            int $$6;
            int $$5 = $$22.h + $$4.b();
            evt $$7 = $$0.a($$5, $$6 = $$22.i + $$4.c()).v();
            if ($$7 == null) continue;
            $$32.put((Object)$$4, (Object)$$7);
        }
        ImmutableMap $$8 = $$32.build();
        if (!$$12.u() && $$8.isEmpty()) {
            return;
        }
        c $$9 = evs.a($$12.v(), (Map<ja, evt>)$$8);
        eqe.a $$10 = ($$1, $$2, $$3) -> {
            double $$6;
            double $$5;
            double $$4 = (double)$$1 + 0.5 + b.a($$1, $$2, $$3) * 4.0;
            return $$9.getDistance($$4, $$5 = (double)$$2 + 0.5 + b.a($$2, $$3, $$1) * 4.0, $$6 = (double)$$3 + 0.5 + b.a($$3, $$1, $$2) * 4.0) < 4.0;
        };
        $$12.G().a($$10);
    }

    public static c a(@Nullable evt $$0, Map<ja, evt> $$12) {
        ArrayList $$22 = Lists.newArrayList();
        if ($$0 != null) {
            $$22.add(evs.a(null, $$0));
        }
        $$12.forEach(($$1, $$2) -> $$22.add(evs.a($$1, $$2)));
        return ($$1, $$2, $$3) -> {
            double $$4 = Double.POSITIVE_INFINITY;
            for (c $$5 : $$22) {
                double $$6 = $$5.getDistance($$1, $$2, $$3);
                if (!($$6 < $$4)) continue;
                $$4 = $$6;
            }
            return $$4;
        };
    }

    private static c a(@Nullable ja $$0, evt $$1) {
        double $$2 = 0.0;
        double $$3 = 0.0;
        if ($$0 != null) {
            for (iz $$42 : $$0.a()) {
                $$2 += (double)($$42.j() * 16);
                $$3 += (double)($$42.l() * 16);
            }
        }
        double $$52 = $$2;
        double $$62 = $$3;
        double $$7 = (double)$$1.b().L_() / 2.0;
        double $$8 = (double)$$1.b().K_() + $$7;
        return ($$4, $$5, $$6) -> evs.a($$4 - 8.0 - $$52, $$5 - $$8, $$6 - 8.0 - $$62, 8.0, $$7, 8.0);
    }

    private static double a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        double $$6 = Math.abs($$0) - $$3;
        double $$7 = Math.abs($$1) - $$4;
        double $$8 = Math.abs($$2) - $$5;
        return bgj.g(Math.max(0.0, $$6), Math.max(0.0, $$7), Math.max(0.0, $$8));
    }

    static interface b {
        public double get(evt var1, int var2, int var3, int var4);
    }

    public record a(double a, double b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "alpha;blendingOffset", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "alpha;blendingOffset", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "alpha;blendingOffset", "a", "b"}, this, $$0);
        }
    }

    public static interface c {
        public double getDistance(double var1, double var3, double var5);
    }
}

