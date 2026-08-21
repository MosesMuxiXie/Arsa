/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class gdl
extends gsb {
    private static final yh a = yh.c("mco.configure.world.region_preference.title");
    private static final int b = 8;
    private final gou c = new gou(this);
    private final gsb d;
    private final BiConsumer<gbs, gbf> e;
    final Map<gbf, gbu> f;
    private @Nullable a t;
    gdm.a u;
    private @Nullable gje v;

    public gdl(gsb $$0, BiConsumer<gbs, gbf> $$1, Map<gbf, gbu> $$2, gdm.a $$3) {
        super(a);
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.u = $$3;
    }

    @Override
    public void aX_() {
        this.n.a(this.d);
    }

    @Override
    protected void bg_() {
        goy $$02 = this.c.a(goy.d().a(8));
        $$02.c().b();
        $$02.a(new gko(this.q(), this.q));
        this.t = this.c.c(new a());
        goy $$12 = this.c.b(goy.e().a(8));
        this.v = $$12.a(gje.a(yg.d, (gje $$0) -> this.o()).a());
        $$12.a(gje.a(yg.e, (gje $$0) -> this.aX_()).a());
        this.t.a((a.a)this.t.aJ_().stream().filter($$0 -> Objects.equals($$0.b, this.u)).findFirst().orElse(null));
        this.c.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.c.a();
        if (this.t != null) {
            this.t.a(this.o, this.c);
        }
    }

    void o() {
        if (this.u.b() != null) {
            this.e.accept(this.u.a(), this.u.b());
        }
        this.aX_();
    }

    void p() {
        if (this.v != null && this.t != null) {
            this.v.k = this.t.q() != null;
        }
    }

    class gdl$a
    extends gkb<a> {
        gdl$a() {
            super(gdl.this.n, gdl.this.o, gdl.this.p - 77, 40, 16);
            this.c(new a(gbs.a, null));
            this.c(new a(gbs.b, null));
            gdl.this.f.keySet().stream().map($$0 -> new a(gbs.c, (gbf)((Object)$$0))).forEach($$1 -> this.c($$1));
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            if ($$0 != null) {
                gdl.this.u = $$0.b;
            }
            gdl.this.p();
        }

        class a
        extends gkb.a<a> {
            final gdm.a b;
            private final yh c;

            public a(@Nullable gbs $$0, gbf $$1) {
                this(new gdm.a($$0, $$1));
            }

            public a(gdm.a $$0) {
                this.b = $$0;
                this.c = $$0.a() == gbs.c ? ($$0.b() != null ? yh.c($$0.b().z) : yh.i()) : yh.c($$0.a().f);
            }

            @Override
            public yh a() {
                return yh.a("narrator.select", this.c);
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                $$0.b(gdl.this.q, this.c, this.d() + 5, this.h() + 2, -1);
                if (this.b.b() != null && gdl.this.f.containsKey((Object)this.b.b())) {
                    gbu $$5 = gdl.this.f.getOrDefault((Object)this.b.b(), gbu.e);
                    $$0.a(hpa.at, $$5.b(), this.n() - 18, this.h() + 2, 10, 8);
                }
            }

            @Override
            public boolean a(gzc $$0, boolean $$1) {
                a.this.a(this);
                if ($$1) {
                    a.this.a(a.this.c.ap());
                    gdl.this.o();
                    return true;
                }
                return super.a($$0, $$1);
            }

            @Override
            public boolean a(gzb $$0) {
                if ($$0.c()) {
                    a.this.a(a.this.c.ap());
                    gdl.this.o();
                    return true;
                }
                return super.a($$0);
            }
        }
    }
}

