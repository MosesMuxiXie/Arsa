/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class adv
extends Record
implements aay<adb> {
    private final int b;
    private final int c;
    private final List<dlt> d;
    private final dlt e;
    public static final aao<xq, adv> a = aao.a(aam.x, adv::b, aam.h, adv::e, dlt.k, adv::f, dlt.h, adv::g, adv::new);

    public adv(int $$0, int $$1, List<dlt> $$2, dlt $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    @Override
    public aba<adv> a() {
        return ahz.t;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{adv.class, "containerId;stateId;items;carriedItem", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{adv.class, "containerId;stateId;items;carriedItem", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{adv.class, "containerId;stateId;items;carriedItem", "b", "c", "d", "e"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public List<dlt> f() {
        return this.d;
    }

    public dlt g() {
        return this.e;
    }
}

