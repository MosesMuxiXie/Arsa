/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class aan<B extends ByteBuf, V, T>
implements aao<B, V> {
    private static final int a = -1;
    private final Function<V, ? extends T> b;
    private final List<c<B, V, T>> c;
    private final Object2IntMap<T> d;

    aan(Function<V, ? extends T> $$0, List<c<B, V, T>> $$1, Object2IntMap<T> $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public V a(B $$0) {
        int $$1 = xy.a($$0);
        if ($$1 < 0 || $$1 >= this.c.size()) {
            throw new DecoderException("Received unknown packet id " + $$1);
        }
        c<B, V, T> $$2 = this.c.get($$1);
        try {
            return (V)$$2.a.decode($$0);
        }
        catch (Exception $$3) {
            if ($$3 instanceof b) {
                throw $$3;
            }
            throw new DecoderException("Failed to decode packet '" + String.valueOf($$2.b) + "'", (Throwable)$$3);
        }
    }

    public void a(B $$0, V $$1) {
        T $$2 = this.b.apply($$1);
        int $$3 = this.d.getOrDefault($$2, -1);
        if ($$3 == -1) {
            throw new EncoderException("Sending unknown packet '" + String.valueOf($$2) + "'");
        }
        xy.a($$0, $$3);
        c<B, V, T> $$4 = this.c.get($$3);
        try {
            aao $$5 = $$4.a;
            $$5.encode($$0, $$1);
        }
        catch (Exception $$6) {
            if ($$6 instanceof b) {
                throw $$6;
            }
            throw new EncoderException("Failed to encode packet '" + String.valueOf($$2) + "'", (Throwable)$$6);
        }
    }

    public static <B extends ByteBuf, V, T> a<B, V, T> a(Function<V, ? extends T> $$0) {
        return new a($$0);
    }

    @Override
    public /* synthetic */ void encode(Object object, Object object2) {
        this.a((ByteBuf)object, object2);
    }

    @Override
    public /* synthetic */ Object decode(Object object) {
        return this.a((ByteBuf)object);
    }

    static final class c<B, V, T>
    extends Record {
        final aao<? super B, ? extends V> a;
        final T b;

        c(aao<? super B, ? extends V> $$0, T $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "serializer;type", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "serializer;type", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "serializer;type", "a", "b"}, this, $$0);
        }

        public aao<? super B, ? extends V> a() {
            return this.a;
        }

        public T b() {
            return this.b;
        }
    }

    public static interface b {
    }

    public static class a<B extends ByteBuf, V, T> {
        private final List<c<B, V, T>> a = new ArrayList<c<B, V, T>>();
        private final Function<V, ? extends T> b;

        a(Function<V, ? extends T> $$0) {
            this.b = $$0;
        }

        public a<B, V, T> a(T $$0, aao<? super B, ? extends V> $$1) {
            this.a.add(new c<B, V, T>($$1, $$0));
            return this;
        }

        public aan<B, V, T> a() {
            Object2IntOpenHashMap $$0 = new Object2IntOpenHashMap();
            $$0.defaultReturnValue(-2);
            for (c<B, V, T> $$1 : this.a) {
                int $$2 = $$0.size();
                int $$3 = $$0.putIfAbsent($$1.b, $$2);
                if ($$3 == -2) continue;
                throw new IllegalStateException("Duplicate registration for type " + String.valueOf($$1.b));
            }
            return new aan<B, V, T>(this.b, List.copyOf(this.a), $$0);
        }
    }
}

