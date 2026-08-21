/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record agm(dlt b) implements aay<adb>
{
    public static final aao<xq, agm> a = aao.a(dlt.h, agm::b, agm::new);

    @Override
    public aba<agm> a() {
        return ahz.cz;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{agm.class, "contents", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{agm.class, "contents", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{agm.class, "contents", "b"}, this, $$0);
    }
}

