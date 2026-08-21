/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogUtils
 *  com.mojang.util.UndashedUuid
 *  joptsimple.ArgumentAcceptingOptionSpec
 *  joptsimple.NonOptionArgumentSpec
 *  joptsimple.OptionParser
 *  joptsimple.OptionSet
 *  joptsimple.OptionSpec
 *  joptsimple.OptionSpecBuilder
 *  org.apache.commons.lang3.StringEscapeUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package net.minecraft.client.main;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.io.File;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import joptsimple.ArgumentAcceptingOptionSpec;
import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import joptsimple.OptionSpecBuilder;
import net.minecraft.obfuscate.DontObfuscate;
import org.apache.commons.lang3.StringEscapeUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class Main {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @DontObfuscate
    public static void main(String[] $$0) {
        void $$69;
        void $$68;
        OptionParser $$1 = new OptionParser();
        $$1.allowsUnrecognizedOptions();
        $$1.accepts("demo");
        $$1.accepts("disableMultiplayer");
        $$1.accepts("disableChat");
        $$1.accepts("fullscreen");
        $$1.accepts("checkGlErrors");
        OptionSpecBuilder $$2 = $$1.accepts("renderDebugLabels");
        OptionSpecBuilder $$3 = $$1.accepts("jfrProfile");
        OptionSpecBuilder $$4 = $$1.accepts("tracy");
        OptionSpecBuilder $$5 = $$1.accepts("tracyNoImages");
        ArgumentAcceptingOptionSpec $$6 = $$1.accepts("quickPlayPath").withRequiredArg();
        ArgumentAcceptingOptionSpec $$7 = $$1.accepts("quickPlaySingleplayer").withOptionalArg();
        ArgumentAcceptingOptionSpec $$8 = $$1.accepts("quickPlayMultiplayer").withRequiredArg();
        ArgumentAcceptingOptionSpec $$9 = $$1.accepts("quickPlayRealms").withRequiredArg();
        ArgumentAcceptingOptionSpec $$10 = $$1.accepts("gameDir").withRequiredArg().ofType(File.class).defaultsTo((Object)new File("."), (Object[])new File[0]);
        ArgumentAcceptingOptionSpec $$11 = $$1.accepts("assetsDir").withRequiredArg().ofType(File.class);
        ArgumentAcceptingOptionSpec $$12 = $$1.accepts("resourcePackDir").withRequiredArg().ofType(File.class);
        ArgumentAcceptingOptionSpec $$13 = $$1.accepts("proxyHost").withRequiredArg();
        ArgumentAcceptingOptionSpec $$14 = $$1.accepts("proxyPort").withRequiredArg().defaultsTo((Object)"8080", (Object[])new String[0]).ofType(Integer.class);
        ArgumentAcceptingOptionSpec $$15 = $$1.accepts("proxyUser").withRequiredArg();
        ArgumentAcceptingOptionSpec $$16 = $$1.accepts("proxyPass").withRequiredArg();
        ArgumentAcceptingOptionSpec $$17 = $$1.accepts("username").withRequiredArg().defaultsTo((Object)("Player" + System.currentTimeMillis() % 1000L), (Object[])new String[0]);
        OptionSpecBuilder $$18 = $$1.accepts("offlineDeveloperMode");
        ArgumentAcceptingOptionSpec $$19 = $$1.accepts("uuid").withRequiredArg();
        ArgumentAcceptingOptionSpec $$20 = $$1.accepts("xuid").withOptionalArg().defaultsTo((Object)"", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$21 = $$1.accepts("clientId").withOptionalArg().defaultsTo((Object)"", (Object[])new String[0]);
        ArgumentAcceptingOptionSpec $$22 = $$1.accepts("accessToken").withRequiredArg().required();
        ArgumentAcceptingOptionSpec $$23 = $$1.accepts("version").withRequiredArg().required();
        ArgumentAcceptingOptionSpec $$24 = $$1.accepts("width").withRequiredArg().ofType(Integer.class).defaultsTo((Object)854, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec $$25 = $$1.accepts("height").withRequiredArg().ofType(Integer.class).defaultsTo((Object)480, (Object[])new Integer[0]);
        ArgumentAcceptingOptionSpec $$26 = $$1.accepts("fullscreenWidth").withRequiredArg().ofType(Integer.class);
        ArgumentAcceptingOptionSpec $$27 = $$1.accepts("fullscreenHeight").withRequiredArg().ofType(Integer.class);
        ArgumentAcceptingOptionSpec $$28 = $$1.accepts("assetIndex").withRequiredArg();
        ArgumentAcceptingOptionSpec $$29 = $$1.accepts("versionType").withRequiredArg().defaultsTo((Object)"release", (Object[])new String[0]);
        NonOptionArgumentSpec $$30 = $$1.nonOptions();
        OptionSet $$31 = $$1.parse($$0);
        File $$32 = (File)Main.a($$31, $$10);
        String $$33 = (String)Main.a($$31, $$23);
        String $$34 = "Pre-bootstrap";
        try {
            if ($$31.has((OptionSpec)$$3)) {
                bzu.f.a(bzs.a);
            }
            if ($$31.has((OptionSpec)$$4)) {
                fwe.a();
            }
            Stopwatch $$35 = Stopwatch.createStarted((Ticker)Ticker.systemTicker());
            Stopwatch $$36 = Stopwatch.createStarted((Ticker)Ticker.systemTicker());
            irh.a.a(ird.z, $$35);
            irh.a.a(ird.A, $$36);
            w.a();
            TracyClient.reportAppInfo((String)("Minecraft Java Edition " + w.b().c()));
            CompletableFuture<?> $$37 = bia.a(bhz.x);
            m.g();
            Logger $$38 = LogUtils.getLogger();
            $$34 = "Bootstrap";
            amv.a();
            get.a();
            irh.a.a(amv.b.get());
            amv.c();
            $$34 = "Argument parsing";
            List $$39 = $$31.valuesOf((OptionSpec)$$30);
            if (!$$39.isEmpty()) {
                $$38.info("Completely ignored arguments: {}", (Object)$$39);
            }
            String $$40 = (String)Main.a($$31, $$13);
            Proxy $$41 = Proxy.NO_PROXY;
            if ($$40 != null) {
                try {
                    $$41 = new Proxy(Proxy.Type.SOCKS, new InetSocketAddress($$40, (int)((Integer)Main.a($$31, $$14))));
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            final String $$42 = (String)Main.a($$31, $$15);
            final String $$43 = (String)Main.a($$31, $$16);
            if (!$$41.equals(Proxy.NO_PROXY) && Main.c($$42) && Main.c($$43)) {
                Authenticator.setDefault(new Authenticator(){

                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication($$42, $$43.toCharArray());
                    }
                });
            }
            int $$44 = (Integer)Main.a($$31, $$24);
            int $$45 = (Integer)Main.a($$31, $$25);
            OptionalInt $$46 = Main.a((Integer)Main.a($$31, $$26));
            OptionalInt $$47 = Main.a((Integer)Main.a($$31, $$27));
            boolean $$48 = $$31.has("fullscreen");
            boolean $$49 = $$31.has("demo");
            boolean $$50 = $$31.has("disableMultiplayer");
            boolean $$51 = $$31.has("disableChat");
            boolean $$52 = !$$31.has((OptionSpec)$$5);
            boolean $$53 = $$31.has((OptionSpec)$$2);
            String $$54 = (String)Main.a($$31, $$29);
            File $$55 = $$31.has((OptionSpec)$$11) ? (File)Main.a($$31, $$11) : new File($$32, "assets/");
            File $$56 = $$31.has((OptionSpec)$$12) ? (File)Main.a($$31, $$12) : new File($$32, "resourcepacks/");
            UUID $$57 = Main.a((OptionSpec<String>)$$19, $$31, $$38) ? UndashedUuid.fromStringLenient((String)((String)$$19.value($$31))) : jx.a((String)$$17.value($$31));
            String $$58 = $$31.has((OptionSpec)$$28) ? (String)$$28.value($$31) : null;
            String $$59 = (String)$$31.valueOf((OptionSpec)$$20);
            String $$60 = (String)$$31.valueOf((OptionSpec)$$21);
            String $$61 = (String)Main.a($$31, $$6);
            gzf.h $$62 = Main.a($$31, (OptionSpec<String>)$$7, (OptionSpec<String>)$$8, (OptionSpec<String>)$$9);
            gfx $$63 = new gfx((String)$$17.value($$31), $$57, (String)$$22.value($$31), Main.b($$59), Main.b($$60));
            gzf $$64 = new gzf(new gzf.i($$63, $$41), new fxz($$44, $$45, $$46, $$47, $$48), new gzf.a($$32, $$56, $$55, $$58), new gzf.b($$49, $$33, $$54, $$50, $$51, $$52, $$53, $$31.has((OptionSpec)$$18)), new gzf.c($$61, $$62));
            bhs.p();
            $$37.join();
        }
        catch (Throwable $$65) {
            m $$66 = m.a($$65, $$34);
            n $$67 = $$66.a("Initialization");
            bgk.a($$67);
            gfj.a(null, null, $$33, null, $$66);
            gfj.a(null, $$32, $$66);
            return;
        }
        Thread $$70 = new Thread("Client Shutdown Thread"){

            @Override
            public void run() {
                gfj $$0 = gfj.V();
                if ($$0 == null) {
                    return;
                }
                iqa $$1 = $$0.aa();
                if ($$1 != null) {
                    $$1.a(true);
                }
            }
        };
        $$70.setUncaughtExceptionHandler(new p((Logger)$$68));
        Runtime.getRuntime().addShutdownHook($$70);
        gfj $$71 = null;
        try {
            Thread.currentThread().setName("Render thread");
            RenderSystem.initRenderThread();
            $$71 = new gfj((gzf)$$69);
        }
        catch (gzg $$72) {
            bhs.k();
            $$68.warn("Failed to create window: ", (Throwable)$$72);
            return;
        }
        catch (Throwable $$73) {
            m $$74 = m.a($$73, "Initializing game");
            n $$75 = $$74.a("Initialization");
            bgk.a($$75);
            gfj.a($$71, null, $$69.d.b, null, $$74);
            gfj.a($$71, $$69.c.a, $$74);
            return;
        }
        gfj $$76 = $$71;
        $$76.j();
        try {
            $$76.u();
        }
        finally {
            $$76.r();
        }
    }

    private static gzf.h a(OptionSet $$0, OptionSpec<String> $$1, OptionSpec<String> $$2, OptionSpec<String> $$3) {
        long $$4 = Stream.of($$1, $$2, $$3).filter(arg_0 -> ((OptionSet)$$0).has(arg_0)).count();
        if ($$4 == 0L) {
            return gzf.h.a;
        }
        if ($$4 > 1L) {
            throw new IllegalArgumentException("Only one quick play option can be specified");
        }
        if ($$0.has($$1)) {
            String $$5 = Main.a(Main.a($$0, $$1));
            return new gzf.g($$5);
        }
        if ($$0.has($$2)) {
            String $$6 = Main.a(Main.a($$0, $$2));
            return t.a($$6, gzf.e::new, gzf.h.a);
        }
        if ($$0.has($$3)) {
            String $$7 = Main.a(Main.a($$0, $$3));
            return t.a($$7, gzf.f::new, gzf.h.a);
        }
        return gzf.h.a;
    }

    private static @Nullable String a(@Nullable String $$0) {
        if ($$0 == null) {
            return null;
        }
        return StringEscapeUtils.unescapeJava((String)$$0);
    }

    private static Optional<String> b(String $$0) {
        return $$0.isEmpty() ? Optional.empty() : Optional.of($$0);
    }

    private static OptionalInt a(@Nullable Integer $$0) {
        return $$0 != null ? OptionalInt.of($$0) : OptionalInt.empty();
    }

    private static <T> @Nullable T a(OptionSet $$0, OptionSpec<T> $$1) {
        try {
            return (T)$$0.valueOf($$1);
        }
        catch (Throwable $$2) {
            ArgumentAcceptingOptionSpec $$3;
            List $$4;
            if ($$1 instanceof ArgumentAcceptingOptionSpec && !($$4 = ($$3 = (ArgumentAcceptingOptionSpec)$$1).defaultValues()).isEmpty()) {
                return (T)$$4.get(0);
            }
            throw $$2;
        }
    }

    private static boolean c(@Nullable String $$0) {
        return $$0 != null && !$$0.isEmpty();
    }

    private static boolean a(OptionSpec<String> $$0, OptionSet $$1, Logger $$2) {
        return $$1.has($$0) && Main.b($$0, $$1, $$2);
    }

    private static boolean b(OptionSpec<String> $$0, OptionSet $$1, Logger $$2) {
        try {
            UndashedUuid.fromStringLenient((String)((String)$$0.value($$1)));
        }
        catch (IllegalArgumentException $$3) {
            $$2.warn("Invalid UUID: '{}", $$0.value($$1));
            return false;
        }
        return true;
    }

    static {
        System.setProperty("java.awt.headless", "true");
    }
}

