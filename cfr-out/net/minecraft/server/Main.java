/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.Lifecycle
 *  joptsimple.AbstractOptionSpec
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  joptsimple.OptionSpecBuilder
 *  joptsimple.ValueConverter
 *  joptsimple.util.PathConverter
 *  joptsimple.util.PathProperties
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package net.minecraft.server;

import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UncheckedIOException;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import joptsimple.AbstractOptionSpec;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import joptsimple.ValueConverter;
import joptsimple.util.PathConverter;
import joptsimple.util.PathProperties;
import net.minecraft.obfuscate.DontObfuscate;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class Main {
    private static final Logger a = LogUtils.getLogger();

    /*
     * WARNING - void declaration
     */
    @x(a="System.out needed before bootstrap")
    @DontObfuscate
    public static void main(String[] $$0) {
        w.a();
        OptionParser $$1 = new OptionParser();
        OptionSpecBuilder $$2 = $$1.accepts("nogui");
        OptionSpecBuilder $$3 = $$1.accepts("initSettings", "Initializes 'server.properties' and 'eula.txt', then quits");
        OptionSpecBuilder $$4 = $$1.accepts("demo");
        OptionSpecBuilder $$5 = $$1.accepts("bonusChest");
        OptionSpecBuilder $$6 = $$1.accepts("forceUpgrade");
        OptionSpecBuilder $$7 = $$1.accepts("eraseCache");
        OptionSpecBuilder $$8 = $$1.accepts("recreateRegionFiles");
        OptionSpecBuilder $$9 = $$1.accepts("safeMode", "Loads level with vanilla datapack only");
        AbstractOptionSpec $$10 = $$1.accepts("help").forHelp();
        ArgumentAcceptingOptionSpec $$11 = $$1.accepts("universe").withRequiredArg().defaultsTo((Object)".", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$12 = $$1.accepts("world").withRequiredArg();
        ArgumentAcceptingOptionSpec $$13 = $$1.accepts("port").withRequiredArg().ofType(Integer.class).defaultsTo((Object)-1, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec $$14 = $$1.accepts("serverId").withRequiredArg();
        OptionSpecBuilder $$15 = $$1.accepts("jfrProfile");
        ArgumentAcceptingOptionSpec $$16 = $$1.accepts("pidFile").withRequiredArg().withValuesConvertedBy((ValueConverter)new PathConverter(new PathProperties[0]));
        NonOptionArgumentSpec $$17 = $$1.nonOptions();
        try {
            void $$45;
            Dynamic $$38;
            OptionSet $$18 = $$1.parse($$0);
            if ($$18.has((OptionSpec)$$10)) {
                $$1.printHelpOn((OutputStream)System.err);
                return;
            }
            Path $$19 = (Path)$$18.valueOf((OptionSpec)$$16);
            if ($$19 != null) {
                Main.a($$19);
            }
            m.g();
            if ($$18.has((OptionSpec)$$15)) {
                bzu.f.a(bzs.b);
            }
            amv.a();
            amv.c();
            bhs.p();
            Path $$20 = Paths.get("server.properties", new String[0]);
            asa $$21 = new asa($$20);
            $$21.b();
            erz.a($$21.a().U);
            Path $$22 = Paths.get("eula.txt", new String[0]);
            amz $$23 = new amz($$22);
            if ($$18.has((OptionSpec)$$3)) {
                a.info("Initialized '{}' and '{}'", (Object)$$20.toAbsolutePath(), (Object)$$22.toAbsolutePath());
                return;
            }
            if (!$$23.a()) {
                a.info("You need to agree to the EULA in order to run the server. Go to eula.txt for more info.");
                return;
            }
            File $$24 = new File((String)$$18.valueOf((OptionSpec)$$11));
            ano $$25 = ano.a(new YggdrasilAuthenticationService(Proxy.NO_PROXY), $$24);
            String $$26 = Optional.ofNullable((String)$$18.valueOf((OptionSpec)$$12)).orElse($$21.a().o);
            fni $$27 = fni.b($$24.toPath());
            fni.c $$28 = $$27.d($$26);
            if ($$28.m()) {
                void $$37;
                try {
                    Dynamic<?> $$29 = $$28.h();
                    fnj $$30 = $$28.a($$29);
                }
                catch (IOException | vk | vr $$31) {
                    fni.b $$32 = $$28.e();
                    a.warn("Failed to load world data from {}", (Object)$$32.b(), (Object)$$31);
                    a.info("Attempting to use fallback");
                    try {
                        Dynamic<?> $$33 = $$28.i();
                        fnj $$34 = $$28.a($$33);
                    }
                    catch (IOException | vk | vr $$35) {
                        a.error("Failed to load world data from {}", (Object)$$32.c(), (Object)$$35);
                        a.error("Failed to load world data from {} and {}. World files may be corrupted. Shutting down.", (Object)$$32.b(), (Object)$$32.c());
                        return;
                    }
                    $$28.n();
                }
                if ($$37.d()) {
                    a.info("This world must be opened in an older version (like 1.6.4) to be safely converted");
                    return;
                }
                if (!$$37.r()) {
                    a.info("This world was created by an incompatible version.");
                    return;
                }
            } else {
                $$38 = null;
            }
            Dynamic $$39 = $$38;
            boolean $$40 = $$18.has((OptionSpec)$$9);
            if ($$40) {
                a.warn("Safe mode active, only vanilla datapack will be loaded");
            }
            bak $$41 = ban.a($$28);
            try {
                anr.c $$42 = Main.a($$21.a(), $$39, $$40, $$41);
                ans $$43 = (ans)bhs.c(arg_0 -> Main.a($$42, $$39, $$21, $$18, (OptionSpec)$$4, (OptionSpec)$$5, arg_0)).get();
            }
            catch (Exception $$44) {
                a.warn("Failed to load datapacks, can't proceed with server load. You can either fix your datapacks or reset to vanilla with --safeMode", (Throwable)$$44);
                return;
            }
            jr.b $$46 = $$45.c().a();
            fnt $$47 = $$45.d();
            boolean $$48 = $$18.has((OptionSpec)$$8);
            if ($$18.has((OptionSpec)$$6) || $$48) {
                Main.a($$28, $$47, bia.a(), $$18.has((OptionSpec)$$7), () -> true, $$46, $$48);
            }
            $$28.a($$46, $$47);
            final ary $$49 = MinecraftServer.a(arg_0 -> Main.a($$28, $$41, (ans)$$45, $$21, $$25, $$18, (OptionSpec)$$13, (OptionSpec)$$4, (OptionSpec)$$14, (OptionSpec)$$2, (OptionSpec)$$17, arg_0));
            Thread $$50 = new Thread("Server Shutdown Thread"){

                @Override
                public void run() {
                    $$49.a(true);
                }
            };
            $$50.setUncaughtExceptionHandler(new p(a));
            Runtime.getRuntime().addShutdownHook($$50);
        }
        catch (Throwable $$51) {
            a.error(LogUtils.FATAL_MARKER, "Failed to start the minecraft server", $$51);
        }
    }

    private static anr.b<fnt> a(asa $$0, anr.a $$1, jq<esi> $$2, boolean $$3, boolean $$4) {
        evl $$11;
        evo $$10;
        dws $$9;
        if ($$3) {
            dws $$5 = MinecraftServer.e;
            evo $$6 = evo.b;
            evl $$7 = ffe.a($$1.c());
        } else {
            arz $$8 = $$0.a();
            $$9 = new dws($$8.o, $$8.n.get(), $$8.E, $$8.m.get(), false, new eua($$1.b().b()), $$1.b());
            $$10 = $$4 ? $$8.aj.a(true) : $$8.aj;
            $$11 = $$8.a($$1.c());
        }
        evl.b $$12 = $$11.a($$2);
        Lifecycle $$13 = $$12.a().add($$1.c().d());
        return new anr.b<fnt>(new fnm($$9, $$10, $$12.d(), $$13), $$12.b());
    }

    private static void a(Path $$0) {
        try {
            long $$1 = ProcessHandle.current().pid();
            Files.writeString($$0, (CharSequence)Long.toString($$1), new OpenOption[0]);
        }
        catch (IOException $$2) {
            throw new UncheckedIOException($$2);
        }
    }

    private static anr.c a(arz $$0, @Nullable Dynamic<?> $$1, boolean $$2, bak $$3) {
        dxm $$8;
        boolean $$7;
        if ($$1 != null) {
            dxm $$4 = fni.a($$1);
            boolean $$5 = false;
            dxm $$6 = $$4;
        } else {
            $$7 = true;
            $$8 = new dxm($$0.ac, dhb.h);
        }
        anr.d $$9 = new anr.d($$3, $$8, $$2, $$7);
        return new anr.c($$9, ee.a.b, $$0.I);
    }

    private static void a(fni.c $$0, fnt $$1, DataFixer $$2, boolean $$3, BooleanSupplier $$4, jr $$5, boolean $$6) {
        a.info("Forcing world upgrade!");
        try (ccq $$7 = new ccq($$0, $$2, $$1, $$5, $$3, $$6);){
            yh $$8 = null;
            while (!$$7.b()) {
                int $$10;
                yh $$9 = $$7.h();
                if ($$8 != $$9) {
                    $$8 = $$9;
                    a.info($$7.h().getString());
                }
                if (($$10 = $$7.e()) > 0) {
                    int $$11 = $$7.f() + $$7.g();
                    a.info("{}% completed ({} / {} chunks)...", new Object[]{bgj.b((float)$$11 / (float)$$10 * 100.0f), $$11, $$10});
                }
                if (!$$4.getAsBoolean()) {
                    $$7.a();
                    continue;
                }
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedException) {}
            }
        }
    }

    private static /* synthetic */ ary a(fni.c $$0, bak $$1, ans $$2, asa $$3, ano $$4, OptionSet $$5, OptionSpec $$6, OptionSpec $$7, OptionSpec $$8, OptionSpec $$9, OptionSpec $$10, Thread $$11) {
        boolean $$13;
        ary $$12 = new ary($$11, $$0, $$1, $$2, $$3, bia.a(), $$4);
        $$12.b((Integer)$$5.valueOf($$6));
        $$12.d($$5.has($$7));
        $$12.b((String)$$5.valueOf($$8));
        boolean bl2 = $$13 = !$$5.has($$9) && !$$5.valuesOf($$10).contains("nogui");
        if ($$13 && !GraphicsEnvironment.isHeadless()) {
            $$12.bB();
        }
        return $$12;
    }

    private static /* synthetic */ CompletableFuture a(anr.c $$0, Dynamic $$1, asa $$2, OptionSet $$3, OptionSpec $$4, OptionSpec $$52, Executor $$6) {
        return anr.a($$0, (anr.a $$5) -> {
            jq<esi> $$6 = $$5.d().f(mj.bF);
            if ($$1 != null) {
                fnf $$7 = fni.a($$1, $$5.b(), $$6, $$5.c());
                return new anr.b<fnt>($$7.a(), $$7.b().b());
            }
            a.info("No existing world data, creating new world");
            return Main.a($$2, $$5, $$6, $$3.has($$4), $$3.has($$52));
        }, ans::new, bhs.h(), $$6);
    }
}

