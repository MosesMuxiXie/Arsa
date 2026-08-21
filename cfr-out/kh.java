/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public interface kh<T> {
    public static final Codec<kh<?>> a = Codec.lazyInitialized(() -> mi.am.q());
    public static final aao<xq, kh<?>> b = aao.a($$0 -> aam.a(mj.r));
    public static final Codec<kh<?>> c = a.validate($$0 -> $$0.d() ? DataResult.error(() -> "Encountered transient component " + String.valueOf(mi.am.b((kh<?>)$$0))) : DataResult.success((Object)$$0));
    public static final Codec<Map<kh<?>, Object>> d = Codec.dispatchedMap(c, kh::c);

    public static <T> a<T> a() {
        return new a();
    }

    public @Nullable Codec<T> b();

    default public Codec<T> c() {
        Codec<T> $$0 = this.b();
        if ($$0 == null) {
            throw new IllegalStateException(String.valueOf(this) + " is not a persistent component");
        }
        return $$0;
    }

    default public boolean d() {
        return this.b() == null;
    }

    public boolean e();

    public aao<? super xq, T> f();

    public static class kh$a<T> {
        private @Nullable Codec<T> a;
        private @Nullable aao<? super xq, T> b;
        private boolean c;
        private boolean d;

        public kh$a<T> a(Codec<T> $$0) {
            this.a = $$0;
            return this;
        }

        public kh$a<T> a(aao<? super xq, T> $$0) {
            this.b = $$0;
            return this;
        }

        public kh$a<T> a() {
            this.c = true;
            return this;
        }

        public kh<T> b() {
            aao $$0 = Objects.requireNonNullElseGet(this.b, () -> aam.d(Objects.requireNonNull(this.a, "Missing Codec for component")));
            Codec<T> $$1 = this.c && this.a != null ? ki.a.a(this.a) : this.a;
            return new a<T>($$1, $$0, this.d);
        }

        public kh$a<T> c() {
            this.d = true;
            return this;
        }

        static class a<T>
        implements kh<T> {
            private final @Nullable Codec<T> e;
            private final aao<? super xq, T> f;
            private final boolean g;

            a(@Nullable Codec<T> $$0, aao<? super xq, T> $$1, boolean $$2) {
                this.e = $$0;
                this.f = $$1;
                this.g = $$2;
            }

            @Override
            public boolean e() {
                return this.g;
            }

            @Override
            public @Nullable Codec<T> b() {
                return this.e;
            }

            @Override
            public aao<? super xq, T> f() {
                return this.f;
            }

            public String toString() {
                return bhs.a(mi.am, this);
            }
        }
    }
}

