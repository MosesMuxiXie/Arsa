/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class hdi
extends Record {
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    public static final hdi a = hdi.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

    public hdi(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
    }

    public static hdi a(float $$0, float $$1, float $$2) {
        return hdi.a($$0, $$1, $$2, 0.0f, 0.0f, 0.0f);
    }

    public static hdi b(float $$0, float $$1, float $$2) {
        return hdi.a(0.0f, 0.0f, 0.0f, $$0, $$1, $$2);
    }

    public static hdi a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
        return new hdi($$0, $$1, $$2, $$3, $$4, $$5, 1.0f, 1.0f, 1.0f);
    }

    public hdi c(float $$0, float $$1, float $$2) {
        return new hdi(this.b + $$0, this.c + $$1, this.d + $$2, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public hdi a(float $$0) {
        return new hdi(this.b, this.c, this.d, this.e, this.f, this.g, $$0, $$0, $$0);
    }

    public hdi b(float $$0) {
        if ($$0 == 1.0f) {
            return this;
        }
        return this.d($$0, $$0, $$0);
    }

    public hdi d(float $$0, float $$1, float $$2) {
        return new hdi(this.b * $$0, this.c * $$1, this.d * $$2, this.e, this.f, this.g, this.h * $$0, this.i * $$1, this.j * $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hdi.class, "x;y;z;xRot;yRot;zRot;xScale;yScale;zScale", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hdi.class, "x;y;z;xRot;yRot;zRot;xScale;yScale;zScale", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hdi.class, "x;y;z;xRot;yRot;zRot;xScale;yScale;zScale", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.e;
    }

    public float e() {
        return this.f;
    }

    public float f() {
        return this.g;
    }

    public float g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public float i() {
        return this.j;
    }
}

