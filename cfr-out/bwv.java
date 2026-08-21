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

public final class bwv
extends Record {
    private final Optional<Integer> b;
    private final Optional<is> c;
    public static final aao<ByteBuf, bwv> a = aao.a(aam.h.a(aam::a), bwv::a, is.b.a(aam::a), bwv::b, bwv::new);

    public bwv(Optional<Integer> $$0, Optional<is> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bwv.class, "attackTarget;jumpTarget", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bwv.class, "attackTarget;jumpTarget", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bwv.class, "attackTarget;jumpTarget", "b", "c"}, this, $$0);
    }

    public Optional<Integer> a() {
        return this.b;
    }

    public Optional<is> b() {
        return this.c;
    }
}

