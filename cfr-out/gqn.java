/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public final class gqn
extends Record
implements gqs {
    private final idf b;
    private final Vector3f c;
    private final Quaternionf d;
    private final @Nullable Quaternionf e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final float j;
    private final @Nullable gpm k;
    private final @Nullable gpm l;

    public gqn(idf $$0, Vector3f $$1, Quaternionf $$2, @Nullable Quaternionf $$3, int $$4, int $$5, int $$6, int $$7, float $$8, @Nullable gpm $$9) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, gqs.a($$4, $$5, $$6, $$7, $$9));
    }

    public gqn(idf $$0, Vector3f $$1, Quaternionf $$2, @Nullable Quaternionf $$3, int $$4, int $$5, int $$6, int $$7, float $$8, @Nullable gpm $$9, @Nullable gpm $$10) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
        this.l = $$10;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gqn.class, "renderState;translation;rotation;overrideCameraAngle;x0;y0;x1;y1;scale;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gqn.class, "renderState;translation;rotation;overrideCameraAngle;x0;y0;x1;y1;scale;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gqn.class, "renderState;translation;rotation;overrideCameraAngle;x0;y0;x1;y1;scale;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"}, this, $$0);
    }

    public idf b() {
        return this.b;
    }

    public Vector3f c() {
        return this.c;
    }

    public Quaternionf d() {
        return this.d;
    }

    public @Nullable Quaternionf j() {
        return this.e;
    }

    @Override
    public int e() {
        return this.f;
    }

    @Override
    public int f() {
        return this.g;
    }

    @Override
    public int g() {
        return this.h;
    }

    @Override
    public int h() {
        return this.i;
    }

    @Override
    public float a() {
        return this.j;
    }

    @Override
    public @Nullable gpm i() {
        return this.k;
    }

    @Override
    public @Nullable gpm n() {
        return this.l;
    }
}

