/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.MinecraftServer;

public class aor {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("defaultgamemode").requires(ee.a(ee.d))).then(ee.a("gamemode", er.a()).executes($$0 -> aor.a((ed)$$0.getSource(), er.a((CommandContext<ed>)$$0, "gamemode")))));
    }

    private static int a(ed $$0, dwl $$1) {
        MinecraftServer $$2 = $$0.m();
        $$2.a($$1);
        int $$3 = $$2.b($$2.bf());
        $$0.a(() -> yh.a("commands.defaultgamemode.success", $$1.d()), true);
        return $$3;
    }
}

