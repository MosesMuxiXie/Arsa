/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;

public class arp {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.worldborder.center.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.worldborder.set.failed.nochange"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.worldborder.set.failed.small"));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.a("commands.worldborder.set.failed.big", 5.9999968E7));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.a("commands.worldborder.set.failed.far", 2.9999984E7));
    private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType((Message)yh.c("commands.worldborder.warning.time.failed"));
    private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType((Message)yh.c("commands.worldborder.warning.distance.failed"));
    private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType((Message)yh.c("commands.worldborder.damage.buffer.failed"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)yh.c("commands.worldborder.damage.amount.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("worldborder").requires(ee.a(ee.d))).then(ee.b("add").then(((RequiredArgumentBuilder)ee.a("distance", DoubleArgumentType.doubleArg((double)-5.9999968E7, (double)5.9999968E7)).executes($$0 -> arp.a((ed)$$0.getSource(), ((ed)$$0.getSource()).f().w().j() + DoubleArgumentType.getDouble((CommandContext)$$0, (String)"distance"), 0L))).then(ee.a("time", fu.a(0)).executes($$0 -> arp.a((ed)$$0.getSource(), ((ed)$$0.getSource()).f().w().j() + DoubleArgumentType.getDouble((CommandContext)$$0, (String)"distance"), ((ed)$$0.getSource()).f().w().k() + (long)IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time"))))))).then(ee.b("set").then(((RequiredArgumentBuilder)ee.a("distance", DoubleArgumentType.doubleArg((double)-5.9999968E7, (double)5.9999968E7)).executes($$0 -> arp.a((ed)$$0.getSource(), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"distance"), 0L))).then(ee.a("time", fu.a(0)).executes($$0 -> arp.a((ed)$$0.getSource(), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"distance"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time"))))))).then(ee.b("center").then(ee.a("pos", gi.a()).executes($$0 -> arp.a((ed)$$0.getSource(), gi.a((CommandContext<ed>)$$0, "pos")))))).then(((LiteralArgumentBuilder)ee.b("damage").then(ee.b("amount").then(ee.a("damagePerBlock", FloatArgumentType.floatArg((float)0.0f)).executes($$0 -> arp.b((ed)$$0.getSource(), FloatArgumentType.getFloat((CommandContext)$$0, (String)"damagePerBlock")))))).then(ee.b("buffer").then(ee.a("distance", FloatArgumentType.floatArg((float)0.0f)).executes($$0 -> arp.a((ed)$$0.getSource(), FloatArgumentType.getFloat((CommandContext)$$0, (String)"distance"))))))).then(ee.b("get").executes($$0 -> arp.a((ed)$$0.getSource())))).then(((LiteralArgumentBuilder)ee.b("warning").then(ee.b("distance").then(ee.a("distance", IntegerArgumentType.integer((int)0)).executes($$0 -> arp.b((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"distance")))))).then(ee.b("time").then(ee.a("time", fu.a(0)).executes($$0 -> arp.a((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"time")))))));
    }

    private static int a(ed $$0, float $$1) throws CommandSyntaxException {
        eqa $$2 = $$0.f().w();
        if ($$2.o() == (double)$$1) {
            throw h.create();
        }
        $$2.b((double)$$1);
        $$0.a(() -> yh.a("commands.worldborder.damage.buffer.success", new Object[]{String.format(Locale.ROOT, "%.2f", Float.valueOf($$1))}), true);
        return (int)$$1;
    }

    private static int b(ed $$0, float $$1) throws CommandSyntaxException {
        eqa $$2 = $$0.f().w();
        if ($$2.p() == (double)$$1) {
            throw i.create();
        }
        $$2.c((double)$$1);
        $$0.a(() -> yh.a("commands.worldborder.damage.amount.success", new Object[]{String.format(Locale.ROOT, "%.2f", Float.valueOf($$1))}), true);
        return (int)$$1;
    }

    private static int a(ed $$0, int $$1) throws CommandSyntaxException {
        eqa $$2 = $$0.f().w();
        if ($$2.r() == $$1) {
            throw f.create();
        }
        $$2.b($$1);
        $$0.a(() -> yh.a("commands.worldborder.warning.time.success", new Object[]{arp.a((long)$$1)}), true);
        return $$1;
    }

    private static int b(ed $$0, int $$1) throws CommandSyntaxException {
        eqa $$2 = $$0.f().w();
        if ($$2.s() == $$1) {
            throw g.create();
        }
        $$2.c($$1);
        $$0.a(() -> yh.a("commands.worldborder.warning.distance.success", $$1), true);
        return $$1;
    }

    private static int a(ed $$0) {
        double $$1 = $$0.f().w().j();
        $$0.a(() -> yh.a("commands.worldborder.get", new Object[]{String.format(Locale.ROOT, "%.0f", $$1)}), false);
        return bgj.c($$1 + 0.5);
    }

    private static int a(ed $$0, ftl $$1) throws CommandSyntaxException {
        eqa $$2 = $$0.f().w();
        if ($$2.h() == (double)$$1.j && $$2.i() == (double)$$1.k) {
            throw a.create();
        }
        if ((double)Math.abs($$1.j) > 2.9999984E7 || (double)Math.abs($$1.k) > 2.9999984E7) {
            throw e.create();
        }
        $$2.c($$1.j, $$1.k);
        $$0.a(() -> yh.a("commands.worldborder.center.success", new Object[]{String.format(Locale.ROOT, "%.2f", Float.valueOf($$0.j)), String.format(Locale.ROOT, "%.2f", Float.valueOf($$0.k))}), true);
        return 0;
    }

    private static int a(ed $$0, double $$1, long $$2) throws CommandSyntaxException {
        axf $$3 = $$0.f();
        eqa $$4 = $$3.w();
        double $$5 = $$4.j();
        if ($$5 == $$1) {
            throw b.create();
        }
        if ($$1 < 1.0) {
            throw c.create();
        }
        if ($$1 > 5.9999968E7) {
            throw d.create();
        }
        String $$6 = String.format(Locale.ROOT, "%.1f", $$1);
        if ($$2 > 0L) {
            $$4.a($$5, $$1, $$2, $$3.au());
            if ($$1 > $$5) {
                $$0.a(() -> yh.a("commands.worldborder.set.grow", new Object[]{$$6, arp.a($$2)}), true);
            } else {
                $$0.a(() -> yh.a("commands.worldborder.set.shrink", new Object[]{$$6, arp.a($$2)}), true);
            }
        } else {
            $$4.a($$1);
            $$0.a(() -> yh.a("commands.worldborder.set.immediate", new Object[]{$$6}), true);
        }
        return (int)($$1 - $$5);
    }

    private static String a(long $$0) {
        return String.format(Locale.ROOT, "%.2f", (double)$$0 / 20.0);
    }
}

