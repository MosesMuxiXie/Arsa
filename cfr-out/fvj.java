/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;

public class fvj<T>
implements fva<T> {
    private final Function<is, fvh<T>> a;

    public fvj(Function<is, fvh<T>> $$0) {
        this.a = $$0;
    }

    @Override
    public boolean a(is $$0, T $$1) {
        return this.a.apply($$0).a($$0, $$1);
    }

    @Override
    public void a(fve<T> $$0) {
        this.a.apply($$0.b()).a($$0);
    }

    @Override
    public boolean b(is $$0, T $$1) {
        return false;
    }

    @Override
    public int a() {
        return 0;
    }
}

