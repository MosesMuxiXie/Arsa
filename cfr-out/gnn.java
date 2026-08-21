/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Arrays;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class gnn<T> {
    private static final int a = 8;
    private static final int b = 256;
    private static final int c = 255;
    private static final int d = 4351;
    private static final int e = 4352;
    private final T[] f;
    private final @Nullable T[][] g;
    private final IntFunction<T[]> h;

    public gnn(IntFunction<T[]> $$0, IntFunction<T[][]> $$1) {
        this.f = $$0.apply(256);
        this.g = $$1.apply(4352);
        Arrays.fill(this.g, this.f);
        this.h = $$0;
    }

    public void a() {
        Arrays.fill(this.g, this.f);
    }

    public @Nullable T a(int $$0) {
        int $$1 = $$0 >> 8;
        int $$2 = $$0 & 0xFF;
        return this.g[$$1][$$2];
    }

    public @Nullable T a(int $$0, T $$1) {
        int $$2 = $$0 >> 8;
        int $$3 = $$0 & 0xFF;
        T[] $$4 = this.g[$$2];
        if ($$4 == this.f) {
            $$4 = this.h.apply(256);
            this.g[$$2] = $$4;
            $$4[$$3] = $$1;
            return null;
        }
        T $$5 = $$4[$$3];
        $$4[$$3] = $$1;
        return $$5;
    }

    public T a(int $$0, IntFunction<T> $$1) {
        int $$2 = $$0 >> 8;
        T[] $$4 = this.g[$$2];
        int $$3 = $$0 & 0xFF;
        T $$5 = $$4[$$3];
        if ($$5 != null) {
            return $$5;
        }
        if ($$4 == this.f) {
            $$4 = this.h.apply(256);
            this.g[$$2] = $$4;
        }
        T $$6 = $$1.apply($$0);
        $$4[$$3] = $$6;
        return $$6;
    }

    public @Nullable T b(int $$0) {
        int $$1 = $$0 >> 8;
        int $$2 = $$0 & 0xFF;
        T[] $$3 = this.g[$$1];
        if ($$3 == this.f) {
            return null;
        }
        T $$4 = $$3[$$2];
        $$3[$$2] = null;
        return $$4;
    }

    public void a(a<T> $$0) {
        for (int $$1 = 0; $$1 < this.g.length; ++$$1) {
            T[] $$2 = this.g[$$1];
            if ($$2 == this.f) continue;
            for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
                T $$4 = $$2[$$3];
                if ($$4 == null) continue;
                int $$5 = $$1 << 8 | $$3;
                $$0.accept($$5, $$4);
            }
        }
    }

    public IntSet b() {
        IntOpenHashSet $$0 = new IntOpenHashSet();
        this.a(($$1, $$2) -> $$0.add($$1));
        return $$0;
    }

    @FunctionalInterface
    public static interface a<T> {
        public void accept(int var1, T var2);
    }
}

