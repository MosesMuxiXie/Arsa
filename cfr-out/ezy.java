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

public final class ezy
extends Record
implements fac {
    private final fcl b;
    private final evx c;
    private final cch d;
    private final int e;
    public static final Codec<ezy> a = RecordCodecBuilder.create($$0 -> $$0.group((App)fcl.a.fieldOf("state_provider").forGetter(ezy::a), (App)evx.b.fieldOf("target").forGetter(ezy::b), (App)cch.b(0, 8).fieldOf("radius").forGetter(ezy::c), (App)Codec.intRange((int)0, (int)4).fieldOf("half_height").forGetter(ezy::d)).apply((Applicative)$$0, ezy::new));

    public ezy(fcl $$0, evx $$1, cch $$2, int $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ezy.class, "stateProvider;target;radius;halfHeight", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ezy.class, "stateProvider;target;radius;halfHeight", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ezy.class, "stateProvider;target;radius;halfHeight", "b", "c", "d", "e"}, this, $$0);
    }

    public fcl a() {
        return this.b;
    }

    public evx b() {
        return this.c;
    }

    public cch c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }
}

