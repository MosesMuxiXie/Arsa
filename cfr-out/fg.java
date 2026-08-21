/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class fg<T>
implements ArgumentType<jd<T>> {
    private static final Collection<String> d = List.of("foo", "foo:bar", "012", "{}", "true");
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("argument.resource_or_id.failed_to_parse", $$0));
    public static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.resource_or_id.no_such_element", $$0, $$1));
    public static final DynamicOps<vz> c = vn.a;
    private final jf.a e;
    private final Optional<? extends jf.b<T>> f;
    private final Codec<T> g;
    private final byq<g<T, vz>> h;
    private final amt<? extends jq<T>> i;

    protected fg(dz $$0, amt<? extends jq<T>> $$1, Codec<T> $$2) {
        this.e = $$0;
        this.f = $$0.a($$1);
        this.i = $$1;
        this.g = $$2;
        this.h = fg.a($$1, c);
    }

    public static <T, O> byq<g<T, O>> a(amt<? extends jq<T>> $$0, DynamicOps<O> $$1) {
        byq<O> $$2 = vt.a($$1);
        byg<StringReader> $$32 = new byg<StringReader>();
        byc $$4 = byc.a("result");
        byc $$5 = byc.a("id");
        byc $$6 = byc.a("value");
        $$32.a($$5, byt.a);
        $$32.a($$6, $$2.b().b());
        byj $$7 = $$32.a($$4, byo.b($$32.c($$5), $$32.c($$6)), (bym $$3) -> {
            amo $$4 = (amo)$$3.a($$5);
            if ($$4 != null) {
                return new f(amt.a($$0, $$4));
            }
            Object $$5 = $$3.b($$6);
            return new b($$5);
        });
        return new byq<g<T, O>>($$32, $$7);
    }

    public static e a(dz $$0) {
        return new e($$0);
    }

    public static jd<fof> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return fg.e($$0, $$1);
    }

    public static c b(dz $$0) {
        return new c($$0);
    }

    public static jd<fpr> b(CommandContext<ed> $$0, String $$1) {
        return fg.e($$0, $$1);
    }

    public static d c(dz $$0) {
        return new d($$0);
    }

    public static jd<frm> c(CommandContext<ed> $$0, String $$1) {
        return fg.e($$0, $$1);
    }

    public static a d(dz $$0) {
        return new a($$0);
    }

    public static jd<asj> d(CommandContext<ed> $$0, String $$1) {
        return fg.e($$0, $$1);
    }

    private static <T> jd<T> e(CommandContext<ed> $$0, String $$1) {
        return (jd)$$0.getArgument($$1, jd.class);
    }

    public @Nullable jd<T> a(StringReader $$0) throws CommandSyntaxException {
        return this.a($$0, this.h, c);
    }

    private <O> @Nullable jd<T> a(StringReader $$0, byq<g<T, O>> $$1, DynamicOps<O> $$2) throws CommandSyntaxException {
        g<T, O> $$3 = $$1.a($$0);
        if (this.f.isEmpty()) {
            return null;
        }
        return $$3.a((ImmutableStringReader)$$0, this.e, $$2, this.g, this.f.get());
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.a($$0, $$1, this.i, ei.a.b);
    }

    public Collection<String> getExamples() {
        return d;
    }

    public /* synthetic */ @Nullable Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static class e
    extends fg<fof> {
        protected e(dz $$0) {
            super($$0, mj.bG, fof.d);
        }

        @Override
        public /* synthetic */ @Nullable Object parse(StringReader stringReader) throws CommandSyntaxException {
            return super.a(stringReader);
        }
    }

    public static class c
    extends fg<fpr> {
        protected c(dz $$0) {
            super($$0, mj.bH, fpt.c);
        }

        @Override
        public /* synthetic */ @Nullable Object parse(StringReader stringReader) throws CommandSyntaxException {
            return super.a(stringReader);
        }
    }

    public static class d
    extends fg<frm> {
        protected d(dz $$0) {
            super($$0, mj.bI, frm.e);
        }

        @Override
        public /* synthetic */ @Nullable Object parse(StringReader stringReader) throws CommandSyntaxException {
            return super.a(stringReader);
        }
    }

    public static class a
    extends fg<asj> {
        protected a(dz $$0) {
            super($$0, mj.bc, asj.c);
        }

        @Override
        public /* synthetic */ @Nullable Object parse(StringReader stringReader) throws CommandSyntaxException {
            return super.a(stringReader);
        }
    }

    public static sealed interface g<T, O>
    permits b, f {
        public jd<T> a(ImmutableStringReader var1, jf.a var2, DynamicOps<O> var3, Codec<T> var4, jf.b<T> var5) throws CommandSyntaxException;
    }

    public record f<T, O>(amt<T> a) implements g<T, O>
    {
        @Override
        public jd<T> a(ImmutableStringReader $$0, jf.a $$1, DynamicOps<O> $$2, Codec<T> $$3, jf.b<T> $$4) throws CommandSyntaxException {
            return $$4.a(this.a).orElseThrow(() -> b.createWithContext($$0, (Object)this.a.a(), (Object)this.a.b()));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{f.class, "key", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{f.class, "key", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{f.class, "key", "a"}, this, $$0);
        }
    }

    public record b<T, O>(O a) implements g<T, O>
    {
        @Override
        public jd<T> a(ImmutableStringReader $$0, jf.a $$12, DynamicOps<O> $$2, Codec<T> $$3, jf.b<T> $$4) throws CommandSyntaxException {
            return jd.a($$3.parse($$12.a($$2), this.a).getOrThrow($$1 -> a.createWithContext($$0, $$1)));
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
    }
}

