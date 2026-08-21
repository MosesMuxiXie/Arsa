/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public abstract sealed class doy
implements dpe {
    private static final Codec<doy> e = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.mapEither(bfm.L, doy$b.f).forGetter(doy::a), (App)ddq.a.b.forGetter(doy::c)).apply((Applicative)$$0, doy::a));
    public static final Codec<doy> a = Codec.withAlternative(e, bfm.J, doy::a);
    public static final aao<ByteBuf, doy> b = aao.a(aam.a(aam.A, doy$b.b), doy::a, ddq.a.c, doy::c, doy::a);
    protected final GameProfile c;
    protected final ddq.a d;

    private static doy a(Either<GameProfile, b> $$0, ddq.a $$13) {
        return (doy)$$0.map($$1 -> new c((Either<GameProfile, b>)Either.left((Object)$$1), $$13), $$12 -> {
            if (!$$12.e.isEmpty() || $$12.d.isPresent() == $$12.c.isPresent()) {
                return new c((Either<GameProfile, b>)Either.right((Object)$$12), $$13);
            }
            return $$12.c.map($$1 -> new a((Either<String, UUID>)Either.left((Object)$$1), $$13)).orElseGet(() -> new a((Either<String, UUID>)Either.right((Object)$$0.d.get()), $$13));
        });
    }

    public static doy a(GameProfile $$0) {
        return new c((Either<GameProfile, b>)Either.left((Object)$$0), ddq.a.a);
    }

    public static doy a(String $$0) {
        return new a((Either<String, UUID>)Either.left((Object)$$0), ddq.a.a);
    }

    public static doy a(UUID $$0) {
        return new a((Either<String, UUID>)Either.right((Object)$$0), ddq.a.a);
    }

    protected abstract Either<GameProfile, b> a();

    protected doy(GameProfile $$0, ddq.a $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public abstract CompletableFuture<GameProfile> a(bca var1);

    public GameProfile b() {
        return this.c;
    }

    public ddq.a c() {
        return this.d;
    }

    static GameProfile a(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
        String $$3 = $$0.orElse("");
        UUID $$4 = $$1.orElseGet(() -> $$0.map(jx::a).orElse(bhs.e));
        return new GameProfile($$4, $$3, $$2);
    }

    public abstract Optional<String> d();

    public static final class c
    extends doy {
        public static final c e = new c((Either<GameProfile, b>)Either.right((Object)doy$b.a), ddq.a.a);
        private final Either<GameProfile, b> f;

        c(Either<GameProfile, b> $$02, ddq.a $$1) {
            super((GameProfile)$$02.map($$0 -> $$0, b::d), $$1);
            this.f = $$02;
        }

        @Override
        public CompletableFuture<GameProfile> a(bca $$0) {
            return CompletableFuture.completedFuture(this.c);
        }

        @Override
        protected Either<GameProfile, b> a() {
            return this.f;
        }

        @Override
        public Optional<String> d() {
            return (Optional)this.f.map($$0 -> Optional.of($$0.name()), $$0 -> $$0.c);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean equals(Object $$0) {
            if (this == $$0) return true;
            if (!($$0 instanceof c)) return false;
            c $$1 = (c)$$0;
            if (!this.f.equals($$1.f)) return false;
            if (!this.d.equals($$1.d)) return false;
            return true;
        }

        public int hashCode() {
            int $$0 = 31 + this.f.hashCode();
            $$0 = 31 * $$0 + this.d.hashCode();
            return $$0;
        }

        @Override
        public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        }
    }

    public static final class a
    extends doy {
        private static final yh e = yh.c("component.profile.dynamic").a(l.h);
        private final Either<String, UUID> f;

        a(Either<String, UUID> $$0, ddq.a $$1) {
            super(doy.a($$0.left(), $$0.right(), PropertyMap.EMPTY), $$1);
            this.f = $$0;
        }

        @Override
        public Optional<String> d() {
            return this.f.left();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean equals(Object $$0) {
            if (this == $$0) return true;
            if (!($$0 instanceof a)) return false;
            a $$1 = (a)$$0;
            if (!this.f.equals($$1.f)) return false;
            if (!this.d.equals($$1.d)) return false;
            return true;
        }

        public int hashCode() {
            int $$0 = 31 + this.f.hashCode();
            $$0 = 31 * $$0 + this.d.hashCode();
            return $$0;
        }

        @Override
        protected Either<GameProfile, b> a() {
            return Either.right((Object)new b(this.f.left(), this.f.right(), PropertyMap.EMPTY));
        }

        @Override
        public CompletableFuture<GameProfile> a(bca $$0) {
            return CompletableFuture.supplyAsync(() -> $$0.a(this.f).orElse(this.c), bhs.j());
        }

        @Override
        public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
            $$1.accept(e);
        }
    }

    protected static final class b
    extends Record {
        final Optional<String> c;
        final Optional<UUID> d;
        final PropertyMap e;
        public static final b a = new b(Optional.empty(), Optional.empty(), PropertyMap.EMPTY);
        static final MapCodec<b> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.J.optionalFieldOf("name").forGetter(b::a), (App)jx.a.optionalFieldOf("id").forGetter(b::b), (App)bfm.I.optionalFieldOf("properties", (Object)PropertyMap.EMPTY).forGetter(b::c)).apply((Applicative)$$0, b::new));
        public static final aao<ByteBuf, b> b = aao.a(aam.z.a(aam::a), b::a, jx.g.a(aam::a), b::b, aam.y, b::c, b::new);

        protected b(Optional<String> $$0, Optional<UUID> $$1, PropertyMap $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        private GameProfile d() {
            return doy.a(this.c, this.d, this.e);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "name;id;properties", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "name;id;properties", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "name;id;properties", "c", "d", "e"}, this, $$0);
        }

        public Optional<String> a() {
            return this.c;
        }

        public Optional<UUID> b() {
            return this.d;
        }

        public PropertyMap c() {
            return this.e;
        }
    }
}

