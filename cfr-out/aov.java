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

public class aov {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)ee.b("me").then(ee.a("action", ew.a()).executes($$0 -> {
            ew.a((CommandContext<ed>)$$0, "action", $$1 -> {
                ed $$2 = (ed)$$0.getSource();
                bbz $$3 = $$2.m().aj();
                $$3.a((yy)$$1, $$2, yd.a(yd.k, $$2));
            });
            return 1;
        })));
    }
}

