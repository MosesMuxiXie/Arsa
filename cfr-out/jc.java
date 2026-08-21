/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class jc
extends Record {
    private final amt<dwo> d;
    private final is e;
    public static final MapCodec<jc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dwo.g.fieldOf("dimension").forGetter(jc::a), (App)is.a.fieldOf("pos").forGetter(jc::b)).apply((Applicative)$$0, jc::a));
    public static final Codec<jc> b = a.codec();
    public static final aao<ByteBuf, jc> c = aao.a(amt.b(mj.bE), jc::a, is.b, jc::b, jc::a);

    public jc(amt<dwo> $$0, is $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public static jc a(amt<dwo> $$0, is $$1) {
        return new jc($$0, $$1);
    }

    @Override
    public String toString() {
        return String.valueOf(this.d) + " " + String.valueOf(this.e);
    }

    public boolean a(amt<dwo> $$0, is $$1, int $$2) {
        return this.d.equals($$0) && this.e.l($$1) <= $$2;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jc.class, "dimension;pos", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jc.class, "dimension;pos", "d", "e"}, this, $$0);
    }

    public amt<dwo> a() {
        return this.d;
    }

    public is b() {
        return this.e;
    }
}

