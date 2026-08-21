/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class hlv
extends Record {
    private final String e;
    public static final hlv a = new hlv("SINGLE_QUADS");
    public static final hlv b = new hlv("ITEM_PICKUP");
    public static final hlv c = new hlv("ELDER_GUARDIANS");
    public static final hlv d = new hlv("NO_RENDER");

    public hlv(String $$0) {
        this.e = $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hlv.class, "name", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hlv.class, "name", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hlv.class, "name", "e"}, this, $$0);
    }

    public String a() {
        return this.e;
    }
}

