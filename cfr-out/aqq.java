/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class aqq {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("setidletimeout").requires(ee.a(ee.e))).then(ee.a("minutes", IntegerArgumentType.integer((int)0)).executes($$0 -> aqq.a((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"minutes")))));
    }

    private static int a(ed $$0, int $$1) {
        $$0.m().d($$1);
        if ($$1 > 0) {
            $$0.a(() -> yh.a("commands.setidletimeout.success", $$1), true);
        } else {
            $$0.a(() -> yh.c("commands.setidletimeout.success.disabled"), true);
        }
        return $$1;
    }
}

