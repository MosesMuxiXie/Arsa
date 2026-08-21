/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.ints.IntSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public interface fwq
extends AutoCloseable {
    public static final float a = 7.0f;

    @Override
    default public void close() {
    }

    default public @Nullable fwt a(int $$0) {
        return null;
    }

    public IntSet a();

    public record a(fwq a, gnq.a b) implements AutoCloseable
    {
        @Override
        public void close() {
            this.a.close();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "provider;filter", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "provider;filter", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "provider;filter", "a", "b"}, this, $$0);
        }
    }
}

