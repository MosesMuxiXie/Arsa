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

public final class cdr
extends Record {
    private final jd<bcz> b;
    private final double c;
    public static final Codec<cdr> a = RecordCodecBuilder.create($$02 -> $$02.group((App)bcz.b.fieldOf("sound").forGetter($$0 -> $$0.b), (App)Codec.DOUBLE.fieldOf("tick_chance").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, cdr::new));

    public cdr(jd<bcz> $$0, double $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cdr.class, "soundEvent;tickChance", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cdr.class, "soundEvent;tickChance", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cdr.class, "soundEvent;tickChance", "b", "c"}, this, $$0);
    }

    public jd<bcz> a() {
        return this.b;
    }

    public double b() {
        return this.c;
    }
}

