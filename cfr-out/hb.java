/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record hb(byte b) {
    private final byte b;
    public static final hb a = new hb(0);
    private static final byte c = 1;
    private static final byte d = 2;

    private hb a(byte $$0) {
        int $$1 = this.b | $$0;
        return $$1 != this.b ? new hb((byte)$$1) : this;
    }

    public boolean a() {
        return (this.b & 1) != 0;
    }

    public hb b() {
        return this.a((byte)1);
    }

    public boolean c() {
        return (this.b & 2) != 0;
    }

    public hb d() {
        return this.a((byte)2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hb.class, "flags", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hb.class, "flags", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hb.class, "flags", "b"}, this, $$0);
    }

    public byte e() {
        return this.b;
    }
}

