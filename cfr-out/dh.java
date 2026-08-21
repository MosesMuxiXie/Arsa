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
import org.jspecify.annotations.Nullable;

public final class dh
extends Record
implements bt {
    private final cq.d c;
    public static final MapCodec<dh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)cq.d.d.optionalFieldOf("size", (Object)cq.d.c).forGetter(dh::b)).apply((Applicative)$$0, dh::new));

    public dh(cq.d $$0) {
        this.c = $$0;
    }

    public static dh a(cq.d $$0) {
        return new dh($$0);
    }

    @Override
    public boolean a(cgk $$0, axf $$1, @Nullable ftm $$2) {
        if ($$0 instanceof dag) {
            dag $$3 = (dag)$$0;
            return this.c.d($$3.gR());
        }
        return false;
    }

    public MapCodec<dh> a() {
        return bu.d;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dh.class, "size", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dh.class, "size", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dh.class, "size", "c"}, this, $$0);
    }

    public cq.d b() {
        return this.c;
    }
}

