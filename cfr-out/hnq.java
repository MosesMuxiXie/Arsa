/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.time.Instant;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hnq {
    private static final hnq a = new hnq(""){

        @Override
        public void a(gfj $$0) {
        }

        @Override
        public void a(c $$0, String $$1, String $$2) {
        }
    };
    private static final Logger b = LogUtils.getLogger();
    private static final Gson c = new GsonBuilder().create();
    private final Path d;
    private @Nullable b e;

    hnq(String $$0) {
        this.d = gfj.V().p.toPath().resolve($$0);
    }

    public static hnq a(@Nullable String $$0) {
        if ($$0 == null) {
            return a;
        }
        return new hnq($$0);
    }

    public void a(c $$0, String $$1, String $$2) {
        this.e = new b($$0, $$1, $$2);
    }

    public void a(gfj $$0) {
        if ($$0.q == null || this.e == null) {
            b.error("Failed to log session for quickplay. Missing world data or gamemode");
            return;
        }
        bhs.i().execute(() -> {
            try {
                Files.deleteIfExists(this.d);
            }
            catch (IOException $$1) {
                b.error("Failed to delete quickplay log file {}", (Object)this.d, (Object)$$1);
            }
            a $$2 = new a(this.e, Instant.now(), $$02.q.i());
            Codec.list(hnq$a.a).encodeStart((DynamicOps)JsonOps.INSTANCE, List.of($$2)).resultOrPartial(bhs.a("Quick Play: ", arg_0 -> ((Logger)b).error(arg_0))).ifPresent($$0 -> {
                try {
                    Files.createDirectories(this.d.getParent(), new FileAttribute[0]);
                    Files.writeString(this.d, (CharSequence)c.toJson($$0), new OpenOption[0]);
                }
                catch (IOException $$1) {
                    b.error("Failed to write to quickplay log file {}", (Object)this.d, (Object)$$1);
                }
            });
        });
    }

    static final class b
    extends Record {
        private final c b;
        private final String c;
        private final String d;
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)hnq$c.d.fieldOf("type").forGetter(b::a), (App)bfm.z.fieldOf("id").forGetter(b::b), (App)Codec.STRING.fieldOf("name").forGetter(b::c)).apply((Applicative)$$0, b::new));

        b(c $$0, String $$1, String $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "type;id;name", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "type;id;name", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "type;id;name", "b", "c", "d"}, this, $$0);
        }

        public c a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.d;
        }
    }

    public static final class c
    extends Enum<c>
    implements bhh {
        public static final /* enum */ c a = new c("singleplayer");
        public static final /* enum */ c b = new c("multiplayer");
        public static final /* enum */ c c = new c("realms");
        static final Codec<c> d;
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
            f = hnq$c.a();
            d = bhh.a(c::values);
        }
    }

    static final class a
    extends Record {
        private final b b;
        private final Instant c;
        private final dwl d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)hnq$b.a.forGetter(a::a), (App)bfm.x.fieldOf("lastPlayedTime").forGetter(a::b), (App)dwl.f.fieldOf("gamemode").forGetter(a::c)).apply((Applicative)$$0, a::new));

        a(b $$0, Instant $$1, dwl $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "quickPlayWorld;lastPlayedTime;gamemode", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "quickPlayWorld;lastPlayedTime;gamemode", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "quickPlayWorld;lastPlayedTime;gamemode", "b", "c", "d"}, this, $$0);
        }

        public b a() {
            return this.b;
        }

        public Instant b() {
            return this.c;
        }

        public dwl c() {
            return this.d;
        }
    }
}

