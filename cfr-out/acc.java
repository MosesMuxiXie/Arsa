/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class acc
extends Record
implements acd {
    private final String c;
    public static final aao<wx, acc> a = acd.a(acc::a, acc::new);
    public static final acd.b<acc> b = acd.a("brand");

    private acc(wx $$0) {
        this($$0.p());
    }

    public acc(String $$0) {
        this.c = $$0;
    }

    private void a(wx $$0) {
        $$0.a(this.c);
    }

    public acd.b<acc> a() {
        return b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{acc.class, "brand", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{acc.class, "brand", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{acc.class, "brand", "c"}, this, $$0);
    }

    public String b() {
        return this.c;
    }
}

