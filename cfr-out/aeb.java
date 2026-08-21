/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aeb
extends Record
implements aay<adb> {
    private final is b;
    private final bxe.b<?> c;
    public static final aao<xq, aeb> a = aao.a(is.b, aeb::b, bxe.b.a, aeb::e, aeb::new);

    public aeb(is $$0, bxe.b<?> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<aeb> a() {
        return ahz.z;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aeb.class, "blockPos;update", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aeb.class, "blockPos;update", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aeb.class, "blockPos;update", "b", "c"}, this, $$0);
    }

    public is b() {
        return this.b;
    }

    public bxe.b<?> e() {
        return this.c;
    }
}

