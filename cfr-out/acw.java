/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record acw(amo b) implements aay<acv>
{
    public static final aao<wx, acw> a = aay.a(acw::a, acw::new);

    private acw(wx $$0) {
        this($$0.q());
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b);
    }

    @Override
    public aba<acw> a() {
        return acx.a;
    }

    @Override
    public void a(acv $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{acw.class, "key", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{acw.class, "key", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{acw.class, "key", "b"}, this, $$0);
    }
}

