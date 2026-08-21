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
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import org.jspecify.annotations.Nullable;

public class aqu {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.spectate.self"));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("commands.spectate.not_spectator", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("commands.spectate.cannot_spectate", $$0));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("spectate").requires(ee.a(ee.d))).executes($$0 -> aqu.a((ed)$$0.getSource(), null, ((ed)$$0.getSource()).i()))).then(((RequiredArgumentBuilder)ee.a("target", eq.a()).executes($$0 -> aqu.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), ((ed)$$0.getSource()).i()))).then(ee.a("player", eq.c()).executes($$0 -> aqu.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), eq.e((CommandContext<ed>)$$0, "player"))))));
    }

    private static int a(ed $$0, @Nullable cgk $$1, axg $$2) throws CommandSyntaxException {
        if ($$2 == $$1) {
            throw a.create();
        }
        if (!$$2.au()) {
            throw b.create((Object)$$2.R_());
        }
        if ($$1 != null && $$1.ay().o() == 0) {
            throw c.create((Object)$$1.R_());
        }
        $$2.d($$1);
        if ($$1 != null) {
            $$0.a(() -> yh.a("commands.spectate.success.started", $$1.R_()), false);
        } else {
            $$0.a(() -> yh.c("commands.spectate.success.stopped"), false);
        }
        return 1;
    }
}

