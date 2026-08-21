/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.SequencedCollection;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class grd
extends gsb {
    private static final yh b = yh.c("createWorld.customize.flat.title");
    static final amo c = amo.b("container/slot");
    private static final int d = 18;
    private static final int e = 20;
    private static final int f = 1;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 2;
    private final gou w = new gou(this, 33, 64);
    protected final gxx a;
    private final Consumer<fdr> x;
    fdr y;
    private @Nullable a z;
    private @Nullable gje A;

    public grd(gxx $$0, Consumer<fdr> $$1, fdr $$2) {
        super(b);
        this.a = $$0;
        this.x = $$1;
        this.y = $$2;
    }

    public fdr l() {
        return this.y;
    }

    public void a(fdr $$0) {
        this.y = $$0;
        if (this.z != null) {
            this.z.d();
            this.o();
        }
    }

    @Override
    protected void bg_() {
        this.w.a(this.m, this.q);
        this.z = this.w.c(new a());
        goy $$02 = this.w.b(goy.d().a(4));
        $$02.c().e();
        goy $$1 = $$02.a(goy.e().a(8));
        goy $$2 = $$02.a(goy.e().a(8));
        this.A = $$1.a(gje.a(yh.c("createWorld.customize.flat.removeLayer"), (gje $$0) -> {
            Object $$1;
            if (this.z != null && ($$1 = this.z.q()) instanceof a.c) {
                a.c $$2 = (a.c)$$1;
                this.z.a($$2);
            }
        }).a());
        $$1.a(gje.a(yh.c("createWorld.customize.presets"), (gje $$0) -> {
            this.n.a(new gry(this));
            this.y.g();
            this.o();
        }).a());
        $$2.a(gje.a(yg.d, (gje $$0) -> {
            this.x.accept(this.y);
            this.aX_();
            this.y.g();
        }).a());
        $$2.a(gje.a(yg.e, (gje $$0) -> {
            this.aX_();
            this.y.g();
        }).a());
        this.y.g();
        this.o();
        this.w.a(this::c);
        this.c();
    }

    @Override
    protected void c() {
        if (this.z != null) {
            this.z.a(this.o, this.w);
        }
        this.w.a();
    }

    void o() {
        if (this.A != null) {
            this.A.k = this.p();
        }
    }

    private boolean p() {
        return this.z != null && this.z.q() instanceof a.c;
    }

    @Override
    public void aX_() {
        this.n.a(this.a);
    }

    class grd$a
    extends gkb<a> {
        static final yh f = yh.c("createWorld.customize.flat.tile").a(l.t);
        static final yh n = yh.c("createWorld.customize.flat.height").a(l.t);

        public grd$a() {
            super(grd.this.n, grd.this.o, grd.this.p - 103, 43, 24);
            this.I();
        }

        private void I() {
            this.a(new b(grd.this.q), (int)((double)grd.this.q.b * 1.5));
            SequencedCollection $$0 = grd.this.y.e().reversed();
            for (int $$1 = 0; $$1 < $$0.size(); ++$$1) {
                this.c(new c((fdo)$$0.get($$1), $$1));
            }
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            grd.this.o();
        }

        public void d() {
            int $$0 = this.aJ_().indexOf(this.q());
            this.s();
            this.I();
            List $$1 = this.aJ_();
            if ($$0 >= 0 && $$0 < $$1.size()) {
                this.a((a)$$1.get($$0));
            }
        }

        @Override
        void a(c $$0) {
            List<fdo> $$1 = grd.this.y.e();
            int $$2 = this.aJ_().indexOf($$0);
            this.h($$0);
            $$1.remove($$0.b);
            this.a($$1.isEmpty() ? null : (a)this.aJ_().get(Math.min($$2, $$1.size())));
            grd.this.y.g();
            this.d();
            grd.this.o();
        }

        static class b
        extends a {
            private final gio a;

            public b(gio $$0) {
                this.a = $$0;
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                $$0.b(this.a, f, this.d(), this.h(), -1);
                $$0.b(this.a, n, this.n() - this.a.a(n), this.h(), -1);
            }

            @Override
            public yh a() {
                return yg.a(new yh[]{f, n});
            }
        }

        class c
        extends a {
            final fdo b;
            private final int c;

            public c(fdo $$0, int $$1) {
                this.b = $$0;
                this.c = $$1;
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                yw $$10;
                eoh $$5 = this.b.b();
                dlt $$6 = this.a($$5);
                this.a($$0, this.d(), this.h(), $$6);
                int $$7 = this.j() - grd.this.q.b / 2;
                $$0.b(grd.this.q, $$6.y(), this.d() + 18 + 5, $$7, -1);
                if (this.c == 0) {
                    yw $$8 = yh.a("createWorld.customize.flat.layer.top", this.b.a());
                } else if (this.c == grd.this.y.e().size() - 1) {
                    yw $$9 = yh.a("createWorld.customize.flat.layer.bottom", this.b.a());
                } else {
                    $$10 = yh.a("createWorld.customize.flat.layer", this.b.a());
                }
                $$0.b(grd.this.q, $$10, this.n() - grd.this.q.a($$10), $$7, -1);
            }

            private dlt a(eoh $$0) {
                dlp $$1 = $$0.b().h();
                if ($$1 == dlx.a) {
                    if ($$0.a(dzs.J)) {
                        $$1 = dlx.sl;
                    } else if ($$0.a(dzs.K)) {
                        $$1 = dlx.sm;
                    }
                }
                return new dlt($$1);
            }

            @Override
            public yh a() {
                dlt $$0 = this.a(this.b.b());
                if (!$$0.f()) {
                    return yg.a(yh.a("narrator.select", $$0.y()), n, yh.b(String.valueOf(this.b.a())));
                }
                return yg.a;
            }

            @Override
            public boolean a(gzc $$0, boolean $$1) {
                a.this.a((a)this);
                return super.a($$0, $$1);
            }

            private void a(gir $$0, int $$1, int $$2, dlt $$3) {
                this.a($$0, $$1 + 1, $$2 + 1);
                if (!$$3.f()) {
                    $$0.b($$3, $$1 + 2, $$2 + 2);
                }
            }

            private void a(gir $$0, int $$1, int $$2) {
                $$0.a(hpa.at, c, $$1, $$2, 18, 18);
            }
        }

        static abstract class a
        extends gkb.a<a> {
            a() {
            }
        }
    }
}

