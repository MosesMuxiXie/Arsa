/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class abq
extends Record
implements aay<abg> {
    private final jd<asj> c;
    public static final aao<xq, abq> a = aao.a(asj.f, abq::b, abq::new);
    public static final aao<ByteBuf, abq> b = aao.a(asj.g.a(jd::a, jd::a), abq::b, abq::new);

    public abq(jd<asj> $$0) {
        this.c = $$0;
    }

    @Override
    public aba<abq> a() {
        return abu.j;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abq.class, "dialog", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abq.class, "dialog", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abq.class, "dialog", "c"}, this, $$0);
    }

    public jd<asj> b() {
        return this.c;
    }
}

