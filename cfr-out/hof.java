/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.MoreObjects
 *  org.joml.Quaternionfc
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import org.joml.Quaternionfc;

public class hof {
    private static final ijs a = ijt.u(amo.b("textures/map/map_background.png"));
    private static final ijs b = ijt.u(amo.b("textures/map/map_background_checkerboard.png"));
    private static final float c = -0.4f;
    private static final float d = 0.2f;
    private static final float e = -0.2f;
    private static final float f = -0.6f;
    private static final float g = 0.56f;
    private static final float h = -0.52f;
    private static final float i = -0.72f;
    private static final float j = 45.0f;
    private static final float k = -80.0f;
    private static final float l = -20.0f;
    private static final float m = -20.0f;
    private static final float n = 10.0f;
    private static final float o = 90.0f;
    private static final float p = 30.0f;
    private static final float q = 0.6f;
    private static final float r = -0.5f;
    private static final float s = 0.0f;
    private static final double t = 27.0;
    private static final float u = 0.8f;
    private static final float v = 0.1f;
    private static final float w = -0.3f;
    private static final float x = 0.4f;
    private static final float y = -0.4f;
    private static final float z = 70.0f;
    private static final float A = -20.0f;
    private static final float B = -0.6f;
    private static final float C = 0.8f;
    private static final float D = 0.8f;
    private static final float E = -0.75f;
    private static final float F = -0.9f;
    private static final float G = 45.0f;
    private static final float H = -1.0f;
    private static final float I = 3.6f;
    private static final float J = 3.5f;
    private static final float K = 5.6f;
    private static final int L = 200;
    private static final int M = -135;
    private static final int N = 120;
    private static final float O = -0.4f;
    private static final float P = -0.2f;
    private static final float Q = 0.0f;
    private static final float R = 0.04f;
    private static final float S = -0.72f;
    private static final float T = -1.2f;
    private static final float U = -0.5f;
    private static final float V = 45.0f;
    private static final float W = -85.0f;
    private static final float X = 45.0f;
    private static final float Y = 92.0f;
    private static final float Z = -41.0f;
    private static final float aa = 0.3f;
    private static final float ab = -1.1f;
    private static final float ac = 0.45f;
    private static final float ad = 20.0f;
    private static final float ae = 0.38f;
    private static final float af = -0.5f;
    private static final float ag = -0.5f;
    private static final float ah = 0.0f;
    private static final float ai = 0.0078125f;
    private static final int aj = 7;
    private static final int ak = 128;
    private static final int al = 128;
    private static final float am = 0.0f;
    private static final float an = 0.0f;
    private static final float ao = 0.04f;
    private static final float ap = 0.0f;
    private static final float aq = 0.004f;
    private static final float ar = 0.0f;
    private static final float as = 0.2f;
    private static final float at = 0.1f;
    private final gfj au;
    private final ikr av = new ikr();
    private dlt aw = dlt.l;
    private dlt ax = dlt.l;
    private float ay;
    private float az;
    private float aA;
    private float aB;
    private final hwo aC;
    private final ihk aD;

    public hof(gfj $$0, hwo $$1, ihk $$2) {
        this.au = $$0;
        this.aC = $$1;
        this.aD = $$2;
    }

    public void a(chl $$0, dlt $$1, dlr $$2, fzm $$3, hpo $$4, int $$5) {
        if ($$1.f()) {
            return;
        }
        ihm $$6 = new ihm();
        this.aD.a($$6, $$1, $$2, $$0.ao(), $$0, $$0.aA() + $$2.ordinal());
        $$6.a($$3, $$4, $$5, ilg.d, 0);
    }

    private float a(float $$0) {
        float $$1 = 1.0f - $$0 / 45.0f + 0.1f;
        $$1 = bgj.a($$1, 0.0f, 1.0f);
        $$1 = -bgj.b((double)($$1 * (float)Math.PI)) * 0.5f + 0.5f;
        return $$1;
    }

