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

public record gqj(RenderPipeline a, gpq b, Matrix3x2f c, int d, int e, int f, int g, int h, int i, float j, float k, float l, float m, int n, @Nullable gpm o, @Nullable gpm p) implements gqe
{
    private final float m;
    private final int n;
    private final @Nullable gpm o;
    private final @Nullable gpm p;

    public gqj(RenderPipeline $$0, gpq $$1, Matrix3x2f $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, float $$9, float $$10, float $$11, float $$12, int $$13, @Nullable gpm $$14) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11, $$12, $$13, $$14, gqj.a($$5, $$6, $$7, $$8, $$2, $$14));
    }

    @Override
    public void a(fzp $$0) {
        int $$1 = this.h() - this.f();
        int $$2 = this.i() - this.g();
        for (int $$3 = 0; $$3 < $$1; $$3 += this.d()) {
            float $$8;
            int $$7;
            int $$4 = $$1 - $$3;
            if (this.d() <= $$4) {
                int $$5 = this.d();
                float $$6 = this.k();
            } else {
                $$7 = $$4;
                $$8 = bgj.h((float)$$4 / (float)this.d(), this.j(), this.k());
            }
            for (int $$9 = 0; $$9 < $$2; $$9 += this.e()) {
                float $$14;
                int $$13;
                int $$10 = $$2 - $$9;
                if (this.e() <= $$10) {
                    int $$11 = this.e();
                    float $$12 = this.o();
                } else {
                    $$13 = $$10;
                    $$14 = bgj.h((float)$$10 / (float)this.e(), this.l(), this.o());
                }
                int $$15 = this.f() + $$3;
                int $$16 = this.f() + $$3 + $$7;
                int $$17 = this.g() + $$9;
                int $$18 = this.g() + $$9 + $$13;
                $$0.a((Matrix3x2fc)this.c(), (float)$$15, (float)$$17).a(this.j(), this.l()).a(this.p());
                $$0.a((Matrix3x2fc)this.c(), (float)$$15, (float)$$18).a(this.j(), $$14).a(this.p());
                $$0.a((Matrix3x2fc)this.c(), (float)$$16, (float)$$18).a($$8, $$14).a(this.p());
                $$0.a((Matrix3x2fc)this.c(), (float)$$16, (float)$$17).a($$8, this.l()).a(this.p());
            }
        }
    }

    private static @Nullable gpm a(int $$0, int $$1, int $$2, int $$3, Matrix3x2f $$4, @Nullable gpm $$5) {
        gpm $$6 = new gpm($$0, $$1, $$2 - $$0, $$3 - $$1).b((Matrix3x2fc)$$4);
        return $$5 != null ? $$5.b($$6) : $$6;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gqj.class, "pipeline;textureSetup;pose;tileWidth;tileHeight;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gqj.class, "pipeline;textureSetup;pose;tileWidth;tileHeight;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gqj.class, "pipeline;textureSetup;pose;tileWidth;tileHeight;x0;y0;x1;y1;u0;u1;v0;v1;color;scissorArea;bounds", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"}, this, $$0);
    }

    public float o() {
        return this.m;
    }

    public int p() {
        return this.n;
    }

    @Override
    public @Nullable gpm m() {
        return this.o;
    }

    @Override
    public @Nullable gpm n() {
        return this.p;
    }
}

