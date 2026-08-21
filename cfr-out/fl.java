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

public class fl
implements ArgumentType<fui> {
    private static final Collection<String> b = Arrays.asList("sidebar", "foo.bar");
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("argument.scoreboardDisplaySlot.invalid", $$0));

    private fl() {
    }

    public static fl a() {
        return new fl();
    }

    public static fui a(CommandContext<ed> $$0, String $$1) {
        return (fui)$$0.getArgument($$1, fui.class);
    }

    public fui a(StringReader $$0) throws CommandSyntaxException {
        String $$1 = $$0.readUnquotedString();
        fui $$2 = fui.t.a($$1);
        if ($$2 == null) {
            throw a.createWithContext((ImmutableStringReader)$$0, (Object)$$1);
        }
        return $$2;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.b(Arrays.stream(fui.values()).map(fui::c), $$1);
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

