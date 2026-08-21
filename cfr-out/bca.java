/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  com.mojang.datafixers.util.Either
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.datafixers.util.Either;
import java.time.Duration;
import java.util.Optional;
import java.util.UUID;

public interface bca {
    public Optional<GameProfile> a(String var1);

    public Optional<GameProfile> a(UUID var1);

    default public Optional<GameProfile> a(Either<String, UUID> $$0) {
        return (Optional)$$0.map(this::a, this::a);
    }

    public static class a
    implements bca {
        private final LoadingCache<String, Optional<GameProfile>> a;
        final LoadingCache<UUID, Optional<GameProfile>> b;

        public a(final MinecraftSessionService $$0, final bci $$1) {
            this.b = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofMinutes(10L)).maximumSize(256L).build((CacheLoader)new CacheLoader<UUID, Optional<GameProfile>>(this){

                public Optional<GameProfile> a(UUID $$02) {
                    ProfileResult $$1 = $$0.fetchProfile($$02, true);
                    return Optional.ofNullable($$1).map(ProfileResult::profile);
                }

                public /* synthetic */ Object load(Object object) throws Exception {
                    return this.a((UUID)object);
                }
            });
            this.a = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofMinutes(10L)).maximumSize(256L).build((CacheLoader)new CacheLoader<String, Optional<GameProfile>>(){

                public Optional<GameProfile> a(String $$02) {
                    return $$1.a($$02).flatMap($$0 -> (Optional)b.getUnchecked((Object)$$0.a()));
                }

                public /* synthetic */ Object load(Object object) throws Exception {
                    return this.a((String)object);
                }
            });
        }

        @Override
        public Optional<GameProfile> a(String $$0) {
            if (bhi.f($$0)) {
                return (Optional)this.a.getUnchecked((Object)$$0);
            }
            return Optional.empty();
        }

        @Override
        public Optional<GameProfile> a(UUID $$0) {
            return (Optional)this.b.getUnchecked((Object)$$0);
        }
    }
}

