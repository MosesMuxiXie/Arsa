/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Arrays;
import java.util.Locale;

public class arf {
    private static final float a = 10000.0f;
    private static final String b = String.valueOf(20);

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("tick").requires(ee.a(ee.e))).then(ee.b("query").executes($$0 -> arf.a((ed)$$0.getSource())))).then(ee.b("rate").then(ee.a("rate", FloatArgumentType.floatArg((float)1.0f, (float)10000.0f)).suggests(($$0, $$1) -> ei.a(new String[]{b}, $$1)).executes($$0 -> arf.a((ed)$$0.getSource(), FloatArgumentType.getFloat((CommandContext)$$0, (String)"rate")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("step").executes($$0 -> arf.b((ed)$$0.getSource(), 1))).then(ee.b("stop").executes($$0 -> arf.b((ed)$$0.getSource())))).then(ee.a("time", fu.a(1)).suggests(($$0, $$1) -> ei.a(new String[]{"1t", "1s"}, $$1)).executes($$0 -> arf.b((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time")))))).then(((LiteralArgumentBuilder)ee.b("sprint").then(ee.b("stop").executes($$0 -> arf.c((ed)$$0.getSource())))).then(ee.a("time", fu.a(1)).suggests(($$0, $$1) -> ei.a(new String[]{"60s", "1d", "3d"}, $$1)).executes($$0 -> arf.a((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time")))))).then(ee.b("unfreeze").executes($$0 -> arf.a((ed)$$0.getSource(), false)))).then(ee.b("freeze").executes($$0 -> arf.a((ed)$$0.getSource(), true))));
    }

    private static String a(long $$0) {
        return String.format(Locale.ROOT, "%.1f", Float.valueOf((float)$$0 / (float)bhn.b));
    }

    private static int a(ed $$0, float $$1) {
        ann $$2 = $$0.m().aR();
        $$2.a($$1);
        String $$3 = String.format(Locale.ROOT, "%.1f", Float.valueOf($$1));
        $$0.a(() -> yh.a("commands.tick.rate.success", new Object[]{$$3}), true);
        return (int)$$1;
    }

    private static int a(ed $$0) {
        ann $$1 = $$0.m().aR();
        String $$2 = arf.a($$0.m().aS());
        float $$3 = $$1.f();
        String $$4 = String.format(Locale.ROOT, "%.1f", Float.valueOf($$3));
        if ($$1.a()) {
            $$0.a(() -> yh.c("commands.tick.status.sprinting"), false);
            $$0.a(() -> yh.a("commands.tick.query.rate.sprinting", new Object[]{$$4, $$2}), false);
        } else {
            if ($$1.l()) {
                $$0.a(() -> yh.c("commands.tick.status.frozen"), false);
            } else if ($$1.h() < $$0.m().aS()) {
                $$0.a(() -> yh.c("commands.tick.status.lagging"), false);
            } else {
                $$0.a(() -> yh.c("commands.tick.status.running"), false);
            }
            String $$5 = arf.a($$1.h());
            $$0.a(() -> yh.a("commands.tick.query.rate.running", new Object[]{$$4, $$2, $$5}), false);
        }
        long[] $$6 = Arrays.copyOf($$0.m().aT(), $$0.m().aT().length);
        Arrays.sort($$6);
        String $$7 = arf.a($$6[$$6.length / 2]);
        String $$8 = arf.a($$6[(int)((double)$$6.length * 0.95)]);
        String $$9 = arf.a($$6[(int)((double)$$6.length * 0.99)]);
        $$0.a(() -> yh.a("commands.tick.query.percentiles", new Object[]{$$7, $$8, $$9, $$6.length}), false);
        return (int)$$3;
    }

    private static int a(ed $$0, int $$1) {
        boolean $$2 = $$0.m().aR().b($$1);
        if ($$2) {
            $$0.a(() -> yh.c("commands.tick.sprint.stop.success"), true);
        }
        $$0.a(() -> yh.c("commands.tick.status.sprinting"), true);
        return 1;
    }

    private static int a(ed $$0, boolean $$1) {
        ann $$2 = $$0.m().aR();
        if ($$1) {
            if ($$2.a()) {
                $$2.c();
            }
            if ($$2.j()) {
                $$2.b();
            }
        }
        $$2.a($$1);
        if ($$1) {
            $$0.a(() -> yh.c("commands.tick.status.frozen"), true);
        } else {
            $$0.a(() -> yh.c("commands.tick.status.running"), true);
        }
        return $$1 ? 1 : 0;
    }

    private static int b(ed $$0, int $$1) {
        ann $$2 = $$0.m().aR();
        boolean $$3 = $$2.a($$1);
        if ($$3) {
            $$0.a(() -> yh.a("commands.tick.step.success", $$1), true);
        } else {
            $$0.b(yh.c("commands.tick.step.fail"));
        }
        return 1;
    }

    private static int b(ed $$0) {
        ann $$1 = $$0.m().aR();
        boolean $$2 = $$1.b();
        if ($$2) {
            $$0.a(() -> yh.c("commands.tick.step.stop.success"), true);
            return 1;
        }
        $$0.b(yh.c("commands.tick.step.stop.fail"));
        return 0;
    }

    private static int c(ed $$0) {
        ann $$1 = $$0.m().aR();
        boolean $$2 = $$1.c();
        if ($$2) {
            $$0.a(() -> yh.c("commands.tick.sprint.stop.success"), true);
            return 1;
        }
        $$0.b(yh.c("commands.tick.sprint.stop.fail"));
        return 0;
    }
}

