/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.HexFormat;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class arm {
    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("waypoint").requires(ee.a(ee.d))).then(ee.b("list").executes($$0 -> arm.a((ed)$$0.getSource())))).then(ee.b("modify").then(((RequiredArgumentBuilder)ee.a("waypoint", eq.a()).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("color").then(ee.a("color", el.a()).executes($$0 -> arm.a((ed)$$0.getSource(), fw.a((CommandContext<ed>)$$0, "waypoint"), el.a((CommandContext<ed>)$$0, "color"))))).then(ee.b("hex").then(ee.a("color", eu.a()).executes($$0 -> arm.a((ed)$$0.getSource(), fw.a((CommandContext<ed>)$$0, "waypoint"), eu.a((CommandContext<ed>)$$0, "color")))))).then(ee.b("reset").executes($$0 -> arm.a((ed)$$0.getSource(), fw.a((CommandContext<ed>)$$0, "waypoint")))))).then(((LiteralArgumentBuilder)ee.b("style").then(ee.b("reset").executes($$0 -> arm.a((ed)$$0.getSource(), fw.a((CommandContext<ed>)$$0, "waypoint"), fvw.b)))).then(ee.b("set").then(ee.a("style", ev.a()).executes($$0 -> arm.a((ed)$$0.getSource(), fw.a((CommandContext<ed>)$$0, "waypoint"), amt.a(fvw.a, ev.a((CommandContext<ed>)$$0, "style"))))))))));
    }

    private static int a(ed $$0, fvx $$12, amt<fvv> $$2) {
        arm.a($$0, $$12, (fvt.a $$1) -> {
            $$1.d = $$2;
        });
        $$0.a(() -> yh.c("commands.waypoint.modify.style"), false);
        return 0;
    }

    private static int a(ed $$0, fvx $$12, l $$2) {
        arm.a($$0, $$12, (fvt.a $$1) -> {
            $$1.e = Optional.of($$2.f());
        });
        $$0.a(() -> yh.a("commands.waypoint.modify.color", yh.b($$2.g()).a($$2)), false);
        return 0;
    }

    private static int a(ed $$0, fvx $$12, Integer $$2) {
        arm.a($$0, $$12, (fvt.a $$1) -> {
            $$1.e = Optional.of($$2);
        });
        $$0.a(() -> yh.a("commands.waypoint.modify.color", yh.b(HexFormat.of().withUpperCase().toHexDigits(bel.f(0, $$2), 6)).b($$2)), false);
        return 0;
    }

    private static int a(ed $$02, fvx $$1) {
        arm.a($$02, $$1, (fvt.a $$0) -> {
            $$0.e = Optional.empty();
        });
        $$02.a(() -> yh.c("commands.waypoint.modify.color.reset"), false);
        return 0;
    }

    private static int a(ed $$0) {
        axf $$12 = $$0.f();
        Set<fvx> $$2 = $$12.j().b();
        String $$3 = $$12.aq().a().toString();
        if ($$2.isEmpty()) {
            $$0.a(() -> yh.a("commands.waypoint.list.empty", new Object[]{$$3}), false);
            return 0;
        }
        yh $$4 = yk.b($$2.stream().map($$1 -> {
            if ($$1 instanceof chl) {
                chl $$2 = (chl)$$1;
                is $$32 = $$2.dK();
                return $$2.hH().f().a($$3 -> $$3.a(new yf.i("/execute in " + $$3 + " run tp @s " + $$32.u() + " " + $$32.v() + " " + $$32.w())).a(new yo.e(yh.c("chat.coordinates.tooltip"))).a($$2.gy().e.orElse(-1)));
            }
            return yh.b($$1.toString());
        }).toList(), Function.identity());
        $$0.a(() -> yh.a("commands.waypoint.list.success", $$2.size(), $$3, $$4), false);
        return $$2.size();
    }

    private static void a(ed $$0, fvx $$1, Consumer<fvt.a> $$2) {
        axf $$3 = $$0.f();
        $$3.j().c($$1);
        $$2.accept($$1.gy());
        $$3.j().a($$1);
    }
}

