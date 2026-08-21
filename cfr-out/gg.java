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
 */
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class gg
implements ArgumentType<ge> {
    private static final Collection<String> b = Arrays.asList("0 0", "~ ~", "~-5 ~5");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("argument.rotation.incomplete"));

    public static gg a() {
        return new gg();
    }

    public static ge a(CommandContext<ed> $$0, String $$1) {
        return (ge)$$0.getArgument($$1, ge.class);
    }

    public ge a(StringReader $$0) throws CommandSyntaxException {
        int $$1 = $$0.getCursor();
        if (!$$0.canRead()) {
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        gk $$2 = gk.a($$0, false);
        if (!$$0.canRead() || $$0.peek() != ' ') {
            $$0.setCursor($$1);
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        $$0.skip();
        gk $$3 = gk.a($$0, false);
        return new gl($$3, $$2, new gk(true, 0.0));
    }

    public Collection<String> getExamples() {
        return b;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

