/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jspecify.annotations.Nullable;

public final class gqo
extends Record
implements gqs {
    private final List<bzo> b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final @Nullable gpm g;
    private final @Nullable gpm h;

    public gqo(List<bzo> $$0, int $$1, int $$2, int $$3, int $$4, @Nullable gpm $$5) {
        this($$0, $$1, $$2, $$3, $$4, $$5, gqs.a($$1, $$2, $$3, $$4, $$5));
    }

    public gqo(List<bzo> $$0, int $$1, int $$2, int $$3, int $$4, @Nullable gpm $$5, @Nullable gpm $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    @Override
    public float a() {
        return 1.0f;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gqo.class, "chartData;x0;y0;x1;y1;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gqo.class, "chartData;x0;y0;x1;y1;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gqo.class, "chartData;x0;y0;x1;y1;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public List<bzo> b() {
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

    @Override
    public @Nullable gpm i() {
        return this.g;
    }

    @Override
    public @Nullable gpm n() {
        return this.h;
    }
}