    private void a(fzm $$0, hpo $$1, int $$2, chb $$3) {
        icd<hne> $$4 = this.aC.a(this.au.s);
        $$0.a();
        float $$5 = $$3 == chb.b ? 1.0f : -1.0f;
        $$0.a((Quaternionfc)a.d.rotationDegrees(92.0f));
        $$0.a((Quaternionfc)a.b.rotationDegrees(45.0f));
        $$0.a((Quaternionfc)a.f.rotationDegrees($$5 * -41.0f));
        $$0.a($$5 * 0.3f, -1.1f, 0.45f);
        amo $$6 = this.au.s.c().a().b();
        if ($$3 == chb.b) {
            $$4.a($$0, $$1, $$2, $$6, this.au.s.a(ddo.d));
        } else {
            $$4.b($$0, $$1, $$2, $$6, this.au.s.a(ddo.c));
        }
        $$0.b();
    }

    private void a(fzm $$0, hpo $$1, int $$2, float $$3, chb $$4, float $$5, dlt $$6) {
        float $$7 = $$4 == chb.b ? 1.0f : -1.0f;
        $$0.a($$7 * 0.125f, -0.125f, 0.0f);
        if (!this.au.s.cG()) {
            $$0.a();
            $$0.a((Quaternionfc)a.f.rotationDegrees($$7 * 10.0f));
            this.a($$0, $$1, $$2, $$3, $$5, $$4);
            $$0.b();
        }
        $$0.a();
        $$0.a($$7 * 0.51f, -0.08f + $$3 * -1.2f, -0.75f);
        float $$8 = bgj.a($$5);
        float $$9 = bgj.a((double)($$8 * (float)Math.PI));
        float $$10 = -0.5f * $$9;
        float $$11 = 0.4f * bgj.a((double)($$8 * ((float)Math.PI * 2)));
        float $$12 = -0.3f * bgj.a((double)($$5 * (float)Math.PI));
        $$0.a($$7 * $$10, $$11 - 0.3f * $$9, $$12);
        $$0.a((Quaternionfc)a.b.rotationDegrees($$9 * -45.0f));
        $$0.a((Quaternionfc)a.d.rotationDegrees($$7 * $$9 * -30.0f));
        this.a($$0, $$1, $$2, $$6);
        $$0.b();
    }

    private void a(fzm $$0, hpo $$1, int $$2, float $$3, float $$4, float $$5) {
        float $$6 = bgj.a($$5);
        float $$7 = -0.2f * bgj.a((double)($$5 * (float)Math.PI));
        float $$8 = -0.4f * bgj.a((double)($$6 * (float)Math.PI));
        $$0.a(0.0f, -$$7 / 2.0f, $$8);
        float $$9 = this.a($$3);
        $$0.a(0.0f, 0.04f + $$4 * -1.2f + $$9 * -0.5f, -0.72f);
        $$0.a((Quaternionfc)a.b.rotationDegrees($$9 * -85.0f));
        if (!this.au.s.cG()) {
            $$0.a();
            $$0.a((Quaternionfc)a.d.rotationDegrees(90.0f));
            this.a($$0, $$1, $$2, chb.b);
            this.a($$0, $$1, $$2, chb.a);
            $$0.b();
        }
        float $$10 = bgj.a((double)($$6 * (float)Math.PI));
        $$0.a((Quaternionfc)a.b.rotationDegrees($$10 * 20.0f));
        $$0.b(2.0f, 2.0f, 2.0f);
        this.a($$0, $$1, $$2, this.aw);
    }

