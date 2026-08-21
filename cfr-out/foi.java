/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface foi {
    public static final foi c = ($$0, $$1) -> false;
    public static final foi d = ($$0, $$1) -> true;

    public boolean expand(fnz var1, Consumer<fop> var2);

    default public foi and(foi $$0) {
        Objects.requireNonNull($$0);
        return ($$1, $$2) -> this.expand($$1, $$2) && $$0.expand($$1, $$2);
    }

    default public foi or(foi $$0) {
        Objects.requireNonNull($$0);
        return ($$1, $$2) -> this.expand($$1, $$2) || $$0.expand($$1, $$2);
    }
}

