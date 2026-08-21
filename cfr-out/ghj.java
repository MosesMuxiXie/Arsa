/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;

public class ghj {
    private static final ggz f = ghw.a(-1);
    public static final amo a = ghj.a("helmet");
    public static final amo b = ghj.a("chestplate");
    public static final amo c = ghj.a("leggings");
    public static final amo d = ghj.a("boots");
    public static final List<a> e = List.of(new a(duq.d, dus.a), new a(duq.e, dus.b), new a(duq.f, dus.c), new a(duq.g, dus.d), new a(duq.h, dus.e), new a(duq.i, dus.f), new a(duq.j, dus.g), new a(duq.k, dus.h), new a(duq.l, dus.i), new a(duq.m, dus.j), new a(duq.n, dus.k));
    private final ghk g;
    private final BiConsumer<amo, ghx> h;

    public static amo a(String $$0) {
        return amo.b("trims/items/" + $$0 + "_trim");
    }

    public ghj(ghk $$0, BiConsumer<amo, ghx> $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    private void a(dlp $$0) {
        this.g.a($$0, ghw.a(ghy.a($$0)));
    }

    private amo a(dlp $$0, ghz $$1) {
        return $$1.a(ghy.a($$0), gib.b($$0), this.h);
    }

    private void b(dlp $$0, ghz $$1) {
        this.g.a($$0, ghw.a(this.a($$0, $$1)));
    }

    private amo a(dlp $$0, String $$1, ghz $$2) {
        return $$2.a(ghy.a($$0, $$1), gib.k(gib.a($$0, $$1)), this.h);
    }

    private amo a(dlp $$0, dlp $$1, ghz $$2) {
        return $$2.a(ghy.a($$0), gib.b($$1), this.h);
    }

    private void b(dlp $$0, dlp $$1, ghz $$2) {
        this.g.a($$0, ghw.a(this.a($$0, $$1, $$2)));
    }

    private void a(dlp $$0, ggz $$1) {
        this.a($$0, "_overlay", $$1);
    }

    private void a(dlp $$0, String $$1, ggz $$2) {
        amo $$3 = this.a($$0, gib.c($$0), gib.a($$0, $$1));
        this.g.a($$0, ghw.a($$3, f, $$2));
    }

    private void a(dlp $$0, int $$1) {
        amo $$2 = gib.c($$0);
        amo $$3 = gib.a($$0, "_overlay");
        amo $$4 = ghy.a($$0);
        gia.cb.a($$4, gib.c($$2, $$3), this.h);
        this.g.a($$0, ghw.a($$4, new ggw($$1)));
    }

    private List<ihp.a> b(dlp $$0) {
        ArrayList<ihp.a> $$1 = new ArrayList<ihp.a>();
        ihj.b $$2 = ghw.a(this.a($$0, "_16", gia.bX));
        $$1.add(ghw.a($$2, 0.0f));
        for (int $$3 = 1; $$3 < 32; ++$$3) {
            int $$4 = bgj.c($$3 - 16, 32);
            ihj.b $$5 = ghw.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$4), gia.bX));
            $$1.add(ghw.a($$5, (float)$$3 - 0.5f));
        }
        $$1.add(ghw.a($$2, 31.5f));
        return $$1;
    }

    private void c(dlp $$0) {
        List<ihp.a> $$1 = this.b($$0);
        this.g.a($$0, ghw.a(ghw.a(ki.ao), ghw.a((iiv)new iim(true, iin.a.b), 32.0f, $$1), ghw.a((iiv)new iim(true, iin.a.c), 32.0f, $$1)));
    }

    private void d(dlp $$0) {
        this.g.a($$0, ghw.a((iiv)new iim(true, iin.a.d), 32.0f, this.b($$0)));
    }

    private void e(dlp $$0) {
        ArrayList<ihp.a> $$1 = new ArrayList<ihp.a>();
        ihj.b $$2 = ghw.a(this.a($$0, "_00", gia.bX));
        $$1.add(ghw.a($$2, 0.0f));
        for (int $$3 = 1; $$3 < 64; ++$$3) {
            ihj.b $$4 = ghw.a(this.a($$0, String.format(Locale.ROOT, "_%02d", $$3), gia.bX));
            $$1.add(ghw.a($$4, (float)$$3 - 0.5f));
        }
        $$1.add(ghw.a($$2, 63.5f));
        this.g.a($$0, ghw.a(ghw.a((iiv)new iiw(true, iiw.a.b), 64.0f, $$1), ghw.a((iiv)new iiw(true, iiw.a.a), 64.0f, $$1)));
    }

    private amo a(dlp $$0, amo $$1, amo $$2) {
        return gia.cb.a($$0, gib.c($$1, $$2), this.h);
    }

    private amo a(amo $$0, amo $$1, amo $$2) {
        return gia.cb.a($$0, gib.c($$1, $$2), this.h);
    }

    private void a(amo $$0, amo $$1, amo $$2, amo $$3) {
        gia.cc.a($$0, gib.a($$1, $$2, $$3), this.h);
    }

    private void a(dlp $$0, amt<dul> $$1, amo $$2, boolean $$3) {
        ihj.b $$14;
        amo $$4 = ghy.a($$0);
        amo $$5 = gib.c($$0);
        amo $$6 = gib.a($$0, "_overlay");
        ArrayList $$7 = new ArrayList(e.size());
        for (a $$8 : e) {
            ihj.b $$12;
            amo $$9 = $$4.g("_" + $$8.a().a().a() + "_trim");
            amo $$10 = $$2.g("_" + $$8.a().a($$1).a());
            if ($$3) {
                this.a($$9, $$5, $$6, $$10);
                ihj.b $$11 = ghw.a($$9, new ggw(-6265536));
            } else {
                this.a($$9, $$5, $$10);
                $$12 = ghw.a($$9);
            }
            $$7.add(ghw.a($$8.b, $$12));
        }
        if ($$3) {
            gia.cb.a($$4, gib.c($$5, $$6), this.h);
            ihj.b $$13 = ghw.a($$4, new ggw(-6265536));
        } else {
            gia.bX.a($$4, gib.k($$5), this.h);
            $$14 = ghw.a($$4);
        }
        this.g.a($$0, ghw.a(new ijm(), $$14, $$7));
    }

    private void f(dlp $$0) {
        ihj.b $$1 = ghw.a(this.a($$0, gia.bX));
        amo $$2 = this.a($$0, gia.ch, "_open_back");
        amo $$3 = this.a($$0, gia.cg, "_open_front");
        ihj.b $$4 = ghw.a(ghw.a($$2), new ihe.a(), ghw.a($$3));
        ihj.b $$5 = ghw.a(new ihv(), $$4, $$1);
        this.g.a($$0, ghw.a(new ijg(), $$1, ghw.a(dlr.g, $$5)));
    }

    private amo a(dlp $$0, ghz $$1, String $$2) {
        amo $$3 = gib.a($$0, $$2);
        return $$1.a($$0, gib.k($$3), this.h);
    }

    private void g(dlp $$0) {
        ihj.b $$1 = ghw.a(ghy.a($$0));
        ihj.b $$2 = ghw.a(this.a($$0, "_pulling_0", gia.ci));
        ihj.b $$3 = ghw.a(this.a($$0, "_pulling_1", gia.ci));
        ihj.b $$4 = ghw.a(this.a($$0, "_pulling_2", gia.ci));
        this.g.a($$0, ghw.a(ghw.a(), ghw.a((iiv)new iiy(false), 0.05f, $$2, ghw.a($$3, 0.65f), ghw.a($$4, 0.9f)), $$1));
    }

    private void h(dlp $$0) {
        ihj.b $$1 = ghw.a(ghy.a($$0));
        ihj.b $$2 = ghw.a(this.a($$0, "_pulling_0", gia.cj));
        ihj.b $$3 = ghw.a(this.a($$0, "_pulling_1", gia.cj));
        ihj.b $$4 = ghw.a(this.a($$0, "_pulling_2", gia.cj));
        ihj.b $$5 = ghw.a(this.a($$0, "_arrow", gia.cj));
        ihj.b $$6 = ghw.a(this.a($$0, "_firework", gia.cj));
        this.g.a($$0, ghw.a(new ijb(), ghw.a(ghw.a(), ghw.a((iiv)new iiq(), $$2, ghw.a($$3, 0.58f), ghw.a($$4, 1.0f)), $$1), ghw.a(dkm.a.b, $$5), ghw.a(dkm.a.c, $$6)));
    }

    private void a(dlp $$0, ihy $$1, ihj.b $$2, ihj.b $$3) {
        this.g.a($$0, ghw.a($$1, $$2, $$3));
    }

    private void i(dlp $$0) {
        ihj.b $$1 = ghw.a(this.a($$0, gia.bX));
        ihj.b $$2 = ghw.a(this.a($$0, "_broken", gia.bX));
        this.a($$0, new ihu(), $$2, $$1);
    }

    private void j(dlp $$0) {
        ihj.b $$1 = ghw.a(ghy.a($$0));
        ihj.b $$2 = ghw.a(ghy.a($$0, "_brushing_0"));
        ihj.b $$3 = ghw.a(ghy.a($$0, "_brushing_1"));
        ihj.b $$4 = ghw.a(ghy.a($$0, "_brushing_2"));
        this.g.a($$0, ghw.a((iiv)new iix(10.0f), 0.1f, $$1, ghw.a($$2, 0.25f), ghw.a($$3, 0.5f), ghw.a($$4, 0.75f)));
    }

    private void k(dlp $$0) {
        ihj.b $$1 = ghw.a(this.a($$0, gia.ca));
        ihj.b $$2 = ghw.a(this.a($$0, "_cast", gia.ca));
        this.a($$0, new iic(), $$2, $$1);
    }

    private void l(dlp $$0) {
        ihj.b $$1 = ghw.a(ghy.a($$0));
        ihj.b $$2 = ghw.a(ghy.b("tooting_goat_horn"));
        this.a($$0, ghw.a(), $$2, $$1);
    }

    private void m(dlp $$0) {
        ihj.b $$1 = ghw.a(ghy.a($$0), new ikf.a());
        ihj.b $$2 = ghw.a(ghy.a($$0, "_blocking"), new ikf.a());
        this.a($$0, ghw.a(), $$2, $$1);
    }

    private static ihj.b a(ihj.b $$0, ihj.b $$1) {
        return ghw.a(new ijg(), $$1, ghw.a(List.of(dlr.g, dlr.h, dlr.i, dlr.j), $$0));
    }

    private void n(dlp $$0) {
        ihj.b $$1 = ghw.a(this.a($$0, gia.bX));
        ihj.b $$2 = ghw.a(ghy.a($$0, "_in_hand"));
        this.g.a($$0, ghj.a($$1, $$2));
    }

    private void o(dlp $$0) {
        ihj.b $$1 = ghw.a(this.a($$0, gia.bX));
        ihj.b $$2 = ghw.a(ghy.a($$0, "_in_hand"), new ikl.a());
        ihj.b $$3 = ghw.a(ghy.a($$0, "_throwing"), new ikl.a());
        ihj.b $$4 = ghw.a(ghw.a(), $$3, $$2);
        this.g.a($$0, ghj.a($$1, $$4));
    }

    private void p(dlp $$0) {
        ihj.b $$1 = ghw.a(this.a($$0, gia.bX));
        ihj.b $$2 = ghw.a(gia.ck.a($$0, gib.k(gib.a($$0, "_in_hand")), this.h));
        this.g.a($$0, ghj.a($$1, $$2), new ihf.a(true, false, 1.95f));
    }

    private void a(dlp $$0, amo $$1) {
        this.g.a($$0, ghw.a($$1, new ghc()));
    }

    private void q(dlp $$0) {
        amo $$1 = this.a($$0, ghy.b("potion_overlay"), ghy.a($$0));
        this.a($$0, $$1);
    }

    private void r(dlp $$0) {
        amo $$1 = this.a($$0, ghy.a($$0, "_head"), ghy.a($$0, "_base"));
        this.a($$0, $$1);
    }

    private void b(dlp $$0, int $$1) {
        amo $$2 = this.a($$0, gia.bX);
        this.g.a($$0, ghw.a($$2, new ggw($$1)));
    }

    private void s(dlp $$0) {
        amo $$1 = gib.c($$0);
        amo $$2 = gib.a($$0, "_overlay");
        amo $$3 = gia.bX.a($$0, gib.k($$1), this.h);
        amo $$4 = ghy.a($$0, "_dyed");
        gia.cb.a($$4, gib.c($$1, $$2), this.h);
        this.g.a($$0, ghw.a(ghw.a(ki.R), ghw.a($$4, f, new ggw(0)), ghw.a($$3)));
    }

    public void a() {
        this.b(dlx.pz, gia.bX);
        this.b(dlx.pB, gia.bX);
        this.b(dlx.pA, gia.bX);
        this.b(dlx.pC, gia.bX);
        this.b(dlx.qe, gia.bX);
        this.b(dlx.pV, gia.bX);
        this.b(dlx.pR, gia.bX);
        this.b(dlx.wS, gia.bX);
        this.b(dlx.pX, gia.bX);
        this.b(dlx.wt, gia.bX);
        this.b(dlx.ej, gia.bZ);
        this.b(dlx.ue, gia.bX);
        this.b(dlx.xz, gia.bX);
        this.b(dlx.xB, gia.bX);
        this.b(dlx.pv, gia.bX);
        this.b(dlx.pw, gia.bX);
        this.b(dlx.tB, gia.bX);
        this.b(dlx.us, gia.bX);
        this.b(dlx.uk, gia.bZ);
        this.b(dlx.tx, gia.bX);
        this.b(dlx.tC, gia.bX);
        this.b(dlx.yL, gia.bX);
        this.b(dlx.sB, gia.bX);
        this.b(dlx.pU, gia.bX);
        this.b(dlx.rd, gia.bX);
        this.b(dlx.sx, gia.bX);
        this.b(dlx.wm, gia.bZ);
        this.b(dlx.ty, gia.bX);
        this.b(dlx.sk, gia.bX);
        this.b(dlx.pn, gia.ca);
        this.b(dlx.po, gia.ca);
        this.b(dlx.pZ, gia.bX);
        this.b(dlx.pj, gia.bX);
        this.b(dlx.ug, gia.bX);
        this.b(dlx.xv, gia.bX);
        this.b(dlx.sy, gia.bX);
        this.e(dlx.ta);
        this.b(dlx.pY, gia.bX);
        this.b(dlx.st, gia.bX);
        this.b(dlx.xb, gia.bX);
        this.c(dlx.sG);
        this.d(dlx.sH);
        this.b(dlx.uf, gia.bX);
        this.b(dlx.uh, gia.bX);
        this.b(dlx.th, gia.bX);
        this.b(dlx.xd, gia.bX);
        this.b(dlx.rI, gia.bX);
        this.b(dlx.wO, gia.bX);
        this.b(dlx.ti, gia.bX);
        this.b(dlx.tW, gia.bX);
        this.b(dlx.qh, gia.bX);
        this.b(dlx.xS, gia.bX);
        this.b(dlx.qi, gia.bX);
        this.b(dlx.qv, gia.bZ);
        this.b(dlx.qw, gia.bZ);
        this.b(dlx.qu, gia.bZ);
        this.b(dlx.qt, gia.bZ);
        this.b(dlx.qs, gia.bZ);
        this.b(dlx.wT, gia.bX);
        this.b(dlx.yx, gia.bX);
        this.b(dlx.yD, gia.bX);
        this.b(dlx.tv, gia.bX);
        this.b(dlx.pD, gia.bX);
        this.b(dlx.pE, gia.bX);
        this.b(dlx.qa, gia.bX);
        this.b(dlx.qP, gia.bZ);
        this.b(dlx.qQ, gia.bZ);
        this.b(dlx.wW, gia.bX);
        this.b(dlx.yv, gia.bX);
        this.b(dlx.qO, gia.bZ);
        this.b(dlx.qN, gia.bZ);
        this.b(dlx.qM, gia.bZ);
        this.b(dlx.xC, gia.bX);
        this.b(dlx.ub, gia.bX);
        this.b(dlx.sD, gia.bX);
        this.b(dlx.sE, gia.bX);
        this.b(dlx.sF, gia.bX);
        this.b(dlx.qb, gia.bX);
        this.b(dlx.wI, gia.bX);
        this.b(dlx.uw, gia.bX);
        this.b(dlx.uj, gia.bX);
        this.b(dlx.xu, gia.bX);
        this.b(dlx.wh, gia.bX);
        this.b(dlx.ur, gia.bX);
        this.b(dlx.yK, gia.bX);
        this.b(dlx.wG, gia.bX);
        this.b(dlx.wi, gia.bX);
        this.b(dlx.rG, gia.bX);
        this.b(dlx.pT, gia.bX);
        this.b(dlx.yI, gia.bX);
        this.b(dlx.yC, gia.bX);
        this.b(dlx.pk, gia.bX);
        this.b(dlx.ul, gia.bX);
        this.b(dlx.uo, gia.bX);
        this.b(dlx.ux, gia.bX);
        this.b(dlx.yG, gia.bX);
        this.b(dlx.zb, gia.bX);
        this.b(dlx.tc, gia.bX);
        this.b(dlx.tk, gia.bX);
        this.b(dlx.wp, gia.bX);
        this.b(dlx.qj, gia.bX);
        this.b(dlx.rK, gia.bX);
        this.b(dlx.qF, gia.bZ);
        this.b(dlx.ww, gia.bX);
        this.b(dlx.qG, gia.bZ);
        this.b(dlx.wV, gia.bX);
        this.b(dlx.yu, gia.bX);
        this.b(dlx.qE, gia.bZ);
        this.b(dlx.qD, gia.bZ);
        this.b(dlx.qC, gia.bZ);
        this.b(dlx.qk, gia.bX);
        this.b(dlx.um, gia.bX);
        this.b(dlx.tt, gia.bX);
        this.b(dlx.tz, gia.bX);
        this.b(dlx.ra, gia.bX);
        this.b(dlx.yJ, gia.bX);
        this.b(dlx.yy, gia.bX);
        this.b(dlx.zf, gia.bX);
        this.b(dlx.zi, gia.bX);
        this.b(dlx.pm, gia.bX);
        this.b(dlx.tj, gia.bX);
        this.b(dlx.qf, gia.bX);
        this.b(dlx.qK, gia.bZ);
        this.b(dlx.qL, gia.bZ);
        this.b(dlx.wU, gia.bX);
        this.b(dlx.yt, gia.bX);
        this.b(dlx.qg, gia.bX);
        this.b(dlx.xR, gia.bX);
        this.b(dlx.qJ, gia.bZ);
        this.b(dlx.qI, gia.bZ);
        this.b(dlx.qH, gia.bZ);
        this.b(dlx.wo, gia.bX);
        this.b(dlx.px, gia.bX);
        this.b(dlx.py, gia.bX);
        this.b(dlx.xT, gia.bX);
        this.b(dlx.qc, gia.bX);
        this.b(dlx.sm, gia.bX);
        this.b(dlx.sp, gia.bX);
        this.b(dlx.tp, gia.bX);
        this.b(dlx.tu, gia.bX);
        this.b(dlx.tr, gia.bX);
        this.b(dlx.to, gia.bX);
        this.b(dlx.ut, gia.bX);
        this.b(dlx.pH, gia.bX);
        this.b(dlx.pI, gia.bX);
        this.b(dlx.pJ, gia.bX);
        this.b(dlx.pK, gia.bX);
        this.b(dlx.wv, gia.bX);
        this.b(dlx.ua, gia.bX);
        this.b(dlx.sq, gia.bX);
        this.b(dlx.pi, gia.bX);
        this.b(dlx.yF, gia.bX);
        this.b(dlx.qX, gia.bX);
        this.b(dlx.yq, gia.bX);
        this.b(dlx.yi, gia.bY);
        this.b(dlx.xV, gia.bY);
        this.b(dlx.xX, gia.bY);
        this.b(dlx.xW, gia.bY);
        this.b(dlx.xY, gia.bY);
        this.b(dlx.xZ, gia.bY);
        this.b(dlx.ya, gia.bY);
        this.b(dlx.yb, gia.bY);
        this.b(dlx.yc, gia.bY);
        this.b(dlx.yd, gia.bY);
        this.b(dlx.ye, gia.bY);
        this.b(dlx.yn, gia.bY);
        this.b(dlx.yo, gia.bY);
        this.b(dlx.yf, gia.bY);
        this.b(dlx.yg, gia.bY);
        this.b(dlx.yj, gia.bY);
        this.b(dlx.yh, gia.bY);
        this.b(dlx.yk, gia.bY);
        this.b(dlx.yl, gia.bY);
        this.b(dlx.ym, gia.bY);
        this.b(dlx.yp, gia.bY);
        this.b(dlx.xc, gia.bX);
        this.b(dlx.xa, gia.bX);
        this.b(dlx.ys, gia.bX);
        this.b(dlx.qU, gia.bZ);
        this.b(dlx.qV, gia.bZ);
        this.b(dlx.ql, gia.bX);
        this.b(dlx.qT, gia.bZ);
        this.b(dlx.qm, gia.bX);
        this.b(dlx.qS, gia.bZ);
        this.b(dlx.qR, gia.bZ);
        this.b(dlx.yw, gia.bX);
        this.b(dlx.wX, gia.bX);
        this.b(dlx.wJ, gia.bX);
        this.b(dlx.wK, gia.bX);
        this.b(dlx.wE, gia.bX);
        this.b(dlx.pr, gia.bX);
        this.b(dlx.ps, gia.bX);
        this.b(dlx.tn, gia.bX);
        this.b(dlx.rJ, gia.bX);
        this.b(dlx.pF, gia.bX);
        this.b(dlx.pG, gia.bX);
        this.b(dlx.sA, gia.bX);
        this.b(dlx.pp, gia.bX);
        this.b(dlx.yH, gia.bX);
        this.b(dlx.ts, gia.bX);
        this.b(dlx.wu, gia.bX);
        this.b(dlx.xw, gia.bX);
        this.b(dlx.rH, gia.bX);
        this.b(dlx.sn, gia.bX);
        this.b(dlx.wM, gia.bX);
        this.b(dlx.wL, gia.bX);
        this.b(dlx.tg, gia.bX);
        this.b(dlx.sr, gia.bX);
        this.b(dlx.wF, gia.bX);
        this.b(dlx.tw, gia.bX);
        this.b(dlx.qd, gia.bX);
        this.b(dlx.wN, gia.bX);
        this.b(dlx.wQ, gia.bX);
        this.b(dlx.wR, gia.bX);
        this.b(dlx.wP, gia.bX);
        this.b(dlx.tA, gia.bX);
        this.b(dlx.ui, gia.bX);
        this.b(dlx.oR, gia.bX);
        this.b(dlx.te, gia.bX);
        this.b(dlx.ss, gia.bX);
        this.b(dlx.pQ, gia.bX);
        this.b(dlx.tZ, gia.bX);
        this.b(dlx.xQ, gia.bX);
        this.b(dlx.yE, gia.bX);
        this.b(dlx.sC, gia.bX);
        this.b(dlx.so, gia.bX);
        this.b(dlx.zZ, gia.bX);
        this.b(dlx.xE, gia.bX);
        this.b(dlx.uq, gia.bX);
        this.b(dlx.pt, gia.bX);
        this.b(dlx.pu, gia.bX);
        this.b(dlx.qW, gia.bZ);
        this.b(dlx.qA, gia.bZ);
        this.b(dlx.qB, gia.bZ);
        this.b(dlx.qz, gia.bZ);
        this.b(dlx.qy, gia.bZ);
        this.b(dlx.qx, gia.bZ);
        this.b(dlx.tE, gia.bX);
        this.b(dlx.yA, gia.bX);
        this.b(dlx.pl, gia.bX);
        this.b(dlx.xP, gia.bX);
        this.b(dlx.tf, gia.bX);
        this.b(dlx.su, gia.bX);
        this.b(dlx.sv, gia.bX);
        this.b(dlx.sw, gia.bX);
        this.b(dlx.sl, gia.bX);
        this.b(dlx.rc, gia.bX);
        this.b(dlx.tm, gia.bX);
        this.b(dlx.wj, gia.bX);
        this.b(dlx.wn, gia.cs);
        this.b(dlx.qq, gia.bZ);
        this.b(dlx.qr, gia.bZ);
        this.b(dlx.qp, gia.bZ);
        this.b(dlx.qo, gia.bZ);
        this.b(dlx.qn, gia.bZ);
        this.b(dlx.wk, gia.bX);
        this.b(dlx.wl, gia.bX);
        this.b(dlx.tq, gia.bX);
        this.b(dlx.Ab, gia.bX);
        this.b(dlx.Ac, gia.bX);
        this.b(dlx.Ad, gia.bX);
        this.b(dlx.Ae, gia.bX);
        this.b(dlx.Af, gia.bX);
        this.b(dlx.Ag, gia.bX);
        this.b(dlx.Ah, gia.bX);
        this.b(dlx.Ai, gia.bX);
        this.b(dlx.Aj, gia.bX);
        this.b(dlx.Ak, gia.bX);
        this.b(dlx.Al, gia.bX);
        this.b(dlx.Am, gia.bX);
        this.b(dlx.An, gia.bX);
        this.b(dlx.Ao, gia.bX);
        this.b(dlx.Ap, gia.bX);
        this.b(dlx.Aq, gia.bX);
        this.b(dlx.Ar, gia.bX);
        this.b(dlx.As, gia.bX);
        this.b(dlx.At, gia.bX);
        this.b(dlx.xU, dlx.qW, gia.bZ);
        this.b(dlx.rL, dlx.rK, gia.bX);
        this.a(dlx.pP, dum.h, a, false);
        this.a(dlx.re, dum.b, a, true);
        this.a(dlx.rf, dum.b, b, true);
        this.a(dlx.rg, dum.b, c, true);
        this.a(dlx.rh, dum.b, d, true);
        this.a(dlx.ri, dum.c, a, false);
        this.a(dlx.rj, dum.c, b, false);
        this.a(dlx.rk, dum.c, c, false);
        this.a(dlx.rl, dum.c, d, false);
        this.a(dlx.rm, dum.d, a, false);
        this.a(dlx.rn, dum.d, b, false);
        this.a(dlx.ro, dum.d, c, false);
        this.a(dlx.rp, dum.d, d, false);
        this.a(dlx.rq, dum.e, a, false);
        this.a(dlx.rr, dum.e, b, false);
        this.a(dlx.rs, dum.e, c, false);
        this.a(dlx.rt, dum.e, d, false);
        this.a(dlx.ru, dum.g, a, false);
        this.a(dlx.rv, dum.g, b, false);
        this.a(dlx.rw, dum.g, c, false);
        this.a(dlx.rx, dum.g, d, false);
        this.a(dlx.ry, dum.f, a, false);
        this.a(dlx.rz, dum.f, b, false);
        this.a(dlx.rA, dum.f, c, false);
        this.a(dlx.rB, dum.f, d, false);
        this.a(dlx.rC, dum.i, a, false);
        this.a(dlx.rD, dum.i, b, false);
        this.a(dlx.rE, dum.i, c, false);
        this.a(dlx.rF, dum.i, d, false);
        this.a(dlx.wY, -6265536);
        this.b(dlx.Au, gia.bX);
        this.b(dlx.Av, gia.bX);
        this.b(dlx.Aw, gia.bX);
        this.b(dlx.Ax, gia.bX);
        this.b(dlx.Ay, gia.bX);
        this.b(dlx.Az, gia.bX);
        this.b(dlx.AA, gia.bX);
        this.b(dlx.AB, gia.bX);
        this.b(dlx.AC, gia.bX);
        this.b(dlx.AD, gia.bX);
        this.b(dlx.AE, gia.bX);
        this.b(dlx.AF, gia.bX);
        this.b(dlx.AG, gia.bX);
        this.b(dlx.AH, gia.bX);
        this.b(dlx.AI, gia.bX);
        this.b(dlx.AJ, gia.bX);
        this.b(dlx.AK, gia.bX);
        this.b(dlx.AL, gia.bX);
        this.b(dlx.AM, gia.bX);
        this.b(dlx.AN, gia.bX);
        this.b(dlx.AO, gia.bX);
        this.b(dlx.AP, gia.bX);
        this.b(dlx.AQ, gia.bX);
        this.b(dlx.By, gia.bX);
        this.b(dlx.Bz, gia.bX);
        this.b(dlx.BB, gia.bX);
        this.a(dlx.wH, new ggx());
        this.a(dlx.tY, "_markings", new ghb());
        this.f(dlx.sI);
        this.f(dlx.sY);
        this.f(dlx.sJ);
        this.f(dlx.sQ);
        this.f(dlx.sR);
        this.f(dlx.sM);
        this.f(dlx.sU);
        this.f(dlx.sS);
        this.f(dlx.sN);
        this.f(dlx.sX);
        this.f(dlx.sT);
        this.f(dlx.sL);
        this.f(dlx.sP);
        this.f(dlx.sW);
        this.f(dlx.sO);
        this.f(dlx.sV);
        this.f(dlx.sK);
        this.n(dlx.tb);
        this.o(dlx.yr);
        this.s(dlx.pS);
        this.b(dlx.oS, gia.bX);
        this.b(dlx.oT, gia.bX);
        this.b(dlx.oU, gia.bX);
        this.b(dlx.oV, gia.bX);
        this.b(dlx.oW, gia.bX);
        this.b(dlx.oX, gia.bX);
        this.b(dlx.oY, gia.bX);
        this.b(dlx.oZ, gia.bX);
        this.b(dlx.pa, gia.bX);
        this.b(dlx.pb, gia.bX);
        this.b(dlx.pc, gia.bX);
        this.b(dlx.pd, gia.bX);
        this.b(dlx.pe, gia.bX);
        this.b(dlx.pf, gia.bX);
        this.b(dlx.pg, gia.bX);
        this.b(dlx.ph, gia.bX);
        this.g(dlx.pW);
        this.h(dlx.yz);
        this.i(dlx.pq);
        this.j(dlx.Aa);
        this.k(dlx.sZ);
        this.l(dlx.yM);
        this.m(dlx.xH);
        this.p(dlx.xI);
        this.p(dlx.xJ);
        this.p(dlx.xK);
        this.p(dlx.xM);
        this.p(dlx.xL);
        this.p(dlx.xN);
        this.p(dlx.xO);
        this.r(dlx.xF);
        this.q(dlx.up);
        this.q(dlx.xD);
        this.q(dlx.xG);
        this.b(dlx.uy, gia.bX);
        this.b(dlx.uz, gia.bX);
        this.b(dlx.uA, gia.bX);
        this.b(dlx.uB, gia.bX);
        this.b(dlx.uC, gia.bX);
        this.b(dlx.uD, gia.bX);
        this.b(dlx.uE, gia.bX);
        this.b(dlx.uF, gia.bX);
        this.b(dlx.uG, gia.bX);
        this.b(dlx.uH, gia.bX);
        this.b(dlx.uI, gia.bX);
        this.b(dlx.uJ, gia.bX);
        this.b(dlx.uK, gia.bX);
        this.b(dlx.uL, gia.bX);
        this.b(dlx.uM, gia.bX);
        this.b(dlx.uN, gia.bX);
        this.b(dlx.uO, gia.bX);
        this.b(dlx.uP, gia.bX);
        this.b(dlx.uQ, gia.bX);
        this.b(dlx.uR, gia.bX);
        this.b(dlx.uS, gia.bX);
        this.b(dlx.uT, gia.bX);
        this.b(dlx.uU, gia.bX);
        this.b(dlx.uV, gia.bX);
        this.b(dlx.uW, gia.bX);
        this.b(dlx.uX, gia.bX);
        this.b(dlx.uY, gia.bX);
        this.b(dlx.uZ, gia.bX);
        this.b(dlx.va, gia.bX);
        this.b(dlx.vb, gia.bX);
        this.b(dlx.vc, gia.bX);
        this.b(dlx.vd, gia.bX);
        this.b(dlx.ve, gia.bX);
        this.b(dlx.vf, gia.bX);
        this.b(dlx.vg, gia.bX);
        this.b(dlx.vh, gia.bX);
        this.b(dlx.vi, gia.bX);
        this.b(dlx.vj, gia.bX);
        this.b(dlx.vk, gia.bX);
        this.b(dlx.vl, gia.bX);
        this.b(dlx.vm, gia.bX);
        this.b(dlx.vn, gia.bX);
        this.b(dlx.vo, gia.bX);
        this.b(dlx.vp, gia.bX);
        this.b(dlx.vq, gia.bX);
        this.b(dlx.vr, gia.bX);
        this.b(dlx.vs, gia.bX);
        this.b(dlx.vt, gia.bX);
        this.b(dlx.vu, gia.bX);
        this.b(dlx.vv, gia.bX);
        this.b(dlx.vw, gia.bX);
        this.b(dlx.vx, gia.bX);
        this.b(dlx.vy, gia.bX);
        this.b(dlx.vz, gia.bX);
        this.b(dlx.vA, gia.bX);
        this.b(dlx.vB, gia.bX);
        this.b(dlx.vC, gia.bX);
        this.b(dlx.vD, gia.bX);
        this.b(dlx.vE, gia.bX);
        this.b(dlx.vF, gia.bX);
        this.b(dlx.vG, gia.bX);
        this.b(dlx.vH, gia.bX);
        this.b(dlx.vI, gia.bX);
        this.b(dlx.vJ, gia.bX);
        this.b(dlx.vK, gia.bX);
        this.b(dlx.vL, gia.bX);
        this.b(dlx.vM, gia.bX);
        this.b(dlx.vN, gia.bX);
        this.b(dlx.vO, gia.bX);
        this.b(dlx.vP, gia.bX);
        this.b(dlx.vQ, gia.bX);
        this.b(dlx.vS, gia.bX);
        this.b(dlx.vR, gia.bX);
        this.b(dlx.vT, gia.bX);
        this.b(dlx.vU, gia.bX);
        this.b(dlx.vV, gia.bX);
        this.b(dlx.vW, gia.bX);
        this.b(dlx.vX, gia.bX);
        this.b(dlx.vY, gia.bX);
        this.b(dlx.vZ, gia.bX);
        this.b(dlx.wa, gia.bX);
        this.b(dlx.wb, gia.bX);
        this.b(dlx.wc, gia.bX);
        this.b(dlx.wd, gia.bX);
        this.b(dlx.we, gia.bX);
        this.b(dlx.wf, gia.bX);
        this.b(dlx.wg, gia.bX);
        this.a(dlx.a);
        this.a(dlx.zT);
        this.a(dlx.zQ);
        this.a(dlx.zR);
        this.a(dlx.zS);
        this.a(dlx.ei);
        this.a(dlx.eh);
        this.a(dlx.eg);
        this.a(dlx.zU);
        this.a(dlx.tD);
        this.a(dlx.td);
        this.a(dlx.qZ);
        this.a(dlx.wZ);
    }

    public static final class a
    extends Record {
        private final duq a;
        final amt<dur> b;

        public a(duq $$0, amt<dur> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "assets;materialKey", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "assets;materialKey", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "assets;materialKey", "a", "b"}, this, $$0);
        }

        public duq a() {
            return this.a;
        }

        public amt<dur> b() {
            return this.b;
        }
    }
}

