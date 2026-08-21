/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import org.jspecify.annotations.Nullable;

public abstract class gpz<T extends gqs>
implements AutoCloseable {
    protected final hon.a a;
    private @Nullable GpuTexture b;
    private @Nullable GpuTextureView c;
    private @Nullable GpuTexture d;
    private @Nullable GpuTextureView e;
    private final hnt f = new hnt("PIP - " + this.getClass().getSimpleName(), -1000.0f, 1000.0f, true);

    protected gpz(hon.a $$0) {
        this.a = $$0;
    }

    public void a(T $$0, gqg $$1, int $$2) {
        boolean $$5;
        int $$3 = ($$0.g() - $$0.e()) * $$2;
        int $$4 = ($$0.h() - $$0.f()) * $$2;
        boolean bl2 = $$5 = this.b == null || this.b.getWidth(0) != $$3 || this.b.getHeight(0) != $$4;
        if (!$$5 && this.a($$0)) {
            this.a($$0, $$1);
            return;
        }
        this.a($$5, $$3, $$4);
        RenderSystem.outputColorTextureOverride = this.c;
        RenderSystem.outputDepthTextureOverride = this.e;
        fzm $$6 = new fzm();
        $$6.a((float)$$3 / 2.0f, this.a($$4, $$2), 0.0f);
        float $$7 = (float)$$2 * $$0.a();
        $$6.b($$7, $$7, -$$7);
        this.a($$0, $$6);
        this.a.b();
        RenderSystem.outputColorTextureOverride = null;
        RenderSystem.outputDepthTextureOverride = null;
        this.a($$0, $$1);
    }

    protected void a(T $$0, gqg $$1) {
        $$1.a(new gqb(hpa.au, gpq.a(this.c, RenderSystem.getSamplerCache().b(FilterMode.NEAREST)), $$0.bf_(), $$0.e(), $$0.f(), $$0.g(), $$0.h(), 0.0f, 1.0f, 1.0f, 0.0f, -1, $$0.i(), null));
    }

    private void a(boolean $$0, int $$1, int $$2) {
        if (this.b != null && $$0) {
            this.b.close();
            this.b = null;
            this.c.close();
            this.c = null;
            this.d.close();
            this.d = null;
            this.e.close();
            this.e = null;
        }
        GpuDevice $$3 = RenderSystem.getDevice();
        if (this.b == null) {
            this.b = $$3.createTexture(() -> "UI " + this.b() + " texture", 12, TextureFormat.RGBA8, $$1, $$2, 1, 1);
            this.c = $$3.createTextureView(this.b);
            this.d = $$3.createTexture(() -> "UI " + this.b() + " depth texture", 8, TextureFormat.DEPTH32, $$1, $$2, 1, 1);
            this.e = $$3.createTextureView(this.d);
        }
        $$3.createCommandEncoder().clearColorAndDepthTextures(this.b, 0, this.d, 1.0);
        RenderSystem.setProjectionMatrix(this.f.a($$1, $$2), fwd.b);
    }

    protected boolean a(T $$0) {
        return false;
    }

    protected float a(int $$0, int $$1) {
        return $$0;
    }

    @Override
    public void close() {
        if (this.b != null) {
            this.b.close();
        }
        if (this.c != null) {
            this.c.close();
        }
        if (this.d != null) {
            this.d.close();
        }
        if (this.e != null) {
            this.e.close();
        }
        this.f.close();
    }

    public abstract Class<T> a();

    protected abstract void a(T var1, fzm var2);

    protected abstract String b();
}

