/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.context.CommandContext;

public class ft
extends fp<egm> {
    private ft() {
        super(egm.f, egm::values);
    }

    public static ft a() {
        return new ft();
    }

    public static egm a(CommandContext<ed> $$0, String $$1) {
        return (egm)$$0.getArgument($$1, egm.class);
    }
}

