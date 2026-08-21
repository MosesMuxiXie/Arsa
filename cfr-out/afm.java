/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.UUID;

public record afm(List<UUID> b) implements aay<adb>
{
    public static final aao<wx, afm> a = aay.a(afm::a, afm::new);

    private afm(wx $$0) {
        this($$0.a(jx.g));
    }

    @Override
    private void a(wx $$0) {
        $$0.a(this.b, jx.g);
    }

    @Override
    public aba<afm> a() {
        return ahz.ak;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afm.class, "profileIds", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afm.class, "profileIds", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afm.class, "profileIds", "b"}, this, $$0);
    }
}

