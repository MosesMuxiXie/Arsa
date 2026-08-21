/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eo
implements ArgumentType<amo> {
    private static final Collection<String> a = Stream.of(dwo.h, dwo.i).map($$0 -> $$0.a().toString()).collect(Collectors.toList());
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("argument.dimension.invalid", $$0));

    public amo a(StringReader $$0) throws CommandSyntaxException {
        return amo.a($$0);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        if ($$0.getSource() instanceof ei) {
            return ei.a(((ei)$$0.getSource()).u().stream().map(amt::a), $$1);
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return a;
    }

    public static eo a() {
        return new eo();
    }

    public static axf a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        amo $$2 = (amo)$$0.getArgument($$1, amo.class);
        amt<dwo> $$3 = amt.a(mj.bE, $$2);
        axf $$4 = ((ed)$$0.getSource()).m().a($$3);
        if ($$4 == null) {
            throw b.create((Object)$$2);
        }
        return $$4;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

