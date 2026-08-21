/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.datafixers.util.Either
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
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

public class fh<T>
implements ArgumentType<c<T>> {
    private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.resource_tag.not_found", $$0, $$1));
    private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> yh.b("argument.resource_tag.invalid_type", $$0, $$1, $$2));
    private final jf<T> d;
    final amt<? extends jq<T>> e;

    public fh(dz $$0, amt<? extends jq<T>> $$1) {
        this.e = $$1;
        this.d = $$0.e($$1);
    }

    public static <T> fh<T> a(dz $$0, amt<? extends jq<T>> $$1) {
        return new fh<T>($$0, $$1);
    }

    public static <T> c<T> a(CommandContext<ed> $$0, String $$1, amt<jq<T>> $$2) throws CommandSyntaxException {
        c $$3 = (c)$$0.getArgument($$1, c.class);
        Optional<c<T>> $$4 = $$3.a($$2);
        return $$4.orElseThrow(() -> (CommandSyntaxException)((Object)((Object)$$3.a().map($$1 -> {
            amt $$2 = $$1.h();
            return fe.b.create((Object)$$2.a(), (Object)$$2.b(), (Object)$$2.a());
        }, $$1 -> {
            bef $$2 = $$1.h();
            return c.create((Object)$$2.b(), $$2.a(), (Object)$$2.a());
        }))));
    }

    public c<T> a(StringReader $$0) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '#') {
            int $$1 = $$0.getCursor();
            try {
                $$0.skip();
                amo $$2 = amo.a($$0);
                bef $$3 = bef.a(this.e, $$2);
                jh.c $$4 = this.d.a($$3).orElseThrow(() -> b.createWithContext((ImmutableStringReader)$$0, (Object)$$2, (Object)this.e.a()));
                return new d($$4);
            }
            catch (CommandSyntaxException $$5) {
                $$0.setCursor($$1);
                throw $$5;
            }
        }
        amo $$6 = amo.a($$0);
        amt $$7 = amt.a(this.e, $$6);
        jd.c $$8 = this.d.a($$7).orElseThrow(() -> fe.a.createWithContext((ImmutableStringReader)$$0, (Object)$$6, (Object)this.e.a()));
        return new b($$8);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.a($$0, $$1, this.e, ei.a.c);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static interface c<T>
    extends Predicate<jd<T>> {
        public Either<jd.c<T>, jh.c<T>> a();

        public <E> Optional<c<E>> a(amt<? extends jq<E>> var1);

        public String b();
    }

    record d<T>(jh.c<T> a) implements c<T>
    {
        private final jh.c<T> a;

        @Override
        public Either<jd.c<T>, jh.c<T>> a() {
            return Either.right(this.a);
        }

        @Override
        public <E> Optional<c<E>> a(amt<? extends jq<E>> $$0) {
            return this.a.h().d($$0) ? Optional.of(this) : Optional.empty();
        }

        public boolean a(jd<T> $$0) {
            return this.a.a($$0);
        }

        @Override
        public String b() {
            return "#" + String.valueOf(this.a.h().b());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "tag", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "tag", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "tag", "a"}, this, $$0);
        }

        public jh.c<T> c() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((jd)object);
        }
    }

    record b<T>(jd.c<T> a) implements c<T>
    {
        private final jd.c<T> a;

        @Override
        public Either<jd.c<T>, jh.c<T>> a() {
            return Either.left(this.a);
        }

        @Override
        public <E> Optional<c<E>> a(amt<? extends jq<E>> $$0) {
            return this.a.h().c($$0) ? Optional.of(this) : Optional.empty();
        }

        public boolean a(jd<T> $$0) {
            return $$0.equals(this.a);
        }

        @Override
        public String b() {
            return this.a.h().a().toString();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "value", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "value", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "value", "a"}, this, $$0);
        }

        public jd.c<T> c() {
            return this.a;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((jd)object);
        }
    }

    public static class fh$a<T>
    implements ib<fh<T>, a> {
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
        public a a(fh<T> $$0) {
            return new a($$0.e);
        }

        @Override
        public /* synthetic */ ib.a b(wx wx2) {
            return this.a(wx2);
        }

        public final class a
        implements ib.a<fh<T>> {
            final amt<? extends jq<T>> b;

            a(amt<? extends jq<T>> $$1) {
                this.b = $$1;
            }

            public fh<T> a(dz $$0) {
                return new fh($$0, this.b);
            }

            @Override
            public ib<fh<T>, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dz dz2) {
                return this.a(dz2);
            }
        }
    }
}

