/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class ihf
extends Record {
    private final ihj.b b;
    private final a c;
    private final @Nullable bgs d;
    public static final Codec<ihf> a = RecordCodecBuilder.create($$0 -> $$0.group((App)ihl.a.fieldOf("model").forGetter(ihf::a), (App)ihf$a.b.forGetter(ihf::b)).apply((Applicative)$$0, ihf::new));

    public ihf(ihj.b $$0, a $$1) {
        this($$0, $$1, null);
    }

    public ihf(ihj.b $$0, a $$1, @Nullable bgs $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public ihf a(bgs $$0) {
        return new ihf(this.b, this.c, $$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ihf.class, "model;properties;registrySwapper", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ihf.class, "model;properties;registrySwapper", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ihf.class, "model;properties;registrySwapper", "b", "c", "d"}, this, $$0);
    }

    public ihj.b a() {
        return this.b;
    }

    public a b() {
        return this.c;
    }

    public @Nullable bgs c() {
        return this.d;
    }

    public static final class a
    extends Record {
        private final boolean c;
        private final boolean d;
        private final float e;
        public static final a a = new a(true, false, 1.0f);
        public static final MapCodec<a> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("hand_animation_on_swap", (Object)true).forGetter(a::a), (App)Codec.BOOL.optionalFieldOf("oversized_in_gui", (Object)false).forGetter(a::b), (App)Codec.FLOAT.optionalFieldOf("swap_animation_scale", (Object)Float.valueOf(1.0f)).forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(boolean $$0, boolean $$1, float $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "handAnimationOnSwap;oversizedInGui;swapAnimationScale", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "handAnimationOnSwap;oversizedInGui;swapAnimationScale", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "handAnimationOnSwap;oversizedInGui;swapAnimationScale", "c", "d", "e"}, this, $$0);
        }

        public boolean a() {
            return this.c;
        }

        public boolean b() {
            return this.d;
        }

        public float c() {
            return this.e;
        }
    }
}

