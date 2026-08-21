/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public final class cbn<E> {
    private static final int a = 64;
    private final int b;
    private final List<cbm<E>> c;
    private final @Nullable d<E> d;

    cbn(List<? extends cbm<E>> $$0) {
        this.c = List.copyOf($$0);
        this.b = cbo.a($$0, cbm::b);
        this.d = this.b == 0 ? null : (this.b < 64 ? new c<E>(this.c, this.b) : new b<E>(this.c));
    }

    public static <E> cbn<E> a() {
        return new cbn<E>(List.of());
    }

    public static <E> cbn<E> a(E $$0) {
        return new cbn<E>(List.of(new cbm<E>($$0, 1)));
    }

    @SafeVarargs
    public static <E> cbn<E> a(cbm<E> ... $$0) {
        return new cbn<E>(List.of($$0));
    }

    public static <E> cbn<E> a(List<cbm<E>> $$0) {
        return new cbn<E>($$0);
    }

    public static <E> a<E> b() {
        return new a();
    }

    public boolean c() {
        return this.c.isEmpty();
    }

    public <T> cbn<T> a(Function<E, T> $$0) {
        return new cbn<E>(Lists.transform(this.c, $$1 -> $$1.a($$0)));
    }

    public Optional<E> a(bgr $$0) {
        if (this.d == null) {
            return Optional.empty();
        }
        int $$1 = $$0.a(this.b);
        return Optional.of(this.d.a($$1));
    }

    public E b(bgr $$0) {
        if (this.d == null) {
            throw new IllegalStateException("Weighted list has no elements");
        }
        int $$1 = $$0.a(this.b);
        return this.d.a($$1);
    }

    public List<cbm<E>> d() {
        return this.c;
    }

    public static <E> Codec<cbn<E>> a(Codec<E> $$0) {
        return cbm.a($$0).listOf().xmap(cbn::a, cbn::d);
    }

    public static <E> Codec<cbn<E>> a(MapCodec<E> $$0) {
        return cbm.a($$0).listOf().xmap(cbn::a, cbn::d);
    }

    public static <E> Codec<cbn<E>> b(Codec<E> $$0) {
        return bfm.b(cbm.a($$0).listOf()).xmap(cbn::a, cbn::d);
    }

    public static <E> Codec<cbn<E>> b(MapCodec<E> $$0) {
        return bfm.b(cbm.a($$0).listOf()).xmap(cbn::a, cbn::d);
    }

    public static <E, B extends ByteBuf> aao<B, cbn<E>> a(aao<B, E> $$0) {
        return cbm.a($$0).a(aam.a()).a(cbn::a, cbn::d);
    }

    public boolean b(E $$0) {
        for (cbm<E> $$1 : this.c) {
            if (!$$1.a().equals($$0)) continue;
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof cbn) {
            cbn $$1 = (cbn)$$0;
            return this.b == $$1.b && Objects.equals(this.c, $$1.c);
        }
        return false;
    }

    public int hashCode() {
        int $$0 = this.b;
        $$0 = 31 * $$0 + this.c.hashCode();
        return $$0;
    }

    static interface d<E> {
        public E a(int var1);
    }

    static class c<E>
    implements d<E> {
        private final Object[] a;

        c(List<cbm<E>> $$0, int $$1) {
            this.a = new Object[$$1];
            int $$2 = 0;
            for (cbm<E> $$3 : $$0) {
                int $$4 = $$3.b();
                Arrays.fill(this.a, $$2, $$2 + $$4, $$3.a());
                $$2 += $$4;
            }
        }

        @Override
        public E a(int $$0) {
            return (E)this.a[$$0];
        }
    }

    static class b<E>
    implements d<E> {
        private final cbm<?>[] a;

        b(List<cbm<E>> $$0) {
            this.a = (cbm[])$$0.toArray(cbm[]::new);
        }

        @Override
        public E a(int $$0) {
            for (cbm<?> $$1 : this.a) {
                if (($$0 -= $$1.b()) >= 0) continue;
                return (E)$$1.a();
            }
            throw new IllegalStateException($$0 + " exceeded total weight");
        }
    }

    public static class a<E> {
        private final ImmutableList.Builder<cbm<E>> a = ImmutableList.builder();

        public a<E> a(E $$0) {
            return this.a($$0, 1);
        }

        public a<E> a(E $$0, int $$1) {
            this.a.add(new cbm<E>($$0, $$1));
            return this;
        }

        public cbn<E> a() {
            return new cbn(this.a.build());
        }
    }
}

