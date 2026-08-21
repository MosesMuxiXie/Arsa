/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class aou {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.effect.give.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.effect.clear.everything.failed"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.effect.clear.specific.failed"));

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("effect").requires(ee.a(ee.d))).then(((LiteralArgumentBuilder)ee.b("clear").executes($$0 -> aou.a((ed)$$0.getSource(), (Collection<? extends cgk>)ImmutableList.of((Object)((ed)$$0.getSource()).h())))).then(((RequiredArgumentBuilder)ee.a("targets", eq.b()).executes($$0 -> aou.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets")))).then(ee.a("effect", fe.a($$1, mj.ae)).executes($$0 -> aou.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fe.f((CommandContext<ed>)$$0, "effect"))))))).then(ee.b("give").then(ee.a("targets", eq.b()).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("effect", fe.a($$1, mj.ae)).executes($$0 -> aou.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fe.f((CommandContext<ed>)$$0, "effect"), null, 0, true))).then(((RequiredArgumentBuilder)ee.a("seconds", IntegerArgumentType.integer((int)1, (int)1000000)).executes($$0 -> aou.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fe.f((CommandContext<ed>)$$0, "effect"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seconds"), 0, true))).then(((RequiredArgumentBuilder)ee.a("amplifier", IntegerArgumentType.integer((int)0, (int)255)).executes($$0 -> aou.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fe.f((CommandContext<ed>)$$0, "effect"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seconds"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amplifier"), true))).then(ee.a("hideParticles", BoolArgumentType.bool()).executes($$0 -> aou.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fe.f((CommandContext<ed>)$$0, "effect"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"seconds"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amplifier"), !BoolArgumentType.getBool((CommandContext)$$0, (String)"hideParticles"))))))).then(((LiteralArgumentBuilder)ee.b("infinite").executes($$0 -> aou.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fe.f((CommandContext<ed>)$$0, "effect"), -1, 0, true))).then(((RequiredArgumentBuilder)ee.a("amplifier", IntegerArgumentType.integer((int)0, (int)255)).executes($$0 -> aou.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fe.f((CommandContext<ed>)$$0, "effect"), -1, IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amplifier"), true))).then(ee.a("hideParticles", BoolArgumentType.bool()).executes($$0 -> aou.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets"), fe.f((CommandContext<ed>)$$0, "effect"), -1, IntegerArgumentType.getInteger((CommandContext)$$0, (String)"amplifier"), !BoolArgumentType.getBool((CommandContext)$$0, (String)"hideParticles"))))))))));
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1, jd<cfk> $$2, @Nullable Integer $$3, int $$4, boolean $$5) throws CommandSyntaxException {
        int $$12;
        cfk $$6 = $$2.a();
        int $$7 = 0;
        if ($$3 != null) {
            if ($$6.a()) {
                int $$8 = $$3;
            } else if ($$3 == -1) {
                int $$9 = -1;
            } else {
                int $$10 = $$3 * 20;
            }
        } else if ($$6.a()) {
            boolean $$11 = true;
        } else {
            $$12 = 600;
        }
        for (cgk cgk2 : $$1) {
            cfm $$14;
            if (!(cgk2 instanceof chl) || !((chl)cgk2).b($$14 = new cfm($$2, $$12, $$4, false, $$5), $$0.g())) continue;
            ++$$7;
        }
        if ($$7 == 0) {
            throw a.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.effect.give.success.single", $$6.g(), ((cgk)$$1.iterator().next()).R_(), $$12 / 20), true);
        } else {
            $$0.a(() -> yh.a("commands.effect.give.success.multiple", $$6.g(), $$1.size(), $$12 / 20), true);
        }
        return $$7;
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1) throws CommandSyntaxException {
        int $$2 = 0;
        for (cgk cgk2 : $$1) {
            if (!(cgk2 instanceof chl) || !((chl)cgk2).eV()) continue;
            ++$$2;
        }
        if ($$2 == 0) {
            throw b.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.effect.clear.everything.success.single", ((cgk)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.effect.clear.everything.success.multiple", $$1.size()), true);
        }
        return $$2;
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1, jd<cfk> $$2) throws CommandSyntaxException {
        cfk $$3 = $$2.a();
        int $$4 = 0;
        for (cgk cgk2 : $$1) {
            if (!(cgk2 instanceof chl) || !((chl)cgk2).g($$2)) continue;
            ++$$4;
        }
        if ($$4 == 0) {
            throw c.create();
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.effect.clear.specific.success.single", $$3.g(), ((cgk)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.effect.clear.specific.success.multiple", $$3.g(), $$1.size()), true);
        }
        return $$4;
    }
}

