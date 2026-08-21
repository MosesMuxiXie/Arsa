/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.authlib.GameProfile
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class hou {
    public static final ijs a = hou.a(imh.b());
    public static final Duration b = Duration.ofMinutes(5L);
    private final LoadingCache<doy, CompletableFuture<Optional<a>>> c = CacheBuilder.newBuilder().expireAfterAccess(b).build((CacheLoader)new CacheLoader<doy, CompletableFuture<Optional<a>>>(){

        public CompletableFuture<Optional<a>> a(doy $$0) {
            return $$0.a(hou.this.g).thenCompose($$1 -> hou.this.f.a((GameProfile)$$1).thenApply($$22 -> $$22.map($$2 -> new a((GameProfile)$$1, (ddq)$$2, $$0.c()))));
        }

        public /* synthetic */ Object load(Object object) throws Exception {
            return this.a((doy)object);
        }
    });
    private final LoadingCache<doy, a> d = CacheBuilder.newBuilder().expireAfterAccess(b).build((CacheLoader)new CacheLoader<doy, a>(){

        public a a(doy $$0) {
            GameProfile $$1 = $$0.b();
            return new a($$1, imh.a($$1), $$0.c());
        }

        public /* synthetic */ Object load(Object object) throws Exception {
            return this.a((doy)object);
        }
    });
    final ilr e;
    final imo f;
    final bca g;

    public hou(ilr $$0, imo $$1, bca $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
    }

    public a a(doy $$0) {
        a $$1 = this.c($$0).getNow(Optional.empty()).orElse(null);
        if ($$1 != null) {
            return $$1;
        }
        return (a)this.d.getUnchecked((Object)$$0);
    }

    public Supplier<a> b(doy $$0) {
        a $$1 = (a)this.d.getUnchecked((Object)$$0);
        CompletableFuture $$2 = (CompletableFuture)this.c.getUnchecked((Object)$$0);
        Optional $$3 = $$2.getNow(null);
        if ($$3 != null) {
            a $$4 = $$3.orElse($$1);
            return () -> $$4;
        }
        return () -> $$2.getNow(Optional.empty()).orElse($$1);
    }

    public CompletableFuture<Optional<a>> c(doy $$0) {
        return (CompletableFuture)this.c.getUnchecked((Object)$$0);
    }

    static ijs a(ddq $$0) {
        return hsa.a($$0.a().b());
    }

    public final class a {
        private final GameProfile b;
        private final ddq c;
        private @Nullable ijs d;
        private @Nullable GpuTextureView e;
        private @Nullable gnt f;

        public a(GameProfile $$1, ddq $$2, ddq.a $$3) {
            this.b = $$1;
            this.c = $$2.a($$3);
        }

        public GameProfile a() {
            return this.b;
        }

        public ddq b() {
            return this.c;
        }

        public ijs c() {
            if (this.d == null) {
                this.d = hou.a(this.c);
            }
            return this.d;
        }

        public GpuTextureView d() {
            if (this.e == null) {
                this.e = hou.this.e.b(this.c.a().b()).b();
            }
            return this.e;
        }

        public gnt e() {
            if (this.f == null) {
                this.f = gnt.b(this.c.a().b());
            }
            return this.f;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean equals(Object $$0) {
            if (this == $$0) return true;
            if (!($$0 instanceof a)) return false;
            a $$1 = (a)$$0;
            if (!this.b.equals((Object)$$1.b)) return false;
            if (!this.c.equals($$1.c)) return false;
            return true;
        }

        public int hashCode() {
            int $$0 = 1;
            $$0 = 31 * $$0 + this.b.hashCode();
            $$0 = 31 * $$0 + this.c.hashCode();
            return $$0;
        }
    }
}

