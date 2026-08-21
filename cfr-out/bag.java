/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class bag
extends Record {
    private final String c;
    private final String d;
    private final String e;
    public static final aao<ByteBuf, bag> a = aao.a(aam.p, bag::b, aam.p, bag::c, aam.p, bag::d, bag::new);
    public static final String b = "minecraft";

    public bag(String $$0, String $$1, String $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public static bag a(String $$0) {
        return new bag(b, $$0, w.b().b());
    }

    public boolean a() {
        return this.c.equals(b);
    }

    @Override
    public String toString() {
        return this.c + ":" + this.d + ":" + this.e;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bag.class, "namespace;id;version", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bag.class, "namespace;id;version", "c", "d", "e"}, this, $$0);
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }
}

