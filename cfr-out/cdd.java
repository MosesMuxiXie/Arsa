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

public final class cdd
extends Record {
    private final int b;
    private final dlt c;
    public static final Codec<cdd> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.p.fieldOf("Slot").orElse((Object)0).forGetter(cdd::a), (App)dlt.a.forGetter(cdd::b)).apply((Applicative)$$0, cdd::new));

    public cdd(int $$0, dlt $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public boolean a(int $$0) {
        return this.b >= 0 && this.b < $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cdd.class, "slot;stack", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cdd.class, "slot;stack", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cdd.class, "slot;stack", "b", "c"}, this, $$0);
    }

    public int a() {
        return this.b;
    }

    public dlt b() {
        return this.c;
    }
}

