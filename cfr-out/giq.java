/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Ordering
 *  org.apache.commons.lang3.tuple.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Ordering;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Pair;
import org.jspecify.annotations.Nullable;

public class giq {
    private static final amo c = amo.b("hud/crosshair");
    private static final amo d = amo.b("hud/crosshair_attack_indicator_full");
    private static final amo e = amo.b("hud/crosshair_attack_indicator_background");
    private static final amo f = amo.b("hud/crosshair_attack_indicator_progress");
    private static final amo g = amo.b("hud/effect_background_ambient");
    private static final amo h = amo.b("hud/effect_background");
    private static final amo i = amo.b("hud/hotbar");
    private static final amo j = amo.b("hud/hotbar_selection");
    private static final amo k = amo.b("hud/hotbar_offhand_left");
    private static final amo l = amo.b("hud/hotbar_offhand_right");
    private static final amo m = amo.b("hud/hotbar_attack_indicator_background");
    private static final amo n = amo.b("hud/hotbar_attack_indicator_progress");
    private static final amo o = amo.b("hud/armor_empty");
    private static final amo p = amo.b("hud/armor_half");
    private static final amo q = amo.b("hud/armor_full");
    private static final amo r = amo.b("hud/food_empty_hunger");
    private static final amo s = amo.b("hud/food_half_hunger");
    private static final amo t = amo.b("hud/food_full_hunger");
    private static final amo u = amo.b("hud/food_empty");
    private static final amo v = amo.b("hud/food_half");
    private static final amo w = amo.b("hud/food_full");
    private static final amo x = amo.b("hud/air");
    private static final amo y = amo.b("hud/air_bursting");
    private static final amo z = amo.b("hud/air_empty");
    private static final amo A = amo.b("hud/heart/vehicle_container");
    private static final amo B = amo.b("hud/heart/vehicle_full");
    private static final amo C = amo.b("hud/heart/vehicle_half");
    private static final amo D = amo.b("textures/misc/vignette.png");
    public static final amo a = amo.b("textures/misc/nausea.png");
    private static final amo E = amo.b("textures/misc/spyglass_scope.png");
    private static final amo F = amo.b("textures/misc/powder_snow_outline.png");
    private static final Comparator<fuk> G = Comparator.comparing(fuk::d).reversed().thenComparing(fuk::c, String.CASE_INSENSITIVE_ORDER);
    private static final yh H = yh.c("demo.demoExpired");
    private static final yh I = yh.c("menu.savingLevel");
    private static final float J = 5.0f;
    private static final int K = 100;
    private static final int L = 10;
    private static final int M = 10;
    private static final String N = ": ";
    private static final float O = 0.2f;
    private static final int P = 9;
    private static final int Q = 8;
    private static final int R = 10;
    private static final int S = 9;
    private static final int T = 8;
    private static final int U = 2;
    private static final int V = 1;
    private static final float W = 0.5f;
    private static final float X = 0.1f;
    private static final float Y = 1.0f;
    private static final float Z = 0.1f;
    private static final int aa = 3;
    private static final int ab = 5;
    private static final float ac = 0.2f;
    private static final int ad = 5;
    private static final int ae = 5;
    private final bgr af = bgr.a();
    private final gfj ag;
    private final gjf ah;
    private int ai;
    private @Nullable yh aj;
    private int ak;
    private boolean al;
    private boolean am;
    public float b = 1.0f;
    private int an;
    private dlt ao = dlt.l;
    private final gjm ap;
    private final gkp aq;
    private final gmp ar;
    private final gkg as;
    private final gjd at;
    private int au;
    private @Nullable yh av;
    private @Nullable yh aw;
    private int ax;
    private int ay;
    private int az;
    private int aA;
    private int aB;
    private long aC;
    private long aD;
    private int aE;
    private @Nullable Runnable aF;
    private float aG;
    private float aH;
    private Pair<b, gnf> aI = Pair.of((Object)((Object)giq$b.a), (Object)gnf.d);
    private final Map<b, Supplier<gnf>> aJ;
    private float aK;

    public giq(gfj $$0) {
        this.ag = $$0;
        this.ap = new gjm($$0);
        this.ar = new gmp($$0);
        this.ah = new gjf($$0);
        this.as = new gkg($$0, this);
        this.at = new gjd($$0);
        this.aq = new gkp($$0);
        this.aJ = ImmutableMap.of((Object)((Object)giq$b.a), () -> gnf.d, (Object)((Object)giq$b.b), () -> new gng($$0), (Object)((Object)giq$b.c), () -> new gni($$0), (Object)((Object)giq$b.d), () -> new gnh($$0));
        this.a();
    }

    public void a() {
        this.ax = 10;
        this.ay = 70;
        this.az = 20;
    }

    public void a(gir $$0, gez $$1) {
        if (this.ag.x instanceof grp) {
            return;
        }
        if (!this.ag.k.au) {
            this.d($$0, $$1);
            this.k($$0, $$1);
            $$0.c();
            this.m($$0, $$1);
            this.l($$0, $$1);
            this.c($$0, $$1);
        }
        this.e($$0, $$1);
        if (!this.ag.k.au) {
            this.o($$0, $$1);
            this.i($$0, $$1);
            this.f($$0, $$1);
            this.g($$0, $$1);
            this.h($$0, $$1);
            this.j($$0, $$1);
            this.a($$0, this.ag.x == null || this.ag.x.v());
        } else if (this.ag.x != null && this.ag.x.v()) {
            this.a($$0, true);
        }
    }

    private void c(gir $$0, gez $$1) {
        this.at.a($$0);
    }

    public void a(gir $$0) {
        this.ap.a($$0);
    }

    private void a(gir $$0, boolean $$1) {
        if ($$1) {
            this.aF = () -> this.aq.a($$0);
        } else {
            this.aF = null;
            this.aq.a($$0);
        }
    }

