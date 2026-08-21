/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import org.joml.Matrix4f;

public interface gnz {
    public void a(Matrix4f var1, fzp var2, int var3, boolean var4);

    public ijs a(gio.a var1);

    public GpuTextureView g();

    public RenderPipeline f();

    public float r();

    public float t();

    public float s();

    public float u();

    public static interface a
    extends gnk,
    gnz {
        @Override
        default public float b() {
            return this.r();
        }

        @Override
        default public float c() {
            return this.t();
        }

        @Override
        default public float d() {
            return this.s();
        }

        @Override
        default public float e() {
            return this.u();
        }
    }
}

