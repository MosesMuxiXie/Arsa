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

public class aom {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.deop.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("deop").requires(ee.a(ee.e))).then(ee.a("targets", es.a()).suggests(($$0, $$1) -> ei.a(((ed)$$0.getSource()).m().aj().l(), $$1)).executes($$0 -> aom.a((ed)$$0.getSource(), es.a((CommandContext<ed>)$$0, "targets")))));
    }

    private static int a(ed $$0, Collection<bbx> $$1) throws CommandSyntaxException {
        bbz $$2 = $$0.m().aj();
        int $$3 = 0;
        for (bbx $$4 : $$1) {
            if (!$$2.f($$4)) continue;
            $$2.e($$4);
            ++$$3;
            $$0.a(() -> yh.a("commands.deop.success", new Object[]{((bbx)$$1.iterator().next()).b()}), true);
        }
        if ($$3 == 0) {
            throw a.create();
        }
        $$0.m().aD();
        return $$3;
    }
}

