/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public final class etx {
    public static final Codec<etx> a = Codec.dispatchedMap(mi.an.q(), etv::h).xmap(etx::a, etx::d);
    private final Reference2ObjectMap<etv<?>, Object> b;

    etx(Reference2ObjectMap<etv<?>, Object> $$0) {
        this.b = $$0;
    }

    private static etx a(Map<etv<?>, Object> $$0) {
        return new etx((Reference2ObjectMap<etv<?>, Object>)new Reference2ObjectOpenHashMap($$0));
    }

    public static etx a() {
        return new etx((Reference2ObjectMap<etv<?>, Object>)new Reference2ObjectOpenHashMap());
    }

    public static etx a(Stream<etv<?>> $$0) {
        Reference2ObjectOpenHashMap $$12 = new Reference2ObjectOpenHashMap();
        $$0.forEach($$1 -> $$12.put($$1, $$1.i()));
        return new etx((Reference2ObjectMap<etv<?>, Object>)$$12);
    }

    public static etx a(etx $$0) {
        return new etx((Reference2ObjectMap<etv<?>, Object>)new Reference2ObjectOpenHashMap($$0.b));
    }

    public boolean a(etv<?> $$0) {
        return this.b.containsKey($$0);
    }

    public <T> @Nullable T b(etv<T> $$0) {
        return (T)this.b.get($$0);
    }

    public <T> void a(etv<T> $$0, T $$1) {
        this.b.put($$0, $$1);
    }

    public <T> @Nullable T c(etv<T> $$0) {
        return (T)this.b.remove($$0);
    }

    public Set<etv<?>> b() {
        return this.b.keySet();
    }

    public int c() {
        return this.b.size();
    }

    public String toString() {
        return this.b.toString();
    }

    public etx b(etx $$02) {
        etx $$1 = etx.a(this);
        $$1.a($$02, $$0 -> true);
        return $$1;
    }

    public void a(etx $$0, Predicate<etv<?>> $$1) {
        for (etv<?> $$2 : $$0.b()) {
            if (!$$1.test($$2)) continue;
            etx.a($$0, $$2, this);
        }
    }

    private static <T> void a(etx $$0, etv<T> $$1, etx $$2) {
        $$2.a($$1, Objects.requireNonNull($$0.b($$1)));
    }

    private Reference2ObjectMap<etv<?>, Object> d() {
        return this.b;
    }

    public boolean equals(Object $$0) {
        if ($$0 == this) {
            return true;
        }
        if ($$0 == null || $$0.getClass() != this.getClass()) {
            return false;
        }
        etx $$1 = (etx)$$0;
        return Objects.equals(this.b, $$1.b);
    }

    public int hashCode() {
        return Objects.hash(this.b);
    }

    public static class a {
        final Reference2ObjectMap<etv<?>, Object> a = new Reference2ObjectOpenHashMap();

        public <T> a a(etv<T> $$0, T $$1) {
            this.a.put($$0, $$1);
            return this;
        }

        public etx a() {
            return new etx(this.a);
        }
    }
}

