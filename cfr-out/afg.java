/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class afg
extends Record
implements aay<adb> {
    private final int b;
    private final dry c;
    public static final aao<xq, afg> a = aao.a(aam.x, afg::b, dry.e, afg::e, afg::new);

    public afg(int $$0, dry $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<afg> a() {
        return ahz.ae;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afg.class, "containerId;recipeDisplay", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afg.class, "containerId;recipeDisplay", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afg.class, "containerId;recipeDisplay", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public dry e() {
        return this.c;
    }
}

