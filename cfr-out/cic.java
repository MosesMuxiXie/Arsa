/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface cic {
    public dlt a();

    public boolean a(dlt var1);

    public static cic a(final Supplier<dlt> $$0, final Consumer<dlt> $$1) {
        return new cic(){

            @Override
            public dlt a() {
                return (dlt)$$0.get();
            }

            @Override
            public boolean a(dlt $$02) {
                $$1.accept($$02);
                return true;
            }
        };
    }

    public static cic a(final chl $$0, final cgv $$1, final Predicate<dlt> $$2) {
        return new cic(){

            @Override
            public dlt a() {
                return $$0.a($$1);
            }

            @Override
            public boolean a(dlt $$02) {
                if (!$$2.test($$02)) {
                    return false;
                }
                $$0.a($$1, $$02);
                return true;
            }
        };
    }

    public static cic a(chl $$02, cgv $$1) {
        return cic.a($$02, $$1, $$0 -> true);
    }

    public static cic a(final List<dlt> $$0, final int $$1) {
        return new cic(){

            @Override
            public dlt a() {
                return (dlt)$$0.get($$1);
            }

            @Override
            public boolean a(dlt $$02) {
                $$0.set($$1, $$02);
                return true;
            }
        };
    }
}

