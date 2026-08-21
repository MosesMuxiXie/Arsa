/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aed
extends Record
implements aay<adb> {
    private final int b;
    private final bxe.b<?> c;
    public static final aao<xq, aed> a = aao.a(aam.h, aed::b, bxe.b.a, aed::e, aed::new);

    public aed(int $$0, bxe.b<?> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<aed> a() {
        return ahz.B;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aed.class, "entityId;update", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aed.class, "entityId;update", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aed.class, "entityId;update", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public bxe.b<?> e() {
        return this.c;
    }
}

