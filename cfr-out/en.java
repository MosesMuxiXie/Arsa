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

public class en
implements ArgumentType<uz> {
    private static final Collection<String> a = Arrays.asList("{}", "{foo=bar}");

    private en() {
    }

    public static en a() {
        return new en();
    }

    public static <S> uz a(CommandContext<S> $$0, String $$1) {
        return (uz)$$0.getArgument($$1, uz.class);
    }

    public uz a(StringReader $$0) throws CommandSyntaxException {
        return wa.c($$0);
    }

    public Collection<String> getExamples() {
        return a;
    }

    public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
        return this.a(stringReader);
    }
}

