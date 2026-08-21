/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import net.minecraft.server.MinecraftServer;

public class aqy {
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("commands.stopwatch.already_exists", $$0));
    public static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("commands.stopwatch.does_not_exist", $$0));
    public static final SuggestionProvider<ed> b = ($$0, $$1) -> ei.a(((ed)$$0.getSource()).m().aM().b(), $$1);

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("stopwatch").requires(ee.a(ee.d))).then(ee.b("create").then(ee.a("id", ev.a()).executes($$0 -> aqy.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "id")))))).then(ee.b("query").then(((RequiredArgumentBuilder)ee.a("id", ev.a()).suggests(b).then(ee.a("scale", DoubleArgumentType.doubleArg()).executes($$0 -> aqy.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "id"), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"scale"))))).executes($$0 -> aqy.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "id"), 1.0))))).then(ee.b("restart").then(ee.a("id", ev.a()).suggests(b).executes($$0 -> aqy.b((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "id")))))).then(ee.b("remove").then(ee.a("id", ev.a()).suggests(b).executes($$0 -> aqy.c((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "id"))))));
    }

    private static int a(ed $$0, amo $$1) throws CommandSyntaxException {
        cdm $$4;
        MinecraftServer $$2 = $$0.m();
        cdn $$3 = $$2.aM();
        if (!$$3.a($$1, $$4 = new cdm(cdn.c()))) {
            throw c.create((Object)$$1);
        }
        $$0.a(() -> yh.a("commands.stopwatch.create.success", yh.a($$1)), true);
        return 1;
    }

    private static int a(ed $$0, amo $$1, double $$2) throws CommandSyntaxException {
        MinecraftServer $$3 = $$0.m();
        cdn $$4 = $$3.aM();
        cdm $$5 = $$4.a($$1);
        if ($$5 == null) {
            throw a.create((Object)$$1);
        }
        long $$6 = cdn.c();
        double $$7 = $$5.b($$6);
        $$0.a(() -> yh.a("commands.stopwatch.query", yh.a($$1), $$7), true);
        return (int)($$7 * $$2);
    }

    private static int b(ed $$02, amo $$1) throws CommandSyntaxException {
        MinecraftServer $$2 = $$02.m();
        cdn $$3 = $$2.aM();
        if (!$$3.a($$1, $$0 -> new cdm(cdn.c()))) {
            throw a.create((Object)$$1);
        }
        $$02.a(() -> yh.a("commands.stopwatch.restart.success", yh.a($$1)), true);
        return 1;
    }

    private static int c(ed $$0, amo $$1) throws CommandSyntaxException {
        MinecraftServer $$2 = $$0.m();
        cdn $$3 = $$2.aM();
        if (!$$3.b($$1)) {
            throw a.create((Object)$$1);
        }
        $$0.a(() -> yh.a("commands.stopwatch.remove.success", yh.a($$1)), true);
        return 1;
    }
}

