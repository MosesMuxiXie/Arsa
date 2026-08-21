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

public class aqk {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("say").requires(ee.a(ee.d))).then(ee.a("message", ew.a()).executes($$0 -> {
            ew.a((CommandContext<ed>)$$0, "message", $$1 -> {
                ed $$2 = (ed)$$0.getSource();
                bbz $$3 = $$2.m().aj();
                $$3.a((yy)$$1, $$2, yd.a(yd.f, $$2));
            });
            return 1;
        })));
    }
}

