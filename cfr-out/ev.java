/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class ev
implements ArgumentType<amo> {
    private static final Collection<String> a = Arrays.asList("foo", "foo:bar", "012");

    public static ev a() {
        return new ev();
    }

    public static amo a(CommandContext<ed> $$0, String $$1) {
        return (amo)$$0.getArgument($$1, amo.class);
    }

    public amo a(StringReader $$0) throws CommandSyntaxException {
        return amo.a($$0);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

