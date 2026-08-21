/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.hash.Hashing
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.SignatureState
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.minecraft.MinecraftProfileTextures
 *  com.mojang.authlib.properties.Property
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.SignatureState;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTextures;
import com.mojang.authlib.properties.Property;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class imo {
    static final Logger a = LogUtils.getLogger();
    private final ano b;
    final ilj c;
    private final LoadingCache<a, CompletableFuture<Optional<ddq>>> d;
    private final b e;
    private final b f;
    private final b g;

    public imo(Path $$0, final ano $$1, ilj $$2, final Executor $$3) {
        this.b = $$1;
        this.c = $$2;
        this.e = new b($$0, MinecraftProfileTexture.Type.SKIN);
        this.f = new b($$0, MinecraftProfileTexture.Type.CAPE);
        this.g = new b($$0, MinecraftProfileTexture.Type.ELYTRA);
        this.d = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(15L)).build((CacheLoader)new CacheLoader<a, CompletableFuture<Optional<ddq>>>(){

            public CompletableFuture<Optional<ddq>> a(a $$0) {
                return ((CompletableFuture)CompletableFuture.supplyAsync(() -> {
                    Property $$2 = $$0.b();
                    if ($$2 == null) {
                        return MinecraftProfileTextures.EMPTY;
                    }
                    MinecraftProfileTextures $$32 = $$1.c().unpackTextures($$2);
                    if ($$32.signatureState() == SignatureState.INVALID) {
                        a.warn("Profile contained invalid signature for textures property (profile id: {})", (Object)$$0.a());
                    }
                    return $$32;
                }, bhs.h().a("unpackSkinTextures")).thenComposeAsync($$1 -> imo.this.a($$0.a(), (MinecraftProfileTextures)$$1), $$3)).handle(($$1, $$2) -> {
                    if ($$2 != null) {
                        a.warn("Failed to load texture for profile {}", (Object)$$0.a, $$2);
                    }
                    return Optional.ofNullable($$1);
                });
            }

            public /* synthetic */ Object load(Object object) throws Exception {
                return this.a((a)object);
            }
        });
    }

    public Supplier<ddq> a(GameProfile $$0, boolean $$12) {
        CompletableFuture<Optional<ddq>> $$2 = this.a($$0);
        ddq $$3 = imh.a($$0);
        if (w.al) {
            return () -> $$3;
        }
        Optional $$4 = $$2.getNow(null);
        if ($$4 != null) {
            ddq $$5 = $$4.filter($$1 -> !$$12 || $$1.e()).orElse($$3);
            return () -> $$5;
        }
        return () -> $$2.getNow(Optional.empty()).filter($$1 -> !$$12 || $$1.e()).orElse($$3);
    }

    public CompletableFuture<Optional<ddq>> a(GameProfile $$0) {
        if (w.al) {
            ddq $$1 = imh.a($$0);
            return CompletableFuture.completedFuture(Optional.of($$1));
        }
        Property $$2 = this.b.c().getPackedTextures($$0);
        return (CompletableFuture)this.d.getUnchecked((Object)new a($$0.id(), $$2));
    }

    CompletableFuture<ddq> a(UUID $$0, MinecraftProfileTextures $$1) {
        ddp $$7;
        CompletableFuture<iu.c> $$6;
        MinecraftProfileTexture $$2 = $$1.skin();
        if ($$2 != null) {
            CompletableFuture<iu.c> $$3 = this.e.a($$2);
            ddp $$4 = ddp.a($$2.getMetadata("model"));
        } else {
            ddq $$52 = imh.a($$0);
            $$6 = CompletableFuture.completedFuture($$52.a());
            $$7 = $$52.d();
        }
        MinecraftProfileTexture $$8 = $$1.cape();
        CompletableFuture<Object> $$9 = $$8 != null ? this.f.a($$8) : CompletableFuture.completedFuture(null);
        MinecraftProfileTexture $$10 = $$1.elytra();
        CompletableFuture<Object> $$11 = $$10 != null ? this.g.a($$10) : CompletableFuture.completedFuture(null);
        return CompletableFuture.allOf($$6, $$9, $$11).thenApply($$5 -> new ddq((iu.c)$$6.join(), (iu.c)$$9.join(), (iu.c)$$11.join(), $$7, $$1.signatureState() == SignatureState.SIGNED));
    }

    class b {
        private final Path b;
        private final MinecraftProfileTexture.Type c;
        private final Map<String, CompletableFuture<iu.c>> d = new Object2ObjectOpenHashMap();

        b(Path $$0, MinecraftProfileTexture.Type $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public CompletableFuture<iu.c> a(MinecraftProfileTexture $$0) {
            String $$1 = $$0.getHash();
            CompletableFuture<iu.c> $$2 = this.d.get($$1);
            if ($$2 == null) {
                $$2 = this.b($$0);
                this.d.put($$1, $$2);
            }
            return $$2;
        }

        private CompletableFuture<iu.c> b(MinecraftProfileTexture $$0) {
            String $$1 = Hashing.sha1().hashUnencodedChars((CharSequence)$$0.getHash()).toString();
            amo $$2 = this.a($$1);
            Path $$3 = this.b.resolve($$1.length() > 2 ? $$1.substring(0, 2) : "xx").resolve($$1);
            return imo.this.c.a($$2, $$3, $$0.getUrl(), this.c == MinecraftProfileTexture.Type.SKIN);
        }

        private amo a(String $$0) {
            String $$1 = switch (this.c) {
                default -> throw new MatchException(null, null);
                case MinecraftProfileTexture.Type.SKIN -> "skins";
                case MinecraftProfileTexture.Type.CAPE -> "capes";
                case MinecraftProfileTexture.Type.ELYTRA -> "elytra";
            };
            return amo.b($$1 + "/" + $$0);
        }
    }

    static final class a
    extends Record {
        final UUID a;
        private final @Nullable Property b;

        a(UUID $$0, @Nullable Property $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "profileId;packedTextures", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "profileId;packedTextures", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "profileId;packedTextures", "a", "b"}, this, $$0);
        }

        public UUID a() {
            return this.a;
        }

        public @Nullable Property b() {
            return this.b;
        }
    }
}

