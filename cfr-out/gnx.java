/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record gnx(goa a) implements gip
{
    @Override
    public goa a(int $$0) {
        return this.a;
    }

    @Override
    public goa a(bgr $$0, int $$1) {
        return this.a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gnx.class, "glyph", "a"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gnx.class, "glyph", "a"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gnx.class, "glyph", "a"}, this, $$0);
    }
}

