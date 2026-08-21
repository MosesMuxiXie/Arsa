/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arb {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.team.add.duplicate"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.team.empty.unchanged"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.team.option.name.unchanged"));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("commands.team.option.color.unchanged"));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("commands.team.option.friendlyfire.alreadyEnabled"));
    private static final SimpleCommandExceptionType f = new SimpleCommandExceptionType((Message)yh.c("commands.team.option.friendlyfire.alreadyDisabled"));
    private static final SimpleCommandExceptionType g = new SimpleCommandExceptionType((Message)yh.c("commands.team.option.seeFriendlyInvisibles.alreadyEnabled"));
    private static final SimpleCommandExceptionType h = new SimpleCommandExceptionType((Message)yh.c("commands.team.option.seeFriendlyInvisibles.alreadyDisabled"));
    private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType((Message)yh.c("commands.team.option.nametagVisibility.unchanged"));
    private static final SimpleCommandExceptionType j = new SimpleCommandExceptionType((Message)yh.c("commands.team.option.deathMessageVisibility.unchanged"));
    private static final SimpleCommandExceptionType k = new SimpleCommandExceptionType((Message)yh.c("commands.team.option.collisionRule.unchanged"));

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("team").requires(ee.a(ee.d))).then(((LiteralArgumentBuilder)ee.b("list").executes($$0 -> arb.a((ed)$$0.getSource()))).then(ee.a("team", fr.a()).executes($$0 -> arb.c((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team")))))).then(ee.b("add").then(((RequiredArgumentBuilder)ee.a("team", StringArgumentType.word()).executes($$0 -> arb.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"team")))).then(ee.a("displayName", em.a($$1)).executes($$0 -> arb.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"team"), em.b((CommandContext<ed>)$$0, "displayName"))))))).then(ee.b("remove").then(ee.a("team", fr.a()).executes($$0 -> arb.b((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team")))))).then(ee.b("empty").then(ee.a("team", fr.a()).executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team")))))).then(ee.b("join").then(((RequiredArgumentBuilder)ee.a("team", fr.a()).executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), Collections.singleton(((ed)$$0.getSource()).h())))).then(ee.a("members", fk.b()).suggests(fk.a).executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fk.c((CommandContext<ed>)$$0, "members"))))))).then(ee.b("leave").then(ee.a("members", fk.b()).suggests(fk.a).executes($$0 -> arb.a((ed)$$0.getSource(), fk.c((CommandContext<ed>)$$0, "members")))))).then(ee.b("modify").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("team", fr.a()).then(ee.b("displayName").then(ee.a("displayName", em.a($$1)).executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), em.b((CommandContext<ed>)$$0, "displayName")))))).then(ee.b("color").then(ee.a("value", el.a()).executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), el.a((CommandContext<ed>)$$0, "value")))))).then(ee.b("friendlyFire").then(ee.a("allowed", BoolArgumentType.bool()).executes($$0 -> arb.b((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), BoolArgumentType.getBool((CommandContext)$$0, (String)"allowed")))))).then(ee.b("seeFriendlyInvisibles").then(ee.a("allowed", BoolArgumentType.bool()).executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), BoolArgumentType.getBool((CommandContext)$$0, (String)"allowed")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("nametagVisibility").then(ee.b("never").executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.b.b)))).then(ee.b("hideForOtherTeams").executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.b.c)))).then(ee.b("hideForOwnTeam").executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.b.d)))).then(ee.b("always").executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.b.a))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("deathMessageVisibility").then(ee.b("never").executes($$0 -> arb.b((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.b.b)))).then(ee.b("hideForOtherTeams").executes($$0 -> arb.b((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.b.c)))).then(ee.b("hideForOwnTeam").executes($$0 -> arb.b((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.b.d)))).then(ee.b("always").executes($$0 -> arb.b((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.b.a))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("collisionRule").then(ee.b("never").executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.a.b)))).then(ee.b("pushOwnTeam").executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.a.d)))).then(ee.b("pushOtherTeams").executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.a.c)))).then(ee.b("always").executes($$0 -> arb.a((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), fut.a.a))))).then(ee.b("prefix").then(ee.a("prefix", em.a($$1)).executes($$0 -> arb.b((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), em.b((CommandContext<ed>)$$0, "prefix")))))).then(ee.b("suffix").then(ee.a("suffix", em.a($$1)).executes($$0 -> arb.c((ed)$$0.getSource(), fr.a((CommandContext<ed>)$$0, "team"), em.b((CommandContext<ed>)$$0, "suffix"))))))));
    }

    private static yh a(Collection<fuq> $$0) {
        return $$0.iterator().next().hH();
    }

    private static int a(ed $$0, Collection<fuq> $$1) {
        anm $$2 = $$0.m().aK();
        for (fuq $$3 : $$1) {
            $$2.d($$3.da());
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.team.leave.success.single", arb.a($$1)), true);
        } else {
            $$0.a(() -> yh.a("commands.team.leave.success.multiple", $$1.size()), true);
        }
        return $$1.size();
    }

    private static int a(ed $$0, fum $$1, Collection<fuq> $$2) {
        anm $$3 = $$0.m().aK();
        for (fuq $$4 : $$2) {
            ((fur)$$3).a($$4.da(), $$1);
        }
        if ($$2.size() == 1) {
            $$0.a(() -> yh.a("commands.team.join.success.single", arb.a($$2), $$1.e()), true);
        } else {
            $$0.a(() -> yh.a("commands.team.join.success.multiple", $$2.size(), $$1.e()), true);
        }
        return $$2.size();
    }

    private static int a(ed $$0, fum $$1, fut.b $$2) throws CommandSyntaxException {
        if ($$1.k() == $$2) {
            throw i.create();
        }
        $$1.a($$2);
        $$0.a(() -> yh.a("commands.team.option.nametagVisibility.success", $$1.e(), $$2.a()), true);
        return 0;
    }

    private static int b(ed $$0, fum $$1, fut.b $$2) throws CommandSyntaxException {
        if ($$1.l() == $$2) {
            throw j.create();
        }
        $$1.b($$2);
        $$0.a(() -> yh.a("commands.team.option.deathMessageVisibility.success", $$1.e(), $$2.a()), true);
        return 0;
    }

    private static int a(ed $$0, fum $$1, fut.a $$2) throws CommandSyntaxException {
        if ($$1.m() == $$2) {
            throw k.create();
        }
        $$1.a($$2);
        $$0.a(() -> yh.a("commands.team.option.collisionRule.success", $$1.e(), $$2.a()), true);
        return 0;
    }

    private static int a(ed $$0, fum $$1, boolean $$2) throws CommandSyntaxException {
        if ($$1.j() == $$2) {
            if ($$2) {
                throw g.create();
            }
            throw h.create();
        }
        $$1.b($$2);
        $$0.a(() -> yh.a("commands.team.option.seeFriendlyInvisibles." + ($$2 ? "enabled" : "disabled"), $$1.e()), true);
        return 0;
    }

    private static int b(ed $$0, fum $$1, boolean $$2) throws CommandSyntaxException {
        if ($$1.i() == $$2) {
            if ($$2) {
                throw e.create();
            }
            throw f.create();
        }
        $$1.a($$2);
        $$0.a(() -> yh.a("commands.team.option.friendlyfire." + ($$2 ? "enabled" : "disabled"), $$1.e()), true);
        return 0;
    }

    private static int a(ed $$0, fum $$1, yh $$2) throws CommandSyntaxException {
        if ($$1.d().equals($$2)) {
            throw c.create();
        }
        $$1.a($$2);
        $$0.a(() -> yh.a("commands.team.option.name.success", $$1.e()), true);
        return 0;
    }

    private static int a(ed $$0, fum $$1, l $$2) throws CommandSyntaxException {
        if ($$1.o() == $$2) {
            throw d.create();
        }
        $$1.a($$2);
        $$0.a(() -> yh.a("commands.team.option.color.success", $$1.e(), $$2.g()), true);
        return 0;
    }

    private static int a(ed $$0, fum $$1) throws CommandSyntaxException {
        anm $$2 = $$0.m().aK();
        ArrayList $$3 = Lists.newArrayList($$1.h());
        if ($$3.isEmpty()) {
            throw b.create();
        }
        for (String $$4 : $$3) {
            ((fur)$$2).b($$4, $$1);
        }
        $$0.a(() -> yh.a("commands.team.empty.success", $$3.size(), $$1.e()), true);
        return $$3.size();
    }

    private static int b(ed $$0, fum $$1) {
        anm $$2 = $$0.m().aK();
        $$2.d($$1);
        $$0.a(() -> yh.a("commands.team.remove.success", $$1.e()), true);
        return $$2.f().size();
    }

    private static int a(ed $$0, String $$1) throws CommandSyntaxException {
        return arb.a($$0, $$1, (yh)yh.b($$1));
    }

    private static int a(ed $$0, String $$1, yh $$2) throws CommandSyntaxException {
        anm $$3 = $$0.m().aK();
        if ($$3.b($$1) != null) {
            throw a.create();
        }
        fum $$4 = $$3.c($$1);
        $$4.a($$2);
        $$0.a(() -> yh.a("commands.team.add.success", $$4.e()), true);
        return $$3.f().size();
    }

    private static int c(ed $$0, fum $$1) {
        Collection<String> $$2 = $$1.h();
        if ($$2.isEmpty()) {
            $$0.a(() -> yh.a("commands.team.list.members.empty", $$1.e()), false);
        } else {
            $$0.a(() -> yh.a("commands.team.list.members.success", $$1.e(), $$2.size(), yk.a($$2)), false);
        }
        return $$2.size();
    }

    private static int a(ed $$0) {
        Collection<fum> $$1 = $$0.m().aK().f();
        if ($$1.isEmpty()) {
            $$0.a(() -> yh.c("commands.team.list.teams.empty"), false);
        } else {
            $$0.a(() -> yh.a("commands.team.list.teams.success", $$1.size(), yk.b($$1, fum::e)), false);
        }
        return $$1.size();
    }

    private static int b(ed $$0, fum $$1, yh $$2) {
        $$1.b($$2);
        $$0.a(() -> yh.a("commands.team.option.prefix.success", $$2), false);
        return 1;
    }

    private static int c(ed $$0, fum $$1, yh $$2) {
        $$1.c($$2);
        $$0.a(() -> yh.a("commands.team.option.suffix.success", $$2), false);
        return 1;
    }
}

