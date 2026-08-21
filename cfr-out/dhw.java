/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface dhw {
    public static final dhw a = new dhw(){

        @Override
        public <T> Optional<T> a(BiFunction<dwo, is, T> $$0) {
            return Optional.empty();
        }
    };

    public static dhw a(final dwo $$0, final is $$1) {
        return new dhw(){

            @Override
            public <T> Optional<T> a(BiFunction<dwo, is, T> $$02) {
                return Optional.of($$02.apply($$0, $$1));
            }
        };
    }

    public <T> Optional<T> a(BiFunction<dwo, is, T> var1);

    default public <T> T a(BiFunction<dwo, is, T> $$0, T $$1) {
        return this.a($$0).orElse($$1);
    }

    default public void a(BiConsumer<dwo, is> $$0) {
        this.a((dwo $$1, is $$2) -> {
            $$0.accept((dwo)$$1, (is)$$2);
            return Optional.empty();
        });
    }
}

