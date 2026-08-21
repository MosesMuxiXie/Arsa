/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public record gqb(RenderPipeline a, gpq b, Matrix3x2f c, int d, int e, int f, int g, float h, float i, float j, float k, int l, @Nullable gpm m, @Nullable gpm n) implements gqe
{
    public gqb(RenderPipeline $$0, gpq $$1, Matrix3x2f $$2, int $$3, int $$4, int $$5, int $$6, float $$7, float $$8, float $$9, float $$10, int $$11, @Nullable gpm $$12) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, gqb.a($$3, $$4, $$5, $$6, $$2, $$12));
    }

    @Override
    public void a(fzp $$0) {
        $$0.a((Matrix3x2fc)this.c(), (float)this.d(), (float)this.e()).a(this.h(), this.j()).a(this.l());
        $$0.a((Matrix3x2fc)this.c(), (float)this.d(), (float)this.g()).a(this.h(), this.k()).a(this.l());
        $$0.a((Matrix3x2fc)this.c(), (float)this.f(), (float)this.g()).a(this.i(), this.k()).a(this.l());
        $$0.a((Matrix3x2fc)this.c(), (float)this.f(), (float)this.e()).a(this.i(), this.j()).a(this.l());
    }

    private static @Nullable gpm a(int $$0, int $$1, int $$2, int $$3, Matrix3x2f $$4, @Nullable gpm $$5) {
        gpm $$6 = new gpm($$0, $$1, $$2 - $$0, $$3 - $$1).b((Matrix3x2fc)$$4);
        return $$5 != null ? $$5.b($$6) : $$6;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gqb.class, "pipeline;textureSetup;pose;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gqb.class, "pipeline;textureSetup;pose;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gqb.class, "pipeline;textureSetup;pose;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"}, this, $$0);
    }
}

