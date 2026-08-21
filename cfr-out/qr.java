/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 */
import com.mojang.serialization.Lifecycle;

public interface qr<T> {
    public jd.c<T> a(amt<T> var1, T var2, Lifecycle var3);

    default public jd.c<T> a(amt<T> $$0, T $$1) {
        return this.a($$0, $$1, Lifecycle.stable());
    }

    public <S> je<S> a(amt<? extends jq<? extends S>> var1);
}