    private void a(fzm $$0, hpo $$12, int $$22, dlt $$3) {
        $$0.a((Quaternionfc)a.d.rotationDegrees(180.0f));
        $$0.a((Quaternionfc)a.f.rotationDegrees(180.0f));
        $$0.b(0.38f, 0.38f, 0.38f);
        $$0.a(-0.5f, -0.5f, 0.0f);
        $$0.b(0.0078125f, 0.0078125f, 0.0078125f);
        fmu $$4 = $$3.a(ki.T);
        fmw $$5 = dmg.a($$4, this.au.r);
        ijs $$6 = $$5 == null ? a : b;
        $$12.a($$0, $$6, ($$1, $$2) -> {
            $$2.a($$1, -7.0f, 135.0f, 0.0f).a(-1).a(0.0f, 1.0f).c($$22);
            $$2.a($$1, 135.0f, 135.0f, 0.0f).a(-1).a(1.0f, 1.0f).c($$22);
            $$2.a($$1, 135.0f, -7.0f, 0.0f).a(-1).a(1.0f, 0.0f).c($$22);
            $$2.a($$1, -7.0f, -7.0f, 0.0f).a(-1).a(0.0f, 0.0f).c($$22);
        });
        if ($$5 != null) {
            hok $$7 = this.au.aB();
            $$7.a($$4, $$5, this.av);
            $$7.a(this.av, $$0, $$12, false, $$22);
        }
    }

    private void a(fzm $$0, hpo $$1, int $$2, float $$3, float $$4, chb $$5) {
        boolean $$6 = $$5 != chb.a;
        float $$7 = $$6 ? 1.0f : -1.0f;
        float $$8 = bgj.a($$4);
        float $$9 = -0.3f * bgj.a((double)($$8 * (float)Math.PI));
        float $$10 = 0.4f * bgj.a((double)($$8 * ((float)Math.PI * 2)));
        float $$11 = -0.4f * bgj.a((double)($$4 * (float)Math.PI));
        $$0.a($$7 * ($$9 + 0.64000005f), $$10 + -0.6f + $$3 * -0.6f, $$11 + -0.71999997f);
        $$0.a((Quaternionfc)a.d.rotationDegrees($$7 * 45.0f));
        float $$12 = bgj.a((double)($$4 * $$4 * (float)Math.PI));
        float $$13 = bgj.a((double)($$8 * (float)Math.PI));
        $$0.a((Quaternionfc)a.d.rotationDegrees($$7 * $$13 * 70.0f));
        $$0.a((Quaternionfc)a.f.rotationDegrees($$7 * $$12 * -20.0f));
        hnh $$14 = this.au.s;
        $$0.a($$7 * -1.0f, 3.6f, 3.5f);
        $$0.a((Quaternionfc)a.f.rotationDegrees($$7 * 120.0f));
        $$0.a((Quaternionfc)a.b.rotationDegrees(200.0f));
        $$0.a((Quaternionfc)a.d.rotationDegrees($$7 * -135.0f));
        $$0.a($$7 * 5.6f, 0.0f, 0.0f);
        icd<hne> $$15 = this.aC.a($$14);
        amo $$16 = $$14.c().a().b();
        if ($$6) {
            $$15.a($$0, $$1, $$2, $$16, $$14.a(ddo.d));
        } else {
            $$15.b($$0, $$1, $$2, $$16, $$14.a(ddo.c));
        }
    }

    private void a(fzm $$0, float $$1, chb $$2, dlt $$3, ddm $$4) {
        float $$5 = (float)$$4.gc() - $$1 + 1.0f;
        float $$6 = $$5 / (float)$$3.a($$4);
        if ($$6 < 0.8f) {
            float $$7 = bgj.c(bgj.b((double)($$5 / 4.0f * (float)Math.PI)) * 0.1f);
            $$0.a(0.0f, $$7, 0.0f);
        }
        float $$8 = 1.0f - (float)Math.pow($$6, 27.0);
        int $$9 = $$2 == chb.b ? 1 : -1;
        $$0.a($$8 * 0.6f * (float)$$9, $$8 * -0.5f, $$8 * 0.0f);
        $$0.a((Quaternionfc)a.d.rotationDegrees((float)$$9 * $$8 * 90.0f));
        $$0.a((Quaternionfc)a.b.rotationDegrees($$8 * 10.0f));
        $$0.a((Quaternionfc)a.f.rotationDegrees((float)$$9 * $$8 * 30.0f));
    }

