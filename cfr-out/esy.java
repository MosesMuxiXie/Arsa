/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.UUID;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public interface esy<T extends esp> {
    public @Nullable T a(int var1);

    public @Nullable T a(UUID var1);

    public Iterable<T> a();

    public <U extends T> void a(esw<T, U> var1, bem<U> var2);

    public void a(fth var1, Consumer<T> var2);

    public <U extends T> void a(esw<T, U> var1, fth var2, bem<U> var3);
}

