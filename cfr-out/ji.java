/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface ji<T>
extends Iterable<T> {
    public static final int a = -1;

    public int a(T var1);

    public @Nullable T a(int var1);

    default public T b(int $$0) {
        T $$1 = this.a($$0);
        if ($$1 == null) {
            throw new IllegalArgumentException("No value with id " + $$0);
        }
        return $$1;
    }

    default public int c(T $$0) {
        int $$1 = this.a($$0);
        if ($$1 == -1) {
            throw new IllegalArgumentException("Can't find id for '" + String.valueOf($$0) + "' in map " + String.valueOf(this));
        }
        return $$1;
    }

    public int d();
}

