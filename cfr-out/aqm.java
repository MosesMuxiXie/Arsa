/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class aqm {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.scoreboard.objectives.add.duplicate"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.scoreboard.objectives.display.alreadyEmpty"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.scoreboard.objectives.display.alreadySet"));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("commands.scoreboard.players.enable.failed"));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("commands.scoreboard.players.enable.invalid"));
    private static final Dynamic2CommandExceptionType f = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.scoreboard.players.get.null", $$0, $$1));

    public static void a(CommandDispatcher<ed> $$02, dz $$12) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("scoreboard").requires(ee.a(ee.d))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("objectives").then(ee.b("list").executes($$0 -> aqm.b((ed)$$0.getSource())))).then(ee.b("add").then(ee.a("objective", StringArgumentType.word()).then(((RequiredArgumentBuilder)ee.a("criteria", fa.a()).executes($$0 -> aqm.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"objective"), fa.a((CommandContext<ed>)$$0, "criteria"), (yh)yh.b(StringArgumentType.getString((CommandContext)$$0, (String)"objective"))))).then(ee.a("displayName", em.a($$12)).executes($$0 -> aqm.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"objective"), fa.a((CommandContext<ed>)$$0, "criteria"), em.b((CommandContext<ed>)$$0, "displayName")))))))).then(ee.b("modify").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("objective", ez.a()).then(ee.b("displayname").then(ee.a("displayName", em.a($$12)).executes($$0 -> aqm.a((ed)$$0.getSource(), ez.a((CommandContext<ed>)$$0, "objective"), em.b((CommandContext<ed>)$$0, "displayName")))))).then(aqm.a())).then(ee.b("displayautoupdate").then(ee.a("value", BoolArgumentType.bool()).executes($$0 -> aqm.a((ed)$$0.getSource(), ez.a((CommandContext<ed>)$$0, "objective"), BoolArgumentType.getBool((CommandContext)$$0, (String)"value")))))).then(aqm.a($$12, ee.b("numberformat"), (CommandContext<ed> $$0, aag $$1) -> aqm.a((ed)$$0.getSource(), ez.a((CommandContext<ed>)$$0, "objective"), $$1)))))).then(ee.b("remove").then(ee.a("objective", ez.a()).executes($$0 -> aqm.a((ed)$$0.getSource(), ez.a((CommandContext<ed>)$$0, "objective")))))).then(ee.b("setdisplay").then(((RequiredArgumentBuilder)ee.a("slot", fl.a()).executes($$0 -> aqm.a((ed)$$0.getSource(), fl.a((CommandContext<ed>)$$0, "slot")))).then(ee.a("objective", ez.a()).executes($$0 -> aqm.a((ed)$$0.getSource(), fl.a((CommandContext<ed>)$$0, "slot"), ez.a((CommandContext<ed>)$$0, "objective")))))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("players").then(((LiteralArgumentBuilder)ee.b("list").executes($$0 -> aqm.a((ed)$$0.getSource()))).then(ee.a("target", fk.a()).suggests(fk.a).executes($$0 -> aqm.a((ed)$$0.getSource(), fk.a((CommandContext<ed>)$$0, "target")))))).then(ee.b("set").then(ee.a("targets", fk.b()).suggests(fk.a).then(ee.a("objective", ez.a()).then(ee.a("score", IntegerArgumentType.integer()).executes($$0 -> aqm.a((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets"), ez.b((CommandContext<ed>)$$0, "objective"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"score")))))))).then(ee.b("get").then(ee.a("target", fk.a()).suggests(fk.a).then(ee.a("objective", ez.a()).executes($$0 -> aqm.a((ed)$$0.getSource(), fk.a((CommandContext<ed>)$$0, "target"), ez.a((CommandContext<ed>)$$0, "objective"))))))).then(ee.b("add").then(ee.a("targets", fk.b()).suggests(fk.a).then(ee.a("objective", ez.a()).then(ee.a("score", IntegerArgumentType.integer((int)0)).executes($$0 -> aqm.b((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets"), ez.b((CommandContext<ed>)$$0, "objective"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"score")))))))).then(ee.b("remove").then(ee.a("targets", fk.b()).suggests(fk.a).then(ee.a("objective", ez.a()).then(ee.a("score", IntegerArgumentType.integer((int)0)).executes($$0 -> aqm.c((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets"), ez.b((CommandContext<ed>)$$0, "objective"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"score")))))))).then(ee.b("reset").then(((RequiredArgumentBuilder)ee.a("targets", fk.b()).suggests(fk.a).executes($$0 -> aqm.a((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets")))).then(ee.a("objective", ez.a()).executes($$0 -> aqm.b((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets"), ez.a((CommandContext<ed>)$$0, "objective"))))))).then(ee.b("enable").then(ee.a("targets", fk.b()).suggests(fk.a).then(ee.a("objective", ez.a()).suggests(($$0, $$1) -> aqm.a((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets"), $$1)).executes($$0 -> aqm.a((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets"), ez.a((CommandContext<ed>)$$0, "objective"))))))).then(((LiteralArgumentBuilder)ee.b("display").then(ee.b("name").then(ee.a("targets", fk.b()).suggests(fk.a).then(((RequiredArgumentBuilder)ee.a("objective", ez.a()).then(ee.a("name", em.a($$12)).executes($$0 -> aqm.a((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets"), ez.a((CommandContext<ed>)$$0, "objective"), em.b((CommandContext<ed>)$$0, "name"))))).executes($$0 -> aqm.a((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets"), ez.a((CommandContext<ed>)$$0, "objective"), null)))))).then(ee.b("numberformat").then(ee.a("targets", fk.b()).suggests(fk.a).then(aqm.a($$12, ee.a("objective", ez.a()), (CommandContext<ed> $$0, aag $$1) -> aqm.a((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets"), ez.a((CommandContext<ed>)$$0, "objective"), $$1))))))).then(ee.b("operation").then(ee.a("targets", fk.b()).suggests(fk.a).then(ee.a("targetObjective", ez.a()).then(ee.a("operation", fb.a()).then(ee.a("source", fk.b()).suggests(fk.a).then(ee.a("sourceObjective", ez.a()).executes($$0 -> aqm.a((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "targets"), ez.b((CommandContext<ed>)$$0, "targetObjective"), fb.a((CommandContext<ed>)$$0, "operation"), fk.c((CommandContext<ed>)$$0, "source"), ez.a((CommandContext<ed>)$$0, "sourceObjective")))))))))));
    }

    private static ArgumentBuilder<ed, ?> a(dz $$0, ArgumentBuilder<ed, ?> $$12, a $$2) {
        return $$12.then(ee.b("blank").executes($$1 -> $$2.run((CommandContext<ed>)$$1, aae.a))).then(ee.b("fixed").then(ee.a("contents", em.a($$0)).executes($$1 -> {
            yh $$2 = em.b((CommandContext<ed>)$$1, "contents");
            return $$2.run((CommandContext<ed>)$$1, new aaf($$2));
        }))).then(ee.b("styled").then(ee.a("style", fq.a($$0)).executes($$1 -> {
            zf $$2 = fq.a((CommandContext<ed>)$$1, "style");
            return $$2.run((CommandContext<ed>)$$1, new aaj($$2));
        }))).executes($$1 -> $$2.run((CommandContext<ed>)$$1, null));
    }

    private static LiteralArgumentBuilder<ed> a() {
        LiteralArgumentBuilder<ed> $$0 = ee.b("rendertype");
        for (fuu.a $$12 : fuu.a.values()) {
            $$0.then(ee.b($$12.a()).executes($$1 -> aqm.a((ed)$$1.getSource(), ez.a((CommandContext<ed>)$$1, "objective"), $$12)));
        }
        return $$0;
    }

    private static CompletableFuture<Suggestions> a(ed $$0, Collection<fuq> $$1, SuggestionsBuilder $$2) {
        ArrayList $$3 = Lists.newArrayList();
        anm $$4 = $$0.m().aK();
        for (fuj $$5 : $$4.b()) {
            if ($$5.d() != fuu.d) continue;
            boolean $$6 = false;
            for (fuq $$7 : $$1) {
                fun $$8 = $$4.d($$7, $$5);
                if ($$8 != null && !$$8.b()) continue;
                $$6 = true;
                break;
            }
            if (!$$6) continue;
            $$3.add($$5.c());
        }
        return ei.b($$3, $$2);
    }

    private static int a(ed $$0, fuq $$1, fuj $$2) throws CommandSyntaxException {
        anm $$3 = $$0.m().aK();
        fun $$4 = $$3.d($$1, $$2);
        if ($$4 == null) {
            throw f.create((Object)$$2.c(), (Object)$$1.hH());
        }
        $$0.a(() -> yh.a("commands.scoreboard.players.get.success", $$1.hH(), $$4.a(), $$2.h()), false);
        return $$4.a();
    }

    private static yh a(Collection<fuq> $$0) {
        return $$0.iterator().next().hH();
    }

    private static int a(ed $$0, Collection<fuq> $$1, fuj $$2, fb.a $$3, Collection<fuq> $$4, fuj $$5) throws CommandSyntaxException {
        anm $$6 = $$0.m().aK();
        int $$7 = 0;
        for (fuq $$8 : $$1) {
            fup $$9 = $$6.c($$8, $$2);
            for (fuq $$10 : $$4) {
                fup $$11 = $$6.c($$10, $$5);
                $$3.apply($$9, $$11);
            }
            $$7 += $$9.a();
        }
        if ($$1.size() == 1) {
            int $$12 = $$7;
            $$0.a(() -> yh.a("commands.scoreboard.players.operation.success.single", $$2.h(), aqm.a($$1), $$12), true);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.operation.success.multiple", $$2.h(), $$1.size()), true);
        }
        return $$7;
    }

    private static int a(ed $$0, Collection<fuq> $$1, fuj $$2) throws CommandSyntaxException {
        if ($$2.d() != fuu.d) {
            throw e.create();
        }
        anm $$3 = $$0.m().aK();
        int $$4 = 0;
        for (fuq $$5 : $$1) {
            fup $$6 = $$3.c($$5, $$2);
            if (!$$6.d()) continue;
            $$6.e();
            ++$$4;
        }
        if ($$4 == 0) {
            throw d.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.scoreboard.players.enable.success.single", $$2.h(), aqm.a($$1)), true);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.enable.success.multiple", $$2.h(), $$1.size()), true);
        }
        return $$4;
    }

    private static int a(ed $$0, Collection<fuq> $$1) {
        anm $$2 = $$0.m().aK();
        for (fuq $$3 : $$1) {
            $$2.b($$3);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.scoreboard.players.reset.all.single", aqm.a($$1)), true);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.reset.all.multiple", $$1.size()), true);
        }
        return $$1.size();
    }

    private static int b(ed $$0, Collection<fuq> $$1, fuj $$2) {
        anm $$3 = $$0.m().aK();
        for (fuq $$4 : $$1) {
            $$3.e($$4, $$2);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.scoreboard.players.reset.specific.single", $$2.h(), aqm.a($$1)), true);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.reset.specific.multiple", $$2.h(), $$1.size()), true);
        }
        return $$1.size();
    }

    private static int a(ed $$0, Collection<fuq> $$1, fuj $$2, int $$3) {
        anm $$4 = $$0.m().aK();
        for (fuq $$5 : $$1) {
            $$4.c($$5, $$2).a($$3);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.scoreboard.players.set.success.single", $$2.h(), aqm.a($$1), $$3), true);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.set.success.multiple", $$2.h(), $$1.size(), $$3), true);
        }
        return $$3 * $$1.size();
    }

    private static int a(ed $$0, Collection<fuq> $$1, fuj $$2, @Nullable yh $$3) {
        anm $$4 = $$0.m().aK();
        for (fuq $$5 : $$1) {
            $$4.c($$5, $$2).a($$3);
        }
        if ($$3 == null) {
            if ($$1.size() == 1) {
                $$0.a(() -> yh.a("commands.scoreboard.players.display.name.clear.success.single", aqm.a($$1), $$2.h()), true);
            } else {
                $$0.a(() -> yh.a("commands.scoreboard.players.display.name.clear.success.multiple", $$1.size(), $$2.h()), true);
            }
        } else if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.scoreboard.players.display.name.set.success.single", $$3, aqm.a($$1), $$2.h()), true);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.display.name.set.success.multiple", $$3, $$1.size(), $$2.h()), true);
        }
        return $$1.size();
    }

    private static int a(ed $$0, Collection<fuq> $$1, fuj $$2, @Nullable aag $$3) {
        anm $$4 = $$0.m().aK();
        for (fuq $$5 : $$1) {
            $$4.c($$5, $$2).a($$3);
        }
        if ($$3 == null) {
            if ($$1.size() == 1) {
                $$0.a(() -> yh.a("commands.scoreboard.players.display.numberFormat.clear.success.single", aqm.a($$1), $$2.h()), true);
            } else {
                $$0.a(() -> yh.a("commands.scoreboard.players.display.numberFormat.clear.success.multiple", $$1.size(), $$2.h()), true);
            }
        } else if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.scoreboard.players.display.numberFormat.set.success.single", aqm.a($$1), $$2.h()), true);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.display.numberFormat.set.success.multiple", $$1.size(), $$2.h()), true);
        }
        return $$1.size();
    }

    private static int b(ed $$0, Collection<fuq> $$1, fuj $$2, int $$3) {
        anm $$4 = $$0.m().aK();
        int $$5 = 0;
        for (fuq $$6 : $$1) {
            fup $$7 = $$4.c($$6, $$2);
            $$7.a($$7.a() + $$3);
            $$5 += $$7.a();
        }
        if ($$1.size() == 1) {
            int $$8 = $$5;
            $$0.a(() -> yh.a("commands.scoreboard.players.add.success.single", $$3, $$2.h(), aqm.a($$1), $$8), true);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.add.success.multiple", $$3, $$2.h(), $$1.size()), true);
        }
        return $$5;
    }

    private static int c(ed $$0, Collection<fuq> $$1, fuj $$2, int $$3) {
        anm $$4 = $$0.m().aK();
        int $$5 = 0;
        for (fuq $$6 : $$1) {
            fup $$7 = $$4.c($$6, $$2);
            $$7.a($$7.a() - $$3);
            $$5 += $$7.a();
        }
        if ($$1.size() == 1) {
            int $$8 = $$5;
            $$0.a(() -> yh.a("commands.scoreboard.players.remove.success.single", $$3, $$2.h(), aqm.a($$1), $$8), true);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.remove.success.multiple", $$3, $$2.h(), $$1.size()), true);
        }
        return $$5;
    }

    private static int a(ed $$0) {
        Collection<fuq> $$1 = $$0.m().aK().d();
        if ($$1.isEmpty()) {
            $$0.a(() -> yh.c("commands.scoreboard.players.list.empty"), false);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.list.success", $$1.size(), yk.b($$1, fuq::hH)), false);
        }
        return $$1.size();
    }

    private static int a(ed $$0, fuq $$12) {
        Object2IntMap<fuj> $$2 = $$0.m().aK().c($$12);
        if ($$2.isEmpty()) {
            $$0.a(() -> yh.a("commands.scoreboard.players.list.entity.empty", $$12.hH()), false);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.players.list.entity.success", $$12.hH(), $$2.size()), false);
            Object2IntMaps.fastForEach($$2, $$1 -> $$0.a(() -> yh.a("commands.scoreboard.players.list.entity.entry", ((fuj)$$1.getKey()).h(), $$1.getIntValue()), false));
        }
        return $$2.size();
    }

    private static int a(ed $$0, fui $$1) throws CommandSyntaxException {
        anm $$2 = $$0.m().aK();
        if ($$2.a($$1) == null) {
            throw b.create();
        }
        ((fur)$$2).a($$1, null);
        $$0.a(() -> yh.a("commands.scoreboard.objectives.display.cleared", new Object[]{$$1.c()}), true);
        return 0;
    }

    private static int a(ed $$0, fui $$1, fuj $$2) throws CommandSyntaxException {
        anm $$3 = $$0.m().aK();
        if ($$3.a($$1) == $$2) {
            throw c.create();
        }
        ((fur)$$3).a($$1, $$2);
        $$0.a(() -> yh.a("commands.scoreboard.objectives.display.set", new Object[]{$$1.c(), $$2.e()}), true);
        return 0;
    }

    private static int a(ed $$0, fuj $$1, yh $$2) {
        if (!$$1.e().equals($$2)) {
            $$1.a($$2);
            $$0.a(() -> yh.a("commands.scoreboard.objectives.modify.displayname", new Object[]{$$1.c(), $$1.h()}), true);
        }
        return 0;
    }

    private static int a(ed $$0, fuj $$1, boolean $$2) {
        if ($$1.f() != $$2) {
            $$1.a($$2);
            if ($$2) {
                $$0.a(() -> yh.a("commands.scoreboard.objectives.modify.displayAutoUpdate.enable", new Object[]{$$1.c(), $$1.h()}), true);
            } else {
                $$0.a(() -> yh.a("commands.scoreboard.objectives.modify.displayAutoUpdate.disable", new Object[]{$$1.c(), $$1.h()}), true);
            }
        }
        return 0;
    }

    private static int a(ed $$0, fuj $$1, @Nullable aag $$2) {
        $$1.b($$2);
        if ($$2 != null) {
            $$0.a(() -> yh.a("commands.scoreboard.objectives.modify.objectiveFormat.set", new Object[]{$$1.c()}), true);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.objectives.modify.objectiveFormat.clear", new Object[]{$$1.c()}), true);
        }
        return 0;
    }

    private static int a(ed $$0, fuj $$1, fuu.a $$2) {
        if ($$1.i() != $$2) {
            $$1.a($$2);
            $$0.a(() -> yh.a("commands.scoreboard.objectives.modify.rendertype", $$1.h()), true);
        }
        return 0;
    }

    private static int a(ed $$0, fuj $$1) {
        anm $$2 = $$0.m().aK();
        $$2.j($$1);
        $$0.a(() -> yh.a("commands.scoreboard.objectives.remove.success", $$1.h()), true);
        return $$2.b().size();
    }

    private static int a(ed $$0, String $$1, fuu $$2, yh $$3) throws CommandSyntaxException {
        anm $$4 = $$0.m().aK();
        if ($$4.a($$1) != null) {
            throw a.create();
        }
        $$4.a($$1, $$2, $$3, $$2.f(), false, null);
        fuj $$5 = $$4.a($$1);
        $$0.a(() -> yh.a("commands.scoreboard.objectives.add.success", $$5.h()), true);
        return $$4.b().size();
    }

    private static int b(ed $$0) {
        Collection<fuj> $$1 = $$0.m().aK().b();
        if ($$1.isEmpty()) {
            $$0.a(() -> yh.c("commands.scoreboard.objectives.list.empty"), false);
        } else {
            $$0.a(() -> yh.a("commands.scoreboard.objectives.list.success", $$1.size(), yk.b($$1, fuj::h)), false);
        }
        return $$1.size();
    }

    @FunctionalInterface
    public static interface a {
        public int run(CommandContext<ed> var1, @Nullable aag var2) throws CommandSyntaxException;
    }
}

