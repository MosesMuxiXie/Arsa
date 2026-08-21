/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
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
import org.jspecify.annotations.Nullable;

public class aqb {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.random.error.range_too_large"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.random.error.range_too_small"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("random").then(aqb.a("value", false))).then(aqb.a("roll", true))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("reset").requires(ee.a(ee.d))).then(((LiteralArgumentBuilder)ee.b("*").executes($$0 -> aqb.a((ed)$$0.getSource()))).then(((RequiredArgumentBuilder)ee.a("seed", IntegerArgumentType.integer()).executes($$0 -> aqb.a((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seed"), true, true))).then(((RequiredArgumentBuilder)ee.a("includeWorldSeed", BoolArgumentType.bool()).executes($$0 -> aqb.a((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seed"), BoolArgumentType.getBool((CommandContext)$$0, (String)"includeWorldSeed"), true))).then(ee.a("includeSequenceId", BoolArgumentType.bool()).executes($$0 -> aqb.a((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seed"), BoolArgumentType.getBool((CommandContext)$$0, (String)"includeWorldSeed"), BoolArgumentType.getBool((CommandContext)$$0, (String)"includeSequenceId")))))))).then(((RequiredArgumentBuilder)ee.a("sequence", ev.a()).suggests(aqb::a).executes($$0 -> aqb.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "sequence")))).then(((RequiredArgumentBuilder)ee.a("seed", IntegerArgumentType.integer()).executes($$0 -> aqb.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "sequence"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seed"), true, true))).then(((RequiredArgumentBuilder)ee.a("includeWorldSeed", BoolArgumentType.bool()).executes($$0 -> aqb.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "sequence"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seed"), BoolArgumentType.getBool((CommandContext)$$0, (String)"includeWorldSeed"), true))).then(ee.a("includeSequenceId", BoolArgumentType.bool()).executes($$0 -> aqb.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "sequence"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seed"), BoolArgumentType.getBool((CommandContext)$$0, (String)"includeWorldSeed"), BoolArgumentType.getBool((CommandContext)$$0, (String)"includeSequenceId")))))))));
    }

    private static LiteralArgumentBuilder<ed> a(String $$0, boolean $$12) {
        return (LiteralArgumentBuilder)ee.b($$0).then(((RequiredArgumentBuilder)ee.a("range", fd.a()).executes($$1 -> aqb.a((ed)$$1.getSource(), fd.b.a((CommandContext<ed>)$$1, "range"), null, $$12))).then(((RequiredArgumentBuilder)ee.a("sequence", ev.a()).suggests(aqb::a).requires(ee.a(ee.d))).executes($$1 -> aqb.a((ed)$$1.getSource(), fd.b.a((CommandContext<ed>)$$1, "range"), ev.a((CommandContext<ed>)$$1, "sequence"), $$12))));
    }

    private static CompletableFuture<Suggestions> a(CommandContext<ed> $$0, SuggestionsBuilder $$12) {
        ArrayList $$22 = Lists.newArrayList();
        ((ed)$$0.getSource()).f().T().a(($$1, $$2) -> $$22.add($$1.toString()));
        return ei.b($$22, $$12);
    }

    private static int a(ed $$0, cq.d $$1, @Nullable amo $$2, boolean $$3) throws CommandSyntaxException {
        bgr $$5;
        if ($$2 != null) {
            bgr $$4 = $$0.f().a($$2);
        } else {
            $$5 = $$0.f().G_();
        }
        int $$6 = $$1.b().orElse(Integer.MIN_VALUE);
        int $$7 = $$1.c().orElse(Integer.MAX_VALUE);
        long $$8 = (long)$$7 - (long)$$6;
        if ($$8 == 0L) {
            throw b.create();
        }
        if ($$8 >= Integer.MAX_VALUE) {
            throw a.create();
        }
        int $$9 = bgj.b($$5, $$6, $$7);
        if ($$3) {
            $$0.m().aj().a(yh.a("commands.random.roll", $$0.b(), $$9, $$6, $$7), false);
        } else {
            $$0.a(() -> yh.a("commands.random.sample.success", $$9), false);
        }
        return $$9;
    }

    private static int a(ed $$0, amo $$1) throws CommandSyntaxException {
        axf $$2 = $$0.f();
        $$2.T().b($$1, $$2.J());
        $$0.a(() -> yh.a("commands.random.reset.success", yh.a($$1)), false);
        return 1;
    }

    private static int a(ed $$0, amo $$1, int $$2, boolean $$3, boolean $$4) throws CommandSyntaxException {
        axf $$5 = $$0.f();
        $$5.T().a($$1, $$5.J(), $$2, $$3, $$4);
        $$0.a(() -> yh.a("commands.random.reset.success", yh.a($$1)), false);
        return 1;
    }

    private static int a(ed $$0) {
        int $$1 = $$0.f().T().a();
        $$0.a(() -> yh.a("commands.random.reset.all.success", $$1), false);
        return $$1;
    }

    private static int a(ed $$0, int $$1, boolean $$2, boolean $$3) {
        cdi $$4 = $$0.f().T();
        $$4.a($$1, $$2, $$3);
        int $$5 = $$4.a();
        $$0.a(() -> yh.a("commands.random.reset.all.success", $$5), false);
        return $$5;
    }
}

