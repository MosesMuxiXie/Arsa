/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class bxc
extends Record {
    private final is b;
    private final jd<cta> c;
    private final int d;
    public static final aao<xq, bxc> a = aao.a(is.b, bxc::a, aam.b(mj.ai), bxc::b, aam.h, bxc::c, bxc::new);

    public bxc(csy $$0) {
        this($$0.g(), $$0.h(), $$0.b());
    }

    public bxc(is $$0, jd<cta> $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bxc.class, "pos;poiType;freeTicketCount", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bxc.class, "pos;poiType;freeTicketCount", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bxc.class, "pos;poiType;freeTicketCount", "b", "c", "d"}, this, $$0);
    }

    public is a() {
        return this.b;
    }

    public jd<cta> b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }
}

