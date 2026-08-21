/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class cjs<E extends chl>
implements cje<E> {
    private final Map<cqw<?>, cqx> a;
    private final Set<cqw<?>> b;
    private final a c;
    private final b d;
    private final cln<cje<? super E>> e = new cln();
    private cjd.a f = cjd.a.a;

    public cjs(Map<cqw<?>, cqx> $$02, Set<cqw<?>> $$1, a $$2, b $$3, List<Pair<? extends cje<? super E>, Integer>> $$4) {
        this.a = $$02;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        $$4.forEach($$0 -> this.e.a((cje)$$0.getFirst(), (Integer)$$0.getSecond()));
    }

    @Override
    public cjd.a a() {
        return this.f;
    }

    private boolean a(E $$0) {
        for (Map.Entry<cqw<?>, cqx> $$1 : this.a.entrySet()) {
            cqw<?> $$2 = $$1.getKey();
            cqx $$3 = $$1.getValue();
            if (((chl)$$0).ev().a($$2, $$3)) continue;
            return false;
        }
        return true;
    }

    @Override
    public final boolean e(axf $$0, E $$1, long $$2) {
        if (this.a($$1)) {
            this.f = cjd.a.b;
            this.c.a(this.e);
            this.d.a(this.e.b(), $$0, $$1, $$2);
            return true;
        }
        return false;
    }

    @Override
    public final void f(axf $$02, E $$1, long $$2) {
        this.e.b().filter($$0 -> $$0.a() == cjd.a.b).forEach($$3 -> $$3.f($$02, $$1, $$2));
        if (this.e.b().noneMatch($$0 -> $$0.a() == cjd.a.b)) {
            this.g($$02, $$1, $$2);
        }
    }

    @Override
    public final void g(axf $$02, E $$1, long $$2) {
        this.f = cjd.a.a;
        this.e.b().filter($$0 -> $$0.a() == cjd.a.b).forEach($$3 -> $$3.g($$02, $$1, $$2));
        this.b.forEach(((chl)$$1).ev()::b);
    }

    @Override
    public String b() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        Set $$02 = this.e.b().filter($$0 -> $$0.a() == cjd.a.b).collect(Collectors.toSet());
        return "(" + this.getClass().getSimpleName() + "): " + String.valueOf($$02);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a($$0 -> {});
        public static final /* enum */ a b = new a(cln::a);
        private final Consumer<cln<?>> c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(Consumer<cln<?>> $$0) {
            this.c = $$0;
        }

        public void a(cln<?> $$0) {
            this.c.accept($$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = cjs$a.a();
        }
    }

    public static abstract sealed class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(){

            @Override
            public <E extends chl> void a(Stream<cje<? super E>> $$02, axf $$1, E $$2, long $$32) {
                $$02.filter($$0 -> $$0.a() == cjd.a.a).filter($$3 -> $$3.e($$1, $$2, $$32)).findFirst();
            }
        };
        public static final /* enum */ b b = new b(){

            @Override
            public <E extends chl> void a(Stream<cje<? super E>> $$02, axf $$1, E $$2, long $$32) {
                $$02.filter($$0 -> $$0.a() == cjd.a.a).forEach($$3 -> $$3.e($$1, $$2, $$32));
            }
        };
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        public abstract <E extends chl> void a(Stream<cje<? super E>> var1, axf var2, E var3, long var4);

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = cjs$b.a();
        }
    }
}

