/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface kd {
    public <T> @Nullable T a(kh<? extends T> var1);

    default public <T> T a(kh<? extends T> $$0, T $$1) {
        T $$2 = this.a($$0);
        return $$2 != null ? $$2 : $$1;
    }

    default public <T> @Nullable kk<T> b(kh<T> $$0) {
        T $$1 = this.a($$0);
        return $$1 != null ? new kk<T>($$0, $$1) : null;
    }
}

