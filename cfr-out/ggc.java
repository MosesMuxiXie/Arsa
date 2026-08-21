/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 */
import org.joml.Vector3f;

public class ggc {
    public static Vector3f a(float $$0, float $$1, float $$2) {
        return new Vector3f($$0, -$$1, $$2);
    }

    public static Vector3f b(float $$0, float $$1, float $$2) {
        return new Vector3f($$0 * ((float)Math.PI / 180), $$1 * ((float)Math.PI / 180), $$2 * ((float)Math.PI / 180));
    }

    public static Vector3f a(double $$0, double $$1, double $$2) {
        return new Vector3f((float)($$0 - 1.0), (float)($$1 - 1.0), (float)($$2 - 1.0));
    }
}

