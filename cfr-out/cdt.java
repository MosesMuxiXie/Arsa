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
import java.util.List;

public final class cdt
extends Record {
    private final lw b;
    private final float c;
    public static final Codec<cdt> a = RecordCodecBuilder.create($$02 -> $$02.group((App)ly.bl.fieldOf("particle").forGetter($$0 -> $$0.b), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter($$0 -> Float.valueOf($$0.c))).apply((Applicative)$$02, cdt::new));

    public cdt(lw $$0, float $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public boolean a(bgr $$0) {
        return $$0.i() <= this.c;
    }

    public static List<cdt> a(lw $$0, float $$1) {
        return List.of(new cdt($$0, $$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cdt.class, "particle;probability", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cdt.class, "particle;probability", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cdt.class, "particle;probability", "b", "c"}, this, $$0);
    }

    public lw a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }
}

