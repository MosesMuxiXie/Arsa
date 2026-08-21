/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class bwx
extends Record {
    private final jd<etk> b;
    private final ftm c;
    public static final aao<xq, bwx> a = aao.a(aam.b(mj.N), bwx::a, ftm.b, bwx::b, bwx::new);

    public bwx(jd<etk> $$0, ftm $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bwx.class, "event;pos", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bwx.class, "event;pos", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bwx.class, "event;pos", "b", "c"}, this, $$0);
    }

    public jd<etk> a() {
        return this.b;
    }

    public ftm b() {
        return this.c;
    }
}

