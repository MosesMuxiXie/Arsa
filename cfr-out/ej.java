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

public class ej
implements ArgumentType<a> {
    private static final Collection<String> c = Arrays.asList("0", "~", "~-5");
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("argument.angle.incomplete"));
    public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("argument.angle.invalid"));

    public static ej a() {
        return new ej();
    }

    public static float a(CommandContext<ed> $$0, String $$1) {
        return ((a)$$0.getArgument($$1, a.class)).a((ed)$$0.getSource());
    }

    public a a(StringReader $$0) throws CommandSyntaxException {
        float $$2;
        if (!$$0.canRead()) {
            throw a.createWithContext((ImmutableStringReader)$$0);
        }
        boolean $$1 = gk.b($$0);
        float f2 = $$2 = $$0.canRead() && $$0.peek() != ' ' ? $$0.readFloat() : 0.0f;
        if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            throw b.createWithContext((ImmutableStringReader)$$0);
        }
        return new a($$2, $$1);
    }

    public Collection<String> getExamples() {
        return c;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }

    public static final class a {
        private final float a;
        private final boolean b;

        a(float $$0, boolean $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public float a(ed $$0) {
            return bgj.f(this.b ? this.a + $$0.l().k : this.a);
        }
    }
}

