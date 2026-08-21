/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface hh<T> {
    public void a(hf<T> var1);

    public void a(@Nullable hj var1);

    public @Nullable hj a();

    public hi b();

    public static <T extends ef<T>> hh<T> a(final hg<T> $$0, final hi $$1) {
        return new hh<T>(){

            @Override
            public void a(hf<T> $$02) {
                $$0.a(new hc($$1, $$02));
            }

            @Override
            public void a(@Nullable hj $$02) {
                $$0.a($$02);
            }

            @Override
            public @Nullable hj a() {
                return $$0.b();
            }

            @Override
            public hi b() {
                return $$1;
            }
        };
    }
}

