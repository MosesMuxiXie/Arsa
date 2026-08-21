/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record aeg(yu.a b) implements aay<adb>
{
    public static final aao<wx, aeg> a = aay.a(aeg::a, aeg::new);

    private aeg(wx $$0) {
        this(yu.a.a($$0));
    }

    @Override
    private void a(wx $$0) {
        yu.a.a($$0, this.b);
    }

    @Override
    public aba<aeg> a() {
        return ahz.E;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aeg.class, "messageSignature", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aeg.class, "messageSignature", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aeg.class, "messageSignature", "b"}, this, $$0);
    }
}

