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
import java.util.Collection;

public class aos {
    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("dialog").requires(ee.a(ee.d))).then(ee.b("show").then(ee.a("targets", eq.d()).then(ee.a("dialog", fg.d($$1)).executes($$0 -> aos.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), fg.d((CommandContext<ed>)$$0, "dialog"))))))).then(ee.b("clear").then(ee.a("targets", eq.d()).executes($$0 -> aos.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"))))));
    }

    private static int a(ed $$0, Collection<axg> $$1, jd<asj> $$2) {
        for (axg $$3 : $$1) {
            $$3.b($$2);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.dialog.show.single", ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.dialog.show.multiple", $$1.size()), true);
        }
        return $$1.size();
    }

    private static int a(ed $$0, Collection<axg> $$1) {
        for (axg $$2 : $$1) {
            $$2.g.b(abh.a);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.dialog.clear.single", ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.dialog.clear.multiple", $$1.size()), true);
        }
        return $$1.size();
    }
}

