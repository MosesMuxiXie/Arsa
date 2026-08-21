/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class gfn<T> {
    private static final Logger c = LogUtils.getLogger();
    public static final e<Boolean> a = new e(ImmutableList.of((Object)Boolean.TRUE, (Object)Boolean.FALSE), Codec.BOOL);
    public static final b<Boolean> b = ($$0, $$1) -> $$1 != false ? yg.b : yg.c;
    private final m<T> d;
    final Function<T, yh> e;
    private final o<T> f;
    private final Codec<T> g;
    private final T h;
    private final Consumer<T> i;
    final yh j;
    private T k;

    public static gfn<Boolean> a(String $$0, boolean $$1, Consumer<Boolean> $$2) {
        return gfn.a($$0, gfn.a(), $$1, $$2);
    }

    public static gfn<Boolean> a(String $$02, boolean $$1) {
        return gfn.a($$02, gfn.a(), $$1, $$0 -> {});
    }

    public static gfn<Boolean> a(String $$02, m<Boolean> $$1, boolean $$2) {
        return gfn.a($$02, $$1, $$2, $$0 -> {});
    }

    public static gfn<Boolean> a(String $$0, m<Boolean> $$1, boolean $$2, Consumer<Boolean> $$3) {
        return gfn.a($$0, $$1, b, $$2, $$3);
    }

    public static gfn<Boolean> a(String $$0, m<Boolean> $$1, b<Boolean> $$2, boolean $$3, Consumer<Boolean> $$4) {
        return new gfn<Boolean>($$0, $$1, $$2, a, $$3, $$4);
    }

    public gfn(String $$0, m<T> $$1, b<T> $$2, o<T> $$3, T $$4, Consumer<T> $$5) {
        this($$0, $$1, $$2, $$3, $$3.f(), $$4, $$5);
    }

    public gfn(String $$0, m<T> $$12, b<T> $$2, o<T> $$3, Codec<T> $$4, T $$5, Consumer<T> $$6) {
        this.j = yh.c($$0);
        this.d = $$12;
        this.e = $$1 -> $$2.toString(this.j, $$1);
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
        this.k = this.h;
    }

    public static <T> m<T> a() {
        return $$0 -> null;
    }

    public static <T> m<T> a(yh $$0) {
        return $$1 -> gks.a($$0);
    }

    public gjc a(gfo $$0) {
        return this.a($$0, 0, 0, 150);
    }

    public gjc a(gfo $$02, int $$1, int $$2, int $$3) {
        return this.a($$02, $$1, $$2, $$3, $$0 -> {});
    }

    public gjc a(gfo $$0, int $$1, int $$2, int $$3, Consumer<T> $$4) {
        return this.f.a(this.d, $$0, $$1, $$2, $$3, $$4).apply(this);
    }

    public T b() {
        return this.k;
    }

    public Codec<T> c() {
        return this.g;
    }

    public String toString() {
        return this.j.getString();
    }

    public void a(T $$0) {
        Object $$1 = this.f.a($$0).orElseGet(() -> {
            c.error("Illegal option value {} for {}", $$0, (Object)this.j.getString());
            return this.h;
        });
        if (!gfj.V().v()) {
            this.k = $$1;
            return;
        }
        if (!Objects.equals(this.k, $$1)) {
            this.k = $$1;
            this.i.accept(this.k);
        }
    }

    public o<T> d() {
        return this.f;
    }

    @FunctionalInterface
    public static interface m<T> {
        public @Nullable gks apply(T var1);
    }

    public static interface b<T> {
        public yh toString(yh var1, T var2);
    }

    public record e<T>(List<T> a, Codec<T> b) implements d<T>
    {
        private final List<T> a;
        private final Codec<T> b;

        @Override
        public Optional<T> a(T $$0) {
            return this.a.contains($$0) ? Optional.of($$0) : Optional.empty();
        }

        @Override
        public gjl.e<T> a() {
            return gjl.e.a(this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "values;codec", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "values;codec", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "values;codec", "a", "b"}, this, $$0);
        }

        public List<T> b() {
            return this.a;
        }

        @Override
        public Codec<T> f() {
            return this.b;
        }
    }

    static interface o<T> {
        public Function<gfn<T>, gjc> a(m<T> var1, gfo var2, int var3, int var4, int var5, Consumer<T> var6);

        public Optional<T> a(T var1);

        public Codec<T> f();
    }

    public static final class n
    extends Enum<n>
    implements l<Double> {
        public static final /* enum */ n a = new n();
        private static final /* synthetic */ n[] b;

        public static n[] values() {
            return (n[])b.clone();
        }

        public static n valueOf(String $$0) {
            return Enum.valueOf(n.class, $$0);
        }

        @Override
        public Optional<Double> a(Double $$0) {
            return $$0 >= 0.0 && $$0 <= 1.0 ? Optional.of($$0) : Optional.empty();
        }

        public double b(Double $$0) {
            return $$0;
        }

        public Double a(double $$0) {
            return $$0;
        }

        public <R> l<R> a(final DoubleFunction<? extends R> $$0, final ToDoubleFunction<? super R> $$1) {
            return new l<R>(){

                @Override
                public Optional<R> a(R $$02) {
                    return this.a((Double)$$1.applyAsDouble($$02)).map($$0::apply);
                }

                @Override
                public double d(R $$02) {
                    return this.b((Double)$$1.applyAsDouble($$02));
                }

                @Override
                public R b(double $$02) {
                    return $$0.apply(this.a($$02));
                }

                @Override
                public Codec<R> f() {
                    return this.f().xmap($$0::apply, $$1::applyAsDouble);
                }
            };
        }

        @Override
        public Codec<Double> f() {
            return Codec.withAlternative((Codec)Codec.doubleRange((double)0.0, (double)1.0), (Codec)Codec.BOOL, $$0 -> $$0 != false ? 1.0 : 0.0);
        }

        @Override
        public /* synthetic */ Object b(double d2) {
            return this.a(d2);
        }

        @Override
        public /* synthetic */ double d(Object object) {
            return this.b((Double)object);
        }

        private static /* synthetic */ n[] b() {
            return new n[]{a};
        }

        static {
            b = n.b();
        }
    }

    public static final class j<T>
    extends Record
    implements l<T> {
        private final List<T> a;
        private final Codec<T> b;

        public j(List<T> $$0, Codec<T> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public double d(T $$0) {
            if ($$0 == this.a.getFirst()) {
                return 0.0;
            }
            if ($$0 == this.a.getLast()) {
                return 1.0;
            }
            return bgj.b((double)this.a.indexOf($$0), 0.0, (double)(this.a.size() - 1), 0.0, 1.0);
        }

        @Override
        public Optional<T> c(T $$0) {
            int $$1 = this.a.indexOf($$0);
            int $$2 = bgj.a($$1 + 1, 0, this.a.size() - 1);
            return Optional.of(this.a.get($$2));
        }

        @Override
        public Optional<T> b(T $$0) {
            int $$1 = this.a.indexOf($$0);
            int $$2 = bgj.a($$1 - 1, 0, this.a.size() - 1);
            return Optional.of(this.a.get($$2));
        }

        @Override
        public T b(double $$0) {
            if ($$0 >= 1.0) {
                $$0 = 0.99999f;
            }
            int $$1 = bgj.c(bgj.b($$0, 0.0, 1.0, 0.0, (double)this.a.size()));
            return this.a.get(bgj.a($$1, 0, this.a.size() - 1));
        }

        @Override
        public Optional<T> a(T $$0) {
            int $$1 = this.a.indexOf($$0);
            return $$1 > -1 ? Optional.of($$0) : Optional.empty();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{j.class, "values;codec", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{j.class, "values;codec", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{j.class, "values;codec", "a", "b"}, this, $$0);
        }

        public List<T> b() {
            return this.a;
        }

        @Override
        public Codec<T> f() {
            return this.b;
        }
    }

    public record c(int a, IntSupplier b, int c) implements g,
    k<Integer>
    {
        private final int a;
        private final IntSupplier b;
        private final int c;

        @Override
        public Optional<Integer> a(Integer $$0) {
            return Optional.of(bgj.a((int)$$0, this.d(), this.b()));
        }

        @Override
        public int b() {
            return this.b.getAsInt();
        }

        @Override
        public Codec<Integer> f() {
            return Codec.INT.validate($$0 -> {
                int $$1 = this.c + 1;
                if ($$0.compareTo(this.a) >= 0 && $$0.compareTo($$1) <= 0) {
                    return DataResult.success((Object)$$0);
                }
                return DataResult.error(() -> "Value " + $$0 + " outside of range [" + this.a + ":" + $$1 + "]", (Object)$$0);
            });
        }

        @Override
        public boolean c() {
            return true;
        }

        @Override
        public gjl.e<Integer> a() {
            return gjl.e.a(IntStream.range(this.a, this.b() + 1).boxed().toList());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "minInclusive;maxSupplier;encodableMaxInclusive", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "minInclusive;maxSupplier;encodableMaxInclusive", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "minInclusive;maxSupplier;encodableMaxInclusive", "a", "b", "c"}, this, $$0);
        }

        @Override
        public int d() {
            return this.a;
        }

        public IntSupplier g() {
            return this.b;
        }

        public int h() {
            return this.c;
        }
    }

    public static final class f
    extends Record
    implements g {
        private final int a;
        private final int b;
        private final boolean c;

        public f(int $$0, int $$1) {
            this($$0, $$1, true);
        }

        public f(int $$0, int $$1, boolean $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public Optional<Integer> a(Integer $$0) {
            return $$0.compareTo(this.d()) >= 0 && $$0.compareTo(this.b()) <= 0 ? Optional.of($$0) : Optional.empty();
        }

        @Override
        public Codec<Integer> f() {
            return Codec.intRange((int)this.a, (int)(this.b + 1));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "minInclusive;maxInclusive;applyValueImmediately", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "minInclusive;maxInclusive;applyValueImmediately", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "minInclusive;maxInclusive;applyValueImmediately", "a", "b", "c"}, this, $$0);
        }

        @Override
        public int d() {
            return this.a;
        }

        @Override
        public int b() {
            return this.b;
        }

        @Override
        public boolean be_() {
            return this.c;
        }
    }

    static interface g
    extends l<Integer> {
        public int d();

        public int b();

        @Override
        default public Optional<Integer> b(Integer $$0) {
            return Optional.of($$0 + 1);
        }

        @Override
        default public Optional<Integer> c(Integer $$0) {
            return Optional.of($$0 - 1);
        }

        @Override
        default public double d(Integer $$0) {
            if ($$0.intValue() == this.d()) {
                return 0.0;
            }
            if ($$0.intValue() == this.b()) {
                return 1.0;
            }
            return bgj.b((double)$$0.intValue() + 0.5, (double)this.d(), (double)this.b() + 1.0, 0.0, 1.0);
        }

        default public Integer a(double $$0) {
            if ($$0 >= 1.0) {
                $$0 = 0.99999f;
            }
            return bgj.c(bgj.b($$0, 0.0, 1.0, (double)this.d(), (double)this.b() + 1.0));
        }

        default public <R> l<R> a(final IntFunction<? extends R> $$0, final ToIntFunction<? super R> $$1, final boolean $$2) {
            return new l<R>(){

                @Override
                public Optional<R> a(R $$02) {
                    return this.a(Integer.valueOf($$1.applyAsInt($$02))).map($$0::apply);
                }

                @Override
                public double d(R $$02) {
                    return this.d($$1.applyAsInt($$02));
                }

                @Override
                public Optional<R> c(R $$02) {
                    if (!$$2) {
                        return Optional.empty();
                    }
                    int $$12 = $$1.applyAsInt($$02);
                    return Optional.of($$0.apply(this.a(Integer.valueOf($$12 + 1)).orElse($$12)));
                }

                @Override
                public Optional<R> b(R $$02) {
                    if (!$$2) {
                        return Optional.empty();
                    }
                    int $$12 = $$1.applyAsInt($$02);
                    return Optional.of($$0.apply(this.a(Integer.valueOf($$12 - 1)).orElse($$12)));
                }

                @Override
                public R b(double $$02) {
                    return $$0.apply(this.a($$02));
                }

                @Override
                public Codec<R> f() {
                    return this.f().xmap($$0::apply, $$1::applyAsInt);
                }
            };
        }

        @Override
        default public /* synthetic */ Object b(double d2) {
            return this.a(d2);
        }

        @Override
        default public /* synthetic */ Optional b(Object object) {
            return this.c((Integer)object);
        }

        @Override
        default public /* synthetic */ Optional c(Object object) {
            return this.b((Integer)object);
        }
    }

    public static final class i<N>
    extends giw
    implements gkj {
        private final gfn<N> n;
        private final l<N> o;
        private final m<N> p;
        private final Consumer<N> q;
        private @Nullable Long r;
        private final boolean s;

        i(gfo $$0, int $$1, int $$2, int $$3, int $$4, gfn<N> $$5, l<N> $$6, m<N> $$7, Consumer<N> $$8, boolean $$9) {
            super($$0, $$1, $$2, $$3, $$4, $$6.d($$5.b()));
            this.n = $$5;
            this.o = $$6;
            this.p = $$7;
            this.q = $$8;
            this.s = $$9;
            this.c();
        }

        @Override
        protected void c() {
            this.a_(this.n.e.apply(this.o.b(this.e)));
            this.a(this.p.apply(this.o.b(this.e)));
        }

        @Override
        protected void a() {
            if (this.s) {
                this.d();
            } else {
                this.r = bhs.c() + 600L;
            }
        }

        public void d() {
            N $$0 = this.o.b(this.e);
            if (!Objects.equals($$0, this.n.b())) {
                this.n.a($$0);
                this.q.accept(this.n.b());
            }
        }

        @Override
        public void e() {
            if (this.e != this.o.d(this.n.b())) {
                this.e = this.o.d(this.n.b());
                this.r = null;
                this.c();
            }
        }

        @Override
        public void a_(gir $$0, int $$1, int $$2, float $$3) {
            super.a_($$0, $$1, $$2, $$3);
            if (this.r != null && bhs.c() >= this.r) {
                this.r = null;
                this.d();
                this.e();
            }
        }

        @Override
        public void a(gzc $$0) {
            super.a($$0);
            if (this.s) {
                this.e();
            }
        }

        @Override
        public boolean a(gzb $$0) {
            if ($$0.c()) {
                this.f = !this.f;
                return true;
            }
            if (this.f) {
                Optional<N> $$4;
                Optional<N> $$3;
                boolean $$1 = $$0.f();
                boolean $$2 = $$0.g();
                if ($$1 && ($$3 = this.o.b(this.o.b(this.e))).isPresent()) {
                    this.a(this.o.d($$3.get()));
                    return true;
                }
                if ($$2 && ($$4 = this.o.c(this.o.b(this.e))).isPresent()) {
                    this.a(this.o.d($$4.get()));
                    return true;
                }
                if ($$1 || $$2) {
                    float $$5 = $$1 ? -1.0f : 1.0f;
                    this.a(this.e + (double)($$5 / (float)(this.g - 8)));
                    return true;
                }
            }
            return false;
        }
    }

    public record h<T>(Supplier<List<T>> a, Function<T, Optional<T>> b, Codec<T> c) implements d<T>
    {
        private final Supplier<List<T>> a;
        private final Function<T, Optional<T>> b;
        private final Codec<T> c;

        @Override
        public Optional<T> a(T $$0) {
            return this.b.apply($$0);
        }

        @Override
        public gjl.e<T> a() {
            return gjl.e.a((Collection)this.a.get());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{h.class, "values;validateValue;codec", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{h.class, "values;validateValue;codec", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{h.class, "values;validateValue;codec", "a", "b", "c"}, this, $$0);
        }

        public Supplier<List<T>> b() {
            return this.a;
        }

        public Function<T, Optional<T>> c() {
            return this.b;
        }

        @Override
        public Codec<T> f() {
            return this.c;
        }
    }

    public record a<T>(List<T> a, List<T> b, BooleanSupplier c, d.a<T> d, Codec<T> e) implements d<T>
    {
        private final List<T> a;
        private final List<T> b;
        private final BooleanSupplier c;
        private final d.a<T> d;
        private final Codec<T> e;

        @Override
        public gjl.e<T> a() {
            return gjl.e.a(this.c, this.a, this.b);
        }

        @Override
        public Optional<T> a(T $$0) {
            return (this.c.getAsBoolean() ? this.b : this.a).contains($$0) ? Optional.of($$0) : Optional.empty();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "values;altValues;altCondition;valueSetter;codec", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "values;altValues;altCondition;valueSetter;codec", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "values;altValues;altCondition;valueSetter;codec", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public List<T> b() {
            return this.a;
        }

        public List<T> c() {
            return this.b;
        }

        public BooleanSupplier d() {
            return this.c;
        }

        @Override
        public d.a<T> e() {
            return this.d;
        }

        @Override
        public Codec<T> f() {
            return this.e;
        }
    }

    static interface k<T>
    extends d<T>,
    l<T> {
        public boolean c();

        @Override
        default public Function<gfn<T>, gjc> a(m<T> $$0, gfo $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
            if (this.c()) {
                return d.super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
            return l.super.a($$0, $$1, $$2, $$3, $$4, $$5);
        }
    }

    static interface d<T>
    extends o<T> {
        public gjl.e<T> a();

        default public a<T> e() {
            return gfn::a;
        }

        @Override
        default public Function<gfn<T>, gjc> a(m<T> $$0, gfo $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
            return $$6 -> gjl.a($$6.e, $$6::b).a(this.a()).a($$0).a($$2, $$3, $$4, 20, $$6.j, (gjl<T> $$3, T $$4) -> {
                this.e().set((gfn<Object>)$$6, $$4);
                $$1.aQ();
                $$5.accept($$4);
            });
        }

        public static interface a<T> {
            public void set(gfn<T> var1, T var2);
        }
    }

    static interface l<T>
    extends o<T> {
        public double d(T var1);

        default public Optional<T> c(T $$0) {
            return Optional.empty();
        }

        default public Optional<T> b(T $$0) {
            return Optional.empty();
        }

        public T b(double var1);

        default public boolean be_() {
            return true;
        }

        @Override
        default public Function<gfn<T>, gjc> a(m<T> $$0, gfo $$1, int $$2, int $$3, int $$4, Consumer<T> $$5) {
            return $$6 -> new i($$1, $$2, $$3, $$4, 20, $$6, this, $$0, $$5, this.be_());
        }
    }
}

