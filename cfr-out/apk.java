/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.nio.file.Path;
import java.nio.file.Paths;

public class apk {
    private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType((Message)yh.c("commands.jfr.start.failed"));
    private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> yh.b("commands.jfr.dump.failed", $$0));

    private apk() {
    }

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("jfr").requires(ee.a(ee.f))).then(ee.b("start").executes($$0 -> apk.a((ed)$$0.getSource())))).then(ee.b("stop").executes($$0 -> apk.b((ed)$$0.getSource()))));
    }

    private static int a(ed $$0) throws CommandSyntaxException {
        bzs $$1 = bzs.a($$0.m());
        if (!bzu.f.a($$1)) {
            throw a.create();
        }
        $$0.a(() -> yh.c("commands.jfr.started"), false);
        return 1;
    }

    private static int b(ed $$0) throws CommandSyntaxException {
        try {
            Path $$12 = Paths.get(".", new String[0]).relativize(bzu.f.b().normalize());
            Path $$2 = !$$0.m().q() || w.aX ? $$12.toAbsolutePath() : $$12;
            yw $$3 = yh.b($$12.toString()).a(l.t).a($$1 -> $$1.a(new yf.c($$2.toString())).a(new yo.e(yh.c("chat.copy.click"))));
            $$0.a(() -> yh.a("commands.jfr.stopped", $$3), false);
            return 1;
        }
        catch (Throwable $$4) {
            throw b.create((Object)$$4.getMessage());
        }
    }
}

