/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ahr(int b) implements aay<adb>
{
    public static final aao<wx, ahr> a = aay.a(ahr::a, ahr::new);

    private ahr(wx $$0) {
        this($$0.l());
    }

    public static ahr a(cdo $$0) {
        return new ahr($$0.k());
    }

    @Override
    private void a(wx $$0) {
        $$0.c(this.b);
    }

    @Override
    public aba<ahr> a() {
        return ahz.cy;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahr.class, "tickSteps", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahr.class, "tickSteps", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahr.class, "tickSteps", "b"}, this, $$0);
    }
}

