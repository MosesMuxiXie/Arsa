/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public interface byk<S> {
    public bym a();

    public byh<S> b();

    default public <T> Optional<T> b(byj<S, T> $$0) {
        T $$1 = this.a($$0);
        if ($$1 != null) {
            this.b().a(this.g());
        }
        if (!this.a().g()) {
            throw new IllegalStateException("Malformed scope: " + String.valueOf(this.a()));
        }
        return Optional.ofNullable($$1);
    }

    public <T> @Nullable T a(byj<S, T> var1);

    public S f();

    public int g();

    public void a(int var1);

    public bye c();

    public void d();

    public byk<S> e();
}

