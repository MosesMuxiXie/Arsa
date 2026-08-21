/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aqz {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.summon.failed"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.summon.failed.peaceful"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.summon.failed.uuid"));
    private static final SimpleCommandExceptionType d = new SimpleCommandExceptionType((Message)yh.c("commands.summon.invalidPosition"));

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("summon").requires(ee.a(ee.d))).then(((RequiredArgumentBuilder)ee.a("entity", fe.a($$1, mj.F)).suggests(ig.a(ig.c)).executes($$0 -> aqz.b((ed)$$0.getSource(), fe.e((CommandContext<ed>)$$0, "entity"), ((ed)$$0.getSource()).e(), new uz(), true))).then(((RequiredArgumentBuilder)ee.a("pos", gj.a()).executes($$0 -> aqz.b((ed)$$0.getSource(), fe.e((CommandContext<ed>)$$0, "entity"), gj.a((CommandContext<ed>)$$0, "pos"), new uz(), true))).then(ee.a("nbt", en.a()).executes($$0 -> aqz.b((ed)$$0.getSource(), fe.e((CommandContext<ed>)$$0, "entity"), gj.a((CommandContext<ed>)$$0, "pos"), en.a($$0, "nbt"), false))))));
    }

    public static cgk a(ed $$0, jd.c<cgu<?>> $$12, ftm $$2, uz $$3, boolean $$4) throws CommandSyntaxException {
        is $$5 = is.a($$2);
        if (!dwo.p($$5)) {
            throw d.create();
        }
        if ($$0.f().av() == ccz.a && !$$12.a().s()) {
            throw b.create();
        }
        uz $$6 = $$3.l();
        $$6.a("id", $$12.h().a().toString());
        axf $$7 = $$0.f();
        cgk $$8 = cgu.a($$6, (dwo)$$7, cgt.n, $$1 -> {
            $$1.b($$0.g, $$0.h, $$0.i, $$1.ec(), $$1.ee());
            return $$1;
        });
        if ($$8 == null) {
            throw a.create();
        }
        if ($$4 && $$8 instanceof chn) {
            chn $$9 = (chn)$$8;
            $$9.a((dxf)$$0.f(), $$0.f().c($$8.dK()), cgt.n, null);
        }
        if (!$$7.e($$8)) {
            throw c.create();
        }
        return $$8;
    }

    private static int b(ed $$0, jd.c<cgu<?>> $$1, ftm $$2, uz $$3, boolean $$4) throws CommandSyntaxException {
        cgk $$5 = aqz.a($$0, $$1, $$2, $$3, $$4);
        $$0.a(() -> yh.a("commands.summon.success", $$5.R_()), true);
        return 1;
    }
}