    private void a(fzm $$0, float $$1, chb $$2, ddm $$3) {
        float $$4 = $$3.gc() % 10;
        float $$5 = $$4 - $$1 + 1.0f;
        float $$6 = 1.0f - $$5 / 10.0f;
        float $$7 = -90.0f;
        float $$8 = 60.0f;
        float $$9 = 150.0f;
        float $$10 = -15.0f;
        int $$11 = 2;
        float $$12 = -15.0f + 75.0f * bgj.b((double)($$6 * 2.0f * (float)Math.PI));
        if ($$2 != chb.b) {
            $$0.a(0.1, 0.83, 0.35);
            $$0.a((Quaternionfc)a.b.rotationDegrees(-80.0f));
            $$0.a((Quaternionfc)a.d.rotationDegrees(-90.0f));
            $$0.a((Quaternionfc)a.b.rotationDegrees($$12));
            $$0.a(-0.3, 0.22, 0.35);
        } else {
            $$0.a(-0.25, 0.22, 0.35);
            $$0.a((Quaternionfc)a.b.rotationDegrees(-80.0f));
            $$0.a((Quaternionfc)a.d.rotationDegrees(90.0f));
            $$0.a((Quaternionfc)a.f.rotationDegrees(0.0f));
            $$0.a((Quaternionfc)a.b.rotationDegrees($$12));
        }
    }

    private void a(fzm $$0, chb $$1, float $$2) {
        int $$3 = $$1 == chb.b ? 1 : -1;
        float $$4 = bgj.a((double)($$2 * $$2 * (float)Math.PI));
        $$0.a((Quaternionfc)a.d.rotationDegrees((float)$$3 * (45.0f + $$4 * -20.0f)));
        float $$5 = bgj.a((double)(bgj.a($$2) * (float)Math.PI));
        $$0.a((Quaternionfc)a.f.rotationDegrees((float)$$3 * $$5 * -20.0f));
        $$0.a((Quaternionfc)a.b.rotationDegrees($$5 * -80.0f));
        $$0.a((Quaternionfc)a.d.rotationDegrees((float)$$3 * -45.0f));
    }

    private void b(fzm $$0, chb $$1, float $$2) {
        int $$3 = $$1 == chb.b ? 1 : -1;
        $$0.a((float)$$3 * 0.56f, -0.52f + $$2 * -0.6f, -0.72f);
    }

    public void a(float $$0, fzm $$1, hpo $$2, hnh $$3, int $$4) {
        float $$5 = $$3.E($$0);
        cdb $$6 = (cdb)((Object)MoreObjects.firstNonNull((Object)((Object)$$3.bq), (Object)((Object)cdb.a)));
        float $$7 = $$3.k($$0);
        a $$8 = hof.a($$3);
        float $$9 = bgj.h($$0, $$3.j, $$3.h);
        float $$10 = bgj.h($$0, $$3.i, $$3.g);
        $$1.a((Quaternionfc)a.b.rotationDegrees(($$3.i($$0) - $$9) * 0.1f));
        $$1.a((Quaternionfc)a.d.rotationDegrees(($$3.j($$0) - $$10) * 0.1f));
        if ($$8.d) {
            float $$11 = $$6 == cdb.a ? $$5 : 0.0f;
            float $$12 = this.aD.b(this.aw) * (1.0f - bgj.h($$0, this.az, this.ay));
            this.a($$3, $$0, $$7, cdb.a, $$11, this.aw, $$12, $$1, $$2, $$4);
        }
        if ($$8.e) {
            float $$13 = $$6 == cdb.b ? $$5 : 0.0f;
            float $$14 = this.aD.b(this.ax) * (1.0f - bgj.h($$0, this.aB, this.aA));
            this.a($$3, $$0, $$7, cdb.b, $$13, this.ax, $$14, $$1, $$2, $$4);
        }
        this.au.i.c().a();
        this.au.aU().c().b();
    }

