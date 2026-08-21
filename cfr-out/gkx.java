/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class gkx
extends Record {
    private final yh c;
    private final float d;
    public static final gkx a = new gkx(yh.c("debug.options.category.text"), 1.0f);
    public static final gkx b = new gkx(yh.c("debug.options.category.renderer"), 2.0f);

    public gkx(yh $$0, float $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gkx.class, "label;sortKey", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gkx.class, "label;sortKey", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gkx.class, "label;sortKey", "c", "d"}, this, $$0);
    }

    public yh a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }
}

