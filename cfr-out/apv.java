/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class apv {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.particle.failed"));

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("particle").requires(ee.a(ee.d))).then(((RequiredArgumentBuilder)ee.a("name", fc.a($$1)).executes($$0 -> apv.a((ed)$$0.getSource(), fc.a((CommandContext<ed>)$$0, "name"), ((ed)$$0.getSource()).e(), ftm.c, 0.0f, 0, false, ((ed)$$0.getSource()).m().aj().t()))).then(((RequiredArgumentBuilder)ee.a("pos", gj.a()).executes($$0 -> apv.a((ed)$$0.getSource(), fc.a((CommandContext<ed>)$$0, "name"), gj.a((CommandContext<ed>)$$0, "pos"), ftm.c, 0.0f, 0, false, ((ed)$$0.getSource()).m().aj().t()))).then(ee.a("delta", gj.a(false)).then(ee.a("speed", FloatArgumentType.floatArg((float)0.0f)).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("count", IntegerArgumentType.integer((int)0)).executes($$0 -> apv.a((ed)$$0.getSource(), fc.a((CommandContext<ed>)$$0, "name"), gj.a((CommandContext<ed>)$$0, "pos"), gj.a((CommandContext<ed>)$$0, "delta"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), false, ((ed)$$0.getSource()).m().aj().t()))).then(((LiteralArgumentBuilder)ee.b("force").executes($$0 -> apv.a((ed)$$0.getSource(), fc.a((CommandContext<ed>)$$0, "name"), gj.a((CommandContext<ed>)$$0, "pos"), gj.a((CommandContext<ed>)$$0, "delta"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), true, ((ed)$$0.getSource()).m().aj().t()))).then(ee.a("viewers", eq.d()).executes($$0 -> apv.a((ed)$$0.getSource(), fc.a((CommandContext<ed>)$$0, "name"), gj.a((CommandContext<ed>)$$0, "pos"), gj.a((CommandContext<ed>)$$0, "delta"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), true, eq.f((CommandContext<ed>)$$0, "viewers")))))).then(((LiteralArgumentBuilder)ee.b("normal").executes($$0 -> apv.a((ed)$$0.getSource(), fc.a((CommandContext<ed>)$$0, "name"), gj.a((CommandContext<ed>)$$0, "pos"), gj.a((CommandContext<ed>)$$0, "delta"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), false, ((ed)$$0.getSource()).m().aj().t()))).then(ee.a("viewers", eq.d()).executes($$0 -> apv.a((ed)$$0.getSource(), fc.a((CommandContext<ed>)$$0, "name"), gj.a((CommandContext<ed>)$$0, "pos"), gj.a((CommandContext<ed>)$$0, "delta"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"speed"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"count"), false, eq.f((CommandContext<ed>)$$0, "viewers")))))))))));
    }

    private static int a(ed $$0, lw $$1, ftm $$2, ftm $$3, float $$4, int $$5, boolean $$6, Collection<axg> $$7) throws CommandSyntaxException {
        int $$8 = 0;
        for (axg $$9 : $$7) {
            if (!$$0.f().a($$9, $$1, $$6, false, $$2.g, $$2.h, $$2.i, $$5, $$3.g, $$3.h, $$3.i, $$4)) continue;
            ++$$8;
        }
        if ($$8 == 0) {
            throw a.create();
        }
        $$0.a(() -> yh.a("commands.particle.success", new Object[]{mi.j.b($$1.a()).toString()}), true);
        return $$8;
    }
}

