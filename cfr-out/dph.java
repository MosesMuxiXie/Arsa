/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class dph
extends Record {
    private final boolean d;
    private final boolean e;
    private final float f;
    public static final dph a = new dph(false, true, 0.2f);
    public static final Codec<dph> b = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("can_sprint", (Object)dph.a.d).forGetter(dph::a), (App)Codec.BOOL.optionalFieldOf("interact_vibrations", (Object)dph.a.e).forGetter(dph::b), (App)Codec.floatRange((float)0.0f, (float)1.0f).optionalFieldOf("speed_multiplier", (Object)Float.valueOf(dph.a.f)).forGetter(dph::c)).apply((Applicative)$$0, dph::new));
    public static final aao<ByteBuf, dph> c = aao.a(aam.b, dph::a, aam.b, dph::b, aam.l, dph::c, dph::new);

    public dph(boolean $$0, boolean $$1, float $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dph.class, "canSprint;interactVibrations;speedMultiplier", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dph.class, "canSprint;interactVibrations;speedMultiplier", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dph.class, "canSprint;interactVibrations;speedMultiplier", "d", "e", "f"}, this, $$0);
    }

    public boolean a() {
        return this.d;
    }

    public boolean b() {
        return this.e;
    }

    public float c() {
        return this.f;
    }
}

