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
import java.util.Optional;

public final class dor
extends Record {
    private final Optional<jc> c;
    private final boolean d;
    public static final Codec<dor> a = RecordCodecBuilder.create($$0 -> $$0.group((App)jc.b.optionalFieldOf("target").forGetter(dor::a), (App)Codec.BOOL.optionalFieldOf("tracked", (Object)true).forGetter(dor::b)).apply((Applicative)$$0, dor::new));
    public static final aao<ByteBuf, dor> b = aao.a(jc.c.a(aam::a), dor::a, aam.b, dor::b, dor::new);

    public dor(Optional<jc> $$0, boolean $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public dor a(axf $$0) {
        if (!this.d || this.c.isEmpty()) {
            return this;
        }
        if (this.c.get().a() != $$0.aq()) {
            return this;
        }
        is $$1 = this.c.get().b();
        if (!$$0.n($$1) || !$$0.F().a(ctb.s, $$1)) {
            return new dor(Optional.empty(), true);
        }
        return this;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dor.class, "target;tracked", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dor.class, "target;tracked", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dor.class, "target;tracked", "c", "d"}, this, $$0);
    }

    public Optional<jc> a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }
}

