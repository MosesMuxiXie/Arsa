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

public final class fby
extends Record {
    private final jh<dzq> b;
    private final jh<dzq> c;
    private final fcd d;
    private final int e;
    private final int f;
    private final float g;
    public static final Codec<fby> a = RecordCodecBuilder.create($$02 -> $$02.group((App)js.a(mj.i).fieldOf("can_grow_through").forGetter($$0 -> $$0.b), (App)js.a(mj.i).fieldOf("muddy_roots_in").forGetter($$0 -> $$0.c), (App)fcd.a.fieldOf("muddy_roots_provider").forGetter($$0 -> $$0.d), (App)Codec.intRange((int)1, (int)12).fieldOf("max_root_width").forGetter($$0 -> $$0.e), (App)Codec.intRange((int)1, (int)64).fieldOf("max_root_length").forGetter($$0 -> $$0.f), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("random_skew_chance").forGetter($$0 -> Float.valueOf($$0.g))).apply((Applicative)$$02, fby::new));

    public fby(jh<dzq> $$0, jh<dzq> $$1, fcd $$2, int $$3, int $$4, float $$5) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fby.class, "canGrowThrough;muddyRootsIn;muddyRootsProvider;maxRootWidth;maxRootLength;randomSkewChance", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fby.class, "canGrowThrough;muddyRootsIn;muddyRootsProvider;maxRootWidth;maxRootLength;randomSkewChance", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fby.class, "canGrowThrough;muddyRootsIn;muddyRootsProvider;maxRootWidth;maxRootLength;randomSkewChance", "b", "c", "d", "e", "f", "g"}, this, $$0);
    }

    public jh<dzq> a() {
        return this.b;
    }

    public jh<dzq> b() {
        return this.c;
    }

    public fcd c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public float f() {
        return this.g;
    }
}

