/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

@FunctionalInterface
public interface k {
    public boolean test(char var1);

    default public k and(k $$0) {
        Objects.requireNonNull($$0);
        return $$1 -> this.test($$1) && $$0.test($$1);
    }

    default public k negate() {
        return $$0 -> !this.test($$0);
    }

    default public k or(k $$0) {
        Objects.requireNonNull($$0);
        return $$1 -> this.test($$1) || $$0.test($$1);
    }
}

