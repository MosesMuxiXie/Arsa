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
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.stream.Stream;

public class aoc {
    private static final DynamicCommandExceptionType a = new DynamicCommandExceptionType($$0 -> yh.b("commands.attribute.failed.entity", $$0));
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.attribute.failed.no_attribute", $$0, $$1));
    private static final Dynamic3CommandExceptionType c = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> yh.b("commands.attribute.failed.no_modifier", $$1, $$0, $$2));
    private static final Dynamic3CommandExceptionType d = new Dynamic3CommandExceptionType(($$0, $$1, $$2) -> yh.b("commands.attribute.failed.modifier_already_present", $$2, $$1, $$0));

    public static void a(CommandDispatcher<ed> $$02, dz $$12) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("attribute").requires(ee.a(ee.d))).then(ee.a("target", eq.a()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("attribute", fe.a($$12, mj.c)).then(((LiteralArgumentBuilder)ee.b("get").executes($$0 -> aoc.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), 1.0))).then(ee.a("scale", DoubleArgumentType.doubleArg()).executes($$0 -> aoc.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"scale")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("base").then(ee.b("set").then(ee.a("value", DoubleArgumentType.doubleArg()).executes($$0 -> aoc.c((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"value")))))).then(((LiteralArgumentBuilder)ee.b("get").executes($$0 -> aoc.b((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), 1.0))).then(ee.a("scale", DoubleArgumentType.doubleArg()).executes($$0 -> aoc.b((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"scale")))))).then(ee.b("reset").executes($$0 -> aoc.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("modifier").then(ee.b("add").then(ee.a("id", ev.a()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("value", DoubleArgumentType.doubleArg()).then(ee.b("add_value").executes($$0 -> aoc.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), ev.a((CommandContext<ed>)$$0, "id"), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"value"), ciq.a.a)))).then(ee.b("add_multiplied_base").executes($$0 -> aoc.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), ev.a((CommandContext<ed>)$$0, "id"), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"value"), ciq.a.b)))).then(ee.b("add_multiplied_total").executes($$0 -> aoc.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), ev.a((CommandContext<ed>)$$0, "id"), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"value"), ciq.a.c))))))).then(ee.b("remove").then(ee.a("id", ev.a()).suggests(($$0, $$1) -> ei.a(aoc.c(eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute")), $$1)).executes($$0 -> aoc.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), ev.a((CommandContext<ed>)$$0, "id")))))).then(ee.b("value").then(ee.b("get").then(((RequiredArgumentBuilder)ee.a("id", ev.a()).suggests(($$0, $$1) -> ei.a(aoc.c(eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute")), $$1)).executes($$0 -> aoc.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), ev.a((CommandContext<ed>)$$0, "id"), 1.0))).then(ee.a("scale", DoubleArgumentType.doubleArg()).executes($$0 -> aoc.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), fe.a((CommandContext<ed>)$$0, "attribute"), ev.a((CommandContext<ed>)$$0, "id"), DoubleArgumentType.getDouble((CommandContext)$$0, (String)"scale")))))))))));
    }

    private static cio a(cgk $$0, jd<cin> $$1) throws CommandSyntaxException {
        cio $$2 = aoc.a($$0).fw().a($$1);
        if ($$2 == null) {
            throw b.create((Object)$$0.ap(), (Object)aoc.a($$1));
        }
        return $$2;
    }

    private static chl a(cgk $$0) throws CommandSyntaxException {
        if (!($$0 instanceof chl)) {
            throw a.create((Object)$$0.ap());
        }
        return (chl)$$0;
    }

    private static chl b(cgk $$0, jd<cin> $$1) throws CommandSyntaxException {
        chl $$2 = aoc.a($$0);
        if (!$$2.fw().b($$1)) {
            throw b.create((Object)$$0.ap(), (Object)aoc.a($$1));
        }
        return $$2;
    }

    private static int a(ed $$0, cgk $$1, jd<cin> $$2, double $$3) throws CommandSyntaxException {
        chl $$4 = aoc.b($$1, $$2);
        double $$5 = $$4.i($$2);
        $$0.a(() -> yh.a("commands.attribute.value.get.success", aoc.a($$2), $$1.ap(), $$5), false);
        return (int)($$5 * $$3);
    }

    private static int b(ed $$0, cgk $$1, jd<cin> $$2, double $$3) throws CommandSyntaxException {
        chl $$4 = aoc.b($$1, $$2);
        double $$5 = $$4.j($$2);
        $$0.a(() -> yh.a("commands.attribute.base_value.get.success", aoc.a($$2), $$1.ap(), $$5), false);
        return (int)($$5 * $$3);
    }

    private static int a(ed $$0, cgk $$1, jd<cin> $$2, amo $$3, double $$4) throws CommandSyntaxException {
        chl $$5 = aoc.b($$1, $$2);
        cip $$6 = $$5.fw();
        if (!$$6.a($$2, $$3)) {
            throw c.create((Object)$$1.ap(), (Object)aoc.a($$2), (Object)$$3);
        }
        double $$7 = $$6.b($$2, $$3);
        $$0.a(() -> yh.a("commands.attribute.modifier.value.get.success", yh.a($$3), aoc.a($$2), $$1.ap(), $$7), false);
        return (int)($$7 * $$4);
    }

    private static Stream<amo> c(cgk $$0, jd<cin> $$1) throws CommandSyntaxException {
        cio $$2 = aoc.a($$0, $$1);
        return $$2.c().stream().map(ciq::a);
    }

    private static int c(ed $$0, cgk $$1, jd<cin> $$2, double $$3) throws CommandSyntaxException {
        aoc.a($$1, $$2).a($$3);
        $$0.a(() -> yh.a("commands.attribute.base_value.set.success", aoc.a($$2), $$1.ap(), $$3), false);
        return 1;
    }

    private static int a(ed $$0, cgk $$1, jd<cin> $$2) throws CommandSyntaxException {
        chl $$3 = aoc.a($$1);
        if (!$$3.fw().e($$2)) {
            throw b.create((Object)$$1.ap(), (Object)aoc.a($$2));
        }
        double $$4 = $$3.j($$2);
        $$0.a(() -> yh.a("commands.attribute.base_value.reset.success", aoc.a($$2), $$1.ap(), $$4), false);
        return 1;
    }

    private static int a(ed $$0, cgk $$1, jd<cin> $$2, amo $$3, double $$4, ciq.a $$5) throws CommandSyntaxException {
        cio $$6 = aoc.a($$1, $$2);
        ciq $$7 = new ciq($$3, $$4, $$5);
        if ($$6.b($$3)) {
            throw d.create((Object)$$1.ap(), (Object)aoc.a($$2), (Object)$$3);
        }
        $$6.d($$7);
        $$0.a(() -> yh.a("commands.attribute.modifier.add.success", yh.a($$3), aoc.a($$2), $$1.ap()), false);
        return 1;
    }

    private static int a(ed $$0, cgk $$1, jd<cin> $$2, amo $$3) throws CommandSyntaxException {
        cio $$4 = aoc.a($$1, $$2);
        if ($$4.c($$3)) {
            $$0.a(() -> yh.a("commands.attribute.modifier.remove.success", yh.a($$3), aoc.a($$2), $$1.ap()), false);
            return 1;
        }
        throw c.create((Object)$$1.ap(), (Object)aoc.a($$2), (Object)$$3);
    }

    private static yh a(jd<cin> $$0) {
        return yh.c($$0.a().c());
    }
}

