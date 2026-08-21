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

public class el
implements ArgumentType<l> {
    private static final Collection<String> b = Arrays.asList("red", "green");
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("argument.color.invalid", $$0));

    private el() {
    }

    public static el a() {
        return new el();
    }

    public static l a(CommandContext<ed> $$0, String $$1) {
        return (l)$$0.getArgument($$1, l.class);
    }

    public l a(StringReader $$0) throws CommandSyntaxException {
        String $$1 = $$0.readUnquotedString();
        l $$2 = l.b($$1);
        if ($$2 == null || $$2.d()) {
            throw a.createWithContext((ImmutableStringReader)$$0, (Object)$$1);
        }
        return $$2;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.b(l.a(true, false), $$1);
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

