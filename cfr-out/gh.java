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
import java.util.EnumSet;

public class gh
implements ArgumentType<EnumSet<iz.a>> {
    private static final Collection<String> a = Arrays.asList("xyz", "x");
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("arguments.swizzle.invalid"));

    public static gh a() {
        return new gh();
    }

    public static EnumSet<iz.a> a(CommandContext<ed> $$0, String $$1) {
        return (EnumSet)$$0.getArgument($$1, EnumSet.class);
    }

    /*
     * WARNING - void declaration
     */
    public EnumSet<iz.a> a(StringReader $$0) throws CommandSyntaxException {
        EnumSet<iz.a> $$1 = EnumSet.noneOf(iz.a.class);
        while ($$0.canRead() && $$0.peek() != ' ') {
            void $$6;
            char $$2 = $$0.read();
            switch ($$2) {
                case 'x': {
                    iz.a $$3 = iz.a.a;
                    break;
                }
                case 'y': {
                    iz.a $$4 = iz.a.b;
                    break;
                }
                case 'z': {
                    iz.a $$5 = iz.a.c;
                    break;
                }
                default: {
                    throw b.createWithContext((ImmutableStringReader)$$0);
                }
            }
            if ($$1.contains($$6)) {
                throw b.createWithContext((ImmutableStringReader)$$0);
            }
            $$1.add((iz.a)$$6);
        }
        return $$1;
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

