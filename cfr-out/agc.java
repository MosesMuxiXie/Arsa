/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class agc
extends Record
implements aay<adb> {
    private final yh b;
    private final Optional<byte[]> c;
    public static final aao<ByteBuf, agc> a = aao.a(yj.f, agc::b, aam.n.a(aam::a), agc::e, agc::new);

    public agc(yh $$0, Optional<byte[]> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<agc> a() {
        return ahz.ay;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{agc.class, "motd;iconBytes", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{agc.class, "motd;iconBytes", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{agc.class, "motd;iconBytes", "b", "c"}, this, $$0);
    }

    public yh b() {
        return this.b;
    }

    public Optional<byte[]> e() {
        return this.c;
    }
}

