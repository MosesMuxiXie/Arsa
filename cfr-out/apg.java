/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;

public class apg {
    public static final int a = 100;

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("give").requires(ee.a(ee.d))).then(ee.a("targets", eq.d()).then(((RequiredArgumentBuilder)ee.a("item", gp.a($$1)).executes($$0 -> apg.a((ed)$$0.getSource(), gp.a($$0, "item"), eq.f((CommandContext<ed>)$$0, "targets"), 1))).then(ee.a("count", IntegerArgumentType.integer((int)1)).executes($$0 -> apg.a((ed)$$0.getSource(), gp.a($$0, "item"), eq.f((CommandContext<ed>)$$0, "targets"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count")))))));
    }

    private static int a(ed $$0, gq $$1, Collection<axg> $$2, int $$3) throws CommandSyntaxException {
        dlt $$4 = $$1.a(1, false);
        int $$5 = $$4.k();
        int $$6 = $$5 * 100;
        if ($$3 > $$6) {
            $$0.b(yh.a("commands.give.failed.toomanyitems", $$6, $$4.K()));
            return 0;
        }
        for (axg $$7 : $$2) {
            int $$8 = $$3;
            while ($$8 > 0) {
                int $$9 = Math.min($$5, $$8);
                $$8 -= $$9;
                dlt $$10 = $$1.a($$9, false);
                boolean $$11 = $$7.gK().g($$10);
                if (!$$11 || !$$10.f()) {
                    czl $$12 = $$7.a($$10, false);
                    if ($$12 == null) continue;
                    $$12.k();
                    $$12.b($$7.cY());
                    continue;
                }
                czl $$13 = $$7.a($$4, false);
                if ($$13 != null) {
                    $$13.s();
                }
                $$7.A().a(null, $$7.dP(), $$7.dR(), $$7.dV(), bda.pG, bdb.h, 0.2f, (($$7.ep().i() - $$7.ep().i()) * 0.7f + 1.0f) * 2.0f);
                $$7.cn.d();
            }
        }
        if ($$2.size() == 1) {
            $$0.a(() -> yh.a("commands.give.success.single", $$3, $$4.K(), ((axg)$$2.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.give.success.single", $$3, $$4.K(), $$2.size()), true);
        }
        return $$2.size();
    }
}

