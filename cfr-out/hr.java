/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class hr<T extends ef<T>>
implements hf<T> {
    private final Consumer<hh<T>> a;
    private final ea b;

    public hr(Consumer<hh<T>> $$0, ea $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public void execute(hg<T> $$0, hi $$1) {
        int $$2 = $$1.c() + 1;
        hi $$3 = new hi($$2, this.b, $$0.b($$2));
        this.a.accept(hh.a($$0, $$3));
    }
}

