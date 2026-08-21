/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class gxn
extends gjk.a<gxn> {
    private static final amo f = amo.b("icon/draft_report");
    private static final Duration g = Duration.ofMillis(500L);
    private static final gku i = new gku(amo.b("social_interactions/report_button"), amo.b("social_interactions/report_button_disabled"), amo.b("social_interactions/report_button_highlighted"));
    private static final gku j = new gku(amo.b("social_interactions/mute_button"), amo.b("social_interactions/mute_button_highlighted"));
    private static final gku k = new gku(amo.b("social_interactions/unmute_button"), amo.b("social_interactions/unmute_button_highlighted"));
    private final gfj l;
    private final List<gjc> m;
    private final UUID n;
    private final String o;
    private final Supplier<ddq> p;
    private boolean q;
    private boolean r;
    private final boolean s;
    private boolean t;
    private final boolean u;
    private @Nullable gje v;
    private @Nullable gje w;
    private @Nullable gje x;
    private float y;
    private static final yh z = yh.c("gui.socialInteractions.status_hidden").a(l.u);
    private static final yh A = yh.c("gui.socialInteractions.status_blocked").a(l.u);
    private static final yh B = yh.c("gui.socialInteractions.status_offline").a(l.u);
    private static final yh C = yh.c("gui.socialInteractions.status_hidden_offline").a(l.u);
    private static final yh D = yh.c("gui.socialInteractions.status_blocked_offline").a(l.u);
    private static final yh E = yh.c("gui.socialInteractions.tooltip.report.disabled");
    private static final yh F = yh.c("gui.socialInteractions.tooltip.hide");
    private static final yh G = yh.c("gui.socialInteractions.tooltip.show");
    private static final yh H = yh.c("gui.socialInteractions.tooltip.report");
    private static final int I = 24;
    private static final int J = 4;
    public static final int a = bel.b(190, 0, 0, 0);
    private static final int K = 20;
    public static final int b = bel.b(255, 74, 74, 74);
    public static final int c = bel.b(255, 48, 48, 48);
    public static final int d = bel.b(255, 255, 255, 255);
    public static final int e = bel.b(140, 255, 255, 255);

    public gxn(gfj $$0, gxq $$1, UUID $$2, String $$32, Supplier<ddq> $$4, boolean $$5) {
        boolean $$11;
        this.l = $$0;
        this.n = $$2;
        this.o = $$32;
        this.p = $$4;
        hjn $$6 = $$0.bb();
        this.s = $$6.a().a();
        this.u = $$5;
        this.a($$6);
        yw $$7 = yh.a("gui.socialInteractions.narration.hide", new Object[]{$$32});
        yw $$8 = yh.a("gui.socialInteractions.narration.show", new Object[]{$$32});
        gxo $$9 = $$0.aQ();
        boolean $$10 = $$0.O().a($$0.Y());
        boolean bl2 = $$11 = !$$0.s.cY().equals($$2);
        if (w.ad || $$11 && $$10 && !$$9.e($$2)) {
            this.x = new gjq(0, 0, 20, 20, i, $$3 -> $$6.a($$0, $$1, () -> $$0.a(new gxj($$1, $$6, this)), false), yh.c("gui.socialInteractions.report")){

                @Override
                protected yw f() {
                    return gxn.this.a(super.f());
                }
            };
            this.x.k = this.s;
            this.x.a(this.y());
            this.x.a(g);
            this.v = new gjq(0, 0, 20, 20, j, $$3 -> {
                $$9.a($$2);
                this.a(true, yh.a("gui.socialInteractions.hidden_in_chat", new Object[]{$$32}));
            }, yh.c("gui.socialInteractions.hide")){

                @Override
                protected yw f() {
                    return gxn.this.a(super.f());
                }
            };
            this.v.a(gks.a(F, (yh)$$7));
            this.v.a(g);
            this.w = new gjq(0, 0, 20, 20, k, $$3 -> {
                $$9.b($$2);
                this.a(false, yh.a("gui.socialInteractions.shown_in_chat", new Object[]{$$32}));
            }, yh.c("gui.socialInteractions.show")){

                @Override
                protected yw f() {
                    return gxn.this.a(super.f());
                }
            };
            this.w.a(gks.a(G, (yh)$$8));
            this.w.a(g);
            this.m = new ArrayList<gjc>();
            this.m.add(this.v);
            this.m.add(this.x);
            this.e($$9.d(this.n));
        } else {
            this.m = ImmutableList.of();
        }
    }

    public void a(hjn $$0) {
        this.t = $$0.a(this.n);
    }

    private gks y() {
        if (!this.s) {
            return gks.a(E);
        }
        return gks.a(H, (yh)yh.a("gui.socialInteractions.narration.report", new Object[]{this.o}));
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
        int $$10;
        int $$5 = this.d() + 4;
        int $$6 = this.h() + (this.i() - 24) / 2;
        int $$7 = $$5 + 24 + 4;
        yh $$8 = this.z();
        if ($$8 == yg.a) {
            $$0.a(this.d(), this.h(), this.n(), this.k(), b);
            int $$9 = this.h() + (this.i() - this.l.g.b) / 2;
        } else {
            $$0.a(this.d(), this.h(), this.n(), this.k(), c);
            $$10 = this.h() + (this.i() - (this.l.g.b + this.l.g.b)) / 2;
            $$0.b(this.l.g, $$8, $$7, $$10 + 12, e);
        }
        gke.a($$0, this.p.get(), $$5, $$6, 24);
        $$0.b(this.l.g, this.o, $$7, $$10, d);
        if (this.q) {
            $$0.a($$5, $$6, $$5 + 24, $$6 + 24, a);
        }
        if (this.v != null && this.w != null && this.x != null) {
            float $$11 = this.y;
            this.v.f(this.d() + (this.l() - this.v.aS_() - 4) - 20 - 4);
            this.v.g(this.h() + (this.i() - this.v.aR_()) / 2);
            this.v.a($$0, $$1, $$2, $$4);
            this.w.f(this.d() + (this.l() - this.w.aS_() - 4) - 20 - 4);
            this.w.g(this.h() + (this.i() - this.w.aR_()) / 2);
            this.w.a($$0, $$1, $$2, $$4);
            this.x.f(this.d() + (this.l() - this.w.aS_() - 4));
            this.x.g(this.h() + (this.i() - this.w.aR_()) / 2);
            this.x.a($$0, $$1, $$2, $$4);
            if ($$11 == this.y) {
                this.y = 0.0f;
            }
        }
        if (this.t && this.x != null) {
            $$0.a(hpa.at, f, this.x.aT_() + 5, this.x.aU_() + 1, 15, 15);
        }
    }

    @Override
    public List<? extends gmm> aJ_() {
        return this.m;
    }

    @Override
    public List<? extends gpb> b() {
        return this.m;
    }

    public String c() {
        return this.o;
    }

    public UUID t() {
        return this.n;
    }

    public Supplier<ddq> u() {
        return this.p;
    }

    public void c(boolean $$0) {
        this.q = $$0;
    }

    public boolean v() {
        return this.q;
    }

    public void d(boolean $$0) {
        this.r = $$0;
    }

    public boolean w() {
        return this.r;
    }

    public boolean x() {
        return this.u;
    }

    private void a(boolean $$0, yh $$1) {
        this.e($$0);
        this.l.j.e().a($$1);
        this.l.aZ().d($$1);
    }

    private void e(boolean $$0) {
        this.w.l = $$0;
        this.v.l = !$$0;
        this.m.set(0, $$0 ? this.w : this.v);
    }

    yw a(yw $$0) {
        yh $$1 = this.z();
        if ($$1 == yg.a) {
            return yh.b(this.o).f(", ").b($$0);
        }
        return yh.b(this.o).f(", ").b($$1).f(", ").b($$0);
    }

    private yh z() {
        boolean $$0 = this.l.aQ().d(this.n);
        boolean $$1 = this.l.aQ().e(this.n);
        if ($$1 && this.q) {
            return D;
        }
        if ($$0 && this.q) {
            return C;
        }
        if ($$1) {
            return A;
        }
        if ($$0) {
            return z;
        }
        if (this.q) {
            return B;
        }
        return yg.a;
    }
}

