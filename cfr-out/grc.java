/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.Collator
 *  org.jspecify.annotations.Nullable
 */
import com.ibm.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class grc
extends gsb {
    private static final yh a = yh.c("createWorld.customize.buffet.search").c(gjn.e);
    private static final int b = 3;
    private static final int c = 15;
    final gou d;
    private final gsb e;
    private final Consumer<jd<dxo>> f;
    final jq<dxo> t;
    private a u;
    jd<dxo> v;
    private gje w;

    public grc(gsb $$0, gyh $$1, Consumer<jd<dxo>> $$2) {
        super(yh.c("createWorld.customize.buffet.title"));
        this.e = $$0;
        this.f = $$2;
        this.d = new gou(this, 13 + this.q.b + 3 + 15, 33);
        this.t = $$1.a().f(mj.aS);
        jd $$3 = (jd)this.t.a(dxv.b).or(() -> this.t.c().findAny()).orElseThrow();
        this.v = $$1.e().a().d().c().stream().findFirst().orElse($$3);
    }

    @Override
    public void aX_() {
        this.n.a(this.e);
    }

    @Override
    protected void bg_() {
        goy $$02 = this.d.a(goy.d().a(3));
        $$02.c().b();
        $$02.a(new gko(this.q(), this.q));
        gjn $$1 = $$02.a(new gjn(this.q, 200, 15, yh.i()));
        a $$2 = new a();
        $$1.c(a);
        $$1.b($$2::a);
        this.u = this.d.c($$2);
        goy $$3 = this.d.b(goy.e().a(8));
        this.w = $$3.a(gje.a(yg.d, (gje $$0) -> {
            this.f.accept(this.v);
            this.aX_();
        }).a());
        $$3.a(gje.a(yg.e, (gje $$0) -> this.aX_()).a());
        this.u.a((a.a)this.u.aJ_().stream().filter($$0 -> Objects.equals($$0.b, this.v)).findFirst().orElse(null));
        this.d.a(this::c);
        this.c();
    }

    @Override
    protected void c() {
        this.d.a();
        this.u.a(this.o, this.d);
    }

    void o() {
        this.w.k = this.u.q() != null;
    }

    class grc$a
    extends gkb<a> {
        grc$a() {
            super(grc.this.n, grc.this.o, grc.this.d.d(), grc.this.d.c(), 15);
            this.a("");
        }

        @Override
        private void a(String $$02) {
            Collator $$1 = Collator.getInstance((Locale)Locale.getDefault());
            String $$22 = $$02.toLowerCase(Locale.ROOT);
            List<a> $$3 = grc.this.t.c().map($$0 -> new a((jd.c<dxo>)$$0)).sorted(Comparator.comparing($$0 -> $$0.c.getString(), $$1)).filter($$2 -> $$02.isEmpty() || $$2.c.getString().toLowerCase(Locale.ROOT).contains($$22)).toList();
            this.a($$3);
            this.i();
        }

        @Override
        public void a(@Nullable a $$0) {
            super.a($$0);
            if ($$0 != null) {
                grc.this.v = $$0.b;
            }
            grc.this.o();
        }

        class a
        extends gkb.a<a> {
            final jd.c<dxo> b;
            final yh c;

            public a(jd.c<dxo> $$0) {
                this.b = $$0;
                amo $$1 = $$0.h().a();
                String $$2 = $$1.h("biome");
                this.c = uu.a().b($$2) ? yh.c($$2) : yh.b($$1.toString());
            }

            @Override
            public yh a() {
                return yh.a("narrator.select", this.c);
            }

            @Override
            public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
                $$0.b(grc.this.q, this.c, this.d() + 5, this.h() + 2, -1);
            }

            @Override
            public boolean a(gzc $$0, boolean $$1) {
                a.this.a(this);
                return super.a($$0, $$1);
            }
        }
    }
}

