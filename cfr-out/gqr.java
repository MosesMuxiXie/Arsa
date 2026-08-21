/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2f
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public final class gqr
extends Record
implements gqs {
    private final gqf b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public gqr(gqf $$0, int $$1, int $$2, int $$3, int $$4) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
    }

    @Override
    public float a() {
        return 16.0f;
    }

    @Override
    public Matrix3x2f bf_() {
        return this.b.b();
    }

    @Override
    public @Nullable gpm i() {
        return this.b.f();
    }

    @Override
    public @Nullable gpm n() {
        return this.b.n();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gqr.class, "guiItemRenderState;x0;y0;x1;y1", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gqr.class, "guiItemRenderState;x0;y0;x1;y1", "b", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gqr.class, "guiItemRenderState;x0;y0;x1;y1", "b", "c", "d", "e", "f"}, this, $$0);
    }

    public gqf c() {
        return this.b;
    }

    @Override
    public int e() {
        return this.c;
    }

    @Override
    public int f() {
        return this.d;
    }

    @Override
    public int g() {
        return this.e;
    }

    @Override
    public int h() {
        return this.f;
    }
}

