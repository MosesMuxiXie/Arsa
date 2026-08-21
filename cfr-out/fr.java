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
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fr
implements ArgumentType<String> {
    private static final Collection<String> a = Arrays.asList("foo", "123");
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("team.notFound", $$0));

    public static fr a() {
        return new fr();
    }

    public static fum a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        String $$2 = (String)$$0.getArgument($$1, String.class);
        anm $$3 = ((ed)$$0.getSource()).m().aK();
        fum $$4 = $$3.b($$2);
        if ($$4 == null) {
            throw b.create((Object)$$2);
        }
        return $$4;
    }

    public String a(StringReader $$0) throws CommandSyntaxException {
        return $$0.readUnquotedString();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        if ($$0.getSource() instanceof ei) {
            return ei.b(((ei)$$0.getSource()).s(), $$1);
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

