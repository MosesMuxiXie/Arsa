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
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fe<T>
implements ArgumentType<jd.c<T>> {
    private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "012");
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> yh.b("entity.not_summonable", $$0));
    public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.resource.not_found", $$0, $$1));
    public static final Dynamic3CommandExceptionType b = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> yh.b("argument.resource.invalid_type", $$0, $$1, $$2));
    final amt<? extends jq<T>> e;
    private final jf<T> f;

    public fe(dz $$0, amt<? extends jq<T>> $$1) {
        this.e = $$1;
        this.f = $$0.e($$1);
    }

    public static <T> fe<T> a(dz $$0, amt<? extends jq<T>> $$1) {
        return new fe<T>($$0, $$1);
    }

    public static <T> jd.c<T> a(CommandContext<ed> $$0, String $$1, amt<jq<T>> $$2) throws CommandSyntaxException {
        jd.c $$3 = (jd.c)$$0.getArgument($$1, jd.c.class);
        amt $$4 = $$3.h();
        if ($$4.c($$2)) {
            return $$3;
        }
        throw b.create((Object)$$4.a(), (Object)$$4.b(), (Object)$$2.a());
    }

    public static jd.c<cin> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return fe.a($$0, $$1, mj.c);
    }

    public static jd.c<exi<?, ?>> b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return fe.a($$0, $$1, mj.aY);
    }

    public static jd.c<ffo> c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return fe.a($$0, $$1, mj.bs);
    }

    public static jd.c<cgu<?>> d(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return fe.a($$0, $$1, mj.F);
    }

    public static jd.c<cgu<?>> e(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        jd.c<cgu<?>> $$2 = fe.a($$0, $$1, mj.F);
        if (!((cgu)$$2.a()).c()) {
            throw d.create((Object)$$2.h().a().toString());
        }
        return $$2;
    }

    public static jd.c<cfk> f(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return fe.a($$0, $$1, mj.ae);
    }

    public static jd.c<dso> g(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return fe.a($$0, $$1, mj.bf);
    }

    public jd.c<T> a(StringReader $$0) throws CommandSyntaxException {
        amo $$1 = amo.a($$0);
        amt $$2 = amt.a(this.e, $$1);
        return this.f.a($$2).orElseThrow(() -> a.createWithContext((ImmutableStringReader)$$0, (Object)$$1, (Object)this.e.a()));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.a($$0, $$1, this.e, ei.a.b);
    }

    public Collection<String> getExamples() {
        return c;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static class fe$a<T>
    implements ib<fe<T>, a> {
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
        public a a(fe<T> $$0) {
            return new a($$0.e);
        }

        @Override
        public /* synthetic */ ib.a b(wx wx2) {
            return this.a(wx2);
        }

        public final class a
        implements ib.a<fe<T>> {
            final amt<? extends jq<T>> b;

            a(amt<? extends jq<T>> $$1) {
                this.b = $$1;
            }

            public fe<T> a(dz $$0) {
                return new fe($$0, this.b);
            }

            @Override
            public ib<fe<T>, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dz dz2) {
                return this.a(dz2);
            }
        }
    }
}

