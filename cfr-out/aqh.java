/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.server.MinecraftServer;

public class aqh {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.save.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("save-all").requires(ee.a(ee.f))).executes($$0 -> aqh.a((ed)$$0.getSource(), false))).then(ee.b("flush").executes($$0 -> aqh.a((ed)$$0.getSource(), true))));
    }

    private static int a(ed $$0, boolean $$1) throws CommandSyntaxException {
        $$0.a(() -> yh.c("commands.save.saving"), false);
        MinecraftServer $$2 = $$0.m();
        boolean $$3 = $$2.b(true, $$1, true);
        if (!$$3) {
            throw a.create();
        }
        $$0.a(() -> yh.c("commands.save.success"), true);
        return 1;
    }
}

