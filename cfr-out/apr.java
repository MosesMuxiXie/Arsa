/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.tree.CommandNode
 *  com.mojang.brigadier.tree.LiteralCommandNode
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;

public class apr {
    public static void a(CommandDispatcher<ed> $$02) {
        LiteralCommandNode $$1 = $$02.register((LiteralArgumentBuilder)ee.b("msg").then(ee.a("targets", eq.d()).then(ee.a("message", ew.a()).executes($$0 -> {
            Collection<axg> $$1 = eq.f((CommandContext<ed>)$$0, "targets");
            if (!$$1.isEmpty()) {
                ew.a((CommandContext<ed>)$$0, "message", (yy $$2) -> apr.a((ed)$$0.getSource(), $$1, $$2));
            }
            return $$1.size();
        }))));
        $$02.register((LiteralArgumentBuilder)ee.b("tell").redirect((CommandNode)$$1));
        $$02.register((LiteralArgumentBuilder)ee.b("w").redirect((CommandNode)$$1));
    }

    private static void a(ed $$0, Collection<axg> $$1, yy $$2) {
        yd.a $$3 = yd.a(yd.g, $$0);
        yx $$4 = yx.a($$2);
        boolean $$5 = false;
        for (axg $$6 : $$1) {
            yd.a $$7 = yd.a(yd.h, $$0).c($$6.R_());
            $$0.a($$4, false, $$7);
            boolean $$8 = $$0.a($$6);
            $$6.a($$4, $$8, $$3);
            $$5 |= $$8 && $$2.j();
        }
        if ($$5) {
            $$0.a(bbz.e);
        }
    }
}