    public void b() {
        if (this.aF != null) {
            this.aF.run();
            this.aF = null;
        }
    }

    private void d(gir $$02, gez $$1) {
        float $$10;
        if (this.ag.k.o().b().booleanValue()) {
            this.a($$02, this.ag.au());
        }
        hnh $$2 = this.ag.s;
        float $$3 = $$1.a();
        this.aK = bgj.h(0.5f * $$3, this.aK, 1.125f);
        if (this.ag.k.aV().a()) {
            if ($$2.hj()) {
                this.a($$02, this.aK);
            } else {
                this.aK = 0.5f;
                for (cgv $$4 : cgv.values()) {
                    dlt $$5 = $$2.a($$4);
                    dun $$6 = $$5.a(ki.H);
                    if ($$6 == null || $$6.b() != $$4 || !$$6.e().isPresent()) continue;
                    this.a($$02, $$6.e().get().a($$0 -> "textures/" + $$0 + ".png"), 1.0f);
                }
            }
        }
        if ($$2.cM() > 0) {
            this.a($$02, F, $$2.cN());
        }
        float $$7 = $$1.a(false);
        float $$8 = bgj.h($$7, $$2.cB, $$2.k);
        float $$9 = $$2.a(cfo.i, $$7);
        if ($$8 > 0.0f) {
            this.b($$02, $$8);
        } else if ($$9 > 0.0f && ($$10 = this.ag.k.aB().b().floatValue()) < 1.0f) {
            float $$11 = $$9 * (1.0f - $$10);
            this.c($$02, $$11);
        }
    }

    private void e(gir $$0, gez $$1) {
        if (this.ag.s.gQ() <= 0) {
            return;
        }
        bzl.a().a("sleep");
        $$0.c();
        float $$2 = this.ag.s.gQ();
        float $$3 = $$2 / 100.0f;
        if ($$3 > 1.0f) {
            $$3 = 1.0f - ($$2 - 100.0f) / 10.0f;
        }
        int $$4 = (int)(220.0f * $$3) << 24 | 0x101020;
        $$0.a(0, 0, $$0.a(), $$0.b(), $$4);
        bzl.a().c();
    }

    private void f(gir $$0, gez $$1) {
        gio $$2 = this.g();
        if (this.aj == null || this.ak <= 0) {
            return;
        }
        bzl.a().a("overlayMessage");
        float $$3 = (float)this.ak - $$1.a(false);
        int $$4 = (int)($$3 * 255.0f / 20.0f);
        if ($$4 > 255) {
            $$4 = 255;
        }
        if ($$4 > 0) {
            int $$6;
            $$0.c();
            $$0.e().pushMatrix();
            $$0.e().translate((float)($$0.a() / 2), (float)($$0.b() - 68));
            if (this.al) {
                int $$5 = bgj.a($$3 / 50.0f, 0.7f, 0.6f, $$4);
            } else {
                $$6 = bel.i($$4);
            }
            int $$7 = $$2.a(this.aj);
            $$0.a($$2, this.aj, -$$7 / 2, -4, $$7, $$6);
            $$0.e().popMatrix();
        }
        bzl.a().c();
    }

    private void g(gir $$0, gez $$1) {
        if (this.av == null || this.au <= 0) {
            return;
        }
        gio $$2 = this.g();
        bzl.a().a("titleAndSubtitle");
        float $$3 = (float)this.au - $$1.a(false);
        int $$4 = 255;
        if (this.au > this.az + this.ay) {
            float $$5 = (float)(this.ax + this.ay + this.az) - $$3;
            $$4 = (int)($$5 * 255.0f / (float)this.ax);
        }
        if (this.au <= this.az) {
            $$4 = (int)($$3 * 255.0f / (float)this.az);
        }
        if (($$4 = bgj.a($$4, 0, 255)) > 0) {
            $$0.c();
            $$0.e().pushMatrix();
            $$0.e().translate((float)($$0.a() / 2), (float)($$0.b() / 2));
            $$0.e().pushMatrix();
            $$0.e().scale(4.0f, 4.0f);
            int $$6 = $$2.a(this.av);
            int $$7 = bel.i($$4);
            $$0.a($$2, this.av, -$$6 / 2, -10, $$6, $$7);
            $$0.e().popMatrix();
            if (this.aw != null) {
                $$0.e().pushMatrix();
                $$0.e().scale(2.0f, 2.0f);
                int $$8 = $$2.a(this.aw);
                $$0.a($$2, this.aw, -$$8 / 2, 5, $$8, $$7);
                $$0.e().popMatrix();
            }
            $$0.e().popMatrix();
        }
        bzl.a().c();
    }

    private void h(gir $$0, gez $$1) {
        if (!this.ah.e()) {
            fyk $$2 = this.ag.aR();
            int $$3 = bgj.c(this.ag.n.b($$2));
            int $$4 = bgj.c(this.ag.n.c($$2));
            $$0.c();
            this.ah.a($$0, this.g(), this.ai, $$3, $$4, false, false);
        }
    }

    private void i(gir $$0, gez $$1) {
        fuj $$6;
        fui $$5;
        fur $$2 = this.ag.r.ab();
        fuj $$3 = null;
        fum $$4 = $$2.e(this.ag.s.da());
        if ($$4 != null && ($$5 = fui.a($$4.o())) != null) {
            $$3 = $$2.a($$5);
        }
        fuj fuj2 = $$6 = $$3 != null ? $$3 : $$2.a(fui.b);
        if ($$6 != null) {
            $$0.c();
            this.a($$0, $$6);
        }
    }

    private void j(gir $$0, gez $$1) {
        fur $$2 = this.ag.r.ab();
        fuj $$3 = $$2.a(fui.a);
        if (this.ag.k.G.f() && (!this.ag.Y() || this.ag.s.b.n().size() > 1 || $$3 != null)) {
            this.as.a(true);
            $$0.c();
            this.as.a($$0, $$0.a(), $$2, $$3);
        } else {
            this.as.a(false);
        }
    }

