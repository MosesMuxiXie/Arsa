/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3fc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Vector3fc;

public record gga(float a, Vector3fc b, Vector3fc c, gfy.a d) {
    public gga(float $$0, Vector3fc $$1, gfy.a $$2) {
        this($$0, $$1, $$1, $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gga.class, "timestamp;preTarget;postTarget;interpolation", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gga.class, "timestamp;preTarget;postTarget;interpolation", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gga.class, "timestamp;preTarget;postTarget;interpolation", "a", "b", "c", "d"}, this, $$0);
    }
}

