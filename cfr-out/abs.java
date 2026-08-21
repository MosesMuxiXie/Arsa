/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class abs
extends Record
implements aay<abg> {
    private final String b;
    private final int c;
    public static final aao<wx, abs> a = aay.a(abs::a, abs::new);

    private abs(wx $$0) {
        this($$0.p(), $$0.l());
    }

    public abs(String $$0, int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
        $$0.c(this.c);
    }

    @Override
    public aba<abs> a() {
        return abu.l;
    }

    @Override
    public void a(abg $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abs.class, "host;port", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abs.class, "host;port", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abs.class, "host;port", "b", "c"}, this, $$0);
    }

    public String b() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

