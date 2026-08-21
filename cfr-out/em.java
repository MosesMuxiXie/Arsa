/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.serialization.DynamicOps
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Arrays;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class em
extends byv<yh> {
    private static final Collection<String> b = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("argument.component.invalid", $$0));
    private static final DynamicOps<vz> c = vn.a;
    private static final byp<vz> d = vt.a(c);

    private em(jf.a $$0) {
        super(d.a($$0.a(c), d, yj.a, a));
    }

    public static yh a(CommandContext<ed> $$0, String $$1) {
        return (yh)$$0.getArgument($$1, yh.class);
    }

    public static yh a(CommandContext<ed> $$0, String $$1, @Nullable cgk $$2) throws CommandSyntaxException {
        return yk.a((ed)$$0.getSource(), em.a($$0, $$1), $$2, 0);
    }

    public static yh b(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        return em.a($$0, $$1, ((ed)$$0.getSource()).g());
    }

    public static em a(dz $$0) {
        return new em($$0);
    }

    public Collection<String> getExamples() {
        return b;
    }
}

