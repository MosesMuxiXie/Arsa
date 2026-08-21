/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class are {
    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("tellraw").requires(ee.a(ee.d))).then(ee.a("targets", eq.d()).then(ee.a("message", em.a($$1)).executes($$0 -> {
            int $$1 = 0;
            for (axg $$2 : eq.f((CommandContext<ed>)$$0, "targets")) {
                $$2.b(em.a((CommandContext<ed>)$$0, "message", $$2), false);
                ++$$1;
            }
            return $$1;
        }))));
    }
}

