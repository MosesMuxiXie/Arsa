/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.List;

public class ari {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.transfer.error.no_players"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("transfer").requires(ee.a(ee.e))).then(((RequiredArgumentBuilder)ee.a("hostname", StringArgumentType.string()).executes($$0 -> ari.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"hostname"), 25565, List.of(((ed)$$0.getSource()).i())))).then(((RequiredArgumentBuilder)ee.a("port", IntegerArgumentType.integer((int)1, (int)65535)).executes($$0 -> ari.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"hostname"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"port"), List.of(((ed)$$0.getSource()).i())))).then(ee.a("players", eq.d()).executes($$0 -> ari.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"hostname"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"port"), eq.f((CommandContext<ed>)$$0, "players")))))));
    }

    private static int a(ed $$0, String $$1, int $$2, Collection<axg> $$3) throws CommandSyntaxException {
        if ($$3.isEmpty()) {
            throw a.create();
        }
        for (axg $$4 : $$3) {
            $$4.g.b(new abs($$1, $$2));
        }
        if ($$3.size() == 1) {
            $$0.a(() -> yh.a("commands.transfer.success.single", ((axg)$$3.iterator().next()).R_(), $$1, $$2), true);
        } else {
            $$0.a(() -> yh.a("commands.transfer.success.multiple", $$3.size(), $$1, $$2), true);
        }
        return $$3.size();
    }
}

