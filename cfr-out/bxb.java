/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class bxb
extends Record {
    private final flp b;
    private final float c;
    public static final aao<wx, bxb> a = aao.a(flp.a, bxb::a, aam.l, bxb::b, bxb::new);

    public bxb(flp $$0, float $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bxb.class, "path;maxNodeDistance", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bxb.class, "path;maxNodeDistance", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bxb.class, "path;maxNodeDistance", "b", "c"}, this, $$0);
    }

    public flp a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }
}

