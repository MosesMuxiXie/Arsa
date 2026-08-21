/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class ack
extends Record
implements aay<ach> {
    private final amt<? extends jq<?>> b;
    private final List<ju.a> c;
    private static final aao<ByteBuf, amt<? extends jq<?>>> d = amo.b.a(amt::a, amt::a);
    public static final aao<wx, ack> a = aao.a(d, ack::b, ju.a.a.a(aam.a()), ack::e, ack::new);

    public ack(amt<? extends jq<?>> $$0, List<ju.a> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<ack> a() {
        return aco.c;
    }

    @Override
    public void a(ach $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ack.class, "registry;entries", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ack.class, "registry;entries", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ack.class, "registry;entries", "b", "c"}, this, $$0);
    }

    public amt<? extends jq<?>> b() {
        return this.b;
    }

    public List<ju.a> e() {
        return this.c;
    }
}

