/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public class aqx {
    public static void a(CommandDispatcher<ed> $$02) {
        RequiredArgumentBuilder $$12 = (RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("targets", eq.d()).executes($$0 -> aqx.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), null, null))).then(ee.b("*").then(ee.a("sound", ev.a()).suggests(ig.a(ig.b)).executes($$0 -> aqx.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), null, ev.a((CommandContext<ed>)$$0, "sound")))));
        for (bdb $$2 : bdb.values()) {
            $$12.then(((LiteralArgumentBuilder)ee.b($$2.a()).executes($$1 -> aqx.a((ed)$$1.getSource(), eq.f((CommandContext<ed>)$$1, "targets"), $$2, null))).then(ee.a("sound", ev.a()).suggests(ig.a(ig.b)).executes($$1 -> aqx.a((ed)$$1.getSource(), eq.f((CommandContext<ed>)$$1, "targets"), $$2, ev.a((CommandContext<ed>)$$1, "sound")))));
        }
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("stopsound").requires(ee.a(ee.d))).then((ArgumentBuilder)$$12));
    }

    private static int a(ed $$0, Collection<axg> $$1, @Nullable bdb $$2, @Nullable amo $$3) {
        ahj $$4 = new ahj($$3, $$2);
        for (axg $$5 : $$1) {
            $$5.g.b($$4);
        }
        if ($$2 != null) {
            if ($$3 != null) {
                $$0.a(() -> yh.a("commands.stopsound.success.source.sound", yh.a($$3), $$2.a()), true);
            } else {
                $$0.a(() -> yh.a("commands.stopsound.success.source.any", new Object[]{$$2.a()}), true);
            }
        } else if ($$3 != null) {
            $$0.a(() -> yh.a("commands.stopsound.success.sourceless.sound", yh.a($$3)), true);
        } else {
            $$0.a(() -> yh.c("commands.stopsound.success.sourceless.any"), true);
        }
        return $$1.size();
    }
}

