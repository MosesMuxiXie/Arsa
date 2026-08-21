/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record hdr(float a, float b) {
    @Override
    public String toString() {
        return "(" + this.a + "," + this.b + ")";
    }

    public static long a(float $$0, float $$1) {
        long $$2 = (long)Float.floatToIntBits($$0) & 0xFFFFFFFFL;
        long $$3 = (long)Float.floatToIntBits($$1) & 0xFFFFFFFFL;
        return $$2 << 32 | $$3;
    }

    public static float a(long $$0) {
        int $$1 = (int)($$0 >> 32);
        return Float.intBitsToFloat($$1);
    }

    public static float b(long $$0) {
        return Float.intBitsToFloat((int)$$0);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hdr.class, "u;v", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hdr.class, "u;v", "a", "b"}, this, $$0);
    }
}

