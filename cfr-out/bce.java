/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonObject;
import org.jspecify.annotations.Nullable;

public abstract class bce<T> {
    private final @Nullable T a;

    public bce(@Nullable T $$0) {
        this.a = $$0;
    }

    public @Nullable T h() {
        return this.a;
    }

    boolean g() {
        return false;
    }

    protected abstract void a(JsonObject var1);
}

