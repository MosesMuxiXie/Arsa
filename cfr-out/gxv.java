/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class gxv
extends gsb {
    private static final yh a = yh.c("selectWorld.experimental.title");
    private static final yh b = yh.c("selectWorld.experimental.message");
    private static final yh c = yh.c("selectWorld.experimental.details");
    private static final int d = 10;
    private static final int e = 100;
    private final BooleanConsumer f;
    final Collection<bah> t;
    private final got u = new got().a(10).b(20);

    public gxv(Collection<bah> $$0, BooleanConsumer $$1) {
        super(a);
        this.t = $$0;
        this.f = $$1;
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{super.i(), b});
    }

    @Override
    protected void bg_() {
        super.bg_();
        got.b $$02 = this.u.d(2);
        gox $$12 = $$02.b().b();
        $$02.a(new gko(this.m, this.q), 2, $$12);
        gjz $$2 = $$02.a(new gjz(b, this.q).a(true), 2, $$12);
        $$2.a(310);
        $$02.a(gje.a(c, (gje $$0) -> this.n.a(new a())).a(100).a(), 2, $$12);
        $$02.a(gje.a(yg.i, (gje $$0) -> this.f.accept(true)).a());
        $$02.a(gje.a(yg.k, (gje $$0) -> this.f.accept(false)).a());
        this.u.a((gjc $$1) -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.u.a();
        this.c();
    }

    @Override
    protected void c() {
        gos.a(this.u, 0, 0, this.o, this.p, 0.5f, 0.5f);
    }

    @Override
    public void aX_() {
        this.f.accept(false);
    }

    class gxv$a
    extends gsb {
        private static final yh b = yh.c("selectWorld.experimental.details.title");
        final gou c;
        private @Nullable a d;

        gxv$a() {
            super(b);
            this.c = new gou(this);
        }

        @Override
        protected void bg_() {
            this.c.a(b, this.q);
            this.d = this.c.c(new a(this, this.n, gxv.this.t));
            this.c.b(gje.a(yg.k, (gje $$0) -> this.aX_()).a());
            this.c.a($$1 -> {
                gjc cfr_ignored_0 = (gjc)this.c($$1);
            });
            this.c();
        }

        @Override
        protected void c() {
            if (this.d != null) {
                this.d.a(this.o, this.c);
            }
            this.c.a();
        }

        @Override
        public void aX_() {
            this.n.a(gxv.this);
        }

        class a
        extends gkb<b> {
            public a(gxv$a a2, gfj $$0, Collection<bah> $$1) {
                super($$0, a2.o, a2.c.d(), a2.c.c(), ($$0.g.b + 2) * 3);
                for (bah $$2 : $$1) {
                    String $$3 = dhb.a(dhb.g, $$2.e());
                    if ($$3.isEmpty()) continue;
                    yh $$4 = yk.a($$2.b(), zf.a.a(true));
                    yw $$5 = yh.a("selectWorld.experimental.details.entry", new Object[]{$$3});
                    this.c(a2.new b($$4, $$5, gjy.a(a2.q, (yh)$$5, this.a())));
                }
            }

            @Override
            public int a() {
                return this.g * 3 / 4;
            }
        }

        class b
        extends gkb.a<b> {
            private final yh b;
            private final yh c;
            private final gjy d;

            b(yh $$0, yh $$1, gjy $$2) {
                this.b = $$0;
                this.c = $$1;
                this.d = $$2;
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                gil $$5 = $$0.h();
                $$0.b(((gxv$a)a.this).n.g, this.b, this.d(), this.h(), -1);
                this.d.a(git.a, this.d(), this.h() + 12, ((gxv$a)a.this).q.b, $$5);
            }

            @Override
            public yh a() {
                return yh.a("narrator.select", yg.a(new yh[]{this.b, this.c}));
            }
        }
    }
}

