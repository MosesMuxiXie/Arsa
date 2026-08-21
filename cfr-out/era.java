/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.serialization.DataResult
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public interface era<T> {
    public T a(int var1, int var2, int var3);

    public void a(Consumer<T> var1);

    public void b(wx var1);

    public int d();

    @VisibleForTesting
    public int e();

    public boolean a(Predicate<T> var1);

    public void a(eqy.a<T> var1);

    public eqy<T> f();

    public eqy<T> g();

    public a<T> a(erd<T> var1);

    public static interface b<T, C extends era<T>> {
        public DataResult<C> read(erd<T> var1, a<T> var2);
    }

    public static final class a<T>
    extends Record {
        private final List<T> b;
        private final Optional<LongStream> c;
        private final int d;
        public static final int a = -1;

        public a(List<T> $$0, Optional<LongStream> $$1) {
            this($$0, $$1, -1);
        }

        public a(List<T> $$0, Optional<LongStream> $$1, int $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "paletteEntries;storage;bitsPerEntry", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "paletteEntries;storage;bitsPerEntry", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "paletteEntries;storage;bitsPerEntry", "b", "c", "d"}, this, $$0);
        }

        public List<T> a() {
            return this.b;
        }

        public Optional<LongStream> b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }
    }
}

