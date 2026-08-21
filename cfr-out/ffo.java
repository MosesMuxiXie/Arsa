/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ffo {
    public static final Codec<ffo> a = mi.R.q().dispatch(ffo::e, ffx::codec);
    public static final Codec<jd<ffo>> b = amq.a(mj.bs, a);
    protected final c c;

    public static <S extends ffo> RecordCodecBuilder<S, c> a(RecordCodecBuilder.Instance<S> $$02) {
        return ffo$c.a.forGetter($$0 -> $$0.c);
    }

    public static <S extends ffo> MapCodec<S> a(Function<c, S> $$0) {
        return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ffo.a($$1)).apply((Applicative)$$1, $$0));
    }

    protected ffo(c $$0) {
        this.c = $$0;
    }

    public jh<dxo> a() {
        return this.c.b;
    }

    public Map<cho, ffv> b() {
        return this.c.c;
    }

    public eum.a c() {
        return this.c.d;
    }

    public ffz d() {
        return this.c.e;
    }

    public ffg a(ffg $$0) {
        if (this.d() != ffz.a) {
            return $$0.a(12);
        }
        return $$0;
    }

    public ffw a(jd<ffo> $$0, amt<dwo> $$1, jr $$2, eqg $$3, dxs $$4, eve $$5, fjr $$6, long $$7, dvu $$8, int $$9, dwq $$10, Predicate<jd<dxo>> $$11) {
        fgg $$15;
        ffw $$16;
        bzx $$12 = bzu.f.a($$8, $$1, $$0);
        a $$13 = new a($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$10, $$11);
        Optional<b> $$14 = this.b($$13);
        if ($$14.isPresent() && ($$16 = new ffw(this, $$8, $$9, ($$15 = $$14.get().a()).a())).b()) {
            if ($$12 != null) {
                $$12.finish(true);
            }
            return $$16;
        }
        if ($$12 != null) {
            $$12.finish(false);
        }
        return ffw.b;
    }

    protected static Optional<b> a(a $$0, euq.a $$1, Consumer<fgg> $$2) {
        dvu $$3 = $$0.h();
        int $$4 = $$3.c();
        int $$5 = $$3.d();
        int $$6 = $$0.b().c($$4, $$5, $$1, $$0.i(), $$0.d());
        return Optional.of(new b(new is($$4, $$6, $$5), $$2));
    }

    private static boolean a(b $$0, a $$1) {
        is $$2 = $$0.b();
        return $$1.j.test($$1.b.d().getNoiseBiome(jo.a($$2.u()), jo.a($$2.v()), jo.a($$2.w()), $$1.d.b()));
    }

    public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, fgd $$6) {
    }

    private static int[] c(a $$0, int $$1, int $$2, int $$3, int $$4) {
        eqg $$5 = $$0.b();
        dwq $$6 = $$0.i();
        eve $$7 = $$0.d();
        return new int[]{$$5.c($$1, $$3, euq.a.a, $$6, $$7), $$5.c($$1, $$3 + $$4, euq.a.a, $$6, $$7), $$5.c($$1 + $$2, $$3, euq.a.a, $$6, $$7), $$5.c($$1 + $$2, $$3 + $$4, euq.a.a, $$6, $$7)};
    }

    public static int a(a $$0, int $$1, int $$2, int $$3, int $$4) {
        int[] $$5 = ffo.c($$0, $$1, $$2, $$3, $$4);
        return ($$5[0] + $$5[1] + $$5[2] + $$5[3]) / 4;
    }

    protected static int a(a $$0, int $$1, int $$2) {
        dvu $$3 = $$0.h();
        int $$4 = $$3.e();
        int $$5 = $$3.f();
        return ffo.b($$0, $$4, $$5, $$1, $$2);
    }

    protected static int b(a $$0, int $$1, int $$2, int $$3, int $$4) {
        int[] $$5 = ffo.c($$0, $$1, $$3, $$2, $$4);
        return Math.min(Math.min($$5[0], $$5[1]), Math.min($$5[2], $$5[3]));
    }

    @Deprecated
    protected is a(a $$0, egm $$1) {
        int $$2 = 5;
        int $$3 = 5;
        if ($$1 == egm.b) {
            $$2 = -5;
        } else if ($$1 == egm.c) {
            $$2 = -5;
            $$3 = -5;
        } else if ($$1 == egm.d) {
            $$3 = -5;
        }
        dvu $$4 = $$0.h();
        int $$5 = $$4.a(7);
        int $$6 = $$4.b(7);
        return new is($$5, ffo.b($$0, $$5, $$6, $$2, $$3), $$6);
    }

    protected abstract Optional<b> a(a var1);

    public Optional<b> b(a $$0) {
        return this.a($$0).filter($$1 -> ffo.a($$1, $$0));
    }

    public abstract ffx<?> e();

    public static final class c
    extends Record {
        final jh<dxo> b;
        final Map<cho, ffv> c;
        final eum.a d;
        final ffz e;
        static final c f = new c(jh.a(new jd[0]), Map.of(), eum.a.e, ffz.a);
        public static final MapCodec<c> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)js.a(mj.aS).fieldOf("biomes").forGetter(c::a), (App)Codec.simpleMap(cho.i, ffv.a, (Keyable)bhh.b(cho.values())).fieldOf("spawn_overrides").forGetter(c::b), (App)eum.a.l.fieldOf("step").forGetter(c::c), (App)ffz.f.optionalFieldOf("terrain_adaptation", (Object)ffo$c.f.e).forGetter(c::d)).apply((Applicative)$$0, c::new));

        public c(jh<dxo> $$0) {
            this($$0, ffo$c.f.c, ffo$c.f.d, ffo$c.f.e);
        }

        public c(jh<dxo> $$0, Map<cho, ffv> $$1, eum.a $$2, ffz $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "biomes;spawnOverrides;step;terrainAdaptation", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "biomes;spawnOverrides;step;terrainAdaptation", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "biomes;spawnOverrides;step;terrainAdaptation", "b", "c", "d", "e"}, this, $$0);
        }

        public jh<dxo> a() {
            return this.b;
        }

        public Map<cho, ffv> b() {
            return this.c;
        }

        public eum.a c() {
            return this.d;
        }

        public ffz d() {
            return this.e;
        }

        public static class a {
            private final jh<dxo> a;
            private Map<cho, ffv> b;
            private eum.a c;
            private ffz d;

            public a(jh<dxo> $$0) {
                this.b = ffo$c.f.c;
                this.c = ffo$c.f.d;
                this.d = ffo$c.f.e;
                this.a = $$0;
            }

            public a a(Map<cho, ffv> $$0) {
                this.b = $$0;
                return this;
            }

            public a a(eum.a $$0) {
                this.c = $$0;
                return this;
            }

            public a a(ffz $$0) {
                this.d = $$0;
                return this;
            }

            public c a() {
                return new c(this.a, this.b, this.c, this.d);
            }
        }
    }

    public static final class a
    extends Record {
        private final jr a;
        final eqg b;
        private final dxs c;
        final eve d;
        private final fjr e;
        private final evp f;
        private final long g;
        private final dvu h;
        private final dwq i;
        final Predicate<jd<dxo>> j;

        public a(jr $$0, eqg $$1, dxs $$2, eve $$3, fjr $$4, long $$5, dvu $$6, dwq $$7, Predicate<jd<dxo>> $$8) {
            this($$0, $$1, $$2, $$3, $$4, ffo$a.a($$5, $$6), $$5, $$6, $$7, $$8);
        }

        public a(jr $$0, eqg $$1, dxs $$2, eve $$3, fjr $$4, evp $$5, long $$6, dvu $$7, dwq $$8, Predicate<jd<dxo>> $$9) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
            this.h = $$7;
            this.i = $$8;
            this.j = $$9;
        }

        private static evp a(long $$0, dvu $$1) {
            evp $$2 = new evp(new eur(0L));
            $$2.c($$0, $$1.h, $$1.i);
            return $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "registryAccess;chunkGenerator;biomeSource;randomState;structureTemplateManager;random;seed;chunkPos;heightAccessor;validBiome", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "registryAccess;chunkGenerator;biomeSource;randomState;structureTemplateManager;random;seed;chunkPos;heightAccessor;validBiome", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "registryAccess;chunkGenerator;biomeSource;randomState;structureTemplateManager;random;seed;chunkPos;heightAccessor;validBiome", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
        }

        public jr a() {
            return this.a;
        }

        public eqg b() {
            return this.b;
        }

        public dxs c() {
            return this.c;
        }

        public eve d() {
            return this.d;
        }

        public fjr e() {
            return this.e;
        }

        public evp f() {
            return this.f;
        }

        public long g() {
            return this.g;
        }

        public dvu h() {
            return this.h;
        }

        public dwq i() {
            return this.i;
        }

        public Predicate<jd<dxo>> j() {
            return this.j;
        }
    }

    public record b(is a, Either<Consumer<fgg>, fgg> b) {
        private final is a;
        private final Either<Consumer<fgg>, fgg> b;

        public b(is $$0, Consumer<fgg> $$1) {
            this($$0, (Either<Consumer<fgg>, fgg>)Either.left($$1));
        }

        public fgg a() {
            return (fgg)this.b.map($$0 -> {
                fgg $$1 = new fgg();
                $$0.accept($$1);
                return $$1;
            }, $$0 -> $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "position;generator", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "position;generator", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "position;generator", "a", "b"}, this, $$0);
        }

        public is b() {
            return this.a;
        }

        public Either<Consumer<fgg>, fgg> c() {
            return this.b;
        }
    }
}

