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

public class fn
implements ArgumentType<Integer> {
    private static final Collection<String> a = Arrays.asList("container.5", "weapon");
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("slot.unknown", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("slot.only_single_allowed", $$0));

    public static fn a() {
        return new fn();
    }

    public static int a(CommandContext<ed> $$0, String $$1) {
        return (Integer)$$0.getArgument($$1, Integer.class);
    }

    public Integer a(StringReader $$02) throws CommandSyntaxException {
        String $$1 = eh.a($$02, (char $$0) -> $$0 != ' ');
        djj $$2 = djk.a($$1);
        if ($$2 == null) {
            throw b.createWithContext((ImmutableStringReader)$$02, (Object)$$1);
        }
        if ($$2.b() != 1) {
            throw c.createWithContext((ImmutableStringReader)$$02, (Object)$$1);
        }
        return $$2.a().getInt(0);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return ei.b(djk.b(), $$1);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

