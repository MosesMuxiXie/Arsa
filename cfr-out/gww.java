/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class gww {
    public static final int a = 20;
    private static final gku b = new gku(amo.b("recipe_book/page_forward"), amo.b("recipe_book/page_forward_highlighted"));
    private static final gku c = new gku(amo.b("recipe_book/page_backward"), amo.b("recipe_book/page_backward_highlighted"));
    private static final yh d = yh.c("gui.recipebook.next_page");
    private static final yh e = yh.c("gui.recipebook.previous_page");
    private static final int f = 12;
    private static final int g = 17;
    private final List<gwy> h = Lists.newArrayListWithCapacity((int)20);
    private @Nullable gwy i;
    private final gwu j;
    private gfj k;
    private final gwv<?> l;
    private List<gwz> m = ImmutableList.of();
    private @Nullable gjq n;
    private @Nullable gjq o;
    private int p;
    private int q;
    private geu r;
    private @Nullable dsa s;
    private @Nullable gwz t;
    private boolean u;

    public gww(gwv<?> $$0, gxc $$1, boolean $$2) {
        this.l = $$0;
        this.j = new gwu($$1, $$2);
        for (int $$3 = 0; $$3 < 20; ++$$3) {
            this.h.add(new gwy($$1));
        }
    }

    public void a(gfj $$02, int $$1, int $$2) {
        this.k = $$02;
        this.r = $$02.s.y();
        for (int $$3 = 0; $$3 < this.h.size(); ++$$3) {
            this.h.get($$3).c($$1 + 11 + 25 * ($$3 % 5), $$2 + 31 + 25 * ($$3 / 5));
        }
        this.n = new gjq($$1 + 93, $$2 + 137, 12, 17, b, $$0 -> this.f(), d);
        this.n.a(gks.a(d));
        this.o = new gjq($$1 + 38, $$2 + 137, 12, 17, c, $$0 -> this.f(), e);
        this.o.a(gks.a(e));
    }

    public void a(List<gwz> $$0, boolean $$1, boolean $$2) {
        this.m = $$0;
        this.u = $$2;
        this.p = (int)Math.ceil((double)$$0.size() / 20.0);
        if (this.p <= this.q || $$1) {
            this.q = 0;
        }
        this.e();
    }

    private void e() {
        int $$0 = 20 * this.q;
        bhx $$1 = dsf.a(this.k.r);
        for (int $$2 = 0; $$2 < this.h.size(); ++$$2) {
            gwy $$3 = this.h.get($$2);
            if ($$0 + $$2 < this.m.size()) {
                gwz $$4 = this.m.get($$0 + $$2);
                $$3.a($$4, this.u, this, $$1);
                $$3.l = true;
                continue;
            }
            $$3.l = false;
        }
        this.f();
    }

    private void f() {
        if (this.n != null) {
            boolean bl2 = this.n.l = this.p > 1 && this.q < this.p - 1;
        }
        if (this.o != null) {
            this.o.l = this.p > 1 && this.q > 0;
        }
    }

    public void a(gir $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
        if (this.p > 1) {
            yw $$6 = yh.a("gui.recipebook.page", this.q + 1, this.p);
            int $$7 = this.k.g.a($$6);
            $$0.b(this.k.g, $$6, $$1 - $$7 / 2 + 73, $$2 + 141, -1);
        }
        this.i = null;
        for (gwy $$8 : this.h) {
            $$8.a($$0, $$3, $$4, $$5);
            if (!$$8.l || !$$8.D()) continue;
            this.i = $$8;
        }
        if (this.n != null) {
            this.n.a($$0, $$3, $$4, $$5);
        }
        if (this.o != null) {
            this.o.a($$0, $$3, $$4, $$5);
        }
        $$0.c();
        this.j.a($$0, $$3, $$4, $$5);
    }

    public void a(gir $$0, int $$1, int $$2) {
        if (this.k.x != null && this.i != null && !this.j.c()) {
            dlt $$3 = this.i.h();
            amo $$4 = $$3.a(ki.K);
            $$0.a(this.k.g, this.i.a($$3), $$1, $$2, $$4);
        }
    }

    public @Nullable dsa a() {
        return this.s;
    }

    public @Nullable gwz b() {
        return this.t;
    }

    public void c() {
        this.j.a(false);
    }

    public boolean a(gzc $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
        this.s = null;
        this.t = null;
        if (this.j.c()) {
            if (this.j.a($$0, $$5)) {
                this.s = this.j.b();
                this.t = this.j.a();
            } else {
                this.j.a(false);
            }
            return true;
        }
        if (this.n.a($$0, $$5)) {
            ++this.q;
            this.e();
            return true;
        }
        if (this.o.a($$0, $$5)) {
            --this.q;
            this.e();
            return true;
        }
        bhx $$6 = dsf.a(this.k.r);
        for (gwy $$7 : this.h) {
            if (!$$7.a($$0, $$5)) continue;
            if ($$0.t() == 0) {
                this.s = $$7.e();
                this.t = $$7.a();
            } else if ($$0.t() == 1 && !this.j.c() && !$$7.d()) {
                this.j.a($$7.a(), $$6, this.u, $$7.aT_(), $$7.aU_(), $$1 + $$3 / 2, $$2 + 13 + $$4 / 2, $$7.aS_());
            }
            return true;
        }
        return false;
    }

    public void a(dsa $$0) {
        this.l.a($$0);
    }

    public geu d() {
        return this.r;
    }

    protected void a(Consumer<gjc> $$0) {
        this.h.forEach($$0);
    }
}

