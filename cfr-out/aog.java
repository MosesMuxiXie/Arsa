/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.Collections;

public class aog {
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("commands.bossbar.create.failed", $$0));
    private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> yh.b("commands.bossbar.unknown", $$0));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("commands.bossbar.set.players.unchanged"));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("commands.bossbar.set.name.unchanged"));
    private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType((Message)yh.c("commands.bossbar.set.color.unchanged"));
    private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType((Message)yh.c("commands.bossbar.set.style.unchanged"));
    private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType((Message)yh.c("commands.bossbar.set.value.unchanged"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)yh.c("commands.bossbar.set.max.unchanged"));
    private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType((Message)yh.c("commands.bossbar.set.visibility.unchanged.hidden"));
    private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType((Message)yh.c("commands.bossbar.set.visibility.unchanged.visible"));
    public static final SuggestionProvider<ed> a = ($$0, $$1) -> ei.a(((ed)$$0.getSource()).m().aN().a(), $$1);

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("bossbar").requires(ee.a(ee.d))).then(ee.b("add").then(ee.a("id", ev.a()).then(ee.a("name", em.a($$1)).executes($$0 -> aog.a((ed)$$0.getSource(), ev.a((CommandContext<ed>)$$0, "id"), em.b((CommandContext<ed>)$$0, "name"))))))).then(ee.b("remove").then(ee.a("id", ev.a()).suggests(a).executes($$0 -> aog.e((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0)))))).then(ee.b("list").executes($$0 -> aog.a((ed)$$0.getSource())))).then(ee.b("set").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("id", ev.a()).suggests(a).then(ee.b("name").then(ee.a("name", em.a($$1)).executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), em.b((CommandContext<ed>)$$0, "name")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("color").then(ee.b("pink").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.a.a)))).then(ee.b("blue").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.a.b)))).then(ee.b("red").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.a.c)))).then(ee.b("green").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.a.d)))).then(ee.b("yellow").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.a.e)))).then(ee.b("purple").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.a.f)))).then(ee.b("white").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.a.g))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("style").then(ee.b("progress").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.b.a)))).then(ee.b("notched_6").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.b.b)))).then(ee.b("notched_10").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.b.c)))).then(ee.b("notched_12").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.b.d)))).then(ee.b("notched_20").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), ccs.b.e))))).then(ee.b("value").then(ee.a("value", IntegerArgumentType.integer((int)0)).executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"value")))))).then(ee.b("max").then(ee.a("max", IntegerArgumentType.integer((int)1)).executes($$0 -> aog.b((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"max")))))).then(ee.b("visible").then(ee.a("visible", BoolArgumentType.bool()).executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), BoolArgumentType.getBool((CommandContext)$$0, (String)"visible")))))).then(((LiteralArgumentBuilder)ee.b("players").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), Collections.emptyList()))).then(ee.a("targets", eq.d()).executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0), eq.d((CommandContext<ed>)$$0, "targets")))))))).then(ee.b("get").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("id", ev.a()).suggests(a).then(ee.b("value").executes($$0 -> aog.a((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0))))).then(ee.b("max").executes($$0 -> aog.b((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0))))).then(ee.b("visible").executes($$0 -> aog.c((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0))))).then(ee.b("players").executes($$0 -> aog.d((ed)$$0.getSource(), aog.a((CommandContext<ed>)$$0)))))));
    }

    private static int a(ed $$0, anv $$1) {
        $$0.a(() -> yh.a("commands.bossbar.get.value", $$1.e(), $$1.c()), true);
        return $$1.c();
    }

    private static int b(ed $$0, anv $$1) {
        $$0.a(() -> yh.a("commands.bossbar.get.max", $$1.e(), $$1.d()), true);
        return $$1.d();
    }

    private static int c(ed $$0, anv $$1) {
        if ($$1.g()) {
            $$0.a(() -> yh.a("commands.bossbar.get.visible.visible", $$1.e()), true);
            return 1;
        }
        $$0.a(() -> yh.a("commands.bossbar.get.visible.hidden", $$1.e()), true);
        return 0;
    }

    private static int d(ed $$0, anv $$1) {
        if ($$1.h().isEmpty()) {
            $$0.a(() -> yh.a("commands.bossbar.get.players.none", $$1.e()), true);
        } else {
            $$0.a(() -> yh.a("commands.bossbar.get.players.some", $$1.e(), $$1.h().size(), yk.b($$1.h(), ddm::R_)), true);
        }
        return $$1.h().size();
    }

    private static int a(ed $$0, anv $$1, boolean $$2) throws CommandSyntaxException {
        if ($$1.g() == $$2) {
            if ($$2) {
                throw k.create();
            }
            throw j.create();
        }
        $$1.d($$2);
        if ($$2) {
            $$0.a(() -> yh.a("commands.bossbar.set.visible.success.visible", $$1.e()), true);
        } else {
            $$0.a(() -> yh.a("commands.bossbar.set.visible.success.hidden", $$1.e()), true);
        }
        return 0;
    }

    private static int a(ed $$0, anv $$1, int $$2) throws CommandSyntaxException {
        if ($$1.c() == $$2) {
            throw h.create();
        }
        $$1.a($$2);
        $$0.a(() -> yh.a("commands.bossbar.set.value.success", $$1.e(), $$2), true);
        return $$2;
    }

    private static int b(ed $$0, anv $$1, int $$2) throws CommandSyntaxException {
        if ($$1.d() == $$2) {
            throw i.create();
        }
        $$1.b($$2);
        $$0.a(() -> yh.a("commands.bossbar.set.max.success", $$1.e(), $$2), true);
        return $$2;
    }

    private static int a(ed $$0, anv $$1, ccs.a $$2) throws CommandSyntaxException {
        if ($$1.l().equals($$2)) {
            throw f.create();
        }
        $$1.a($$2);
        $$0.a(() -> yh.a("commands.bossbar.set.color.success", $$1.e()), true);
        return 0;
    }

    private static int a(ed $$0, anv $$1, ccs.b $$2) throws CommandSyntaxException {
        if ($$1.m().equals($$2)) {
            throw g.create();
        }
        $$1.a($$2);
        $$0.a(() -> yh.a("commands.bossbar.set.style.success", $$1.e()), true);
        return 0;
    }

    private static int a(ed $$0, anv $$1, yh $$2) throws CommandSyntaxException {
        yw $$3 = yk.a($$0, $$2, null, 0);
        if ($$1.j().equals($$3)) {
            throw e.create();
        }
        $$1.a($$3);
        $$0.a(() -> yh.a("commands.bossbar.set.name.success", $$1.e()), true);
        return 0;
    }

    private static int a(ed $$0, anv $$1, Collection<axg> $$2) throws CommandSyntaxException {
        boolean $$3 = $$1.a($$2);
        if (!$$3) {
            throw d.create();
        }
        if ($$1.h().isEmpty()) {
            $$0.a(() -> yh.a("commands.bossbar.set.players.success.none", $$1.e()), true);
        } else {
            $$0.a(() -> yh.a("commands.bossbar.set.players.success.some", $$1.e(), $$2.size(), yk.b($$2, ddm::R_)), true);
        }
        return $$1.h().size();
    }

    private static int a(ed $$0) {
        Collection<anv> $$1 = $$0.m().aN().b();
        if ($$1.isEmpty()) {
            $$0.a(() -> yh.c("commands.bossbar.list.bars.none"), false);
        } else {
            $$0.a(() -> yh.a("commands.bossbar.list.bars.some", $$1.size(), yk.b($$1, anv::e)), false);
        }
        return $$1.size();
    }

    private static int a(ed $$0, amo $$1, yh $$2) throws CommandSyntaxException {
        anw $$3 = $$0.m().aN();
        if ($$3.a($$1) != null) {
            throw b.create((Object)$$1.toString());
        }
        anv $$4 = $$3.a($$1, yk.a($$0, $$2, null, 0));
        $$0.a(() -> yh.a("commands.bossbar.create.success", $$4.e()), true);
        return $$3.b().size();
    }

    private static int e(ed $$0, anv $$1) {
        anw $$2 = $$0.m().aN();
        $$1.b();
        $$2.a($$1);
        $$0.a(() -> yh.a("commands.bossbar.remove.success", $$1.e()), true);
        return $$2.b().size();
    }

    public static anv a(CommandContext<ed> $$0) throws CommandSyntaxException {
        amo $$1 = ev.a($$0, "id");
        anv $$2 = ((ed)$$0.getSource()).m().aN().a($$1);
        if ($$2 == null) {
            throw c.create((Object)$$1.toString());
        }
        return $$2;
    }
}

