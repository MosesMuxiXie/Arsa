/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class eni
extends Record {
    private final int d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final int i;
    private final cbn<dxi> j;
    private final cbn<amt<fof>> k;
    private final amt<fof> l;
    public static final eni a = eni.b().a();
    public static final Codec<eni> b = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.intRange((int)1, (int)128).optionalFieldOf("spawn_range", (Object)eni.a.d).forGetter(eni::c), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).optionalFieldOf("total_mobs", (Object)Float.valueOf(eni.a.e)).forGetter(eni::d), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs", (Object)Float.valueOf(eni.a.f)).forGetter(eni::e), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).optionalFieldOf("total_mobs_added_per_player", (Object)Float.valueOf(eni.a.g)).forGetter(eni::f), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).optionalFieldOf("simultaneous_mobs_added_per_player", (Object)Float.valueOf(eni.a.h)).forGetter(eni::g), (App)Codec.intRange((int)0, (int)Integer.MAX_VALUE).optionalFieldOf("ticks_between_spawn", (Object)eni.a.i).forGetter(eni::h), (App)dxi.c.optionalFieldOf("spawn_potentials", cbn.a()).forGetter(eni::i), (App)cbn.a(fof.a).optionalFieldOf("loot_tables_to_eject", eni.a.k).forGetter(eni::j), (App)fof.a.optionalFieldOf("items_to_drop_when_ominous", eni.a.l).forGetter(eni::k)).apply((Applicative)$$0, eni::new));
    public static final Codec<jd<eni>> c = amq.a(mj.bx, b);

    public eni(int $$0, float $$1, float $$2, float $$3, float $$4, int $$5, cbn<dxi> $$6, cbn<amt<fof>> $$7, amt<fof> $$8) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
        this.k = $$7;
        this.l = $$8;
    }

    public int a(int $$0) {
        return (int)Math.floor(this.e + this.g * (float)$$0);
    }

    public int b(int $$0) {
        return (int)Math.floor(this.f + this.h * (float)$$0);
    }

    public long a() {
        return 160L;
    }

    public static a b() {
        return new a();
    }

    public eni a(cgu<?> $$0) {
        uz $$1 = new uz();
        $$1.a("id", mi.g.b($$0).toString());
        dxi $$2 = new dxi($$1, Optional.empty(), Optional.empty());
        return new eni(this.d, this.e, this.f, this.g, this.h, this.i, cbn.a($$2), this.k, this.l);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{eni.class, "spawnRange;totalMobs;simultaneousMobs;totalMobsAddedPerPlayer;simultaneousMobsAddedPerPlayer;ticksBetweenSpawn;spawnPotentialsDefinition;lootTablesToEject;itemsToDropWhenOminous", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{eni.class, "spawnRange;totalMobs;simultaneousMobs;totalMobsAddedPerPlayer;simultaneousMobsAddedPerPlayer;ticksBetweenSpawn;spawnPotentialsDefinition;lootTablesToEject;itemsToDropWhenOminous", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{eni.class, "spawnRange;totalMobs;simultaneousMobs;totalMobsAddedPerPlayer;simultaneousMobsAddedPerPlayer;ticksBetweenSpawn;spawnPotentialsDefinition;lootTablesToEject;itemsToDropWhenOminous", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this, $$0);
    }

    public int c() {
        return this.d;
    }

    public float d() {
        return this.e;
    }

    public float e() {
        return this.f;
    }

    public float f() {
        return this.g;
    }

    public float g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    public cbn<dxi> i() {
        return this.j;
    }

    public cbn<amt<fof>> j() {
        return this.k;
    }

    public amt<fof> k() {
        return this.l;
    }

    public static class a {
        private int a = 4;
        private float b = 6.0f;
        private float c = 2.0f;
        private float d = 2.0f;
        private float e = 1.0f;
        private int f = 40;
        private cbn<dxi> g = cbn.a();
        private cbn<amt<fof>> h = cbn.b().a(fnv.aR).a(fnv.aQ).a();
        private amt<fof> i = fnv.aU;

        public a a(int $$0) {
            this.a = $$0;
            return this;
        }

        public a a(float $$0) {
            this.b = $$0;
            return this;
        }

        public a b(float $$0) {
            this.c = $$0;
            return this;
        }

        public a c(float $$0) {
            this.d = $$0;
            return this;
        }

        public a d(float $$0) {
            this.e = $$0;
            return this;
        }

        public a b(int $$0) {
            this.f = $$0;
            return this;
        }

        public a a(cbn<dxi> $$0) {
            this.g = $$0;
            return this;
        }

        public a b(cbn<amt<fof>> $$0) {
            this.h = $$0;
            return this;
        }

        public a a(amt<fof> $$0) {
            this.i = $$0;
            return this;
        }

        public eni a() {
            return new eni(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }
}

