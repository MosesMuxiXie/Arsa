/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;

public class apm {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("kill").requires(ee.a(ee.d))).executes($$0 -> apm.a((ed)$$0.getSource(), (Collection<? extends cgk>)ImmutableList.of((Object)((ed)$$0.getSource()).h())))).then(ee.a("targets", eq.b()).executes($$0 -> apm.a((ed)$$0.getSource(), eq.b((CommandContext<ed>)$$0, "targets")))));
    }

    private static int a(ed $$0, Collection<? extends cgk> $$1) {
        for (cgk cgk2 : $$1) {
            cgk2.c($$0.f());
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.kill.success.single", ((cgk)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.kill.success.multiple", $$1.size()), true);
        }
        return $$1.size();
    }
}

