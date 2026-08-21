/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class gdj
extends isc {
    private static final yh a = yh.c("mco.configure.world.buttons.invite");
    private static final yh b = yh.c("mco.configure.world.invite.profile.name").b(-6250336);
    private static final yh c = yh.c("mco.configure.world.players.inviting").b(-6250336);
    private static final yh F = yh.c("mco.configure.world.players.error").b(-65536);
    private static final yh G = yh.c("mco.configure.world.players.invite.duplicate").b(-65536);
    private final gou H = new gou(this);
    private @Nullable gjn I;
    private @Nullable gje J;
    private final gbg K;
    private final gdi L;
    private @Nullable yh M;

    public gdj(gdi $$0, gbg $$1) {
        super(a);
        this.L = $$0;
        this.K = $$1;
    }

    @Override
    public void bg_() {
        this.H.a(a, this.q);
        goy $$02 = this.H.c(goy.d().a(8));
        this.I = new gjn(this.n.g, 200, 20, yh.c("mco.configure.world.invite.profile.name"));
        $$02.a(goq.a(this.q, this.I, b));
        this.J = $$02.a(gje.a(a, (gje $$0) -> this.o()).a(200).a());
        this.H.b(gje.a(yg.k, (gje $$0) -> this.aX_()).a(200).a());
        this.H.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.H.a();
    }

    @Override
    protected void aI_() {
        if (this.I != null) {
            this.b(this.I);
        }
    }

    private void o() {
        if (this.J == null || this.I == null) {
            return;
        }
        if (bhi.h(this.I.a())) {
            this.a(F);
            return;
        }
        if (this.K.i.stream().anyMatch($$0 -> $$0.a.equalsIgnoreCase(this.I.a()))) {
            this.a(G);
            return;
        }
        long $$02 = this.K.b;
        String $$1 = this.I.a().trim();
        this.J.k = false;
        this.I.e(false);
        this.a(c);
        CompletableFuture.supplyAsync(() -> this.L.a($$02, $$1), bhs.i()).thenAcceptAsync($$0 -> {
            if ($$0.booleanValue()) {
                this.n.a(this.L);
            } else {
                this.a(F);
            }
            this.I.e(true);
            this.J.k = true;
        }, this.s);
    }

    private void a(yh $$0) {
        this.M = $$0;
        this.n.aZ().d($$0);
    }

    @Override
    public void aX_() {
        this.n.a(this.L);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        if (this.M != null && this.J != null) {
            $$0.a(this.q, this.M, this.o / 2, this.J.aU_() + this.J.aR_() + 8, -1);
        }
    }
}

