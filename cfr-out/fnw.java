/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public interface fnw<T> {
    public kh<T> a();

    public T b();

    public T a(T var1, Stream<dlt> var2);

    public Stream<dlt> a(T var1);

    default public void a(dlt $$0, T $$1, Stream<dlt> $$2) {
        T $$3 = $$0.a(this.a(), $$1);
        T $$4 = this.a($$3, $$2);
        $$0.b(this.a(), $$4);
    }

    default public void a(dlt $$0, Stream<dlt> $$1) {
        this.a($$0, this.b(), $$1);
    }

    default public void a(dlt $$0, UnaryOperator<dlt> $$12) {
        T $$2 = $$0.a(this.a());
        if ($$2 != null) {
            UnaryOperator $$3 = $$1 -> {
                if ($$1.f()) {
                    return $$1;
                }
                dlt $$2 = (dlt)$$12.apply((dlt)$$1);
                $$2.f($$2.k());
                return $$2;
            };
            this.a($$0, this.a($$2).map($$3));
        }
    }

    default public dve a(dlt $$0) {
        return () -> {
            T $$1 = $$0.a(this.a());
            if ($$1 != null) {
                return this.a($$1).filter($$0 -> !$$0.f());
            }
            return Stream.empty();
        };
    }
}

