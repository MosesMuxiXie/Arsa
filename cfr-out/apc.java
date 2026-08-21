/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class apc {
    private static final int a = 256;
    private static final Dynamic2CommandExceptionType b = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.forceload.toobig", $$0, $$1));
    private static final Dynamic2CommandExceptionType c = new Dynamic2CommandExceptionType(($$0, $$1) -> yh.b("commands.forceload.query.failure", $$0, $$1));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("commands.forceload.added.failure"));
    private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType((Message)yh.c("commands.forceload.removed.failure"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("forceload").requires(ee.a(ee.d))).then(ee.b("add").then(((RequiredArgumentBuilder)ee.a("from", gd.a()).executes($$0 -> apc.a((ed)$$0.getSource(), gd.a((CommandContext<ed>)$$0, "from"), gd.a((CommandContext<ed>)$$0, "from"), true))).then(ee.a("to", gd.a()).executes($$0 -> apc.a((ed)$$0.getSource(), gd.a((CommandContext<ed>)$$0, "from"), gd.a((CommandContext<ed>)$$0, "to"), true)))))).then(((LiteralArgumentBuilder)ee.b("remove").then(((RequiredArgumentBuilder)ee.a("from", gd.a()).executes($$0 -> apc.a((ed)$$0.getSource(), gd.a((CommandContext<ed>)$$0, "from"), gd.a((CommandContext<ed>)$$0, "from"), false))).then(ee.a("to", gd.a()).executes($$0 -> apc.a((ed)$$0.getSource(), gd.a((CommandContext<ed>)$$0, "from"), gd.a((CommandContext<ed>)$$0, "to"), false))))).then(ee.b("all").executes($$0 -> apc.b((ed)$$0.getSource()))))).then(((LiteralArgumentBuilder)ee.b("query").executes($$0 -> apc.a((ed)$$0.getSource()))).then(ee.a("pos", gd.a()).executes($$0 -> apc.a((ed)$$0.getSource(), gd.a((CommandContext<ed>)$$0, "pos"))))));
    }

    private static int a(ed $$0, awq $$1) throws CommandSyntaxException {
        dvu $$2 = $$1.a();
        axf $$3 = $$0.f();
        amt<dwo> $$4 = $$3.aq();
        boolean $$5 = $$3.D().contains($$2.b());
        if ($$5) {
            $$0.a(() -> yh.a("commands.forceload.query.success", yh.a($$2), yh.a($$4.a())), false);
            return 1;
        }
        throw c.create((Object)$$2, (Object)$$4.a());
    }

    private static int a(ed $$0) {
        axf $$1 = $$0.f();
        amt<dwo> $$2 = $$1.aq();
        LongSet $$3 = $$1.D();
        int $$4 = $$3.size();
        if ($$4 > 0) {
            String $$5 = Joiner.on((String)", ").join($$3.stream().sorted().map(dvu::new).map(dvu::toString).iterator());
            if ($$4 == 1) {
                $$0.a(() -> yh.a("commands.forceload.list.single", yh.a($$2.a()), $$5), false);
            } else {
                $$0.a(() -> yh.a("commands.forceload.list.multiple", $$4, yh.a($$2.a()), $$5), false);
            }
        } else {
            $$0.b(yh.a("commands.forceload.added.none", yh.a($$2.a())));
        }
        return $$4;
    }

    private static int b(ed $$0) {
        axf $$12 = $$0.f();
        amt<dwo> $$2 = $$12.aq();
        LongSet $$3 = $$12.D();
        $$3.forEach($$1 -> $$12.a(dvu.a($$1), dvu.b($$1), false));
        $$0.a(() -> yh.a("commands.forceload.removed.all", yh.a($$2.a())), true);
        return 0;
    }

    private static int a(ed $$0, awq $$1, awq $$2, boolean $$3) throws CommandSyntaxException {
        int $$11;
        int $$4 = Math.min($$1.c(), $$2.c());
        int $$5 = Math.min($$1.d(), $$2.d());
        int $$6 = Math.max($$1.c(), $$2.c());
        int $$7 = Math.max($$1.d(), $$2.d());
        if ($$4 < -30000000 || $$5 < -30000000 || $$6 >= 30000000 || $$7 >= 30000000) {
            throw gc.b.create();
        }
        int $$8 = jw.a($$4);
        int $$9 = jw.a($$5);
        int $$10 = jw.a($$6);
        long $$12 = ((long)($$10 - $$8) + 1L) * ((long)(($$11 = jw.a($$7)) - $$9) + 1L);
        if ($$12 > 256L) {
            throw b.create((Object)256, (Object)$$12);
        }
        axf $$13 = $$0.f();
        amt<dwo> $$14 = $$13.aq();
        dvu $$15 = null;
        int $$16 = 0;
        for (int $$17 = $$8; $$17 <= $$10; ++$$17) {
            for (int $$18 = $$9; $$18 <= $$11; ++$$18) {
                boolean $$19 = $$13.a($$17, $$18, $$3);
                if (!$$19) continue;
                ++$$16;
                if ($$15 != null) continue;
                $$15 = new dvu($$17, $$18);
            }
        }
        dvu $$20 = $$15;
        int $$21 = $$16;
        if ($$21 == 0) {
            throw ($$3 ? d : e).create();
        }
        if ($$21 == 1) {
            $$0.a(() -> yh.a("commands.forceload." + ($$3 ? "added" : "removed") + ".single", yh.a($$20), yh.a($$14.a())), true);
        } else {
            dvu $$22 = new dvu($$8, $$9);
            dvu $$23 = new dvu($$10, $$11);
            $$0.a(() -> yh.a("commands.forceload." + ($$3 ? "added" : "removed") + ".multiple", $$21, yh.a($$14.a()), yh.a($$22), yh.a($$23)), true);
        }
        return $$21;
    }
}

