/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class hhw<C extends a<C>, D> {
    private final Function<C, D> a;
    private @Nullable C b;
    private @Nullable D c;

    public hhw(Function<C, D> $$0) {
        this.a = $$0;
    }

    public D a(C $$0) {
        if ($$0 == this.b && this.c != null) {
            return this.c;
        }
        D $$1 = this.a.apply($$0);
        this.c = $$1;
        this.b = $$0;
        $$0.registerForCleaning(this);
        return $$1;
    }

    public void a() {
        this.c = null;
        this.b = null;
    }

    @FunctionalInterface
    public static interface a<C extends a<C>> {
        public void registerForCleaning(hhw<C, ?> var1);
    }
}

