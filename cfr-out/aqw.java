/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aqw {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("stop").requires(ee.a(ee.f))).executes($$0 -> {
            ((ed)$$0.getSource()).a(() -> yh.c("commands.stop.stopping"), true);
            ((ed)$$0.getSource()).m().a(false);
            return 1;
        }));
    }
}

