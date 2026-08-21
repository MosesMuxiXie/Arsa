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

public final class azh
extends Record {
    private final dgz b;
    private static final Codec<azh> c = RecordCodecBuilder.create($$0 -> $$0.group((App)dhb.f.fieldOf("enabled").forGetter(azh::a)).apply((Applicative)$$0, azh::new));
    public static final azy<azh> a = new azy<azh>("features", c);

    public azh(dgz $$0) {
        this.b = $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{azh.class, "flags", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{azh.class, "flags", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{azh.class, "flags", "b"}, this, $$0);
    }

    public dgz a() {
        return this.b;
    }
}

