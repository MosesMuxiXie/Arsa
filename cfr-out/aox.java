/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.RedirectModifier
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class aox {
    private static final Logger b = LogUtils.getLogger();
    private static final int c = 32768;
    private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.execute.blocks.toobig", $$0, $$1));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("commands.execute.conditional.fail"));
    private static final DynamicCommandExceptionType f = new DynamicCommandExceptionType($$0 -> yh.b("commands.execute.conditional.fail_count", $$0));
    @VisibleForTesting
    public static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.execute.function.instantiationFailure", $$0, $$1));

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        LiteralCommandNode $$2 = $$02.register((LiteralArgumentBuilder)ee.b("execute").requires(ee.a(ee.d)));
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("execute").requires(ee.a(ee.d))).then(ee.b("run").redirect((CommandNode)$$02.getRoot()))).then(aox.a((CommandNode<ed>)$$2, ee.b("if"), true, $$1))).then(aox.a((CommandNode<ed>)$$2, ee.b("unless"), false, $$1))).then(ee.b("as").then(ee.a("targets", eq.b()).fork((CommandNode)$$2, $$0 -> {
            ArrayList $$1 = Lists.newArrayList();
            for (cgk cgk2 : eq.c((CommandContext<ed>)$$0, "targets")) {
                $$1.add(((ed)$$0.getSource()).a(cgk2));
            }
            return $$1;
        })))).then(ee.b("at").then(ee.a("targets", eq.b()).fork((CommandNode)$$2, $$0 -> {
            ArrayList $$1 = Lists.newArrayList();
            for (cgk cgk2 : eq.c((CommandContext<ed>)$$0, "targets")) {
                $$1.add(((ed)$$0.getSource()).a((axf)cgk2.ao()).a(cgk2.dI()).a(cgk2.cl()));
            }
            return $$1;
        })))).then(((LiteralArgumentBuilder)ee.b("store").then(aox.a((LiteralCommandNode<ed>)$$2, ee.b("result"), true))).then(aox.a((LiteralCommandNode<ed>)$$2, ee.b("success"), false)))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("positioned").then(ee.a("pos", gj.a()).redirect((CommandNode)$$2, $$0 -> ((ed)$$0.getSource()).a(gj.a((CommandContext<ed>)$$0, "pos")).a(ep.a.a)))).then(ee.b("as").then(ee.a("targets", eq.b()).fork((CommandNode)$$2, $$0 -> {
            ArrayList $$1 = Lists.newArrayList();
            for (cgk cgk2 : eq.c((CommandContext<ed>)$$0, "targets")) {
                $$1.add(((ed)$$0.getSource()).a(cgk2.dI()));
            }
            return $$1;
        })))).then(ee.b("over").then(ee.a("heightmap", et.a()).redirect((CommandNode)$$2, $$0 -> {
            ftm $$1 = ((ed)$$0.getSource()).e();
            axf $$2 = ((ed)$$0.getSource()).f();
            double $$3 = $$1.a();
            double $$4 = $$1.c();
            if (!$$2.b(jw.b($$3), jw.b($$4))) {
                throw gc.a.create();
            }
            int $$5 = $$2.a(et.a((CommandContext<ed>)$$0, "heightmap"), bgj.c($$3), bgj.c($$4));
            return ((ed)$$0.getSource()).a(new ftm($$3, $$5, $$4));
        }))))).then(((LiteralArgumentBuilder)ee.b("rotated").then(ee.a("rot", gg.a()).redirect((CommandNode)$$2, $$0 -> ((ed)$$0.getSource()).a(gg.a((CommandContext<ed>)$$0, "rot").b((ed)$$0.getSource()))))).then(ee.b("as").then(ee.a("targets", eq.b()).fork((CommandNode)$$2, $$0 -> {
            ArrayList $$1 = Lists.newArrayList();
            for (cgk cgk2 : eq.c((CommandContext<ed>)$$0, "targets")) {
                $$1.add(((ed)$$0.getSource()).a(cgk2.cl()));
            }
            return $$1;
        }))))).then(((LiteralArgumentBuilder)ee.b("facing").then(ee.b("entity").then(ee.a("targets", eq.b()).then(ee.a("anchor", ep.a()).fork((CommandNode)$$2, $$0 -> {
            ArrayList $$1 = Lists.newArrayList();
            ep.a $$2 = ep.a((CommandContext<ed>)$$0, "anchor");
            for (cgk cgk2 : eq.c((CommandContext<ed>)$$0, "targets")) {
                $$1.add(((ed)$$0.getSource()).a(cgk2, $$2));
            }
            return $$1;
        }))))).then(ee.a("pos", gj.a()).redirect((CommandNode)$$2, $$0 -> ((ed)$$0.getSource()).b(gj.a((CommandContext<ed>)$$0, "pos")))))).then(ee.b("align").then(ee.a("axes", gh.a()).redirect((CommandNode)$$2, $$0 -> ((ed)$$0.getSource()).a(((ed)$$0.getSource()).e().a(gh.a((CommandContext<ed>)$$0, "axes"))))))).then(ee.b("anchored").then(ee.a("anchor", ep.a()).redirect((CommandNode)$$2, $$0 -> ((ed)$$0.getSource()).a(ep.a((CommandContext<ed>)$$0, "anchor")))))).then(ee.b("in").then(ee.a("dimension", eo.a()).redirect((CommandNode)$$2, $$0 -> ((ed)$$0.getSource()).a(eo.a((CommandContext<ed>)$$0, "dimension")))))).then(ee.b("summon").then(ee.a("entity", fe.a($$1, mj.F)).suggests(ig.a(ig.c)).redirect((CommandNode)$$2, $$0 -> aox.a((ed)$$0.getSource(), fe.e((CommandContext<ed>)$$0, "entity")))))).then(aox.a((CommandNode<ed>)$$2, ee.b("on"))));
    }

    private static ArgumentBuilder<ed, ?> a(LiteralCommandNode<ed> $$0, LiteralArgumentBuilder<ed> $$12, boolean $$2) {
        $$12.then(ee.b("score").then(ee.a("targets", fk.b()).suggests(fk.a).then(ee.a("objective", ez.a()).redirect($$0, $$1 -> aox.a((ed)$$1.getSource(), fk.c((CommandContext<ed>)$$1, "targets"), ez.a((CommandContext<ed>)$$1, "objective"), $$2)))));
        $$12.then(ee.b("bossbar").then(((RequiredArgumentBuilder)ee.a("id", ev.a()).suggests(aog.a).then(ee.b("value").redirect($$0, $$1 -> aox.a((ed)$$1.getSource(), aog.a((CommandContext<ed>)$$1), true, $$2)))).then(ee.b("max").redirect($$0, $$1 -> aox.a((ed)$$1.getSource(), aog.a((CommandContext<ed>)$$1), false, $$2)))));
        for (ars.c $$32 : ars.b) {
            $$32.a((ArgumentBuilder<ed, ?>)$$12, $$3 -> $$3.then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("path", ex.a()).then(ee.b("int").then(ee.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aox.a((ed)$$2.getSource(), $$32.a((CommandContext<ed>)$$2), ex.a((CommandContext<ed>)$$2, "path"), (int $$1) -> ve.a((int)((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale"))), $$2))))).then(ee.b("float").then(ee.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aox.a((ed)$$2.getSource(), $$32.a((CommandContext<ed>)$$2), ex.a((CommandContext<ed>)$$2, "path"), (int $$1) -> vc.a((float)((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale"))), $$2))))).then(ee.b("short").then(ee.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aox.a((ed)$$2.getSource(), $$32.a((CommandContext<ed>)$$2), ex.a((CommandContext<ed>)$$2, "path"), (int $$1) -> vs.a((short)((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale"))), $$2))))).then(ee.b("long").then(ee.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aox.a((ed)$$2.getSource(), $$32.a((CommandContext<ed>)$$2), ex.a((CommandContext<ed>)$$2, "path"), (int $$1) -> vh.a((long)((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale"))), $$2))))).then(ee.b("double").then(ee.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aox.a((ed)$$2.getSource(), $$32.a((CommandContext<ed>)$$2), ex.a((CommandContext<ed>)$$2, "path"), (int $$1) -> va.a((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale")), $$2))))).then(ee.b("byte").then(ee.a("scale", DoubleArgumentType.doubleArg()).redirect((CommandNode)$$0, $$2 -> aox.a((ed)$$2.getSource(), $$32.a((CommandContext<ed>)$$2), ex.a((CommandContext<ed>)$$2, "path"), (int $$1) -> ux.a((byte)((double)$$1 * DoubleArgumentType.getDouble((CommandContext)$$2, (String)"scale"))), $$2))))));
        }
        return $$12;
    }

    private static ed a(ed $$0, Collection<fuq> $$1, fuj $$2, boolean $$3) {
        anm $$42 = $$0.m().aK();
        return $$0.a(($$4, $$5) -> {
            for (fuq $$6 : $$1) {
                fup $$7 = $$42.c($$6, $$2);
                int $$8 = $$3 ? $$5 : ($$4 ? 1 : 0);
                $$7.a($$8);
            }
        }, ea::chain);
    }

    private static ed a(ed $$0, anv $$1, boolean $$2, boolean $$32) {
        return $$0.a(($$3, $$4) -> {
            int $$5;
            int n2 = $$32 ? $$4 : ($$5 = $$3 ? 1 : 0);
            if ($$2) {
                $$1.a($$5);
            } else {
                $$1.b($$5);
            }
        }, ea::chain);
    }

    private static ed a(ed $$0, arr $$1, ex.g $$2, IntFunction<vz> $$3, boolean $$42) {
        return $$0.a(($$4, $$5) -> {
            try {
                uz $$6 = $$1.a();
                int $$7 = $$42 ? $$5 : ($$4 ? 1 : 0);
                $$2.a((vz)$$6, (vz)$$3.apply($$7));
                $$1.a($$6);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                // empty catch block
            }
        }, ea::chain);
    }

    private static boolean a(axf $$0, is $$1) {
        dvu $$2 = new dvu($$1);
        eqq $$3 = $$0.p().a($$2.h, $$2.i);
        if ($$3 != null) {
            return $$3.G() == awt.d && $$0.c($$2.b());
        }
        return false;
    }

    private static ArgumentBuilder<ed, ?> a(CommandNode<ed> $$03, LiteralArgumentBuilder<ed> $$12, boolean $$2, dz $$32) {
        ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$12.then(ee.b("block").then(ee.a("pos", gc.a()).then(aox.a($$03, ee.a("block", fy.a($$32)), $$2, (CommandContext<ed> $$0) -> fy.a((CommandContext<ed>)$$0, "block").test(new eol(((ed)$$0.getSource()).f(), gc.a((CommandContext<ed>)$$0, "pos"), true))))))).then(ee.b("biome").then(ee.a("pos", gc.a()).then(aox.a($$03, ee.a("biome", fh.a($$32, mj.aS)), $$2, (CommandContext<ed> $$0) -> fh.a((CommandContext<ed>)$$0, "biome", mj.aS).test(((ed)$$0.getSource()).f().z(gc.a((CommandContext<ed>)$$0, "pos")))))))).then(ee.b("loaded").then(aox.a($$03, ee.a("pos", gc.a()), $$2, (CommandContext<ed> $$0) -> aox.a(((ed)$$0.getSource()).f(), gc.b((CommandContext<ed>)$$0, "pos")))))).then(ee.b("dimension").then(aox.a($$03, ee.a("dimension", eo.a()), $$2, (CommandContext<ed> $$0) -> eo.a((CommandContext<ed>)$$0, "dimension") == ((ed)$$0.getSource()).f())))).then(ee.b("score").then(ee.a("target", fk.a()).suggests(fk.a).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("targetObjective", ez.a()).then(ee.b("=").then(ee.a("source", fk.a()).suggests(fk.a).then(aox.a($$03, ee.a("sourceObjective", ez.a()), $$2, (CommandContext<ed> $$02) -> aox.a((CommandContext<ed>)$$02, (int $$0, int $$1) -> $$0 == $$1)))))).then(ee.b("<").then(ee.a("source", fk.a()).suggests(fk.a).then(aox.a($$03, ee.a("sourceObjective", ez.a()), $$2, (CommandContext<ed> $$02) -> aox.a((CommandContext<ed>)$$02, (int $$0, int $$1) -> $$0 < $$1)))))).then(ee.b("<=").then(ee.a("source", fk.a()).suggests(fk.a).then(aox.a($$03, ee.a("sourceObjective", ez.a()), $$2, (CommandContext<ed> $$02) -> aox.a((CommandContext<ed>)$$02, (int $$0, int $$1) -> $$0 <= $$1)))))).then(ee.b(">").then(ee.a("source", fk.a()).suggests(fk.a).then(aox.a($$03, ee.a("sourceObjective", ez.a()), $$2, (CommandContext<ed> $$02) -> aox.a((CommandContext<ed>)$$02, (int $$0, int $$1) -> $$0 > $$1)))))).then(ee.b(">=").then(ee.a("source", fk.a()).suggests(fk.a).then(aox.a($$03, ee.a("sourceObjective", ez.a()), $$2, (CommandContext<ed> $$02) -> aox.a((CommandContext<ed>)$$02, (int $$0, int $$1) -> $$0 >= $$1)))))).then(ee.b("matches").then(aox.a($$03, ee.a("range", fd.a()), $$2, (CommandContext<ed> $$0) -> aox.a((CommandContext<ed>)$$0, fd.b.a((CommandContext<ed>)$$0, "range"))))))))).then(ee.b("blocks").then(ee.a("start", gc.a()).then(ee.a("end", gc.a()).then(((RequiredArgumentBuilder)ee.a("destination", gc.a()).then(aox.a($$03, ee.b("all"), $$2, false))).then(aox.a($$03, ee.b("masked"), $$2, true))))))).then(ee.b("entity").then(((RequiredArgumentBuilder)ee.a("entities", eq.b()).fork($$03, $$1 -> aox.a((CommandContext<ed>)$$1, $$2, !eq.c((CommandContext<ed>)$$1, "entities").isEmpty()))).executes(aox.a($$2, (CommandContext<ed> $$0) -> eq.c((CommandContext<ed>)$$0, "entities").size()))))).then(ee.b("predicate").then(aox.a($$03, ee.a("predicate", fg.c($$32)), $$2, (CommandContext<ed> $$0) -> aox.a((ed)$$0.getSource(), fg.c((CommandContext<ed>)$$0, "predicate")))))).then(ee.b("function").then(ee.a("name", go.a()).suggests(apd.b).fork($$03, (RedirectModifier)new c($$2))))).then(((LiteralArgumentBuilder)ee.b("items").then(ee.b("entity").then(ee.a("entities", eq.b()).then(ee.a("slots", fo.a()).then(((RequiredArgumentBuilder)ee.a("item_predicate", gs.a($$32)).fork($$03, $$1 -> aox.a((CommandContext<ed>)$$1, $$2, aox.a(eq.b((CommandContext<ed>)$$1, "entities"), fo.a((CommandContext<ed>)$$1, "slots"), gs.a((CommandContext<ed>)$$1, "item_predicate")) > 0))).executes(aox.a($$2, (CommandContext<ed> $$0) -> aox.a(eq.b((CommandContext<ed>)$$0, "entities"), fo.a((CommandContext<ed>)$$0, "slots"), gs.a((CommandContext<ed>)$$0, "item_predicate"))))))))).then(ee.b("block").then(ee.a("pos", gc.a()).then(ee.a("slots", fo.a()).then(((RequiredArgumentBuilder)ee.a("item_predicate", gs.a($$32)).fork($$03, $$1 -> aox.a((CommandContext<ed>)$$1, $$2, aox.a((ed)$$1.getSource(), gc.a((CommandContext<ed>)$$1, "pos"), fo.a((CommandContext<ed>)$$1, "slots"), gs.a((CommandContext<ed>)$$1, "item_predicate")) > 0))).executes(aox.a($$2, (CommandContext<ed> $$0) -> aox.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "pos"), fo.a((CommandContext<ed>)$$0, "slots"), gs.a((CommandContext<ed>)$$0, "item_predicate")))))))))).then(ee.b("stopwatch").then(ee.a("id", ev.a()).suggests(aqy.b).then(aox.a($$03, ee.a("range", fd.b()), $$2, (CommandContext<ed> $$0) -> aox.a((CommandContext<ed>)$$0, fd.a.a((CommandContext<ed>)$$0, "range"))))));
        for (ars.c $$4 : ars.c) {
            $$12.then($$4.a((ArgumentBuilder<ed, ?>)ee.b("data"), $$3 -> $$3.then(((RequiredArgumentBuilder)ee.a("path", ex.a()).fork($$03, $$2 -> aox.a((CommandContext<ed>)$$2, $$2, aox.a($$4.a((CommandContext<ed>)$$2), ex.a((CommandContext<ed>)$$2, "path")) > 0))).executes(aox.a($$2, (CommandContext<ed> $$1) -> aox.a($$4.a((CommandContext<ed>)$$1), ex.a((CommandContext<ed>)$$1, "path")))))));
        }
        return $$12;
    }

    private static int a(Iterable<? extends cid> $$0, djj $$1, Predicate<dlt> $$2) {
        int $$3 = 0;
        for (cid cid2 : $$0) {
            IntList $$5 = $$1.a();
            for (int $$6 = 0; $$6 < $$5.size(); ++$$6) {
                dlt $$9;
                int $$7 = $$5.getInt($$6);
                cic $$8 = cid2.a_($$7);
                if ($$8 == null || !$$2.test($$9 = $$8.a())) continue;
                $$3 += $$9.N();
            }
        }
        return $$3;
    }

    private static int a(ed $$0, is $$1, djj $$2, Predicate<dlt> $$3) throws CommandSyntaxException {
        int $$4 = 0;
        ccv $$5 = apj.a($$0, $$1, apj.b);
        int $$6 = $$5.b();
        IntList $$7 = $$2.a();
        for (int $$8 = 0; $$8 < $$7.size(); ++$$8) {
            dlt $$10;
            int $$9 = $$7.getInt($$8);
            if ($$9 < 0 || $$9 >= $$6 || !$$3.test($$10 = $$5.a($$9))) continue;
            $$4 += $$10.N();
        }
        return $$4;
    }

    private static Command<ed> a(boolean $$0, a $$12) {
        if ($$0) {
            return $$1 -> {
                int $$2 = $$12.test((CommandContext<ed>)$$1);
                if ($$2 > 0) {
                    ((ed)$$1.getSource()).a(() -> yh.a("commands.execute.conditional.pass_count", $$2), false);
                    return $$2;
                }
                throw e.create();
            };
        }
        return $$1 -> {
            int $$2 = $$12.test((CommandContext<ed>)$$1);
            if ($$2 == 0) {
                ((ed)$$1.getSource()).a(() -> yh.c("commands.execute.conditional.pass"), false);
                return 1;
            }
            throw f.create((Object)$$2);
        };
    }

    private static int a(arr $$0, ex.g $$1) throws CommandSyntaxException {
        return $$1.b($$0.a());
    }

    private static boolean a(CommandContext<ed> $$0, d $$1) throws CommandSyntaxException {
        fuq $$2 = fk.a($$0, "target");
        fuj $$3 = ez.a($$0, "targetObjective");
        fuq $$4 = fk.a($$0, "source");
        fuj $$5 = ez.a($$0, "sourceObjective");
        anm $$6 = ((ed)$$0.getSource()).m().aK();
        fun $$7 = $$6.d($$2, $$3);
        fun $$8 = $$6.d($$4, $$5);
        if ($$7 == null || $$8 == null) {
            return false;
        }
        return $$1.test($$7.a(), $$8.a());
    }

    private static boolean a(CommandContext<ed> $$0, cq.d $$1) throws CommandSyntaxException {
        fuq $$2 = fk.a($$0, "target");
        fuj $$3 = ez.a($$0, "targetObjective");
        anm $$4 = ((ed)$$0.getSource()).m().aK();
        fun $$5 = $$4.d($$2, $$3);
        if ($$5 == null) {
            return false;
        }
        return $$1.d($$5.a());
    }

    private static boolean a(CommandContext<ed> $$0, cq.b $$1) throws CommandSyntaxException {
        amo $$2 = ev.a($$0, "id");
        cdn $$3 = ((ed)$$0.getSource()).m().aM();
        cdm $$4 = $$3.a($$2);
        if ($$4 == null) {
            throw aqy.a.create((Object)$$2);
        }
        long $$5 = cdn.c();
        double $$6 = $$4.b($$5);
        return $$1.d($$6);
    }

    private static boolean a(ed $$0, jd<frm> $$1) {
        axf $$2 = $$0.f();
        fod $$3 = new fod.a($$2).a(fqx.h, $$0.e()).b(fqx.a, $$0.g()).a(fqw.d);
        fnz $$4 = new fnz.b($$3).a(Optional.empty());
        $$4.b(fnz.a($$1.a()));
        return $$1.a().test($$4);
    }

    private static Collection<ed> a(CommandContext<ed> $$0, boolean $$1, boolean $$2) {
        if ($$2 == $$1) {
            return Collections.singleton((ed)$$0.getSource());
        }
        return Collections.emptyList();
    }

    private static ArgumentBuilder<ed, ?> a(CommandNode<ed> $$0, ArgumentBuilder<ed, ?> $$1, boolean $$22, b $$3) {
        return $$1.fork($$0, $$2 -> aox.a((CommandContext<ed>)$$2, $$22, $$3.test((CommandContext<ed>)$$2))).executes($$2 -> {
            if ($$22 == $$3.test((CommandContext<ed>)$$2)) {
                ((ed)$$2.getSource()).a(() -> yh.c("commands.execute.conditional.pass"), false);
                return 1;
            }
            throw e.create();
        });
    }

    private static ArgumentBuilder<ed, ?> a(CommandNode<ed> $$0, ArgumentBuilder<ed, ?> $$12, boolean $$22, boolean $$3) {
        return $$12.fork($$0, $$2 -> aox.a((CommandContext<ed>)$$2, $$22, aox.c((CommandContext<ed>)$$2, $$3).isPresent())).executes($$22 ? $$1 -> aox.a((CommandContext<ed>)$$1, $$3) : $$1 -> aox.b((CommandContext<ed>)$$1, $$3));
    }

    private static int a(CommandContext<ed> $$0, boolean $$1) throws CommandSyntaxException {
        OptionalInt $$2 = aox.c($$0, $$1);
        if ($$2.isPresent()) {
            ((ed)$$0.getSource()).a(() -> yh.a("commands.execute.conditional.pass_count", $$2.getAsInt()), false);
            return $$2.getAsInt();
        }
        throw e.create();
    }

    private static int b(CommandContext<ed> $$0, boolean $$1) throws CommandSyntaxException {
        OptionalInt $$2 = aox.c($$0, $$1);
        if ($$2.isPresent()) {
            throw f.create((Object)$$2.getAsInt());
        }
        ((ed)$$0.getSource()).a(() -> yh.c("commands.execute.conditional.pass"), false);
        return 1;
    }

    private static OptionalInt c(CommandContext<ed> $$0, boolean $$1) throws CommandSyntaxException {
        return aox.a(((ed)$$0.getSource()).f(), gc.a($$0, "start"), gc.a($$0, "end"), gc.a($$0, "destination"), $$1);
    }

    private static OptionalInt a(axf $$0, is $$1, is $$2, is $$3, boolean $$4) throws CommandSyntaxException {
        ffg $$5 = ffg.a((jy)$$1, (jy)$$2);
        ffg $$6 = ffg.a((jy)$$3, (jy)$$3.a($$5.c()));
        is $$7 = new is($$6.h() - $$5.h(), $$6.i() - $$5.i(), $$6.j() - $$5.j());
        int $$8 = $$5.d() * $$5.e() * $$5.f();
        if ($$8 > 32768) {
            throw d.create((Object)32768, (Object)$$8);
        }
        int $$9 = 0;
        jr $$10 = $$0.J_();
        try (bgp.j $$11 = new bgp.j(b);){
            for (int $$12 = $$5.j(); $$12 <= $$5.m(); ++$$12) {
                for (int $$13 = $$5.i(); $$13 <= $$5.l(); ++$$13) {
                    for (int $$14 = $$5.h(); $$14 <= $$5.k(); ++$$14) {
                        is $$15 = new is($$14, $$13, $$12);
                        is $$16 = $$15.a($$7);
                        eoh $$17 = $$0.a_($$15);
                        if ($$4 && $$17.a(dzs.a)) continue;
                        if ($$17 != $$0.a_($$16)) {
                            OptionalInt optionalInt = OptionalInt.empty();
                            return optionalInt;
                        }
                        elb $$18 = $$0.c_($$15);
                        elb $$19 = $$0.c_($$16);
                        if ($$18 != null) {
                            OptionalInt optionalInt;
                            if ($$19 == null) {
                                optionalInt = OptionalInt.empty();
                                return optionalInt;
                            }
                            if ($$19.s() != $$18.s()) {
                                optionalInt = OptionalInt.empty();
                                return optionalInt;
                            }
                            if (!$$18.u().equals($$19.u())) {
                                optionalInt = OptionalInt.empty();
                                return optionalInt;
                            }
                            fnp $$20 = fnp.a($$11.a($$18.v()), $$10);
                            $$18.f($$20);
                            uz $$21 = $$20.b();
                            fnp $$22 = fnp.a($$11.a($$19.v()), $$10);
                            $$19.f($$22);
                            uz $$23 = $$22.b();
                            if (!$$21.equals($$23)) {
                                OptionalInt optionalInt2 = OptionalInt.empty();
                                return optionalInt2;
                            }
                        }
                        ++$$9;
                    }
                }
            }
        }
        return OptionalInt.of($$9);
    }

    private static RedirectModifier<ed> a(Function<cgk, Optional<cgk>> $$0) {
        return $$12 -> {
            ed $$2 = (ed)$$12.getSource();
            cgk $$3 = $$2.g();
            if ($$3 == null) {
                return List.of();
            }
            return ((Optional)$$0.apply($$3)).filter($$0 -> !$$0.eh()).map($$1 -> List.of($$2.a((cgk)$$1))).orElse(List.of());
        };
    }

    private static RedirectModifier<ed> b(Function<cgk, Stream<cgk>> $$0) {
        return $$1 -> {
            ed $$2 = (ed)$$1.getSource();
            cgk $$3 = $$2.g();
            if ($$3 == null) {
                return List.of();
            }
            return ((Stream)$$0.apply($$3)).filter($$0 -> !$$0.eh()).map($$2::a).toList();
        };
    }

    private static LiteralArgumentBuilder<ed> a(CommandNode<ed> $$02, LiteralArgumentBuilder<ed> $$1) {
        return (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$1.then(ee.b("owner").fork($$02, aox.a((cgk $$0) -> {
            Optional<Object> optional;
            if ($$0 instanceof chs) {
                chs $$1 = (chs)((Object)$$0);
                optional = Optional.ofNullable($$1.U_());
            } else {
                optional = Optional.empty();
            }
            return optional;
        })))).then(ee.b("leasher").fork($$02, aox.a((cgk $$0) -> {
            Optional<Object> optional;
            if ($$0 instanceof chj) {
                chj $$1 = (chj)((Object)$$0);
                optional = Optional.ofNullable($$1.C());
            } else {
                optional = Optional.empty();
            }
            return optional;
        })))).then(ee.b("target").fork($$02, aox.a((cgk $$0) -> {
            Optional<Object> optional;
            if ($$0 instanceof cij) {
                cij $$1 = (cij)((Object)$$0);
                optional = Optional.ofNullable($$1.ag_());
            } else {
                optional = Optional.empty();
            }
            return optional;
        })))).then(ee.b("attacker").fork($$02, aox.a((cgk $$0) -> {
            Optional<Object> optional;
            if ($$0 instanceof cgb) {
                cgb $$1 = (cgb)((Object)$$0);
                optional = Optional.ofNullable($$1.f_());
            } else {
                optional = Optional.empty();
            }
            return optional;
        })))).then(ee.b("vehicle").fork($$02, aox.a((cgk $$0) -> Optional.ofNullable($$0.dz()))))).then(ee.b("controller").fork($$02, aox.a((cgk $$0) -> Optional.ofNullable($$0.dl()))))).then(ee.b("origin").fork($$02, aox.a((cgk $$0) -> {
            Optional<Object> optional;
            if ($$0 instanceof cik) {
                cik $$1 = (cik)((Object)$$0);
                optional = Optional.ofNullable($$1.p());
            } else {
                optional = Optional.empty();
            }
            return optional;
        })))).then(ee.b("passengers").fork($$02, aox.b((cgk $$0) -> $$0.dn().stream())));
    }

    private static ed a(ed $$0, jd.c<cgu<?>> $$1) throws CommandSyntaxException {
        cgk $$2 = aqz.a($$0, $$1, $$0.e(), new uz(), true);
        return $$0.a($$2);
    }

    /*
     * Exception decompiling
     */
    public static <T extends ef<T>> void a(T $$0, List<T> $$1, Function<T, T> $$2, IntPredicate $$3, ContextChain<T> $$4, @Nullable uz $$5, hh<T> $$6, api<CommandContext<T>, Collection<ht<T>>> $$7, hb $$8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static /* synthetic */ void a(List $$0, ef $$1, hh $$2) {
        for (hv $$3 : $$0) {
            $$2.a(new hn<ef>($$3, $$2.b().d(), true).bind($$1));
        }
        $$2.a(hq.a());
    }

    private static /* synthetic */ void a(IntPredicate $$0, List $$1, ef $$2, boolean $$3, int $$4) {
        if ($$0.test($$4)) {
            $$1.add($$2);
        }
    }

    @FunctionalInterface
    static interface b {
        public boolean test(CommandContext<ed> var1) throws CommandSyntaxException;
    }

    @FunctionalInterface
    static interface a {
        public int test(CommandContext<ed> var1) throws CommandSyntaxException;
    }

    static class c
    implements he.a<ed> {
        private final IntPredicate a;

        c(boolean $$02) {
            this.a = $$02 ? $$0 -> $$0 != 0 : $$0 -> $$0 == 0;
        }

        @Override
        public void a(ed $$02, List<ed> $$1, ContextChain<ed> $$2, hb $$3, hh<ed> $$4) {
            aox.a($$02, $$1, apd::a, this.a, $$2, null, $$4, $$0 -> go.a((CommandContext<ed>)$$0, "name"), $$3);
        }
    }

    @FunctionalInterface
    static interface d {
        public boolean test(int var1, int var2);
    }
}

