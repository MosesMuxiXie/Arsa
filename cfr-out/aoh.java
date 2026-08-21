/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableBiMap
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class aoh {
    private static final Logger b = LogUtils.getLogger();
    private static final String c = "localhost";
    private static final String d = "0.0.0.0";
    private static final int e = 10000;
    private static final int f = 100;
    public static BiMap<String, amt<dwo>> a = ImmutableBiMap.of((Object)"o", dwo.h, (Object)"n", dwo.i, (Object)"e", dwo.j);
    private static @Nullable anz g;
    private static @Nullable any h;

    public static void a(CommandDispatcher<ed> $$02) {
        $$02.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.b("chase").then(((LiteralArgumentBuilder)ee.b("follow").then(((RequiredArgumentBuilder)ee.a("host", StringArgumentType.string()).executes($$0 -> aoh.b((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"host"), 10000))).then(ee.a("port", IntegerArgumentType.integer((int)1, (int)65535)).executes($$0 -> aoh.b((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"host"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"port")))))).executes($$0 -> aoh.b((ed)$$0.getSource(), c, 10000)))).then(((LiteralArgumentBuilder)ee.b("lead").then(((RequiredArgumentBuilder)ee.a("bind_address", StringArgumentType.string()).executes($$0 -> aoh.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"bind_address"), 10000))).then(ee.a("port", IntegerArgumentType.integer((int)1024, (int)65535)).executes($$0 -> aoh.a((ed)$$0.getSource(), StringArgumentType.getString((CommandContext)$$0, (String)"bind_address"), IntegerArgumentType.getInteger((CommandContext)$$0, (String)"port")))))).executes($$0 -> aoh.a((ed)$$0.getSource(), d, 10000)))).then(ee.b("stop").executes($$0 -> aoh.a((ed)$$0.getSource()))));
    }

    private static int a(ed $$0) {
        if (h != null) {
            h.b();
            $$0.a(() -> yh.b("You have now stopped chasing"), false);
            h = null;
        }
        if (g != null) {
            g.b();
            $$0.a(() -> yh.b("You are no longer being chased"), false);
            g = null;
        }
        return 0;
    }

    private static boolean b(ed $$0) {
        if (g != null) {
            $$0.b(yh.b("Chase server is already running. Stop it using /chase stop"));
            return true;
        }
        if (h != null) {
            $$0.b(yh.b("You are already chasing someone. Stop it using /chase stop"));
            return true;
        }
        return false;
    }

    private static int a(ed $$0, String $$1, int $$2) {
        if (aoh.b($$0)) {
            return 0;
        }
        g = new anz($$1, $$2, $$0.m().aj(), 100);
        try {
            g.a();
            $$0.a(() -> yh.b("Chase server is now running on port " + $$2 + ". Clients can follow you using /chase follow <ip> <port>"), false);
        }
        catch (IOException $$3) {
            b.error("Failed to start chase server", (Throwable)$$3);
            $$0.b(yh.b("Failed to start chase server on port " + $$2));
            g = null;
        }
        return 0;
    }

    private static int b(ed $$0, String $$1, int $$2) {
        if (aoh.b($$0)) {
            return 0;
        }
        h = new any($$1, $$2, $$0.m());
        h.a();
        $$0.a(() -> yh.b("You are now chasing " + $$1 + ":" + $$2 + ". If that server does '/chase lead' then you will automatically go to the same position. Use '/chase stop' to stop chasing."), false);
        return 0;
    }
}

