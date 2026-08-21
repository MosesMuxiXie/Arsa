/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public interface fun {
    public int a();

    public boolean b();

    public @Nullable aag c();

    default public yw a(aag $$0) {
        return Objects.requireNonNullElse(this.c(), $$0).a(this.a());
    }

    public static yw a(@Nullable fun $$0, aag $$1) {
        return $$0 != null ? $$0.a($$1) : $$1.a(0);
    }
}

