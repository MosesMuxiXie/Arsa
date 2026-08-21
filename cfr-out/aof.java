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
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class aof {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.ban.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("ban").requires(ee.a(ee.e))).then(((RequiredArgumentBuilder)ee.a("targets", es.a()).executes($$0 -> aof.a((ed)$$0.getSource(), es.a((CommandContext<ed>)$$0, "targets"), null))).then(ee.a("reason", ew.a()).executes($$0 -> aof.a((ed)$$0.getSource(), es.a((CommandContext<ed>)$$0, "targets"), ew.a((CommandContext<ed>)$$0, "reason"))))));
    }

    private static int a(ed $$0, Collection<bbx> $$1, @Nullable yh $$2) throws CommandSyntaxException {
        bcg $$3 = $$0.m().aj().f();
        int $$4 = 0;
        for (bbx $$5 : $$1) {
            if ($$3.a($$5)) continue;
            bch $$6 = new bch($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            ++$$4;
            $$0.a(() -> yh.a("commands.ban.success", yh.b($$5.b()), $$6.e()), true);
            axg $$7 = $$0.m().aj().b($$5.a());
            if ($$7 == null) continue;
            $$7.g.a(yh.c("multiplayer.disconnect.banned"));
        }
        if ($$4 == 0) {
            throw a.create();
        }
        return $$4;
    }
}

