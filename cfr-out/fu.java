/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class fu
implements ArgumentType<Integer> {
    private static final Collection<String> a = Arrays.asList("0d", "0s", "0t", "0");
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("argument.time.invalid_unit"));
    private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("argument.time.tick_count_too_low", $$1, $$0));
    private static final Object2IntMap<String> d = new Object2IntOpenHashMap();
    final int e;

    private fu(int $$0) {
        this.e = $$0;
    }

    public static fu a() {
        return new fu(0);
    }

    public static fu a(int $$0) {
        return new fu($$0);
    }

    public Integer a(StringReader $$0) throws CommandSyntaxException {
        float $$1 = $$0.readFloat();
        String $$2 = $$0.readUnquotedString();
        int $$3 = d.getOrDefault((Object)$$2, 0);
        if ($$3 == 0) {
            throw b.createWithContext((ImmutableStringReader)$$0);
        }
        int $$4 = Math.round($$1 * (float)$$3);
        if ($$4 < this.e) {
            throw c.createWithContext((ImmutableStringReader)$$0, (Object)$$4, (Object)this.e);
        }
        return $$4;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> $$0, SuggestionsBuilder $$1) {
        StringReader $$2 = new StringReader($$1.getRemaining());
        try {
            $$2.readFloat();
        }
        catch (CommandSyntaxException $$3) {
            return $$1.buildFuture();
        }
        return ei.b((Iterable<String>)d.keySet(), $$1.createOffset($$1.getStart() + $$2.getCursor()));
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    static {
        d.put((Object)"d", 24000);
        d.put((Object)"s", 20);
        d.put((Object)"t", 1);
        d.put((Object)"", 1);
    }

    public static class fu$a
    implements ib<fu, a> {
        @Override
        public void a(a $$0, wx $$1) {
            $$1.q($$0.b);
        }

        @Override
        public a a(wx $$0) {
            int $$1 = $$0.readInt();
            return new a($$1);
        }

        @Override
        public void a(a $$0, JsonObject $$1) {
            $$1.addProperty("min", (Number)$$0.b);
        }

        @Override
        public a a(fu $$0) {
            return new a($$0.e);
        }

        @Override
        public /* synthetic */ ib.a b(wx wx2) {
            return this.a(wx2);
        }

        public final class a
        implements ib.a<fu> {
            final int b;

            a(int $$1) {
                this.b = $$1;
            }

            public fu a(dz $$0) {
                return fu.a(this.b);
            }

            @Override
            public ib<fu, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dz dz2) {
                return this.a(dz2);
            }
        }
    }
}

