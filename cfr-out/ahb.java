/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ahb(int b) implements aay<adb>
{
    public static final aao<wx, ahb> a = aay.a(ahb::a, ahb::new);

    private ahb(wx $$0) {
        this($$0.l());
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
    }

    @Override
    public aba<ahb> a() {
        return ahz.aV;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahb.class, "simulationDistance", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahb.class, "simulationDistance", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahb.class, "simulationDistance", "b"}, this, $$0);
    }
}

