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

public class aop {
    public static void a(CommandDispatcher<ed> $$0) {
        LiteralArgumentBuilder $$12 = (LiteralArgumentBuilder)ee.b("debugmobspawning").requires(ee.a(ee.d));
        for (cho $$2 : cho.values()) {
            $$12.then(ee.b($$2.a()).then(ee.a("at", gc.a()).executes($$1 -> aop.a((ed)$$1.getSource(), $$2, gc.a((CommandContext<ed>)$$1, "at")))));
        }
        $$0.register($$12);
    }

    private static int a(ed $$0, cho $$1, is $$2) {
        dwz.a($$1, $$0.f(), $$2);
        return 1;
    }
}

