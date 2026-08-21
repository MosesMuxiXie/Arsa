/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.serialization.Codec
 */
import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;

public class et
extends fp<euq.a> {
    private static final Codec<euq.a> a = bhh.a(et::b, (String $$0) -> $$0.toLowerCase(Locale.ROOT));

    private static euq.a[] b() {
        return (euq.a[])Arrays.stream(euq.a.values()).filter(euq.a::d).toArray(euq.a[]::new);
    }

    private et() {
        super(a, et::b);
    }

    public static et a() {
        return new et();
    }

    public static euq.a a(CommandContext<ed> $$0, String $$1) {
        return (euq.a)$$0.getArgument($$1, euq.a.class);
    }

    @Override
    protected String a(String $$0) {
        return $$0.toLowerCase(Locale.ROOT);
    }
}

