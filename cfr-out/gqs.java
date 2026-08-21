/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2f
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public interface gqs
extends gqi {
    public static final Matrix3x2f a = new Matrix3x2f();

    public int e();

    public int g();

    public int f();

    public int h();

    public float a();

    default public Matrix3x2f bf_() {
        return a;
    }

    public @Nullable gpm i();

    public static @Nullable gpm a(int $$0, int $$1, int $$2, int $$3, @Nullable gpm $$4) {
        gpm $$5 = new gpm($$0, $$1, $$2 - $$0, $$3 - $$1);
        return $$4 != null ? $$4.b($$5) : $$5;
    }
}

