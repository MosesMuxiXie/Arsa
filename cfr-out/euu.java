/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.longs.Long2IntMap
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class euu
implements euj.a,
euj.b {
    final int a;
    final int b;
    final int c;
    private final int d;
    private final int e;
    final int f;
    final int g;
    final List<i> h;
    final List<e> i;
    private final Map<euj, euj> j = new HashMap<euj, euj>();
    private final Long2IntMap k = new Long2IntOpenHashMap();
    private final euc l;
    private final euj m;
    private final c n;
    private final evs o;
    private final g p;
    private final g q;
    private final euk.c r;
    private long s = dvu.c;
    private evs.a t = new evs.a(1.0, 0.0);
    final int u;
    final int v;
    final int w;
    boolean x;
    boolean y;
    private int z;
    int A;
    private int B;
    int C;
    int D;
    int E;
    long F;
    long G;
    int H;
    private final euj.a I = new euj.a(){

        @Override
        public euj.b a(int $$0) {
            euu.this.A = ($$0 + euu.this.c) * euu.this.w;
            ++euu.this.F;
            euu.this.D = 0;
            euu.this.H = $$0;
            return euu.this;
        }

        @Override
        public void a(double[] $$0, euj $$1) {
            for (int $$2 = 0; $$2 < euu.this.b + 1; ++$$2) {
                euu.this.A = ($$2 + euu.this.c) * euu.this.w;
                ++euu.this.F;
                euu.this.D = 0;
                euu.this.H = $$2;
                $$0[$$2] = $$1.a(euu.this);
            }
        }
    };

    public static euu a(eqf $$0, eve $$1, euk.c $$2, euv $$3, euc.a $$4, evs $$5) {
        euy $$6 = $$3.f().a($$0);
        dvu $$7 = $$0.f();
        int $$8 = 16 / $$6.b();
        return new euu($$8, $$1, $$7.e(), $$7.f(), $$6, $$2, $$3, $$4, $$5);
    }

    public euu(int $$0, eve $$12, int $$2, int $$3, euy $$4, euk.c $$5, euv $$6, euc.a $$7, evs $$8) {
        this.v = $$4.b();
        this.w = $$4.a();
        this.a = $$0;
        this.b = bgj.b($$4.d(), this.w);
        this.c = bgj.b($$4.c(), this.w);
        this.d = Math.floorDiv($$2, this.v);
        this.e = Math.floorDiv($$3, this.v);
        this.h = Lists.newArrayList();
        this.i = Lists.newArrayList();
        this.f = jo.a($$2);
        this.g = jo.a($$3);
        this.u = jo.a($$0 * this.v);
        this.o = $$8;
        this.r = $$5;
        this.p = new g(new a(), false);
        this.q = new g(new b(), false);
        if (!$$8.b()) {
            for (int $$9 = 0; $$9 <= this.u; ++$$9) {
                int $$10 = this.f + $$9;
                int $$11 = jo.c($$10);
                for (int $$122 = 0; $$122 <= this.u; ++$$122) {
                    int $$13 = this.g + $$122;
                    int $$14 = jo.c($$13);
                    evs.a $$15 = $$8.a($$11, $$14);
                    this.p.f[$$9 + $$122 * this.p.g] = $$15.a();
                    this.q.f[$$9 + $$122 * this.q.g] = $$15.b();
                }
            }
        } else {
            Arrays.fill(this.p.f, 1.0);
            Arrays.fill(this.q.f, 0.0);
        }
        euw $$16 = $$12.a();
        euw $$17 = $$16.a(this::a);
        this.m = $$17.k();
        if (!$$6.b()) {
            this.l = euc.a($$7);
        } else {
            int $$18 = jw.a($$2);
            int $$19 = jw.a($$3);
            this.l = euc.a(this, new dvu($$18, $$19), $$17, $$12.d(), $$4.c(), $$4.d(), $$7);
        }
        ArrayList<c> $$20 = new ArrayList<c>();
        euj $$21 = euk.e(euk.a($$17.l(), euk.b.a)).a(this::a);
        $$20.add($$1 -> this.l.a($$1, $$21.a($$1)));
        if ($$6.c()) {
            $$20.add(eva.a($$17.m(), $$17.n(), $$17.o(), $$12.e()));
        }
        this.n = new fec($$20.toArray(new c[0]));
    }

    protected dxx.f a(euw $$0, List<dxx.d> $$1) {
        return new dxx.f($$0.e().a(this::a), $$0.f().a(this::a), $$0.g().a(this::a), $$0.h().a(this::a), $$0.i().a(this::a), $$0.j().a(this::a), $$1);
    }

    protected @Nullable eoh e() {
        return this.n.calculate(this);
    }

    @Override
    public int a() {
        return this.z + this.C;
    }

    @Override
    public int b() {
        return this.A + this.D;
    }

    @Override
    public int c() {
        return this.B + this.E;
    }

    public int a(int $$0, int $$1, int $$2, int $$3) {
        int $$4 = Integer.MIN_VALUE;
        for (int $$5 = $$1; $$5 <= $$3; $$5 += 4) {
            for (int $$6 = $$0; $$6 <= $$2; $$6 += 4) {
                int $$7 = this.a($$6, $$5);
                if ($$7 <= $$4) continue;
                $$4 = $$7;
            }
        }
        return $$4;
    }

    public int a(int $$0, int $$1) {
        int $$2 = jo.c(jo.a($$0));
        int $$3 = jo.c(jo.a($$1));
        return this.k.computeIfAbsent(awq.a($$2, $$3), this::a);
    }

    private int a(long $$0) {
        int $$1 = awq.a($$0);
        int $$2 = awq.b($$0);
        return bgj.c(this.m.a(new euj.e($$1, 0, $$2)));
    }

    @Override
    public evs d() {
        return this.o;
    }

    private void a(boolean $$0, int $$1) {
        this.z = $$1 * this.v;
        this.C = 0;
        for (int $$2 = 0; $$2 < this.a + 1; ++$$2) {
            int $$3 = this.e + $$2;
            this.B = $$3 * this.v;
            this.E = 0;
            ++this.G;
            for (i $$4 : this.h) {
                double[] $$5 = ($$0 ? $$4.b : $$4.f)[$$2];
                $$4.a($$5, this.I);
            }
        }
        ++this.G;
    }

    public void f() {
        if (this.x) {
            throw new IllegalStateException("Staring interpolation twice");
        }
        this.x = true;
        this.F = 0L;
        this.a(true, this.d);
    }

    public void b(int $$0) {
        this.a(false, this.d + $$0 + 1);
        this.z = (this.d + $$0) * this.v;
    }

    public euu c(int $$0) {
        int $$1 = Math.floorMod($$0, this.v);
        int $$2 = Math.floorDiv($$0, this.v);
        int $$3 = Math.floorMod($$2, this.v);
        int $$4 = this.w - 1 - Math.floorDiv($$2, this.v);
        this.C = $$3;
        this.D = $$4;
        this.E = $$1;
        this.H = $$0;
        return this;
    }

    @Override
    public void a(double[] $$0, euj $$1) {
        this.H = 0;
        for (int $$2 = this.w - 1; $$2 >= 0; --$$2) {
            this.D = $$2;
            for (int $$3 = 0; $$3 < this.v; ++$$3) {
                this.C = $$3;
                int $$4 = 0;
                while ($$4 < this.v) {
                    this.E = $$4++;
                    $$0[this.H++] = $$1.a(this);
                }
            }
        }
    }

    public void b(int $$0, int $$1) {
        for (i $$2 : this.h) {
            $$2.b($$0, $$1);
        }
        this.y = true;
        this.A = ($$0 + this.c) * this.w;
        this.B = (this.e + $$1) * this.v;
        ++this.G;
        for (e $$3 : this.i) {
            $$3.b.a($$3.f, this);
        }
        ++this.G;
        this.y = false;
    }

    public void a(int $$0, double $$1) {
        this.D = $$0 - this.A;
        for (i $$2 : this.h) {
            $$2.a($$1);
        }
    }

    public void b(int $$0, double $$1) {
        this.C = $$0 - this.z;
        for (i $$2 : this.h) {
            $$2.b($$1);
        }
    }

    public void c(int $$0, double $$1) {
        this.E = $$0 - this.B;
        ++this.F;
        for (i $$2 : this.h) {
            $$2.c($$1);
        }
    }

    public void g() {
        if (!this.x) {
            throw new IllegalStateException("Staring interpolation twice");
        }
        this.x = false;
    }

    public void h() {
        this.h.forEach(i::m);
    }

    public euc i() {
        return this.l;
    }

    protected int j() {
        return this.v;
    }

    protected int k() {
        return this.w;
    }

    evs.a c(int $$0, int $$1) {
        evs.a $$3;
        long $$2 = dvu.d($$0, $$1);
        if (this.s == $$2) {
            return this.t;
        }
        this.s = $$2;
        this.t = $$3 = this.o.a($$0, $$1);
        return $$3;
    }

    protected euj a(euj $$0) {
        return this.j.computeIfAbsent($$0, this::b);
    }

    private euj b(euj $$0) {
        if ($$0 instanceof euk.m) {
            euk.m $$1 = (euk.m)$$0;
            return switch ($$1.k()) {
                default -> throw new MatchException(null, null);
                case euk.m.a.a -> new i($$1.l());
                case euk.m.a.b -> new g($$1.l(), true);
                case euk.m.a.c -> new d($$1.l());
                case euk.m.a.d -> new f($$1.l());
                case euk.m.a.e -> new e($$1.l());
            };
        }
        if (this.o != evs.a()) {
            if ($$0 == euk.d.a) {
                return this.p;
            }
            if ($$0 == euk.f.a) {
                return this.q;
            }
        }
        if ($$0 == euk.b.a) {
            return this.r;
        }
        if ($$0 instanceof euk.k) {
            euk.k $$2 = (euk.k)$$0;
            return $$2.k().a();
        }
        return $$0;
    }

    @Override
    public /* synthetic */ euj.b a(int n2) {
        return this.c(n2);
    }

    class g
    implements euk.n,
    h {
        private final euj b;
        final double[] f;
        final int g;

        g(euj $$0, boolean $$1) {
            this.b = $$0;
            this.g = euu.this.u + 1;
            this.f = new double[this.g * this.g];
            if ($$1) {
                for (int $$2 = 0; $$2 <= euu.this.u; ++$$2) {
                    int $$3 = euu.this.f + $$2;
                    int $$4 = jo.c($$3);
                    for (int $$5 = 0; $$5 <= euu.this.u; ++$$5) {
                        int $$6 = euu.this.g + $$5;
                        int $$7 = jo.c($$6);
                        this.f[$$2 + $$5 * this.g] = $$0.a(new euj.e($$4, 0, $$7));
                    }
                }
            }
        }

        @Override
        public double a(euj.b $$0) {
            int $$1 = jo.a($$0.a());
            int $$2 = jo.a($$0.c());
            int $$3 = $$1 - euu.this.f;
            int $$4 = $$2 - euu.this.g;
            if ($$3 >= 0 && $$4 >= 0 && $$3 < this.g && $$4 < this.g) {
                return this.f[$$3 + $$4 * this.g];
            }
            return this.b.a($$0);
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public euj l() {
            return this.b;
        }

        @Override
        public euk.m.a k() {
            return euk.m.a.b;
        }
    }

    class a
    implements h {
        a() {
        }

        @Override
        public euj l() {
            return euk.d.a;
        }

        @Override
        public euj a(euj.f $$0) {
            return this.l().a($$0);
        }

        @Override
        public double a(euj.b $$0) {
            return euu.this.c($$0.a(), $$0.c()).a();
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public double a() {
            return 0.0;
        }

        @Override
        public double b() {
            return 1.0;
        }

        @Override
        public bga<? extends euj> c() {
            return euk.d.b;
        }
    }

    class b
    implements h {
        b() {
        }

        @Override
        public euj l() {
            return euk.f.a;
        }

        @Override
        public euj a(euj.f $$0) {
            return this.l().a($$0);
        }

        @Override
        public double a(euj.b $$0) {
            return euu.this.c($$0.a(), $$0.c()).b();
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public double a() {
            return Double.NEGATIVE_INFINITY;
        }

        @Override
        public double b() {
            return Double.POSITIVE_INFINITY;
        }

        @Override
        public bga<? extends euj> c() {
            return euk.f.b;
        }
    }

    @FunctionalInterface
    public static interface c {
        public @Nullable eoh calculate(euj.b var1);
    }

    public class i
    implements euk.n,
    h {
        double[][] b;
        double[][] f;
        private final euj g;
        private double h;
        private double i;
        private double j;
        private double k;
        private double l;
        private double m;
        private double n;
        private double o;
        private double p;
        private double q;
        private double r;
        private double s;
        private double t;
        private double u;
        private double v;

        i(euj $$1) {
            this.g = $$1;
            this.b = this.a(euu.this.b, euu.this.a);
            this.f = this.a(euu.this.b, euu.this.a);
            euu.this.h.add(this);
        }

        private double[][] a(int $$0, int $$1) {
            int $$2 = $$1 + 1;
            int $$3 = $$0 + 1;
            double[][] $$4 = new double[$$2][$$3];
            for (int $$5 = 0; $$5 < $$2; ++$$5) {
                $$4[$$5] = new double[$$3];
            }
            return $$4;
        }

        void b(int $$0, int $$1) {
            this.h = this.b[$$1][$$0];
            this.i = this.b[$$1 + 1][$$0];
            this.j = this.f[$$1][$$0];
            this.k = this.f[$$1 + 1][$$0];
            this.l = this.b[$$1][$$0 + 1];
            this.m = this.b[$$1 + 1][$$0 + 1];
            this.n = this.f[$$1][$$0 + 1];
            this.o = this.f[$$1 + 1][$$0 + 1];
        }

        void a(double $$0) {
            this.p = bgj.d($$0, this.h, this.l);
            this.q = bgj.d($$0, this.j, this.n);
            this.r = bgj.d($$0, this.i, this.m);
            this.s = bgj.d($$0, this.k, this.o);
        }

        void b(double $$0) {
            this.t = bgj.d($$0, this.p, this.q);
            this.u = bgj.d($$0, this.r, this.s);
        }

        void c(double $$0) {
            this.v = bgj.d($$0, this.t, this.u);
        }

        @Override
        public double a(euj.b $$0) {
            if ($$0 != euu.this) {
                return this.g.a($$0);
            }
            if (!euu.this.x) {
                throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
            }
            if (euu.this.y) {
                return bgj.a((double)euu.this.C / (double)euu.this.v, (double)euu.this.D / (double)euu.this.w, (double)euu.this.E / (double)euu.this.v, this.h, this.j, this.l, this.n, this.i, this.k, this.m, this.o);
            }
            return this.v;
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            if (euu.this.y) {
                $$1.a($$0, this);
                return;
            }
            this.l().a($$0, $$1);
        }

        @Override
        public euj l() {
            return this.g;
        }

        private void m() {
            double[][] $$0 = this.b;
            this.b = this.f;
            this.f = $$0;
        }

        @Override
        public euk.m.a k() {
            return euk.m.a.a;
        }
    }

    class e
    implements euk.n,
    h {
        final euj b;
        final double[] f;

        e(euj $$0) {
            this.b = $$0;
            this.f = new double[euu.this.v * euu.this.v * euu.this.w];
            euu.this.i.add(this);
        }

        @Override
        public double a(euj.b $$0) {
            if ($$0 != euu.this) {
                return this.b.a($$0);
            }
            if (!euu.this.x) {
                throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
            }
            int $$1 = euu.this.C;
            int $$2 = euu.this.D;
            int $$3 = euu.this.E;
            if ($$1 >= 0 && $$2 >= 0 && $$3 >= 0 && $$1 < euu.this.v && $$2 < euu.this.w && $$3 < euu.this.v) {
                return this.f[((euu.this.w - 1 - $$2) * euu.this.v + $$1) * euu.this.v + $$3];
            }
            return this.b.a($$0);
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            $$1.a($$0, this);
        }

        @Override
        public euj l() {
            return this.b;
        }

        @Override
        public euk.m.a k() {
            return euk.m.a.e;
        }
    }

    static class d
    implements euk.n,
    h {
        private final euj a;
        private long b = dvu.c;
        private double f;

        d(euj $$0) {
            this.a = $$0;
        }

        @Override
        public double a(euj.b $$0) {
            double $$4;
            int $$2;
            int $$1 = $$0.a();
            long $$3 = dvu.d($$1, $$2 = $$0.c());
            if (this.b == $$3) {
                return this.f;
            }
            this.b = $$3;
            this.f = $$4 = this.a.a($$0);
            return $$4;
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            this.a.a($$0, $$1);
        }

        @Override
        public euj l() {
            return this.a;
        }

        @Override
        public euk.m.a k() {
            return euk.m.a.c;
        }
    }

    class f
    implements euk.n,
    h {
        private final euj b;
        private long f;
        private long g;
        private double h;
        private double @Nullable [] i;

        f(euj $$0) {
            this.b = $$0;
        }

        @Override
        public double a(euj.b $$0) {
            double $$1;
            if ($$0 != euu.this) {
                return this.b.a($$0);
            }
            if (this.i != null && this.g == euu.this.G) {
                return this.i[euu.this.H];
            }
            if (this.f == euu.this.F) {
                return this.h;
            }
            this.f = euu.this.F;
            this.h = $$1 = this.b.a($$0);
            return $$1;
        }

        @Override
        public void a(double[] $$0, euj.a $$1) {
            if (this.i != null && this.g == euu.this.G) {
                System.arraycopy(this.i, 0, $$0, 0, $$0.length);
                return;
            }
            this.l().a($$0, $$1);
            if (this.i != null && this.i.length == $$0.length) {
                System.arraycopy($$0, 0, this.i, 0, $$0.length);
            } else {
                this.i = (double[])$$0.clone();
            }
            this.g = euu.this.G;
        }

        @Override
        public euj l() {
            return this.b;
        }

        @Override
        public euk.m.a k() {
            return euk.m.a.d;
        }
    }

    static interface h
    extends euj {
        public euj l();

        @Override
        default public double a() {
            return this.l().a();
        }

        @Override
        default public double b() {
            return this.l().b();
        }
    }
}

