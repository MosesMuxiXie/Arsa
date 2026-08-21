/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class bgd<T> {
    private final Optional<Integer> a;
    private final cei<T> b;
    private final List<a<T>> c;

    bgd(bgc<T> $$0, Optional<Integer> $$1, cei<T> $$2) {
        this.a = $$1;
        this.b = $$2;
        this.c = bgd.a($$0, $$1);
    }

    private static <T> List<a<T>> a(bgc<T> $$0, Optional<Integer> $$1) {
        List<bgb<T>> $$2 = $$0.a();
        if ($$2.size() == 1) {
            T $$3 = $$2.getFirst().b();
            return List.of(new a<T>(bfj.c, $$3, 0, $$3, 0));
        }
        ArrayList<a<T>> $$4 = new ArrayList<a<T>>();
        if ($$1.isPresent()) {
            bgb<T> $$5 = $$2.getFirst();
            bgb<T> $$6 = $$2.getLast();
            $$4.add(new a<T>($$0, $$6, $$6.a() - $$1.get(), $$5, $$5.a()));
            bgd.a($$0, $$2, $$4);
            $$4.add(new a<T>($$0, $$6, $$6.a(), $$5, $$5.a() + $$1.get()));
        } else {
            bgd.a($$0, $$2, $$4);
        }
        return List.copyOf($$4);
    }

    private static <T> void a(bgc<T> $$0, List<bgb<T>> $$1, List<a<T>> $$2) {
        for (int $$3 = 0; $$3 < $$1.size() - 1; ++$$3) {
            bgb<T> $$4 = $$1.get($$3);
            bgb<T> $$5 = $$1.get($$3 + 1);
            $$2.add(new a<T>($$0, $$4, $$4.a(), $$5, $$5.a()));
        }
    }

    public T a(long $$0) {
        long $$1 = this.c($$0);
        a<T> $$2 = this.b($$1);
        if ($$1 <= (long)$$2.c) {
            return $$2.b;
        }
        if ($$1 >= (long)$$2.e) {
            return $$2.d;
        }
        float $$3 = (float)($$1 - (long)$$2.c) / (float)($$2.e - $$2.c);
        float $$4 = $$2.a.apply($$3);
        return this.b.apply($$4, $$2.b, $$2.d);
    }

    private a<T> b(long $$0) {
        for (a<T> $$1 : this.c) {
            if ($$0 >= (long)$$1.e) continue;
            return $$1;
        }
        return this.c.getLast();
    }

    private long c(long $$0) {
        if (this.a.isPresent()) {
            return Math.floorMod($$0, (int)this.a.get());
        }
        return $$0;
    }

    static final class a<T>
    extends Record {
        final bfj a;
        final T b;
        final int c;
        final T d;
        final int e;

        public a(bgc<T> $$0, bgb<T> $$1, int $$2, bgb<T> $$3, int $$4) {
            this($$0.b(), $$1.b(), $$2, $$3.b(), $$4);
        }

        a(bfj $$0, T $$1, int $$2, T $$3, int $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "easing;fromValue;fromTicks;toValue;toTicks", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "easing;fromValue;fromTicks;toValue;toTicks", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "easing;fromValue;fromTicks;toValue;toTicks", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public bfj a() {
            return this.a;
        }

        public T b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        public T d() {
            return this.d;
        }

        public int e() {
            return this.e;
        }
    }
}

