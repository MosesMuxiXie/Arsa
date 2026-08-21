/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class afy
extends Record
implements aay<adb> {
    private final ahx e;
    private final byte f;
    public static final aao<xq, afy> a = aay.a(afy::a, afy::new);
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;

    private afy(xq $$0) {
        this(new ahx($$0), $$0.readByte());
    }

    public afy(ahx $$0, byte $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    private void a(xq $$0) {
        this.e.a($$0);
        $$0.l(this.f);
    }

    @Override
    public aba<afy> a() {
        return ahz.au;
    }

    @Override
    public void a(adb $$0) {
        $$0.a(this);
    }

    public boolean a(byte $$0) {
        return (this.f & $$0) != 0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{afy.class, "commonPlayerSpawnInfo;dataToKeep", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{afy.class, "commonPlayerSpawnInfo;dataToKeep", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{afy.class, "commonPlayerSpawnInfo;dataToKeep", "e", "f"}, this, $$0);
    }

    public ahx b() {
        return this.e;
    }

    public byte e() {
        return this.f;
    }
}

