/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.base.Strings
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class arz
extends asc<arz> {
    static final Logger am = LogUtils.getLogger();
    private static final Pattern an = Pattern.compile("^[a-fA-F0-9]{40}$");
    private static final Splitter ao = Splitter.on((char)',').trimResults();
    public static final String a = "management-server-tls-enabled";
    public static final String b = "management-server-tls-keystore";
    public static final String c = "management-server-tls-keystore-password";
    public final boolean d = this.a("online-mode", true);
    public final boolean e = this.a("prevent-proxy-connections", false);
    public final String f = this.a("server-ip", "");
    public final asc.a<Boolean> g = this.b("allow-flight", false);
    public final asc.a<String> h = this.b("motd", "A Minecraft Server");
    public final boolean i = this.a("enable-code-of-conduct", false);
    public final String j = this.a("bug-report-link", "");
    public final asc.a<Boolean> k = this.b("force-gamemode", false);
    public final asc.a<Boolean> l = this.b("enforce-whitelist", false);
    public final asc.a<ccz> m = this.b("difficulty", arz.a(ccz::a, ccz::a), ccz::e, ccz.b);
    public final asc.a<dwl> n = this.b("gamemode", arz.a(dwl::a, dwl::a), dwl::b, dwl.a);
    public final String o = this.a("level-name", "world");
    public final int p = this.a("server-port", 25565);
    public final boolean q = this.a("management-server-enabled", false);
    public final String r = this.a("management-server-host", "localhost");
    public final int s = this.a("management-server-port", 0);
    public final String t = this.a("management-server-secret", avz.a());
    public final boolean u = this.a("management-server-tls-enabled", true);
    public final String v = this.a("management-server-tls-keystore", "");
    public final String w = this.a("management-server-tls-keystore-password", "");
    public final String x = this.a("management-server-allowed-origins", "");
    public final @Nullable Boolean y = this.c("announce-player-achievements");
    public final boolean z = this.a("enable-query", false);
    public final int A = this.a("query.port", 25565);
    public final boolean B = this.a("enable-rcon", false);
    public final int C = this.a("rcon.port", 25575);
    public final String D = this.a("rcon.password", "");
    public final boolean E = this.a("hardcore", false);
    public final boolean F = this.a("use-native-transport", true);
    public final asc.a<Integer> G = this.b("spawn-protection", 16);
    public final asc.a<bbh> H = this.b("op-permission-level", arz::a, arz::a, bbh.e);
    public final bbh I = this.a("function-permission-level", arz::a, arz::a, bbh.c);
    public final long J = this.a("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
    public final int K = this.a("max-chained-neighbor-updates", 1000000);
    public final int L = this.a("rate-limit", 0);
    public final asc.a<Integer> M = this.b("view-distance", 10);
    public final asc.a<Integer> N = this.b("simulation-distance", 10);
    public final asc.a<Integer> O = this.b("max-players", 20);
    public final int P = this.a("network-compression-threshold", 256);
    public final boolean Q = this.a("broadcast-rcon-to-ops", true);
    public final boolean R = this.a("broadcast-console-to-ops", true);
    public final int S = this.a("max-world-size", $$0 -> bgj.a((int)$$0, 1, 29999984), 29999984);
    public final boolean T = this.a("sync-chunk-writes", true);
    public final String U = this.a("region-file-compression", "deflate");
    public final boolean V = this.a("enable-jmx-monitoring", false);
    public final asc.a<Boolean> W = this.b("enable-status", true);
    public final asc.a<Boolean> X = this.b("hide-online-players", false);
    public final asc.a<Integer> Y = this.b("entity-broadcast-range-percentage", $$0 -> bgj.a(Integer.parseInt($$0), 10, 1000), 100);
    public final String Z = this.a("text-filtering-config", "");
    public final int aa = this.a("text-filtering-version", 0);
    public final Optional<MinecraftServer.b> ab;
    public final dwc ac;
    public final asc.a<Integer> ad = this.b("player-idle-timeout", 0);
    public final asc.a<Integer> ae = this.b("status-heartbeat-interval", 0);
    public final asc.a<Boolean> af = this.b("white-list", false);
    public final boolean ag = this.a("enforce-secure-profile", true);
    public final boolean ah = this.a("log-ips", true);
    public final asc.a<Integer> ai = this.b("pause-when-empty-seconds", 60);
    private final a ap;
    public final evo aj;
    public asc.a<Boolean> ak = this.b("accepts-transfers", false);

    public arz(Properties $$02) {
        super($$02);
        String $$1 = this.a("level-seed", "");
        boolean $$2 = this.a("generate-structures", true);
        long $$3 = evo.a($$1).orElse(evo.g());
        this.aj = new evo($$3, $$2, false);
        this.ap = new a(this.a("generator-settings", (String $$0) -> bfv.a(!$$0.isEmpty() ? $$0 : "{}"), new JsonObject()), this.a("level-type", (String $$0) -> $$0.toLowerCase(Locale.ROOT), ffe.a.a().toString()));
        this.ab = arz.a(this.a("resource-pack-id", ""), this.a("resource-pack", ""), this.a("resource-pack-sha1", ""), this.b("resource-pack-hash"), this.a("require-resource-pack", false), this.a("resource-pack-prompt", ""));
        this.ac = arz.c(this.a("initial-enabled-packs", String.join((CharSequence)",", dxm.d.a().a())), this.a("initial-disabled-packs", String.join((CharSequence)",", dxm.d.a().b())));
    }

    public static arz a(Path $$0) {
        return new arz(arz.b($$0));
    }

    protected arz a(jr $$0, Properties $$1) {
        return new arz($$1);
    }

    private static @Nullable yh d(String $$0) {
        if (!Strings.isNullOrEmpty((String)$$0)) {
            try {
                JsonElement $$12 = bhf.a($$0);
                return yj.a.parse(jr.b.a(JsonOps.INSTANCE), (Object)$$12).resultOrPartial($$1 -> am.warn("Failed to parse resource pack prompt '{}': {}", (Object)$$0, $$1)).orElse(null);
            }
            catch (Exception $$2) {
                am.warn("Failed to parse resource pack prompt '{}'", (Object)$$0, (Object)$$2);
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private static Optional<MinecraftServer.b> a(String $$0, String $$1, String $$2, @Nullable String $$3, boolean $$4, String $$5) {
        void $$13;
        String $$8;
        if ($$1.isEmpty()) {
            return Optional.empty();
        }
        if (!$$2.isEmpty()) {
            String $$6 = $$2;
            if (!Strings.isNullOrEmpty((String)$$3)) {
                am.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
            }
        } else if (!Strings.isNullOrEmpty((String)$$3)) {
            am.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            String $$7 = $$3;
        } else {
            $$8 = "";
        }
        if ($$8.isEmpty()) {
            am.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
        } else if (!an.matcher($$8).matches()) {
            am.warn("Invalid sha1 for resource-pack-sha1");
        }
        yh $$9 = arz.d($$5);
        if ($$0.isEmpty()) {
            UUID $$10 = UUID.nameUUIDFromBytes($$1.getBytes(StandardCharsets.UTF_8));
            am.warn("resource-pack-id missing, using default of {}", (Object)$$10);
        } else {
            try {
                UUID $$11 = UUID.fromString($$0);
            }
            catch (IllegalArgumentException $$12) {
                am.warn("Failed to parse '{}' into UUID", (Object)$$0);
                return Optional.empty();
            }
        }
        return Optional.of(new MinecraftServer.b((UUID)$$13, $$1, $$8, $$4, $$9));
    }

    private static dwc c(String $$0, String $$1) {
        List $$2 = ao.splitToList((CharSequence)$$0);
        List $$3 = ao.splitToList((CharSequence)$$1);
        return new dwc($$2, $$3);
    }

    public static @Nullable bbh a(String $$0) {
        try {
            bbl $$1 = bbl.a(Integer.parseInt($$0));
            return bbh.a($$1);
        }
        catch (NumberFormatException $$2) {
            return null;
        }
    }

    public static String a(bbh $$0) {
        return Integer.toString($$0.a().a());
    }

    public evl a(jf.a $$0) {
        return this.ap.a($$0);
    }

    @Override
    protected /* synthetic */ asc b(jr jr2, Properties properties) {
        return this.a(jr2, properties);
    }

    record a(JsonObject a, String b) {
        private static final Map<String, amt<ffd>> c = Map.of("default", ffe.a, "largebiomes", ffe.c);

        public evl a(jf.a $$02) {
            jf.b<ffd> $$1 = $$02.e(mj.bD);
            jd.c<ffd> $$2 = $$1.a(ffe.a).or(() -> $$1.c().findAny()).orElseThrow(() -> new IllegalStateException("Invalid datapack contents: can't find default preset"));
            jd $$3 = Optional.ofNullable(amo.c(this.b)).map($$0 -> amt.a(mj.bD, $$0)).or(() -> Optional.ofNullable(c.get(this.b))).flatMap($$1::a).orElseGet(() -> {
                am.warn("Failed to parse level-type {}, defaulting to {}", (Object)this.b, (Object)$$2.h().a());
                return $$2;
            });
            evl $$4 = ((ffd)$$3.a()).a();
            if ($$3.a(ffe.b)) {
                ams $$5 = $$02.a(JsonOps.INSTANCE);
                Optional $$6 = fdr.a.parse(new Dynamic($$5, (Object)this.a())).resultOrPartial(arg_0 -> ((Logger)am).error(arg_0));
                if ($$6.isPresent()) {
                    return $$4.a($$02, new eul((fdr)$$6.get()));
                }
            }
            return $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "generatorSettings;levelType", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "generatorSettings;levelType", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "generatorSettings;levelType", "a", "b"}, this, $$0);
        }
    }
}

