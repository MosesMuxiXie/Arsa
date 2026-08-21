/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.Lifecycle
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.Lifecycle;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jspecify.annotations.Nullable;

public interface jq<T>
extends Keyable,
jf.b<T>,
ji<T> {
    @Override
    public amt<? extends jq<T>> g();

    default public Codec<T> q() {
        return this.b().flatComapMap(jd.c::a, $$0 -> this.a(this.e($$0)));
    }

    default public Codec<jd<T>> r() {
        return this.b().flatComapMap($$0 -> $$0, this::a);
    }

    private Codec<jd.c<T>> b() {
        Codec $$02 = amo.a.comapFlatMap($$0 -> this.c((amo)$$0).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown registry key in " + String.valueOf(this.g()) + ": " + String.valueOf($$0))), $$0 -> $$0.h().a());
        return bfm.a($$02, (E $$0) -> this.d($$0.h()).map(jp::b).orElse(Lifecycle.experimental()));
    }

    @Override
    private DataResult<jd.c<T>> a(jd<T> $$0) {
        DataResult dataResult;
        if ($$0 instanceof jd.c) {
            jd.c $$1 = (jd.c)$$0;
            dataResult = DataResult.success((Object)$$1);
        } else {
            dataResult = DataResult.error(() -> "Unregistered holder in " + String.valueOf(this.g()) + ": " + String.valueOf($$0));
        }
        return dataResult;
    }

    default public <U> Stream<U> keys(DynamicOps<U> $$0) {
        return this.i().stream().map($$1 -> $$0.createString($$1.toString()));
    }

    public @Nullable amo b(T var1);

    public Optional<amt<T>> d(T var1);

    @Override
    public int a(@Nullable T var1);

    public @Nullable T c(@Nullable amt<T> var1);

    public @Nullable T a(@Nullable amo var1);

    public Optional<jp> d(amt<T> var1);

    default public Optional<T> b(@Nullable amo $$0) {
        return Optional.ofNullable(this.a($$0));
    }

    default public Optional<T> f(@Nullable amt<T> $$0) {
        return Optional.ofNullable(this.c($$0));
    }

    public Optional<jd.c<T>> a();

    default public T g(amt<T> $$0) {
        T $$1 = this.c($$0);
        if ($$1 == null) {
            throw new IllegalStateException("Missing key in " + String.valueOf(this.g()) + ": " + String.valueOf($$0));
        }
        return $$1;
    }

    public Set<amo> i();

    public Set<Map.Entry<amt<T>, T>> k();

    public Set<amt<T>> j();

    public Optional<jd.c<T>> a(bgr var1);

    default public Stream<T> s() {
        return StreamSupport.stream(this.spliterator(), false);
    }

    public boolean d(amo var1);

    public boolean e(amt<T> var1);

    public static <T> T a(jq<? super T> $$0, String $$1, T $$2) {
        return jq.a($$0, amo.a($$1), $$2);
    }

    public static <V, T extends V> T a(jq<V> $$0, amo $$1, T $$2) {
        return jq.a($$0, amt.a($$0.g(), $$1), $$2);
    }

    public static <V, T extends V> T a(jq<V> $$0, amt<V> $$1, T $$2) {
        ((jz)$$0).a($$1, $$2, jp.a);
        return $$2;
    }

    public static <R, T extends R> jd.c<T> b(jq<R> $$0, amt<R> $$1, T $$2) {
        return ((jz)$$0).a($$1, $$2, jp.a);
    }

    public static <R, T extends R> jd.c<T> b(jq<R> $$0, amo $$1, T $$2) {
        return jq.b($$0, amt.a($$0.g(), $$1), $$2);
    }

    public jq<T> n();

    public jd.c<T> f(T var1);

    public Optional<jd.c<T>> c(int var1);

    public Optional<jd.c<T>> c(amo var1);

    public jd<T> e(T var1);

    default public Iterable<jd<T>> c(bef<T> $$0) {
        return (Iterable)DataFixUtils.orElse((Optional)this.a($$0), List.of());
    }

    public Stream<jh.c<T>> l();

    default public ji<jd<T>> t() {
        return new ji<jd<T>>(){

            @Override
            public int a(jd<T> $$0) {
                return jq.this.a($$0.a());
            }

            public @Nullable jd<T> c(int $$0) {
                return jq.this.c($$0).orElse(null);
            }

            @Override
            public int d() {
                return jq.this.d();
            }

            @Override
            public Iterator<jd<T>> iterator() {
                return jq.this.c().map($$0 -> $$0).iterator();
            }

            @Override
            public /* synthetic */ @Nullable Object a(int n2) {
                return this.c(n2);
            }
        };
    }

    @Override
    public a<T> a(beg.c<T> var1);

    public static interface a<T> {
        public amt<? extends jq<? extends T>> a();

        public jf.b<T> c();

        public void d();

        public int b();
    }
}

