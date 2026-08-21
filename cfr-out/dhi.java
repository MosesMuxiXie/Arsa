/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Supplier
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class dhi {
    private static final Logger m = LogUtils.getLogger();
    public static final int a = -999;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = Integer.MAX_VALUE;
    public static final int i = 9;
    public static final int j = 18;
    private final jm<dlt> n = jm.a();
    public final jm<dji> k = jm.a();
    private final List<did> o = Lists.newArrayList();
    private dlt p = dlt.l;
    private final jm<djc> q = jm.a();
    private final IntList r = new IntArrayList();
    private djc s = djc.a;
    private int t;
    private final @Nullable dis<?> u;
    public final int l;
    private int v = -1;
    private int w;
    private final Set<dji> x = Sets.newHashSet();
    private final List<dhx> y = Lists.newArrayList();
    private @Nullable dhy z;
    private boolean A;

    protected dhi(@Nullable dis<?> $$0, int $$1) {
        this.u = $$0;
        this.l = $$1;
    }

    protected void a(ccv $$0, int $$1, int $$2) {
        for (int $$3 = 0; $$3 < 9; ++$$3) {
            this.a(new dji($$0, $$3, $$1 + $$3 * 18, $$2));
        }
    }

    protected void b(ccv $$0, int $$1, int $$2) {
        for (int $$3 = 0; $$3 < 3; ++$$3) {
            for (int $$4 = 0; $$4 < 9; ++$$4) {
                this.a(new dji($$0, $$4 + ($$3 + 1) * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
            }
        }
    }

    protected void c(ccv $$0, int $$1, int $$2) {
        this.b($$0, $$1, $$2);
        int $$3 = 4;
        int $$4 = 58;
        this.a($$0, $$1, $$2 + 58);
    }

    protected static boolean a(dhw $$0, ddm $$1, dzq $$22) {
        return $$0.a((dwo $$2, is $$3) -> {
            if (!$$2.a_((is)$$3).a($$22)) {
                return false;
            }
            return $$1.a((is)$$3, 4.0);
        }, true);
    }

    public dis<?> a() {
        if (this.u == null) {
            throw new UnsupportedOperationException("Unable to construct this menu by type");
        }
        return this.u;
    }

    protected static void a(ccv $$0, int $$1) {
        int $$2 = $$0.b();
        if ($$2 < $$1) {
            throw new IllegalArgumentException("Container size " + $$2 + " is smaller than expected " + $$1);
        }
    }

    protected static void a(dhv $$0, int $$1) {
        int $$2 = $$0.a();
        if ($$2 < $$1) {
            throw new IllegalArgumentException("Container data count " + $$2 + " is smaller than expected " + $$1);
        }
    }

    public boolean a(int $$0) {
        return $$0 == -1 || $$0 == -999 || $$0 < this.k.size();
    }

    protected dji a(dji $$0) {
        $$0.d = this.k.size();
        this.k.add($$0);
        this.n.add(dlt.l);
        this.q.add(this.z != null ? this.z.a() : djc.a);
        return $$0;
    }

    protected did a(did $$0) {
        this.o.add($$0);
        this.r.add(0);
        return $$0;
    }

    protected void a(dhv $$0) {
        for (int $$1 = 0; $$1 < $$0.a(); ++$$1) {
            this.a(did.a($$0, $$1));
        }
    }

    public void a(dhx $$0) {
        if (this.y.contains($$0)) {
            return;
        }
        this.y.add($$0);
        this.d();
    }

    public void a(dhy $$0) {
        this.z = $$0;
        this.s = $$0.a();
        this.q.replaceAll($$1 -> $$0.a());
        this.b();
    }

    public void b() {
        ArrayList<dlt> $$0 = new ArrayList<dlt>(this.k.size());
        int $$2 = this.k.size();
        for (int $$1 = 0; $$1 < $$2; ++$$1) {
            dlt $$3 = this.k.get($$1).g();
            $$0.add($$3.v());
            this.q.get($$1).a($$3);
        }
        dlt $$4 = this.g();
        this.s.a($$4);
        int $$6 = this.o.size();
        for (int $$5 = 0; $$5 < $$6; ++$$5) {
            this.r.set($$5, this.o.get($$5).b());
        }
        if (this.z != null) {
            this.z.a(this, $$0, $$4.v(), this.r.toIntArray());
        }
    }

    public void b(dhx $$0) {
        this.y.remove($$0);
    }

    public jm<dlt> c() {
        jm<dlt> $$0 = jm.a();
        for (dji $$1 : this.k) {
            $$0.add($$1.g());
        }
        return $$0;
    }

    public void d() {
        for (int $$0 = 0; $$0 < this.k.size(); ++$$0) {
            dlt $$1 = this.k.get($$0).g();
            com.google.common.base.Supplier $$2 = Suppliers.memoize($$1::v);
            this.a($$0, $$1, (Supplier<dlt>)$$2);
            this.b($$0, $$1, (Supplier<dlt>)$$2);
        }
        this.l();
        for (int $$3 = 0; $$3 < this.o.size(); ++$$3) {
            did $$4 = this.o.get($$3);
            int $$5 = $$4.b();
            if ($$4.c()) {
                this.d($$3, $$5);
            }
            this.e($$3, $$5);
        }
    }

    public void e() {
        for (int $$0 = 0; $$0 < this.k.size(); ++$$0) {
            dlt $$1 = this.k.get($$0).g();
            this.a($$0, $$1, $$1::v);
        }
        for (int $$2 = 0; $$2 < this.o.size(); ++$$2) {
            did $$3 = this.o.get($$2);
            if (!$$3.c()) continue;
            this.d($$2, $$3.b());
        }
        this.b();
    }

    private void d(int $$0, int $$1) {
        for (dhx $$2 : this.y) {
            $$2.a(this, $$0, $$1);
        }
    }

    private void a(int $$0, dlt $$1, Supplier<dlt> $$2) {
        dlt $$3 = this.n.get($$0);
        if (!dlt.a($$3, $$1)) {
            dlt $$4 = $$2.get();
            this.n.set($$0, $$4);
            for (dhx $$5 : this.y) {
                $$5.a(this, $$0, $$4);
            }
        }
    }

    private void b(int $$0, dlt $$1, Supplier<dlt> $$2) {
        if (this.A) {
            return;
        }
        djc $$3 = this.q.get($$0);
        if (!$$3.b($$1)) {
            $$3.a($$1);
            if (this.z != null) {
                this.z.a(this, $$0, $$2.get());
            }
        }
    }

    private void e(int $$0, int $$1) {
        if (this.A) {
            return;
        }
        int $$2 = this.r.getInt($$0);
        if ($$2 != $$1) {
            this.r.set($$0, $$1);
            if (this.z != null) {
                this.z.a(this, $$0, $$1);
            }
        }
    }

    private void l() {
        if (this.A) {
            return;
        }
        dlt $$0 = this.g();
        if (!this.s.b($$0)) {
            this.s.a($$0);
            if (this.z != null) {
                this.z.a(this, $$0.v());
            }
        }
    }

    public void a(int $$0, dlt $$1) {
        this.q.get($$0).a($$1);
    }

    public void a(int $$0, xa $$1) {
        if ($$0 < 0 || $$0 >= this.q.size()) {
            m.debug("Incorrect slot index: {} available slots: {}", (Object)$$0, (Object)this.q.size());
            return;
        }
        this.q.get($$0).a($$1);
    }

    public void a(xa $$0) {
        this.s.a($$0);
    }

    public boolean a(ddm $$0, int $$1) {
        return false;
    }

    public dji b(int $$0) {
        return this.k.get($$0);
    }

    public abstract dlt b(ddm var1, int var2);

    public void a(int $$0, int $$1) {
        if ($$0 >= 0 && $$0 < this.k.size()) {
            dlt $$2 = this.k.get($$0).g();
            dki.a($$2, $$1);
        }
    }

    public void a(int $$0, int $$1, dhu $$2, ddm $$3) {
        try {
            this.b($$0, $$1, $$2, $$3);
        }
        catch (Exception $$4) {
            m $$5 = m.a($$4, "Container click");
            n $$6 = $$5.a("Click info");
            $$6.a("Menu Type", () -> this.u != null ? mi.q.b(this.u).toString() : "<no type>");
            $$6.a("Menu Class", () -> this.getClass().getCanonicalName());
            $$6.a("Slot Count", this.k.size());
            $$6.a("Slot", $$0);
            $$6.a("Button", $$1);
            $$6.a("Type", (Object)$$2);
            throw new v($$5);
        }
    }

    private void b(int $$0, int $$1, dhu $$22, ddm $$32) {
        block40: {
            block52: {
                int $$35;
                block51: {
                    block47: {
                        dlt $$29;
                        dji $$28;
                        dlt $$27;
                        ddl $$4;
                        block50: {
                            block49: {
                                block48: {
                                    block45: {
                                        dht $$16;
                                        block46: {
                                            block44: {
                                                block38: {
                                                    block43: {
                                                        dlt $$7;
                                                        block42: {
                                                            block41: {
                                                                block39: {
                                                                    $$4 = $$32.gK();
                                                                    if ($$22 != dhu.f) break block38;
                                                                    int $$5 = this.w;
                                                                    this.w = dhi.d($$1);
                                                                    if ($$5 == 1 && this.w == 2 || $$5 == this.w) break block39;
                                                                    this.f();
                                                                    break block40;
                                                                }
                                                                if (!this.g().f()) break block41;
                                                                this.f();
                                                                break block40;
                                                            }
                                                            if (this.w != 0) break block42;
                                                            this.v = dhi.c($$1);
                                                            if (dhi.a(this.v, $$32)) {
                                                                this.w = 1;
                                                                this.x.clear();
                                                            } else {
                                                                this.f();
                                                            }
                                                            break block40;
                                                        }
                                                        if (this.w != 1) break block43;
                                                        dji $$6 = this.k.get($$0);
                                                        if (!dhi.a($$6, $$7 = this.g(), true) || !$$6.a($$7) || this.v != 2 && $$7.N() <= this.x.size() || !this.b($$6)) break block40;
                                                        this.x.add($$6);
                                                        break block40;
                                                    }
                                                    if (this.w == 2) {
                                                        if (!this.x.isEmpty()) {
                                                            if (this.x.size() == 1) {
                                                                int $$8 = this.x.iterator().next().d;
                                                                this.f();
                                                                this.b($$8, this.v, dhu.a, $$32);
                                                                return;
                                                            }
                                                            dlt $$9 = this.g().v();
                                                            if ($$9.f()) {
                                                                this.f();
                                                                return;
                                                            }
                                                            int $$10 = this.g().N();
                                                            for (dji $$11 : this.x) {
                                                                dlt $$12 = this.g();
                                                                if ($$11 == null || !dhi.a($$11, $$12, true) || !$$11.a($$12) || this.v != 2 && $$12.N() < this.x.size() || !this.b($$11)) continue;
                                                                int $$13 = $$11.h() ? $$11.g().N() : 0;
                                                                int $$14 = Math.min($$9.k(), $$11.b_($$9));
                                                                int $$15 = Math.min(dhi.a(this.x, this.v, $$9) + $$13, $$14);
                                                                $$10 -= $$15 - $$13;
                                                                $$11.e($$9.c($$15));
                                                            }
                                                            $$9.e($$10);
                                                            this.a($$9);
                                                        }
                                                        this.f();
                                                    } else {
                                                        this.f();
                                                    }
                                                    break block40;
                                                }
                                                if (this.w == 0) break block44;
                                                this.f();
                                                break block40;
                                            }
                                            if ($$22 != dhu.a && $$22 != dhu.b || $$1 != 0 && $$1 != 1) break block45;
                                            dht dht2 = $$16 = $$1 == 0 ? dht.a : dht.b;
                                            if ($$0 != -999) break block46;
                                            if (this.g().f()) break block40;
                                            if ($$16 == dht.a) {
                                                $$32.a(this.g(), true);
                                                this.a(dlt.l);
                                            } else {
                                                $$32.a(this.g().a(1), true);
                                            }
                                            break block40;
                                        }
                                        if ($$22 == dhu.b) {
                                            if ($$0 < 0) {
                                                return;
                                            }
                                            dji $$17 = this.k.get($$0);
                                            if (!$$17.a($$32)) {
                                                return;
                                            }
                                            dlt $$18 = this.b($$32, $$0);
                                            while (!$$18.f() && dlt.b($$17.g(), $$18)) {
                                                $$18 = this.b($$32, $$0);
                                            }
                                        } else {
                                            if ($$0 < 0) {
                                                return;
                                            }
                                            dji $$19 = this.k.get($$0);
                                            dlt $$20 = $$19.g();
                                            dlt $$21 = this.g();
                                            $$32.a($$21, $$19.g(), $$16);
                                            if (!this.a($$32, $$16, $$19, $$20, $$21)) {
                                                if ($$20.f()) {
                                                    if (!$$21.f()) {
                                                        int $$222 = $$16 == dht.a ? $$21.N() : 1;
                                                        this.a($$19.b($$21, $$222));
                                                    }
                                                } else if ($$19.a($$32)) {
                                                    if ($$21.f()) {
                                                        int $$23 = $$16 == dht.a ? $$20.N() : ($$20.N() + 1) / 2;
                                                        Optional<dlt> $$24 = $$19.a($$23, Integer.MAX_VALUE, $$32);
                                                        $$24.ifPresent($$2 -> {
                                                            this.a((dlt)$$2);
                                                            $$19.a($$32, (dlt)$$2);
                                                        });
                                                    } else if ($$19.a($$21)) {
                                                        if (dlt.c($$20, $$21)) {
                                                            int $$25 = $$16 == dht.a ? $$21.N() : 1;
                                                            this.a($$19.b($$21, $$25));
                                                        } else if ($$21.N() <= $$19.b_($$21)) {
                                                            this.a($$20);
                                                            $$19.e($$21);
                                                        }
                                                    } else if (dlt.c($$20, $$21)) {
                                                        Optional<dlt> $$26 = $$19.a($$20.N(), $$21.k() - $$21.N(), $$32);
                                                        $$26.ifPresent($$3 -> {
                                                            $$21.g($$3.N());
                                                            $$19.a($$32, (dlt)$$3);
                                                        });
                                                    }
                                                }
                                            }
                                            $$19.d();
                                        }
                                        break block40;
                                    }
                                    if ($$22 != dhu.c || ($$1 < 0 || $$1 >= 9) && $$1 != 40) break block47;
                                    $$27 = $$4.a($$1);
                                    $$28 = this.k.get($$0);
                                    $$29 = $$28.g();
                                    if ($$27.f() && $$29.f()) break block40;
                                    if (!$$27.f()) break block48;
                                    if (!$$28.a($$32)) break block40;
                                    $$4.a($$1, $$29);
                                    $$28.b($$29.N());
                                    $$28.e(dlt.l);
                                    $$28.a($$32, $$29);
                                    break block40;
                                }
                                if (!$$29.f()) break block49;
                                if (!$$28.a($$27)) break block40;
                                int $$30 = $$28.b_($$27);
                                if ($$27.N() > $$30) {
                                    $$28.e($$27.a($$30));
                                } else {
                                    $$4.a($$1, dlt.l);
                                    $$28.e($$27);
                                }
                                break block40;
                            }
                            if (!$$28.a($$32) || !$$28.a($$27)) break block40;
                            int $$31 = $$28.b_($$27);
                            if ($$27.N() <= $$31) break block50;
                            $$28.e($$27.a($$31));
                            $$28.a($$32, $$29);
                            if ($$4.g($$29)) break block40;
                            $$32.a($$29, true);
                            break block40;
                        }
                        $$4.a($$1, $$29);
                        $$28.e($$27);
                        $$28.a($$32, $$29);
                        break block40;
                    }
                    if ($$22 != dhu.d || !$$32.gv() || !this.g().f() || $$0 < 0) break block51;
                    dji $$322 = this.k.get($$0);
                    if (!$$322.h()) break block40;
                    dlt $$33 = $$322.g();
                    this.a($$33.c($$33.k()));
                    break block40;
                }
                if ($$22 != dhu.e || !this.g().f() || $$0 < 0) break block52;
                dji $$34 = this.k.get($$0);
                int n2 = $$35 = $$1 == 0 ? 1 : $$34.g().N();
                if (!$$32.gO()) {
                    return;
                }
                dlt $$36 = $$34.b($$35, Integer.MAX_VALUE, $$32);
                $$32.a($$36, true);
                $$32.g($$36);
                if ($$1 != 1) break block40;
                while (!$$36.f() && dlt.b($$34.g(), $$36)) {
                    if (!$$32.gO()) {
                        return;
                    }
                    $$36 = $$34.b($$35, Integer.MAX_VALUE, $$32);
                    $$32.a($$36, true);
                    $$32.g($$36);
                }
                break block40;
            }
            if ($$22 == dhu.g && $$0 >= 0) {
                dji $$37 = this.k.get($$0);
                dlt $$38 = this.g();
                if (!($$38.f() || $$37.h() && $$37.a($$32))) {
                    int $$39 = $$1 == 0 ? 0 : this.k.size() - 1;
                    int $$40 = $$1 == 0 ? 1 : -1;
                    for (int $$41 = 0; $$41 < 2; ++$$41) {
                        for (int $$42 = $$39; $$42 >= 0 && $$42 < this.k.size() && $$38.N() < $$38.k(); $$42 += $$40) {
                            dji $$43 = this.k.get($$42);
                            if (!$$43.h() || !dhi.a($$43, $$38, true) || !$$43.a($$32) || !this.a($$38, $$43)) continue;
                            dlt $$44 = $$43.g();
                            if ($$41 == 0 && $$44.N() == $$44.k()) continue;
                            dlt $$45 = $$43.b($$44.N(), $$38.k() - $$38.N(), $$32);
                            $$38.g($$45.N());
                        }
                    }
                }
            }
        }
    }

    private boolean a(ddm $$0, dht $$1, dji $$2, dlt $$3, dlt $$4) {
        dgz $$5 = $$0.ao().Q();
        if ($$4.a($$5) && $$4.a($$2, $$1, $$0)) {
            return true;
        }
        return $$3.a($$5) && $$3.a($$4, $$2, $$1, $$0, this.m());
    }

    private cic m() {
        return new cic(){

            @Override
            public dlt a() {
                return dhi.this.g();
            }

            @Override
            public boolean a(dlt $$0) {
                dhi.this.a($$0);
                return true;
            }
        };
    }

    public boolean a(dlt $$0, dji $$1) {
        return true;
    }

    public void a(ddm $$0) {
        if (!($$0 instanceof axg)) {
            return;
        }
        dlt $$1 = this.g();
        if (!$$1.f()) {
            dhi.a($$0, $$1);
            this.a(dlt.l);
        }
    }

    private static void a(ddm $$0, dlt $$1) {
        axg $$3;
        boolean $$4;
        boolean $$2 = $$0.eh() && $$0.ei() != cgk.e.e;
        boolean bl2 = $$4 = $$0 instanceof axg && ($$3 = (axg)$$0).w();
        if ($$2 || $$4) {
            $$0.a($$1, false);
        } else if ($$0 instanceof axg) {
            $$0.gK().h($$1);
        }
    }

    protected void a(ddm $$0, ccv $$1) {
        for (int $$2 = 0; $$2 < $$1.b(); ++$$2) {
            dhi.a($$0, $$1.b($$2));
        }
    }

    public void a(ccv $$0) {
        this.d();
    }

    public void a(int $$0, int $$1, dlt $$2) {
        this.b($$0).f($$2);
        this.t = $$1;
    }

    public void a(int $$0, List<dlt> $$1, dlt $$2) {
        for (int $$3 = 0; $$3 < $$1.size(); ++$$3) {
            this.b($$3).f($$1.get($$3));
        }
        this.p = $$2;
        this.t = $$0;
    }

    public void b(int $$0, int $$1) {
        this.o.get($$0).a($$1);
    }

    public abstract boolean b(ddm var1);

    protected boolean a(dlt $$0, int $$1, int $$2, boolean $$3) {
        boolean $$4 = false;
        int $$5 = $$1;
        if ($$3) {
            $$5 = $$2 - 1;
        }
        if ($$0.l()) {
            while (!$$0.f() && ($$3 ? $$5 >= $$1 : $$5 < $$2)) {
                dji $$6 = this.k.get($$5);
                dlt $$7 = $$6.g();
                if (!$$7.f() && dlt.c($$0, $$7)) {
                    int $$9;
                    int $$8 = $$7.N() + $$0.N();
                    if ($$8 <= ($$9 = $$6.b_($$7))) {
                        $$0.e(0);
                        $$7.e($$8);
                        $$6.d();
                        $$4 = true;
                    } else if ($$7.N() < $$9) {
                        $$0.h($$9 - $$7.N());
                        $$7.e($$9);
                        $$6.d();
                        $$4 = true;
                    }
                }
                if ($$3) {
                    --$$5;
                    continue;
                }
                ++$$5;
            }
        }
        if (!$$0.f()) {
            $$5 = $$3 ? $$2 - 1 : $$1;
            while ($$3 ? $$5 >= $$1 : $$5 < $$2) {
                dji $$10 = this.k.get($$5);
                dlt $$11 = $$10.g();
                if ($$11.f() && $$10.a($$0)) {
                    int $$12 = $$10.b_($$0);
                    $$10.e($$0.a(Math.min($$0.N(), $$12)));
                    $$10.d();
                    $$4 = true;
                    break;
                }
                if ($$3) {
                    --$$5;
                    continue;
                }
                ++$$5;
            }
        }
        return $$4;
    }

    public static int c(int $$0) {
        return $$0 >> 2 & 3;
    }

    public static int d(int $$0) {
        return $$0 & 3;
    }

    public static int c(int $$0, int $$1) {
        return $$0 & 3 | ($$1 & 3) << 2;
    }

    public static boolean a(int $$0, ddm $$1) {
        if ($$0 == 0) {
            return true;
        }
        if ($$0 == 1) {
            return true;
        }
        return $$0 == 2 && $$1.gv();
    }

    protected void f() {
        this.w = 0;
        this.x.clear();
    }

    public static boolean a(@Nullable dji $$0, dlt $$1, boolean $$2) {
        boolean $$3;
        boolean bl2 = $$3 = $$0 == null || !$$0.h();
        if (!$$3 && dlt.c($$1, $$0.g())) {
            return $$0.g().N() + ($$2 ? 0 : $$1.N()) <= $$1.k();
        }
        return $$3;
    }

    public static int a(Set<dji> $$0, int $$1, dlt $$2) {
        return switch ($$1) {
            case 0 -> bgj.b((float)$$2.N() / (float)$$0.size());
            case 1 -> 1;
            case 2 -> $$2.k();
            default -> $$2.N();
        };
    }

    public boolean b(dji $$0) {
        return true;
    }

    public static int a(@Nullable elb $$0) {
        if ($$0 instanceof ccv) {
            return dhi.b((ccv)((Object)$$0));
        }
        return 0;
    }

    public static int b(@Nullable ccv $$0) {
        if ($$0 == null) {
            return 0;
        }
        float $$1 = 0.0f;
        for (int $$2 = 0; $$2 < $$0.b(); ++$$2) {
            dlt $$3 = $$0.a($$2);
            if ($$3.f()) continue;
            $$1 += (float)$$3.N() / (float)$$0.f_($$3);
        }
        return bgj.b($$1 /= (float)$$0.b(), 0, 15);
    }

    public void a(dlt $$0) {
        this.p = $$0;
    }

    public dlt g() {
        return this.p;
    }

    public void h() {
        this.A = true;
    }

    public void i() {
        this.A = false;
    }

    public void a(dhi $$0) {
        HashBasedTable $$1 = HashBasedTable.create();
        for (int $$2 = 0; $$2 < $$0.k.size(); ++$$2) {
            dji $$3 = $$0.k.get($$2);
            $$1.put((Object)$$3.c, (Object)$$3.i(), (Object)$$2);
        }
        for (int $$4 = 0; $$4 < this.k.size(); ++$$4) {
            dji $$5 = this.k.get($$4);
            Integer $$6 = (Integer)$$1.get((Object)$$5.c, (Object)$$5.i());
            if ($$6 == null) continue;
            this.n.set($$4, $$0.n.get($$6));
            djc $$7 = $$0.q.get($$6);
            djc $$8 = this.q.get($$4);
            if (!($$7 instanceof djc.a)) continue;
            djc.a $$9 = (djc.a)$$7;
            if (!($$8 instanceof djc.a)) continue;
            djc.a $$10 = (djc.a)$$8;
            $$10.a($$9);
        }
    }

    public OptionalInt b(ccv $$0, int $$1) {
        for (int $$2 = 0; $$2 < this.k.size(); ++$$2) {
            dji $$3 = this.k.get($$2);
            if ($$3.c != $$0 || $$1 != $$3.i()) continue;
            return OptionalInt.of($$2);
        }
        return OptionalInt.empty();
    }

    public int j() {
        return this.t;
    }

    public int k() {
        this.t = this.t + 1 & Short.MAX_VALUE;
        return this.t;
    }
}

