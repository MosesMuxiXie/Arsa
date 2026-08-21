/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.gson.JsonObject
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
import com.google.common.collect.Iterables;
import com.google.gson.JsonObject;
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
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class eq
implements ArgumentType<gv> {
    private static final Collection<String> g = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("argument.entity.toomany"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("argument.player.toomany"));
    public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("argument.player.entities"));
    public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("argument.entity.notfound.entity"));
    public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("argument.entity.notfound.player"));
    public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType((Message)yh.c("argument.entity.selector.not_allowed"));
    final boolean h;
    final boolean i;

    protected eq(boolean $$0, boolean $$1) {
        this.h = $$0;
        this.i = $$1;
    }

    public static eq a() {
        return new eq(true, false);
    }

    public static cgk a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ((gv)$$0.getArgument($$1, gv.class)).a((ed)$$0.getSource());
    }

    public static eq b() {
        return new eq(false, false);
    }

    public static Collection<? extends cgk> b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        Collection<? extends cgk> $$2 = eq.c($$0, $$1);
        if ($$2.isEmpty()) {
            throw d.create();
        }
        return $$2;
    }

    public static Collection<? extends cgk> c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ((gv)$$0.getArgument($$1, gv.class)).b((ed)$$0.getSource());
    }

    public static Collection<axg> d(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ((gv)$$0.getArgument($$1, gv.class)).d((ed)$$0.getSource());
    }

    public static eq c() {
        return new eq(true, true);
    }

    public static axg e(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return ((gv)$$0.getArgument($$1, gv.class)).c((ed)$$0.getSource());
    }

    public static eq d() {
        return new eq(false, true);
    }

    public static Collection<axg> f(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        List<axg> $$2 = ((gv)$$0.getArgument($$1, gv.class)).d((ed)$$0.getSource());
        if ($$2.isEmpty()) {
            throw e.create();
        }
        return $$2;
    }

    public gv a(StringReader $$0) throws CommandSyntaxException {
        return this.a($$0, true);
    }

    public <S> gv a(StringReader $$0, S $$1) throws CommandSyntaxException {
        return this.a($$0, gw.a($$1));
    }

    private gv a(StringReader $$0, boolean $$1) throws CommandSyntaxException {
        boolean $$2 = false;
        gw $$3 = new gw($$0, $$1);
        gv $$4 = $$3.t();
        if ($$4.a() > 1 && this.h) {
            if (this.i) {
                $$0.setCursor(0);
                throw b.createWithContext((ImmutableStringReader)$$0);
            }
            $$0.setCursor(0);
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        if ($$4.b() && this.i && !$$4.c()) {
            $$0.setCursor(0);
            throw c.createWithContext((ImmutableStringReader)$$0);
        }
        return $$4;
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
            return $$4.a($$12, (SuggestionsBuilder $$1) -> {
                Collection<String> $$2 = $$2.r();
                Collection<String> $$3 = this.i ? $$2 : Iterables.concat($$2, $$2.A());
                ei.b($$3, $$1);
            });
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return g;
    }

    public /* synthetic */ Object parse(StringReader stringReader, Object object) throws CommandSyntaxException {
        return this.a(stringReader, object);
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static class eq$a
    implements ib<eq, a> {
        private static final byte a = 1;
        private static final byte b = 2;

        @Override
        public void a(a $$0, wx $$1) {
            int $$2 = 0;
            if ($$0.b) {
                $$2 |= 1;
            }
            if ($$0.c) {
                $$2 |= 2;
            }
            $$1.l($$2);
        }

        @Override
        public a a(wx $$0) {
            byte $$1 = $$0.readByte();
            return new a(($$1 & 1) != 0, ($$1 & 2) != 0);
        }

        @Override
        public void a(a $$0, JsonObject $$1) {
            $$1.addProperty("amount", $$0.b ? "single" : "multiple");
            $$1.addProperty("type", $$0.c ? "players" : "entities");
        }

        @Override
        public a a(eq $$0) {
            return new a($$0.h, $$0.i);
        }

        @Override
        public /* synthetic */ ib.a b(wx wx2) {
            return this.a(wx2);
        }

        public final class a
        implements ib.a<eq> {
            final boolean b;
            final boolean c;

            a(boolean $$1, boolean $$2) {
                this.b = $$1;
                this.c = $$2;
            }

            public eq a(dz $$0) {
                return new eq(this.b, this.c);
            }

            @Override
            public ib<eq, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dz dz2) {
                return this.a(dz2);
            }
        }
    }
}

