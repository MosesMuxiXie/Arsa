/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public final class dl
extends Record {
    private final List<c> c;
    private static final Codec<List<c>> d = Codec.unboundedMap((Codec)Codec.STRING, e.c).xmap($$02 -> $$02.entrySet().stream().map($$0 -> new c((String)$$0.getKey(), (e)$$0.getValue())).toList(), $$0 -> $$0.stream().collect(Collectors.toMap(c::a, c::b)));
    public static final Codec<dl> a = d.xmap(dl::new, dl::a);
    public static final aao<ByteBuf, dl> b = dl$c.a.a(aam.a()).a(dl::new, dl::a);

    public dl(List<c> $$0) {
        this.c = $$0;
    }

    public <S extends eoj<?, S>> boolean a(eoi<?, S> $$0, S $$1) {
        for (c $$2 : this.c) {
            if ($$2.a($$0, $$1)) continue;
            return false;
        }
        return true;
    }

    public boolean a(eoh $$0) {
        return this.a($$0.b().l(), $$0);
    }

    public boolean a(flb $$0) {
        return this.a($$0.a().f(), $$0);
    }

    public Optional<String> a(eoi<?, ?> $$0) {
        for (c $$1 : this.c) {
            Optional<String> $$2 = $$1.a($$0);
            if (!$$2.isPresent()) continue;
            return $$2;
        }
        return Optional.empty();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dl.class, "properties", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dl.class, "properties", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dl.class, "properties", "c"}, this, $$0);
    }

    public List<c> a() {
        return this.c;
    }

    static final class c
    extends Record {
        private final String b;
        private final e c;
        public static final aao<ByteBuf, c> a = aao.a(aam.p, c::a, e.d, c::b, c::new);

        c(String $$0, e $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public <S extends eoj<?, S>> boolean a(eoi<?, S> $$0, S $$1) {
            epk<?> $$2 = $$0.a(this.b);
            return $$2 != null && this.c.a($$1, $$2);
        }

        public Optional<String> a(eoi<?, ?> $$0) {
            epk<?> $$1 = $$0.a(this.b);
            return $$1 != null ? Optional.empty() : Optional.of(this.b);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "name;valueMatcher", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "name;valueMatcher", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "name;valueMatcher", "b", "c"}, this, $$0);
        }

        public String a() {
            return this.b;
        }

        public e b() {
            return this.c;
        }
    }

    static interface e {
        public static final Codec<e> c = Codec.either(dl$b.a, dl$d.a).xmap(Either::unwrap, $$0 -> {
            if ($$0 instanceof b) {
                b $$1 = (b)$$0;
                return Either.left((Object)$$1);
            }
            if ($$0 instanceof d) {
                d $$2 = (d)$$0;
                return Either.right((Object)$$2);
            }
            throw new UnsupportedOperationException();
        });
        public static final aao<ByteBuf, e> d = aam.a(dl$b.b, dl$d.b).a(Either::unwrap, (? super O $$0) -> {
            if ($$0 instanceof b) {
                b $$1 = (b)$$0;
                return Either.left((Object)$$1);
            }
            if ($$0 instanceof d) {
                d $$2 = (d)$$0;
                return Either.right((Object)$$2);
            }
            throw new UnsupportedOperationException();
        });

        public <T extends Comparable<T>> boolean a(eoj<?, ?> var1, epk<T> var2);
    }

    public static class a {
        private final ImmutableList.Builder<c> a = ImmutableList.builder();

        private a() {
        }

        public static a a() {
            return new a();
        }

        public a a(epk<?> $$0, String $$1) {
            this.a.add((Object)new c($$0.f(), new b($$1)));
            return this;
        }

        public a a(epk<Integer> $$0, int $$1) {
            return this.a((epk)$$0, (Comparable<T> & bhh)Integer.toString($$1));
        }

        public a a(epk<Boolean> $$0, boolean $$1) {
            return this.a((epk)$$0, (Comparable<T> & bhh)Boolean.toString($$1));
        }

        public <T extends Comparable<T> & bhh> a a(epk<T> $$0, T $$1) {
            return this.a($$0, (T)((bhh)$$1).c());
        }

        public Optional<dl> b() {
            return Optional.of(new dl((List<c>)this.a.build()));
        }
    }

    static final class d
    extends Record
    implements e {
        private final Optional<String> e;
        private final Optional<String> f;
        public static final Codec<d> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.optionalFieldOf("min").forGetter(d::a), (App)Codec.STRING.optionalFieldOf("max").forGetter(d::b)).apply((Applicative)$$0, d::new));
        public static final aao<ByteBuf, d> b = aao.a(aam.a(aam.p), d::a, aam.a(aam.p), d::b, d::new);

        private d(Optional<String> $$0, Optional<String> $$1) {
            this.e = $$0;
            this.f = $$1;
        }

        @Override
        public <T extends Comparable<T>> boolean a(eoj<?, ?> $$0, epk<T> $$1) {
            Optional<T> $$4;
            Optional<T> $$3;
            Comparable $$2 = $$0.c($$1);
            if (this.e.isPresent() && (($$3 = $$1.b(this.e.get())).isEmpty() || $$2.compareTo((Comparable)((Comparable)$$3.get())) < 0)) {
                return false;
            }
            return !this.f.isPresent() || !($$4 = $$1.b(this.f.get())).isEmpty() && $$2.compareTo((Comparable)((Comparable)$$4.get())) <= 0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "minValue;maxValue", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "minValue;maxValue", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "minValue;maxValue", "e", "f"}, this, $$0);
        }

        public Optional<String> a() {
            return this.e;
        }

        public Optional<String> b() {
            return this.f;
        }
    }

    static final class b
    extends Record
    implements e {
        private final String e;
        public static final Codec<b> a = Codec.STRING.xmap(b::new, b::a);
        public static final aao<ByteBuf, b> b = aam.p.a(b::new, b::a);

        b(String $$0) {
            this.e = $$0;
        }

        @Override
        public <T extends Comparable<T>> boolean a(eoj<?, ?> $$0, epk<T> $$1) {
            Comparable $$2 = $$0.c($$1);
            Optional<T> $$3 = $$1.b(this.e);
            return $$3.isPresent() && $$2.compareTo((Comparable)((Comparable)$$3.get())) == 0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "value", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "value", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "value", "e"}, this, $$0);
        }

        public String a() {
            return this.e;
        }
    }
}

