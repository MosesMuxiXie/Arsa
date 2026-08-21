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
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class fo
implements ArgumentType<djj> {
    private static final Collection<String> a = List.of("container.*", "container.5", "weapon");
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("slot.unknown", $$0));

    public static fo a() {
        return new fo();
    }

    public static djj a(CommandContext<ed> $$0, String $$1) {
        return (djj)$$0.getArgument($$1, djj.class);
    }

    public djj a(StringReader $$02) throws CommandSyntaxException {
        String $$1 = eh.a($$02, (char $$0) -> $$0 != ' ');
        djj $$2 = djk.a($$1);
        if ($$2 == null) {
            throw b.createWithContext((ImmutableStringReader)$$02, (Object)$$1);
        }
        return $$2;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.b(djk.a(), $$1);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

