/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class ahl
extends Record
implements aay<adb> {
    private final yh b;
    private final yh c;
    public static final aao<xq, ahl> a = aao.a(yj.d, ahl::b, yj.d, ahl::e, ahl::new);

    public ahl(yh $$0, yh $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<ahl> a() {
        return ahz.bf;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahl.class, "header;footer", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahl.class, "header;footer", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahl.class, "header;footer", "b", "c"}, this, $$0);
    }

    public yh b() {
        return this.b;
    }

    public yh e() {
        return this.c;
    }
}

