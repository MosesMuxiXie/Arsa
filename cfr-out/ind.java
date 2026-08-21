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

public final class ind
extends Record {
    private final ine d;
    public static final ind a = new ind(ine.b);
    public static final Codec<ind> b = RecordCodecBuilder.create($$0 -> $$0.group((App)ine.a.optionalFieldOf("scaling", (Object)ine.b).forGetter(ind::a)).apply((Applicative)$$0, ind::new));
    public static final azy<ind> c = new azy<ind>("gui", b);

    public ind(ine $$0) {
        this.d = $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ind.class, "scaling", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ind.class, "scaling", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ind.class, "scaling", "d"}, this, $$0);
    }

    public ine a() {
        return this.d;
    }
}

