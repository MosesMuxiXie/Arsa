/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record idu(double a, double b, double c, double d, double e, double f, float g, float h, float i, float j, float k, float l) {
    public idu(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8) {
        this($$0, $$1, $$2, $$3, $$4, $$5, 0.0f, 0.0f, 0.0f, $$6, $$7, $$8);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{idu.class, "x0;y0;z0;x1;y1;z1;offsetX;offsetY;offsetZ;red;green;blue", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{idu.class, "x0;y0;z0;x1;y1;z1;offsetX;offsetY;offsetZ;red;green;blue", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{idu.class, "x0;y0;z0;x1;y1;z1;offsetX;offsetY;offsetZ;red;green;blue", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this, $$0);
    }
}

