/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.serialization.DynamicOps
 */
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.List;

public class fq
extends byv<zf> {
    private static final Collection<String> b = List.of("{bold: true}", "{color: 'red'}", "{}");
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("argument.style.invalid", $$0));
    private static final DynamicOps<vz> c = vn.a;
    private static final byp<vz> d = vt.a(c);

    private fq(jf.a $$0) {
        super(d.a($$0.a(c), d, zf.b.b, a));
    }

    public static zf a(CommandContext<ed> $$0, String $$1) {
        return (zf)$$0.getArgument($$1, zf.class);
    }

    public static fq a(dz $$0) {
        return new fq($$0);
    }

    public Collection<String> getExamples() {
        return b;
    }
}

