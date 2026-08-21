/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gcx
extends isc {
    static final Logger a = LogUtils.getLogger();
    private static final yh b = yh.c("mco.invites.nopending");
    private final gsb c;
    private final CompletableFuture<List<gav>> F = CompletableFuture.supplyAsync(() -> {
        try {
            return fzz.a().k().a();
        }
        catch (gce $$0) {
            a.error("Couldn't list invites", (Throwable)$$0);
            return List.of();
        }
    }, bhs.i());
    final gou G = new gou(this);
    @Nullable b H;

    public gcx(gsb $$0, yh $$1) {
        super($$1);
        this.c = $$0;
    }

    @Override
    public void bg_() {
        fzu.f();
        this.G.a(this.m, this.q);
        this.H = this.G.c(new b(this, this.n));
        this.F.thenAcceptAsync($$02 -> {
            List<a> $$1 = $$02.stream().map($$0 -> new a((gav)$$0)).toList();
            this.H.a($$1);
            if ($$1.isEmpty()) {
                this.n.aZ().c(b);
            }
        }, this.s);
        this.G.b(gje.a(yg.d, (gje $$0) -> this.aX_()).a(200).a());
        this.G.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.G.a();
        if (this.H != null) {
            this.H.a(this.o, this.G);
        }
    }

    @Override
    public void aX_() {
        this.n.a(this.c);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        if (this.F.isDone() && this.H.c()) {
            $$0.a(this.q, b, this.o / 2, this.p / 2 - 20, -1);
        }
    }

    class b
    extends gjk<a> {
        public static final int a = 36;

        public b(gcx gcx2, gfj $$0) {
            super($$0, gcx2.o, gcx2.G.d(), gcx2.G.c(), 36);
        }

        @Override
        public int a() {
            return 280;
        }

        public boolean c() {
            return this.u() == 0;
        }

        @Override
        public void a(a $$0) {
            this.h($$0);
        }
    }

    class a
    extends gjk.a<a> {
        private static final yh b = yh.c("mco.invites.button.accept");
        private static final yh c = yh.c("mco.invites.button.reject");
        private static final gku d = new gku(amo.b("pending_invite/accept"), amo.b("pending_invite/accept_highlighted"));
        private static final gku e = new gku(amo.b("pending_invite/reject"), amo.b("pending_invite/reject_highlighted"));
        private static final int f = 18;
        private static final int g = 21;
        private static final int i = 38;
        private final gav j;
        private final List<gjc> k = new ArrayList<gjc>();
        private final gkn l;
        private final gkn m;
        private final gko n;
        private final gko o;
        private final gko p;

        a(gav $$02) {
            this.j = $$02;
            int $$1 = gcx.this.H.a() - 32 - 32 - 42;
            this.n = new gko(yh.b($$02.b()), gcx.this.q).a($$1);
            this.o = new gko(yh.b($$02.c()).b(-6250336), gcx.this.q).a($$1);
            this.p = new gko(yk.a(gdz.a($$02.e()), zf.a.a(-6250336)), gcx.this.q).a($$1);
            gje.b $$2 = this.a($$02);
            this.l = gkn.a(b, $$0 -> this.c(true), false).a(d, 18, 18).a(21, 21).a($$2).a().b();
            this.m = gkn.a(c, $$0 -> this.c(false), false).a(e, 18, 18).a(21, 21).a($$2).a().b();
            this.k.addAll(List.of(this.l, this.m));
        }

        private gje.b a(gav $$0) {
            return $$1 -> {
                yw $$2 = yg.a((yh)$$1.get(), yh.b($$0.b()), yh.b($$0.c()), gdz.a($$0.e()));
                return yh.a("narrator.select", $$2);
            };
        }

        @Override
        public List<? extends gmm> aJ_() {
            return this.k;
        }

        @Override
        public List<? extends gpb> b() {
            return this.k;
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            int $$5 = this.d();
            int $$6 = this.h();
            int $$7 = $$5 + 38;
            gdz.a($$0, $$5, $$6, 32, this.j.d());
            this.n.c($$7, $$6 + 1);
            this.n.a_($$0, $$1, $$2, $$5);
            this.o.c($$7, $$6 + 12);
            this.o.a_($$0, $$1, $$2, $$5);
            this.p.c($$7, $$6 + 24);
            this.p.a_($$0, $$1, $$2, $$5);
            int $$8 = $$6 + this.i() / 2 - 10;
            this.l.c($$5 + this.l() - 16 - 42, $$8);
            this.l.a($$0, $$1, $$2, $$4);
            this.m.c($$5 + this.l() - 8 - 21, $$8);
            this.m.a($$0, $$1, $$2, $$4);
        }

        private void c(boolean $$0) {
            String $$12 = this.j.a();
            CompletableFuture.supplyAsync(() -> {
                try {
                    fzz $$2 = fzz.a();
                    if ($$0) {
                        $$2.a($$12);
                    } else {
                        $$2.b($$12);
                    }
                    return true;
                }
                catch (gce $$3) {
                    a.error("Couldn't handle invite", (Throwable)$$3);
                    return false;
                }
            }, bhs.i()).thenAcceptAsync($$1 -> {
                if ($$1.booleanValue()) {
                    gcx.this.H.a(this);
                    gch $$2 = gcx.this.n.bc();
                    if ($$0) {
                        $$2.c.a();
                    }
                    $$2.d.a();
                }
            }, gcx.this.s);
        }
    }
}

