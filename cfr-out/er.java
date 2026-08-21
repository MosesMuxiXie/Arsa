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
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class er
implements ArgumentType<dwl> {
    private static final Collection<String> a = Stream.of(dwl.a, dwl.b).map(dwl::b).collect(Collectors.toList());
    private static final dwl[] b = dwl.values();
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("argument.gamemode.invalid", $$0));

    public dwl a(StringReader $$0) throws CommandSyntaxException {
        String $$1 = $$0.readUnquotedString();
        dwl $$2 = dwl.a($$1, null);
        if ($$2 == null) {
            throw c.createWithContext((ImmutableStringReader)$$0, (Object)$$1);
        }
        return $$2;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        if ($$0.getSource() instanceof ei) {
            return ei.b(Arrays.stream(b).map(dwl::b), $$1);
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return a;
    }

    public static er a() {
        return new er();
    }

    public static dwl a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return (dwl)$$0.getArgument($$1, dwl.class);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

