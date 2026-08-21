/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class gqp
extends Record
implements gqs {
    private final gzp.a b;
    private final epw c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final float h;
    private final @Nullable gpm i;
    private final @Nullable gpm j;

    public gqp(gzp.a $$0, epw $$1, int $$2, int $$3, int $$4, int $$5, float $$6, @Nullable gpm $$7) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, gqs.a($$2, $$3, $$4, $$5, $$7));
    }

    public gqp(gzp.a $$0, epw $$1, int $$2, int $$3, int $$4, int $$5, float $$6, @Nullable gpm $$7, @Nullable gpm $$8) {
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

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gqp.class, "signModel;woodType;x0;y0;x1;y1;scale;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gqp.class, "signModel;woodType;x0;y0;x1;y1;scale;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gqp.class, "signModel;woodType;x0;y0;x1;y1;scale;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public gzp.a b() {
        return this.b;
    }

    public epw c() {
        return this.c;
    }

    @Override
    public int e() {
        return this.d;
    }

    @Override
    public int f() {
        return this.e;
    }

    @Override
    public int g() {
        return this.f;
    }

    @Override
    public int h() {
        return this.g;
    }

    @Override
    public float a() {
        return this.h;
    }

    @Override
    public @Nullable gpm i() {
        return this.i;
    }

    @Override
    public @Nullable gpm n() {
        return this.j;
    }
}

