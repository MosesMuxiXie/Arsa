/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface esw<B, T extends B> {
    public static <B, T extends B> esw<B, T> a(final Class<T> $$0) {
        return new esw<B, T>(){

            @Override
            public @Nullable T a(B $$02) {
                return $$0.isInstance($$02) ? $$02 : null;
            }

            @Override
            public Class<? extends B> a() {
                return $$0;
            }
        };
    }

    public static <B, T extends B> esw<B, T> b(final Class<T> $$0) {
        return new esw<B, T>(){

            @Override
            public @Nullable T a(B $$02) {
                return $$0.equals($$02.getClass()) ? $$02 : null;
            }

            @Override
            public Class<? extends B> a() {
                return $$0;
            }
        };
    }

    public @Nullable T a(B var1);

    public Class<? extends B> a();
}

