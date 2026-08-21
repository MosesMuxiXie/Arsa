/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class gxk
extends gsb {
    private static final yh a = yh.c("gui.abuseReport.reason.title");
    private static final yh b = yh.c("gui.abuseReport.reason.description");
    private static final yh c = yh.c("gui.abuseReport.read_info");
    private static final int d = 320;
    private static final int e = 62;
    private static final int f = 4;
    private final @Nullable gsb t;
    private @Nullable a u;
    @Nullable hjl v;
    private final Consumer<hjl> w;
    final gou x = new gou(this);
    final hjm y;

    public gxk(@Nullable gsb $$0, @Nullable hjl $$1, hjm $$2, Consumer<hjl> $$3) {
        super(a);
        this.t = $$0;
        this.v = $$1;
        this.w = $$3;
        this.y = $$2;
    }

    @Override
    protected void bg_() {
        this.x.a(a, this.q);
        goy $$02 = this.x.c(goy.d().a(4));
        this.u = $$02.a(new a(this.n));
        a.a $$12 = t.a(this.v, this.u::a);
        this.u.a($$12);
        $$02.a(goz.b(this.K()));
        goy $$2 = this.x.b(goy.e().a(8));
        $$2.a(gje.a(c, gqz.b((gsb)this, bez.m)).a());
        $$2.a(gje.a(yg.d, (gje $$0) -> {
            a.a $$1 = (a.a)this.u.q();
            if ($$1 != null) {
                this.w.accept($$1.b());
            }
            this.n.a(this.t);
        }).a());
        this.x.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.x.a();
        if (this.u != null) {
            this.u.a(this.o, this.L(), this.x.c());
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.o(), this.F(), this.p(), this.I(), -16777216);
        $$0.b(this.o(), this.F(), this.J(), this.K(), -1);
        $$0.b(this.q, b, this.o() + 4, this.F() + 4, -1);
        a.a $$4 = (a.a)this.u.q();
        if ($$4 != null) {
            int $$5 = this.o() + 4 + 16;
            int $$6 = this.p() - 4;
            int $$7 = this.F() + 4 + this.q.b + 2;
            int $$8 = this.I() - 4;
            int $$9 = $$6 - $$5;
            int $$10 = $$8 - $$7;
            int $$11 = this.q.b($$4.b.c(), $$9);
            $$0.a(this.q, (yn)$$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
        }
    }

    private int o() {
        return (this.o - 320) / 2;
    }

    private int p() {
        return (this.o + 320) / 2;
    }

    private int F() {
        return this.I() - this.K();
    }

    private int I() {
        return this.p - this.x.b() - 4;
    }

    private int J() {
        return 320;
    }

    private int K() {
        return 62;
    }

    int L() {
        return this.x.d() - this.K() - 8;
    }

    @Override
    public void aX_() {
        this.n.a(this.t);
    }

    public class gxk$a
    extends gkb<a> {
        public gxk$a(gfj $$1) {
            super($$1, gxk.this.o, gxk.this.L(), gxk.this.x.c(), 18);
            for (hjl $$2 : hjl.values()) {
                if (hjl.a(gxk.this.y).contains((Object)$$2)) continue;
                this.c(new a($$2));
            }
        }

        public @Nullable a a(hjl $$0) {
            return this.aJ_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
        }

        @Override
        public int a() {
            return 320;
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            gxk.this.v = $$0 != null ? $$0.b() : null;
        }

        public class a
        extends gkb.a<a> {
            final hjl b;

            public a(hjl $$1) {
                this.b = $$1;
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                int $$5 = this.d() + 1;
                int $$6 = this.h() + (this.i() - ((gxk)gxk.this).q.b) / 2 + 1;
                $$0.b(gxk.this.q, this.b.b(), $$5, $$6, -1);
            }

            @Override
            public yh a() {
                return yh.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
            }

            @Override
            public boolean a(gzc $$0, boolean $$1) {
                a.this.a(this);
                return super.a($$0, $$1);
            }

            public hjl b() {
                return this.b;
            }
        }
    }
}

