/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Map;
import java.util.function.Predicate;

public class ddl
implements ccv,
cdg {
    public static final int b = 5;
    public static final int c = 36;
    public static final int d = 9;
    public static final int e = 40;
    public static final int f = 41;
    public static final int g = 42;
    public static final int h = -1;
    public static final Int2ObjectMap<cgv> i = new Int2ObjectArrayMap(Map.of(cgv.c.a(36), cgv.c, cgv.d.a(36), cgv.d, cgv.e.a(36), cgv.e, cgv.f.a(36), cgv.f, 40, cgv.b, 41, cgv.g, 42, cgv.h));
    private static final yh k = yh.c("container.inventory");
    private final jm<dlt> l = jm.a(36, dlt.l);
    private int m;
    public final ddm j;
    private final cgo n;
    private int o;

    public ddl(ddm $$0, cgo $$1) {
        this.j = $$0;
        this.n = $$1;
    }

    public int g() {
        return this.m;
    }

    public void d(int $$0) {
        if (!ddl.f($$0)) {
            throw new IllegalArgumentException("Invalid selected slot");
        }
        this.m = $$0;
    }

    public dlt h() {
        return this.l.get(this.m);
    }

    public dlt b(dlt $$0) {
        return this.l.set(this.m, $$0);
    }

    public static int i() {
        return 9;
    }

    public jm<dlt> j() {
        return this.l;
    }

    private boolean a(dlt $$0, dlt $$1) {
        return !$$0.f() && dlt.c($$0, $$1) && $$0.l() && $$0.N() < this.f_($$0);
    }

    public int k() {
        for (int $$0 = 0; $$0 < this.l.size(); ++$$0) {
            if (!this.l.get($$0).f()) continue;
            return $$0;
        }
        return -1;
    }

    public void c(dlt $$0) {
        int $$1;
        this.d(this.l());
        if (!this.l.get(this.m).f() && ($$1 = this.k()) != -1) {
            this.l.set($$1, this.l.get(this.m));
        }
        this.l.set(this.m, $$0);
    }

    public void e(int $$0) {
        this.d(this.l());
        dlt $$1 = this.l.get(this.m);
        this.l.set(this.m, this.l.get($$0));
        this.l.set($$0, $$1);
    }

    public static boolean f(int $$0) {
        return $$0 >= 0 && $$0 < 9;
    }

    public int d(dlt $$0) {
        for (int $$1 = 0; $$1 < this.l.size(); ++$$1) {
            if (this.l.get($$1).f() || !dlt.c($$0, this.l.get($$1))) continue;
            return $$1;
        }
        return -1;
    }

    public static boolean e(dlt $$0) {
        return !$$0.n() && !$$0.F() && !$$0.c(ki.h);
    }

    public int a(jd<dlp> $$0, dlt $$1) {
        for (int $$2 = 0; $$2 < this.l.size(); ++$$2) {
            dlt $$3 = this.l.get($$2);
            if ($$3.f() || !$$3.a($$0) || !ddl.e($$3) || !$$1.f() && !dlt.c($$1, $$3)) continue;
            return $$2;
        }
        return -1;
    }

    public int l() {
        for (int $$0 = 0; $$0 < 9; ++$$0) {
            int $$1 = (this.m + $$0) % 9;
            if (!this.l.get($$1).f()) continue;
            return $$1;
        }
        for (int $$2 = 0; $$2 < 9; ++$$2) {
            int $$3 = (this.m + $$2) % 9;
            if (this.l.get($$3).F()) continue;
            return $$3;
        }
        return this.m;
    }

    public int a(Predicate<dlt> $$0, int $$1, ccv $$2) {
        int $$3 = 0;
        boolean $$4 = $$1 == 0;
        $$3 += ccw.a(this, $$0, $$1 - $$3, $$4);
        $$3 += ccw.a($$2, $$0, $$1 - $$3, $$4);
        dlt $$5 = this.j.cn.g();
        $$3 += ccw.a($$5, $$0, $$1 - $$3, $$4);
        if ($$5.f()) {
            this.j.cn.a(dlt.l);
        }
        return $$3;
    }

    private int k(dlt $$0) {
        int $$1 = this.f($$0);
        if ($$1 == -1) {
            $$1 = this.k();
        }
        if ($$1 == -1) {
            return $$0.N();
        }
        return this.d($$1, $$0);
    }

    private int d(int $$0, dlt $$1) {
        int $$4;
        int $$5;
        int $$2 = $$1.N();
        dlt $$3 = this.a($$0);
        if ($$3.f()) {
            $$3 = $$1.c(0);
            this.a($$0, $$3);
        }
        if (($$5 = Math.min($$2, $$4 = this.f_($$3) - $$3.N())) == 0) {
            return $$2;
        }
        $$3.g($$5);
        $$3.d(5);
        return $$2 -= $$5;
    }

    public int f(dlt $$0) {
        if (this.a(this.a(this.m), $$0)) {
            return this.m;
        }
        if (this.a(this.a(40), $$0)) {
            return 40;
        }
        for (int $$1 = 0; $$1 < this.l.size(); ++$$1) {
            if (!this.a(this.l.get($$1), $$0)) continue;
            return $$1;
        }
        return -1;
    }

    public void m() {
        for (int $$0 = 0; $$0 < this.l.size(); ++$$0) {
            dlt $$1 = this.a($$0);
            if ($$1.f()) continue;
            $$1.a(this.j.ao(), (cgk)this.j, $$0 == this.m ? cgv.a : null);
        }
    }

    public boolean g(dlt $$0) {
        return this.c(-1, $$0);
    }

    public boolean c(int $$0, dlt $$1) {
        if ($$1.f()) {
            return false;
        }
        try {
            if (!$$1.n()) {
                int $$2;
                do {
                    $$2 = $$1.N();
                    if ($$0 == -1) {
                        $$1.e(this.k($$1));
                        continue;
                    }
                    $$1.e(this.d($$0, $$1));
                } while (!$$1.f() && $$1.N() < $$2);
                if ($$1.N() == $$2 && this.j.gv()) {
                    $$1.e(0);
                    return true;
                }
                return $$1.N() < $$2;
            }
            if ($$0 == -1) {
                $$0 = this.k();
            }
            if ($$0 >= 0) {
                this.l.set($$0, $$1.g());
                this.l.get($$0).d(5);
                return true;
            }
            if (this.j.gv()) {
                $$1.e(0);
                return true;
            }
            return false;
        }
        catch (Throwable $$3) {
            m $$4 = m.a($$3, "Adding item to inventory");
            n $$5 = $$4.a("Item being added");
            $$5.a("Item ID", dlp.a($$1.h()));
            $$5.a("Item data", $$1.o());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new v($$4);
        }
    }

    public void h(dlt $$0) {
        this.a($$0, true);
    }

    public void a(dlt $$0, boolean $$1) {
        while (!$$0.f()) {
            ddm ddm2;
            int $$2 = this.f($$0);
            if ($$2 == -1) {
                $$2 = this.k();
            }
            if ($$2 == -1) {
                this.j.a($$0, false);
                break;
            }
            int $$3 = $$0.k() - this.a($$2).N();
            if (!this.c($$2, $$0.a($$3)) || !$$1 || !((ddm2 = this.j) instanceof axg)) continue;
            axg $$4 = (axg)ddm2;
            $$4.g.b(this.g($$2));
        }
    }

    public agy g(int $$0) {
        return new agy($$0, this.a($$0).v());
    }

    @Override
    public dlt a(int $$0, int $$1) {
        dlt $$3;
        if ($$0 < this.l.size()) {
            return ccw.a(this.l, $$0, $$1);
        }
        cgv $$2 = (cgv)i.get($$0);
        if ($$2 != null && !($$3 = this.n.a($$2)).f()) {
            return $$3.a($$1);
        }
        return dlt.l;
    }

    public void i(dlt $$0) {
        for (int $$1 = 0; $$1 < this.l.size(); ++$$1) {
            if (this.l.get($$1) != $$0) continue;
            this.l.set($$1, dlt.l);
            return;
        }
        for (cgv $$2 : i.values()) {
            dlt $$3 = this.n.a($$2);
            if ($$3 != $$0) continue;
            this.n.a($$2, dlt.l);
            return;
        }
    }

    @Override
    public dlt b(int $$0) {
        if ($$0 < this.l.size()) {
            dlt $$1 = this.l.get($$0);
            this.l.set($$0, dlt.l);
            return $$1;
        }
        cgv $$2 = (cgv)i.get($$0);
        if ($$2 != null) {
            return this.n.a($$2, dlt.l);
        }
        return dlt.l;
    }

    @Override
    public void a(int $$0, dlt $$1) {
        cgv $$2;
        if ($$0 < this.l.size()) {
            this.l.set($$0, $$1);
        }
        if (($$2 = (cgv)i.get($$0)) != null) {
            this.n.a($$2, $$1);
        }
    }

    public void a(fns.a<cdd> $$0) {
        for (int $$1 = 0; $$1 < this.l.size(); ++$$1) {
            dlt $$2 = this.l.get($$1);
            if ($$2.f()) continue;
            $$0.a(new cdd($$1, $$2));
        }
    }

    public void a(fnq.a<cdd> $$0) {
        this.l.clear();
        for (cdd $$1 : $$0) {
            if (!$$1.a(this.l.size())) continue;
            this.a($$1.a(), $$1.b());
        }
    }

    @Override
    public int b() {
        return this.l.size() + i.size();
    }

    @Override
    public boolean c() {
        for (dlt $$0 : this.l) {
            if ($$0.f()) continue;
            return false;
        }
        for (cgv $$1 : i.values()) {
            if (this.n.a($$1).f()) continue;
            return false;
        }
        return true;
    }

    @Override
    public dlt a(int $$0) {
        if ($$0 < this.l.size()) {
            return this.l.get($$0);
        }
        cgv $$1 = (cgv)i.get($$0);
        if ($$1 != null) {
            return this.n.a($$1);
        }
        return dlt.l;
    }

    @Override
    public yh ap() {
        return k;
    }

    public void n() {
        for (int $$0 = 0; $$0 < this.l.size(); ++$$0) {
            dlt $$1 = this.l.get($$0);
            if ($$1.f()) continue;
            this.j.a($$1, true, false);
            this.l.set($$0, dlt.l);
        }
        this.n.a(this.j);
    }

    @Override
    public void e() {
        ++this.o;
    }

    public int o() {
        return this.o;
    }

    @Override
    public boolean a(ddm $$0) {
        return true;
    }

    public boolean j(dlt $$0) {
        for (dlt $$1 : this) {
            if ($$1.f() || !dlt.c($$1, $$0)) continue;
            return true;
        }
        return false;
    }

    public boolean a(bef<dlp> $$0) {
        for (dlt $$1 : this) {
            if ($$1.f() || !$$1.a($$0)) continue;
            return true;
        }
        return false;
    }

    public boolean b(Predicate<dlt> $$0) {
        for (dlt $$1 : this) {
            if (!$$0.test($$1)) continue;
            return true;
        }
        return false;
    }

    public void a(ddl $$0) {
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            this.a($$1, $$0.a($$1));
        }
        this.d($$0.g());
    }

    @Override
    public void a() {
        this.l.clear();
        this.n.b();
    }

    public void a(ddu $$0) {
        for (dlt $$1 : this.l) {
            $$0.a($$1);
        }
    }

    public dlt a(boolean $$0) {
        dlt $$1 = this.h();
        if ($$1.f()) {
            return dlt.l;
        }
        return this.a(this.m, $$0 ? $$1.N() : 1);
    }
}

