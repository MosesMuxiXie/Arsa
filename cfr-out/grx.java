/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.net.URI;
import java.util.Optional;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class grx
extends gsb {
    private static final amo a = amo.b("icon/draft_report");
    private static final int b = 2;
    private static final int c = 50;
    private static final int d = 4;
    private static final int e = 204;
    private static final int f = 98;
    private static final yh t = yh.c("menu.returnToGame");
    private static final yh u = yh.c("gui.advancements");
    private static final yh v = yh.c("gui.stats");
    private static final yh w = yh.c("menu.sendFeedback");
    private static final yh x = yh.c("menu.reportBugs");
    private static final yh y = yh.c("menu.feedback");
    private static final yh z = yh.c("menu.options");
    private static final yh A = yh.c("menu.shareToLan");
    private static final yh B = yh.c("menu.playerReporting");
    private static final yh C = yh.c("menu.game");
    private static final yh D = yh.c("menu.paused");
    private static final gks E = gks.a(yh.c("menu.custom_options.tooltip"));
    private final boolean F;
    private @Nullable gje G;

    public grx(boolean $$0) {
        super($$0 ? C : D);
        this.F = $$0;
    }

    public boolean o() {
        return this.F;
    }

    @Override
    protected void bg_() {
        if (this.F) {
            this.F();
        }
        int $$0 = this.q.a(this.m);
        this.c(new gko(this.o / 2 - $$0 / 2, this.F ? 40 : 10, $$0, this.q.b, this.m, this.q));
    }

    private void F() {
        got $$02 = new got();
        $$02.c().a(4, 4, 4, 0);
        got.b $$1 = $$02.d(2);
        $$1.a(gje.a(t, (gje $$0) -> {
            this.n.a((gsb)null);
            this.n.n.i();
        }).a(204).a(), 2, $$02.b().c(50));
        $$1.a(this.a(u, () -> new gsl(this.n.s.b.s(), this)));
        $$1.a(this.a(v, () -> new gsf(this, this.n.s.x())));
        Optional<? extends jd<asj>> $$2 = this.I();
        if ($$2.isEmpty()) {
            grx.a(this, $$1);
        } else {
            this.a(this.n, $$2.get(), $$1);
        }
        $$1.a(this.a(z, () -> new gwb(this, this.n.k)));
        if (this.n.Z() && !this.n.aa().q()) {
            $$1.a(this.a(A, () -> new gsc(this)));
        } else {
            $$1.a(this.a(B, () -> new gxq(this)));
        }
        this.G = $$1.a(gje.a(yg.b(this.n.Y()), (gje $$0) -> {
            $$0.k = false;
            this.n.bb().a(this.n, this, () -> this.n.a(hif.a), true);
        }).a(204).a(), 2);
        $$02.a();
        gos.a($$02, 0, 0, this.o, this.p, 0.5f, 0.25f);
        $$02.a(this::c);
    }

    private Optional<? extends jd<asj>> I() {
        jh $$2;
        jq<asj> $$0 = this.n.s.b.y().f(mj.bc);
        Optional $$1 = $$0.a(bdr.a);
        if ($$1.isPresent() && ($$2 = (jh)$$1.get()).b() > 0) {
            if ($$2.b() == 1) {
                return Optional.of($$2.a(0));
            }
            return $$0.a(asn.b);
        }
        anl $$3 = this.n.s.b.a();
        if (!$$3.a()) {
            return $$0.a(asn.a);
        }
        return Optional.empty();
    }

    static void a(gsb $$0, got.b $$1) {
        $$1.a(grx.a($$0, w, w.b().f() ? bez.i : bez.h));
        $$1.a(grx.a((gsb)$$0, (yh)grx.x, (URI)bez.j)).k = !w.b().a().a();
    }

    private void a(gfj $$0, jd<asj> $$1, got.b $$22) {
        $$22.a(this.a(y, () -> new a(this)));
        $$22.a(gje.a($$1.a().A_().a(), (gje $$2) -> $$0.s.b.a($$1, (gsb)this)).a(98).a(E).a());
    }

    @Override
    public void e() {
        if (this.p()) {
            gmy.c();
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        if (this.p()) {
            gmy.a($$0, this.q);
        }
        if (this.F && this.n.bb().c() && this.G != null) {
            $$0.a(hpa.at, a, this.G.aT_() + this.G.aS_() - 17, this.G.aU_() + 3, 15, 15);
        }
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        if (this.F) {
            super.b($$0, $$1, $$2, $$3);
        }
    }

    public boolean p() {
        gfo $$0 = this.n.k;
        return $$0.aO().b().d() && $$0.a(bdb.b) > 0.0f && this.F;
    }

    private gje a(yh $$0, Supplier<gsb> $$12) {
        return gje.a($$0, (gje $$1) -> this.n.a((gsb)$$12.get())).a(98).a();
    }

    private static gje a(gsb $$0, yh $$1, URI $$2) {
        return gje.a($$1, gqz.b($$0, $$2)).a(98).a();
    }

    static class a
    extends gsb {
        private static final yh b = yh.c("menu.feedback.title");
        public final gsb a;
        private final gou c = new gou(this);

        protected a(gsb $$0) {
            super(b);
            this.a = $$0;
        }

        @Override
        protected void bg_() {
            this.c.a(b, this.q);
            got $$02 = this.c.c(new got());
            $$02.c().a(4, 4, 4, 0);
            got.b $$1 = $$02.d(2);
            grx.a(this, $$1);
            this.c.b(gje.a(yg.k, (gje $$0) -> this.aX_()).a(200).a());
            this.c.a(this::c);
            this.c();
        }

        @Override
        protected void c() {
            this.c.a();
        }

        @Override
        public void aX_() {
            this.n.a(this.a);
        }
    }
}

