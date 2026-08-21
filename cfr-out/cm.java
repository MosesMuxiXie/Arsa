/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class cm
extends Record
implements bt {
    private final cq.d c;
    private final Optional<bs> d;
    public static final MapCodec<cm> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)cq.d.d.optionalFieldOf("blocks_set_on_fire", (Object)cq.d.c).forGetter(cm::b), (App)bs.a.optionalFieldOf("entity_struck").forGetter(cm::c)).apply((Applicative)$$0, cm::new));

    public cm(cq.d $$0, Optional<bs> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public static cm a(cq.d $$0) {
        return new cm($$0, Optional.empty());
    }

    public MapCodec<cm> a() {
        return bu.a;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(cgk $$0, axf $$1, @Nullable ftm $$22) {
        void $$4;
        if (!($$0 instanceof chk)) {
            return false;
        }
        chk $$3 = (chk)$$0;
        return this.c.d($$4.f()) && (this.d.isEmpty() || $$4.i().anyMatch($$2 -> this.d.get().a($$1, $$22, (cgk)$$2)));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cm.class, "blocksSetOnFire;entityStruck", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cm.class, "blocksSetOnFire;entityStruck", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cm.class, "blocksSetOnFire;entityStruck", "c", "d"}, this, $$0);
    }

    public cq.d b() {
        return this.c;
    }

    public Optional<bs> c() {
        return this.d;
    }
}

