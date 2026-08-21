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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class es
implements ArgumentType<a> {
    private static final Collection<String> b = Arrays.asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("argument.player.unknown"));

    public static Collection<bbx> a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ((a)$$0.getArgument($$1, a.class)).getNames((ed)$$0.getSource());
    }

    public static es a() {
        return new es();
    }

    public <S> a a(StringReader $$0, S $$1) throws CommandSyntaxException {
        return es.a($$0, gw.a($$1));
    }

    public a a(StringReader $$0) throws CommandSyntaxException {
        return es.a($$0, true);
    }

    private static a a(StringReader $$0, boolean $$12) throws CommandSyntaxException {
        if ($$0.canRead() && $$0.peek() == '@') {
            gw $$2 = new gw($$0, $$12);
            gv $$3 = $$2.t();
            if ($$3.b()) {
                throw eq.c.createWithContext((ImmutableStringReader)$$0);
            }
            return new b($$3);
        }
        int $$4 = $$0.getCursor();
        while ($$0.canRead() && $$0.peek() != ' ') {
            $$0.skip();
        }
        String $$5 = $$0.getString().substring($$4, $$0.getCursor());
        return $$1 -> {
            Optional<bbx> $$2 = $$1.m().ar().f().a($$5);
            return Collections.singleton($$2.orElseThrow(() -> ((SimpleCommandExceptionType)a).create()));
        };
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$12) {
        Object object = $$0.getSource();
        if (object instanceof ei) {
            ei $$2 = (ei)object;
            StringReader $$3 = new StringReader($$12.getInput());
            $$3.setCursor($$12.getStart());
            gw $$4 = new gw($$3, $$2.d().hasPermission(bbr.e));
            try {
                $$4.t();
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
            return $$4.a($$12, $$1 -> ei.b($$2.r(), $$1));
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader, Object object) throws CommandSyntaxException {
        return this.a(stringReader, object);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    @FunctionalInterface
    public static interface a {
        public Collection<bbx> getNames(ed var1) throws CommandSyntaxException;
    }

    public static class b
    implements a {
        private final gv a;

        public b(gv $$0) {
            this.a = $$0;
        }

        @Override
        public Collection<bbx> getNames(ed $$0) throws CommandSyntaxException {
            List<axg> $$1 = this.a.d($$0);
            if ($$1.isEmpty()) {
                throw eq.e.create();
            }
            ArrayList<bbx> $$2 = new ArrayList<bbx>();
            for (axg $$3 : $$1) {
                $$2.add($$3.gJ());
            }
            return $$2;
        }
    }
}

