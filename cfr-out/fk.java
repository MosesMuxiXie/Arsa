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
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import net.minecraft.server.MinecraftServer;

public class fk
implements ArgumentType<b> {
    public static final SuggestionProvider<ed> a = ($$0, $$12) -> {
        StringReader $$2 = new StringReader($$12.getInput());
        $$2.setCursor($$12.getStart());
        gw $$3 = new gw($$2, ((ed)$$0.getSource()).d().hasPermission(bbr.e));
        try {
            $$3.t();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return $$3.a($$12, $$1 -> ei.b(((ed)$$0.getSource()).r(), $$1));
    };
    private static final Collection<String> b = Arrays.asList("Player", "0123", "*", "@e");
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("argument.scoreHolder.empty"));
    final boolean d;

    public fk(boolean $$0) {
        this.d = $$0;
    }

    public static fuq a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return fk.b($$0, $$1).iterator().next();
    }

    public static Collection<fuq> b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return fk.a($$0, $$1, Collections::emptyList);
    }

    public static Collection<fuq> c(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return fk.a($$0, $$1, ((ed)$$0.getSource()).m().aK()::d);
    }

    public static Collection<fuq> a(CommandContext<ed> $$0, String $$1, Supplier<Collection<fuq>> $$2) throws CommandSyntaxException {
        Collection<fuq> $$3 = ((b)$$0.getArgument($$1, b.class)).getNames((ed)$$0.getSource(), $$2);
        if ($$3.isEmpty()) {
            throw eq.d.create();
        }
        return $$3;
    }

    public static fk a() {
        return new fk(false);
    }

    public static fk b() {
        return new fk(true);
    }

    public b a(StringReader $$0) throws CommandSyntaxException {
        return this.a($$0, true);
    }

    public <S> b a(StringReader $$0, S $$1) throws CommandSyntaxException {
        return this.a($$0, gw.a($$1));
    }

    private b a(StringReader $$02, boolean $$12) throws CommandSyntaxException {
        if ($$02.canRead() && $$02.peek() == '@') {
            gw $$22 = new gw($$02, $$12);
            gv $$32 = $$22.t();
            if (!this.d && $$32.a() > 1) {
                throw eq.a.createWithContext((ImmutableStringReader)$$02);
            }
            return new c($$32);
        }
        int $$4 = $$02.getCursor();
        while ($$02.canRead() && $$02.peek() != ' ') {
            $$02.skip();
        }
        String $$5 = $$02.getString().substring($$4, $$02.getCursor());
        if ($$5.equals("*")) {
            return ($$0, $$1) -> {
                Collection $$2 = (Collection)$$1.get();
                if ($$2.isEmpty()) {
                    throw c.create();
                }
                return $$2;
            };
        }
        List<fuq> $$6 = List.of(fuq.c($$5));
        if ($$5.startsWith("#")) {
            return ($$1, $$2) -> $$6;
        }
        try {
            UUID $$7 = UUID.fromString($$5);
            return ($$2, $$3) -> {
                MinecraftServer $$4 = $$2.m();
                cgk $$5 = null;
                ArrayList<cgk> $$6 = null;
                for (axf $$7 : $$4.P()) {
                    cgk $$8 = $$7.d($$7);
                    if ($$8 == null) continue;
                    if ($$5 == null) {
                        $$5 = $$8;
                        continue;
                    }
                    if ($$6 == null) {
                        $$6 = new ArrayList<cgk>();
                        $$6.add($$5);
                    }
                    $$6.add($$8);
                }
                if ($$6 != null) {
                    return $$6;
                }
                if ($$5 != null) {
                    return List.of($$5);
                }
                return $$6;
            };
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return ($$2, $$3) -> {
                MinecraftServer $$4 = $$2.m();
                axg $$5 = $$4.aj().a($$5);
                if ($$5 != null) {
                    return List.of($$5);
                }
                return $$6;
            };
        }
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
    public static interface b {
        public Collection<fuq> getNames(ed var1, Supplier<Collection<fuq>> var2) throws CommandSyntaxException;
    }

    public static class c
    implements b {
        private final gv a;

        public c(gv $$0) {
            this.a = $$0;
        }

        @Override
        public Collection<fuq> getNames(ed $$0, Supplier<Collection<fuq>> $$1) throws CommandSyntaxException {
            List<? extends cgk> $$2 = this.a.b($$0);
            if ($$2.isEmpty()) {
                throw eq.d.create();
            }
            return List.copyOf($$2);
        }
    }

    public static class fk$a
    implements ib<fk, a> {
        private static final byte a = 1;

        @Override
        public void a(a $$0, wx $$1) {
            int $$2 = 0;
            if ($$0.b) {
                $$2 |= 1;
            }
            $$1.l($$2);
        }

        @Override
        public a a(wx $$0) {
            byte $$1 = $$0.readByte();
            boolean $$2 = ($$1 & 1) != 0;
            return new a($$2);
        }

        @Override
        public void a(a $$0, JsonObject $$1) {
            $$1.addProperty("amount", $$0.b ? "multiple" : "single");
        }

        @Override
        public a a(fk $$0) {
            return new a($$0.d);
        }

        @Override
        public /* synthetic */ ib.a b(wx wx2) {
            return this.a(wx2);
        }

        public final class a
        implements ib.a<fk> {
            final boolean b;

            a(boolean $$1) {
                this.b = $$1;
            }

            public fk a(dz $$0) {
                return new fk(this.b);
            }

            @Override
            public ib<fk, ?> a() {
                return a.this;
            }

            @Override
            public /* synthetic */ ArgumentType b(dz dz2) {
                return this.a(dz2);
            }
        }
    }
}

