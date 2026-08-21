/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class gua
extends gti<b> {
    private static final amo D = amo.b("container/creative_inventory/scroller");
    private static final amo E = amo.b("container/creative_inventory/scroller_disabled");
    private static final amo[] F = new amo[]{amo.b("container/creative_inventory/tab_top_unselected_1"), amo.b("container/creative_inventory/tab_top_unselected_2"), amo.b("container/creative_inventory/tab_top_unselected_3"), amo.b("container/creative_inventory/tab_top_unselected_4"), amo.b("container/creative_inventory/tab_top_unselected_5"), amo.b("container/creative_inventory/tab_top_unselected_6"), amo.b("container/creative_inventory/tab_top_unselected_7")};
    private static final amo[] G = new amo[]{amo.b("container/creative_inventory/tab_top_selected_1"), amo.b("container/creative_inventory/tab_top_selected_2"), amo.b("container/creative_inventory/tab_top_selected_3"), amo.b("container/creative_inventory/tab_top_selected_4"), amo.b("container/creative_inventory/tab_top_selected_5"), amo.b("container/creative_inventory/tab_top_selected_6"), amo.b("container/creative_inventory/tab_top_selected_7")};
    private static final amo[] H = new amo[]{amo.b("container/creative_inventory/tab_bottom_unselected_1"), amo.b("container/creative_inventory/tab_bottom_unselected_2"), amo.b("container/creative_inventory/tab_bottom_unselected_3"), amo.b("container/creative_inventory/tab_bottom_unselected_4"), amo.b("container/creative_inventory/tab_bottom_unselected_5"), amo.b("container/creative_inventory/tab_bottom_unselected_6"), amo.b("container/creative_inventory/tab_bottom_unselected_7")};
    private static final amo[] I = new amo[]{amo.b("container/creative_inventory/tab_bottom_selected_1"), amo.b("container/creative_inventory/tab_bottom_selected_2"), amo.b("container/creative_inventory/tab_bottom_selected_3"), amo.b("container/creative_inventory/tab_bottom_selected_4"), amo.b("container/creative_inventory/tab_bottom_selected_5"), amo.b("container/creative_inventory/tab_bottom_selected_6"), amo.b("container/creative_inventory/tab_bottom_selected_7")};
    private static final int J = 5;
    private static final int K = 9;
    private static final int L = 26;
    private static final int M = 32;
    private static final int N = 12;
    private static final int O = 15;
    static final cdk P = new cdk(45);
    private static final yh Q = yh.c("inventory.binSlot");
    private static dkk R = dkl.b();
    private float S;
    private boolean T;
    private gjn U;
    private @Nullable List<dji> V;
    private @Nullable dji W;
    private gtz X;
    private boolean Y;
    private boolean Z;
    private final Set<bef<dlp>> aa = new HashSet<bef<dlp>>();
    private final boolean ab;
    private final gud ac;

    public gua(hnh $$0, dgz $$1, boolean $$2) {
        super(new b($$0), $$0.gK(), yg.a);
        $$0.cn = this.w;
        this.e = 136;
        this.d = 195;
        this.ab = $$2;
        this.a($$0.b.G(), $$1, this.a($$0), $$0.ao().J_());
        this.ac = new gud(this);
    }

    private boolean a(ddm $$0) {
        return $$0.hi() && this.ab;
    }

    private void a(dgz $$0, boolean $$1, jf.a $$2) {
        hig $$3 = this.n.R();
        if (this.a($$3 != null ? $$3.G() : null, $$0, $$1, $$2)) {
            for (dkk $$4 : dkl.d()) {
                Collection<dlt> $$5 = $$4.l();
                if ($$4 != R) continue;
                if ($$4.k() == dkk.h.a && $$5.isEmpty()) {
                    this.a(dkl.b());
                    continue;
                }
                this.a($$5);
            }
        }
    }

    private boolean a(@Nullable hiw $$0, dgz $$1, boolean $$2, jf.a $$3) {
        if (!dkl.a($$1, $$2, $$3)) {
            return false;
        }
        if ($$0 != null) {
            List<dlt> $$4 = List.copyOf(dkl.e().l());
            $$0.a($$3, $$4);
            $$0.a($$4);
        }
        return true;
    }

    private void a(Collection<dlt> $$0) {
        int $$1 = ((b)this.w).a(this.S);
        ((b)this.w).m.clear();
        if (R.k() == dkk.h.d) {
            this.J();
        } else {
            ((b)this.w).m.addAll($$0);
        }
        this.S = ((b)this.w).e($$1);
        ((b)this.w).b(this.S);
    }

    @Override
    public void p() {
        super.p();
        hnh $$0 = this.n.s;
        if ($$0 != null) {
            this.a($$0.b.B(), this.a($$0), $$0.ao().J_());
            if (!$$0.gv()) {
                this.n.a(new gul($$0));
            }
        }
    }

    @Override
    protected void a(@Nullable dji $$0, int $$1, int $$2, dhu $$3) {
        if (this.a($$0)) {
            this.U.c(false);
            this.U.n(0);
        }
        boolean $$4 = $$3 == dhu.b;
        dhu dhu2 = $$3 = $$1 == -999 && $$3 == dhu.a ? dhu.e : $$3;
        if ($$3 == dhu.e && !this.n.s.gO()) {
            return;
        }
        this.a($$0, $$3);
        if ($$0 != null || R.k() == dkk.h.b || $$3 == dhu.f) {
            if ($$0 != null && !$$0.a(this.n.s)) {
                return;
            }
            if ($$0 == this.W && $$4) {
                for (int $$5 = 0; $$5 < this.n.s.cm.c().size(); ++$$5) {
                    this.n.s.cm.b($$5).f(dlt.l);
                    this.n.q.a(dlt.l, $$5);
                }
            } else if (R.k() == dkk.h.b) {
                if ($$0 == this.W) {
                    ((b)this.w).a(dlt.l);
                } else if ($$3 == dhu.e && $$0 != null && $$0.h()) {
                    dlt $$6 = $$0.a($$2 == 0 ? 1 : $$0.g().k());
                    dlt $$7 = $$0.g();
                    this.n.s.a($$6, true);
                    this.n.q.a($$6);
                    this.n.q.a($$7, ((c)$$0).a.d);
                } else if ($$3 == dhu.e && $$1 == -999 && !((b)this.w).g().f()) {
                    this.n.s.a(((b)this.w).g(), true);
                    this.n.q.a(((b)this.w).g());
                    ((b)this.w).a(dlt.l);
                } else {
                    this.n.s.cm.a($$0 == null ? $$1 : ((c)$$0).a.d, $$2, $$3, this.n.s);
                    this.n.s.cm.d();
                }
            } else if ($$3 != dhu.f && $$0.c == P) {
                dlt $$8 = ((b)this.w).g();
                dlt $$9 = $$0.g();
                if ($$3 == dhu.c) {
                    if (!$$9.f()) {
                        this.n.s.gK().a($$2, $$9.c($$9.k()));
                        this.n.s.cm.d();
                    }
                    return;
                }
                if ($$3 == dhu.d) {
                    if (((b)this.w).g().f() && $$0.h()) {
                        dlt $$10 = $$0.g();
                        ((b)this.w).a($$10.c($$10.k()));
                    }
                    return;
                }
                if ($$3 == dhu.e) {
                    if (!$$9.f()) {
                        dlt $$11 = $$9.c($$2 == 0 ? 1 : $$9.k());
                        this.n.s.a($$11, true);
                        this.n.q.a($$11);
                    }
                    return;
                }
                if (!$$8.f() && !$$9.f() && dlt.c($$8, $$9)) {
                    if ($$2 == 0) {
                        if ($$4) {
                            $$8.e($$8.k());
                        } else if ($$8.N() < $$8.k()) {
                            $$8.g(1);
                        }
                    } else {
                        $$8.h(1);
                    }
                } else if ($$9.f() || !$$8.f()) {
                    if ($$2 == 0) {
                        ((b)this.w).a(dlt.l);
                    } else if (!((b)this.w).g().f()) {
                        ((b)this.w).g().h(1);
                    }
                } else {
                    int $$12 = $$4 ? $$9.k() : $$9.N();
                    ((b)this.w).a($$9.c($$12));
                }
            } else if (this.w != null) {
                dlt $$13 = $$0 == null ? dlt.l : ((b)this.w).b($$0.d).g();
                ((b)this.w).a($$0 == null ? $$1 : $$0.d, $$2, $$3, this.n.s);
                if (dhi.d($$2) == 2) {
                    for (int $$14 = 0; $$14 < 9; ++$$14) {
                        this.n.q.a(((b)this.w).b(45 + $$14).g(), 36 + $$14);
                    }
                } else if ($$0 != null && ddl.f($$0.i()) && R.k() != dkk.h.b) {
                    if ($$3 == dhu.e && !$$13.f() && !((b)this.w).g().f()) {
                        int $$15 = $$2 == 0 ? 1 : $$13.N();
                        dlt $$16 = $$13.c($$15);
                        $$13.h($$15);
                        this.n.s.a($$16, true);
                        this.n.q.a($$16);
                    }
                    this.n.s.cm.d();
                }
            }
        } else if (!((b)this.w).g().f() && this.Z) {
            if (!this.n.s.gO()) {
                return;
            }
            if ($$2 == 0) {
                this.n.s.a(((b)this.w).g(), true);
                this.n.q.a(((b)this.w).g());
                ((b)this.w).a(dlt.l);
            }
            if ($$2 == 1) {
                dlt $$17 = ((b)this.w).g().a(1);
                this.n.s.a($$17, true);
                this.n.q.a($$17);
            }
        }
    }

    private boolean a(@Nullable dji $$0) {
        return $$0 != null && $$0.c == P;
    }

    @Override
    protected void bg_() {
        if (this.n.s.gv()) {
            super.bg_();
            this.U = new gjn(this.q, this.z + 82, this.A + 6, 80, this.q.b, yh.c("itemGroup.search"));
            this.U.k(50);
            this.U.d(false);
            this.U.j(false);
            this.U.l(-1);
            this.U.h(false);
            this.d(this.U);
            dkk $$0 = R;
            R = dkl.b();
            this.a($$0);
            this.n.s.cm.b(this.X);
            this.X = new gtz(this.n);
            this.n.s.cm.a(this.X);
            if (!R.i()) {
                this.a(dkl.b());
            }
        } else {
            this.n.a(new gul(this.n.s));
        }
    }

    @Override
    public void a(int $$0, int $$1) {
        int $$2 = ((b)this.w).a(this.S);
        String $$3 = this.U.a();
        this.b($$0, $$1);
        this.U.a($$3);
        if (!this.U.a().isEmpty()) {
            this.J();
        }
        this.S = ((b)this.w).e($$2);
        ((b)this.w).b(this.S);
    }

    @Override
    public void aZ_() {
        super.aZ_();
        if (this.n.s != null && this.n.s.gK() != null) {
            this.n.s.cm.b(this.X);
        }
    }

    @Override
    public boolean a(gyy $$0) {
        if (this.Y) {
            return false;
        }
        if (R.k() != dkk.h.d) {
            return false;
        }
        String $$1 = this.U.a();
        if (this.U.a($$0)) {
            if (!Objects.equals($$1, this.U.a())) {
                this.J();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(gzb $$0) {
        this.Y = false;
        if (R.k() != dkk.h.d) {
            if (this.n.k.F.a($$0)) {
                this.Y = true;
                this.a(dkl.e());
                return true;
            }
            return super.a($$0);
        }
        boolean $$1 = !this.a(this.y) || this.y.h();
        boolean $$2 = fyc.a($$0).e().isPresent();
        if ($$1 && $$2 && this.c($$0)) {
            this.Y = true;
            return true;
        }
        String $$3 = this.U.a();
        if (this.U.a($$0)) {
            if (!Objects.equals($$3, this.U.a())) {
                this.J();
            }
            return true;
        }
        if (this.U.aP_() && this.U.j() && !$$0.e()) {
            return true;
        }
        return super.a($$0);
    }

    @Override
    public boolean b(gzb $$0) {
        this.Y = false;
        return super.b($$0);
    }

    private void J() {
        ((b)this.w).m.clear();
        this.aa.clear();
        String $$0 = this.U.a();
        if ($$0.isEmpty()) {
            ((b)this.w).m.addAll(R.l());
        } else {
            hig $$1 = this.n.R();
            if ($$1 != null) {
                ipw<dlt> $$4;
                hiw $$2 = $$1.G();
                if ($$0.startsWith("#")) {
                    $$0 = $$0.substring(1);
                    ipw<dlt> $$3 = $$2.c();
                    this.a($$0);
                } else {
                    $$4 = $$2.d();
                }
                ((b)this.w).m.addAll($$4.search($$0.toLowerCase(Locale.ROOT)));
            }
        }
        this.S = 0.0f;
        ((b)this.w).b(0.0f);
    }

    private void a(String $$0) {
        Predicate<amo> $$5;
        int $$12 = $$0.indexOf(58);
        if ($$12 == -1) {
            Predicate<amo> $$22 = $$1 -> $$1.a().contains($$0);
        } else {
            String $$3 = $$0.substring(0, $$12).trim();
            String $$4 = $$0.substring($$12 + 1).trim();
            $$5 = $$2 -> $$2.b().contains($$3) && $$2.a().contains($$4);
        }
        mi.h.l().map(jh.c::h).filter($$1 -> $$5.test($$1.b())).forEach(this.aa::add);
    }

    @Override
    protected void d(gir $$0, int $$1, int $$2) {
        if (R.d()) {
            $$0.a(this.q, R.a(), 8, 6, -12566464, false);
        }
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if ($$0.t() == 0) {
            double $$2 = $$0.u() - (double)this.z;
            double $$3 = $$0.v() - (double)this.A;
            for (dkk $$4 : dkl.c()) {
                if (!this.a($$4, $$2, $$3)) continue;
                return true;
            }
            if (R.k() != dkk.h.b && this.b($$0.u(), $$0.v())) {
                this.T = this.K();
                return true;
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    public boolean b(gzc $$0) {
        if ($$0.t() == 0) {
            double $$1 = $$0.u() - (double)this.z;
            double $$2 = $$0.v() - (double)this.A;
            this.T = false;
            for (dkk $$3 : dkl.c()) {
                if (!this.a($$3, $$1, $$2)) continue;
                this.a($$3);
                return true;
            }
        }
        return super.b($$0);
    }

    private boolean K() {
        return R.e() && ((b)this.w).m();
    }

    private void a(dkk $$0) {
        dkk $$1 = R;
        R = $$0;
        this.B.clear();
        ((b)this.w).m.clear();
        this.o();
        if (R.k() == dkk.h.c) {
            gfe $$2 = this.n.aJ();
            for (int $$3 = 0; $$3 < 9; ++$$3) {
                hnk $$4 = $$2.a($$3);
                if ($$4.a()) {
                    for (int $$5 = 0; $$5 < 9; ++$$5) {
                        if ($$5 == $$3) {
                            dlt $$6 = new dlt(dlx.sA);
                            $$6.b(ki.v, bhr.a);
                            yh $$7 = this.n.k.R[$$3].n();
                            yh $$8 = this.n.k.S.n();
                            $$6.b(ki.k, yh.a("inventory.hotbarInfo", $$8, $$7));
                            ((b)this.w).m.add($$6);
                            continue;
                        }
                        ((b)this.w).m.add(dlt.l);
                    }
                    continue;
                }
                ((b)this.w).m.addAll($$4.a(this.n.r.J_()));
            }
        } else if (R.k() == dkk.h.a) {
            ((b)this.w).m.addAll(R.l());
        }
        if (R.k() == dkk.h.b) {
            dim $$9 = this.n.s.cm;
            if (this.V == null) {
                this.V = ImmutableList.copyOf((Collection)((b)this.w).k);
            }
            ((b)this.w).k.clear();
            for (int $$10 = 0; $$10 < $$9.k.size(); ++$$10) {
                int $$25;
                int $$23;
                if ($$10 >= 5 && $$10 < 9) {
                    int $$11 = $$10 - 5;
                    int $$12 = $$11 / 2;
                    int $$13 = $$11 % 2;
                    int $$14 = 54 + $$12 * 54;
                    int $$15 = 6 + $$13 * 27;
                } else if ($$10 >= 0 && $$10 < 5) {
                    int $$16 = -2000;
                    int $$17 = -2000;
                } else if ($$10 == 45) {
                    int $$18 = 35;
                    int $$19 = 20;
                } else {
                    int $$20 = $$10 - 9;
                    int $$21 = $$20 % 9;
                    int $$22 = $$20 / 9;
                    $$23 = 9 + $$21 * 18;
                    if ($$10 >= 36) {
                        int $$24 = 112;
                    } else {
                        $$25 = 54 + $$22 * 18;
                    }
                }
                c $$26 = new c($$9.k.get($$10), $$10, $$23, $$25);
                ((b)this.w).k.add($$26);
            }
            this.W = new dji(P, 0, 173, 112);
            ((b)this.w).k.add(this.W);
        } else if ($$1.k() == dkk.h.b) {
            ((b)this.w).k.clear();
            ((b)this.w).k.addAll(this.V);
            this.V = null;
        }
        if (R.k() == dkk.h.d) {
            this.U.j(true);
            this.U.i(false);
            this.U.b(true);
            if ($$1 != $$0) {
                this.U.a("");
            }
            this.J();
        } else {
            this.U.j(false);
            this.U.i(true);
            this.U.b(false);
            this.U.a("");
        }
        this.S = 0.0f;
        ((b)this.w).b(0.0f);
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (super.a($$0, $$1, $$2, $$3)) {
            return true;
        }
        if (!this.K()) {
            return false;
        }
        this.S = ((b)this.w).a(this.S, $$3);
        ((b)this.w).b(this.S);
        return true;
    }

    @Override
    protected boolean a(double $$0, double $$1, int $$2, int $$3) {
        boolean $$4 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.d) || $$1 >= (double)($$3 + this.e);
        this.Z = $$4 && !this.a(R, $$0, $$1);
        return this.Z;
    }

    protected boolean b(double $$0, double $$1) {
        int $$2 = this.z;
        int $$3 = this.A;
        int $$4 = $$2 + 175;
        int $$5 = $$3 + 18;
        int $$6 = $$4 + 14;
        int $$7 = $$5 + 112;
        return $$0 >= (double)$$4 && $$1 >= (double)$$5 && $$0 < (double)$$6 && $$1 < (double)$$7;
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        if (this.T) {
            int $$3 = this.A + 18;
            int $$4 = $$3 + 112;
            this.S = ((float)$$0.v() - (float)$$3 - 7.5f) / ((float)($$4 - $$3) - 15.0f);
            this.S = bgj.a(this.S, 0.0f, 1.0f);
            ((b)this.w).b(this.S);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        this.ac.a($$0, $$1, $$2);
        super.a($$0, $$1, $$2, $$3);
        for (dkk $$4 : dkl.c()) {
            if (this.a($$0, $$4, $$1, $$2)) break;
        }
        if (this.W != null && R.k() == dkk.h.b && this.a(this.W.e, this.W.f, 16, 16, $$1, $$2)) {
            $$0.a(this.q, Q, $$1, $$2);
        }
        this.c($$0, $$1, $$2);
    }

    @Override
    public boolean D() {
        return this.ac.a();
    }

    @Override
    public List<yh> a(dlt $$0) {
        boolean $$1 = this.y != null && this.y instanceof a;
        boolean $$22 = R.k() == dkk.h.a;
        boolean $$3 = R.k() == dkk.h.d;
        dnj.a $$4 = this.n.k.k ? dnj.a.b : dnj.a.a;
        dnj.a $$5 = $$1 ? $$4.c() : $$4;
        List<yh> $$6 = $$0.a(dlp.b.a(this.n.r), (ddm)this.n.s, $$5);
        if ($$6.isEmpty()) {
            return $$6;
        }
        if (!$$22 || !$$1) {
            ArrayList $$7 = Lists.newArrayList($$6);
            if ($$3 && $$1) {
                this.aa.forEach($$2 -> {
                    if ($$0.a((bef<dlp>)$$2)) {
                        $$7.add(1, yh.b("#" + String.valueOf($$2.b())).a(l.f));
                    }
                });
            }
            int $$8 = 1;
            for (dkk $$9 : dkl.c()) {
                if ($$9.k() == dkk.h.d || !$$9.a($$0)) continue;
                $$7.add($$8++, $$9.a().f().a(l.j));
            }
            return $$7;
        }
        return $$6;
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        for (dkk $$4 : dkl.c()) {
            if ($$4 == R) continue;
            this.a($$0, $$2, $$3, $$4);
        }
        $$0.a(hpa.at, R.c(), this.z, this.A, 0.0f, 0.0f, this.d, this.e, 256, 256);
        if (this.b((double)$$2, (double)$$3) && this.K()) {
            $$0.a(this.T ? fyn.e : fyn.d);
        }
        this.U.a($$0, $$2, $$3, $$1);
        int $$5 = this.z + 175;
        int $$6 = this.A + 18;
        int $$7 = $$6 + 112;
        if (R.e()) {
            amo $$8 = this.K() ? D : E;
            $$0.a(hpa.at, $$8, $$5, $$6 + (int)((float)($$7 - $$6 - 17) * this.S), 12, 15);
        }
        this.a($$0, $$2, $$3, R);
        if (R.k() == dkk.h.b) {
            gul.a($$0, this.z + 73, this.A + 6, this.z + 105, this.A + 49, 20, 0.0625f, $$2, $$3, this.n.s);
        }
    }

    private int b(dkk $$0) {
        int $$1 = $$0.f();
        int $$2 = 27;
        int $$3 = 27 * $$1;
        if ($$0.j()) {
            $$3 = this.d - 27 * (7 - $$1) + 1;
        }
        return $$3;
    }

    private int c(dkk $$0) {
        int $$1 = 0;
        $$1 = $$0.g() == dkk.f.a ? ($$1 -= 32) : ($$1 += this.e);
        return $$1;
    }

    protected boolean a(dkk $$0, double $$1, double $$2) {
        int $$3 = this.b($$0);
        int $$4 = this.c($$0);
        return $$1 >= (double)$$3 && $$1 <= (double)($$3 + 26) && $$2 >= (double)$$4 && $$2 <= (double)($$4 + 32);
    }

    protected boolean a(gir $$0, dkk $$1, int $$2, int $$3) {
        int $$5;
        int $$4 = this.b($$1);
        if (this.a($$4 + 3, ($$5 = this.c($$1)) + 3, 21, 27, $$2, $$3)) {
            $$0.a(this.q, $$1.a(), $$2, $$3);
            return true;
        }
        return false;
    }

    protected void a(gir $$0, int $$1, int $$2, dkk $$3) {
        amo[] $$10;
        boolean $$4 = $$3 == R;
        boolean $$5 = $$3.g() == dkk.f.a;
        int $$6 = $$3.f();
        int $$7 = this.z + this.b($$3);
        int $$8 = this.A - ($$5 ? 28 : -(this.e - 4));
        if ($$5) {
            amo[] $$9 = $$4 ? G : F;
        } else {
            amo[] amoArray = $$10 = $$4 ? I : H;
        }
        if (!$$4 && $$1 > $$7 && $$2 > $$8 && $$1 < $$7 + 26 && $$2 < $$8 + 32) {
            $$0.a(fyn.d);
        }
        $$0.a(hpa.at, $$10[bgj.a($$6, 0, $$10.length)], $$7, $$8, 26, 32);
        int $$11 = $$7 + 13 - 8;
        int $$12 = $$8 + 16 - 8 + ($$5 ? 1 : -1);
        $$0.a($$3.b(), $$11, $$12);
    }

    public boolean I() {
        return R.k() == dkk.h.b;
    }

    public static void a(gfj $$0, int $$1, boolean $$2, boolean $$3) {
        hnh $$4 = $$0.s;
        jr $$5 = $$4.ao().J_();
        gfe $$6 = $$0.aJ();
        hnk $$7 = $$6.a($$1);
        if ($$2) {
            List<dlt> $$8 = $$7.a($$5);
            for (int $$9 = 0; $$9 < ddl.i(); ++$$9) {
                dlt $$10 = $$8.get($$9);
                $$4.gK().a($$9, $$10);
                $$0.q.a($$10, 36 + $$9);
            }
            $$4.cm.d();
        } else if ($$3) {
            $$7.a($$4.gK(), $$5);
            yh $$11 = $$0.k.R[$$1].n();
            yh $$12 = $$0.k.T.n();
            yw $$13 = yh.a("inventory.hotbarSaved", $$12, $$11);
            $$0.j.a($$13, false);
            $$0.aZ().d($$13);
            $$6.a();
        }
    }

    public static class b
    extends dhi {
        public final jm<dlt> m = jm.a();
        private final dhi n;

        public b(ddm $$0) {
            super(null, 0);
            this.n = $$0.cm;
            ddl $$1 = $$0.gK();
            for (int $$2 = 0; $$2 < 5; ++$$2) {
                for (int $$3 = 0; $$3 < 9; ++$$3) {
                    this.a(new a(P, $$2 * 9 + $$3, 9 + $$3 * 18, 18 + $$2 * 18));
                }
            }
            this.a($$1, 9, 112);
            this.b(0.0f);
        }

        @Override
        public boolean b(ddm $$0) {
            return true;
        }

        protected int l() {
            return bgj.f(this.m.size(), 9) - 5;
        }

        protected int a(float $$0) {
            return Math.max((int)((double)($$0 * (float)this.l()) + 0.5), 0);
        }

        protected float e(int $$0) {
            return bgj.a((float)$$0 / (float)this.l(), 0.0f, 1.0f);
        }

        protected float a(float $$0, double $$1) {
            return bgj.a($$0 - (float)($$1 / (double)this.l()), 0.0f, 1.0f);
        }

        public void b(float $$0) {
            int $$1 = this.a($$0);
            for (int $$2 = 0; $$2 < 5; ++$$2) {
                for (int $$3 = 0; $$3 < 9; ++$$3) {
                    int $$4 = $$3 + ($$2 + $$1) * 9;
                    if ($$4 >= 0 && $$4 < this.m.size()) {
                        P.a($$3 + $$2 * 9, this.m.get($$4));
                        continue;
                    }
                    P.a($$3 + $$2 * 9, dlt.l);
                }
            }
        }

        public boolean m() {
            return this.m.size() > 45;
        }

        @Override
        public dlt b(ddm $$0, int $$1) {
            dji $$2;
            if ($$1 >= this.k.size() - 9 && $$1 < this.k.size() && ($$2 = (dji)this.k.get($$1)) != null && $$2.h()) {
                $$2.e(dlt.l);
            }
            return dlt.l;
        }

        @Override
        public boolean a(dlt $$0, dji $$1) {
            return $$1.c != P;
        }

        @Override
        public boolean b(dji $$0) {
            return $$0.c != P;
        }

        @Override
        public dlt g() {
            return this.n.g();
        }

        @Override
        public void a(dlt $$0) {
            this.n.a($$0);
        }
    }

    static class c
    extends dji {
        final dji a;

        public c(dji $$0, int $$1, int $$2, int $$3) {
            super($$0.c, $$1, $$2, $$3);
            this.a = $$0;
        }

        @Override
        public void a(ddm $$0, dlt $$1) {
            this.a.a($$0, $$1);
        }

        @Override
        public boolean a(dlt $$0) {
            return this.a.a($$0);
        }

        @Override
        public dlt g() {
            return this.a.g();
        }

        @Override
        public boolean h() {
            return this.a.h();
        }

        @Override
        public void a(dlt $$0, dlt $$1) {
            this.a.a($$0, $$1);
        }

        @Override
        public void f(dlt $$0) {
            this.a.f($$0);
        }

        @Override
        public void d() {
            this.a.d();
        }

        @Override
        public int a() {
            return this.a.a();
        }

        @Override
        public int b_(dlt $$0) {
            return this.a.b_($$0);
        }

        @Override
        public @Nullable amo c() {
            return this.a.c();
        }

        @Override
        public dlt a(int $$0) {
            return this.a.a($$0);
        }

        @Override
        public boolean b() {
            return this.a.b();
        }

        @Override
        public boolean a(ddm $$0) {
            return this.a.a($$0);
        }
    }

    static class a
    extends dji {
        public a(ccv $$0, int $$1, int $$2, int $$3) {
            super($$0, $$1, $$2, $$3);
        }

        @Override
        public boolean a(ddm $$0) {
            dlt $$1 = this.g();
            if (super.a($$0) && !$$1.f()) {
                return $$1.a($$0.ao().Q()) && !$$1.c(ki.v);
            }
            return $$1.f();
        }
    }
}

