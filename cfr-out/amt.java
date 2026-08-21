/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.MapMaker
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.google.common.collect.MapMaker;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.concurrent.ConcurrentMap;

public class amt<T> {
    private static final ConcurrentMap<a, amt<?>> a = new MapMaker().weakValues().makeMap();
    private final amo b;
    private final amo c;

    public static <T> Codec<amt<T>> a(amt<? extends jq<T>> $$0) {
        return amo.a.xmap($$1 -> amt.a($$0, $$1), amt::a);
    }

    public static <T> aao<ByteBuf, amt<T>> b(amt<? extends jq<T>> $$0) {
        return amo.b.a($$1 -> amt.a($$0, $$1), amt::a);
    }

    public static <T> amt<T> a(amt<? extends jq<T>> $$0, amo $$1) {
        return amt.a($$0.c, $$1);
    }

    public static <T> amt<jq<T>> a(amo $$0) {
        return amt.a(mj.a, $$0);
    }

    private static <T> amt<T> a(amo $$02, amo $$1) {
        return a.computeIfAbsent(new a($$02, $$1), $$0 -> new amt($$0.a, $$0.b));
    }

    private amt(amo $$0, amo $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public String toString() {
        return "ResourceKey[" + String.valueOf(this.b) + " / " + String.valueOf(this.c) + "]";
    }

    public boolean c(amt<? extends jq<?>> $$0) {
        return this.b.equals($$0.a());
    }

    public <E> Optional<amt<E>> d(amt<? extends jq<E>> $$0) {
        return this.c($$0) ? Optional.of(this) : Optional.empty();
    }

    public amo a() {
        return this.c;
    }

    public amo b() {
        return this.b;
    }

    public amt<jq<T>> c() {
        return amt.a(this.b);
    }

    static final class a
    extends Record {
        final amo a;
        final amo b;

        a(amo $$0, amo $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "registry;identifier", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "registry;identifier", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "registry;identifier", "a", "b"}, this, $$0);
        }

        public amo a() {
            return this.a;
        }

        public amo b() {
            return this.b;
        }
    }
}

