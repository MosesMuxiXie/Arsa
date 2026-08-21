/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public interface bxg {
    public <T> void a(bxe<T> var1, BiConsumer<dvu, T> var2);

    public <T> @Nullable T a(bxe<T> var1, dvu var2);

    public <T> void b(bxe<T> var1, BiConsumer<is, T> var2);

    public <T> @Nullable T a(bxe<T> var1, is var2);

    public <T> void c(bxe<T> var1, BiConsumer<cgk, T> var2);

    public <T> @Nullable T a(bxe<T> var1, cgk var2);

    public <T> void a(bxe<T> var1, a<T> var2);

    @FunctionalInterface
    public static interface a<T> {
        public void accept(T var1, int var2, int var3);
    }
}

