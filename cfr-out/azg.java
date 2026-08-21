/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.HashFunction
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class azg
implements AutoCloseable {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 20;
    private final Path c;
    private final bxv<e> d;
    private final cbs e = new cbs(bhs.j(), "download-queue");

    public azg(Path $$0) throws IOException {
        this.c = $$0;
        bfp.c($$0);
        this.d = bxv.a(azg$e.a, $$0.resolve("log.json"));
        azf.a($$0, 20);
    }

    private b b(a $$0, Map<UUID, c> $$1) {
        b $$22 = new b();
        $$1.forEach(($$2, $$3) -> {
            Path $$4 = this.c.resolve($$2.toString());
            Path $$5 = null;
            try {
                $$5 = bfx.a($$4, $$3.a, $$0.c, $$0.a, $$3.b, $$0.b, $$0.d, $$0.e);
                $$1.a.put((UUID)$$2, $$5);
            }
            catch (Exception $$6) {
                a.error("Failed to download {}", (Object)$$3.a, (Object)$$6);
                $$1.b.add((UUID)$$2);
            }
            try {
                this.d.a(new e((UUID)$$2, $$3.a.toString(), Instant.now(), Optional.ofNullable($$3.b).map(HashCode::toString), $$5 != null ? this.a($$5) : Either.left((Object)"download_failed")));
            }
            catch (Exception $$7) {
                a.error("Failed to log download of {}", (Object)$$3.a, (Object)$$7);
            }
        });
        return $$22;
    }

    private Either<String, d> a(Path $$0) {
        try {
            long $$1 = Files.size($$0);
            Path $$2 = this.c.relativize($$0);
            return Either.right((Object)new d($$2.toString(), $$1));
        }
        catch (IOException $$3) {
            a.error("Failed to get file size of {}", (Object)$$0, (Object)$$3);
            return Either.left((Object)"no_access");
        }
    }

    public CompletableFuture<b> a(a $$0, Map<UUID, c> $$1) {
        return CompletableFuture.supplyAsync(() -> this.b($$0, $$1), this.e::a_);
    }

    @Override
    public void close() throws IOException {
        this.e.close();
        this.d.close();
    }

    static final class e
    extends Record {
        private final UUID b;
        private final String c;
        private final Instant d;
        private final Optional<String> e;
        private final Either<String, d> f;
        public static final Codec<e> a = RecordCodecBuilder.create($$0 -> $$0.group((App)jx.d.fieldOf("id").forGetter(e::a), (App)Codec.STRING.fieldOf("url").forGetter(e::b), (App)bfm.x.fieldOf("time").forGetter(e::c), (App)Codec.STRING.optionalFieldOf("hash").forGetter(e::d), (App)Codec.mapEither((MapCodec)Codec.STRING.fieldOf("error"), (MapCodec)azg$d.a.fieldOf("file")).forGetter(e::e)).apply((Applicative)$$0, e::new));

        e(UUID $$0, String $$1, Instant $$2, Optional<String> $$3, Either<String, d> $$4) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "id;url;time;hash;errorOrFileInfo", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "id;url;time;hash;errorOrFileInfo", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "id;url;time;hash;errorOrFileInfo", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public UUID a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }

        public Instant c() {
            return this.d;
        }

        public Optional<String> d() {
            return this.e;
        }

        public Either<String, d> e() {
            return this.f;
        }
    }

    public static final class b
    extends Record {
        final Map<UUID, Path> a;
        final Set<UUID> b;

        public b() {
            this(new HashMap<UUID, Path>(), new HashSet<UUID>());
        }

        public b(Map<UUID, Path> $$0, Set<UUID> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "downloaded;failed", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "downloaded;failed", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "downloaded;failed", "a", "b"}, this, $$0);
        }

        public Map<UUID, Path> a() {
            return this.a;
        }

        public Set<UUID> b() {
            return this.b;
        }
    }

    public static final class a
    extends Record {
        final HashFunction a;
        final int b;
        final Map<String, String> c;
        final Proxy d;
        final bfx.a e;

        public a(HashFunction $$0, int $$1, Map<String, String> $$2, Proxy $$3, bfx.a $$4) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "hashFunction;maxSize;headers;proxy;listener", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "hashFunction;maxSize;headers;proxy;listener", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "hashFunction;maxSize;headers;proxy;listener", "a", "b", "c", "d", "e"}, this, $$0);
        }

        public HashFunction a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public Map<String, String> c() {
            return this.c;
        }

        public Proxy d() {
            return this.d;
        }

        public bfx.a e() {
            return this.e;
        }
    }

    static final class d
    extends Record {
        private final String b;
        private final long c;
        public static final Codec<d> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("name").forGetter(d::a), (App)Codec.LONG.fieldOf("size").forGetter(d::b)).apply((Applicative)$$0, d::new));

        d(String $$0, long $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "name;size", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "name;size", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "name;size", "b", "c"}, this, $$0);
        }

        public String a() {
            return this.b;
        }

        public long b() {
            return this.c;
        }
    }

    public static final class c
    extends Record {
        final URL a;
        final @Nullable HashCode b;

        public c(URL $$0, @Nullable HashCode $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "url;hash", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "url;hash", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "url;hash", "a", "b"}, this, $$0);
        }

        public URL a() {
            return this.a;
        }

        public @Nullable HashCode b() {
            return this.b;
        }
    }
}

