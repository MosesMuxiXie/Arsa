/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Doubles
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.doubles.DoubleArrays
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.primitives.Doubles;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class evt {
    private static final double e = 0.1;
    protected static final int a = 4;
    protected static final int b = 8;
    protected static final int c = 2;
    private static final double f = 1.0;
    private static final double g = -1.0;
    private static final int h = 2;
    private static final int i = jo.a(16);
    private static final int j = i - 1;
    private static final int k = i;
    private static final int l = 2 * j + 1;
    private static final int m = 2 * k + 1;
    static final int n = l + m;
    private final dwq o;
    private static final List<dzq> p = List.of(dzs.l, dzs.O, dzs.i, dzs.b, dzs.k, dzs.L, dzs.N, dzs.fU, dzs.er, dzs.js, dzs.j);
    protected static final double d = Double.MAX_VALUE;
    private boolean q;
    private final double[] r;
    private final List<@Nullable List<@Nullable jd<dxo>>> s;
    private final transient double[][] t;

    private evt(int $$0, int $$1, Optional<double[]> $$2) {
        this.r = $$2.orElseGet(() -> bhs.a(new double[n], (? super T $$0) -> Arrays.fill($$0, Double.MAX_VALUE)));
        this.t = new double[n][];
        ObjectArrayList $$3 = new ObjectArrayList(n);
        $$3.size(n);
        this.s = $$3;
        int $$4 = jw.c($$0);
        int $$5 = jw.c($$1) - $$4;
        this.o = dwq.e($$4, $$5);
    }

    public static @Nullable evt a(@Nullable d $$0) {
        if ($$0 == null) {
            return null;
        }
        return new evt($$0.a(), $$0.b(), $$0.c());
    }

    public d a() {
        boolean $$0 = false;
        for (double $$1 : this.r) {
            if ($$1 == Double.MAX_VALUE) continue;
            $$0 = true;
            break;
        }
        return new d(this.o.ay(), this.o.az() + 1, $$0 ? Optional.of(DoubleArrays.copy((double[])this.r)) : Optional.empty());
    }

    public static @Nullable evt a(axn $$0, int $$1, int $$2) {
        eqf $$3 = $$0.a($$1, $$2);
        evt $$4 = $$3.v();
        if ($$4 == null || $$3.o().d(erj.f)) {
            return null;
        }
        $$4.a($$3, evt.a($$0, $$1, $$2, false));
        return $$4;
    }

    public static Set<ja> a(dxn $$0, int $$1, int $$2, boolean $$3) {
        EnumSet<ja> $$4 = EnumSet.noneOf(ja.class);
        for (ja $$5 : ja.values()) {
            int $$7;
            int $$6 = $$1 + $$5.b();
            if ($$0.a($$6, $$7 = $$2 + $$5.c()).u() != $$3) continue;
            $$4.add($$5);
        }
        return $$4;
    }

    private void a(eqf $$0, Set<ja> $$1) {
        if (this.q) {
            return;
        }
        if ($$1.contains((Object)ja.a) || $$1.contains((Object)ja.g) || $$1.contains((Object)ja.h)) {
            this.a(evt.a(0, 0), $$0, 0, 0);
        }
        if ($$1.contains((Object)ja.a)) {
            for (int $$2 = 1; $$2 < i; ++$$2) {
                this.a(evt.a($$2, 0), $$0, 4 * $$2, 0);
            }
        }
        if ($$1.contains((Object)ja.g)) {
            for (int $$3 = 1; $$3 < i; ++$$3) {
                this.a(evt.a(0, $$3), $$0, 0, 4 * $$3);
            }
        }
        if ($$1.contains((Object)ja.c)) {
            for (int $$4 = 1; $$4 < i; ++$$4) {
                this.a(evt.b(k, $$4), $$0, 15, 4 * $$4);
            }
        }
        if ($$1.contains((Object)ja.e)) {
            for (int $$5 = 0; $$5 < i; ++$$5) {
                this.a(evt.b($$5, k), $$0, 4 * $$5, 15);
            }
        }
        if ($$1.contains((Object)ja.c) && $$1.contains((Object)ja.b)) {
            this.a(evt.b(k, 0), $$0, 15, 0);
        }
        if ($$1.contains((Object)ja.c) && $$1.contains((Object)ja.e) && $$1.contains((Object)ja.d)) {
            this.a(evt.b(k, k), $$0, 15, 15);
        }
        this.q = true;
    }

    private void a(int $$0, eqf $$1, int $$2, int $$3) {
        if (this.r[$$0] == Double.MAX_VALUE) {
            this.r[$$0] = this.a($$1, $$2, $$3);
        }
        this.t[$$0] = this.a($$1, $$2, $$3, bgj.c(this.r[$$0]));
        this.s.set($$0, this.b($$1, $$2, $$3));
    }

    private int a(eqf $$0, int $$1, int $$2) {
        int $$4;
        if ($$0.b(euq.a.a)) {
            int $$3 = Math.min($$0.a(euq.a.a, $$1, $$2), this.o.aw());
        } else {
            $$4 = this.o.aw();
        }
        int $$5 = this.o.K_();
        is.a $$6 = new is.a($$1, $$4, $$2);
        while ($$6.v() > $$5) {
            if (p.contains($$0.a_($$6).b())) {
                return $$6.v();
            }
            $$6.c(iz.a);
        }
        return $$5;
    }

    private static double a(eqf $$0, is.a $$1) {
        return evt.a($$0, (is)$$1.c(iz.a)) ? 1.0 : -1.0;
    }

    private static double b(eqf $$0, is.a $$1) {
        double $$2 = 0.0;
        for (int $$3 = 0; $$3 < 7; ++$$3) {
            $$2 += evt.a($$0, $$1);
        }
        return $$2;
    }

    private double[] a(eqf $$0, int $$1, int $$2, int $$3) {
        double[] $$4 = new double[this.c()];
        Arrays.fill($$4, -1.0);
        is.a $$5 = new is.a($$1, this.o.aw() + 1, $$2);
        double $$6 = evt.b($$0, $$5);
        for (int $$7 = $$4.length - 2; $$7 >= 0; --$$7) {
            double $$8 = evt.a($$0, $$5);
            double $$9 = evt.b($$0, $$5);
            $$4[$$7] = ($$6 + $$8 + $$9) / 15.0;
            $$6 = $$9;
        }
        int $$10 = this.a(bgj.b($$3, 8));
        if ($$10 >= 0 && $$10 < $$4.length - 1) {
            double $$11 = ((double)$$3 + 0.5) % 8.0 / 8.0;
            double $$12 = (1.0 - $$11) / $$11;
            double $$13 = Math.max($$12, 1.0) * 0.25;
            $$4[$$10 + 1] = -$$12 / $$13;
            $$4[$$10] = 1.0 / $$13;
        }
        return $$4;
    }

    private List<jd<dxo>> b(eqf $$0, int $$1, int $$2) {
        ObjectArrayList $$3 = new ObjectArrayList(this.d());
        $$3.size(this.d());
        for (int $$4 = 0; $$4 < $$3.size(); ++$$4) {
            int $$5 = $$4 + jo.a(this.o.K_());
            $$3.set($$4, $$0.getNoiseBiome(jo.a($$1), $$5, jo.a($$2)));
        }
        return $$3;
    }

    private static boolean a(eqf $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        if ($$2.l()) {
            return false;
        }
        if ($$2.a(bdp.M)) {
            return false;
        }
        if ($$2.a(bdp.E)) {
            return false;
        }
        if ($$2.a(dzs.fz) || $$2.a(dzs.fA)) {
            return false;
        }
        return !$$2.g($$0, $$1).c();
    }

    protected double a(int $$0, int $$1, int $$2) {
        if ($$0 == k || $$2 == k) {
            return this.r[evt.b($$0, $$2)];
        }
        if ($$0 == 0 || $$2 == 0) {
            return this.r[evt.a($$0, $$2)];
        }
        return Double.MAX_VALUE;
    }

    private double a(double @Nullable [] $$0, int $$1) {
        if ($$0 == null) {
            return Double.MAX_VALUE;
        }
        int $$2 = this.a($$1);
        if ($$2 < 0 || $$2 >= $$0.length) {
            return Double.MAX_VALUE;
        }
        return $$0[$$2] * 0.1;
    }

    protected double b(int $$0, int $$1, int $$2) {
        if ($$1 == this.f()) {
            return 0.1;
        }
        if ($$0 == k || $$2 == k) {
            return this.a(this.t[evt.b($$0, $$2)], $$1);
        }
        if ($$0 == 0 || $$2 == 0) {
            return this.a(this.t[evt.a($$0, $$2)], $$1);
        }
        return Double.MAX_VALUE;
    }

    protected void a(int $$0, int $$1, int $$2, a $$3) {
        if ($$1 < jo.a(this.o.K_()) || $$1 > jo.a(this.o.aw())) {
            return;
        }
        int $$4 = $$1 - jo.a(this.o.K_());
        for (int $$5 = 0; $$5 < this.s.size(); ++$$5) {
            jd<dxo> $$7;
            List<@Nullable jd<dxo>> $$6 = this.s.get($$5);
            if ($$6 == null || ($$7 = $$6.get($$4)) == null) continue;
            $$3.consume($$0 + evt.b($$5), $$2 + evt.c($$5), $$7);
        }
    }

    protected void a(int $$0, int $$1, c $$2) {
        for (int $$3 = 0; $$3 < this.r.length; ++$$3) {
            double $$4 = this.r[$$3];
            if ($$4 == Double.MAX_VALUE) continue;
            $$2.consume($$0 + evt.b($$3), $$1 + evt.c($$3), $$4);
        }
    }

    protected void a(int $$0, int $$1, int $$2, int $$3, b $$4) {
        int $$5 = this.e();
        int $$6 = Math.max(0, $$2 - $$5);
        int $$7 = Math.min(this.c(), $$3 - $$5);
        for (int $$8 = 0; $$8 < this.t.length; ++$$8) {
            double[] $$9 = this.t[$$8];
            if ($$9 == null) continue;
            int $$10 = $$0 + evt.b($$8);
            int $$11 = $$1 + evt.c($$8);
            for (int $$12 = $$6; $$12 < $$7; ++$$12) {
                $$4.consume($$10, $$12 + $$5, $$11, $$9[$$12] * 0.1);
            }
        }
    }

    private int c() {
        return this.o.ax() * 2;
    }

    private int d() {
        return jo.d(this.o.ax());
    }

    private int e() {
        return this.f() + 1;
    }

    private int f() {
        return this.o.ay() * 2;
    }

    private int a(int $$0) {
        return $$0 - this.e();
    }

    private static int a(int $$0, int $$1) {
        return j - $$0 + $$1;
    }

    private static int b(int $$0, int $$1) {
        return l + $$0 + k - $$1;
    }

    private static int b(int $$0) {
        if ($$0 < l) {
            return evt.d(j - $$0);
        }
        int $$1 = $$0 - l;
        return k - evt.d(k - $$1);
    }

    private static int c(int $$0) {
        if ($$0 < l) {
            return evt.d($$0 - j);
        }
        int $$1 = $$0 - l;
        return k - evt.d($$1 - k);
    }

    private static int d(int $$0) {
        return $$0 & ~($$0 >> 31);
    }

    public dwq b() {
        return this.o;
    }

    public static final class d
    extends Record {
        private final int b;
        private final int c;
        private final Optional<double[]> d;
        private static final Codec<double[]> e = Codec.DOUBLE.listOf().xmap(Doubles::toArray, Doubles::asList);
        public static final Codec<d> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.INT.fieldOf("min_section").forGetter(d::a), (App)Codec.INT.fieldOf("max_section").forGetter(d::b), (App)e.lenientOptionalFieldOf("heights").forGetter(d::c)).apply((Applicative)$$0, d::new)).validate(d::a);

        public d(int $$0, int $$1, Optional<double[]> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        private static DataResult<d> a(d $$0) {
            if ($$0.d.isPresent() && $$0.d.get().length != n) {
                return DataResult.error(() -> "heights has to be of length " + n);
            }
            return DataResult.success((Object)$$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "minSection;maxSection;heights", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "minSection;maxSection;heights", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "minSection;maxSection;heights", "b", "c", "d"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }

        public Optional<double[]> c() {
            return this.d;
        }
    }

    protected static interface a {
        public void consume(int var1, int var2, jd<dxo> var3);
    }

    protected static interface c {
        public void consume(int var1, int var2, double var3);
    }

    protected static interface b {
        public void consume(int var1, int var2, int var3, double var4);
    }
}

