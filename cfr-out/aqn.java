/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aqn {
    public static void a(CommandDispatcher<ed> $$02, boolean $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("seed").requires(ee.a($$1 ? ee.d : ee.b))).executes($$0 -> {
            long $$1 = ((ed)$$0.getSource()).f().J();
            yw $$2 = yk.a(String.valueOf($$1));
            ((ed)$$0.getSource()).a(() -> yh.a("commands.seed.success", $$2), false);
            return (int)$$1;
        }));
    }
}

