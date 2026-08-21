/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aok {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.damage.invulnerable"));

    public static void a(CommandDispatcher<ed> $$02, dz $$1) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("damage").requires(ee.a(ee.d))).then(ee.a("target", eq.a()).then(((RequiredArgumentBuilder)ee.a("amount", FloatArgumentType.floatArg((float)0.0f)).executes($$0 -> aok.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"amount"), ((ed)$$0.getSource()).f().as().p()))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)ee.a("damageType", fe.a($$1, mj.ba)).executes($$0 -> aok.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"amount"), new cex(fe.a((CommandContext<ed>)$$0, "damageType", mj.ba))))).then(ee.b("at").then(ee.a("location", gj.a()).executes($$0 -> aok.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"amount"), new cex(fe.a((CommandContext<ed>)$$0, "damageType", mj.ba), gj.a((CommandContext<ed>)$$0, "location"))))))).then(ee.b("by").then(((RequiredArgumentBuilder)ee.a("entity", eq.a()).executes($$0 -> aok.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"amount"), new cex(fe.a((CommandContext<ed>)$$0, "damageType", mj.ba), eq.a((CommandContext<ed>)$$0, "entity"))))).then(ee.b("from").then(ee.a("cause", eq.a()).executes($$0 -> aok.a((ed)$$0.getSource(), eq.a((CommandContext<ed>)$$0, "target"), FloatArgumentType.getFloat((CommandContext)$$0, (String)"amount"), new cex(fe.a((CommandContext<ed>)$$0, "damageType", mj.ba), eq.a((CommandContext<ed>)$$0, "entity"), eq.a((CommandContext<ed>)$$0, "cause"))))))))))));
    }

    private static int a(ed $$0, cgk $$1, float $$2, cex $$3) throws CommandSyntaxException {
        if ($$1.a($$0.f(), $$3, $$2)) {
            $$0.a(() -> yh.a("commands.damage.success", Float.valueOf($$2), $$1.R_()), true);
            return 1;
        }
        throw a.create();
    }
}

