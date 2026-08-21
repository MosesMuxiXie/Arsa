/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public interface ke
extends kd {
    public kf a();

    @Override
    default public <T> @Nullable T a(kh<? extends T> $$0) {
        return this.a().a($$0);
    }

    default public <T> Stream<T> a(Class<? extends T> $$02) {
        return this.a().c().map(kk::b).filter($$1 -> $$02.isAssignableFrom($$1.getClass())).map($$0 -> $$0);
    }

    @Override
    default public <T> T a(kh<? extends T> $$0, T $$1) {
        return this.a().a($$0, $$1);
    }

    default public boolean c(kh<?> $$0) {
        return this.a().c($$0);
    }
}

