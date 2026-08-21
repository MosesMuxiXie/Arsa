/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.floats.FloatComparators
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.floats.FloatComparators;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class gsn
extends gsb {
    private static final yh a = yh.c("debug.options.title");
    private static final yh b = yh.c("debug.options.warning").b(-2142128);
    static final yh c = yh.c("debug.entry.always");
    static final yh d = yh.c("debug.entry.overlay");
    static final yh e = yg.c;
    static final yh f = yh.c("debug.options.notAllowed.tooltip");
    private static final yh t = yh.c("debug.options.search").c(gjn.e);
    final gou u = new gou(this, 61, 33);
    private @Nullable d v;
    private gjn w;
    final List<gje> x = new ArrayList<gje>();

    public gsn() {
        super(a);
    }

    @Override
    protected void bg_() {
        goy $$02 = this.u.a(goy.d().a(8));
        this.v = new d();
        int $$12 = this.v.a();
        goy $$2 = goy.e().a(8);
        $$2.a(new goz($$12 / 3, 1));
        $$2.a(new gko(a, this.q), $$2.b().e());
        this.w = new gjn(this.q, 0, 0, $$12 / 3, 20, this.w, t);
        this.w.b((String $$0) -> this.v.a((String)$$0));
        this.w.c(t);
        $$2.a(this.w);
        $$02.a($$2, gox::b);
        $$02.a(new gjz(b, this.q).a($$12).a(true), gox::b);
        this.u.c(this.v);
        goy $$3 = this.u.b(goy.e().a(8));
        this.a(gmb.a, $$3);
        this.a(gmb.b, $$3);
        $$3.a(gje.a(yg.d, (gje $$0) -> this.aX_()).a(60).a());
        this.u.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    public void b(gir $$0) {
        this.n.j.a($$0);
        super.b($$0);
    }

    @Override
    protected void aI_() {
        this.b(this.w);
    }

    private void a(gmb $$0, goy $$12) {
        gje $$2 = gje.a(yh.c($$0.a()), (gje $$1) -> {
            this.n.m.a($$0);
            this.n.m.g();
            this.v.d();
            for (gje $$2 : this.x) {
                $$2.k = true;
            }
            $$1.k = false;
        }).a(120).a();
        $$2.k = !this.n.m.b($$0);
        this.x.add($$2);
        $$12.a($$2);
    }

    @Override
    protected void c() {
        this.u.a();
        if (this.v != null) {
            this.v.a(this.o, this.u);
        }
    }

    public @Nullable d o() {
        return this.v;
    }

    public class d
    extends gjk<a> {
        private static final Comparator<Map.Entry<amo, gly>> f = ($$0, $$1) -> {
            int $$2 = FloatComparators.NATURAL_COMPARATOR.compare(((gly)$$0.getValue()).a().b(), ((gly)$$1.getValue()).a().b());
            if ($$2 != 0) {
                return $$2;
            }
            return ((amo)$$0.getKey()).a((amo)$$1.getKey());
        };
        private static final int n = 20;

        public d() {
            super(gfj.V(), gsn.this.o, gsn.this.u.d(), gsn.this.u.c(), 20);
            this.a("");
        }

        @Override
        public void a_(gir $$0, int $$1, int $$2, float $$3) {
            super.a_($$0, $$1, $$2, $$3);
        }

        @Override
        public int a() {
            return 350;
        }

        public void d() {
            this.aJ_().forEach(a::c);
        }

        @Override
        public void a(String $$0) {
            this.s();
            ArrayList<Map.Entry<amo, gly>> $$1 = new ArrayList<Map.Entry<amo, gly>>(glx.a().entrySet());
            $$1.sort(f);
            gkx $$2 = null;
            for (Map.Entry entry : $$1) {
                if (!((amo)entry.getKey()).a().contains($$0)) continue;
                gkx $$4 = ((gly)entry.getValue()).a();
                if (!$$4.equals($$2)) {
                    this.c(new b($$4.a()));
                    $$2 = $$4;
                }
                this.c(new c((amo)entry.getKey()));
            }
            this.I();
        }

        private void I() {
            this.i();
            gsn.this.d(true);
        }
    }

    class c
    extends a {
        private static final int c = 60;
        private final amo d;
        protected final List<gjc> a = Lists.newArrayList();
        private final gjl<Boolean> e;
        private final gjl<Boolean> f;
        private final gjl<Boolean> g;
        private final String i;
        private final boolean j;

        public c(amo $$0) {
            this.d = $$0;
            gly $$12 = glx.a($$0);
            this.j = $$12 != null && $$12.a(gsn.this.n.aF());
            String $$22 = $$0.a();
            this.i = this.j ? $$22 : String.valueOf(l.u) + $$22;
            this.e = gjl.a((yh)c.f().b(-2142128), (yh)c.f().b(-4539718), false).a().a(this::a).a(10, 5, 60, 16, yh.b($$22), ($$1, $$2) -> this.a($$0, gma.a));
            this.f = gjl.a((yh)d.f().b(-171), (yh)d.f().b(-4539718), false).a().a(this::a).a(10, 5, 60, 16, yh.b($$22), ($$1, $$2) -> this.a($$0, gma.b));
            this.g = gjl.a((yh)e.f().b(-1), (yh)e.f().b(-4539718), false).a().a(this::a).a(10, 5, 60, 16, yh.b($$22), ($$1, $$2) -> this.a($$0, gma.c));
            this.a.add(this.g);
            this.a.add(this.f);
            this.a.add(this.e);
            this.c();
        }

        private yw a(gjl<Boolean> $$0) {
            gma $$1 = ((gsn)gsn.this).n.m.a(this.d);
            yw $$2 = yh.a("debug.entry.currently." + $$1.c(), new Object[]{this.i});
            return yg.a((yh)$$2, $$0.B());
        }

        private void a(amo $$0, gma $$1) {
            ((gsn)gsn.this).n.m.a($$0, $$1);
            for (gje $$2 : gsn.this.x) {
                $$2.k = true;
            }
            this.c();
        }

        @Override
        public List<? extends gmm> aJ_() {
            return this.a;
        }

        @Override
        public List<? extends gpb> b() {
            return this.a;
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            int $$5 = this.d();
            int $$6 = this.h();
            $$0.b(((gsn)gsn.this).n.g, this.i, $$5, $$6 + 5, this.j ? -1 : -8355712);
            int $$7 = $$5 + this.l() - this.g.aS_() - this.f.aS_() - this.e.aS_();
            if (!this.j && $$3 && $$1 < $$7) {
                $$0.a(f, $$1, $$2);
            }
            this.g.f($$7);
            this.f.f(this.g.aT_() + this.g.aS_());
            this.e.f(this.f.aT_() + this.f.aS_());
            this.e.g($$6);
            this.f.g($$6);
            this.g.g($$6);
            this.e.a($$0, $$1, $$2, $$4);
            this.f.a($$0, $$1, $$2, $$4);
            this.g.a($$0, $$1, $$2, $$4);
        }

        @Override
        public void c() {
            gma $$0 = ((gsn)gsn.this).n.m.a(this.d);
            this.e.a($$0 == gma.a);
            this.f.a($$0 == gma.b);
            this.g.a($$0 == gma.c);
            this.e.k = this.e.a() == false;
            this.f.k = this.f.a() == false;
            this.g.k = this.g.a() == false;
        }
    }

    class b
    extends a {
        final yh b;

        public b(yh $$0) {
            this.b = $$0;
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            $$0.a(((gsn)gsn.this).n.g, this.b, this.d() + this.l() / 2, this.h() + 5, -1);
        }

        @Override
        public List<? extends gmm> aJ_() {
            return ImmutableList.of();
        }

        @Override
        public List<? extends gpb> b() {
            return ImmutableList.of((Object)new gpb(){

                @Override
                public gpb.a y() {
                    return gpb.a.b;
                }

                @Override
                public void b(gpd $$0) {
                    $$0.a(gpc.a, b.this.b);
                }
            });
        }

        @Override
        public void c() {
        }
    }

    public static abstract class a
    extends gjk.a<a> {
        public abstract void c();
    }
}

