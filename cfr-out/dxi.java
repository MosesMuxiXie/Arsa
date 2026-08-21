/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public record dxi(uz d, Optional<a> e, Optional<cgx> f) {
    public static final String a = "entity";
    public static final Codec<dxi> b = RecordCodecBuilder.create($$02 -> $$02.group((App)uz.a.fieldOf(a).forGetter($$0 -> $$0.d), (App)dxi$a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0 -> $$0.e), (App)cgx.b.optionalFieldOf("equipment").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, dxi::new));
    public static final Codec<cbn<dxi>> c = cbn.a(b);

    public dxi() {
        this(new uz(), Optional.empty(), Optional.empty());
    }

    public dxi {
        Optional<amo> $$3 = $$0.a("id", amo.a);
        if ($$3.isPresent()) {
            $$0.a("id", amo.a, $$3.get());
        } else {
            $$0.r("id");
        }
    }

    public uz a() {
        return this.d;
    }

    public Optional<a> b() {
        return this.e;
    }

    public Optional<cgx> c() {
        return this.f;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dxi.class, "entityToSpawn;customSpawnRules;equipment", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dxi.class, "entityToSpawn;customSpawnRules;equipment", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dxi.class, "entityToSpawn;customSpawnRules;equipment", "d", "e", "f"}, this, $$0);
    }

    public static final class a
    extends Record {
        private final bfz<Integer> b;
        private final bfz<Integer> c;
        private static final bfz<Integer> d = new bfz<Integer>(0, 15);
        public static final Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)dxi$a.a("block_light_limit").forGetter($$0 -> $$0.b), (App)dxi$a.a("sky_light_limit").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, a::new));

        public a(bfz<Integer> $$0, bfz<Integer> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        private static DataResult<bfz<Integer>> a(bfz<Integer> $$0) {
            if (!d.a($$0)) {
                return DataResult.error(() -> "Light values must be withing range " + String.valueOf(d));
            }
            return DataResult.success($$0);
        }

        private static MapCodec<bfz<Integer>> a(String $$0) {
            return bfz.a.lenientOptionalFieldOf($$0, d).validate(a::a);
        }

        public boolean a(is $$0, axf $$1) {
            return this.b.a($$1.a(dww.b, $$0)) && this.c.a($$1.a(dww.a, $$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "blockLightLimit;skyLightLimit", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "blockLightLimit;skyLightLimit", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "blockLightLimit;skyLightLimit", "b", "c"}, this, $$0);
        }

        public bfz<Integer> a() {
            return this.b;
        }

        public bfz<Integer> b() {
            return this.c;
        }
    }
}

