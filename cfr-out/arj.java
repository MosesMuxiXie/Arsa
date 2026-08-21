/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class arj {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.trigger.failed.unprimed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.trigger.failed.invalid"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)ee.b("trigger").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("objective", ez.a()).suggests(($$0, $$1) -> arj.a((ed)$$0.getSource(), $$1)).executes($$0 -> arj.a((ed)$$0.getSource(), ((ed)$$0.getSource()).i(), ez.a((CommandContext<ed>)$$0, "objective")))).then(ee.b("add").then(ee.a("value", IntegerArgumentType.integer()).executes($$0 -> arj.a((ed)$$0.getSource(), ((ed)$$0.getSource()).i(), ez.a((CommandContext<ed>)$$0, "objective"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"value")))))).then(ee.b("set").then(ee.a("value", IntegerArgumentType.integer()).executes($$0 -> arj.b((ed)$$0.getSource(), ((ed)$$0.getSource()).i(), ez.a((CommandContext<ed>)$$0, "objective"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"value")))))));
    }

    public static CompletableFuture<Suggestions> a(ed $$0, SuggestionsBuilder $$1) {
        cgk $$2 = $$0.g();
        ArrayList $$3 = Lists.newArrayList();
        if ($$2 != null) {
            anm $$4 = $$0.m().aK();
            for (fuj $$5 : $$4.b()) {
                fun $$6;
                if ($$5.d() != fuu.d || ($$6 = $$4.d($$2, $$5)) == null || $$6.b()) continue;
                $$3.add($$5.c());
            }
        }
        return ei.b($$3, $$1);
    }

    private static int a(ed $$0, axg $$1, fuj $$2, int $$3) throws CommandSyntaxException {
        fup $$4 = arj.a($$0.m().aK(), (fuq)$$1, $$2);
        int $$5 = $$4.b($$3);
        $$0.a(() -> yh.a("commands.trigger.add.success", $$2.h(), $$3), true);
        return $$5;
    }

    private static int b(ed $$0, axg $$1, fuj $$2, int $$3) throws CommandSyntaxException {
        fup $$4 = arj.a($$0.m().aK(), (fuq)$$1, $$2);
        $$4.a($$3);
        $$0.a(() -> yh.a("commands.trigger.set.success", $$2.h(), $$3), true);
        return $$3;
    }

    private static int a(ed $$0, axg $$1, fuj $$2) throws CommandSyntaxException {
        fup $$3 = arj.a($$0.m().aK(), (fuq)$$1, $$2);
        int $$4 = $$3.b(1);
        $$0.a(() -> yh.a("commands.trigger.simple.success", $$2.h()), true);
        return $$4;
    }

    private static fup a(fur $$0, fuq $$1, fuj $$2) throws CommandSyntaxException {
        if ($$2.d() != fuu.d) {
            throw b.create();
        }
        fun $$3 = $$0.d($$1, $$2);
        if ($$3 == null || $$3.b()) {
            throw a.create();
        }
        fup $$4 = $$0.c($$1, $$2);
        $$4.f();
        return $$4;
    }
}

