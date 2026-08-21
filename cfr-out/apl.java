/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apl {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.kick.owner.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.kick.singleplayer.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("kick").requires(ee.a(ee.e))).then(((RequiredArgumentBuilder)ee.a("targets", eq.d()).executes($$0 -> apl.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), yh.c("multiplayer.disconnect.kicked")))).then(ee.a("reason", ew.a()).executes($$0 -> apl.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), ew.a((CommandContext<ed>)$$0, "reason"))))));
    }

    private static int a(ed $$0, Collection<axg> $$1, yh $$2) throws CommandSyntaxException {
        if (!$$0.m().q()) {
            throw b.create();
        }
        int $$3 = 0;
        for (axg $$4 : $$1) {
            if ($$0.m().a($$4.gJ())) continue;
            $$4.g.a($$2);
            $$0.a(() -> yh.a("commands.kick.success", $$4.R_(), $$2), true);
            ++$$3;
        }
        if ($$3 == 0) {
            throw a.create();
        }
        return $$3;
    }
}