    private void k(gir $$0, gez $$1) {
        gfo $$2 = this.ag.k;
        if (!$$2.aV().a()) {
            return;
        }
        if (this.ag.q.i() == dwl.d && !this.a(this.ag.u)) {
            return;
        }
        if (!this.ag.m.b(glx.y)) {
            $$0.c();
            int $$3 = 15;
            $$0.a(hpa.aA, c, ($$0.a() - 15) / 2, ($$0.b() - 15) / 2, 15, 15);
            if (this.ag.k.O().b() == geq.b) {
                float $$4 = this.ag.s.I(0.0f);
                boolean $$5 = false;
                if (this.ag.t != null && this.ag.t instanceof chl && $$4 >= 1.0f) {
                    $$5 = this.ag.s.he() > 5.0f;
                    $$5 &= this.ag.t.cb();
                    dnu $$6 = this.ag.s.fA().a(ki.F);
                    $$5 &= $$6 == null || $$6.a(this.ag.s, this.ag.u.g());
                }
                int $$7 = $$0.b() / 2 - 7 + 16;
                int $$8 = $$0.a() / 2 - 8;
                if ($$5) {
                    $$0.a(hpa.aA, d, $$8, $$7, 16, 16);
                } else if ($$4 < 1.0f) {
                    int $$9 = (int)($$4 * 17.0f);
                    $$0.a(hpa.aA, e, $$8, $$7, 16, 4);
                    $$0.a(hpa.aA, f, 16, 4, 0, 0, $$8, $$7, $$9, 4);
                }
            }
        }
    }

    private boolean a(@Nullable ftk $$0) {
        if ($$0 == null) {
            return false;
        }
        if ($$0.d() == ftk.a.c) {
            return ((ftj)$$0).a() instanceof cdf;
        }
        if ($$0.d() == ftk.a.b) {
            hif $$2 = this.ag.r;
            is $$1 = ((fti)$$0).b();
            return $$2.a_($$1).a((dwo)$$2, $$1) != null;
        }
        return false;
    }

    private void l(gir $$0, gez $$1) {
        Collection<cfm> $$2 = this.ag.s.eW();
        if ($$2.isEmpty() || this.ag.x != null && this.ag.x.D()) {
            return;
        }
        int $$3 = 0;
        int $$4 = 0;
        for (cfm $$5 : Ordering.natural().reverse().sortedCopy($$2)) {
            jd<cfk> $$6 = $$5.c();
            if (!$$5.h()) continue;
            int $$7 = $$0.a();
            int $$8 = 1;
            if (this.ag.P()) {
                $$8 += 15;
            }
            if ($$6.a().j()) {
                $$7 -= 25 * ++$$3;
            } else {
                $$7 -= 25 * ++$$4;
                $$8 += 26;
            }
            float $$9 = 1.0f;
            if ($$5.f()) {
                $$0.a(hpa.at, g, $$7, $$8, 24, 24);
            } else {
                $$0.a(hpa.at, h, $$7, $$8, 24, 24);
                if ($$5.a(200)) {
                    int $$10 = $$5.d();
                    int $$11 = 10 - $$10 / 20;
                    $$9 = bgj.a((float)$$10 / 10.0f / 5.0f * 0.5f, 0.0f, 0.5f) + bgj.b((double)((float)$$10 * (float)Math.PI / 5.0f)) * bgj.a((float)$$11 / 10.0f * 0.25f, 0.0f, 0.25f);
                    $$9 = bgj.a($$9, 0.0f, 1.0f);
                }
            }
            $$0.a(hpa.at, giq.a($$6), $$7 + 3, $$8 + 3, 18, 18, bel.b($$9));
        }
    }

    public static amo a(jd<cfk> $$02) {
        return $$02.e().map(amt::a).map($$0 -> $$0.f("mob_effect/")).orElseGet(ilf::c);
    }

    private void m(gir $$0, gez $$1) {
        if (this.ag.q.i() == dwl.d) {
            this.ar.a($$0);
        } else {
            this.n($$0, $$1);
        }
        if (this.ag.q.a()) {
            this.c($$0);
        }
        this.d($$0);
        b $$2 = this.t();
        if ($$2 != this.aI.getKey()) {
            this.aI = Pair.of((Object)((Object)$$2), (Object)this.aJ.get((Object)$$2).get());
        }
        ((gnf)this.aI.getValue()).a($$0, $$1);
        if (this.ag.q.d() && this.ag.s.cs > 0) {
            gnf.a($$0, this.ag.g, this.ag.s.cs);
        }
        ((gnf)this.aI.getValue()).b($$0, $$1);
        if (this.ag.q.i() != dwl.d) {
            this.b($$0);
        } else if (this.ag.s.au()) {
            this.ar.b($$0);
        }
    }

