/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class eth<T extends etm> {
    private final T a;
    private @Nullable jw b;

    public eth(T $$0) {
        this.a = $$0;
    }

    public void a(axf $$0) {
        this.c($$0);
    }

    public T a() {
        return this.a;
    }

    public void b(axf $$02) {
        eth.a($$02, this.b, $$0 -> $$0.b((etm)this.a));
    }

    public void c(axf $$0) {
        this.a.a().a($$0).map(jw::a).ifPresent($$1 -> {
            if (this.b == null || !this.b.equals($$1)) {
                eth.a($$0, this.b, $$0 -> $$0.b((etm)this.a));
                this.b = $$1;
                eth.a($$0, this.b, $$0 -> $$0.a((etm)this.a));
            }
        });
    }

    private static void a(dwr $$0, @Nullable jw $$1, Consumer<etn> $$2) {
        if ($$1 == null) {
            return;
        }
        eqf $$3 = $$0.a($$1.a(), $$1.c(), erj.n, false);
        if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
        }
    }
}

