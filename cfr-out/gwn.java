/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class gwn {
    private final bak a;
    final List<bah> b;
    final List<bah> c;
    final Function<bah, amo> d;
    final Consumer<b> e;
    private final Consumer<bak> f;

    public gwn(Consumer<b> $$0, Function<bah, amo> $$1, bak $$2, Consumer<bak> $$3) {
        this.e = $$0;
        this.d = $$1;
        this.a = $$2;
        this.b = Lists.newArrayList($$2.g());
        Collections.reverse(this.b);
        this.c = Lists.newArrayList($$2.d());
        this.c.removeAll(this.b);
        this.f = $$3;
    }

    public Stream<a> a() {
        return this.c.stream().map($$0 -> new d((bah)$$0));
    }

    public Stream<a> b() {
        return this.b.stream().map($$0 -> new c((bah)$$0));
    }

    void e() {
        this.a.b((Collection)Lists.reverse(this.b).stream().map(bah::g).collect(ImmutableList.toImmutableList()));
    }

    public void c() {
        this.e();
        this.f.accept(this.a);
    }

    public void d() {
        this.a.a();
        this.b.retainAll(this.a.d());
        this.c.clear();
        this.c.addAll(this.a.d());
        this.c.removeAll(this.b);
    }

    class c
    extends b {
        public c(bah $$0) {
            super($$0);
        }

        @Override
        protected List<bah> s() {
            return gwn.this.b;
        }

        @Override
        protected List<bah> t() {
            return gwn.this.c;
        }

        @Override
        public boolean n() {
            return true;
        }

        @Override
        public void j() {
        }

        @Override
        public void k() {
            this.u();
        }
    }

    class d
    extends b {
        public d(bah $$0) {
            super($$0);
        }

        @Override
        protected List<bah> s() {
            return gwn.this.c;
        }

        @Override
        protected List<bah> t() {
            return gwn.this.b;
        }

        @Override
        public boolean n() {
            return false;
        }

        @Override
        public void j() {
            this.u();
        }

        @Override
        public void k() {
        }
    }

    public abstract class b
    implements a {
        private final bah b;

        public b(bah $$1) {
            this.b = $$1;
        }

        protected abstract List<bah> s();

        protected abstract List<bah> t();

        @Override
        public amo a() {
            return gwn.this.d.apply(this.b);
        }

        @Override
        public bai b() {
            return this.b.d();
        }

        @Override
        public String c() {
            return this.b.g();
        }

        @Override
        public yh d() {
            return this.b.b();
        }

        @Override
        public yh e() {
            return this.b.c();
        }

        @Override
        public bal f() {
            return this.b.l();
        }

        @Override
        public boolean h() {
            return this.b.j();
        }

        @Override
        public boolean i() {
            return this.b.i();
        }

        protected void u() {
            this.s().remove(this.b);
            this.b.k().a(this.t(), this.b, bah::h, true);
            gwn.this.e.accept(this);
            gwn.this.e();
            this.v();
        }

        private void v() {
            if (this.b.g().equals("high_contrast")) {
                gfn<Boolean> $$0;
                $$0.a(($$0 = gfj.V().k.A()).b() == false);
            }
        }

        protected void a(int $$0) {
            List<bah> $$1 = this.s();
            int $$2 = $$1.indexOf(this.b);
            $$1.remove($$2);
            $$1.add($$2 + $$0, this.b);
            gwn.this.e.accept(this);
        }

        @Override
        public boolean q() {
            List<bah> $$0 = this.s();
            int $$1 = $$0.indexOf(this.b);
            return $$1 > 0 && !$$0.get($$1 - 1).j();
        }

        @Override
        public void l() {
            this.a(-1);
        }

        @Override
        public boolean r() {
            List<bah> $$0 = this.s();
            int $$1 = $$0.indexOf(this.b);
            return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
        }

        @Override
        public void m() {
            this.a(1);
        }
    }

    public static interface a {
        public amo a();

        public bai b();

        public String c();

        public yh d();

        public yh e();

        public bal f();

        default public yh g() {
            return this.f().a(this.e());
        }

        public boolean h();

        public boolean i();

        public void j();

        public void k();

        public void l();

        public void m();

        public boolean n();

        default public boolean o() {
            return !this.n();
        }

        default public boolean p() {
            return this.n() && !this.i();
        }

        public boolean q();

        public boolean r();
    }
}

