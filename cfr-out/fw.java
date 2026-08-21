/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class fw {
    public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("argument.waypoint.invalid"));

    public static fvx a(CommandContext<ed> $$0, String $$1) throws CommandSyntaxException {
        cgk $$2 = ((gv)$$0.getArgument($$1, gv.class)).a((ed)$$0.getSource());
        if ($$2 instanceof fvx) {
            fvx $$3 = (fvx)((Object)$$2);
            return $$3;
        }
        throw a.create();
    }
}

