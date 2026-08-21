/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.UUID;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class esz<T extends esp>
implements esy<T> {
    private final esr<T> a;
    private final esu<T> b;

    public esz(esr<T> $$0, esu<T> $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public @Nullable T a(int $$0) {
        return this.a.a($$0);
    }

    @Override
    public @Nullable T a(UUID $$0) {
        return this.a.a($$0);
    }

    @Override
    public Iterable<T> a() {
        return this.a.a();
    }

    @Override
    public <U extends T> void a(esw<T, U> $$0, bem<U> $$1) {
        this.a.a($$0, $$1);
    }

    @Override
    public void a(fth $$0, Consumer<T> $$1) {
        this.b.b($$0, bem.forConsumer($$1));
    }

    @Override
    public <U extends T> void a(esw<T, U> $$0, fth $$1, bem<U> $$2) {
        this.b.a($$0, $$1, $$2);
    }
}

