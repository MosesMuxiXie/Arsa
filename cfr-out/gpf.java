/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class gpf<T> {
    private final T b;
    private final BiConsumer<Consumer<String>, T> c;
    public static final gpf<?> a = new gpf<bhr>(bhr.a, ($$0, $$1) -> {});

    private gpf(T $$0, BiConsumer<Consumer<String>, T> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static gpf<?> a(String $$0) {
        return new gpf<String>($$0, Consumer::accept);
    }

    public static gpf<?> a(yh $$02) {
        return new gpf<yh>($$02, ($$0, $$1) -> $$0.accept($$1.getString()));
    }

    public static gpf<?> a(List<yh> $$0) {
        return new gpf<List>($$0, ($$1, $$2) -> $$0.stream().map(yh::getString).forEach((Consumer<String>)$$1));
    }

    public void a(Consumer<String> $$0) {
        this.c.accept($$0, (Consumer<String>)this.b);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof gpf) {
            gpf $$1 = (gpf)$$0;
            return $$1.c == this.c && $$1.b.equals(this.b);
        }
        return false;
    }

    public int hashCode() {
        int $$0 = this.b.hashCode();
        $$0 = 31 * $$0 + this.c.hashCode();
        return $$0;
    }
}

