/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class gs
extends byv<d> {
    private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
    static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("argument.item.id.invalid", $$0));
    static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("arguments.item.tag.unknown", $$0));
    static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> yh.b("arguments.item.component.unknown", $$0));
    static final Dynamic2CommandExceptionType e = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("arguments.item.component.malformed", $$0, $$1));
    static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> yh.b("arguments.item.predicate.unknown", $$0));
    static final Dynamic2CommandExceptionType g = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("arguments.item.predicate.malformed", $$0, $$1));
    private static final amo h = amo.b("count");
    static final Map<amo, a> i = Stream.of(new a(h, $$0 -> true, (Decoder<? extends Predicate<dlt>>)cq.d.d.map($$0 -> $$1 -> $$0.d($$1.N())))).collect(Collectors.toUnmodifiableMap(a::a, $$0 -> $$0));
    static final Map<amo, c> j = Stream.of(new c(h, (Decoder<? extends Predicate<dlt>>)cq.d.d.map($$0 -> $$1 -> $$0.d($$1.N())))).collect(Collectors.toUnmodifiableMap(c::a, $$0 -> $$0));

    private static c a(jd.c<kh<?>> $$0) {
        Predicate<dlt> $$12 = $$1 -> $$1.c((kh)$$0.a());
        return new c($$0.h().a(), (Decoder<? extends Predicate<dlt>>)bhr.b.map($$1 -> $$12));
    }

    public gs(dz $$02) {
        super(gn.a(new b($$02)).a($$0 -> bhs.a($$0)::test));
    }

    public static gs a(dz $$0) {
        return new gs($$0);
    }

    public static d a(CommandContext<ed> $$0, String $$1) {
        return (d)$$0.getArgument($$1, d.class);
    }

    public Collection<String> getExamples() {
        return a;
    }

    record c(amo a, Decoder<? extends Predicate<dlt>> b) {
        public c(jd.c<ks.d<?>> $$02) {
            this($$02.h().a(), (Decoder<? extends Predicate<dlt>>)$$02.a().c().map($$0 -> $$0::a));
        }

        public Predicate<dlt> a(ImmutableStringReader $$0, Dynamic<?> $$12) throws CommandSyntaxException {
            DataResult $$2 = this.b.parse($$12);
            return (Predicate)$$2.getOrThrow($$1 -> g.createWithContext($$0, (Object)this.a.toString(), $$1));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "id;type", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "id;type", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "id;type", "a", "b"}, this, $$0);
        }
    }

    static class b
    implements gn.b<Predicate<dlt>, a, c> {
        private final jf.a a;
        private final jf.b<dlp> b;
        private final jf.b<kh<?>> c;
        private final jf.b<ks.d<?>> d;

        b(jf.a $$0) {
            this.a = $$0;
            this.b = $$0.e(mj.R);
            this.c = $$0.e(mj.r);
            this.d = $$0.e(mj.q);
        }

        public Predicate<dlt> e(ImmutableStringReader $$0, amo $$12) throws CommandSyntaxException {
            jd.c<dlp> $$2 = this.b.a(amt.a(mj.R, $$12)).orElseThrow(() -> b.createWithContext($$0, (Object)$$12));
            return $$1 -> $$1.a($$2);
        }

        public Predicate<dlt> f(ImmutableStringReader $$0, amo $$12) throws CommandSyntaxException {
            jh $$2 = this.b.a(bef.a(mj.R, $$12)).orElseThrow(() -> c.createWithContext($$0, (Object)$$12));
            return $$1 -> $$1.a($$2);
        }

        public a g(ImmutableStringReader $$0, amo $$1) throws CommandSyntaxException {
            a $$2 = i.get($$1);
            if ($$2 != null) {
                return $$2;
            }
            kh $$3 = this.c.a(amt.a(mj.r, $$1)).map(jd::a).orElseThrow(() -> d.createWithContext($$0, (Object)$$1));
            return gs$a.a($$0, $$1, $$3);
        }

        @Override
        public Predicate<dlt> a(ImmutableStringReader $$0, a $$1, Dynamic<?> $$2) throws CommandSyntaxException {
            return $$1.a($$0, ams.a($$2, this.a));
        }

        @Override
        public Predicate<dlt> a(ImmutableStringReader $$0, a $$1) {
            return $$1.b;
        }

        public c h(ImmutableStringReader $$0, amo $$1) throws CommandSyntaxException {
            c $$2 = j.get($$1);
            if ($$2 != null) {
                return $$2;
            }
            return this.d.a(amt.a(mj.q, $$1)).map(c::new).or(() -> this.c.a(amt.a(mj.r, $$1)).map(gs::a)).orElseThrow(() -> f.createWithContext($$0, (Object)$$1));
        }

        @Override
        public Predicate<dlt> a(ImmutableStringReader $$0, c $$1, Dynamic<?> $$2) throws CommandSyntaxException {
            return $$1.a($$0, ams.a($$2, this.a));
        }

        @Override
        public Stream<amo> a() {
            return this.b.c_().map(amt::a);
        }

        @Override
        public Stream<amo> b() {
            return this.b.f().map(bef::b);
        }

        @Override
        public Stream<amo> c() {
            return Stream.concat(i.keySet().stream(), this.c.c().filter($$0 -> !((kh)$$0.a()).d()).map($$0 -> $$0.h().a()));
        }

        @Override
        public Stream<amo> d() {
            return Stream.concat(j.keySet().stream(), this.d.c_().map(amt::a));
        }

        @Override
        public Predicate<dlt> a(Predicate<dlt> $$0) {
            return $$0.negate();
        }

        public Predicate<dlt> b(List<Predicate<dlt>> $$0) {
            return bhs.b($$0);
        }

        @Override
        public /* synthetic */ Object a(List list) {
            return this.b(list);
        }

        @Override
        public /* synthetic */ Object b(ImmutableStringReader immutableStringReader, Object object, Dynamic dynamic) throws CommandSyntaxException {
            return this.a(immutableStringReader, (c)object, dynamic);
        }

        @Override
        public /* synthetic */ Object d(ImmutableStringReader immutableStringReader, amo amo2) throws CommandSyntaxException {
            return this.h(immutableStringReader, amo2);
        }

        @Override
        public /* synthetic */ Object c(ImmutableStringReader immutableStringReader, amo amo2) throws CommandSyntaxException {
            return this.g(immutableStringReader, amo2);
        }

        @Override
        public /* synthetic */ Object b(ImmutableStringReader immutableStringReader, amo amo2) throws CommandSyntaxException {
            return this.f(immutableStringReader, amo2);
        }

        @Override
        public /* synthetic */ Object a(ImmutableStringReader immutableStringReader, amo amo2) throws CommandSyntaxException {
            return this.e(immutableStringReader, amo2);
        }
    }

    public static interface d
    extends Predicate<dlt> {
    }

    static final class a
    extends Record {
        private final amo a;
        final Predicate<dlt> b;
        private final Decoder<? extends Predicate<dlt>> c;

        a(amo $$0, Predicate<dlt> $$1, Decoder<? extends Predicate<dlt>> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public static <T> a a(ImmutableStringReader $$0, amo $$12, kh<T> $$2) throws CommandSyntaxException {
            Codec<T> $$3 = $$2.b();
            if ($$3 == null) {
                throw d.createWithContext($$0, (Object)$$12);
            }
            return new a($$12, $$1 -> $$1.c($$2), (Decoder<? extends Predicate<dlt>>)$$3.map($$1 -> $$2 -> {
                Object $$3 = $$2.a($$2);
                return Objects.equals($$1, $$3);
            }));
        }

        public Predicate<dlt> a(ImmutableStringReader $$0, Dynamic<?> $$12) throws CommandSyntaxException {
            DataResult $$2 = this.c.parse($$12);
            return (Predicate)$$2.getOrThrow($$1 -> e.createWithContext($$0, (Object)this.a.toString(), $$1));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;presenceChecker;valueChecker", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;presenceChecker;valueChecker", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;presenceChecker;valueChecker", "a", "b", "c"}, this, $$0);
        }

        public amo a() {
            return this.a;
        }

        public Predicate<dlt> b() {
            return this.b;
        }

        public Decoder<? extends Predicate<dlt>> c() {
            return this.c;
        }
    }
}

