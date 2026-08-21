/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class afw
extends Record
implements aay<adb> {
    private final int b;
    private final jd<cfk> c;
    public static final aao<xq, afw> a = aao.a(aam.h, afw::b, cfk.b, afw::e, afw::new);

    public afw(int $$0, jd<cfk> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public aba<afw> a() {
        return ahz.at;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public @Nullable cgk a(dwo $$0) {
        return $$0.a(this.b);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afw.class, "entityId;effect", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afw.class, "entityId;effect", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afw.class, "entityId;effect", "b", "c"}, this, $$0);
    }

    public int b() {
        return this.b;
    }

    public jd<cfk> e() {
        return this.c;
    }
}

