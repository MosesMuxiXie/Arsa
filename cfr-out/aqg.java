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

public class aqg {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("rotate").requires(ee.a(ee.d))).then(((RequiredArgumentBuilder)ee.a("target", eq.a()).then(ee.a("rotation", gg.a()).executes($$0 -> aqg.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), gg.a((CommandContext<ed>)$$0, "rotation"))))).then(((LiteralArgumentBuilder)ee.b("facing").then(ee.b("entity").then(((RequiredArgumentBuilder)ee.a("facingEntity", eq.a()).executes($$0 -> aqg.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), new app.a(eq.a((CommandContext<ed>)$$0, "facingEntity"), ep.a.a)))).then(ee.a("facingAnchor", ep.a()).executes($$0 -> aqg.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), new app.a(eq.a((CommandContext<ed>)$$0, "facingEntity"), ep.a((CommandContext<ed>)$$0, "facingAnchor")))))))).then(ee.a("facingLocation", gj.a()).executes($$0 -> aqg.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), new app.b(gj.a((CommandContext<ed>)$$0, "facingLocation"))))))));
    }

    private static int a(ed $$0, cgk $$1, ge $$2) {
        ftl $$3 = $$2.b($$0);
        float $$4 = $$2.b() ? $$3.k - $$1.ec() : $$3.k;
        float $$5 = $$2.a() ? $$3.j - $$1.ee() : $$3.j;
        $$1.a($$4, $$2.b(), $$5, $$2.a());
        $$0.a(() -> yh.a("commands.rotate.success", $$1.R_()), true);
        return 1;
    }

    private static int a(ed $$0, cgk $$1, app $$2) {
        $$2.perform($$0, $$1);
        $$0.a(() -> yh.a("commands.rotate.success", $$1.R_()), true);
        return 1;
    }
}

