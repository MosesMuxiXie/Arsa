/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix3x2fc
 *  org.joml.Matrix4f
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.jspecify.annotations.Nullable;

public record gqd(Matrix3x2fc a, gnz b, @Nullable gpm c) implements gqe
{
    private final Matrix3x2fc a;
    private final gnz b;
    private final @Nullable gpm c;

    @Override
    public void a(fzp $$0) {
        this.b.a(new Matrix4f().mul(this.a), $$0, 0xF000F0, true);
    }

    @Override
    public RenderPipeline a() {
        return this.b.f();
    }

    @Override
    public gpq b() {
        return gpq.b(this.b.g(), RenderSystem.getSamplerCache().a(FilterMode.NEAREST));
    }

    @Override
    public @Nullable gpm n() {
        return null;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gqd.class, "pose;renderable;scissorArea", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gqd.class, "pose;renderable;scissorArea", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gqd.class, "pose;renderable;scissorArea", "a", "b", "c"}, this, $$0);
    }

    public Matrix3x2fc c() {
        return this.a;
    }

    public gnz d() {
        return this.b;
    }

    @Override
    public @Nullable gpm m() {
        return this.c;
    }
}

