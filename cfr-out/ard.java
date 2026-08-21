/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class ard {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.teleport.invalidPosition"));

    public static void a(CommandDispatcher<ed> $$02) {
        LiteralCommandNode $$1 = $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("teleport").requires(ee.a(ee.d))).then(ee.a("location", gj.a()).executes($$0 -> ard.a((ed)$$0.getSource(), Collections.singleton(((ed)$$0.getSource()).h()), ((ed)$$0.getSource()).f(), gj.b((CommandContext<ed>)$$0, "location"), null, null)))).then(ee.a("destination", eq.a()).executes($$0 -> ard.a((ed)$$0.getSource(), Collections.singleton(((ed)$$0.getSource()).h()), eq.a((CommandContext<ed>)$$0, "destination"))))).then(((RequiredArgumentBuilder)ee.a("targets", eq.b()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("location", gj.a()).executes($$0 -> ard.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), ((ed)$$0.getSource()).f(), gj.b((CommandContext<ed>)$$0, "location"), null, null))).then(ee.a("rotation", gg.a()).executes($$0 -> ard.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), ((ed)$$0.getSource()).f(), gj.b((CommandContext<ed>)$$0, "location"), gg.a((CommandContext<ed>)$$0, "rotation"), null)))).then(((LiteralArgumentBuilder)ee.b("facing").then(ee.b("entity").then(((RequiredArgumentBuilder)ee.a("facingEntity", eq.a()).executes($$0 -> ard.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), ((ed)$$0.getSource()).f(), gj.b((CommandContext<ed>)$$0, "location"), null, new app.a(eq.a((CommandContext<ed>)$$0, "facingEntity"), ep.a.a)))).then(ee.a("facingAnchor", ep.a()).executes($$0 -> ard.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), ((ed)$$0.getSource()).f(), gj.b((CommandContext<ed>)$$0, "location"), null, new app.a(eq.a((CommandContext<ed>)$$0, "facingEntity"), ep.a((CommandContext<ed>)$$0, "facingAnchor")))))))).then(ee.a("facingLocation", gj.a()).executes($$0 -> ard.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), ((ed)$$0.getSource()).f(), gj.b((CommandContext<ed>)$$0, "location"), null, new app.b(gj.a((CommandContext<ed>)$$0, "facingLocation")))))))).then(ee.a("destination", eq.a()).executes($$0 -> ard.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), eq.a((CommandContext<ed>)$$0, "destination"))))));
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("tp").requires(ee.a(ee.d))).redirect((CommandNode)$$1));
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1, cgk $$2) throws CommandSyntaxException {
        for (cgk cgk2 : $$1) {
            ard.a($$0, cgk2, (axf)$$2.ao(), $$2.dP(), $$2.dR(), $$2.dV(), EnumSet.noneOf(chz.class), $$2.ec(), $$2.ee(), null);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.teleport.success.entity.single", ((cgk)$$2.iterator().next()).R_(), $$2.R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.teleport.success.entity.multiple", $$2.size(), $$2.R_()), true);
        }
        return $$1.size();
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1, axf $$2, ge $$3, @Nullable ge $$4, @Nullable app $$5) throws CommandSyntaxException {
        ftm $$6 = $$3.a($$0);
        ftl $$7 = $$4 == null ? null : $$4.b($$0);
        for (cgk cgk2 : $$1) {
            Set<chz> $$9 = ard.a($$3, $$4, cgk2.ao().aq() == $$2.aq());
            if ($$7 == null) {
                ard.a($$0, cgk2, $$2, $$6.g, $$6.h, $$6.i, $$9, cgk2.ec(), cgk2.ee(), $$5);
                continue;
            }
            ard.a($$0, cgk2, $$2, $$6.g, $$6.h, $$6.i, $$9, $$7.k, $$7.j, $$5);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.teleport.success.location.single", ((cgk)$$6.iterator().next()).R_(), ard.a($$1.g), ard.a($$1.h), ard.a($$1.i)), true);
        } else {
            $$0.a(() -> yh.a("commands.teleport.success.location.multiple", $$6.size(), ard.a($$1.g), ard.a($$1.h), ard.a($$1.i)), true);
        }
        return $$1.size();
    }

    private static Set<chz> a(ge $$0, @Nullable ge $$1, boolean $$2) {
        Set<chz> $$3 = chz.b($$0.a(), $$0.b(), $$0.c());
        Set $$4 = $$2 ? chz.a($$0.a(), $$0.b(), $$0.c()) : Set.of();
        Set<chz> $$5 = $$1 == null ? chz.k : chz.a($$1.b(), $$1.a());
        return chz.a($$3, $$4, $$5);
    }

    private static String a(double $$0) {
        return String.format(Locale.ROOT, "%f", $$0);
    }

    private static void a(ed $$0, cgk $$1, axf $$2, double $$3, double $$4, double $$5, Set<chz> $$6, float $$7, float $$8, @Nullable app $$9) throws CommandSyntaxException {
        chl $$18;
        float $$17;
        is $$10 = is.a($$3, $$4, $$5);
        if (!dwo.p($$10)) {
            throw a.create();
        }
        double $$11 = $$6.contains((Object)chz.a) ? $$3 - $$1.dP() : $$3;
        double $$12 = $$6.contains((Object)chz.b) ? $$4 - $$1.dR() : $$4;
        double $$13 = $$6.contains((Object)chz.c) ? $$5 - $$1.dV() : $$5;
        float $$14 = $$6.contains((Object)chz.d) ? $$7 - $$1.ec() : $$7;
        float $$15 = $$6.contains((Object)chz.e) ? $$8 - $$1.ee() : $$8;
        float $$16 = bgj.f($$14);
        if (!$$1.a($$2, $$11, $$12, $$13, $$6, $$16, $$17 = bgj.f($$15), true)) {
            return;
        }
        if ($$9 != null) {
            $$9.perform($$0, $$1);
        }
        if (!($$1 instanceof chl) || !($$18 = (chl)$$1).gj()) {
            $$1.k($$1.dN().d(1.0, 0.0, 1.0));
            $$1.e(true);
        }
        if ($$1 instanceof cht) {
            cht $$19 = (cht)$$1;
            $$19.N().n();
        }
    }
}

