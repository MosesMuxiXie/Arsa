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
import java.util.Collections;

public class aqc {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.recipe.give.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.recipe.take.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("recipe").requires(ee.a(ee.d))).then(ee.b("give").then(((RequiredArgumentBuilder)ee.a("targets", eq.d()).then(ee.a("recipe", ff.a(mj.bK)).executes($$0 -> aqc.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), Collections.singleton(ff.d((CommandContext<ed>)$$0, "recipe")))))).then(ee.b("*").executes($$0 -> aqc.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), ((ed)$$0.getSource()).m().aJ().d())))))).then(ee.b("take").then(((RequiredArgumentBuilder)ee.a("targets", eq.d()).then(ee.a("recipe", ff.a(mj.bK)).executes($$0 -> aqc.b((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), Collections.singleton(ff.d((CommandContext<ed>)$$0, "recipe")))))).then(ee.b("*").executes($$0 -> aqc.b((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), ((ed)$$0.getSource()).m().aJ().d()))))));
    }

    private static int a(ed $$0, Collection<axg> $$1, Collection<dqx<?>> $$2) throws CommandSyntaxException {
        int $$3 = 0;
        for (axg $$4 : $$1) {
            $$3 += $$4.a($$2);
        }
        if ($$3 == 0) {
            throw a.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.recipe.give.success.single", $$2.size(), ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.recipe.give.success.multiple", $$2.size(), $$1.size()), true);
        }
        return $$3;
    }

    private static int b(ed $$0, Collection<axg> $$1, Collection<dqx<?>> $$2) throws CommandSyntaxException {
        int $$3 = 0;
        for (axg $$4 : $$1) {
            $$3 += $$4.b($$2);
        }
        if ($$3 == 0) {
            throw b.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.recipe.take.success.single", $$2.size(), ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.recipe.take.success.multiple", $$2.size(), $$1.size()), true);
        }
        return $$3;
    }
}

