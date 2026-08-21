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

public class arn {
    private static final int a = -1;

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("weather").requires(ee.a(ee.d))).then(((LiteralArgumentBuilder)ee.b("clear").executes($$0 -> arn.a((ed)$$0.getSource(), -1))).then(ee.a("duration", fu.a(1)).executes($$0 -> arn.a((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"duration")))))).then(((LiteralArgumentBuilder)ee.b("rain").executes($$0 -> arn.b((ed)$$0.getSource(), -1))).then(ee.a("duration", fu.a(1)).executes($$0 -> arn.b((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"duration")))))).then(((LiteralArgumentBuilder)ee.b("thunder").executes($$0 -> arn.c((ed)$$0.getSource(), -1))).then(ee.a("duration", fu.a(1)).executes($$0 -> arn.c((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"duration"))))));
    }

    private static int a(ed $$0, int $$1, cch $$2) {
        if ($$1 == -1) {
            return $$2.a($$0.m().N().G_());
        }
        return $$1;
    }

    private static int a(ed $$0, int $$1) {
        $$0.m().N().a(arn.a($$0, $$1, axf.b), 0, false, false);
        $$0.a(() -> yh.c("commands.weather.set.clear"), true);
        return $$1;
    }

    private static int b(ed $$0, int $$1) {
        $$0.m().N().a(0, arn.a($$0, $$1, axf.c), true, false);
        $$0.a(() -> yh.c("commands.weather.set.rain"), true);
        return $$1;
    }

    private static int c(ed $$0, int $$1) {
        $$0.m().N().a(0, arn.a($$0, $$1, axf.d), true, true);
        $$0.a(() -> yh.c("commands.weather.set.thunder"), true);
        return $$1;
    }
}

