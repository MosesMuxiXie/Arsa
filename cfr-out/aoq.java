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

public class aoq {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.b("Source is not a mob"));
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.b("Path not found"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.b("Target not reached"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("debugpath").requires(ee.a(ee.d))).then(ee.a("to", gc.a()).executes($$0 -> aoq.a((ed)$$0.getSource(), gc.a((CommandContext<ed>)$$0, "to")))));
    }

    private static int a(ed $$0, is $$1) throws CommandSyntaxException {
        cgk $$2 = $$0.g();
        if (!($$2 instanceof chn)) {
            throw a.create();
        }
        chn $$3 = (chn)$$2;
        crd $$4 = new crd($$3, $$0.f());
        flp $$5 = ((cre)$$4).a($$1, 0);
        if ($$5 == null) {
            throw b.create();
        }
        if (!$$5.j()) {
            throw c.create();
        }
        $$0.a(() -> yh.b("Made path"), true);
        return 1;
    }
}

