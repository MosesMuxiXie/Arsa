/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public interface yn {
    public static final Optional<bhr> a = Optional.of(bhr.a);
    public static final yn b = new yn(){

        @Override
        public <T> Optional<T> a(a<T> $$0) {
            return Optional.empty();
        }

        @Override
        public <T> Optional<T> a(b<T> $$0, zf $$1) {
            return Optional.empty();
        }
    };

    public <T> Optional<T> a(a<T> var1);

    public <T> Optional<T> a(b<T> var1, zf var2);

    public static yn e(final String $$0) {
        return new yn(){

            @Override
            public <T> Optional<T> a(a<T> $$02) {
                return $$02.accept($$0);
            }

            @Override
            public <T> Optional<T> a(b<T> $$02, zf $$1) {
                return $$02.accept($$1, $$0);
            }
        };
    }

    public static yn a(final String $$0, final zf $$1) {
        return new yn(){

            @Override
            public <T> Optional<T> a(a<T> $$02) {
                return $$02.accept($$0);
            }

            @Override
            public <T> Optional<T> a(b<T> $$02, zf $$12) {
                return $$02.accept($$1.a($$12), $$0);
            }
        };
    }

    public static yn a(yn ... $$0) {
        return yn.a((List<? extends yn>)ImmutableList.copyOf((Object[])$$0));
    }

    public static yn a(final List<? extends yn> $$0) {
        return new yn(){

            @Override
            public <T> Optional<T> a(a<T> $$02) {
                for (yn $$1 : $$0) {
                    Optional<T> $$2 = $$1.a($$02);
                    if (!$$2.isPresent()) continue;
                    return $$2;
                }
                return Optional.empty();
            }

            @Override
            public <T> Optional<T> a(b<T> $$02, zf $$1) {
                for (yn $$2 : $$0) {
                    Optional<T> $$3 = $$2.a($$02, $$1);
                    if (!$$3.isPresent()) continue;
                    return $$3;
                }
                return Optional.empty();
            }
        };
    }

    default public String getString() {
        StringBuilder $$0 = new StringBuilder();
        this.a($$1 -> {
            $$0.append($$1);
            return Optional.empty();
        });
        return $$0.toString();
    }

    public static interface a<T> {
        public Optional<T> accept(String var1);
    }

    public static interface b<T> {
        public Optional<T> accept(zf var1, String var2);
    }
}

