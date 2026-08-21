/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.BuiltInExceptionProvider
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.BuiltInExceptionProvider;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public interface cq<T extends Number> {
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("argument.range.empty"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("argument.range.swapped"));

    public a<T> a();

    default public Optional<T> b() {
        return this.a().a;
    }

    default public Optional<T> c() {
        return this.a().b;
    }

    default public boolean d() {
        return this.a().a();
    }

    public static final class a<T extends Number>
    extends Record {
        final Optional<T> a;
        final Optional<T> b;

        public a(Optional<T> $$0, Optional<T> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public boolean a() {
            return this.f().isEmpty() && this.g().isEmpty();
        }

        public DataResult<a<T>> b() {
            if (this.c()) {
                return DataResult.error(() -> "Swapped bounds in range: " + String.valueOf(this.f()) + " is higher than " + String.valueOf(this.g()));
            }
            return DataResult.success((Object)this);
        }

        public boolean c() {
            return this.a.isPresent() && this.b.isPresent() && ((Comparable)((Object)((Number)this.a.get()))).compareTo((Number)this.b.get()) > 0;
        }

        public Optional<T> d() {
            Optional<T> $$1;
            Optional<T> $$0 = this.f();
            return $$0.equals($$1 = this.g()) ? $$0 : Optional.empty();
        }

        public static <T extends Number> a<T> e() {
            return new a(Optional.empty(), Optional.empty());
        }

        public static <T extends Number> a<T> a(T $$0) {
            Optional<T> $$1 = Optional.of($$0);
            return new a<T>($$1, $$1);
        }

        public static <T extends Number> a<T> a(T $$0, T $$1) {
            return new a<T>(Optional.of($$0), Optional.of($$1));
        }

        public static <T extends Number> a<T> b(T $$0) {
            return new a<T>(Optional.of($$0), Optional.empty());
        }

        public static <T extends Number> a<T> c(T $$0) {
            return new a(Optional.empty(), Optional.of($$0));
        }

        public <U extends Number> a<U> a(Function<T, U> $$0) {
            return new a<U>(this.a.map($$0), this.b.map($$0));
        }

        static <T extends Number> Codec<a<T>> a(Codec<T> $$03) {
            Codec $$12 = RecordCodecBuilder.create($$1 -> $$1.group((App)$$03.optionalFieldOf("min").forGetter(a::f), (App)$$03.optionalFieldOf("max").forGetter(a::g)).apply((Applicative)$$1, a::new));
            return Codec.either((Codec)$$12, $$03).xmap($$02 -> (a)$$02.map($$0 -> $$0, $$0 -> cq$a.a((Number)$$0)), $$0 -> {
                Optional $$1 = $$0.d();
                return $$1.isPresent() ? Either.right((Object)((Number)$$1.get())) : Either.left((Object)$$0);
            });
        }

        static <B extends ByteBuf, T extends Number> aao<B, a<T>> a(final aao<B, T> $$0) {
            return new aao<B, a<T>>(){
                private static final int b = 1;
                private static final int c = 2;

                public a<T> a(B $$02) {
                    byte $$1 = $$02.readByte();
                    Optional $$2 = ($$1 & 1) != 0 ? Optional.of((Number)$$0.decode($$02)) : Optional.empty();
                    Optional $$3 = ($$1 & 2) != 0 ? Optional.of((Number)$$0.decode($$02)) : Optional.empty();
                    return new a($$2, $$3);
                }

                public void a(B $$02, a<T> $$1) {
                    Optional<Number> $$22 = $$1.f();
                    Optional<Number> $$3 = $$1.g();
                    $$02.writeByte(($$22.isPresent() ? 1 : 0) | ($$3.isPresent() ? 2 : 0));
                    $$22.ifPresent($$2 -> $$0.encode($$02, $$2));
                    $$3.ifPresent($$2 -> $$0.encode($$02, $$2));
                }

                @Override
                public /* synthetic */ void encode(Object object, Object object2) {
                    this.a((ByteBuf)object, (a)object2);
                }

                @Override
                public /* synthetic */ Object decode(Object object) {
                    return this.a((ByteBuf)object);
                }
            };
        }

        public static <T extends Number> a<T> a(StringReader $$0, Function<String, T> $$1, Supplier<DynamicCommandExceptionType> $$2) throws CommandSyntaxException {
            if (!$$0.canRead()) {
                throw a.createWithContext((ImmutableStringReader)$$0);
            }
            int $$3 = $$0.getCursor();
            try {
                Optional<T> $$6;
                Optional<T> $$4 = cq$a.b($$0, $$1, $$2);
                if ($$0.canRead(2) && $$0.peek() == '.' && $$0.peek(1) == '.') {
                    $$0.skip();
                    $$0.skip();
                    Optional<T> $$5 = cq$a.b($$0, $$1, $$2);
                } else {
                    $$6 = $$4;
                }
                if ($$4.isEmpty() && $$6.isEmpty()) {
                    throw a.createWithContext((ImmutableStringReader)$$0);
                }
                return new a<T>($$4, $$6);
            }
            catch (CommandSyntaxException $$7) {
                $$0.setCursor($$3);
                throw new CommandSyntaxException($$7.getType(), $$7.getRawMessage(), $$7.getInput(), $$3);
            }
        }

        private static <T extends Number> Optional<T> b(StringReader $$0, Function<String, T> $$1, Supplier<DynamicCommandExceptionType> $$2) throws CommandSyntaxException {
            int $$3 = $$0.getCursor();
            while ($$0.canRead() && cq$a.a($$0)) {
                $$0.skip();
            }
            String $$4 = $$0.getString().substring($$3, $$0.getCursor());
            if ($$4.isEmpty()) {
                return Optional.empty();
            }
            try {
                return Optional.of((Number)$$1.apply($$4));
            }
            catch (NumberFormatException $$5) {
                throw $$2.get().createWithContext((ImmutableStringReader)$$0, (Object)$$4);
            }
        }

        private static boolean a(StringReader $$0) {
            char $$1 = $$0.peek();
            if ($$1 >= '0' && $$1 <= '9' || $$1 == '-') {
                return true;
            }
            if ($$1 == '.') {
                return !$$0.canRead(2) || $$0.peek(1) != '.';
            }
            return false;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "min;max", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "min;max", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "min;max", "a", "b"}, this, $$0);
        }

        public Optional<T> f() {
            return this.a;
        }

        public Optional<T> g() {
            return this.b;
        }
    }

    public static final class c
    extends Record
    implements cq<Float> {
        private final a<Float> f;
        public static final c c = new c(cq$a.e());
        public static final Codec<c> d = cq$a.a(Codec.FLOAT).xmap(c::new, c::a);
        public static final aao<ByteBuf, c> e = cq$a.a(aam.l).a(c::new, c::a);

        public c(a<Float> $$0) {
            this.f = $$0;
        }

        public static c a(StringReader $$0) throws CommandSyntaxException {
            a<Float> $$1 = cq$a.a($$0, Float::parseFloat, () -> ((BuiltInExceptionProvider)CommandSyntaxException.BUILT_IN_EXCEPTIONS).readerInvalidFloat());
            return new c($$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "bounds", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "bounds", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "bounds", "f"}, this, $$0);
        }

        @Override
        public a<Float> a() {
            return this.f;
        }
    }

    public static final class b
    extends Record
    implements cq<Double> {
        private final a<Double> f;
        private final a<Double> g;
        public static final b c = new b(cq$a.e());
        public static final Codec<b> d = cq$a.a(Codec.DOUBLE).validate(a::b).xmap(b::new, b::a);
        public static final aao<ByteBuf, b> e = cq$a.a(aam.m).a(b::new, b::a);

        private b(a<Double> $$0) {
            this($$0, $$0.a(bgj::n));
        }

        public b(a<Double> $$0, a<Double> $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        public static b a(double $$0) {
            return new b(cq$a.a($$0));
        }

        public static b a(double $$0, double $$1) {
            return new b(cq$a.a($$0, $$1));
        }

        public static b b(double $$0) {
            return new b(cq$a.b($$0));
        }

        public static b c(double $$0) {
            return new b(cq$a.c($$0));
        }

        public boolean d(double $$0) {
            if (this.f.a.isPresent() && (Double)this.f.a.get() > $$0) {
                return false;
            }
            return this.f.b.isEmpty() || !((Double)this.f.b.get() < $$0);
        }

        public boolean e(double $$0) {
            if (this.g.a.isPresent() && (Double)this.g.a.get() > $$0) {
                return false;
            }
            return this.g.b.isEmpty() || !((Double)this.g.b.get() < $$0);
        }

        public static b a(StringReader $$0) throws CommandSyntaxException {
            int $$1 = $$0.getCursor();
            a<Double> $$2 = cq$a.a($$0, Double::parseDouble, () -> ((BuiltInExceptionProvider)CommandSyntaxException.BUILT_IN_EXCEPTIONS).readerInvalidDouble());
            if ($$2.c()) {
                $$0.setCursor($$1);
                throw b.createWithContext((ImmutableStringReader)$$0);
            }
            return new b($$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "bounds;boundsSqr", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "bounds;boundsSqr", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "bounds;boundsSqr", "f", "g"}, this, $$0);
        }

        @Override
        public a<Double> a() {
            return this.f;
        }

        public a<Double> e() {
            return this.g;
        }
    }

    public static final class d
    extends Record
    implements cq<Integer> {
        private final a<Integer> f;
        private final a<Long> g;
        public static final d c = new d(cq$a.e());
        public static final Codec<d> d = cq$a.a(Codec.INT).validate(a::b).xmap(d::new, d::a);
        public static final aao<ByteBuf, d> e = cq$a.a(aam.g).a(d::new, d::a);

        private d(a<Integer> $$02) {
            this($$02, $$02.a($$0 -> bgj.b($$0.longValue())));
        }

        public d(a<Integer> $$0, a<Long> $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        public static d a(int $$0) {
            return new d(cq$a.a($$0));
        }

        public static d a(int $$0, int $$1) {
            return new d(cq$a.a($$0, $$1));
        }

        public static d b(int $$0) {
            return new d(cq$a.b($$0));
        }

        public static d c(int $$0) {
            return new d(cq$a.c($$0));
        }

        public boolean d(int $$0) {
            if (this.f.a.isPresent() && (Integer)this.f.a.get() > $$0) {
                return false;
            }
            return this.f.b.isEmpty() || (Integer)this.f.b.get() >= $$0;
        }

        public boolean a(long $$0) {
            if (this.g.a.isPresent() && (Long)this.g.a.get() > $$0) {
                return false;
            }
            return this.g.b.isEmpty() || (Long)this.g.b.get() >= $$0;
        }

        public static d a(StringReader $$0) throws CommandSyntaxException {
            int $$1 = $$0.getCursor();
            a<Integer> $$2 = cq$a.a($$0, Integer::parseInt, () -> ((BuiltInExceptionProvider)CommandSyntaxException.BUILT_IN_EXCEPTIONS).readerInvalidInt());
            if ($$2.c()) {
                $$0.setCursor($$1);
                throw b.createWithContext((ImmutableStringReader)$$0);
            }
            return new d($$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "bounds;boundsSqr", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "bounds;boundsSqr", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "bounds;boundsSqr", "f", "g"}, this, $$0);
        }

        @Override
        public a<Integer> a() {
            return this.f;
        }

        public a<Long> e() {
            return this.g;
        }
    }
}

