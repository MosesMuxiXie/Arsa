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

public class ape {
    public static final bbj a = new bbj.b(bbr.b);

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("gamemode").requires(ee.a(a))).then(((RequiredArgumentBuilder)ee.a("gamemode", er.a()).executes($$0 -> ape.a((CommandContext<ed>)$$0, Collections.singleton(((ed)$$0.getSource()).i()), er.a((CommandContext<ed>)$$0, "gamemode")))).then(ee.a("target", eq.d()).executes($$0 -> ape.a((CommandContext<ed>)$$0, eq.f((CommandContext<ed>)$$0, "target"), er.a((CommandContext<ed>)$$0, "gamemode"))))));
    }

    private static void a(ed $$0, axg $$1, dwl $$2) {
        yw $$3 = yh.c("gameMode." + $$2.b());
        if ($$0.g() == $$1) {
            $$0.a(() -> yh.a("commands.gamemode.success.self", $$3), true);
        } else {
            if ($$0.f().U().a(eua.R).booleanValue()) {
                $$1.a(yh.a("gameMode.changed", $$3));
            }
            $$0.a(() -> yh.a("commands.gamemode.success.other", $$1.R_(), $$3), true);
        }
    }

    private static int a(CommandContext<ed> $$0, Collection<axg> $$1, dwl $$2) {
        int $$3 = 0;
        for (axg $$4 : $$1) {
            if (!ape.b((ed)$$0.getSource(), $$4, $$2)) continue;
            ++$$3;
        }
        return $$3;
    }

    public static void a(axg $$0, dwl $$1) {
        ape.b($$0.C(), $$0, $$1);
    }

    private static boolean b(ed $$0, axg $$1, dwl $$2) {
        if ($$1.a($$2)) {
            ape.a($$0, $$1, $$2);
            return true;
        }
        return false;
    }
}

