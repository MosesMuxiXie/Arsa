/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class bgz<K, V> {
    private final Function<K, V> a;
    private @Nullable K b = null;
    private @Nullable V c;

    public bgz(Function<K, V> $$0) {
        this.a = $$0;
    }

    public V a(K $$0) {
        if (this.c == null || !Objects.equals(this.b, $$0)) {
            this.c = this.a.apply($$0);
            this.b = $$0;
        }
        return this.c;
    }
}

