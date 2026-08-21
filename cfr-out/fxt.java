/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public abstract class fxt {
    private static int a = 0;
    public int c;
    public int d;
    protected final String e;
    public final boolean f;
    protected @Nullable GpuTexture g;
    protected @Nullable GpuTextureView h;
    protected @Nullable GpuTexture i;
    protected @Nullable GpuTextureView j;

    public fxt(@Nullable String $$0, boolean $$1) {
        this.e = $$0 == null ? "FBO " + a++ : $$0;
        this.f = $$1;
    }

    public void a(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        this.a();
        this.b($$0, $$1);
    }

    public void a() {
        RenderSystem.assertOnRenderThread();
        if (this.i != null) {
            this.i.close();
            this.i = null;
        }
        if (this.j != null) {
            this.j.close();
            this.j = null;
        }
        if (this.g != null) {
            this.g.close();
            this.g = null;
        }
        if (this.h != null) {
            this.h.close();
            this.h = null;
        }
    }

    public void a(fxt $$0) {
        RenderSystem.assertOnRenderThread();
        if (this.i == null) {
            throw new IllegalStateException("Trying to copy depth texture to a RenderTarget without a depth texture");
        }
        if ($$0.i == null) {
            throw new IllegalStateException("Trying to copy depth texture from a RenderTarget without a depth texture");
        }
        RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture($$0.i, this.i, 0, 0, 0, 0, 0, this.c, this.d);
    }

    public void b(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        GpuDevice $$2 = RenderSystem.getDevice();
        int $$3 = $$2.getMaxTextureSize();
        if ($$0 <= 0 || $$0 > $$3 || $$1 <= 0 || $$1 > $$3) {
            throw new IllegalArgumentException("Window " + $$0 + "x" + $$1 + " size out of bounds (max. size: " + $$3 + ")");
        }
        this.c = $$0;
        this.d = $$1;
        if (this.f) {
            this.i = $$2.createTexture(() -> this.e + " / Depth", 15, TextureFormat.DEPTH32, $$0, $$1, 1, 1);
            this.j = $$2.createTextureView(this.i);
        }
        this.g = $$2.createTexture(() -> this.e + " / Color", 15, TextureFormat.RGBA8, $$0, $$1, 1, 1);
        this.h = $$2.createTextureView(this.g);
    }

    public void b() {
        if (this.g == null) {
            throw new IllegalStateException("Can't blit to screen, color texture doesn't exist yet");
        }
        RenderSystem.getDevice().createCommandEncoder().presentTexture(this.h);
    }

    public void a(GpuTextureView $$0) {
        RenderSystem.assertOnRenderThread();
        try (RenderPass $$1 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Blit render target", $$0, OptionalInt.empty());){
            $$1.setPipeline(hpa.aC);
            RenderSystem.bindDefaultUniforms($$1);
            $$1.bindTexture("InSampler", this.h, RenderSystem.getSamplerCache().a(FilterMode.NEAREST));
            $$1.draw(0, 3);
        }
    }

    public @Nullable GpuTexture c() {
        return this.g;
    }

    public @Nullable GpuTextureView d() {
        return this.h;
    }

    public @Nullable GpuTexture e() {
        return this.i;
    }

    public @Nullable GpuTextureView f() {
        return this.j;
    }
}

