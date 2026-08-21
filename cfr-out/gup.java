/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gup
extends gti<diq> {
    private static final amo D = amo.b("container/slot/banner");
    private static final amo E = amo.b("container/slot/dye");
    private static final amo F = amo.b("container/slot/banner_pattern");
    private static final amo G = amo.b("container/loom/scroller");
    private static final amo H = amo.b("container/loom/scroller_disabled");
    private static final amo I = amo.b("container/loom/pattern_selected");
    private static final amo J = amo.b("container/loom/pattern_highlighted");
    private static final amo K = amo.b("container/loom/pattern");
    private static final amo L = amo.b("container/loom/error");
    private static final amo M = amo.b("textures/gui/container/loom.png");
    private static final int N = 4;
    private static final int O = 4;
    private static final int P = 12;
    private static final int Q = 15;
    private static final int R = 14;
    private static final int S = 56;
    private static final int T = 60;
    private static final int U = 13;
    private static final float V = 64.0f;
    private static final float W = 21.0f;
    private static final float X = 40.0f;
    private hgi Y;
    private @Nullable ekr Z;
    private dlt aa = dlt.l;
    private dlt ab = dlt.l;
    private dlt ac = dlt.l;
    private boolean ad;
    private boolean ae;
    private float af;
    private boolean ag;
    private int ah;

    public gup(diq $$0, ddl $$1, yh $$2) {
        super($$0, $$1, $$2);
        $$0.a(this::J);
        this.t -= 2;
    }

    @Override
    protected void bg_() {
        super.bg_();
        hdg $$0 = this.n.aV().a(hdf.p);
        this.Y = new hgi($$0);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.c($$0, $$1, $$2);
    }

    private int I() {
        return bgj.f(((diq)this.w).l().size(), 4);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        int $$4 = this.z;
        int $$5 = this.A;
        $$0.a(hpa.at, M, $$4, $$5, 0.0f, 0.0f, this.d, this.e, 256, 256);
        dji $$6 = ((diq)this.w).n();
        dji $$7 = ((diq)this.w).o();
        dji $$8 = ((diq)this.w).p();
        dji $$9 = ((diq)this.w).q();
        if (!$$6.h()) {
            $$0.a(hpa.at, D, $$4 + $$6.e, $$5 + $$6.f, 16, 16);
        }
        if (!$$7.h()) {
            $$0.a(hpa.at, E, $$4 + $$7.e, $$5 + $$7.f, 16, 16);
        }
        if (!$$8.h()) {
            $$0.a(hpa.at, F, $$4 + $$8.e, $$5 + $$8.f, 16, 16);
        }
        int $$10 = (int)(41.0f * this.af);
        amo $$11 = this.ad ? G : H;
        int $$12 = $$4 + 119;
        int $$13 = $$5 + 13 + $$10;
        $$0.a(hpa.at, $$11, $$12, $$13, 12, 15);
        if ($$2 >= $$12 && $$2 < $$12 + 12 && $$3 >= $$13 && $$3 < $$13 + 15) {
            $$0.a(this.ag ? fyn.e : fyn.d);
        }
        if (this.Z != null && !this.ae) {
            dkr $$14 = ((djz)$$9.g().h()).a();
            int $$15 = $$4 + 141;
            int $$16 = $$5 + 8;
            $$0.a(this.Y, $$14, this.Z, $$15, $$16, $$15 + 20, $$16 + 40);
        } else if (this.ae) {
            $$0.a(hpa.at, L, $$4 + $$9.e - 5, $$5 + $$9.f - 5, 26, 26);
        }
        if (this.ad) {
            int $$17 = $$4 + 60;
            int $$18 = $$5 + 13;
            List<jd<ekq>> $$19 = ((diq)this.w).l();
            block0: for (int $$20 = 0; $$20 < 4; ++$$20) {
                for (int $$21 = 0; $$21 < 4; ++$$21) {
                    amo $$31;
                    boolean $$27;
                    int $$22 = $$20 + this.ah;
                    int $$23 = $$22 * 4 + $$21;
                    if ($$23 >= $$19.size()) break block0;
                    int $$24 = $$17 + $$21 * 14;
                    int $$25 = $$18 + $$20 * 14;
                    jd<ekq> $$26 = $$19.get($$23);
                    boolean bl2 = $$27 = $$2 >= $$24 && $$3 >= $$25 && $$2 < $$24 + 14 && $$3 < $$25 + 14;
                    if ($$23 == ((diq)this.w).m()) {
                        amo $$28 = I;
                    } else if ($$27) {
                        amo $$29 = J;
                        dkr $$30 = ((dks)this.ab.h()).a();
                        $$0.a(yh.c($$26.a().b() + "." + $$30.b()), $$2, $$3);
                        $$0.a(fyn.d);
                    } else {
                        $$31 = K;
                    }
                    $$0.a(hpa.at, $$31, $$24, $$25, 14, 14);
                    ilp $$32 = $$0.a(hpj.a($$26));
                    this.a($$0, $$24, $$25, $$32);
                }
            }
        }
        gfj.V().i.t().a(fyd.a.c);
    }

    private void a(gir $$0, int $$1, int $$2, ilp $$3) {
        $$0.e().pushMatrix();
        $$0.e().translate((float)($$1 + 4), (float)($$2 + 2));
        float $$4 = $$3.c();
        float $$5 = $$4 + ($$3.d() - $$3.c()) * 21.0f / 64.0f;
        float $$6 = $$3.g() - $$3.f();
        float $$7 = $$3.f() + $$6 / 64.0f;
        float $$8 = $$7 + $$6 * 40.0f / 64.0f;
        int $$9 = 5;
        int $$10 = 10;
        $$0.a(0, 0, 5, 10, dkr.h.d());
        $$0.a($$3.h(), 0, 0, 5, 10, $$4, $$5, $$7, $$8);
        $$0.e().popMatrix();
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if (this.ad) {
            int $$2 = this.z + 60;
            int $$3 = this.A + 13;
            for (int $$4 = 0; $$4 < 4; ++$$4) {
                for (int $$5 = 0; $$5 < 4; ++$$5) {
                    double $$6 = $$0.u() - (double)($$2 + $$5 * 14);
                    double $$7 = $$0.v() - (double)($$3 + $$4 * 14);
                    int $$8 = $$4 + this.ah;
                    int $$9 = $$8 * 4 + $$5;
                    if (!($$6 >= 0.0) || !($$7 >= 0.0) || !($$6 < 14.0) || !($$7 < 14.0) || !((diq)this.w).a((ddm)this.n.s, $$9)) continue;
                    gfj.V().ap().a(iph.a(bda.DK, 1.0f));
                    this.n.q.a(((diq)this.w).l, $$9);
                    return true;
                }
            }
            $$2 = this.z + 119;
            $$3 = this.A + 9;
            if ($$0.u() >= (double)$$2 && $$0.u() < (double)($$2 + 12) && $$0.v() >= (double)$$3 && $$0.v() < (double)($$3 + 56)) {
                this.ag = true;
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        int $$3 = this.I() - 4;
        if (this.ag && this.ad && $$3 > 0) {
            int $$4 = this.A + 13;
            int $$5 = $$4 + 56;
            this.af = ((float)$$0.v() - (float)$$4 - 7.5f) / ((float)($$5 - $$4) - 15.0f);
            this.af = bgj.a(this.af, 0.0f, 1.0f);
            this.ah = Math.max((int)((double)(this.af * (float)$$3) + 0.5), 0);
            return true;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean b(gzc $$0) {
        this.ag = false;
        return super.b($$0);
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (super.a($$0, $$1, $$2, $$3)) {
            return true;
        }
        int $$4 = this.I() - 4;
        if (this.ad && $$4 > 0) {
            float $$5 = (float)$$3 / (float)$$4;
            this.af = bgj.a(this.af - $$5, 0.0f, 1.0f);
            this.ah = Math.max((int)(this.af * (float)$$4 + 0.5f), 0);
        }
        return true;
    }

    @Override
    protected boolean a(double $$0, double $$1, int $$2, int $$3) {
        return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.d) || $$1 >= (double)($$3 + this.e);
    }

    private void J() {
        dlt $$0 = ((diq)this.w).q().g();
        this.Z = $$0.f() ? null : $$0.a(ki.at, ekr.a);
        dlt $$1 = ((diq)this.w).n().g();
        dlt $$2 = ((diq)this.w).o().g();
        dlt $$3 = ((diq)this.w).p().g();
        ekr $$4 = $$1.a(ki.at, ekr.a);
        boolean bl2 = this.ae = $$4.b().size() >= 6;
        if (this.ae) {
            this.Z = null;
        }
        if (!(dlt.a($$1, this.aa) && dlt.a($$2, this.ab) && dlt.a($$3, this.ac))) {
            boolean bl3 = this.ad = !$$1.f() && !$$2.f() && !this.ae && !((diq)this.w).l().isEmpty();
        }
        if (this.ah >= this.I()) {
            this.ah = 0;
            this.af = 0.0f;
        }
        this.aa = $$1.v();
        this.ab = $$2.v();
        this.ac = $$3.v();
    }
}

