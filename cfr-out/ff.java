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
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ff<T>
implements ArgumentType<amt<T>> {
    private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("commands.place.feature.invalid", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("commands.place.structure.invalid", $$0));
    private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> yh.b("commands.place.jigsaw.invalid", $$0));
    private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> yh.b("recipe.notFound", $$0));
    private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> yh.b("advancement.advancementNotFound", $$0));
    final amt<? extends jq<T>> g;

    public ff(amt<? extends jq<T>> $$0) {
        this.g = $$0;
    }

    public static <T> ff<T> a(amt<? extends jq<T>> $$0) {
        return new ff<T>($$0);
    }

    public static <T> amt<T> a(CommandContext<ed> $$0, String $$1, amt<jq<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
        amt $$4 = (amt)$$0.getArgument($$1, amt.class);
        Optional<amt<T>> $$5 = $$4.d($$2);
        return $$5.orElseThrow(() -> $$3.create((Object)$$4.a()));
    }

    private static <T> jq<T> a(CommandContext<ed> $$0, amt<? extends jq<T>> $$1) {
        return ((ed)$$0.getSource()).m().bc().f($$1);
    }

    private static <T> jd.c<T> b(CommandContext<ed> $$0, String $$1, amt<jq<T>> $$2, DynamicCommandExceptionType $$3) throws CommandSyntaxException {
        amt $$4 = ff.a($$0, $$1, $$2, $$3);
        return (jd.c)ff.a($$0, $$2).a($$4).orElseThrow(() -> $$3.create((Object)$$4.a()));
    }

    public static jd.c<exi<?, ?>> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ff.b($$0, $$1, mj.aY, b);
    }

    public static jd.c<ffo> b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ff.b($$0, $$1, mj.bs, c);
    }

    public static jd.c<fgy> c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ff.b($$0, $$1, mj.bt, d);
    }

    public static dqx<?> d(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        dqz $$2 = ((ed)$$0.getSource()).m().aJ();
        amt<dqs<?>> $$3 = ff.a($$0, $$1, mj.bK, e);
        return $$2.b($$3).orElseThrow(() -> e.create((Object)$$3.a()));
    }

    public static ac e(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        amt $$2 = ff.a($$0, $$1, mj.bJ, f);
        ac $$3 = ((ed)$$0.getSource()).m().aB().a($$2.a());
        if ($$3 == null) {
            throw f.create((Object)$$2.a());
        }
        return $$3;
    }

    public amt<T> a(StringReader $$0) throws CommandSyntaxException {
        amo $$1 = amo.a($$0);
        return amt.a(this.g, $$1);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.a($$0, $$1, this.g, ei.a.b);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static class ff$a<T>
    implements ib<ff<T>, a> {
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
        public a a(ff<T> $$0) {
            return new a($$0.g);
        }

        @Override
        public /* synthetic */ ib.a b(wx wx2) {
            return this.a(wx2);
        }

        public final class a
        implements ib.a<ff<T>> {
            final amt<? extends jq<T>> b;

            a(amt<? extends jq<T>> $$1) {
                this.b = $$1;
            }

            public ff<T> a(dz $$0) {
                return new ff(this.b);
            }

            @Override
            public ib<ff<T>, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dz dz2) {
                return this.a(dz2);
            }
        }
    }
}

