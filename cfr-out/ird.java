/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.TelemetryPropertyContainer
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.longs.LongList
 */
import com.mojang.authlib.minecraft.TelemetryPropertyContainer;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class ird<T>
extends Record {
    private final String F;
    private final String G;
    private final Codec<T> H;
    private final a<T> I;
    private static final DateTimeFormatter J = DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneId.from(ZoneOffset.UTC));
    public static final ird<String> a = ird.b("user_id", "userId");
    public static final ird<String> b = ird.b("client_id", "clientId");
    public static final ird<UUID> c = ird.e("minecraft_session_id", "deviceSessionId");
    public static final ird<String> d = ird.b("game_version", "buildDisplayName");
    public static final ird<String> e = ird.b("operating_system", "buildPlatform");
    public static final ird<String> f = ird.b("platform", "platform");
    public static final ird<Boolean> g = ird.a("client_modded", "clientModded");
    public static final ird<String> h = ird.b("launcher_name", "launcherName");
    public static final ird<UUID> i = ird.e("world_session_id", "worldSessionId");
    public static final ird<Boolean> j = ird.a("server_modded", "serverModded");
    public static final ird<c> k = ird.a("server_type", "serverType", ird$c.d, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.c()));
    public static final ird<Boolean> l = ird.a("opt_in", "isOptional");
    public static final ird<Instant> m = ird.a("event_timestamp_utc", "eventTimestampUtc", bfm.x, ($$0, $$1, $$2) -> $$0.addProperty($$1, J.format((TemporalAccessor)$$2)));
    public static final ird<b> n = ird.a("game_mode", "playerGameMode", ird$b.f, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.a()));
    public static final ird<String> o = ird.b("realms_map_content", "realmsMapContent");
    public static final ird<Integer> p = ird.c("seconds_since_load", "secondsSinceLoad");
    public static final ird<Integer> q = ird.c("ticks_since_load", "ticksSinceLoad");
    public static final ird<LongList> r = ird.g("frame_rate_samples", "serializedFpsSamples");
    public static final ird<LongList> s = ird.g("render_time_samples", "serializedRenderTimeSamples");
    public static final ird<LongList> t = ird.g("used_memory_samples", "serializedUsedMemoryKbSamples");
    public static final ird<Integer> u = ird.c("number_of_samples", "numSamples");
    public static final ird<Integer> v = ird.c("render_distance", "renderDistance");
    public static final ird<Integer> w = ird.c("dedicated_memory_kb", "dedicatedMemoryKb");
    public static final ird<Integer> x = ird.c("world_load_time_ms", "worldLoadTimeMs");
    public static final ird<Boolean> y = ird.a("new_world", "newWorld");
    public static final ird<irh.a> z = ird.f("load_time_total_time_ms", "loadTimeTotalTimeMs");
    public static final ird<irh.a> A = ird.f("load_time_pre_window_ms", "loadTimePreWindowMs");
    public static final ird<irh.a> B = ird.f("load_time_bootstrap_ms", "loadTimeBootstrapMs");
    public static final ird<irh.a> C = ird.f("load_time_loading_overlay_ms", "loadTimeLoadingOverlayMs");
    public static final ird<String> D = ird.b("advancement_id", "advancementId");
    public static final ird<Long> E = ird.d("advancement_game_time", "advancementGameTime");

    public ird(String $$0, String $$1, Codec<T> $$2, a<T> $$3) {
        this.F = $$0;
        this.G = $$1;
        this.H = $$2;
        this.I = $$3;
    }

    public static <T> ird<T> a(String $$0, String $$1, Codec<T> $$2, a<T> $$3) {
        return new ird<T>($$0, $$1, $$2, $$3);
    }

    public static ird<Boolean> a(String $$0, String $$1) {
        return ird.a($$0, $$1, Codec.BOOL, TelemetryPropertyContainer::addProperty);
    }

    public static ird<String> b(String $$0, String $$1) {
        return ird.a($$0, $$1, Codec.STRING, TelemetryPropertyContainer::addProperty);
    }

    public static ird<Integer> c(String $$0, String $$1) {
        return ird.a($$0, $$1, Codec.INT, TelemetryPropertyContainer::addProperty);
    }

    public static ird<Long> d(String $$0, String $$1) {
        return ird.a($$0, $$1, Codec.LONG, TelemetryPropertyContainer::addProperty);
    }

    public static ird<UUID> e(String $$02, String $$12) {
        return ird.a($$02, $$12, jx.d, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.toString()));
    }

    public static ird<irh.a> f(String $$02, String $$12) {
        return ird.a($$02, $$12, irh.a.a, ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.a()));
    }

    public static ird<LongList> g(String $$02, String $$12) {
        return ird.a($$02, $$12, Codec.LONG.listOf().xmap(LongArrayList::new, Function.identity()), ($$0, $$1, $$2) -> $$0.addProperty($$1, $$2.longStream().mapToObj(String::valueOf).collect(Collectors.joining(";"))));
    }

    public void a(ire $$0, TelemetryPropertyContainer $$1) {
        Object $$2 = $$0.a(this);
        if ($$2 != null) {
            this.I.apply($$1, this.G, $$2);
        } else {
            $$1.addNullProperty(this.G);
        }
    }

    public yw a() {
        return yh.c("telemetry.property." + this.F + ".title");
    }

    @Override
    public String toString() {
        return "TelemetryProperty[" + this.F + "]";
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ird.class, "id;exportKey;codec;exporter", "F", "G", "H", "I"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ird.class, "id;exportKey;codec;exporter", "F", "G", "H", "I"}, this, $$0);
    }

    public String b() {
        return this.F;
    }

    public String c() {
        return this.G;
    }

    public Codec<T> d() {
        return this.H;
    }

    public a<T> e() {
        return this.I;
    }

    public static interface a<T> {
        public void apply(TelemetryPropertyContainer var1, String var2, T var3);
    }

    public static final class b
    extends Enum<b>
    implements bhh {
        public static final /* enum */ b a = new b("survival", 0);
        public static final /* enum */ b b = new b("creative", 1);
        public static final /* enum */ b c = new b("adventure", 2);
        public static final /* enum */ b d = new b("spectator", 6);
        public static final /* enum */ b e = new b("hardcore", 99);
        public static final Codec<b> f;
        private final String g;
        private final int h;
        private static final /* synthetic */ b[] i;

        public static b[] values() {
            return (b[])i.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0, int $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        public int a() {
            return this.h;
        }

        @Override
        public String c() {
            return this.g;
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a, b, c, d, e};
        }

        static {
            i = ird$b.b();
            f = bhh.a(b::values);
        }
    }

    public static final class c
    extends Enum<c>
    implements bhh {
        public static final /* enum */ c a = new c("realm");
        public static final /* enum */ c b = new c("local");
        public static final /* enum */ c c = new c("server");
        public static final Codec<c> d;
        private final String e;
        private static final /* synthetic */ c[] f;

        public static c[] values() {
            return (c[])f.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(String $$0) {
            this.e = $$0;
        }

        @Override
        public String c() {
            return this.e;
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            f = ird$c.a();
            d = bhh.a(c::values);
        }
    }
}

