/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aro {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.whitelist.alreadyOn"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.whitelist.alreadyOff"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.whitelist.add.failed"));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("commands.whitelist.remove.failed"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("whitelist").requires(ee.a(ee.e))).then(ee.b("on").executes($$0 -> aro.b((ed)$$0.getSource())))).then(ee.b("off").executes($$0 -> aro.c((ed)$$0.getSource())))).then(ee.b("list").executes($$0 -> aro.d((ed)$$0.getSource())))).then(ee.b("add").then(ee.a("targets", es.a()).suggests(($$0, $$12) -> {
            bbz $$2 = ((ed)$$0.getSource()).m().aj();
            return ei.b($$2.t().stream().map(ddm::gJ).filter($$1 -> !$$2.i().a((bbx)$$1)).map(bbx::b), $$12);
        }).executes($$0 -> aro.a((ed)$$0.getSource(), es.a((CommandContext<ed>)$$0, "targets")))))).then(ee.b("remove").then(ee.a("targets", es.a()).suggests(($$0, $$1) -> ei.a(((ed)$$0.getSource()).m().aj().j(), $$1)).executes($$0 -> aro.b((ed)$$0.getSource(), es.a((CommandContext<ed>)$$0, "targets")))))).then(ee.b("reload").executes($$0 -> aro.a((ed)$$0.getSource()))));
    }

    private static int a(ed $$0) {
        $$0.m().aj().a();
        $$0.a(() -> yh.c("commands.whitelist.reloaded"), true);
        $$0.m().aD();
        return 1;
    }

    private static int a(ed $$0, Collection<bbx> $$1) throws CommandSyntaxException {
        bcj $$2 = $$0.m().aj().i();
        int $$3 = 0;
        for (bbx $$4 : $$1) {
            if ($$2.a($$4)) continue;
            bck $$5 = new bck($$4);
            $$2.a($$5);
            $$0.a(() -> yh.a("commands.whitelist.add.success", yh.b($$4.b())), true);
            ++$$3;
        }
        if ($$3 == 0) {
            throw c.create();
        }
        return $$3;
    }

    private static int b(ed $$0, Collection<bbx> $$1) throws CommandSyntaxException {
        bcj $$2 = $$0.m().aj().i();
        int $$3 = 0;
        for (bbx $$4 : $$1) {
            if (!$$2.a($$4)) continue;
            bck $$5 = new bck($$4);
            $$2.b($$5);
            $$0.a(() -> yh.a("commands.whitelist.remove.success", yh.b($$4.b())), true);
            ++$$3;
        }
        if ($$3 == 0) {
            throw d.create();
        }
        $$0.m().aD();
        return $$3;
    }

    private static int b(ed $$0) throws CommandSyntaxException {
        if ($$0.m().aP()) {
            throw a.create();
        }
        $$0.m().h(true);
        $$0.a(() -> yh.c("commands.whitelist.enabled"), true);
        $$0.m().aD();
        return 1;
    }

    private static int c(ed $$0) throws CommandSyntaxException {
        if (!$$0.m().aP()) {
            throw b.create();
        }
        $$0.m().h(false);
        $$0.a(() -> yh.c("commands.whitelist.disabled"), true);
        return 1;
    }

    private static int d(ed $$0) {
        String[] $$1 = $$0.m().aj().j();
        if ($$1.length == 0) {
            $$0.a(() -> yh.c("commands.whitelist.none"), false);
        } else {
            $$0.a(() -> yh.a("commands.whitelist.list", $$1.length, String.join((CharSequence)", ", $$1)), false);
        }
        return $$1.length;
    }
}

