/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class gjl<T>
extends giu
implements gkj {
    public static final BooleanSupplier a = () -> gfj.V().e();
    private static final List<Boolean> b = ImmutableList.of((Object)Boolean.TRUE, (Object)Boolean.FALSE);
    private final Supplier<T> c;
    private final yh d;
    private int f;
    private T n;
    private final e<T> o;
    private final Function<T, yh> p;
    private final Function<gjl<T>, yw> q;
    private final c<T> r;
    private final b s;
    private final gfn.m<T> t;
    private final d<T> u;

    gjl(int $$0, int $$1, int $$2, int $$3, yh $$4, yh $$5, int $$6, T $$7, Supplier<T> $$8, e<T> $$9, Function<T, yh> $$10, Function<gjl<T>, yw> $$11, c<T> $$12, gfn.m<T> $$13, b $$14, d<T> $$15) {
        super($$0, $$1, $$2, $$3, $$4);
        this.d = $$5;
        this.f = $$6;
        this.c = $$8;
        this.n = $$7;
        this.o = $$9;
        this.p = $$10;
        this.q = $$11;
        this.r = $$12;
        this.s = $$14;
        this.t = $$13;
        this.u = $$15;
        this.d();
    }

    @Override
    protected void b(gir $$0, int $$1, int $$2, float $$3) {
        amo $$4 = this.u.apply(this, this.a());
        if ($$4 != null) {
            $$0.a(hpa.at, $$4, this.aT_(), this.aU_(), this.aS_(), this.aR_());
        } else {
            this.a((T)$$0);
        }
        if (this.s != gjl$b.c) {
            this.a((T)$$0.a(this, gir.a.a));
        }
    }

    private void d() {
        this.a((T)this.t.apply(this.n));
    }

    @Override
    public void a(gza $$0) {
        if ($$0.m()) {
            this.a(-1);
        } else {
            this.a(1);
        }
    }

    private void a(int $$0) {
        List<T> $$1 = this.o.a();
        this.f = bgj.c(this.f + $$0, $$1.size());
        T $$2 = $$1.get(this.f);
        this.b($$2);
        this.r.onValueChange(this, $$2);
    }

    private T b(int $$0) {
        List<T> $$1 = this.o.a();
        return $$1.get(bgj.c(this.f + $$0, $$1.size()));
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if ($$3 > 0.0) {
            this.a(-1);
        } else if ($$3 < 0.0) {
            this.a(1);
        }
        return true;
    }

    public void a(T $$0) {
        List<T> $$1 = this.o.a();
        int $$2 = $$1.indexOf($$0);
        if ($$2 != -1) {
            this.f = $$2;
        }
        this.b($$0);
    }

    @Override
    public void e() {
        this.a(this.c.get());
    }

    private void b(T $$0) {
        yh $$1 = this.c($$0);
        this.a_($$1);
        this.n = $$0;
        this.d();
    }

    private yh c(T $$0) {
        return this.s == gjl$b.b ? this.p.apply($$0) : this.d($$0);
    }

    private yw d(T $$0) {
        return yg.a(this.d, this.p.apply($$0));
    }

    public T a() {
        return this.n;
    }

    @Override
    protected yw f() {
        return this.q.apply(this);
    }

    @Override
    public void a(gpd $$0) {
        $$0.a(gpc.a, (yh)this.f());
        if (this.k) {
            T $$1 = this.b(1);
            yh $$2 = this.c($$1);
            if (this.aP_()) {
                $$0.a(gpc.d, (yh)yh.a("narration.cycle_button.usage.focused", $$2));
            } else {
                $$0.a(gpc.d, (yh)yh.a("narration.cycle_button.usage.hovered", $$2));
            }
        }
    }

    public yw c() {
        return gjl.b(this.s == gjl$b.b ? this.d(this.n) : this.B());
    }

    public static <T> a<T> a(Function<T, yh> $$0, Supplier<T> $$1) {
        return new a<T>($$0, $$1);
    }

    public static <T> a<T> a(Function<T, yh> $$0, T $$1) {
        return new a<Object>($$0, () -> $$1);
    }

    public static a<Boolean> a(yh $$0, yh $$1, boolean $$22) {
        return new a<Boolean>($$2 -> $$2 == Boolean.TRUE ? $$0 : $$1, () -> $$22).a((Collection<Boolean>)b);
    }

    public static a<Boolean> a(boolean $$02) {
        return new a<Boolean>($$0 -> $$0 == Boolean.TRUE ? yg.b : yg.c, () -> $$02).a((Collection<Boolean>)b);
    }

    public static interface e<T> {
        public List<T> a();

        public List<T> b();

        public static <T> e<T> a(Collection<T> $$0) {
            ImmutableList $$1 = ImmutableList.copyOf($$0);
            return new e<T>((List)$$1){
                final /* synthetic */ List a;
                {
                    this.a = list;
                }

                @Override
                public List<T> a() {
                    return this.a;
                }

                @Override
                public List<T> b() {
                    return this.a;
                }
            };
        }

        public static <T> e<T> a(final BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
            ImmutableList $$3 = ImmutableList.copyOf($$1);
            ImmutableList $$4 = ImmutableList.copyOf($$2);
            return new e<T>((List)$$4, (List)$$3){
                final /* synthetic */ List b;
                final /* synthetic */ List c;
                {
                    this.b = list;
                    this.c = list2;
                }

                @Override
                public List<T> a() {
                    return $$0.getAsBoolean() ? this.b : this.c;
                }

                @Override
                public List<T> b() {
                    return this.c;
                }
            };
        }
    }

    @FunctionalInterface
    public static interface c<T> {
        public void onValueChange(gjl<T> var1, T var2);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = gjl$b.a();
        }
    }

    @FunctionalInterface
    public static interface d<T> {
        public @Nullable amo apply(gjl<T> var1, T var2);
    }

    public static class a<T> {
        private final Supplier<T> a;
        private final Function<T, yh> b;
        private gfn.m<T> c = $$0 -> null;
        private d<T> d = ($$0, $$1) -> null;
        private Function<gjl<T>, yw> e = gjl::c;
        private e<T> f = gjl$e.a(ImmutableList.of());
        private b g = gjl$b.a;

        public a(Function<T, yh> $$02, Supplier<T> $$12) {
            this.b = $$02;
            this.a = $$12;
        }

        public a<T> a(Collection<T> $$0) {
            return this.a(gjl$e.a($$0));
        }

        @SafeVarargs
        public final a<T> a(T ... $$0) {
            return this.a((Collection<T>)ImmutableList.copyOf((Object[])$$0));
        }

        public a<T> a(List<T> $$0, List<T> $$1) {
            return this.a(gjl$e.a(a, $$0, $$1));
        }

        public a<T> a(BooleanSupplier $$0, List<T> $$1, List<T> $$2) {
            return this.a(gjl$e.a($$0, $$1, $$2));
        }

        public a<T> a(e<T> $$0) {
            this.f = $$0;
            return this;
        }

        public a<T> a(gfn.m<T> $$0) {
            this.c = $$0;
            return this;
        }

        public a<T> a(Function<gjl<T>, yw> $$0) {
            this.e = $$0;
            return this;
        }

        public a<T> a(d<T> $$0) {
            this.d = $$0;
            return this;
        }

        public a<T> a(b $$0) {
            this.g = $$0;
            return this;
        }

        public a<T> a() {
            return this.a(gjl$b.b);
        }

        public gjl<T> a(yh $$0, c<T> $$1) {
            return this.a(0, 0, 150, 20, $$0, $$1);
        }

        public gjl<T> a(int $$02, int $$12, int $$2, int $$3, yh $$4) {
            return this.a($$02, $$12, $$2, $$3, $$4, ($$0, $$1) -> {});
        }

        public gjl<T> a(int $$0, int $$1, int $$2, int $$3, yh $$4, c<T> $$5) {
            List<T> $$6 = this.f.b();
            if ($$6.isEmpty()) {
                throw new IllegalStateException("No values for cycle button");
            }
            T $$7 = this.a.get();
            int $$8 = $$6.indexOf($$7);
            yh $$9 = this.b.apply($$7);
            yh $$10 = this.g == gjl$b.b ? $$9 : yg.a($$4, $$9);
            return new gjl<T>($$0, $$1, $$2, $$3, $$10, $$4, $$8, $$7, this.a, this.f, this.b, this.e, $$5, this.c, this.g, this.d);
        }
    }
}