    private void n(gir $$0, gez $$1) {
        float $$13;
        ddm $$2 = this.n();
        if ($$2 == null) {
            return;
        }
        dlt $$3 = $$2.fy();
        chb $$4 = $$2.at().a();
        int $$5 = $$0.a() / 2;
        int $$6 = 182;
        int $$7 = 91;
        $$0.a(hpa.at, i, $$5 - 91, $$0.b() - 22, 182, 22);
        $$0.a(hpa.at, j, $$5 - 91 - 1 + $$2.gK().g() * 20, $$0.b() - 22 - 1, 24, 23);
        if (!$$3.f()) {
            if ($$4 == chb.a) {
                $$0.a(hpa.at, k, $$5 - 91 - 29, $$0.b() - 23, 29, 24);
            } else {
                $$0.a(hpa.at, l, $$5 + 91, $$0.b() - 23, 29, 24);
            }
        }
        int $$8 = 1;
        for (int $$9 = 0; $$9 < 9; ++$$9) {
            int $$10 = $$5 - 90 + $$9 * 20 + 2;
            int $$11 = $$0.b() - 16 - 3;
            this.a($$0, $$10, $$11, $$1, $$2, $$2.gK().a($$9), $$8++);
        }
        if (!$$3.f()) {
            int $$12 = $$0.b() - 16 - 3;
            if ($$4 == chb.a) {
                this.a($$0, $$5 - 91 - 26, $$12, $$1, $$2, $$3, $$8++);
            } else {
                this.a($$0, $$5 + 91 + 10, $$12, $$1, $$2, $$3, $$8++);
            }
        }
        if (this.ag.k.O().b() == geq.c && ($$13 = this.ag.s.I(0.0f)) < 1.0f) {
            int $$14 = $$0.b() - 20;
            int $$15 = $$5 + 91 + 6;
            if ($$4 == chb.b) {
                $$15 = $$5 - 91 - 22;
            }
            int $$16 = (int)($$13 * 19.0f);
            $$0.a(hpa.at, m, $$15, $$14, 18, 18);
            $$0.a(hpa.at, n, 18, 18, 0, 18 - $$16, $$15, $$14 + 18 - $$16, 18, $$16);
        }
    }

    private void b(gir $$0) {
        bzl.a().a("selectedItemName");
        if (this.an > 0 && !this.ao.f()) {
            int $$5;
            yw $$1 = yh.i().b(this.ao.y()).a(this.ao.D().a());
            if (this.ao.c(ki.h)) {
                $$1.a(l.u);
            }
            int $$2 = this.g().a($$1);
            int $$3 = ($$0.a() - $$2) / 2;
            int $$4 = $$0.b() - 59;
            if (!this.ag.q.a()) {
                $$4 += 14;
            }
            if (($$5 = (int)((float)this.an * 256.0f / 10.0f)) > 255) {
                $$5 = 255;
            }
            if ($$5 > 0) {
                $$0.a(this.g(), (yh)$$1, $$3, $$4, $$2, bel.i($$5));
            }
        }
        bzl.a().c();
    }

    private void o(gir $$0, gez $$1) {
        yw $$3;
        if (!this.ag.P()) {
            return;
        }
        bzl.a().a("demo");
        $$0.c();
        if (this.ag.r.au() >= 120500L) {
            yh $$2 = H;
        } else {
            $$3 = yh.a("demo.remainingTime", new Object[]{bhi.a((int)(120500L - this.ag.r.au()), this.ag.r.y().f())});
        }
        int $$4 = this.g().a($$3);
        int $$5 = $$0.a() - $$4 - 10;
        int $$6 = 5;
        $$0.a(this.g(), (yh)$$3, $$5, 5, $$4, -1);
        bzl.a().c();
    }

