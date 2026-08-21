/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class gkc
extends gjk<a> {
    private static final int a = 310;
    private static final int f = 25;
    private final gwc n;

    public gkc(gfj $$0, int $$1, gwc $$2) {
        super($$0, $$1, $$2.e.d(), $$2.e.c(), 25);
        this.e = false;
        this.n = $$2;
    }

    @Override
    public void a(gfn<?> $$0) {
        this.c(gkc$b.a(this.c.k, $$0, (gsb)this.n));
    }

    @Override
    public void a(gfn<?> ... $$0) {
        for (int $$1 = 0; $$1 < $$0.length; $$1 += 2) {
            gfn<?> $$2 = $$1 < $$0.length - 1 ? $$0[$$1 + 1] : null;
            this.c(gkc$b.a(this.c.k, $$0[$$1], $$2, this.n));
        }
    }

    @Override
    public void b(List<gjc> $$0) {
        for (int $$1 = 0; $$1 < $$0.size(); $$1 += 2) {
            this.a($$0.get($$1), $$1 < $$0.size() - 1 ? $$0.get($$1 + 1) : null);
        }
    }

    public void a(gjc $$0, @Nullable gjc $$1) {
        this.c(gkc$b.a($$0, $$1, (gsb)this.n));
    }

    public void a(gjc $$0, gfn<?> $$1, @Nullable gjc $$2) {
        this.c(gkc$b.a($$0, $$1, $$2, (gsb)this.n));
    }

    public void c(yh $$0) {
        int $$1 = this.c.g.b;
        int $$2 = this.aJ_().isEmpty() ? 0 : $$1 * 2;
        this.a(new c(this.n, $$0, $$2), $$2 + $$1 + 4);
    }

    @Override
    public int a() {
        return 310;
    }

    public @Nullable gjc b(gfn<?> $$0) {
        for (a $$1 : this.aJ_()) {
            b $$2;
            gjc $$3;
            if (!($$1 instanceof b) || ($$3 = ($$2 = (b)$$1).a($$0)) == null) continue;
            return $$3;
        }
        return null;
    }

    public void c() {
        for (a $$0 : this.aJ_()) {
            if (!($$0 instanceof b)) continue;
            b $$1 = (b)$$0;
            for (d $$2 : $$1.a) {
                gjc gjc2;
                if ($$2.b() == null || !((gjc2 = $$2.a()) instanceof gfn.i)) continue;
                gfn.i $$3 = (gfn.i)gjc2;
                $$3.d();
            }
        }
    }

    public void c(gfn<?> $$0) {
        for (a $$1 : this.aJ_()) {
            if (!($$1 instanceof b)) continue;
            b $$2 = (b)$$1;
            for (d $$3 : $$2.a) {
                gjc gjc2;
                if ($$3.b() != $$0 || !((gjc2 = $$3.a()) instanceof gkj)) continue;
                gkj $$4 = (gkj)((Object)gjc2);
                $$4.e();
                return;
            }
        }
    }

    protected static class b
    extends a {
        final List<d> a;
        private final gsb b;
        private static final int c = 160;

        private b(List<d> $$0, gsb $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public static b a(gfo $$0, gfn<?> $$1, gsb $$2) {
            return new b(List.of(new d($$1.a($$0, 0, 0, 310), $$1)), $$2);
        }

        public static b a(gjc $$0, @Nullable gjc $$1, gsb $$2) {
            if ($$1 == null) {
                return new b(List.of(new d($$0)), $$2);
            }
            return new b(List.of(new d($$0), new d($$1)), $$2);
        }

        public static b a(gjc $$0, gfn<?> $$1, @Nullable gjc $$2, gsb $$3) {
            if ($$2 == null) {
                return new b(List.of(new d($$0, $$1)), $$3);
            }
            return new b(List.of(new d($$0, $$1), new d($$2)), $$3);
        }

        public static b a(gfo $$0, gfn<?> $$1, @Nullable gfn<?> $$2, gwc $$3) {
            gjc $$4 = $$1.a($$0);
            if ($$2 == null) {
                return new b(List.of(new d($$4, $$1)), $$3);
            }
            return new b(List.of(new d($$4, $$1), new d($$2.a($$0), $$2)), $$3);
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            int $$5 = 0;
            int $$6 = this.b.o / 2 - 155;
            for (d $$7 : this.a) {
                $$7.a().c($$6 + $$5, this.h());
                $$7.a().a($$0, $$1, $$2, $$4);
                $$5 += 160;
            }
        }

        @Override
        public List<? extends gmm> aJ_() {
            return Lists.transform(this.a, d::a);
        }

        @Override
        public List<? extends gpb> b() {
            return Lists.transform(this.a, d::a);
        }

        public @Nullable gjc a(gfn<?> $$0) {
            for (d $$1 : this.a) {
                if ($$1.b != $$0) continue;
                return $$1.a();
            }
            return null;
        }
    }

    protected static class c
    extends a {
        private final gsb a;
        private final int b;
        private final gko c;

        protected c(gsb $$0, yh $$1, int $$2) {
            this.a = $$0;
            this.b = $$2;
            this.c = new gko($$1, $$0.C());
        }

        @Override
        public List<? extends gpb> b() {
            return List.of(this.c);
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            this.c.c(this.a.o / 2 - 155, this.h() + this.b);
            this.c.a($$0, $$1, $$2, $$4);
        }

        @Override
        public List<? extends gmm> aJ_() {
            return List.of(this.c);
        }
    }

    protected static abstract class a
    extends gjk.a<a> {
        protected a() {
        }
    }

    public static final class d
    extends Record {
        private final gjc a;
        final @Nullable gfn<?> b;

        public d(gjc $$0) {
            this($$0, null);
        }

        public d(gjc $$0, @Nullable gfn<?> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "widget;optionInstance", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "widget;optionInstance", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "widget;optionInstance", "a", "b"}, this, $$0);
        }

        public gjc a() {
            return this.a;
        }

        public @Nullable gfn<?> b() {
            return this.b;
        }
    }
}

