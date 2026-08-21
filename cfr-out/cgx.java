/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public final class cgx
extends Record {
    private final amt<fof> c;
    private final Map<cgv, Float> d;
    public static final Codec<Map<cgv, Float>> a = Codec.either((Codec)Codec.FLOAT, (Codec)Codec.unboundedMap(cgv.l, (Codec)Codec.FLOAT)).xmap($$0 -> (Map)$$0.map(cgx::a, Function.identity()), $$0 -> {
        boolean $$1 = $$0.values().stream().distinct().count() == 1L;
        boolean $$2 = $$0.keySet().containsAll(cgv.j);
        if ($$1 && $$2) {
            return Either.left((Object)$$0.values().stream().findFirst().orElse(Float.valueOf(0.0f)));
        }
        return Either.right((Object)$$0);
    });
    public static final Codec<cgx> b = RecordCodecBuilder.create($$0 -> $$0.group((App)fof.a.fieldOf("loot_table").forGetter(cgx::a), (App)a.optionalFieldOf("slot_drop_chances", Map.of()).forGetter(cgx::b)).apply((Applicative)$$0, cgx::new));

    public cgx(amt<fof> $$0, float $$1) {
        this($$0, cgx.a($$1));
    }

    public cgx(amt<fof> $$0, Map<cgv, Float> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    private static Map<cgv, Float> a(float $$0) {
        return cgx.a(List.of(cgv.values()), $$0);
    }

    private static Map<cgv, Float> a(List<cgv> $$0, float $$1) {
        HashMap $$2 = Maps.newHashMap();
        for (cgv $$3 : $$0) {
            $$2.put($$3, Float.valueOf($$1));
        }
        return $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cgx.class, "lootTable;slotDropChances", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cgx.class, "lootTable;slotDropChances", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cgx.class, "lootTable;slotDropChances", "c", "d"}, this, $$0);
    }

    public amt<fof> a() {
        return this.c;
    }

    public Map<cgv, Float> b() {
        return this.d;
    }
}