    @VisibleForTesting
    static a a(hnh $$0) {
        boolean $$4;
        dlt $$1 = $$0.fx();
        dlt $$2 = $$0.fy();
        boolean $$3 = $$1.a(dlx.pW) || $$2.a(dlx.pW);
        boolean bl2 = $$4 = $$1.a(dlx.yz) || $$2.a(dlx.yz);
        if (!$$3 && !$$4) {
            return hof$a.a;
        }
        if ($$0.fZ()) {
            return hof.b($$0);
        }
        if (hof.a($$1)) {
            return hof$a.b;
        }
        return hof$a.a;
    }

    private static a b(hnh $$0) {
        dlt $$1 = $$0.gb();
        cdb $$2 = $$0.ga();
        if ($$1.a(dlx.pW) || $$1.a(dlx.yz)) {
            return hof$a.a($$2);
        }
        return $$2 == cdb.a && hof.a($$0.fy()) ? hof$a.b : hof$a.a;
    }

    private static boolean a(dlt $$0) {
        return $$0.a(dlx.yz) && dkm.g($$0);
    }

    private void a(hne $$0, float $$1, float $$2, cdb $$3, float $$4, dlt $$5, float $$6, fzm $$7, hpo $$8, int $$9) {
        if ($$0.hj()) {
            return;
        }
        boolean $$10 = $$3 == cdb.a;
        chb $$11 = $$10 ? $$0.at() : $$0.at().a();
        $$7.a();
        if ($$5.f()) {
            if ($$10 && !$$0.cG()) {
                this.a($$7, $$8, $$9, $$6, $$4, $$11);
            }
        } else if ($$5.c(ki.T)) {
            if ($$10 && this.ax.f()) {
                this.a($$7, $$8, $$9, $$2, $$6, $$4);
            } else {
                this.a($$7, $$8, $$9, $$6, $$11, $$4, $$5);
            }
        } else if ($$5.a(dlx.yz)) {
            int $$14;
            this.b($$7, $$11, $$6);
            boolean $$12 = dkm.g($$5);
            boolean $$13 = $$11 == chb.b;
            int n2 = $$14 = $$13 ? 1 : -1;
            if ($$0.fZ() && $$0.gc() > 0 && $$0.ga() == $$3 && !$$12) {
                $$7.a((float)$$14 * -0.4785682f, -0.094387f, 0.05731531f);
                $$7.a((Quaternionfc)a.b.rotationDegrees(-11.935f));
                $$7.a((Quaternionfc)a.d.rotationDegrees((float)$$14 * 65.3f));
                $$7.a((Quaternionfc)a.f.rotationDegrees((float)$$14 * -9.785f));
                float $$15 = (float)$$5.a($$0) - ((float)$$0.gc() - $$1 + 1.0f);
                float $$16 = $$15 / (float)dkm.b($$5, $$0);
                if ($$16 > 1.0f) {
                    $$16 = 1.0f;
                }
                if ($$16 > 0.1f) {
                    float $$17 = bgj.a((double)(($$15 - 0.1f) * 1.3f));
                    float $$18 = $$16 - 0.1f;
                    float $$19 = $$17 * $$18;
                    $$7.a($$19 * 0.0f, $$19 * 0.004f, $$19 * 0.0f);
                }
                $$7.a($$16 * 0.0f, $$16 * 0.0f, $$16 * 0.04f);
                $$7.b(1.0f, 1.0f, 1.0f + $$16 * 0.2f);
                $$7.a((Quaternionfc)a.c.rotationDegrees((float)$$14 * 45.0f));
            } else {
                this.a($$4, $$7, $$14, $$11);
                if ($$12 && $$4 < 0.001f && $$10) {
                    $$7.a((float)$$14 * -0.641864f, 0.0f, 0.0f);
                    $$7.a((Quaternionfc)a.d.rotationDegrees((float)$$14 * 10.0f));
                }
            }
            this.a($$0, $$5, $$13 ? dlr.e : dlr.d, $$7, $$8, $$9);
        } else {
            int $$21;
            boolean $$20 = $$11 == chb.b;
            int n3 = $$21 = $$20 ? 1 : -1;
            if ($$0.fZ() && $$0.gc() > 0 && $$0.ga() == $$3) {
                dlv $$22 = $$5.w();
                if (!$$22.b()) {
                    this.b($$7, $$11, $$6);
                }
                switch ($$22) {
                    case a: {
                        break;
                    }
                    case b: 
                    case c: {
                        this.a($$7, $$1, $$11, $$5, $$0);
                        this.b($$7, $$11, $$6);
                        break;
                    }
                    case d: {
                        if ($$5.h() instanceof dmt) break;
                        $$7.a((float)$$21 * -0.14142136f, 0.08f, 0.14142136f);
                        $$7.a((Quaternionfc)a.b.rotationDegrees(-102.25f));
                        $$7.a((Quaternionfc)a.d.rotationDegrees((float)$$21 * 13.365f));
                        $$7.a((Quaternionfc)a.f.rotationDegrees((float)$$21 * 78.05f));
                        break;
                    }
                    case e: {
                        $$7.a((float)$$21 * -0.2785682f, 0.18344387f, 0.15731531f);
                        $$7.a((Quaternionfc)a.b.rotationDegrees(-13.935f));
                        $$7.a((Quaternionfc)a.d.rotationDegrees((float)$$21 * 35.3f));
                        $$7.a((Quaternionfc)a.f.rotationDegrees((float)$$21 * -9.785f));
                        float $$23 = (float)$$5.a($$0) - ((float)$$0.gc() - $$1 + 1.0f);
                        float $$24 = $$23 / 20.0f;
                        $$24 = ($$24 * $$24 + $$24 * 2.0f) / 3.0f;
                        if ($$24 > 1.0f) {
                            $$24 = 1.0f;
                        }
                        if ($$24 > 0.1f) {
                            float $$25 = bgj.a((double)(($$23 - 0.1f) * 1.3f));
                            float $$26 = $$24 - 0.1f;
                            float $$27 = $$25 * $$26;
                            $$7.a($$27 * 0.0f, $$27 * 0.004f, $$27 * 0.0f);
                        }
                        $$7.a($$24 * 0.0f, $$24 * 0.0f, $$24 * 0.04f);
                        $$7.b(1.0f, 1.0f, 1.0f + $$24 * 0.2f);
                        $$7.a((Quaternionfc)a.c.rotationDegrees((float)$$21 * 45.0f));
                        break;
                    }
                    case f: {
                        $$7.a((float)$$21 * -0.5f, 0.7f, 0.1f);
                        $$7.a((Quaternionfc)a.b.rotationDegrees(-55.0f));
                        $$7.a((Quaternionfc)a.d.rotationDegrees((float)$$21 * 35.3f));
                        $$7.a((Quaternionfc)a.f.rotationDegrees((float)$$21 * -9.785f));
                        float $$28 = (float)$$5.a($$0) - ((float)$$0.gc() - $$1 + 1.0f);
                        float $$29 = $$28 / 10.0f;
                        if ($$29 > 1.0f) {
                            $$29 = 1.0f;
                        }
                        if ($$29 > 0.1f) {
                            float $$30 = bgj.a((double)(($$28 - 0.1f) * 1.3f));
                            float $$31 = $$29 - 0.1f;
                            float $$32 = $$30 * $$31;
                            $$7.a($$32 * 0.0f, $$32 * 0.004f, $$32 * 0.0f);
                        }
                        $$7.a(0.0f, 0.0f, $$29 * 0.2f);
                        $$7.b(1.0f, 1.0f, 1.0f + $$29 * 0.2f);
                        $$7.a((Quaternionfc)a.c.rotationDegrees((float)$$21 * 45.0f));
                        break;
                    }
                    case j: {
                        this.a($$7, $$1, $$11, $$0);
                        break;
                    }
                    case k: {
                        this.a($$4, $$7, $$21, $$11);
                        break;
                    }
                    case l: {
                        $$7.a((float)$$21 * 0.56f, -0.52f, -0.72f);
                        float $$33 = (float)$$5.a($$0) - ((float)$$0.gc() - $$1 + 1.0f);
                        hcz.a($$0.z($$1), $$7, $$33, $$11, $$5);
                        break;
                    }
                }
            } else if ($$0.fW()) {
                this.b($$7, $$11, $$6);
                $$7.a((float)$$21 * -0.4f, 0.8f, 0.3f);
                $$7.a((Quaternionfc)a.d.rotationDegrees((float)$$21 * 65.0f));
                $$7.a((Quaternionfc)a.f.rotationDegrees((float)$$21 * -85.0f));
            } else {
                this.b($$7, $$11, $$6);
                switch ($$5.L().a()) {
                    case a: {
                        break;
                    }
                    case b: {
                        this.a($$4, $$7, $$21, $$11);
                        break;
                    }
                    case c: {
                        hcz.a($$4, $$7, $$21, $$11);
                    }
                }
            }
            this.a($$0, $$5, $$20 ? dlr.e : dlr.d, $$7, $$8, $$9);
        }
        $$7.b();
    }

