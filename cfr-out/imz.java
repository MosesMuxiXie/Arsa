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
import java.util.Optional;

public final class imz
extends Record {
    private final Optional<List<imy>> c;
    private final Optional<Integer> d;
    private final Optional<Integer> e;
    private final int f;
    private final boolean g;
    public static final Codec<imz> a = RecordCodecBuilder.create($$0 -> $$0.group((App)imy.b.listOf().optionalFieldOf("frames").forGetter(imz::a), (App)bfm.r.optionalFieldOf("width").forGetter(imz::b), (App)bfm.r.optionalFieldOf("height").forGetter(imz::c), (App)bfm.r.optionalFieldOf("frametime", (Object)1).forGetter(imz::d), (App)Codec.BOOL.optionalFieldOf("interpolate", (Object)false).forGetter(imz::e)).apply((Applicative)$$0, imz::new));
    public static final azy<imz> b = new azy<imz>("animation", a);

    public imz(Optional<List<imy>> $$0, Optional<Integer> $$1, Optional<Integer> $$2, int $$3, boolean $$4) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
    }

    public ina a(int $$0, int $$1) {
        if (this.d.isPresent()) {
            if (this.e.isPresent()) {
                return new ina(this.d.get(), this.e.get());
            }
            return new ina(this.d.get(), $$1);
        }
        if (this.e.isPresent()) {
            return new ina($$0, this.e.get());
        }
        int $$2 = Math.min($$0, $$1);
        return new ina($$2, $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{imz.class, "frames;frameWidth;frameHeight;defaultFrameTime;interpolatedFrames", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{imz.class, "frames;frameWidth;frameHeight;defaultFrameTime;interpolatedFrames", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{imz.class, "frames;frameWidth;frameHeight;defaultFrameTime;interpolatedFrames", "c", "d", "e", "f", "g"}, this, $$0);
    }

    public Optional<List<imy>> a() {
        return this.c;
    }

    public Optional<Integer> b() {
        return this.d;
    }

    public Optional<Integer> c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public boolean e() {
        return this.g;
    }
}

