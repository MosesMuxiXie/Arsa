/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public abstract class giy<E extends a<E>>
extends giv {
    private static final amo a = amo.b("textures/gui/menu_list_background.png");
    private static final amo f = amo.b("textures/gui/inworld_menu_list_background.png");
    private static final int n = 2;
    protected final gfj c;
    protected final int d;
    private final List<E> o = new b();
    protected boolean e = true;
    private @Nullable E p;
    private @Nullable E q;

    public giy(gfj $$0, int $$1, int $$2, int $$3, int $$4) {
        super(0, $$3, $$1, $$2, yg.a);
        this.c = $$0;
        this.d = $$4;
    }

    public @Nullable E q() {
        return this.p;
    }

    public void a(@Nullable E $$0) {
        this.p = $$0;
        if ($$0 != null) {
            boolean $$2;
            boolean $$1 = ((a)$$0).h() < this.aU_();
            boolean bl2 = $$2 = ((a)$$0).k() > this.F();
            if (this.c.aY().b() || $$1 || $$2) {
                this.f($$0);
            }
        }
    }

    public @Nullable E r() {
        return (E)((a)super.aO_());
    }

    public final List<E> aJ_() {
        return Collections.unmodifiableList(this.o);
    }

    protected void a(Comparator<E> $$0) {
        this.o.sort($$0);
        this.I();
    }

    protected void a(int $$0, int $$1) {
        Collections.swap(this.o, $$0, $$1);
        this.I();
        this.f((a)this.o.get($$1));
    }

    protected void s() {
        this.o.clear();
        this.p = null;
    }

    protected void b(E $$0) {
        this.o.removeIf($$1 -> $$1 != $$0);
        if (this.p != $$0) {
            this.a((E)null);
        }
    }

    public void a(Collection<E> $$0) {
        this.s();
        for (a $$1 : $$0) {
            this.c($$1);
        }
    }

    private int d() {
        return this.aU_() + 2;
    }

    public int t() {
        int $$0 = this.d() - (int)this.h();
        for (a $$1 : this.o) {
            $$0 += $$1.aR_();
        }
        return $$0;
    }

    protected int c(E $$0) {
        return this.a($$0, this.d);
    }

    protected int a(E $$0, int $$1) {
        ((a)$$0).f(this.w());
        ((a)$$0).h(this.a());
        ((a)$$0).g(this.t());
        ((a)$$0).i($$1);
        this.o.add($$0);
        return this.o.size() - 1;
    }

    protected void d(E $$0) {
        this.b($$0, this.d);
    }

    protected void b(E $$0, int $$1) {
        double $$2 = (double)this.j() - this.h();
        ((a)$$0).i($$1);
        this.o.addFirst($$0);
        this.I();
        this.a((double)this.j() - $$2);
    }

    private void I() {
        int $$0 = this.d() - (int)this.h();
        for (a $$1 : this.o) {
            $$1.g($$0);
            $$0 += $$1.aR_();
            $$1.f(this.w());
            $$1.h(this.a());
        }
    }

    protected void e(E $$0) {
        double $$1 = (double)this.j() - this.h();
        this.h($$0);
        this.a((double)this.j() - $$1);
    }

    protected int u() {
        return this.aJ_().size();
    }

    protected boolean v() {
        return true;
    }

    protected final @Nullable E b(double $$0, double $$1) {
        for (a $$2 : this.o) {
            if (!$$2.a_($$0, $$1)) continue;
            return (E)$$2;
        }
        return null;
    }

    public void a(int $$0, gou $$1) {
        this.a($$0, $$1.d(), $$1.c());
    }

    public void a(int $$0, int $$1, int $$2) {
        this.a($$0, $$1, 0, $$2);
    }

    public void a(int $$0, int $$1, int $$2, int $$3) {
        this.b((E)$$0, $$1);
        this.c($$2, $$3);
        this.I();
        if (this.q() != null) {
            this.f(this.q());
        }
        this.i();
    }

    @Override
    protected int o() {
        int $$0 = 0;
        for (a $$1 : this.o) {
            $$0 += $$1.aR_();
        }
        return $$0 + 4;
    }

    @Override
    public void a_(gir $$0, int $$1, int $$2, float $$3) {
        this.q = this.a_($$1, $$2) ? this.b((double)$$1, (double)$$2) : null;
        this.a($$0);
        this.c($$0);
        this.c($$0, $$1, $$2, $$3);
        $$0.f();
        this.b($$0);
        this.a($$0, (E)$$1, $$2);
    }

    protected void b(gir $$0) {
        amo $$1 = this.c.r == null ? gsb.h : gsb.j;
        amo $$2 = this.c.r == null ? gsb.i : gsb.k;
        $$0.a(hpa.at, $$1, this.aT_(), this.aU_() - 2, 0.0f, 0.0f, this.aS_(), 2, 32, 2);
        $$0.a(hpa.at, $$2, this.aT_(), this.F(), 0.0f, 0.0f, this.aS_(), 2, 32, 2);
    }

    protected void a(gir $$0) {
        amo $$1 = this.c.r == null ? a : f;
        $$0.a(hpa.at, $$1, this.aT_(), this.aU_(), (float)this.E(), (float)(this.F() + (int)this.h()), this.aS_(), this.aR_(), 32, 32);
    }

    protected void c(gir $$0) {
        $$0.c(this.aT_(), this.aU_(), this.E(), this.F());
    }

    protected void f(E $$0) {
        int $$2;
        int $$1 = ((a)$$0).aU_() - this.aU_() - 2;
        if ($$1 < 0) {
            this.h($$1);
        }
        if (($$2 = this.F() - ((a)$$0).aU_() - ((a)$$0).aR_() - 2) < 0) {
            this.h(-$$2);
        }
    }

    protected void g(E $$0) {
        int $$1 = 0;
        for (a $$2 : this.o) {
            if ($$2 == $$0) {
                $$1 += $$2.aR_() / 2;
                break;
            }
            $$1 += $$2.aR_();
        }
        this.a((double)$$1 - (double)this.h / 2.0);
    }

    private void h(int $$0) {
        this.a(this.h() + (double)$$0);
    }

    @Override
    public void a(double $$0) {
        super.a($$0);
        this.I();
    }

    @Override
    protected double p() {
        return (double)this.d / 2.0;
    }

    @Override
    protected int m() {
        return this.x() + 6 + 2;
    }

    @Override
    public Optional<gmm> c(double $$0, double $$1) {
        return Optional.ofNullable(this.b($$0, $$1));
    }

    @Override
    public void b(boolean $$0) {
        super.b($$0);
        if (!$$0) {
            this.a((gmm)null);
        }
    }

    @Override
    public void a(@Nullable gmm $$0) {
        E $$1 = this.r();
        if ($$1 != $$0 && $$1 instanceof gml) {
            gml $$2 = (gml)$$1;
            $$2.a((gmm)null);
        }
        super.a($$0);
        int $$3 = this.o.indexOf($$0);
        if ($$3 >= 0) {
            a $$4 = (a)this.o.get($$3);
            this.a((E)$$4);
        }
    }

    protected @Nullable E a(gpk $$02) {
        return (E)this.a($$02, (E $$0) -> true);
    }

    protected @Nullable E a(gpk $$0, Predicate<E> $$1) {
        return this.a($$0, $$1, this.q());
    }

    protected @Nullable E a(gpk $$0, Predicate<E> $$1, @Nullable E $$2) {
        int $$3;
        switch ($$0) {
            default: {
                throw new MatchException(null, null);
            }
            case d: 
            case c: {
                int n2 = 0;
                break;
            }
            case a: {
                int n2 = -1;
                break;
            }
            case b: {
                int n2 = $$3 = 1;
            }
        }
        if (!this.aJ_().isEmpty() && $$3 != 0) {
            if ($$2 == null) {
                int $$4 = $$3 > 0 ? 0 : this.aJ_().size() - 1;
            } else {
                int $$5 = this.aJ_().indexOf($$2) + $$3;
            }
            for (void $$6 = $$5; $$6 >= 0 && $$6 < this.o.size(); $$6 += $$3) {
                a $$7 = (a)this.aJ_().get((int)$$6);
                if (!$$1.test($$7)) continue;
                return (E)$$7;
            }
        }
        return null;
    }

    protected void c(gir $$0, int $$1, int $$2, float $$3) {
        for (a $$4 : this.o) {
            if ($$4.aU_() + $$4.aR_() < this.aU_() || $$4.aU_() > this.F()) continue;
            this.a($$0, $$1, $$2, $$3, $$4);
        }
    }

    protected void a(gir $$0, int $$1, int $$2, float $$3, E $$4) {
        if (this.v() && this.q() == $$4) {
            int $$5 = this.aP_() ? -1 : -8355712;
            this.a($$0, $$4, $$5);
        }
        ((a)$$4).a($$0, $$1, $$2, Objects.equals(this.q, $$4), $$3);
    }

    protected void a(gir $$0, E $$1, int $$2) {
        int $$3 = ((a)$$1).aT_();
        int $$4 = ((a)$$1).aU_();
        int $$5 = $$3 + ((a)$$1).aS_();
        int $$6 = $$4 + ((a)$$1).aR_();
        $$0.a($$3, $$4, $$5, $$6, $$2);
        $$0.a($$3 + 1, $$4 + 1, $$5 - 1, $$6 - 1, -16777216);
    }

    public int w() {
        return this.aT_() + this.g / 2 - this.a() / 2;
    }

    public int x() {
        return this.w() + this.a();
    }

    public int a(int $$0) {
        return ((a)this.o.get($$0)).aU_();
    }

    public int b(int $$0) {
        a $$1 = (a)this.o.get($$0);
        return $$1.aU_() + $$1.aR_();
    }

    public int a() {
        return 220;
    }

    @Override
    public gpb.a y() {
        if (this.aP_()) {
            return gpb.a.c;
        }
        if (this.q != null) {
            return gpb.a.b;
        }
        return gpb.a.a;
    }

    protected void a(List<E> $$0) {
        $$0.forEach(this::h);
    }

    protected void h(E $$0) {
        boolean $$1 = this.o.remove($$0);
        if ($$1) {
            this.I();
            if ($$0 == this.q()) {
                this.a((E)null);
            }
        }
    }

    protected @Nullable E z() {
        return this.q;
    }

    void i(a<E> $$0) {
        $$0.e = this;
    }

    protected void a(gpd $$0, E $$1) {
        int $$3;
        List<E> $$2 = this.aJ_();
        if ($$2.size() > 1 && ($$3 = $$2.indexOf($$1)) != -1) {
            $$0.a(gpc.b, (yh)yh.a("narrator.position.list", $$3 + 1, $$2.size()));
        }
    }

    @Override
    public /* synthetic */ @Nullable gmm aO_() {
        return this.r();
    }

    class b
    extends AbstractList<E> {
        private final List<E> b = Lists.newArrayList();

        b() {
        }

        public E a(int $$0) {
            return (a)this.b.get($$0);
        }

        @Override
        public int size() {
            return this.b.size();
        }

        public E a(int $$0, E $$1) {
            a $$2 = (a)this.b.set($$0, $$1);
            giy.this.i($$1);
            return $$2;
        }

        public void b(int $$0, E $$1) {
            this.b.add($$0, $$1);
            giy.this.i($$1);
        }

        public E b(int $$0) {
            return (a)this.b.remove($$0);
        }

        @Override
        public /* synthetic */ Object remove(int n2) {
            return this.b(n2);
        }

        @Override
        public /* synthetic */ void add(int n2, Object object) {
            this.b(n2, (a)object);
        }

        @Override
        public /* synthetic */ Object set(int n2, Object object) {
            return this.a(n2, (a)object);
        }

        @Override
        public /* synthetic */ Object get(int n2) {
            return this.a(n2);
        }
    }

    protected static abstract class a<E extends a<E>>
    implements gmm,
    gow {
        public static final int h = 2;
        private int a = 0;
        private int b = 0;
        private int c = 0;
        private int d;
        @Deprecated
        giy<E> e;

        protected a() {
        }

        @Override
        public void b(boolean $$0) {
        }

        @Override
        public boolean aP_() {
            return this.e.r() == this;
        }

        public abstract void a(gir var1, int var2, int var3, boolean var4, float var5);

        @Override
        public boolean a_(double $$0, double $$1) {
            return this.aV_().a((int)$$0, (int)$$1);
        }

        @Override
        public void f(int $$0) {
            this.a = $$0;
        }

        @Override
        public void g(int $$0) {
            this.b = $$0;
        }

        public void h(int $$0) {
            this.c = $$0;
        }

        public void i(int $$0) {
            this.d = $$0;
        }

        public int d() {
            return this.aT_() + 2;
        }

        public int h() {
            return this.aU_() + 2;
        }

        public int i() {
            return this.aR_() - 4;
        }

        public int j() {
            return this.h() + this.i() / 2;
        }

        public int k() {
            return this.h() + this.i();
        }

        public int l() {
            return this.aS_() - 4;
        }

        public int m() {
            return this.d() + this.l() / 2;
        }

        public int n() {
            return this.d() + this.l();
        }

        @Override
        public int aT_() {
            return this.a;
        }

        @Override
        public int aU_() {
            return this.b;
        }

        @Override
        public int aS_() {
            return this.c;
        }

        @Override
        public int aR_() {
            return this.d;
        }

        @Override
        public void a(Consumer<gjc> $$0) {
        }

        @Override
        public gpm aV_() {
            return gow.super.aV_();
        }
    }
}

