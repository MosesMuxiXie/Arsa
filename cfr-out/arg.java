/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class arg {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("time").requires(ee.a(ee.d))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("set").then(ee.b("day").executes($$0 -> arg.a((ed)$$0.getSource(), 1000)))).then(ee.b("noon").executes($$0 -> arg.a((ed)$$0.getSource(), 6000)))).then(ee.b("night").executes($$0 -> arg.a((ed)$$0.getSource(), 13000)))).then(ee.b("midnight").executes($$0 -> arg.a((ed)$$0.getSource(), 18000)))).then(ee.a("time", fu.a()).executes($$0 -> arg.a((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time")))))).then(ee.b("add").then(ee.a("time", fu.a()).executes($$0 -> arg.b((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("query").then(ee.b("daytime").executes($$0 -> arg.c((ed)$$0.getSource(), arg.a(((ed)$$0.getSource()).f()))))).then(ee.b("gametime").executes($$0 -> arg.c((ed)$$0.getSource(), (int)(((ed)$$0.getSource()).f().au() % Integer.MAX_VALUE))))).then(ee.b("day").executes($$0 -> arg.c((ed)$$0.getSource(), (int)(((ed)$$0.getSource()).f().e() % Integer.MAX_VALUE))))));
    }

    private static int a(axf $$0) {
        return (int)($$0.al() % 24000L);
    }

    private static int c(ed $$0, int $$1) {
        $$0.a(() -> yh.a("commands.time.query", $$1), false);
        return $$1;
    }

    public static int a(ed $$0, int $$1) {
        for (axf $$2 : $$0.m().P()) {
            $$2.b((long)$$1);
        }
        $$0.m().L();
        $$0.a(() -> yh.a("commands.time.set", $$1), true);
        return arg.a($$0.f());
    }

    public static int b(ed $$0, int $$1) {
        for (axf $$2 : $$0.m().P()) {
            $$2.b($$2.al() + (long)$$1);
        }
        $$0.m().L();
        int $$3 = arg.a($$0.f());
        $$0.a(() -> yh.a("commands.time.set", $$3), true);
        return $$3;
    }
}

