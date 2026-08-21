/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Math
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Math;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public record hqd(Vector3fc a, b b, boolean c, Matrix4fc d) {
    public hqd(Vector3fc $$0, b $$1, boolean $$2) {
        this($$0, $$1, $$2, (Matrix4fc)hqd.a($$1, $$2));
    }

    private static Matrix4f a(b $$0, boolean $$1) {
        Matrix4f $$2 = $$0.a();
        if ($$1 && !e.a((Matrix4fc)$$2)) {
            Vector3fc $$3 = hqd.a((Matrix4fc)$$2);
            $$2.scale($$3);
        }
        return $$2;
    }

    private static Vector3fc a(Matrix4fc $$0) {
        Vector3f $$1 = new Vector3f();
        float $$2 = hqd.a($$0, iz.a.a, $$1);
        float $$3 = hqd.a($$0, iz.a.b, $$1);
        float $$4 = hqd.a($$0, iz.a.c, $$1);
        return $$1.set($$2, $$3, $$4);
    }

    private static float a(Matrix4fc $$0, iz.a $$1, Vector3f $$2) {
        Vector3f $$3 = $$2.set($$1.e().s());
        Vector3f $$4 = $$0.transformDirection($$3);
        float $$5 = Math.abs((float)$$4.x);
        float $$6 = Math.abs((float)$$4.y);
        float $$7 = Math.abs((float)$$4.z);
        float $$8 = Math.max((float)Math.max((float)$$5, (float)$$6), (float)$$7);
        return 1.0f / $$8;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqd.class, "origin;value;rescale;transform", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqd.class, "origin;value;rescale;transform", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqd.class, "origin;value;rescale;transform", "a", "b", "c", "d"}, this, $$0);
    }

    public static interface b {
        public Matrix4f a();
    }

    public record a(float a, float b, float c) implements b
    {
        private final float a;
        private final float b;
        private final float c;

        @Override
        public Matrix4f a() {
            return new Matrix4f().rotationZYX(this.c * ((float)java.lang.Math.PI / 180), this.b * ((float)java.lang.Math.PI / 180), this.a * ((float)java.lang.Math.PI / 180));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "x;y;z", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "x;y;z", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "x;y;z", "a", "b", "c"}, this, $$0);
        }

        public float b() {
            return this.a;
        }

        public float c() {
            return this.b;
        }

        public float d() {
            return this.c;
        }
    }

    public record c(iz.a a, float b) implements b
    {
        private final iz.a a;
        private final float b;

        @Override
        public Matrix4f a() {
            Matrix4f $$0 = new Matrix4f();
            if (this.b == 0.0f) {
                return $$0;
            }
            Vector3fc $$1 = this.a.e().s();
            $$0.rotation(this.b * ((float)java.lang.Math.PI / 180), $$1);
            return $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "axis;angle", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "axis;angle", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "axis;angle", "a", "b"}, this, $$0);
        }

        public iz.a b() {
            return this.a;
        }

        public float c() {
            return this.b;
        }
    }
}

