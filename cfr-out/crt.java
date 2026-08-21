/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class crt<T extends chl>
extends csd<T> {
    private final BiPredicate<T, chl> a;
    private final Predicate<T> b;
    private final cqw<Boolean> c;
    private final int d;

    public crt(int $$0, BiPredicate<T, chl> $$1, Predicate<T> $$2, cqw<Boolean> $$3, int $$4) {
        super($$0);
        this.a = $$1;
        this.b = $$2;
        this.c = $$3;
        this.d = $$4;
    }

    @Override
    protected void a(axf $$0, T $$1) {
        if (!this.b.test($$1)) {
            this.c($$1);
        } else {
            this.a($$1);
        }
    }

    @Override
    public Set<cqw<?>> a() {
        return Set.of(cqw.g);
    }

    public void a(T $$0) {
        Optional<List<chl>> $$12 = ((chl)$$0).ev().c(cqw.g);
        if ($$12.isEmpty()) {
            return;
        }
        boolean $$2 = $$12.get().stream().anyMatch($$1 -> this.a.test((chl)$$0, (chl)$$1));
        if ($$2) {
            this.b($$0);
        }
    }

    public void b(T $$0) {
        ((chl)$$0).ev().a(this.c, true, this.d);
    }

    public void c(T $$0) {
        ((chl)$$0).ev().b(this.c);
    }
}

