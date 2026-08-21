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

public class ez
implements ArgumentType<String> {
    private static final Collection<String> a = Arrays.asList("foo", "*", "012");
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("arguments.objective.notFound", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("arguments.objective.readonly", $$0));

    public static ez a() {
        return new ez();
    }

    public static fuj a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        String $$2 = (String)$$0.getArgument($$1, String.class);
        anm $$3 = ((ed)$$0.getSource()).m().aK();
        fuj $$4 = $$3.a($$2);
        if ($$4 == null) {
            throw b.create((Object)$$2);
        }
        return $$4;
    }

    public static fuj b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        fuj $$2 = ez.a($$0, $$1);
        if ($$2.d().e()) {
            throw c.create((Object)$$2.c());
        }
        return $$2;
    }

    public String a(StringReader $$0) throws CommandSyntaxException {
        return $$0.readUnquotedString();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        Object $$2 = $$0.getSource();
        if ($$2 instanceof ed) {
            ed $$3 = (ed)$$2;
            return ei.b($$3.m().aK().c(), $$1);
        }
        if ($$2 instanceof ei) {
            ei $$4 = (ei)$$2;
            return $$4.a($$0);
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

