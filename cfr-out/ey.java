/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.context.CommandContext;
import java.util.Arrays;
import java.util.Collection;

public class ey
extends byv<vz> {
    private static final Collection<String> a = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");
    private static final byp<vz> b = vt.a(vn.a);

    private ey() {
        super(b);
    }

    public static ey a() {
        return new ey();
    }

    public static <S> vz a(CommandContext<S> $$0, String $$1) {
        return (vz)$$0.getArgument($$1, vz.class);
    }

    public Collection<String> getExamples() {
        return a;
    }
}

