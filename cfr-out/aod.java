/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.InetAddresses
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class aod {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.banip.invalid"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.banip.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("ban-ip").requires(ee.a(ee.e))).then(((RequiredArgumentBuilder)ee.a("target", StringArgumentType.word()).executes($$0 -> aod.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"target"), null))).then(ee.a("reason", ew.a()).executes($$0 -> aod.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"target"), ew.a((CommandContext<ed>)$$0, "reason"))))));
    }

    private static int a(ed $$0, String $$1, @Nullable yh $$2) throws CommandSyntaxException {
        if (InetAddresses.isInetAddress((String)$$1)) {
            return aod.b($$0, $$1, $$2);
        }
        axg $$3 = $$0.m().aj().a($$1);
        if ($$3 != null) {
            return aod.b($$0, $$3.D(), $$2);
        }
        throw a.create();
    }

    private static int b(ed $$0, String $$1, @Nullable yh $$2) throws CommandSyntaxException {
        bbv $$3 = $$0.m().aj().g();
        if ($$3.a($$1)) {
            throw b.create();
        }
        List<axg> $$4 = $$0.m().aj().b($$1);
        bbw $$5 = new bbw($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
        $$3.a($$5);
        $$0.a(() -> yh.a("commands.banip.success", new Object[]{$$1, $$5.e()}), true);
        if (!$$4.isEmpty()) {
            $$0.a(() -> yh.a("commands.banip.info", $$4.size(), gv.a($$4)), true);
        }
        for (axg $$6 : $$4) {
            $$6.g.a(yh.c("multiplayer.disconnect.ip_banned"));
        }
        return $$4.size();
    }
}

