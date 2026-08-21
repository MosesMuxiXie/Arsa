/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.io.FileUtils
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class apw {
    private static final Logger a = LogUtils.getLogger();
    private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType((Message)yh.c("commands.perf.notRunning"));
    private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType((Message)yh.c("commands.perf.alreadyRunning"));

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("perf").requires(ee.a(ee.f))).then(ee.b("start").executes($$0 -> apw.a((ed)$$0.getSource())))).then(ee.b("stop").executes($$0 -> apw.b((ed)$$0.getSource()))));
    }

    private static int a(ed $$0) throws CommandSyntaxException {
        MinecraftServer $$12 = $$0.m();
        if ($$12.aV()) {
            throw c.create();
        }
        Consumer<bzk> $$22 = $$1 -> apw.a($$0, $$1);
        Consumer<Path> $$3 = $$2 -> apw.a($$0, $$2, $$12);
        $$12.a($$22, $$3);
        $$0.a(() -> yh.c("commands.perf.started"), false);
        return 0;
    }

    private static int b(ed $$0) throws CommandSyntaxException {
        MinecraftServer $$1 = $$0.m();
        if (!$$1.aV()) {
            throw b.create();
        }
        $$1.aX();
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void a(ed $$0, Path $$1, MinecraftServer $$2) {
        void $$6;
        String $$3 = String.format(Locale.ROOT, "%s-%s-%s", bhs.f(), $$2.bb().d(), w.b().b());
        try {
            String $$4 = bfp.a(cbi.a, $$3, ".zip");
        }
        catch (IOException $$5) {
            $$0.b(yh.c("commands.perf.reportFailed"));
            a.error("Failed to create report name", (Throwable)$$5);
            return;
        }
        try (bfq $$7 = new bfq(cbi.a.resolve((String)$$6));){
            $$7.a(Paths.get("system.txt", new String[0]), $$2.b(new y()).a());
            $$7.a($$1);
        }
        try {
            FileUtils.forceDelete((File)$$1.toFile());
        }
        catch (IOException $$8) {
            a.warn("Failed to delete temporary profiling file {}", (Object)$$1, (Object)$$8);
        }
        $$0.a(() -> apw.a((String)$$6), false);
    }

    private static void a(ed $$0, bzk $$1) {
        if ($$1 == bzg.a) {
            return;
        }
        int $$2 = $$1.f();
        double $$3 = (double)$$1.g() / (double)bhn.a;
        $$0.a(() -> yh.a("commands.perf.stopped", new Object[]{String.format(Locale.ROOT, "%.2f", $$3), $$2, String.format(Locale.ROOT, "%.2f", (double)$$2 / $$3)}), false);
    }

    private static /* synthetic */ yh a(String $$0) {
        return yh.a("commands.perf.reportSaved", new Object[]{$$0});
    }
}

