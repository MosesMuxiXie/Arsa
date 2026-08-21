/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aps {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.op.failed"));

    public static void a(CommandDispatcher<ed> $$03) {
        $$03.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("op").requires(ee.a(ee.e))).then(ee.a("targets", es.a()).suggests(($$02, $$12) -> {
            bbz $$2 = ((ed)$$02.getSource()).m().aj();
            return ei.b($$2.t().stream().filter($$1 -> !$$2.f($$1.gJ())).map($$0 -> $$0.gI().name()), $$12);
        }).executes($$0 -> aps.a((ed)$$0.getSource(), es.a((CommandContext<ed>)$$0, "targets")))));
    }

    private static int a(ed $$0, Collection<bbx> $$1) throws CommandSyntaxException {
        bbz $$2 = $$0.m().aj();
        int $$3 = 0;
        for (bbx $$4 : $$1) {
            if ($$2.f($$4)) continue;
            $$2.d($$4);
            ++$$3;
            $$0.a(() -> yh.a("commands.op.success", new Object[]{$$4.b()}), true);
        }
        if ($$3 == 0) {
            throw a.create();
        }
        return $$3;
    }
}

