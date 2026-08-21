/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aiu
extends Record
implements aay<aib> {
    private final int b;
    private final int c;
    private final boolean d;
    public static final aao<wx, aiu> a = aay.a(aiu::a, aiu::new);

    private aiu(wx $$0) {
        this($$0.l(), $$0.w(), $$0.readBoolean());
    }

    public aiu(int $$0, int $$1, boolean $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
        $$0.f(this.c);
        $$0.a(this.d);
    }

    @Override
    public aba<aiu> a() {
        return ahz.bI;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aiu.class, "slotId;containerId;newState", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aiu.class, "slotId;containerId;newState", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aiu.class, "slotId;containerId;newState", "b", "c", "d"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }
}

