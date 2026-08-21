/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class ajs
extends Record
implements aay<aib> {
    private final Optional<jd<cfk>> b;
    private final Optional<jd<cfk>> c;
    public static final aao<xq, ajs> a = aao.a(cfk.b.a(aam::a), ajs::b, cfk.b.a(aam::a), ajs::e, ajs::new);

    public ajs(Optional<jd<cfk>> $$0, Optional<jd<cfk>> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<ajs> a() {
        return ahz.ci;
    }

    @Override
    public void a(aib $$0) {
        $$0.a(this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ajs.class, "primary;secondary", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ajs.class, "primary;secondary", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ajs.class, "primary;secondary", "b", "c"}, this, $$0);
    }

    public Optional<jd<cfk>> b() {
        return this.b;
    }

    public Optional<jd<cfk>> e() {
        return this.c;
    }
}

