/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;

public final class cao<T> {
    private final a a;
    private final List<Pair<T, a>> b;
    private final Duration c;

    public cao(Duration $$0, List<Pair<T, a>> $$1) {
        this.c = $$0;
        this.a = $$1.stream().map(Pair::getSecond).reduce(new a(0L, 0L), a::a);
        this.b = $$1.stream().sorted(Comparator.comparing(Pair::getSecond, cao$a.c)).limit(10L).toList();
    }

    public double a() {
        return (double)this.a.a / (double)this.c.getSeconds();
    }

    public double b() {
        return (double)this.a.b / (double)this.c.getSeconds();
    }

    public long c() {
        return this.a.a;
    }

    public long d() {
        return this.a.b;
    }

    public List<Pair<T, a>> e() {
        return this.b;
    }

    public static final class a
    extends Record {
        final long a;
        final long b;
        static final Comparator<a> c = Comparator.comparing(a::c).thenComparing(a::b).reversed();

        public a(long $$0, long $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        a a(a $$0) {
            return new a(this.a + $$0.a, this.b + $$0.b);
        }

        public float a() {
            return (float)this.b / (float)this.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "totalCount;totalSize", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "totalCount;totalSize", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "totalCount;totalSize", "a", "b"}, this, $$0);
        }

        public long b() {
            return this.a;
        }

        public long c() {
            return this.b;
        }
    }
}

