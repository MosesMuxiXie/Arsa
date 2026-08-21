/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class gqq
extends Record
implements gqs {
    private final hht b;
    private final amo c;
    private final float d;
    private final float e;
    private final float f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final float k;
    private final @Nullable gpm l;
    private final @Nullable gpm m;

    public gqq(hht $$0, amo $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, int $$8, float $$9, @Nullable gpm $$10) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, gqs.a($$5, $$6, $$7, $$8, $$10));
    }

    public gqq(hht $$0, amo $$1, float $$2, float $$3, float $$4, int $$5, int $$6, int $$7, int $$8, float $$9, @Nullable gpm $$10, @Nullable gpm $$11) {
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
        this.m = $$11;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gqq.class, "playerModel;texture;rotationX;rotationY;pivotY;x0;y0;x1;y1;scale;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gqq.class, "playerModel;texture;rotationX;rotationY;pivotY;x0;y0;x1;y1;scale;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gqq.class, "playerModel;texture;rotationX;rotationY;pivotY;x0;y0;x1;y1;scale;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"}, this, $$0);
    }

    public hht b() {
        return this.b;
    }

    public amo c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public float j() {
        return this.e;
    }

    public float k() {
        return this.f;
    }

    @Override
    public int e() {
        return this.g;
    }

    @Override
    public int f() {
        return this.h;
    }

    @Override
    public int g() {
        return this.i;
    }

    @Override
    public int h() {
        return this.j;
    }

    @Override
    public float a() {
        return this.k;
    }

    @Override
    public @Nullable gpm i() {
        return this.l;
    }

    @Override
    public @Nullable gpm n() {
        return this.m;
    }
}

