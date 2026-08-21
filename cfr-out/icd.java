/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import java.util.Objects;
import org.joml.Quaternionfc;

public class icd<AvatarlikeEntity extends cgc>
extends hxs<AvatarlikeEntity, ick, hht> {
    public icd(hwq.a $$0, boolean $$12) {
        super($$0, new hht($$0.a($$12 ? hdf.cJ : hdf.cE), $$12), 0.5f);
        this.a((AvatarlikeEntity)new iay<ick, hht, hht>(this, hvk.a($$12 ? hdf.cK : hdf.cI, $$0.f(), (hdg $$1) -> new hht((hdg)$$1, $$12)), $$0.h()));
        this.a((AvatarlikeEntity)new ibi<ick, hht>(this));
        this.a((AvatarlikeEntity)new iae(this, $$0));
        this.a((AvatarlikeEntity)new iap(this, $$0.f()));
        this.a((AvatarlikeEntity)new iaj(this, $$0.f(), $$0.g()));
        this.a((AvatarlikeEntity)new iao<ick, hht>(this, $$0.f(), $$0.k()));
        this.a((AvatarlikeEntity)new ibw<ick, hht>(this, $$0.f(), $$0.h()));
        this.a((AvatarlikeEntity)new ibg(this, $$0.f()));
        this.a((AvatarlikeEntity)new ibs(this, $$0.f()));
        this.a((AvatarlikeEntity)new iaf(this, $$0));
    }

    @Override
    protected boolean a(ick $$0) {
        return !$$0.p;
    }

    public ftm b(ick $$0) {
        ftm $$1 = super.a($$0);
        if ($$0.ah) {
            return $$1.b(0.0, (double)($$0.az * -2.0f) / 16.0, 0.0);
        }
        return $$1;
    }

    private static gzo.a a(cgc $$0, chb $$1) {
        dlt $$2 = $$0.b(cdb.a);
        dlt $$3 = $$0.b(cdb.b);
        gzo.a $$4 = icd.a($$0, $$2, cdb.a);
        gzo.a $$5 = icd.a($$0, $$3, cdb.b);
        if ($$4.a()) {
            gzo.a a2 = $$5 = $$3.f() ? gzo.a.a : gzo.a.b;
        }
        if ($$0.at() == $$1) {
            return $$4;
        }
        return $$5;
    }

    private static gzo.a a(cgc $$0, dlt $$1, cdb $$2) {
        dpb $$4;
        if ($$1.f()) {
            return gzo.a.a;
        }
        if (!$$0.bp && $$1.a(dlx.yz) && dkm.g($$1)) {
            return gzo.a.g;
        }
        if ($$0.ga() == $$2 && $$0.gc() > 0) {
            dlv $$3 = $$1.w();
            if ($$3 == dlv.d) {
                return gzo.a.c;
            }
            if ($$3 == dlv.e) {
                return gzo.a.d;
            }
            if ($$3 == dlv.f) {
                return gzo.a.e;
            }
            if ($$3 == dlv.g) {
                return gzo.a.f;
            }
            if ($$3 == dlv.h) {
                return gzo.a.h;
            }
            if ($$3 == dlv.i) {
                return gzo.a.i;
            }
            if ($$3 == dlv.j) {
                return gzo.a.j;
            }
            if ($$3 == dlv.l) {
                return gzo.a.k;
            }
        }
        if (($$4 = $$1.a(ki.P)) != null && $$4.a() == dnf.c && $$0.bp) {
            return gzo.a.k;
        }
        if ($$1.a(bdy.cf)) {
            return gzo.a.k;
        }
        return gzo.a.b;
    }

    public amo c(ick $$0) {
        return $$0.a.a().b();
    }

    @Override
    protected void a(ick $$0, fzm $$1) {
        float $$2 = 0.9375f;
        $$1.b(0.9375f, 0.9375f, 0.9375f);
    }

    @Override
    protected void a(ick $$0, fzm $$1, hpo $$2, ikp $$3) {
        int $$4;
        $$1.a();
        int n2 = $$4 = $$0.E ? -10 : 0;
        if ($$0.A != null) {
            $$2.a($$1, $$0.X, $$4, $$0.A, !$$0.R, $$0.T, $$0.P, $$3);
            Objects.requireNonNull(this.e());
            $$1.a(0.0f, 9.0f * 1.15f * 0.025f, 0.0f);
        }
        if ($$0.W != null) {
            $$2.a($$1, $$0.X, $$4, $$0.W, !$$0.R, $$0.T, $$0.P, $$3);
        }
        $$1.b();
    }

    public ick b() {
        return new ick();
    }

    @Override
    public void a(AvatarlikeEntity $$0, ick $$1, float $$2) {
        dlt $$3;
        super.a($$0, $$1, $$2);
        hxi.a($$0, $$1, $$2, this.g);
        $$1.i = icd.a($$0, chb.a);
        $$1.f = icd.a($$0, chb.b);
        $$1.a = ((gih)$$0).c();
        $$1.n = ((chl)$$0).fs();
        $$1.o = ((chl)$$0).ft();
        $$1.p = ((cgk)$$0).au();
        $$1.q = ((cgc)$$0).a(ddo.g);
        $$1.r = ((cgc)$$0).a(ddo.b);
        $$1.s = ((cgc)$$0).a(ddo.e);
        $$1.t = ((cgc)$$0).a(ddo.f);
        $$1.u = ((cgc)$$0).a(ddo.c);
        $$1.v = ((cgc)$$0).a(ddo.d);
        $$1.w = ((cgc)$$0).a(ddo.a);
        this.b($$0, $$1, $$2);
        this.c($$0, $$1, $$2);
        $$1.A = $$1.P < 100.0 ? ((gih)$$0).d() : null;
        $$1.B = ((gih)$$0).a(true);
        $$1.C = ((gih)$$0).a(false);
        $$1.D = ((cgk)$$0).aA();
        $$1.E = ((gih)$$0).e();
        $$1.F.b();
        if ($$1.al && ($$3 = ((chl)$$0).b($$1.ag)).a(dlx.tb)) {
            this.g.a($$1.F, $$3, dlr.f, (chl)$$0);
        }
    }

    @Override
    protected boolean a(AvatarlikeEntity $$0, double $$1) {
        return super.a($$0, $$1) && (((chl)$$0).de() || ((cgk)$$0).i_() && $$0 == this.c.c);
    }

    private void b(AvatarlikeEntity $$0, ick $$1, float $$2) {
        $$1.x = (float)((chl)$$0).gk() + $$2;
        ftm $$3 = ((cgk)$$0).h($$2);
        ftm $$4 = ((gih)$$0).b().a().a(((cgk)$$0).dN(), (double)$$2);
        if ($$4.j() > (double)1.0E-5f && $$3.j() > (double)1.0E-5f) {
            $$1.y = true;
            double $$5 = $$4.f().d().b($$3.f().d());
            double $$6 = $$4.g * $$3.i - $$4.i * $$3.g;
            $$1.z = (float)(Math.signum($$6) * Math.acos(Math.min(1.0, Math.abs($$5))));
        } else {
            $$1.y = false;
            $$1.z = 0.0f;
        }
    }

    private void c(AvatarlikeEntity $$0, ick $$1, float $$2) {
        gii $$3 = ((gih)$$0).b();
        double $$4 = $$3.b($$2) - bgj.d((double)$$2, ((cgc)$$0).Y, ((cgk)$$0).dP());
        double $$5 = $$3.c($$2) - bgj.d((double)$$2, ((cgc)$$0).Z, ((cgk)$$0).dR());
        double $$6 = $$3.d($$2) - bgj.d((double)$$2, ((cgc)$$0).aa, ((cgk)$$0).dV());
        float $$7 = bgj.i($$2, ((cgc)$$0).bD, ((cgc)$$0).bC);
        double $$8 = bgj.a((double)($$7 * ((float)Math.PI / 180)));
        double $$9 = -bgj.b((double)($$7 * ((float)Math.PI / 180)));
        $$1.b = (float)$$5 * 10.0f;
        $$1.b = bgj.a($$1.b, -6.0f, 32.0f);
        $$1.c = (float)($$4 * $$8 + $$6 * $$9) * 100.0f;
        $$1.c *= 1.0f - $$1.c();
        $$1.c = bgj.a($$1.c, 0.0f, 150.0f);
        $$1.d = (float)($$4 * $$9 - $$6 * $$8) * 100.0f;
        $$1.d = bgj.a($$1.d, -20.0f, 20.0f);
        float $$10 = $$3.f($$2);
        float $$11 = $$3.h($$2);
        $$1.b += bgj.a((double)($$11 * 6.0f)) * 32.0f * $$10;
    }

    public void a(fzm $$0, hpo $$1, int $$2, amo $$3, boolean $$4) {
        this.a($$0, $$1, $$2, $$3, ((hht)this.f).k, $$4);
    }

    public void b(fzm $$0, hpo $$1, int $$2, amo $$3, boolean $$4) {
        this.a($$0, $$1, $$2, $$3, ((hht)this.f).l, $$4);
    }

    private void a(fzm $$0, hpo $$1, int $$2, amo $$3, hdg $$4, boolean $$5) {
        hht $$6 = (hht)this.c();
        $$4.c();
        $$4.k = true;
        $$6.u.k = $$5;
        $$6.v.k = $$5;
        $$6.l.g = -0.1f;
        $$6.k.g = 0.1f;
        $$1.a($$4, $$0, ijt.j($$3), $$2, ilg.d, null);
    }

    @Override
    protected void a(ick $$0, fzm $$1, float $$2, float $$3) {
        float $$4 = $$0.ab;
        float $$5 = $$0.av;
        if ($$0.ai) {
            super.a($$0, $$1, $$2, $$3);
            float $$6 = $$0.c();
            if (!$$0.aG) {
                $$1.a((Quaternionfc)a.b.rotationDegrees($$6 * (-90.0f - $$5)));
            }
            if ($$0.y) {
                $$1.a((Quaternionfc)a.d.rotation($$0.z));
            }
        } else if ($$4 > 0.0f) {
            super.a($$0, $$1, $$2, $$3);
            float $$7 = $$0.aF ? -90.0f - $$5 : -90.0f;
            float $$8 = bgj.h($$4, 0.0f, $$7);
            $$1.a((Quaternionfc)a.b.rotationDegrees($$8));
            if ($$0.aj) {
                $$1.a(0.0f, -1.0f, 0.3f);
            }
        } else {
            super.a($$0, $$1, $$2, $$3);
        }
    }

    @Override
    public boolean a(AvatarlikeEntity $$0) {
        if (((cgc)$$0).a(ddo.a)) {
            if ($$0 instanceof ddm) {
                ddm $$1 = (ddm)$$0;
                return icd.a($$1);
            }
            return super.b($$0);
        }
        return false;
    }

    public static boolean a(ddm $$0) {
        return icd.a($$0.gI().name());
    }

    @Override
    public /* synthetic */ boolean b(chl chl2) {
        return this.a((AvatarlikeEntity)((cgc)chl2));
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.c((ick)ieh2);
    }

    @Override
    protected /* synthetic */ boolean e(ieh ieh2) {
        return this.a((ick)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }

    @Override
    protected /* synthetic */ void b(idf idf2, fzm fzm2, hpo hpo2, ikp ikp2) {
        this.a((ick)idf2, fzm2, hpo2, ikp2);
    }

    @Override
    public /* synthetic */ ftm a(idf idf2) {
        return this.b((ick)idf2);
    }
}

