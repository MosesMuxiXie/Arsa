/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Locale;
import java.util.SortedMap;
import org.jspecify.annotations.Nullable;

public class gvy
extends gwc {
    private static final yh a = yh.c("options.languageAccuracyWarning").b(-4539718);
    private static final int f = 53;
    private static final yh t = yh.c("gui.language.search").c(gjn.e);
    private static final int u = 15;
    final imw v;
    private @Nullable a w;
    private @Nullable gjn x;

    public gvy(gsb $$0, gfo $$1, imw $$2) {
        super($$0, $$1, (yh)yh.c("options.language.title"));
        this.v = $$2;
        this.e.a(53);
    }

    @Override
    protected void F() {
        goy $$02 = this.e.a(goy.d().a(4));
        $$02.c().b();
        $$02.a(new gko(this.m, this.q));
        this.x = $$02.a(new gjn(this.q, 0, 0, 200, 15, yh.i()));
        this.x.c(t);
        this.x.b((String $$0) -> {
            if (this.w != null) {
                this.w.a((String)$$0);
            }
        });
        this.e.b((int)(12.0 + (double)this.q.b + 15.0));
    }

    @Override
    protected void aI_() {
        if (this.x != null) {
            this.b(this.x);
        } else {
            super.aI_();
        }
    }

    @Override
    protected void I() {
        this.w = this.e.c(new a(this.n));
    }

    @Override
    protected void o() {
    }

    @Override
    protected void p() {
        goy $$02 = this.e.b(goy.d()).a(8);
        $$02.c().b();
        $$02.a(new gko(a, this.q));
        goy $$1 = $$02.a(goy.e().a(8));
        $$1.a(gje.a(yh.c("options.font"), (gje $$0) -> this.n.a(new gvx(this, this.c))).a());
        $$1.a(gje.a(yg.d, (gje $$0) -> this.J()).a());
    }

    @Override
    protected void c() {
        super.c();
        if (this.w != null) {
            this.w.a(this.o, this.e);
        }
    }

    void J() {
        Object e2;
        if (this.w != null && (e2 = this.w.q()) instanceof a.a) {
            a.a $$0 = (a.a)e2;
            if (!$$0.b.equals(this.v.a())) {
                this.v.a($$0.b);
                this.c.ay = $$0.b;
                this.n.p();
            }
        }
        this.n.a(this.b);
    }

    @Override
    protected boolean aL_() {
        return !(this.b instanceof gqu);
    }

    class gvy$a
    extends gkb<a> {
        public gvy$a(gfj $$0) {
            super($$0, gvy.this.o, gvy.this.p - 33 - 53, 33, 18);
            String $$12 = gvy.this.v.a();
            gvy.this.v.b().forEach(($$1, $$2) -> {
                a $$3 = new a((String)$$1, (imv)$$2);
                this.c($$3);
                if ($$12.equals($$1)) {
                    this.a($$3);
                }
            });
            if (this.q() != null) {
                this.g((a)this.q());
            }
        }

        @Override
        void a(String $$02) {
            SortedMap<String, imv> $$12 = gvy.this.v.b();
            List<a> $$2 = $$12.entrySet().stream().filter($$1 -> $$02.isEmpty() || ((imv)$$1.getValue()).c().toLowerCase(Locale.ROOT).contains($$02.toLowerCase(Locale.ROOT)) || ((imv)$$1.getValue()).b().toLowerCase(Locale.ROOT).contains($$02.toLowerCase(Locale.ROOT))).map($$0 -> new a((String)$$0.getKey(), (imv)$$0.getValue())).toList();
            this.a($$2);
            this.i();
        }

        @Override
        public int a() {
            return super.a() + 50;
        }

        public class a
        extends gkb.a<a> {
            final String b;
            private final yh c;

            public a(String $$1, imv $$2) {
                this.b = $$1;
                this.c = $$2.a();
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                $$0.a(gvy.this.q, this.c, a.this.g / 2, this.j() - ((gvy)gvy.this).q.b / 2, -1);
            }

            @Override
            public boolean a(gzb $$0) {
                if ($$0.c()) {
                    this.b();
                    gvy.this.J();
                    return true;
                }
                return super.a($$0);
            }

            @Override
            public boolean a(gzc $$0, boolean $$1) {
                this.b();
                if ($$1) {
                    gvy.this.J();
                }
                return super.a($$0, $$1);
            }

            private void b() {
                a.this.a(this);
            }

            @Override
            public yh a() {
                return yh.a("narrator.select", this.c);
            }
        }
    }
}

