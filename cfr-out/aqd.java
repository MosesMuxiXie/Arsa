/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aqd {
    private static final Logger a = LogUtils.getLogger();

    public static void a(Collection<String> $$0, ed $$12) {
        $$12.m().a($$0).exceptionally($$1 -> {
            a.warn("Failed to execute reload", $$1);
            $$12.b(yh.c("commands.reload.failure"));
            return null;
        });
    }

    private static Collection<String> a(bak $$0, fnt $$1, Collection<String> $$2) {
        $$0.a();
        ArrayList $$3 = Lists.newArrayList($$2);
        List<String> $$4 = $$1.C().a().b();
        for (String $$5 : $$0.c()) {
            if ($$4.contains($$5) || $$3.contains($$5)) continue;
            $$3.add($$5);
        }
        return $$3;
    }

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("reload").requires(ee.a(ee.d))).executes($$0 -> {
            ed $$1 = (ed)$$0.getSource();
            MinecraftServer $$2 = $$1.m();
            bak $$3 = $$2.aE();
            fnt $$4 = $$2.bb();
            Collection<String> $$5 = $$3.e();
            Collection<String> $$6 = aqd.a($$3, $$4, $$5);
            $$1.a(() -> yh.c("commands.reload.success"), true);
            aqd.a($$6, $$1);
            return 0;
        }));
    }
}

