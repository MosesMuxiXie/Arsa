/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

@FunctionalInterface
public interface a {
    public static final a a = $$0 -> new Quaternionf().rotationX(-$$0);
    public static final a b = $$0 -> new Quaternionf().rotationX($$0);
    public static final a c = $$0 -> new Quaternionf().rotationY(-$$0);
    public static final a d = $$0 -> new Quaternionf().rotationY($$0);
    public static final a e = $$0 -> new Quaternionf().rotationZ(-$$0);
    public static final a f = $$0 -> new Quaternionf().rotationZ($$0);

    public static a of(Vector3f $$0) {
        return $$1 -> new Quaternionf().rotationAxis($$1, (Vector3fc)$$0);
    }

    public Quaternionf rotation(float var1);

    default public Quaternionf rotationDegrees(float $$0) {
        return this.rotation($$0 * ((float)Math.PI / 180));
    }
}

