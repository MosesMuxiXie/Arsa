/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class gd
implements ArgumentType<ge> {
    private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~1 ~-2", "^ ^", "^-1 ^0");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("argument.pos2d.incomplete"));

    public static gd a() {
        return new gd();
    }

    public static awq a(CommandContext<ed> $$0, String $$1) {
        is $$2 = ((ge)$$0.getArgument($$1, ge.class)).c((ed)$$0.getSource());
        return new awq($$2.u(), $$2.w());
    }

    public ge a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        if (!$$0.canRead()) {
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        gk $$2 = gk.a($$0);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$1);
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        gk $$3 = gk.a($$0);
        return new gl($$2, new gk(true, 0.0), $$3);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        if ($$0.getSource() instanceof ei) {
            Collection<ei.b> $$4;
            String $$2 = $$1.getRemaining();
            if (!$$2.isEmpty() && $$2.charAt(0) == '^') {
                Set<ei.b> $$3 = Collections.singleton(ei.b.a);
            } else {
                $$4 = ((ei)$$0.getSource()).B();
            }
            return ei.b($$2, $$4, $$1, ee.a(this::a));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

