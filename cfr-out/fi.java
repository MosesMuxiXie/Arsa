/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.datafixers.util.Either
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class fi<T>
implements ArgumentType<c<T>> {
    private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
    final amt<? extends jq<T>> b;

    public fi(amt<? extends jq<T>> $$0) {
        this.b = $$0;
    }

    public static <T> fi<T> a(amt<? extends jq<T>> $$0) {
        return new fi<T>($$0);
    }

    public static <T> c<T> a(CommandContext<ed> $$0, String $$1, amt<jq<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
        c $$4 = (c)$$0.getArgument($$1, c.class);
        Optional<c<T>> $$5 = $$4.a($$2);
        return $$5.orElseThrow(() -> $$3.create((Object)$$4));
    }

    public c<T> a(StringReader $$0) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '#') {
            int $$1 = $$0.getCursor();
            try {
                $$0.skip();
                amo $$2 = amo.a($$0);
                return new d(bef.a(this.b, $$2));
            }
            catch (CommandSyntaxException $$3) {
                $$0.setCursor($$1);
                throw $$3;
            }
        }
        amo $$4 = amo.a($$0);
        return new b(amt.a(this.b, $$4));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.a($$0, $$1, this.b, ei.a.c);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static interface c<T>
    extends Predicate<jd<T>> {
        public Either<amt<T>, bef<T>> a();

        public <E> Optional<c<E>> a(amt<? extends jq<E>> var1);

        public String b();
    }

    record d<T>(bef<T> a) implements c<T>
    {
        private final bef<T> a;

        @Override
        public Either<amt<T>, bef<T>> a() {
            return Either.right(this.a);
        }

        @Override
        public <E> Optional<c<E>> a(amt<? extends jq<E>> $$0) {
            return this.a.e($$0).map(d::new);
        }

        public boolean a(jd<T> $$0) {
            return $$0.a(this.a);
        }

        @Override
        public String b() {
            return "#" + String.valueOf(this.a.b());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "key", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "key", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "key", "a"}, this, $$0);
        }

        public bef<T> c() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((jd)object);
        }
    }

    record b<T>(amt<T> a) implements c<T>
    {
        private final amt<T> a;

        @Override
        public Either<amt<T>, bef<T>> a() {
            return Either.left(this.a);
        }

        @Override
        public <E> Optional<c<E>> a(amt<? extends jq<E>> $$0) {
            return this.a.d($$0).map(b::new);
        }

        public boolean a(jd<T> $$0) {
            return $$0.a(this.a);
        }

        @Override
        public String b() {
            return this.a.a().toString();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "key", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "key", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "key", "a"}, this, $$0);
        }

        public amt<T> c() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((jd)object);
        }
    }

    public static class fi$a<T>
    implements ib<fi<T>, a> {
        @Override
        public void a(a $$0, wx $$1) {
            $$1.b($$0.b);
        }

        @Override
        public a a(wx $$0) {
            return new a($$0.r());
        }

        @Override
        public void a(a $$0, JsonObject $$1) {
            $$1.addProperty("registry", $$0.b.a().toString());
        }

        @Override
        public a a(fi<T> $$0) {
            return new a($$0.b);
        }

        @Override
        public /* synthetic */ ib.a b(wx wx2) {
            return this.a(wx2);
        }

        public final class a
        implements ib.a<fi<T>> {
            final amt<? extends jq<T>> b;

            a(amt<? extends jq<T>> $$1) {
                this.b = $$1;
            }

            public fi<T> a(dz $$0) {
                return new fi(this.b);
            }

            @Override
            public ib<fi<T>, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dz dz2) {
                return this.a(dz2);
            }
        }
    }
}

