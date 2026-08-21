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

public final class dpb
extends Record {
    private final dnf d;
    private final int e;
    public static final dpb a = new dpb(dnf.b, 6);
    public static final Codec<dpb> b = RecordCodecBuilder.create($$0 -> $$0.group((App)dnf.d.optionalFieldOf("type", (Object)dpb.a.d).forGetter(dpb::a), (App)bfm.r.optionalFieldOf("duration", (Object)dpb.a.e).forGetter(dpb::b)).apply((Applicative)$$0, dpb::new));
    public static final aao<ByteBuf, dpb> c = aao.a(dnf.e, dpb::a, aam.h, dpb::b, dpb::new);

    public dpb(dnf $$0, int $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpb.class, "type;duration", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpb.class, "type;duration", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpb.class, "type;duration", "d", "e"}, this, $$0);
    }

    public dnf a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }
}

