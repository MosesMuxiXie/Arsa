/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class aec
extends Record
implements aay<adb> {
    private final dvu b;
    private final bxe.b<?> c;
    public static final aao<xq, aec> a = aao.a(dvu.b, aec::b, bxe.b.a, aec::e, aec::new);

    public aec(dvu $$0, bxe.b<?> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<aec> a() {
        return ahz.A;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aec.class, "chunkPos;update", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aec.class, "chunkPos;update", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aec.class, "chunkPos;update", "b", "c"}, this, $$0);
    }

    public dvu b() {
        return this.b;
    }

    public bxe.b<?> e() {
        return this.c;
    }
}

