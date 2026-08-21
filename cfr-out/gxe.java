/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.datafixers.util.Unit
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Unit;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import org.slf4j.Logger;

public abstract class gxe<B extends hjj.a<?>>
extends gsb {
    private static final yh A = yh.c("gui.abuseReport.report_sent_msg");
    private static final yh B = yh.c("gui.abuseReport.sending.title").a(l.r);
    private static final yh C = yh.c("gui.abuseReport.sent.title").a(l.r);
    private static final yh D = yh.c("gui.abuseReport.error.title").a(l.r);
    private static final yh E = yh.c("gui.abuseReport.send.generic_error");
    protected static final yh a = yh.c("gui.abuseReport.send");
    protected static final yh b = yh.c("gui.abuseReport.observed_what");
    protected static final yh c = yh.c("gui.abuseReport.select_reason");
    private static final yh F = yh.c("gui.abuseReport.describe");
    protected static final yh d = yh.c("gui.abuseReport.more_comments");
    private static final yh G = yh.c("gui.abuseReport.comments");
    private static final yh H = yh.c("gui.abuseReport.attestation").b(-2039584);
    protected static final int e = 120;
    protected static final int f = 20;
    protected static final int t = 280;
    protected static final int u = 8;
    private static final Logger I = LogUtils.getLogger();
    protected final gsb v;
    protected final hjn w;
    protected final goy x = goy.d().a(8);
    protected B y;
    private gjg J;
    protected gje z;

    protected gxe(yh $$0, gsb $$1, hjn $$2, B $$3) {
        super($$0);
        this.v = $$1;
        this.w = $$2;
        this.y = $$3;
    }

    protected gjx a(int $$0, int $$1, Consumer<String> $$2) {
        AbuseReportLimits $$3 = this.w.a().b();
        gjx $$4 = gjx.v().a(F).a(this.q, $$0, $$1, G);
        $$4.a(((hjj.a)this.y).g());
        $$4.a($$3.maxOpinionCommentsLength());
        $$4.b($$2);
        return $$4;
    }

    @Override
    protected void bg_() {
        this.x.c().b();
        this.o();
        this.p();
        this.F();
        this.I();
        this.x.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    protected void o() {
        this.x.a(new gko(this.m, this.q));
    }

    protected abstract void p();

    protected void F() {
        this.J = this.x.a(gjg.a(H, this.q).a(((hjj.a)this.y).h()).a(280).a((gjg $$0, boolean $$1) -> {
            ((hjj.a)this.y).a($$1);
            this.I();
        }).a());
        goy $$02 = this.x.a(goy.e().a(8));
        $$02.a(gje.a(yg.k, (gje $$0) -> this.aX_()).a(120).a());
        this.z = $$02.a(gje.a(a, (gje $$0) -> this.J()).a(120).a());
    }

    protected void I() {
        hjj.b $$0 = ((hjj.a)this.y).c();
        this.z.k = $$0 == null && this.J.a();
        this.z.a(t.a($$0, hjj.b::a));
    }

    @Override
    protected void c() {
        this.x.a();
        gos.a(this.x, this.aV_());
    }

    protected void J() {
        ((hjj.a)this.y).a(this.w).ifLeft($$02 -> {
            CompletableFuture<Unit> $$12 = this.w.a().a($$02.a(), $$02.b(), $$02.c());
            this.n.a(grn.a(B, yg.e, () -> {
                this.n.a(this);
                $$12.cancel(true);
            }));
            $$12.handleAsync(($$0, $$1) -> {
                if ($$1 == null) {
                    this.K();
                } else {
                    if ($$1 instanceof CancellationException) {
                        return null;
                    }
                    this.a((Throwable)$$1);
                }
                return null;
            }, (Executor)this.n);
        }).ifRight($$0 -> this.a($$0.b()));
    }

    private void K() {
        this.M();
        this.n.a(grn.a(C, A, yg.d, () -> this.n.a((gsb)null)));
    }

    private void a(Throwable $$0) {
        yh $$3;
        I.error("Encountered error while sending abuse report", $$0);
        Throwable throwable = $$0.getCause();
        if (throwable instanceof zi) {
            zi $$1 = (zi)throwable;
            yh $$2 = $$1.a();
        } else {
            $$3 = E;
        }
        this.a($$3);
    }

    private void a(yh $$0) {
        yw $$1 = $$0.f().a(l.m);
        this.n.a(grn.a(D, $$1, yg.k, () -> this.n.a(this)));
    }

    void L() {
        if (((hjj.a)this.y).b()) {
            this.w.a(((hjj)((hjj.a)this.y).e()).b());
        }
    }

    void M() {
        this.w.a((hjj)null);
    }

    @Override
    public void aX_() {
        if (((hjj.a)this.y).b()) {
            this.n.a(new a());
        } else {
            this.n.a(this.v);
        }
    }

    @Override
    public void aZ_() {
        this.L();
        super.aZ_();
    }

    class a
    extends gvt {
        private static final yh c = yh.c("gui.abuseReport.discard.title").a(l.r);
        private static final yh d = yh.c("gui.abuseReport.discard.content");
        private static final yh e = yh.c("gui.abuseReport.discard.return");
        private static final yh f = yh.c("gui.abuseReport.discard.draft");
        private static final yh t = yh.c("gui.abuseReport.discard.discard");

        protected a() {
            super(c, d, d);
        }

        @Override
        protected gov o() {
            goy $$02 = goy.d().a(8);
            $$02.c().b();
            goy $$1 = $$02.a(goy.e().a(8));
            $$1.a(gje.a(e, (gje $$0) -> this.aX_()).a());
            $$1.a(gje.a(f, (gje $$0) -> {
                gxe.this.L();
                this.n.a(gxe.this.v);
            }).a());
            $$02.a(gje.a(t, (gje $$0) -> {
                gxe.this.M();
                this.n.a(gxe.this.v);
            }).a());
            return $$02;
        }

        @Override
        public void aX_() {
            this.n.a(gxe.this);
        }

        @Override
        public boolean aY_() {
            return false;
        }
    }
}

