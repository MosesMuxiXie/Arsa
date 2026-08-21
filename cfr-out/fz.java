/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fz
implements ArgumentType<fx> {
    private static final Collection<String> a = Arrays.asList("stone", "minecraft:stone", "stone[foo=bar]", "foo{bar=baz}");
    private final jf<dzq> b;

    public fz(dz $$0) {
        this.b = $$0.e(mj.i);
    }

    public static fz a(dz $$0) {
        return new fz($$0);
    }

    public fx a(StringReader $$0) throws CommandSyntaxException {
        ga.a $$1 = ga.a(this.b, $$0, true);
        return new fx($$1.a(), $$1.b().keySet(), $$1.c());
    }

    public static fx a(CommandContext<ed> $$0, String $$1) {
        return (fx)$$0.getArgument($$1, fx.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ga.a(this.b, $$1, false, true);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

