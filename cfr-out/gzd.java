/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class gzd
extends Record
implements gza {
    @b
    private final int b;
    @gza.a
    private final int c;

    public gzd(@b int $$0, @gza.a int $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    @b
    public int a() {
        return this.b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gzd.class, "button;modifiers", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gzd.class, "button;modifiers", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gzd.class, "button;modifiers", "b", "c"}, this, $$0);
    }

    @b
    public int t() {
        return this.b;
    }

    @Override
    @gza.a
    public int b() {
        return this.c;
    }

    @Retention(value=RetentionPolicy.CLASS)
    @Target(value={ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.TYPE_USE})
    public static @interface b {
    }

    @Retention(value=RetentionPolicy.CLASS)
    @Target(value={ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.TYPE_USE})
    public static @interface a {
    }
}

