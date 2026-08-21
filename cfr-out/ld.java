/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ld(axf a, is b, eoh c, elx d) {
    private final axf a;
    private final is b;
    private final eoh c;
    private final elx d;

    public ftm a() {
        return this.b.b();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ld.class, "level;pos;state;blockEntity", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ld.class, "level;pos;state;blockEntity", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ld.class, "level;pos;state;blockEntity", "a", "b", "c", "d"}, this, $$0);
    }

    public axf b() {
        return this.a;
    }

    public is c() {
        return this.b;
    }

    public eoh d() {
        return this.c;
    }

    public elx e() {
        return this.d;
    }
}

