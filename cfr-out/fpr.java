/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface fpr
extends fob,
BiFunction<dlt, fnz, dlt> {
    public fps<? extends fpr> a();

    public static Consumer<dlt> a(BiFunction<dlt, fnz, dlt> $$0, Consumer<dlt> $$1, fnz $$2) {
        return $$3 -> $$1.accept((dlt)$$0.apply((dlt)$$3, $$2));
    }

    public static interface a {
        public fpr b();
    }
}

