/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.context.CommandContext;

public class fs
extends fp<eev> {
    private fs() {
        super(eev.d, eev::values);
    }

    public static fp<eev> a() {
        return new fs();
    }

    public static eev a(CommandContext<ed> $$0, String $$1) {
        return (eev)$$0.getArgument($$1, eev.class);
    }
}

