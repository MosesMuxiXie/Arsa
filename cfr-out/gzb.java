/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class gzb
extends Record
implements gza {
    @fyc.c
    private final int b;
    private final int c;
    @gza.a
    private final int d;

    public gzb(@fyc.c int $$0, int $$1, @gza.a int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gzb.class, "key;scancode;modifiers", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gzb.class, "key;scancode;modifiers", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gzb.class, "key;scancode;modifiers", "b", "c", "d"}, this, $$0);
    }

    @fyc.c
    public int t() {
        return this.b;
    }

    public int u() {
        return this.c;
    }

    @Override
    @gza.a
    public int b() {
        return this.d;
    }

    @Retention(value=RetentionPolicy.CLASS)
    @Target(value={ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.TYPE_USE})
    public static @interface a {
    }
}

