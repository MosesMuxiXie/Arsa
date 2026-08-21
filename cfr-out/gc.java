/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
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

public class gc
implements ArgumentType<ge> {
    private static final Collection<String> d = Arrays.asList("0 0 0", "~ ~ ~", "^ ^ ^", "^1 ^ ^-5", "~0.5 ~1 ~-5");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("argument.pos.unloaded"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("argument.pos.outofworld"));
    public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("argument.pos.outofbounds"));

    public static gc a() {
        return new gc();
    }

    public static is a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        axf $$2 = ((ed)$$0.getSource()).f();
        return gc.a($$0, $$2, $$1);
    }

    public static is a(CommandContext<ed> $$0, axf $$1, String $$2) throws CommandSyntaxException {
        is $$3 = gc.b($$0, $$2);
        if (!$$1.H($$3)) {
            throw a.create();
        }
        if (!$$1.n($$3)) {
            throw b.create();
        }
        return $$3;
    }

    public static is b(CommandContext<ed> $$0, String $$1) {
        return ((ge)$$0.getArgument($$1, ge.class)).c((ed)$$0.getSource());
    }

    public static is c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        is $$2 = gc.b($$0, $$1);
        if (!dwo.p($$2)) {
            throw c.create();
        }
        return $$2;
    }

    public ge a(StringReader $$0) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '^') {
            return gf.a($$0);
        }
        return gl.a($$0);
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
            return ei.a($$2, $$4, $$1, ee.a(this::a));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return d;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

