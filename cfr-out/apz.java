/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import org.jspecify.annotations.Nullable;

public class apz {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.publish.failed"));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("commands.publish.alreadyPublished", $$0));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("publish").requires(ee.a(ee.f))).executes($$0 -> apz.a((ed)$$0.getSource(), bfx.a(), false, null))).then(((RequiredArgumentBuilder)ee.a("allowCommands", BoolArgumentType.bool()).executes($$0 -> apz.a((ed)$$0.getSource(), bfx.a(), BoolArgumentType.getBool((CommandContext)$$0, (String)"allowCommands"), null))).then(((RequiredArgumentBuilder)ee.a("gamemode", er.a()).executes($$0 -> apz.a((ed)$$0.getSource(), bfx.a(), BoolArgumentType.getBool((CommandContext)$$0, (String)"allowCommands"), er.a((CommandContext<ed>)$$0, "gamemode")))).then(ee.a("port", IntegerArgumentType.integer((int)0, (int)65535)).executes($$0 -> apz.a((ed)$$0.getSource(), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"port"), BoolArgumentType.getBool((CommandContext)$$0, (String)"allowCommands"), er.a((CommandContext<ed>)$$0, "gamemode")))))));
    }

    private static int a(ed $$0, int $$1, boolean $$2, @Nullable dwl $$3) throws CommandSyntaxException {
        if ($$0.m().q()) {
            throw b.create((Object)$$0.m().V());
        }
        if (!$$0.m().a($$3, $$2, $$1)) {
            throw a.create();
        }
        $$0.a(() -> apz.a($$1), true);
        return $$1;
    }

    public static yw a(int $$0) {
        yw $$1 = yk.a(String.valueOf($$0));
        return yh.a("commands.publish.started", $$1);
    }
}

