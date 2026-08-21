/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class etg
extends Record
implements eto {
    private final is e;
    public static final MapCodec<etg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)is.a.fieldOf("pos").forGetter(etg::b)).apply((Applicative)$$0, etg::new));
    public static final aao<ByteBuf, etg> b = aao.a(is.b, etg::b, etg::new);

    public etg(is $$0) {
        this.e = $$0;
    }

    @Override
    public Optional<ftm> a(dwo $$0) {
        return Optional.of(ftm.b(this.e));
    }

    public etp<etg> a() {
        return etp.a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{etg.class, "pos", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{etg.class, "pos", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{etg.class, "pos", "e"}, this, $$0);
    }

    public is b() {
        return this.e;
    }

    public static class a
    implements etp<etg> {
        @Override
        public MapCodec<etg> a() {
            return a;
        }

        @Override
        public aao<ByteBuf, etg> b() {
            return b;
        }
    }
}

