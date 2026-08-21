/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class gcq
extends isc {
    private static final yh a = yh.c("mco.selectServer.create");
    private static final yh b = yh.c("mco.configure.world.name");
    private static final yh c = yh.c("mco.configure.world.description");
    private static final int F = 10;
    private static final int G = 210;
    private final fzu H;
    private final gou I = new gou(this);
    private gjn J;
    private gjn K;
    private final Runnable L;

    public gcq(fzu $$0, gbg $$1, boolean $$2) {
        super(a);
        this.H = $$0;
        this.L = () -> this.a($$1, $$2);
    }

    @Override
    public void bg_() {
        this.I.a(this.m, this.q);
        goy $$02 = this.I.c(goy.d()).a(10);
        gje $$12 = gje.a(yg.j, (gje $$0) -> this.L.run()).a();
        $$12.k = false;
        this.J = new gjn(this.q, 210, 20, b);
        this.J.b((String $$1) -> {
            $$0.k = !bhi.h($$1);
        });
        this.K = new gjn(this.q, 210, 20, c);
        $$02.a(goq.a(this.q, this.J, b));
        $$02.a(goq.a(this.q, this.K, c));
        goy $$2 = this.I.b(goy.e().a(10));
        $$2.a($$12);
        $$2.a(gje.a(yg.k, (gje $$0) -> this.aX_()).a());
        this.I.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void aI_() {
        this.b(this.J);
    }

    @Override
    protected void c() {
        this.I.a();
    }

    private void a(gbg $$02, boolean $$12) {
        if (!$$02.i() && $$12) {
            AtomicBoolean $$2 = new AtomicBoolean();
            this.n.a(new gqv(() -> {
                $$2.set(true);
                this.H.h();
                this.n.a(this.H);
            }, yh.c("mco.upload.preparing"), (yh)yh.i()));
            ((CompletableFuture)CompletableFuture.supplyAsync(() -> gcq.a($$02), bhs.h()).thenAcceptAsync($$1 -> {
                if (!$$2.get()) {
                    this.b((gbg)$$1);
                }
            }, (Executor)this.n)).exceptionallyAsync($$0 -> {
                yw $$4;
                this.H.h();
                Throwable $$1 = $$0.getCause();
                if ($$1 instanceof gce) {
                    gce $$2 = (gce)$$1;
                    yh $$3 = $$2.a.b();
                } else {
                    $$4 = yh.c("mco.errorMessage.initialize.failed");
                }
                this.n.a(new gcs($$4, (gsb)this.H));
                return null;
            }, (Executor)this.n);
        } else {
            this.b($$02);
        }
    }

    private static gbg a(gbg $$0) {
        fzz $$1 = fzz.a();
        try {
            return $$1.a((Long)$$0.b);
        }
        catch (gce $$2) {
            throw new RuntimeException($$2);
        }
    }

    private void b(gbg $$0) {
        gej $$1 = new gej($$0.b, this.J.a(), this.K.a());
        gcz $$2 = gcz.a((gsb)this, $$0, $$1, () -> this.n.execute(() -> {
            fzu.g();
            this.n.a(this.H);
        }));
        this.n.a($$2);
    }

    @Override
    public void aX_() {
        this.n.a(this.H);
    }
}

