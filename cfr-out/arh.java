/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.function.Function;

public class arh {
    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("title").requires(ee.a(ee.d))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("targets", eq.d()).then(ee.b("clear").executes($$0 -> arh.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"))))).then(ee.b("reset").executes($$0 -> arh.b((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"))))).then(ee.b("title").then(ee.a("title", em.a($$1)).executes($$0 -> arh.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), em.a((CommandContext<ed>)$$0, "title"), "title", ahe::new))))).then(ee.b("subtitle").then(ee.a("title", em.a($$1)).executes($$0 -> arh.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), em.a((CommandContext<ed>)$$0, "title"), "subtitle", ahc::new))))).then(ee.b("actionbar").then(ee.a("title", em.a($$1)).executes($$0 -> arh.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), em.a((CommandContext<ed>)$$0, "title"), "actionbar", agd::new))))).then(ee.b("times").then(ee.a("fadeIn", fu.a()).then(ee.a("stay", fu.a()).then(ee.a("fadeOut", fu.a()).executes($$0 -> arh.a((ed)$$0.getSource(), eq.f((CommandContext<ed>)$$0, "targets"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"fadeIn"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"stay"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"fadeOut")))))))));
    }

    private static int a(ed $$0, Collection<axg> $$1) {
        adr $$2 = new adr(false);
        for (axg $$3 : $$1) {
            $$3.g.b($$2);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.title.cleared.single", ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.title.cleared.multiple", $$1.size()), true);
        }
        return $$1.size();
    }

    private static int b(ed $$0, Collection<axg> $$1) {
        adr $$2 = new adr(true);
        for (axg $$3 : $$1) {
            $$3.g.b($$2);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.title.reset.single", ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.title.reset.multiple", $$1.size()), true);
        }
        return $$1.size();
    }

    private static int a(ed $$0, Collection<axg> $$1, yh $$2, String $$3, Function<yh, aay<?>> $$4) throws CommandSyntaxException {
        for (axg $$5 : $$1) {
            $$5.g.b($$4.apply(yk.a($$0, $$2, (cgk)$$5, 0)));
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.title.show." + $$3 + ".single", ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.title.show." + $$3 + ".multiple", $$1.size()), true);
        }
        return $$1.size();
    }

    private static int a(ed $$0, Collection<axg> $$1, int $$2, int $$3, int $$4) {
        ahf $$5 = new ahf($$2, $$3, $$4);
        for (axg $$6 : $$1) {
            $$6.g.b($$5);
        }
        if ($$1.size() == 1) {
            $$0.a(() -> yh.a("commands.title.times.single", ((axg)$$1.iterator().next()).R_()), true);
        } else {
            $$0.a(() -> yh.a("commands.title.times.multiple", $$1.size()), true);
        }
        return $$1.size();
    }
}

