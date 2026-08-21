/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class ix<T>
extends jl<T>
implements iy<T> {
    private final amo b;
    private jd.c<T> c;

    public ix(String $$0, amt<? extends jq<T>> $$1, Lifecycle $$2, boolean $$3) {
        super($$1, $$2, $$3);
        this.b = amo.a($$0);
    }

    @Override
    public jd.c<T> a(amt<T> $$0, T $$1, jp $$2) {
        jd.c<T> $$3 = super.a($$0, $$1, $$2);
        if (this.b.equals($$0.a())) {
            this.c = $$3;
        }
        return $$3;
    }

    @Override
    public int a(@Nullable T $$0) {
        int $$1 = super.a($$0);
        return $$1 == -1 ? super.a(this.c.a()) : $$1;
    }

    @Override
    public amo b(T $$0) {
        amo $$1 = super.b($$0);
        return $$1 == null ? this.b : $$1;
    }

    @Override
    public T a(@Nullable amo $$0) {
        Object $$1 = super.a($$0);
        return $$1 == null ? this.c.a() : $$1;
    }

    @Override
    public Optional<T> b(@Nullable amo $$0) {
        return Optional.ofNullable(super.a($$0));
    }

    @Override
    public Optional<jd.c<T>> a() {
        return Optional.ofNullable(this.c);
    }

    @Override
    public T a(int $$0) {
        Object $$1 = super.a($$0);
        return $$1 == null ? this.c.a() : $$1;
    }

    @Override
    public Optional<jd.c<T>> a(bgr $$0) {
        return super.a($$0).or(() -> Optional.of(this.c));
    }

    @Override
    public amo b() {
        return this.b;
    }
}

