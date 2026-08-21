/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aoe {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("banlist").requires(ee.a(ee.e))).executes($$0 -> {
            bbz $$1 = ((ed)$$0.getSource()).m().aj();
            return aoe.a((ed)$$0.getSource(), Lists.newArrayList((Iterable)Iterables.concat($$1.f().e(), $$1.g().e())));
        })).then(ee.b("ips").executes($$0 -> aoe.a((ed)$$0.getSource(), ((ed)$$0.getSource()).m().aj().g().e())))).then(ee.b("players").executes($$0 -> aoe.a((ed)$$0.getSource(), ((ed)$$0.getSource()).m().aj().f().e()))));
    }

    private static int a(ed $$0, Collection<? extends bbt<?>> $$1) {
        if ($$1.isEmpty()) {
            $$0.a(() -> yh.c("commands.banlist.none"), false);
        } else {
            $$0.a(() -> yh.a("commands.banlist.list", $$1.size()), false);
            for (bbt<?> $$2 : $$1) {
                $$0.a(() -> yh.a("commands.banlist.entry", $$2.f(), $$2.b(), $$2.e()), false);
            }
        }
        return $$1.size();
    }
}

