/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 */
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;

public class arl {
    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("warden_spawn_tracker").requires(ee.a(ee.d))).then(ee.b("clear").executes($$0 -> arl.a((ed)$$0.getSource(), (Collection<? extends ddm>)ImmutableList.of((Object)((ed)$$0.getSource()).i()))))).then(ee.b("set").then(ee.a("warning_level", IntegerArgumentType.integer((int)0, (int)4)).executes($$0 -> arl.a((ed)$$0.getSource(), (Collection<? extends ddm>)ImmutableList.of((Object)((ed)$$0.getSource()).i()), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"warning_level"))))));
    }

    private static int a(ed $$0, Collection<? extends ddm> $$12, int $$2) {
        for (ddm ddm2 : $$12) {
            ddm2.ab().ifPresent($$1 -> $$1.a($$2));
        }
        if ($$12.size() == 1) {
            $$0.a(() -> yh.a("commands.warden_spawn_tracker.set.success.single", ((ddm)$$12.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.warden_spawn_tracker.set.success.multiple", $$12.size()), true);
        }
        return $$12.size();
    }

    private static int a(ed $$0, Collection<? extends ddm> $$1) {
        for (ddm ddm2 : $$1) {
            ddm2.ab().ifPresent(dcj::b);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.warden_spawn_tracker.clear.success.single", ((ddm)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
        }
        return $$1.size();
    }
}

