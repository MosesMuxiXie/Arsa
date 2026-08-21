/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ajw
extends Record
implements aay<aib> {
    private final short b;
    private final dlt c;
    public static final aao<xq, ajw> a = aao.a(aam.e, ajw::b, dlt.a(dlt.i), ajw::e, ajw::new);

    public ajw(int $$0, dlt $$1) {
        this((short)$$0, $$1);
    }

    public ajw(short $$0, dlt $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<ajw> a() {
        return ahz.cm;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ajw.class, "slotNum;itemStack", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ajw.class, "slotNum;itemStack", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ajw.class, "slotNum;itemStack", "b", "c"}, this, $$0);
    }

    public short b() {
        return this.b;
    }

    public dlt e() {
        return this.c;
    }
}

