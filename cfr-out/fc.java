/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fc
implements ArgumentType<lw> {
    private static final Collection<String> c = Arrays.asList("foo", "foo:bar", "particle{foo:bar}");
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("particle.notFound", $$0));
    public static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("particle.invalidOptions", $$0));
    private final jf.a d;
    private static final wa<?> e = wa.a(vn.a);

    public fc(dz $$0) {
        this.d = $$0;
    }

    public static fc a(dz $$0) {
        return new fc($$0);
    }

    public static lw a(CommandContext<ed> $$0, String $$1) {
        return (lw)$$0.getArgument($$1, lw.class);
    }

    public lw a(StringReader $$0) throws CommandSyntaxException {
        return fc.a($$0, this.d);
    }

    public Collection<String> getExamples() {
        return c;
    }

    public static lw a(StringReader $$0, jf.a $$1) throws CommandSyntaxException {
        lx<?> $$2 = fc.a($$0, $$1.e(mj.ag));
        return fc.a(e, $$0, $$2, $$1);
    }

    private static lx<?> a(StringReader $$0, jf<lx<?>> $$1) throws CommandSyntaxException {
        amo $$2 = amo.a($$0);
        amt<lx<?>> $$3 = amt.a(mj.ag, $$2);
        return $$1.a($$3).orElseThrow(() -> a.createWithContext((ImmutableStringReader)$$0, (Object)$$2)).a();
    }

    private static <T extends lw, O> T a(wa<O> $$0, StringReader $$1, lx<T> $$2, jf.a $$3) throws CommandSyntaxException {
        Object $$6;
        ams<O> $$4 = $$3.a($$0.a());
        if ($$1.canRead() && $$1.peek() == '{') {
            O $$5 = $$0.b($$1);
        } else {
            $$6 = $$4.emptyMap();
        }
        return (T)((lw)$$2.c().codec().parse($$4, $$6).getOrThrow(arg_0 -> ((DynamicCommandExceptionType)b).create(arg_0)));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        jf.b<lx<?>> $$2 = this.d.e(mj.ag);
        return ei.a($$2.c_().map(amt::a), $$1);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

