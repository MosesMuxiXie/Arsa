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
import java.util.function.Consumer;

public final class doz
extends Record
implements dpe {
    private final amt<fof> b;
    private final long c;
    private static final yh d = yh.c("item.container.loot_table.unknown");
    public static final Codec<doz> a = RecordCodecBuilder.create($$0 -> $$0.group((App)fof.a.fieldOf("loot_table").forGetter(doz::a), (App)Codec.LONG.optionalFieldOf("seed", (Object)0L).forGetter(doz::b)).apply((Applicative)$$0, doz::new));

    public doz(amt<fof> $$0, long $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        $$1.accept(d);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{doz.class, "lootTable;seed", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{doz.class, "lootTable;seed", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{doz.class, "lootTable;seed", "b", "c"}, this, $$0);
    }

    public amt<fof> a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }
}

