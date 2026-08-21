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

public interface fd<T extends cq<?>>
extends ArgumentType<T> {
    public static b a() {
        return new b();
    }

    public static a b() {
        return new a();
    }

    public static class b
    implements fd<cq.d> {
        private static final Collection<String> a = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

        public static cq.d a(CommandContext<ed> $$0, String $$1) {
            return (cq.d)$$0.getArgument($$1, cq.d.class);
        }

        public cq.d a(StringReader $$0) throws CommandSyntaxException {
            return cq.d.a($$0);
        }

        public Collection<String> getExamples() {
            return a;
        }

        public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
            return this.a(stringReader);
        }
    }

    public static class a
    implements fd<cq.b> {
        private static final Collection<String> a = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

        public static cq.b a(CommandContext<ed> $$0, String $$1) {
            return (cq.b)$$0.getArgument($$1, cq.b.class);
        }

        public cq.b a(StringReader $$0) throws CommandSyntaxException {
            return cq.b.a($$0);
        }

        public Collection<String> getExamples() {
            return a;
        }

        public /* synthetic */ Object parse(StringReader stringReader) throws CommandSyntaxException {
            return this.a(stringReader);
        }
    }
}

