/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class hxs<T extends chl, S extends ieh, M extends gzm<? super S>>
extends hwp<T, S>
implements hyq<S, M> {
    private static final float a = 0.1f;
    protected M f;
    protected final ihk g;
    protected final List<ibj<S, M>> h = Lists.newArrayList();

    public hxs(hwq.a $$0, M $$1, float $$2) {
        super($$0);
        this.g = $$0.b();
        this.f = $$1;
        this.d = $$2;
    }

    protected final boolean a(ibj<S, M> $$0) {
        return this.h.add($$0);
    }

    @Override
    public M c() {
        return this.f;
    }

    @Override
    protected fth a(T $$0) {
        fth $$1 = super.a($$0);
        if (((chl)$$0).a(cgv.f).a(dlx.wC)) {
            float $$2 = 0.5f;
            return $$1.c(0.5, 0.5, 0.5);
        }
        return $$1;
    }

    @Override
    public void a(S $$0, fzm $$1, hpo $$2, ikp $$3) {
        iz $$4;
        $$1.a();
        if (((ieh)$$0).a(chx.c) && ($$4 = ((ieh)$$0).aJ) != null) {
            float $$5 = ((ieh)$$0).O - 0.1f;
            $$1.a((float)(-$$4.j()) * $$5, 0.0f, (float)(-$$4.l()) * $$5);
        }
        float $$6 = ((ieh)$$0).az;
        $$1.b($$6, $$6, $$6);
        this.a($$0, $$1, ((ieh)$$0).at, $$6);
        $$1.b(-1.0f, -1.0f, 1.0f);
        this.a($$0, $$1);
        $$1.a(0.0f, -1.501f, 0.0f);
        boolean $$7 = this.d($$0);
        boolean $$8 = !$$7 && !((ieh)$$0).aI;
        ijs $$9 = this.a($$0, $$7, $$8, ((idf)$$0).d());
        if ($$9 != null) {
            int $$10 = hxs.a($$0, this.c($$0));
            int $$11 = $$8 ? 0x26FFFFFF : -1;
            int $$12 = bel.a($$11, this.f($$0));
            $$2.a(this.f, $$0, $$1, $$9, ((ieh)$$0).T, $$10, $$12, (ilp)null, ((ieh)$$0).U, (igi.a)null);
        }
        if (this.e($$0) && !this.h.isEmpty()) {
            ((gzp)this.f).a($$0);
            for (ibj<S, M> $$13 : this.h) {
                $$13.a($$1, $$2, ((ieh)$$0).T, $$0, ((ieh)$$0).au, ((ieh)$$0).av);
            }
        }
        $$1.b();
        super.a($$0, $$1, $$2, $$3);
    }

    protected boolean e(S $$0) {
        return true;
    }

    protected int f(S $$0) {
        return -1;
    }

    public abstract amo b(S var1);

    protected @Nullable ijs a(S $$0, boolean $$1, boolean $$2, boolean $$3) {
        amo $$4 = this.b($$0);
        if ($$2) {
            return ijt.i($$4);
        }
        if ($$1) {
            return ((gzp)this.f).a($$4);
        }
        if ($$3) {
            return ijt.s($$4);
        }
        return null;
    }

    public static int a(ieh $$0, float $$1) {
        return ilg.a(ilg.a($$1), ilg.a($$0.aH));
    }

    protected boolean d(S $$0) {
        return !((ieh)$$0).Q;
    }

    private static float a(iz $$0) {
        switch ($$0) {
            case d: {
                return 90.0f;
            }
            case e: {
                return 0.0f;
            }
            case c: {
                return 270.0f;
            }
            case f: {
                return 180.0f;
            }
        }
        return 0.0f;
    }

    protected boolean a(S $$0) {
        return ((ieh)$$0).aD;
    }

    protected void a(S $$0, fzm $$1, float $$2, float $$3) {
        if (this.a($$0)) {
            $$2 += (float)(Math.cos((float)bgj.b(((ieh)$$0).L) * 3.25f) * Math.PI * (double)0.4f);
        }
        if (!((ieh)$$0).a(chx.c)) {
            $$1.a((Quaternionfc)a.d.rotationDegrees(180.0f - $$2));
        }
        if (((ieh)$$0).aw > 0.0f) {
            float $$4 = (((ieh)$$0).aw - 1.0f) / 20.0f * 1.6f;
            if (($$4 = bgj.a($$4)) > 1.0f) {
                $$4 = 1.0f;
            }
            $$1.a((Quaternionfc)a.f.rotationDegrees($$4 * this.bm_()));
        } else if (((ieh)$$0).aG) {
            $$1.a((Quaternionfc)a.b.rotationDegrees(-90.0f - ((ieh)$$0).av));
            $$1.a((Quaternionfc)a.d.rotationDegrees(((ieh)$$0).L * -75.0f));
        } else if (((ieh)$$0).a(chx.c)) {
            iz $$5 = ((ieh)$$0).aJ;
            float $$6 = $$5 != null ? hxs.a($$5) : $$2;
            $$1.a((Quaternionfc)a.d.rotationDegrees($$6));
            $$1.a((Quaternionfc)a.f.rotationDegrees(this.bm_()));
            $$1.a((Quaternionfc)a.d.rotationDegrees(270.0f));
        } else if (((ieh)$$0).aC) {
            $$1.a(0.0f, (((ieh)$$0).N + 0.1f) / $$3, 0.0f);
            $$1.a((Quaternionfc)a.f.rotationDegrees(180.0f));
        }
    }

    protected float bm_() {
        return 90.0f;
    }

    @Override
    protected float c(S $$0) {
        return 0.0f;
    }

    @Override
    protected void a(S $$0, fzm $$1) {
    }

    @Override
    protected boolean a(T $$0, double $$1) {
        boolean $$5;
        if (((cgk)$$0).cx()) {
            float $$2 = 32.0f;
            if ($$1 >= 1024.0) {
                return false;
            }
        }
        gfj $$3 = gfj.V();
        hnh $$4 = $$3.s;
        boolean bl2 = $$5 = !((cgk)$$0).e($$4);
        if ($$0 != $$4) {
            fum $$6 = ((cgk)$$0).cI();
            fum $$7 = $$4.cI();
            if ($$6 != null) {
                fut.b $$8 = ((fut)$$6).k();
                switch ($$8) {
                    case a: {
                        return $$5;
                    }
                    case b: {
                        return false;
                    }
                    case c: {
                        return $$7 == null ? $$5 : $$6.a($$7) && (((fut)$$6).j() || $$5);
                    }
                    case d: {
                        return $$7 == null ? $$5 : !$$6.a($$7) && $$5;
                    }
                }
                return true;
            }
        }
        return gfj.S() && $$0 != $$3.au() && $$5 && !((cgk)$$0).cr();
    }

    @Override
    public boolean b(T $$0) {
        yh $$1 = ((cgk)$$0).as();
        return $$1 != null && hxs.a($$1.getString());
    }

    protected static boolean a(String $$0) {
        return "Dinnerbone".equals($$0) || "Grumm".equals($$0);
    }

    protected float g(S $$0) {
        return super.c($$0) * ((ieh)$$0).az;
    }

    @Override
    public void a(T $$0, S $$1, float $$2) {
        dkb $$6;
        super.a($$0, $$1, $$2);
        float $$3 = bgj.i($$2, ((chl)$$0).bF, ((chl)$$0).bE);
        ((ieh)$$1).at = hxs.a($$0, $$3, $$2);
        ((ieh)$$1).au = bgj.f($$3 - ((ieh)$$1).at);
        ((ieh)$$1).av = ((cgk)$$0).k($$2);
        ((ieh)$$1).aC = this.b($$0);
        if (((ieh)$$1).aC) {
            ((ieh)$$1).av *= -1.0f;
            ((ieh)$$1).au *= -1.0f;
        }
        if (!((cgk)$$0).cq() && ((chl)$$0).cb()) {
            ((ieh)$$1).ax = ((chl)$$0).bB.c($$2);
            ((ieh)$$1).ay = ((chl)$$0).bB.b($$2);
        } else {
            ((ieh)$$1).ax = 0.0f;
            ((ieh)$$1).ay = 0.0f;
        }
        cgk cgk2 = ((cgk)$$0).dz();
        if (cgk2 instanceof chl) {
            chl $$4 = (chl)cgk2;
            ((ieh)$$1).aM = $$4.bB.c($$2);
        } else {
            ((ieh)$$1).aM = ((ieh)$$1).ax;
        }
        ((ieh)$$1).az = ((chl)$$0).eF();
        ((ieh)$$1).aA = ((chl)$$0).eE();
        ((ieh)$$1).aK = ((cgk)$$0).aF();
        ((ieh)$$1).aJ = ((chl)$$0).gt();
        if (((ieh)$$1).aJ != null) {
            ((ieh)$$1).O = ((cgk)$$0).e(chx.a);
        }
        ((ieh)$$1).aD = ((cgk)$$0).cO();
        ((ieh)$$1).aE = ((chl)$$0).e_();
        ((ieh)$$1).aF = ((cgk)$$0).by();
        ((ieh)$$1).aG = ((chl)$$0).fW();
        ((ieh)$$1).aB = ((chl)$$0).z($$2);
        ((ieh)$$1).aH = ((chl)$$0).bu > 0 || ((chl)$$0).bw > 0;
        dlt $$5 = ((chl)$$0).a(cgv.f);
        dgw dgw2 = $$5.h();
        if (dgw2 instanceof dkb && (dgw2 = ($$6 = (dkb)dgw2).c()) instanceof dym) {
            dym $$7 = (dym)dgw2;
            ((ieh)$$1).aN = $$7.b();
            ((ieh)$$1).aO = $$5.a(ki.ar);
            ((ieh)$$1).aL.b();
        } else {
            ((ieh)$$1).aN = null;
            ((ieh)$$1).aO = null;
            if (!iay.a($$5, cgv.f)) {
                this.g.a(((ieh)$$1).aL, $$5, dlr.f, (chl)$$0);
            } else {
                ((ieh)$$1).aL.b();
            }
        }
        ((ieh)$$1).aw = ((chl)$$0).bw > 0 ? (float)((chl)$$0).bw + $$2 : 0.0f;
        gfj $$8 = gfj.V();
        ((ieh)$$1).aI = ((ieh)$$1).Q && ((cgk)$$0).e($$8.s);
    }

    private static float a(chl $$0, float $$1, float $$2) {
        cgk cgk2 = $$0.dz();
        if (cgk2 instanceof chl) {
            chl $$3 = (chl)cgk2;
            float $$4 = bgj.i($$2, $$3.bD, $$3.bC);
            float $$5 = 85.0f;
            float $$6 = bgj.a(bgj.f($$1 - $$4), -85.0f, 85.0f);
            $$4 = $$1 - $$6;
            if (Math.abs($$6) > 50.0f) {
                $$4 += $$6 * 0.2f;
            }
            return $$4;
        }
        return bgj.i($$2, $$0.bD, $$0.bC);
    }

    @Override
    protected /* synthetic */ float c(idf idf2) {
        return this.g((ieh)idf2);
    }
}

