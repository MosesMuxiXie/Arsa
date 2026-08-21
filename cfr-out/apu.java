/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.InetAddresses
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class apu {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.pardonip.invalid"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.pardonip.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("pardon-ip").requires(ee.a(ee.e))).then(ee.a("target", StringArgumentType.word()).suggests(($$0, $$1) -> ei.a(((ed)$$0.getSource()).m().aj().g().b(), $$1)).executes($$0 -> apu.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"target")))));
    }

    private static int a(ed $$0, String $$1) throws CommandSyntaxException {
        if (!InetAddresses.isInetAddress((String)$$1)) {
            throw a.create();
        }
        bbv $$2 = $$0.m().aj().g();
        if (!$$2.a($$1)) {
            throw b.create();
        }
        $$2.b($$1);
        $$0.a(() -> yh.a("commands.pardonip.success", new Object[]{$$1}), true);
        return 1;
    }
}

