/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record gno(float c, float d, float e, float f, float g, zf h) implements gnk
{
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final zf h;
    public static final float a = 9.0f;
    public static final float b = 7.0f;

    @Override
    public float b() {
        return this.c;
    }

    @Override
    public float c() {
        return this.d + 7.0f - this.f;
    }

    @Override
    public float d() {
        return this.c + this.e;
    }

    @Override
    public float e() {
        return this.c() + this.g;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gno.class, "x;y;advance;ascent;height;style", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gno.class, "x;y;advance;ascent;height;style", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gno.class, "x;y;advance;ascent;height;style", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public float f() {
        return this.c;
    }

    public float g() {
        return this.d;
    }

    public float h() {
        return this.e;
    }

    public float i() {
        return this.f;
    }

    public float j() {
        return this.g;
    }

    @Override
    public zf a() {
        return this.h;
    }
}

