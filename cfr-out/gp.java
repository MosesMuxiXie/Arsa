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

public class gp
implements ArgumentType<gq> {
    private static final Collection<String> a = Arrays.asList("stick", "minecraft:stick", "stick{foo=bar}");
    private final gr b;

    public gp(dz $$0) {
        this.b = new gr($$0);
    }

    public static gp a(dz $$0) {
        return new gp($$0);
    }

    public gq a(StringReader $$0) throws CommandSyntaxException {
        gr.a $$1 = this.b.a($$0);
        return new gq($$1.a(), $$1.b());
    }

    public static <S> gq a(CommandContext<S> $$0, String $$1) {
        return (gq)$$0.getArgument($$1, gq.class);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        return this.b.a($$1);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

