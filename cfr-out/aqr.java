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
import java.util.Collection;
import java.util.Collections;

public class aqr {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("spawnpoint").requires(ee.a(ee.d))).executes($$0 -> aqr.a((ed)$$0.getSource(), Collections.singleton(((ed)$$0.getSource()).i()), is.a(((ed)$$0.getSource()).e()), gl.a))).then(((RequiredArgumentBuilder)ee.a("targets", eq.d()).executes($$0 -> aqr.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), is.a(((ed)$$0.getSource()).e()), gl.a))).then(((RequiredArgumentBuilder)ee.a("pos", gc.a()).executes($$0 -> aqr.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), gc.c((CommandContext<ed>)$$0, "pos"), gl.a))).then(ee.a("rotation", gg.a()).executes($$0 -> aqr.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), gc.c((CommandContext<ed>)$$0, "pos"), gg.a((CommandContext<ed>)$$0, "rotation")))))));
    }

    private static int a(ed $$0, Collection<axg> $$1, is $$2, ge $$3) {
        amt<dwo> $$4 = $$0.f().aq();
        ftl $$5 = $$3.b($$0);
        float $$6 = bgj.f($$5.k);
        float $$7 = bgj.a($$5.j, -90.0f, 90.0f);
        for (axg $$8 : $$1) {
            $$8.a(new axg.a(fne.a.a($$4, $$2, $$6, $$7), true), false);
        }
        String $$9 = $$4.a().toString();
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.spawnpoint.success.single", $$2.u(), $$2.v(), $$2.w(), Float.valueOf($$6), Float.valueOf($$7), $$9, ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.spawnpoint.success.multiple", $$2.u(), $$2.v(), $$2.w(), Float.valueOf($$6), Float.valueOf($$7), $$9, $$1.size()), true);
        }
        return $$1.size();
    }
}

