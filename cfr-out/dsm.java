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

public final class dsm
extends Record {
    private final int c;
    public static final Codec<dsm> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.r.fieldOf("value").forGetter(dsm::a)).apply((Applicative)$$0, dsm::new));
    public static final aao<ByteBuf, dsm> b = aao.a(aam.h, dsm::a, dsm::new);

    public dsm(int $$0) {
        if ($$0 <= 0) {
            throw new IllegalArgumentException("Enchantment value must be positive, but was " + $$0);
        }
        this.c = $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsm.class, "value", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsm.class, "value", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsm.class, "value", "c"}, this, $$0);
    }

    public int a() {
        return this.c;
    }
}

