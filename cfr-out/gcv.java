/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class gcv
extends isc {
    private static final amo a = amo.b("icon/unseen_notification");
    private static final amo b = amo.b("icon/news");
    private static final amo c = amo.b("icon/invite");
    private static final amo F = amo.b("icon/trial_available");
    private final CompletableFuture<Boolean> G = fzt.a().thenApply($$0 -> $$0.a() == fzt.b.a);
    private @Nullable gds.c H;
    private @Nullable a I;
    private volatile int J;
    private static boolean K;
    private static boolean L;
    private static boolean M;
    private final a N = new a(){

        @Override
        public gds.c a(gch $$0) {
            gds.c $$1 = $$0.a.a();
            gcv.this.a($$0, $$1);
            gcv.this.b($$0, $$1);
            return $$1;
        }

        @Override
        public boolean a() {
            return true;
        }
    };
    private final a O = new a(){

        @Override
        public gds.c a(gch $$0) {
            gds.c $$1 = $$0.a.a();
            gcv.this.b($$0, $$1);
            return $$1;
        }

        @Override
        public boolean a() {
            return false;
        }
    };

    public gcv() {
        super(gfa.a);
    }

    @Override
    public void bg_() {
        if (this.H != null) {
            this.H.a();
        }
    }

    @Override
    public void aK_() {
        super.aK_();
        this.n.bc().b.a();
    }

    private @Nullable a o() {
        boolean $$0;
        boolean bl2 = $$0 = this.J() && this.G.getNow(false) != false;
        if (!$$0) {
            return null;
        }
        return this.I() ? this.N : this.O;
    }

    @Override
    public void e() {
        a $$0 = this.o();
        if (!Objects.equals(this.I, $$0)) {
            this.I = $$0;
            this.H = this.I != null ? this.I.a(this.n.bc()) : null;
        }
        if (this.H != null) {
            this.H.b();
        }
    }

    private boolean I() {
        return this.n.k.ah().b();
    }

    private boolean J() {
        return this.n.x instanceof gsd;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        if (this.G.getNow(false).booleanValue()) {
            this.d($$0);
        }
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
    }

    private void d(gir $$0) {
        int $$1 = this.J;
        int $$2 = 24;
        int $$3 = this.p / 4 + 48;
        int $$4 = this.o / 2 + 100;
        int $$5 = $$3 + 48 + 2;
        int $$6 = $$4 - 3;
        if (M) {
            $$0.a(hpa.at, a, $$6 - 12, $$5 + 3, 10, 10);
            $$6 -= 16;
        }
        if (this.I != null && this.I.a()) {
            if (L) {
                $$0.a(hpa.at, b, $$6 - 14, $$5 + 1, 14, 14);
                $$6 -= 16;
            }
            if ($$1 != 0) {
                $$0.a(hpa.at, c, $$6 - 14, $$5 + 1, 14, 14);
                $$6 -= 16;
            }
            if (K) {
                $$0.a(hpa.at, F, $$6 - 10, $$5 + 4, 8, 8);
            }
        }
    }

    void a(gch $$02, gds.c $$12) {
        $$12.a($$02.d, (T $$0) -> {
            this.J = $$0;
        });
        $$12.a($$02.e, (T $$0) -> {
            K = $$0;
        });
        $$12.a($$02.f, (T $$1) -> {
            $$0.h.a((gbd)$$1);
            L = $$0.h.a();
        });
    }

    void b(gch $$02, gds.c $$1) {
        $$1.a($$02.b, (T $$0) -> {
            M = false;
            for (gbe $$1 : $$0) {
                if ($$1.a()) continue;
                M = true;
                break;
            }
        });
    }

    static interface a {
        public gds.c a(gch var1);

        public boolean a();
    }
}

