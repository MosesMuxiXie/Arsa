/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class ahp
extends Record
implements aay<adb> {
    private final yh b;
    private final Optional<jy> c;
    public static final aao<xq, ahp> a = aao.a(yj.b, ahp::b, aam.a(jy.h), ahp::e, ahp::new);

    public ahp(yh $$0, Optional<jy> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<ahp> a() {
        return ahz.bj;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ahp.class, "status;size", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ahp.class, "status;size", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ahp.class, "status;size", "b", "c"}, this, $$0);
    }

    public yh b() {
        return this.b;
    }

    public Optional<jy> e() {
        return this.c;
    }
}

