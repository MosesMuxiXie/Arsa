/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.joml.Vector2i
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.joml.Vector2i;
import org.jspecify.annotations.Nullable;

public abstract class gti<T extends dhi>
extends gsb
implements guq<T> {
    public static final amo a = amo.b("textures/gui/container/inventory.png");
    private static final amo D = amo.b("container/slot_highlight_back");
    private static final amo E = amo.b("container/slot_highlight_front");
    protected static final int b = 256;
    protected static final int c = 256;
    private static final float F = 100.0f;
    private static final int G = 500;
    protected int d = 176;
    protected int e = 166;
    protected int f;
    protected int t;
    protected int u;
    protected int v;
    private final List<gis> H;
    protected final T w;
    protected final yh x;
    protected @Nullable dji y;
    private @Nullable dji I;
    private @Nullable dji J;
    private @Nullable dji K;
    private @Nullable a L;
    protected int z;
    protected int A;
    private boolean M;
    private dlt N = dlt.l;
    private long O;
    protected final Set<dji> B = Sets.newHashSet();
    protected boolean C;
    private int P;
    @gzd.b
    private int Q;
    private boolean R;
    private int S;
    private boolean T;
    private dlt U = dlt.l;

    public gti(T $$0, ddl $$1, yh $$2) {
        super($$2);
        this.w = $$0;
        this.x = $$1.R_();
        this.R = true;
        this.f = 8;
        this.t = 6;
        this.u = 8;
        this.v = this.e - 94;
        this.H = new ArrayList<gis>();
    }

    @Override
    protected void bg_() {
        this.z = (this.o - this.d) / 2;
        this.A = (this.p - this.e) / 2;
        this.H.clear();
        this.a(new gim(this.n));
    }

    protected void a(gis $$0) {
        this.H.add($$0);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        this.d($$0, $$1, $$2, $$3);
        this.a($$0, $$1, $$2);
        this.d($$0);
    }

    public void d(gir $$0, int $$1, int $$2, float $$3) {
        int $$4 = this.z;
        int $$5 = this.A;
        super.a($$0, $$1, $$2, $$3);
        $$0.e().pushMatrix();
        $$0.e().translate((float)$$4, (float)$$5);
        this.d($$0, $$1, $$2);
        dji $$6 = this.y;
        this.y = this.b((double)$$1, (double)$$2);
        this.e($$0);
        this.b($$0, $$1, $$2);
        this.f($$0);
        if ($$6 != null && $$6 != this.y) {
            this.a($$6);
        }
        $$0.e().popMatrix();
    }

    public void a(gir $$0, int $$1, int $$2) {
        dlt $$3;
        dlt dlt2 = $$3 = this.N.f() ? ((dhi)this.w).g() : this.N;
        if (!$$3.f()) {
            int $$4 = 8;
            int $$5 = this.N.f() ? 8 : 16;
            String $$6 = null;
            if (!this.N.f() && this.M) {
                $$3 = $$3.c(bgj.d((float)$$3.N() / 2.0f));
            } else if (this.C && this.B.size() > 1 && ($$3 = $$3.c(this.S)).f()) {
                $$6 = String.valueOf(l.o) + "0";
            }
            $$0.c();
            this.a($$0, $$3, $$1 - 8, $$2 - $$5, $$6);
        }
    }

    public void d(gir $$0) {
        if (this.L != null) {
            float $$1 = bgj.a((float)(bhs.c() - this.L.d) / 100.0f, 0.0f, 1.0f);
            int $$2 = this.L.c.x - this.L.b.x;
            int $$3 = this.L.c.y - this.L.b.y;
            int $$4 = this.L.b.x + (int)((float)$$2 * $$1);
            int $$5 = this.L.b.y + (int)((float)$$3 * $$1);
            $$0.c();
            this.a($$0, this.L.a, $$4, $$5, null);
            if ($$1 >= 1.0f) {
                this.L = null;
            }
        }
    }

    protected void b(gir $$0, int $$1, int $$2) {
        for (dji $$3 : ((dhi)this.w).k) {
            if (!$$3.b()) continue;
            this.a($$0, $$3, $$1, $$2);
        }
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        super.b($$0, $$1, $$2, $$3);
        this.a($$0, $$3, $$1, $$2);
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (this.y != null && this.y.h()) {
            for (gis $$4 : this.H) {
                if (!$$4.a(this.y) || !$$4.a($$2, $$3, this.y.d, this.y.g())) continue;
                return true;
            }
        }
        return false;
    }

    private void e(gir $$0) {
        if (this.y != null && this.y.e()) {
            $$0.a(hpa.at, D, this.y.e - 4, this.y.f - 4, 24, 24);
        }
    }

    private void f(gir $$0) {
        if (this.y != null && this.y.e()) {
            $$0.a(hpa.at, E, this.y.e - 4, this.y.f - 4, 24, 24);
        }
    }

    protected void c(gir $$0, int $$1, int $$2) {
        if (this.y == null || !this.y.h()) {
            return;
        }
        dlt $$3 = this.y.g();
        if (((dhi)this.w).g().f() || this.b($$3)) {
            $$0.a(this.q, this.a($$3), $$3.b(), $$1, $$2, $$3.a(ki.K));
        }
    }

    private boolean b(dlt $$0) {
        return $$0.b().map(gvi::a).map(gvi::a).orElse(false);
    }

    protected List<yh> a(dlt $$0) {
        return gti.a(this.n, $$0);
    }

    private void a(gir $$0, dlt $$1, int $$2, int $$3, @Nullable String $$4) {
        $$0.a($$1, $$2, $$3);
        $$0.a(this.q, $$1, $$2, $$3 - (this.N.f() ? 0 : 8), $$4);
    }

    protected void d(gir $$0, int $$1, int $$2) {
        $$0.a(this.q, this.m, this.f, this.t, -12566464, false);
        $$0.a(this.q, this.x, this.u, this.v, -12566464, false);
    }

    protected abstract void a(gir var1, float var2, int var3, int var4);

    protected void a(gir $$0, dji $$1, int $$2, int $$3) {
        amo $$14;
        int $$4 = $$1.e;
        int $$5 = $$1.f;
        dlt $$6 = $$1.g();
        boolean $$7 = false;
        boolean $$8 = $$1 == this.I && !this.N.f() && !this.M;
        dlt $$9 = ((dhi)this.w).g();
        String $$10 = null;
        if ($$1 == this.I && !this.N.f() && this.M && !$$6.f()) {
            $$6 = $$6.c($$6.N() / 2);
        } else if (this.C && this.B.contains($$1) && !$$9.f()) {
            if (this.B.size() == 1) {
                return;
            }
            if (dhi.a($$1, $$9, true) && ((dhi)this.w).b($$1)) {
                $$7 = true;
                int $$11 = Math.min($$9.k(), $$1.b_($$9));
                int $$12 = $$1.g().f() ? 0 : $$1.g().N();
                int $$13 = dhi.a(this.B, this.P, $$9) + $$12;
                if ($$13 > $$11) {
                    $$13 = $$11;
                    $$10 = l.o.toString() + $$11;
                }
                $$6 = $$9.c($$13);
            } else {
                this.B.remove($$1);
                this.I();
            }
        }
        if ($$6.f() && $$1.b() && ($$14 = $$1.c()) != null) {
            $$0.a(hpa.at, $$14, $$4, $$5, 16, 16);
            $$8 = true;
        }
        if (!$$8) {
            if ($$7) {
                $$0.a($$4, $$5, $$4 + 16, $$5 + 16, -2130706433);
            }
            int $$15 = $$1.e + $$1.f * this.d;
            if ($$1.f()) {
                $$0.b($$6, $$4, $$5, $$15);
            } else {
                $$0.a($$6, $$4, $$5, $$15);
            }
            $$0.a(this.q, $$6, $$4, $$5, $$10);
        }
    }

    private void I() {
        dlt $$0 = ((dhi)this.w).g();
        if ($$0.f() || !this.C) {
            return;
        }
        if (this.P == 2) {
            this.S = $$0.k();
            return;
        }
        this.S = $$0.N();
        for (dji $$1 : this.B) {
            dlt $$2 = $$1.g();
            int $$3 = $$2.f() ? 0 : $$2.N();
            int $$4 = Math.min($$0.k(), $$1.b_($$0));
            int $$5 = Math.min(dhi.a(this.B, this.P, $$0) + $$3, $$4);
            this.S -= $$5 - $$3;
        }
    }

    private @Nullable dji b(double $$0, double $$1) {
        for (dji $$2 : ((dhi)this.w).k) {
            if (!$$2.b() || !this.a($$2, $$0, $$1)) continue;
            return $$2;
        }
        return null;
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if (super.a($$0, $$1)) {
            return true;
        }
        boolean $$2 = this.n.k.E.a($$0) && this.n.s.gv();
        dji $$3 = this.b($$0.u(), $$0.v());
        this.T = this.K == $$3 && $$1;
        this.R = false;
        if ($$0.t() == 0 || $$0.t() == 1 || $$2) {
            int $$4 = this.z;
            int $$5 = this.A;
            boolean $$6 = this.a($$0.u(), $$0.v(), $$4, $$5);
            int $$7 = -1;
            if ($$3 != null) {
                $$7 = $$3.d;
            }
            if ($$6) {
                $$7 = -999;
            }
            if (this.n.k.an().b().booleanValue() && $$6 && ((dhi)this.w).g().f()) {
                this.aX_();
                return true;
            }
            if ($$7 != -1) {
                if (this.n.k.an().b().booleanValue()) {
                    if ($$3 != null && $$3.h()) {
                        this.I = $$3;
                        this.N = dlt.l;
                        this.M = $$0.t() == 1;
                    } else {
                        this.I = null;
                    }
                } else if (!this.C) {
                    if (((dhi)this.w).g().f()) {
                        if ($$2) {
                            this.a($$3, $$7, $$0.t(), dhu.d);
                        } else {
                            boolean $$8 = $$7 != -999 && $$0.m();
                            dhu $$9 = dhu.a;
                            if ($$8) {
                                this.U = $$3 != null && $$3.h() ? $$3.g().v() : dlt.l;
                                $$9 = dhu.b;
                            } else if ($$7 == -999) {
                                $$9 = dhu.e;
                            }
                            this.a($$3, $$7, $$0.t(), $$9);
                        }
                        this.R = true;
                    } else {
                        this.C = true;
                        this.Q = $$0.t();
                        this.B.clear();
                        if ($$0.t() == 0) {
                            this.P = 0;
                        } else if ($$0.t() == 1) {
                            this.P = 1;
                        } else if ($$2) {
                            this.P = 2;
                        }
                    }
                }
            }
        } else {
            this.a($$0);
        }
        this.K = $$3;
        return true;
    }

    private void a(gzc $$0) {
        if (this.y != null && ((dhi)this.w).g().f()) {
            if (this.n.k.A.a($$0)) {
                this.a(this.y, this.y.d, 40, dhu.c);
                return;
            }
            for (int $$1 = 0; $$1 < 9; ++$$1) {
                if (!this.n.k.R[$$1].a($$0)) continue;
                this.a(this.y, this.y.d, $$1, dhu.c);
            }
        }
    }

    protected boolean a(double $$0, double $$1, int $$2, int $$3) {
        return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.d) || $$1 >= (double)($$3 + this.e);
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        dji $$3 = this.b($$0.u(), $$0.v());
        dlt $$4 = ((dhi)this.w).g();
        if (this.I != null && this.n.k.an().b().booleanValue()) {
            if ($$0.t() == 0 || $$0.t() == 1) {
                if (this.N.f()) {
                    if ($$3 != this.I && !this.I.g().f()) {
                        this.N = this.I.g().v();
                    }
                } else if (this.N.N() > 1 && $$3 != null && dhi.a($$3, this.N, false)) {
                    long $$5 = bhs.c();
                    if (this.J == $$3) {
                        if ($$5 - this.O > 500L) {
                            this.a(this.I, this.I.d, 0, dhu.a);
                            this.a($$3, $$3.d, 1, dhu.a);
                            this.a(this.I, this.I.d, 0, dhu.a);
                            this.O = $$5 + 750L;
                            this.N.h(1);
                        }
                    } else {
                        this.J = $$3;
                        this.O = $$5;
                    }
                }
            }
            return true;
        }
        if (this.C && $$3 != null && !$$4.f() && ($$4.N() > this.B.size() || this.P == 2) && dhi.a($$3, $$4, true) && $$3.a($$4) && ((dhi)this.w).b($$3)) {
            this.B.add($$3);
            this.I();
            return true;
        }
        if ($$3 == null && ((dhi)this.w).g().f()) {
            return super.a($$0, $$1, $$2);
        }
        return true;
    }

    @Override
    public boolean b(gzc $$0) {
        dji $$1 = this.b($$0.u(), $$0.v());
        int $$2 = this.z;
        int $$3 = this.A;
        boolean $$4 = this.a($$0.u(), $$0.v(), $$2, $$3);
        int $$5 = -1;
        if ($$1 != null) {
            $$5 = $$1.d;
        }
        if ($$4) {
            $$5 = -999;
        }
        if (this.T && $$1 != null && $$0.t() == 0 && ((dhi)this.w).a(dlt.l, $$1)) {
            if ($$0.m()) {
                if (!this.U.f()) {
                    for (dji $$6 : ((dhi)this.w).k) {
                        if ($$6 == null || !$$6.a(this.n.s) || !$$6.h() || $$6.c != $$1.c || !dhi.a($$6, this.U, true)) continue;
                        this.a($$6, $$6.d, $$0.t(), dhu.b);
                    }
                }
            } else {
                this.a($$1, $$5, $$0.t(), dhu.g);
            }
            this.T = false;
        } else {
            if (this.C && this.Q != $$0.t()) {
                this.C = false;
                this.B.clear();
                this.R = true;
                return true;
            }
            if (this.R) {
                this.R = false;
                return true;
            }
            if (this.I != null && this.n.k.an().b().booleanValue()) {
                if ($$0.t() == 0 || $$0.t() == 1) {
                    if (this.N.f() && $$1 != this.I) {
                        this.N = this.I.g();
                    }
                    boolean $$7 = dhi.a($$1, this.N, false);
                    if ($$5 != -1 && !this.N.f() && $$7) {
                        this.a(this.I, this.I.d, $$0.t(), dhu.a);
                        this.a($$1, $$5, 0, dhu.a);
                        if (((dhi)this.w).g().f()) {
                            this.L = null;
                        } else {
                            this.a(this.I, this.I.d, $$0.t(), dhu.a);
                            this.L = new a(this.N, new Vector2i((int)$$0.u(), (int)$$0.v()), new Vector2i(this.I.e + $$2, this.I.f + $$3), bhs.c());
                        }
                    } else if (!this.N.f()) {
                        this.L = new a(this.N, new Vector2i((int)$$0.u(), (int)$$0.v()), new Vector2i(this.I.e + $$2, this.I.f + $$3), bhs.c());
                    }
                    this.o();
                }
            } else if (this.C && !this.B.isEmpty()) {
                this.a(null, -999, dhi.c(0, this.P), dhu.f);
                for (dji $$8 : this.B) {
                    this.a($$8, $$8.d, dhi.c(1, this.P), dhu.f);
                }
                this.a(null, -999, dhi.c(2, this.P), dhu.f);
            } else if (!((dhi)this.w).g().f()) {
                if (this.n.k.E.a($$0)) {
                    this.a($$1, $$5, $$0.t(), dhu.d);
                } else {
                    boolean $$9;
                    boolean bl2 = $$9 = $$5 != -999 && $$0.m();
                    if ($$9) {
                        this.U = $$1 != null && $$1.h() ? $$1.g().v() : dlt.l;
                    }
                    this.a($$1, $$5, $$0.t(), $$9 ? dhu.b : dhu.a);
                }
            }
        }
        this.C = false;
        return true;
    }

    public void o() {
        this.N = dlt.l;
        this.I = null;
    }

    private boolean a(dji $$0, double $$1, double $$2) {
        return this.a($$0.e, $$0.f, 16, 16, $$1, $$2);
    }

    protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
        int $$6 = this.z;
        int $$7 = this.A;
        return ($$4 -= (double)$$6) >= (double)($$0 - 1) && $$4 < (double)($$0 + $$2 + 1) && ($$5 -= (double)$$7) >= (double)($$1 - 1) && $$5 < (double)($$1 + $$3 + 1);
    }

    private void a(dji $$0) {
        if ($$0.h()) {
            for (gis $$1 : this.H) {
                if (!$$1.a($$0)) continue;
                $$1.b($$0);
            }
        }
    }

    protected void a(dji $$0, int $$1, int $$2, dhu $$3) {
        if ($$0 != null) {
            $$1 = $$0.d;
        }
        this.a($$0, $$3);
        this.n.q.a(((dhi)this.w).l, $$1, $$2, $$3, this.n.s);
    }

    void a(@Nullable dji $$0, dhu $$1) {
        if ($$0 != null && $$0.h()) {
            for (gis $$2 : this.H) {
                if (!$$2.a($$0)) continue;
                $$2.a($$0, $$1);
            }
        }
    }

    protected void a(int $$0, int $$1, boolean $$2) {
        this.n.q.a($$0, $$1, $$2);
    }

    @Override
    public boolean a(gzb $$0) {
        if (super.a($$0)) {
            return true;
        }
        if (this.n.k.z.a($$0)) {
            this.aX_();
            return true;
        }
        this.c($$0);
        if (this.y != null && this.y.h()) {
            if (this.n.k.E.a($$0)) {
                this.a(this.y, this.y.d, 0, dhu.d);
            } else if (this.n.k.B.a($$0)) {
                this.a(this.y, this.y.d, $$0.n() ? 1 : 0, dhu.e);
            }
        }
        return false;
    }

    protected boolean c(gzb $$0) {
        if (((dhi)this.w).g().f() && this.y != null) {
            if (this.n.k.A.a($$0)) {
                this.a(this.y, this.y.d, 40, dhu.c);
                return true;
            }
            for (int $$1 = 0; $$1 < 9; ++$$1) {
                if (!this.n.k.R[$$1].a($$0)) continue;
                this.a(this.y, this.y.d, $$1, dhu.c);
                return true;
            }
        }
        return false;
    }

    @Override
    public void aZ_() {
        if (this.n.s == null) {
            return;
        }
        ((dhi)this.w).a(this.n.s);
    }

    @Override
    public boolean ba_() {
        return false;
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public final void e() {
        super.e();
        if (!this.n.s.cb() || this.n.s.eh()) {
            this.n.s.r();
        } else {
            this.p();
        }
    }

    protected void p() {
    }

    @Override
    public T F() {
        return this.w;
    }

    @Override
    public void aX_() {
        this.n.s.r();
        if (this.y != null) {
            this.a(this.y);
        }
        super.aX_();
    }

    static final class a
    extends Record {
        final dlt a;
        final Vector2i b;
        final Vector2i c;
        final long d;

        a(dlt $$0, Vector2i $$1, Vector2i $$2, long $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "item;start;end;time", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "item;start;end;time", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "item;start;end;time", "a", "b", "c", "d"}, this, $$0);
        }

        public dlt a() {
            return this.a;
        }

        public Vector2i b() {
            return this.b;
        }

        public Vector2i c() {
            return this.c;
        }

        public long d() {
            return this.d;
        }
    }
}

