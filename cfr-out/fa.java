/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fa
implements ArgumentType<fuu> {
    private static final Collection<String> b = Arrays.asList("foo", "foo.bar.baz", "minecraft:foo");
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("argument.criteria.invalid", $$0));

    private fa() {
    }

    public static fa a() {
        return new fa();
    }

    public static fuu a(CommandContext<ed> $$0, String $$1) {
        return (fuu)$$0.getArgument($$1, fuu.class);
    }

    public fuu a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
        }
        String $$2 = $$0.getString().substring($$1, $$0.getCursor());
        return fuu.a($$2).orElseThrow(() -> {
            $$0.setCursor($$1);
            return a.createWithContext((ImmutableStringReader)$$0, (Object)$$2);
        });
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        ArrayList $$2 = Lists.newArrayList(fuu.c());
        for (bdj bdj2 : mi.w) {
            for (Object $$4 : bdj2.b()) {
                String $$5 = this.a(bdj2, $$4);
                $$2.add($$5);
            }
        }
        return ei.b($$2, $$1);
    }

    public <T> String a(bdj<T> $$0, Object $$1) {
        return bdh.a($$0, $$1);
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

