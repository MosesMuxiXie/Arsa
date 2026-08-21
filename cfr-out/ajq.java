/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ajq
extends Record
implements aay<aib> {
    private final int b;
    private final int c;
    public static final aao<wx, ajq> a = aay.a(ajq::a, ajq::new);

    private ajq(wx $$0) {
        this($$0.l(), $$0.l());
        if (this.c < 0 && this.c != -1) {
            throw new IllegalArgumentException("Invalid selectedItemIndex: " + this.c);
        }
    }

    public ajq(int $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.c(this.c);
    }

    @Override
    public aba<ajq> a() {
        return ahz.bs;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ajq.class, "slotId;selectedItemIndex", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ajq.class, "slotId;selectedItemIndex", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ajq.class, "slotId;selectedItemIndex", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

