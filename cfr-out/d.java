/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Math
 *  org.joml.Matrix3f
 *  org.joml.Quaternionf
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Quaternionf;

public record d(float a, float b) {
    private final float a;
    private final float b;

    public static d a(float $$0, float $$1) {
        float $$2 = Math.invsqrt((float)($$0 * $$0 + $$1 * $$1));
        return new d($$2 * $$0, $$2 * $$1);
    }

    public static d a(float $$0) {
        float $$1 = Math.sin((float)($$0 / 2.0f));
        float $$2 = Math.cosFromSin((float)$$1, (float)($$0 / 2.0f));
        return new d($$1, $$2);
    }

    public d a() {
        return new d(-this.a, this.b);
    }

    public Quaternionf a(Quaternionf $$0) {
        return $$0.set(this.a, 0.0f, 0.0f, this.b);
    }

    public Quaternionf b(Quaternionf $$0) {
        return $$0.set(0.0f, this.a, 0.0f, this.b);
    }

    public Quaternionf c(Quaternionf $$0) {
        return $$0.set(0.0f, 0.0f, this.a, this.b);
    }

    public float b() {
        return this.b * this.b - this.a * this.a;
    }

    public float c() {
        return 2.0f * this.a * this.b;
    }

    public Matrix3f a(Matrix3f $$0) {
        $$0.m01 = 0.0f;
        $$0.m02 = 0.0f;
        $$0.m10 = 0.0f;
        $$0.m20 = 0.0f;
        float $$1 = this.b();
        float $$2 = this.c();
        $$0.m11 = $$1;
        $$0.m22 = $$1;
        $$0.m12 = $$2;
        $$0.m21 = -$$2;
        $$0.m00 = 1.0f;
        return $$0;
    }

    public Matrix3f b(Matrix3f $$0) {
        $$0.m01 = 0.0f;
        $$0.m10 = 0.0f;
        $$0.m12 = 0.0f;
        $$0.m21 = 0.0f;
        float $$1 = this.b();
        float $$2 = this.c();
        $$0.m00 = $$1;
        $$0.m22 = $$1;
        $$0.m02 = -$$2;
        $$0.m20 = $$2;
        $$0.m11 = 1.0f;
        return $$0;
    }

    public Matrix3f c(Matrix3f $$0) {
        $$0.m02 = 0.0f;
        $$0.m12 = 0.0f;
        $$0.m20 = 0.0f;
        $$0.m21 = 0.0f;
        float $$1 = this.b();
        float $$2 = this.c();
        $$0.m00 = $$1;
        $$0.m11 = $$1;
        $$0.m01 = $$2;
        $$0.m10 = -$$2;
        $$0.m22 = 1.0f;
        return $$0;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "sinHalf;cosHalf", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "sinHalf;cosHalf", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "sinHalf;cosHalf", "a", "b"}, this, $$0);
    }

    public float d() {
        return this.a;
    }

    public float e() {
        return this.b;
    }
}

