/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gsj {
    private static final amo a = amo.b("advancements/title_box");
    private static final int b = 26;
    private static final int c = 0;
    private static final int d = 200;
    private static final int e = 26;
    private static final int f = 8;
    private static final int g = 5;
    private static final int h = 26;
    private static final int i = 3;
    private static final int j = 5;
    private static final int k = 32;
    private static final int l = 9;
    private static final int m = 8;
    private static final int n = 163;
    private static final int o = 80;
    private static final int[] p = new int[]{0, 10, -10, 25, -25};
    private final gsh q;
    private final ad r;
    private final ao s;
    private final List<bfr> t;
    private final int u;
    private final List<bfr> v;
    private final gfj w;
    private @Nullable gsj x;
    private final List<gsj> y = Lists.newArrayList();
    private @Nullable ae z;
    private final int A;
    private final int B;

    public gsj(gsh $$0, gfj $$1, ad $$2, ao $$3) {
        this.q = $$0;
        this.r = $$2;
        this.s = $$3;
        this.w = $$1;
        this.t = $$1.g.c($$3.a(), 163);
        this.A = bgj.b($$3.f() * 28.0f);
        this.B = bgj.b($$3.g() * 27.0f);
        int $$4 = Math.max(this.t.stream().mapToInt($$1.g::a).max().orElse(0), 80);
        int $$5 = this.e();
        int $$6 = 29 + $$4 + $$5;
        this.v = uu.a().a(this.a(yk.a($$3.b(), zf.a.a($$3.e().a())), $$6));
        for (bfr $$7 : this.v) {
            $$6 = Math.max($$6, $$1.g.a($$7));
        }
        this.u = $$6 + 3 + 5;
    }

    private int e() {
        int $$0 = this.r.a().f().a();
        if ($$0 <= 1) {
            return 0;
        }
        int $$1 = 8;
        yw $$2 = yh.a("advancements.progress", $$0, $$0);
        return this.w.g.a($$2) + 8;
    }

    private static float a(gfu $$0, List<yn> $$1) {
        return (float)$$1.stream().mapToDouble($$0::a).max().orElse(0.0);
    }

    private List<yn> a(yh $$0, int $$1) {
        gfu $$2 = this.w.g.b();
        List<yn> $$3 = null;
        float $$4 = Float.MAX_VALUE;
        for (int $$5 : p) {
            List<yn> $$6 = $$2.b($$0, $$1 - $$5, zf.a);
            float $$7 = Math.abs(gsj.a($$2, $$6) - (float)$$1);
            if ($$7 <= 10.0f) {
                return $$6;
            }
            if (!($$7 < $$4)) continue;
            $$4 = $$7;
            $$3 = $$6;
        }
        return $$3;
    }

    private @Nullable gsj a(ad $$0) {
        while (($$0 = $$0.c()) != null && $$0.a().c().isEmpty()) {
        }
        if ($$0 == null || $$0.a().c().isEmpty()) {
            return null;
        }
        return this.q.a($$0.b());
    }

    public void a(gir $$0, int $$1, int $$2, boolean $$3) {
        if (this.x != null) {
            int $$9;
            int $$4 = $$1 + this.x.A + 13;
            int $$5 = $$1 + this.x.A + 26 + 4;
            int $$6 = $$2 + this.x.B + 13;
            int $$7 = $$1 + this.A + 13;
            int $$8 = $$2 + this.B + 13;
            int n2 = $$9 = $$3 ? -16777216 : -1;
            if ($$3) {
                $$0.a($$5, $$4, $$6 - 1, $$9);
                $$0.a($$5 + 1, $$4, $$6, $$9);
                $$0.a($$5, $$4, $$6 + 1, $$9);
                $$0.a($$7, $$5 - 1, $$8 - 1, $$9);
                $$0.a($$7, $$5 - 1, $$8, $$9);
                $$0.a($$7, $$5 - 1, $$8 + 1, $$9);
                $$0.b($$5 - 1, $$8, $$6, $$9);
                $$0.b($$5 + 1, $$8, $$6, $$9);
            } else {
                $$0.a($$5, $$4, $$6, $$9);
                $$0.a($$7, $$5, $$8, $$9);
                $$0.b($$5, $$8, $$6, $$9);
            }
        }
        for (gsj $$10 : this.y) {
            $$10.a($$0, $$1, $$2, $$3);
        }
    }

    public void a(gir $$0, int $$1, int $$2) {
        if (!this.s.j() || this.z != null && this.z.a()) {
            gsk $$5;
            float $$3;
            float f2 = $$3 = this.z == null ? 0.0f : this.z.c();
            if ($$3 >= 1.0f) {
                gsk $$4 = gsk.a;
            } else {
                $$5 = gsk.b;
            }
            $$0.a(hpa.at, $$5.a(this.s.e()), $$1 + this.A + 3, $$2 + this.B, 26, 26);
            $$0.b(this.s.c(), $$1 + this.A + 8, $$2 + this.B + 5);
        }
        for (gsj $$6 : this.y) {
            $$6.a($$0, $$1, $$2);
        }
    }

    public int a() {
        return this.u;
    }

    public void a(ae $$0) {
        this.z = $$0;
    }

    public void a(gsj $$0) {
        this.y.add($$0);
    }

    public void a(gir $$0, int $$1, int $$2, float $$3, int $$4, int $$5) {
        int $$32;
        gsk $$29;
        gsk $$28;
        gsk $$27;
        gio $$6 = this.w.g;
        int $$7 = $$6.b * this.t.size() + 9 + 8;
        int $$8 = $$2 + this.B + (26 - $$7) / 2;
        int $$9 = $$8 + $$7;
        int $$10 = this.v.size() * $$6.b;
        int $$11 = 6 + $$10;
        boolean $$12 = $$4 + $$1 + this.A + this.u + 26 >= this.q.h().o;
        yh $$13 = this.z == null ? null : this.z.d();
        int $$14 = $$13 == null ? 0 : $$6.a($$13);
        boolean $$15 = $$9 + $$11 >= 113;
        float $$16 = this.z == null ? 0.0f : this.z.c();
        int $$17 = bgj.b($$16 * (float)this.u);
        if ($$16 >= 1.0f) {
            $$17 = this.u / 2;
            gsk $$18 = gsk.a;
            gsk $$19 = gsk.a;
            gsk $$20 = gsk.a;
        } else if ($$17 < 2) {
            $$17 = this.u / 2;
            gsk $$21 = gsk.b;
            gsk $$22 = gsk.b;
            gsk $$23 = gsk.b;
        } else if ($$17 > this.u - 2) {
            $$17 = this.u / 2;
            gsk $$24 = gsk.a;
            gsk $$25 = gsk.a;
            gsk $$26 = gsk.b;
        } else {
            $$27 = gsk.a;
            $$28 = gsk.b;
            $$29 = gsk.b;
        }
        int $$30 = this.u - $$17;
        if ($$12) {
            int $$31 = $$1 + this.A - this.u + 26 + 6;
        } else {
            $$32 = $$1 + this.A;
        }
        int $$33 = $$7 + $$11;
        if (!this.v.isEmpty()) {
            if ($$15) {
                $$0.a(hpa.at, a, $$32, $$9 - $$33, this.u, $$33);
            } else {
                $$0.a(hpa.at, a, $$32, $$8, this.u, $$33);
            }
        }
        if ($$27 != $$28) {
            $$0.a(hpa.at, $$27.a(), 200, $$7, 0, 0, $$32, $$8, $$17, $$7);
            $$0.a(hpa.at, $$28.a(), 200, $$7, 200 - $$30, 0, $$32 + $$17, $$8, $$30, $$7);
        } else {
            $$0.a(hpa.at, $$27.a(), $$32, $$8, this.u, $$7);
        }
        $$0.a(hpa.at, $$29.a(this.s.e()), $$1 + this.A + 3, $$2 + this.B, 26, 26);
        int $$34 = $$32 + 5;
        if ($$12) {
            this.a($$0, this.t, $$34, $$8 + 9, -1);
            if ($$13 != null) {
                $$0.b($$6, $$13, $$1 + this.A - $$14, $$8 + 9, -1);
            }
        } else {
            this.a($$0, this.t, $$1 + this.A + 32, $$8 + 9, -1);
            if ($$13 != null) {
                $$0.b($$6, $$13, $$1 + this.A + this.u - $$14 - 5, $$8 + 9, -1);
            }
        }
        if ($$15) {
            this.a($$0, this.v, $$34, $$8 - $$10 + 1, -16711936);
        } else {
            this.a($$0, this.v, $$34, $$9, -16711936);
        }
        $$0.b(this.s.c(), $$1 + this.A + 8, $$2 + this.B + 5);
    }

    private void a(gir $$0, List<bfr> $$1, int $$2, int $$3, int $$4) {
        gio $$5 = this.w.g;
        for (int $$6 = 0; $$6 < $$1.size(); ++$$6) {
            $$0.b($$5, $$1.get($$6), $$2, $$3 + $$6 * $$5.b, $$4);
        }
    }

    public boolean a(int $$0, int $$1, int $$2, int $$3) {
        if (this.s.j() && (this.z == null || !this.z.a())) {
            return false;
        }
        int $$4 = $$0 + this.A;
        int $$5 = $$4 + 26;
        int $$6 = $$1 + this.B;
        int $$7 = $$6 + 26;
        return $$2 >= $$4 && $$2 <= $$5 && $$3 >= $$6 && $$3 <= $$7;
    }

    public void b() {
        if (this.x == null && this.r.c() != null) {
            this.x = this.a(this.r);
            if (this.x != null) {
                this.x.a(this);
            }
        }
    }

    public int c() {
        return this.B;
    }

    public int d() {
        return this.A;
    }
}

