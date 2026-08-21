/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

@FunctionalInterface
public interface ira {
    public static final ira a = ($$0, $$1) -> {};

    default public ira decorate(Consumer<ire.a> $$0) {
        return ($$1, $$22) -> this.send($$1, $$2 -> {
            $$22.accept($$2);
            $$0.accept((ire.a)$$2);
        });
    }

    public void send(irb var1, Consumer<ire.a> var2);
}

