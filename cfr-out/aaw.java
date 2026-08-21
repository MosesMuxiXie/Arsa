/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public interface aaw {
    public static final int a = 4096;

    public static <T extends xk, P extends aav<? super T>> aaw a(final aba<P> $$0, final Function<Iterable<aay<? super T>>, P> $$1, final aau<? super T> $$2) {
        return new aaw(){

            @Override
            public void a(aay<?> $$02, Consumer<aay<?>> $$12) {
                if ($$02.a() == $$0) {
                    aav $$22 = (aav)$$02;
                    $$12.accept($$2);
                    $$22.b().forEach($$12);
                    $$12.accept($$2);
                } else {
                    $$12.accept($$02);
                }
            }

            @Override
            public @Nullable a a(aay<?> $$02) {
                if ($$02 == $$2) {
                    return new a(){
                        private final List<aay<? super T>> b = new ArrayList();

                        @Override
                        public @Nullable aay<?> a(aay<?> $$0) {
                            if ($$0 == $$2) {
                                return (aay)$$1.apply(this.b);
                            }
                            aay<?> $$1 = $$0;
                            if (this.b.size() >= 4096) {
                                throw new IllegalStateException("Too many packets in a bundle");
                            }
                            this.b.add($$1);
                            return null;
                        }
                    };
                }
                return null;
            }
        };
    }

    public void a(aay<?> var1, Consumer<aay<?>> var2);

    public @Nullable a a(aay<?> var1);

    public static interface a {
        public @Nullable aay<?> a(aay<?> var1);
    }
}

