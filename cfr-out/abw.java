/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record abw(awp b) implements aay<abv>
{
    public static final aao<wx, abw> a = aay.a(abw::a, abw::new);

    private abw(wx $$0) {
        this(new awp($$0));
    }

    @Override
    private void a(wx $$0) {
        this.b.a($$0);
    }

    @Override
    public aba<abw> a() {
        return abu.n;
    }

    @Override
    public void a(abv $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{abw.class, "information", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{abw.class, "information", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{abw.class, "information", "b"}, this, $$0);
    }
}

