/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class gql
extends Record
implements gqs {
    private final hgi b;
    private final dkr c;
    private final ekr d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final @Nullable gpm i;
    private final @Nullable gpm j;

    public gql(hgi $$0, dkr $$1, ekr $$2, int $$3, int $$4, int $$5, int $$6, @Nullable gpm $$7) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, gqs.a($$3, $$4, $$5, $$6, $$7));
    }

    public gql(hgi $$0, dkr $$1, ekr $$2, int $$3, int $$4, int $$5, int $$6, @Nullable gpm $$7, @Nullable gpm $$8) {
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
    public float a() {
        return 16.0f;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gql.class, "flag;baseColor;resultBannerPatterns;x0;y0;x1;y1;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gql.class, "flag;baseColor;resultBannerPatterns;x0;y0;x1;y1;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gql.class, "flag;baseColor;resultBannerPatterns;x0;y0;x1;y1;scissorArea;bounds", "b", "c", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public hgi b() {
        return this.b;
    }

    public dkr c() {
        return this.c;
    }

    public ekr d() {
        return this.d;
    }

    @Override
    public int e() {
        return this.e;
    }

    @Override
    public int f() {
        return this.f;
    }

    @Override
    public int g() {
        return this.g;
    }

    @Override
    public int h() {
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

