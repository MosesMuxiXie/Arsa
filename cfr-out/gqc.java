/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public final class gqc
extends Record
implements gqe {
    private final RenderPipeline a;
    private final gpq b;
    private final Matrix3x2fc c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final @Nullable gpm j;
    private final @Nullable gpm k;

    public gqc(RenderPipeline $$0, gpq $$1, Matrix3x2fc $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, @Nullable gpm $$9) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, gqc.a($$3, $$4, $$5, $$6, $$2, $$9));
    }

    public gqc(RenderPipeline $$0, gpq $$1, Matrix3x2fc $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, @Nullable gpm $$9, @Nullable gpm $$10) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
        this.g = $$6;
        this.h = $$7;
        this.i = $$8;
        this.j = $$9;
        this.k = $$10;
    }

    @Override
    public void a(fzp $$0) {
        $$0.a(this.c(), (float)this.d(), (float)this.e()).a(this.h());
        $$0.a(this.c(), (float)this.d(), (float)this.g()).a(this.i());
        $$0.a(this.c(), (float)this.f(), (float)this.g()).a(this.i());
        $$0.a(this.c(), (float)this.f(), (float)this.e()).a(this.h());
    }

    private static @Nullable gpm a(int $$0, int $$1, int $$2, int $$3, Matrix3x2fc $$4, @Nullable gpm $$5) {
        gpm $$6 = new gpm($$0, $$1, $$2 - $$0, $$3 - $$1).b($$4);
        return $$5 != null ? $$5.b($$6) : $$6;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gqc.class, "pipeline;textureSetup;pose;x0;y0;x1;y1;col1;col2;scissorArea;bounds", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gqc.class, "pipeline;textureSetup;pose;x0;y0;x1;y1;col1;col2;scissorArea;bounds", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gqc.class, "pipeline;textureSetup;pose;x0;y0;x1;y1;col1;col2;scissorArea;bounds", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, this, $$0);
    }

    @Override
    public RenderPipeline a() {
        return this.a;
    }

    @Override
    public gpq b() {
        return this.b;
    }

    public Matrix3x2fc c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    @Override
    public @Nullable gpm m() {
        return this.j;
    }

    @Override
    public @Nullable gpm n() {
        return this.k;
    }
}