    private void a(gir $$02, fuj $$1) {
        int $$6;
        fur $$22 = $$1.b();
        aag $$3 = $$1.a(aaj.c);
        final class A
        extends Record {
            final yh a;
            final yh b;
            final int c;

            A(yh $$0, yh $$1, int $$2) {
                this.a = $$0;
                this.b = $$1;
                this.c = $$2;
            }

            @Override
            public final String toString() {
                return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "name;score;scoreWidth", "a", "b", "c"}, this);
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "name;score;scoreWidth", "a", "b", "c"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "name;score;scoreWidth", "a", "b", "c"}, this, $$0);
            }

            public yh a() {
                return this.a;
            }

            public yh b() {
                return this.b;
            }

            public int c() {
                return this.c;
            }
        }
        A[] $$4 = (A[])$$22.i($$1).stream().filter($$0 -> !$$0.a()).sorted(G).limit(15L).map($$2 -> {
            fum $$3 = $$22.e($$2.c());
            yh $$4 = $$2.b();
            yw $$5 = fum.a($$3, $$4);
            yw $$6 = $$2.a($$3);
            int $$7 = this.g().a($$6);
            return new A($$5, $$6, $$7);
        }).toArray($$0 -> new A[$$0]);
        yh $$5 = $$1.e();
        int $$7 = $$6 = this.g().a($$5);
        int $$8 = this.g().b(N);
        for (A $$9 : $$4) {
            $$7 = Math.max($$7, this.g().a($$9.a) + ($$9.c > 0 ? $$8 + $$9.c : 0));
        }
        int $$10 = $$7;
        int $$11 = $$4.length;
        int $$12 = $$11 * this.g().b;
        int $$13 = $$02.b() / 2 + $$12 / 3;
        int $$14 = 3;
        int $$15 = $$02.a() - $$10 - 3;
        int $$16 = $$02.a() - 3 + 2;
        int $$17 = this.ag.k.b(0.3f);
        int $$18 = this.ag.k.b(0.4f);
        int $$19 = $$13 - $$11 * this.g().b;
        $$02.a($$15 - 2, $$19 - this.g().b - 1, $$16, $$19 - 1, $$18);
        $$02.a($$15 - 2, $$19 - 1, $$16, $$13, $$17);
        $$02.a(this.g(), $$5, $$15 + $$10 / 2 - $$6 / 2, $$19 - this.g().b, -1, false);
        for (int $$20 = 0; $$20 < $$11; ++$$20) {
            A $$21 = $$4[$$20];
            int $$222 = $$13 - ($$11 - $$20) * this.g().b;
            $$02.a(this.g(), $$21.a, $$15, $$222, -1, false);
            $$02.a(this.g(), $$21.b, $$16 - $$21.c, $$222, -1, false);
        }
    }

    private @Nullable ddm n() {
        ddm $$0;
        cgk cgk2 = this.ag.au();
        return cgk2 instanceof ddm ? ($$0 = (ddm)cgk2) : null;
    }

    private @Nullable chl o() {
        ddm $$0 = this.n();
        if ($$0 != null) {
            cgk $$1 = $$0.dz();
            if ($$1 == null) {
                return null;
            }
            if ($$1 instanceof chl) {
                return (chl)$$1;
            }
        }
        return null;
    }

    private int a(@Nullable chl $$0) {
        if ($$0 == null || !$$0.cd()) {
            return 0;
        }
        float $$1 = $$0.fq();
        int $$2 = (int)($$1 + 0.5f) / 2;
        if ($$2 > 30) {
            $$2 = 30;
        }
        return $$2;
    }

    private int a(int $$0) {
        return (int)Math.ceil((double)$$0 / 10.0);
    }

    private void c(gir $$0) {
        ddm $$1 = this.n();
        if ($$1 == null) {
            return;
        }
        int $$2 = bgj.d($$1.eZ());
        boolean $$3 = this.aD > (long)this.ai && (this.aD - (long)this.ai) / 3L % 2L == 1L;
        long $$4 = bhs.c();
        if ($$2 < this.aA && $$1.ax > 0) {
            this.aC = $$4;
            this.aD = this.ai + 20;
        } else if ($$2 > this.aA && $$1.ax > 0) {
            this.aC = $$4;
            this.aD = this.ai + 10;
        }
        if ($$4 - this.aC > 1000L) {
            this.aB = $$2;
            this.aC = $$4;
        }
        this.aA = $$2;
        int $$5 = this.aB;
        this.af.b((long)(this.ai * 312871));
        int $$6 = $$0.a() / 2 - 91;
        int $$7 = $$0.a() / 2 + 91;
        int $$8 = $$0.b() - 39;
        float $$9 = Math.max((float)$$1.i(cis.u), (float)Math.max($$5, $$2));
        int $$10 = bgj.d($$1.fX());
        int $$11 = bgj.d(($$9 + (float)$$10) / 2.0f / 10.0f);
        int $$12 = Math.max(10 - ($$11 - 2), 3);
        int $$13 = $$8 - 10;
        int $$14 = -1;
        if ($$1.d(cfo.j)) {
            $$14 = this.ai % bgj.d($$9 + 5.0f);
        }
        bzl.a().a("armor");
        giq.a($$0, $$1, $$8, $$11, $$12, $$6);
        bzl.a().b("health");
        this.a($$0, $$1, $$6, $$8, $$12, $$14, $$9, $$2, $$5, $$10, $$3);
        chl $$15 = this.o();
        int $$16 = this.a($$15);
        if ($$16 == 0) {
            bzl.a().b("food");
            this.a($$0, $$1, $$8, $$7);
            $$13 -= 10;
        }
        bzl.a().b("air");
        this.a($$0, $$1, $$16, $$13, $$7);
        bzl.a().c();
    }

    private static void a(gir $$0, ddm $$1, int $$2, int $$3, int $$4, int $$5) {
        int $$6 = $$1.fn();
        if ($$6 <= 0) {
            return;
        }
        int $$7 = $$2 - ($$3 - 1) * $$4 - 10;
        for (int $$8 = 0; $$8 < 10; ++$$8) {
            int $$9 = $$5 + $$8 * 8;
            if ($$8 * 2 + 1 < $$6) {
                $$0.a(hpa.at, q, $$9, $$7, 9, 9);
            }
            if ($$8 * 2 + 1 == $$6) {
                $$0.a(hpa.at, p, $$9, $$7, 9, 9);
            }
            if ($$8 * 2 + 1 <= $$6) continue;
            $$0.a(hpa.at, o, $$9, $$7, 9, 9);
        }
    }

    private void a(gir $$0, ddm $$1, int $$2, int $$3, int $$4, int $$5, float $$6, int $$7, int $$8, int $$9, boolean $$10) {
        c $$11 = giq$c.a($$1);
        boolean $$12 = $$1.ao().D_().k();
        int $$13 = bgj.e((double)$$6 / 2.0);
        int $$14 = bgj.e((double)$$9 / 2.0);
        int $$15 = $$13 * 2;
        for (int $$16 = $$13 + $$14 - 1; $$16 >= 0; --$$16) {
            int $$23;
            boolean $$22;
            int $$17 = $$16 / 10;
            int $$18 = $$16 % 10;
            int $$19 = $$2 + $$18 * 8;
            int $$20 = $$3 - $$17 * $$4;
            if ($$7 + $$9 <= 4) {
                $$20 += this.af.a(2);
            }
            if ($$16 < $$13 && $$16 == $$5) {
                $$20 -= 2;
            }
            this.a($$0, giq$c.a, $$19, $$20, $$12, $$10, false);
            int $$21 = $$16 * 2;
            boolean bl2 = $$22 = $$16 >= $$13;
            if ($$22 && ($$23 = $$21 - $$15) < $$9) {
                boolean $$24 = $$23 + 1 == $$9;
                this.a($$0, $$11 == giq$c.d ? $$11 : giq$c.e, $$19, $$20, $$12, false, $$24);
            }
            if ($$10 && $$21 < $$8) {
                boolean $$25 = $$21 + 1 == $$8;
                this.a($$0, $$11, $$19, $$20, $$12, true, $$25);
            }
            if ($$21 >= $$7) continue;
            boolean $$26 = $$21 + 1 == $$7;
            this.a($$0, $$11, $$19, $$20, $$12, false, $$26);
        }
    }

    private void a(gir $$0, c $$1, int $$2, int $$3, boolean $$4, boolean $$5, boolean $$6) {
        $$0.a(hpa.at, $$1.a($$4, $$6, $$5), $$2, $$3, 9, 9);
    }

    private void a(gir $$0, ddm $$1, int $$2, int $$3, int $$4) {
        int $$5 = $$1.cJ();
        int $$6 = Math.clamp((long)$$1.cK(), 0, $$5);
        boolean $$7 = ((cgk)$$1).a(bdv.a);
        if ($$7 || $$6 < $$5) {
            boolean $$11;
            $$3 = this.a($$2, $$3);
            int $$8 = giq.b($$6, $$5, -2);
            int $$9 = giq.b($$6, $$5, 0);
            int $$10 = 10 - giq.b($$6, $$5, giq.a($$6, $$7));
            boolean bl2 = $$11 = $$8 != $$9;
            if (!$$7) {
                this.aE = 0;
            }
            for (int $$12 = 1; $$12 <= 10; ++$$12) {
                int $$13 = $$4 - ($$12 - 1) * 8 - 9;
                if ($$12 <= $$8) {
                    $$0.a(hpa.at, x, $$13, $$3, 9, 9);
                    continue;
                }
                if ($$11 && $$12 == $$9 && $$7) {
                    $$0.a(hpa.at, y, $$13, $$3, 9, 9);
                    this.a($$12, $$1, $$10);
                    continue;
                }
                if ($$12 <= 10 - $$10) continue;
                int $$14 = $$10 == 10 && this.ai % 2 == 0 ? this.af.a(2) : 0;
                $$0.a(hpa.at, z, $$13, $$3 + $$14, 9, 9);
            }
        }
    }

    private int a(int $$0, int $$1) {
        int $$2 = this.a($$0) - 1;
        return $$1 -= $$2 * 10;
    }

    private static int b(int $$0, int $$1, int $$2) {
        return bgj.d((float)(($$0 + $$2) * 10) / (float)$$1);
    }

    private static int a(int $$0, boolean $$1) {
        return $$0 == 0 || !$$1 ? 0 : 1;
    }

    private void a(int $$0, ddm $$1, int $$2) {
        if (this.aE != $$0) {
            float $$3 = 0.5f + 0.1f * (float)Math.max(0, $$2 - 3 + 1);
            float $$4 = 1.0f + 0.1f * (float)Math.max(0, $$2 - 5 + 1);
            $$1.a(bda.do, $$3, $$4);
            this.aE = $$0;
        }
    }

    private void a(gir $$0, ddm $$1, int $$2, int $$3) {
        dhe $$4 = $$1.gW();
        int $$5 = $$4.a();
        for (int $$6 = 0; $$6 < 10; ++$$6) {
            amo $$13;
            amo $$12;
            amo $$11;
            int $$7 = $$2;
            if ($$1.d(cfo.q)) {
                amo $$8 = r;
                amo $$9 = s;
                amo $$10 = t;
            } else {
                $$11 = u;
                $$12 = v;
                $$13 = w;
            }
            if ($$1.gW().d() <= 0.0f && this.ai % ($$5 * 3 + 1) == 0) {
                $$7 += this.af.a(3) - 1;
            }
            int $$14 = $$3 - $$6 * 8 - 9;
            $$0.a(hpa.at, $$11, $$14, $$7, 9, 9);
            if ($$6 * 2 + 1 < $$5) {
                $$0.a(hpa.at, $$13, $$14, $$7, 9, 9);
            }
            if ($$6 * 2 + 1 != $$5) continue;
            $$0.a(hpa.at, $$12, $$14, $$7, 9, 9);
        }
    }

    private void d(gir $$0) {
        chl $$1 = this.o();
        if ($$1 == null) {
            return;
        }
        int $$2 = this.a($$1);
        if ($$2 == 0) {
            return;
        }
        int $$3 = (int)Math.ceil($$1.eZ());
        bzl.a().b("mountHealth");
        int $$4 = $$0.b() - 39;
        int $$5 = $$0.a() / 2 + 91;
        int $$6 = $$4;
        int $$7 = 0;
        while ($$2 > 0) {
            int $$8 = Math.min($$2, 10);
            $$2 -= $$8;
            for (int $$9 = 0; $$9 < $$8; ++$$9) {
                int $$10 = $$5 - $$9 * 8 - 9;
                $$0.a(hpa.at, A, $$10, $$6, 9, 9);
                if ($$9 * 2 + 1 + $$7 < $$3) {
                    $$0.a(hpa.at, B, $$10, $$6, 9, 9);
                }
                if ($$9 * 2 + 1 + $$7 != $$3) continue;
                $$0.a(hpa.at, C, $$10, $$6, 9, 9);
            }
            $$6 -= 10;
            $$7 += 20;
        }
    }

    private void a(gir $$0, amo $$1, float $$2) {
        int $$3 = bel.b($$2);
        $$0.a(hpa.at, $$1, 0, 0, 0.0f, 0.0f, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$3);
    }

    private void a(gir $$0, float $$1) {
        float $$2;
        float $$3 = $$2 = (float)Math.min($$0.a(), $$0.b());
        float $$4 = Math.min((float)$$0.a() / $$2, (float)$$0.b() / $$3) * $$1;
        int $$5 = bgj.b($$2 * $$4);
        int $$6 = bgj.b($$3 * $$4);
        int $$7 = ($$0.a() - $$5) / 2;
        int $$8 = ($$0.b() - $$6) / 2;
        int $$9 = $$7 + $$5;
        int $$10 = $$8 + $$6;
        $$0.a(hpa.at, E, $$7, $$8, 0.0f, 0.0f, $$5, $$6, $$5, $$6);
        $$0.a(hpa.aq, 0, $$10, $$0.a(), $$0.b(), -16777216);
        $$0.a(hpa.aq, 0, 0, $$0.a(), $$8, -16777216);
        $$0.a(hpa.aq, 0, $$8, $$7, $$10, -16777216);
        $$0.a(hpa.aq, $$9, $$8, $$0.a(), $$10, -16777216);
    }

    private void a(cgk $$0) {
        is $$1 = is.a($$0.dP(), $$0.dT(), $$0.dV());
        float $$2 = hoj.a($$0.ao().F_(), $$0.ao().G($$1));
        float $$3 = bgj.a(1.0f - $$2, 0.0f, 1.0f);
        this.b += ($$3 - this.b) * 0.01f;
    }

    private void a(gir $$0, @Nullable cgk $$1) {
        int $$9;
        eqa $$2 = this.ag.r.w();
        float $$3 = 0.0f;
        if ($$1 != null) {
            float $$4 = (float)$$2.a($$1);
            double $$5 = Math.min($$2.q() * (double)$$2.r(), Math.abs($$2.l() - $$2.j()));
            double $$6 = Math.max((double)$$2.s(), $$5);
            if ((double)$$4 < $$6) {
                $$3 = 1.0f - (float)((double)$$4 / $$6);
            }
        }
        if ($$3 > 0.0f) {
            $$3 = bgj.a($$3, 0.0f, 1.0f);
            int $$7 = bel.a(1.0f, 0.0f, $$3, $$3);
        } else {
            float $$8 = this.b;
            $$8 = bgj.a($$8, 0.0f, 1.0f);
            $$9 = bel.a(1.0f, $$8, $$8, $$8);
        }
        $$0.a(hpa.az, D, 0, 0, 0.0f, 0.0f, $$0.a(), $$0.b(), $$0.a(), $$0.b(), $$9);
    }

    private void b(gir $$0, float $$1) {
        if ($$1 < 1.0f) {
            $$1 *= $$1;
            $$1 *= $$1;
            $$1 = $$1 * 0.8f + 0.2f;
        }
        int $$2 = bel.b($$1);
        ilp $$3 = this.ag.ax().a().a(dzs.eI.m());
        $$0.a(hpa.at, $$3, 0, 0, $$0.a(), $$0.b(), $$2);
    }

    private void c(gir $$0, float $$1) {
        int $$2 = $$0.a();
        int $$3 = $$0.b();
        $$0.e().pushMatrix();
        float $$4 = bgj.h($$1, 2.0f, 1.0f);
        $$0.e().translate((float)$$2 / 2.0f, (float)$$3 / 2.0f);
        $$0.e().scale($$4, $$4);
        $$0.e().translate((float)(-$$2) / 2.0f, (float)(-$$3) / 2.0f);
        float $$5 = 0.2f * $$1;
        float $$6 = 0.4f * $$1;
        float $$7 = 0.2f * $$1;
        $$0.a(hpa.ay, a, 0, 0, 0.0f, 0.0f, $$2, $$3, $$2, $$3, bel.a(1.0f, $$5, $$6, $$7));
        $$0.e().popMatrix();
    }

    private void a(gir $$0, int $$1, int $$2, gez $$3, ddm $$4, dlt $$5, int $$6) {
        if ($$5.f()) {
            return;
        }
        float $$7 = (float)$$5.M() - $$3.a(false);
        if ($$7 > 0.0f) {
            float $$8 = 1.0f + $$7 / 5.0f;
            $$0.e().pushMatrix();
            $$0.e().translate((float)($$1 + 8), (float)($$2 + 12));
            $$0.e().scale(1.0f / $$8, ($$8 + 1.0f) / 2.0f);
            $$0.e().translate((float)(-($$1 + 8)), (float)(-($$2 + 12)));
        }
        $$0.a($$4, $$5, $$1, $$2, $$6);
        if ($$7 > 0.0f) {
            $$0.e().popMatrix();
        }
        $$0.a(this.ag.g, $$5, $$1, $$2);
    }

    public void a(boolean $$0) {
        this.q();
        if (!$$0) {
            this.p();
        }
    }

    private void p() {
        if (this.ak > 0) {
            --this.ak;
        }
        if (this.au > 0) {
            --this.au;
            if (this.au <= 0) {
                this.av = null;
                this.aw = null;
            }
        }
        ++this.ai;
        cgk $$0 = this.ag.au();
        if ($$0 != null) {
            this.a($$0);
        }
        if (this.ag.s != null) {
            dlt $$1 = this.ag.s.gK().h();
            if ($$1.f()) {
                this.an = 0;
            } else if (this.ao.f() || !$$1.a(this.ao.h()) || !$$1.y().equals(this.ao.y())) {
                this.an = (int)(40.0 * this.ag.k.J().b());
            } else if (this.an > 0) {
                --this.an;
            }
            this.ao = $$1;
        }
        this.ah.a();
    }

    private void q() {
        iqa $$0 = this.ag.aa();
        boolean $$1 = $$0 != null && $$0.bh();
        this.aH = this.aG;
        this.aG = bgj.h(0.2f, this.aG, $$1 ? 1.0f : 0.0f);
    }

    public void a(yh $$0) {
        yw $$1 = yh.a("record.nowPlaying", $$0);
        this.a($$1, true);
        this.ag.aZ().d($$1);
    }

    public void a(yh $$0, boolean $$1) {
        this.b(false);
        this.aj = $$0;
        this.ak = 60;
        this.al = $$1;
    }

    public void b(boolean $$0) {
        this.am = $$0;
    }

    public boolean c() {
        return this.am && this.ak > 0;
    }

    public void a(int $$0, int $$1, int $$2) {
        if ($$0 >= 0) {
            this.ax = $$0;
        }
        if ($$1 >= 0) {
            this.ay = $$1;
        }
        if ($$2 >= 0) {
            this.az = $$2;
        }
        if (this.au > 0) {
            this.au = this.ax + this.ay + this.az;
        }
    }

    public void b(yh $$0) {
        this.aw = $$0;
    }

    public void c(yh $$0) {
        this.av = $$0;
        this.au = this.ax + this.ay + this.az;
    }

    public void d() {
        this.av = null;
        this.aw = null;
        this.au = 0;
    }

    public gjf e() {
        return this.ah;
    }

    public int f() {
        return this.ai;
    }

    public gio g() {
        return this.ag.g;
    }

    public gmp h() {
        return this.ar;
    }

    public gkg i() {
        return this.as;
    }

    public void j() {
        this.as.a();
        this.at.a();
        this.ag.aG().b();
        this.ap.m();
        this.ah.a(true);
        this.d();
        this.a();
    }

    public gjd k() {
        return this.at;
    }

    public gjm l() {
        return this.ap;
    }

    public void m() {
        this.ap.a();
    }

    public void b(gir $$0, gez $$1) {
        int $$2;
        if (this.ag.k.aw().b().booleanValue() && (this.aG > 0.0f || this.aH > 0.0f) && ($$2 = bgj.b(255.0f * bgj.a(bgj.h($$1.b(), this.aH, this.aG), 0.0f, 1.0f))) > 0) {
            gio $$3 = this.g();
            int $$4 = $$3.a(I);
            int $$5 = bel.f($$2, -1);
            int $$6 = $$0.a() - $$4 - 5;
            int $$7 = $$0.b() - $$3.b - 5;
            $$0.c();
            $$0.a($$3, I, $$6, $$7, $$4, $$5);
        }
    }

    private boolean r() {
        return this.ag.s.f + 100 > this.ag.s.at;
    }

    private boolean s() {
        return this.ag.s.D() > 0.0f || t.a(this.ag.s.C(), chv::c, 0) > 0;
    }

    private b t() {
        boolean $$0 = this.ag.s.b.I().a();
        boolean $$1 = this.ag.s.C() != null;
        boolean $$2 = this.ag.q.d();
        if ($$0) {
            if ($$1 && this.s()) {
                return giq$b.d;
            }
            if ($$2 && this.r()) {
                return giq$b.b;
            }
            return giq$b.c;
        }
        if ($$1) {
            return giq$b.d;
        }
        if ($$2) {
            return giq$b.b;
        }
        return giq$b.a;
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        public static final /* enum */ b d = new b();
        private static final /* synthetic */ b[] e;

        public static b[] values() {
            return (b[])e.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d};
        }

        static {
            e = giq$b.a();
        }
    }

    static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c(amo.b("hud/heart/container"), amo.b("hud/heart/container_blinking"), amo.b("hud/heart/container"), amo.b("hud/heart/container_blinking"), amo.b("hud/heart/container_hardcore"), amo.b("hud/heart/container_hardcore_blinking"), amo.b("hud/heart/container_hardcore"), amo.b("hud/heart/container_hardcore_blinking"));
        public static final /* enum */ c b = new c(amo.b("hud/heart/full"), amo.b("hud/heart/full_blinking"), amo.b("hud/heart/half"), amo.b("hud/heart/half_blinking"), amo.b("hud/heart/hardcore_full"), amo.b("hud/heart/hardcore_full_blinking"), amo.b("hud/heart/hardcore_half"), amo.b("hud/heart/hardcore_half_blinking"));
        public static final /* enum */ c c = new c(amo.b("hud/heart/poisoned_full"), amo.b("hud/heart/poisoned_full_blinking"), amo.b("hud/heart/poisoned_half"), amo.b("hud/heart/poisoned_half_blinking"), amo.b("hud/heart/poisoned_hardcore_full"), amo.b("hud/heart/poisoned_hardcore_full_blinking"), amo.b("hud/heart/poisoned_hardcore_half"), amo.b("hud/heart/poisoned_hardcore_half_blinking"));
        public static final /* enum */ c d = new c(amo.b("hud/heart/withered_full"), amo.b("hud/heart/withered_full_blinking"), amo.b("hud/heart/withered_half"), amo.b("hud/heart/withered_half_blinking"), amo.b("hud/heart/withered_hardcore_full"), amo.b("hud/heart/withered_hardcore_full_blinking"), amo.b("hud/heart/withered_hardcore_half"), amo.b("hud/heart/withered_hardcore_half_blinking"));
        public static final /* enum */ c e = new c(amo.b("hud/heart/absorbing_full"), amo.b("hud/heart/absorbing_full_blinking"), amo.b("hud/heart/absorbing_half"), amo.b("hud/heart/absorbing_half_blinking"), amo.b("hud/heart/absorbing_hardcore_full"), amo.b("hud/heart/absorbing_hardcore_full_blinking"), amo.b("hud/heart/absorbing_hardcore_half"), amo.b("hud/heart/absorbing_hardcore_half_blinking"));
        public static final /* enum */ c f = new c(amo.b("hud/heart/frozen_full"), amo.b("hud/heart/frozen_full_blinking"), amo.b("hud/heart/frozen_half"), amo.b("hud/heart/frozen_half_blinking"), amo.b("hud/heart/frozen_hardcore_full"), amo.b("hud/heart/frozen_hardcore_full_blinking"), amo.b("hud/heart/frozen_hardcore_half"), amo.b("hud/heart/frozen_hardcore_half_blinking"));
        private final amo g;
        private final amo h;
        private final amo i;
        private final amo j;
        private final amo k;
        private final amo l;
        private final amo m;
        private final amo n;
        private static final /* synthetic */ c[] o;

        public static c[] values() {
            return (c[])o.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(amo $$0, amo $$1, amo $$2, amo $$3, amo $$4, amo $$5, amo $$6, amo $$7) {
            this.g = $$0;
            this.h = $$1;
            this.i = $$2;
            this.j = $$3;
            this.k = $$4;
            this.l = $$5;
            this.m = $$6;
            this.n = $$7;
        }

        public amo a(boolean $$0, boolean $$1, boolean $$2) {
            if (!$$0) {
                if ($$1) {
                    return $$2 ? this.j : this.i;
                }
                return $$2 ? this.h : this.g;
            }
            if ($$1) {
                return $$2 ? this.n : this.m;
            }
            return $$2 ? this.l : this.k;
        }

        static c a(ddm $$0) {
            c $$4;
            if ($$0.d(cfo.s)) {
                c $$1 = c;
            } else if ($$0.d(cfo.t)) {
                c $$2 = d;
            } else if ($$0.cO()) {
                c $$3 = f;
            } else {
                $$4 = b;
            }
            return $$4;
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c, d, e, f};
        }

        static {
            o = giq$c.a();
        }
    }

    public static interface d {
        public void a(gir var1, gez var2);
    }
}