    private void a(float $$0, fzm $$1, int $$2, chb $$3) {
        float $$4 = -0.4f * bgj.a((double)(bgj.a($$0) * (float)Math.PI));
        float $$5 = 0.2f * bgj.a((double)(bgj.a($$0) * ((float)Math.PI * 2)));
        float $$6 = -0.2f * bgj.a((double)($$0 * (float)Math.PI));
        $$1.a((float)$$2 * $$4, $$5, $$6);
        this.a($$1, $$3, $$0);
    }

    private boolean a(dlt $$0, dlt $$1) {
        if (dlt.a($$0, $$1, kh::e)) {
            return true;
        }
        return !this.aD.a($$1);
    }

    public void a() {
        this.az = this.ay;
        this.aB = this.aA;
        hnh $$0 = this.au.s;
        dlt $$1 = $$0.fx();
        dlt $$2 = $$0.fy();
        if (this.a(this.aw, $$1)) {
            this.aw = $$1;
        }
        if (this.a(this.ax, $$2)) {
            this.ax = $$2;
        }
        if ($$0.J()) {
            this.ay = bgj.a(this.ay - 0.4f, 0.0f, 1.0f);
            this.aA = bgj.a(this.aA - 0.4f, 0.0f, 1.0f);
        } else {
            float $$3 = $$0.J(1.0f);
            float $$4 = this.aw != $$1 ? 0.0f : $$3 * $$3 * $$3;
            float $$5 = this.ax != $$2 ? 0.0f : 1.0f;
            this.ay += bgj.a($$4 - this.ay, -0.4f, 0.4f);
            this.aA += bgj.a($$5 - this.aA, -0.4f, 0.4f);
        }
        if (this.ay < 0.1f) {
            this.aw = $$1;
        }
        if (this.aA < 0.1f) {
            this.ax = $$2;
        }
    }

    public void a(cdb $$0) {
        if ($$0 == cdb.a) {
            this.ay = 0.0f;
        } else {
            this.aA = 0.0f;
        }
    }

    @VisibleForTesting
    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(true, true);
        public static final /* enum */ a b = new a(true, false);
        public static final /* enum */ a c = new a(false, true);
        final boolean d;
        final boolean e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(boolean $$0, boolean $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        public static a a(cdb $$0) {
            return $$0 == cdb.a ? b : c;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            f = hof$a.a();
        }
    }
}

