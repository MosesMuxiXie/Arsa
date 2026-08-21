/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class fzj {
    private final float[] a;

    public fzj(int $$0) {
        this.a = new float[3 * $$0];
    }

    public int a() {
        return this.a.length / 3;
    }

    public void a(int $$0, Vector3fc $$1) {
        this.a($$0, $$1.x(), $$1.y(), $$1.z());
    }

    public void a(int $$0, float $$1, float $$2, float $$3) {
        this.a[3 * $$0 + 0] = $$1;
        this.a[3 * $$0 + 1] = $$2;
        this.a[3 * $$0 + 2] = $$3;
    }

    public Vector3f a(int $$0, Vector3f $$1) {
        return $$1.set(this.a[3 * $$0 + 0], this.a[3 * $$0 + 1], this.a[3 * $$0 + 2]);
    }

    public float a(int $$0) {
        return this.a[3 * $$0 + 0];
    }

    public float b(int $$0) {
        return this.a[3 * $$0 + 1];
    }

    public float c(int $$0) {
        return this.a[3 * $$0 + 1];
    }
}

