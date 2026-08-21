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

public final class cds
extends Record {
    private final jd<bcz> c;
    private final int d;
    private final int e;
    private final double f;
    public static final Codec<cds> a = RecordCodecBuilder.create($$02 -> $$02.group((App)bcz.b.fieldOf("sound").forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("tick_delay").forGetter($$0 -> $$0.d), (App)Codec.INT.fieldOf("block_search_extent").forGetter($$0 -> $$0.e), (App)Codec.DOUBLE.fieldOf("offset").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, cds::new));
    public static final cds b = new cds(bda.h, 6000, 8, 2.0);

    public cds(jd<bcz> $$0, int $$1, int $$2, double $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cds.class, "soundEvent;tickDelay;blockSearchExtent;soundPositionOffset", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cds.class, "soundEvent;tickDelay;blockSearchExtent;soundPositionOffset", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cds.class, "soundEvent;tickDelay;blockSearchExtent;soundPositionOffset", "c", "d", "e", "f"}, this, $$0);
    }

    public jd<bcz> a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public double d() {
        return this.f;
    }
}

