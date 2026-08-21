/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ilc
extends ikz
implements ilb {
    private static final Logger d = LogUtils.getLogger();
    private @Nullable fyh e;

    public ilc(Supplier<String> $$0, fyh $$1) {
        this.e = $$1;
        this.a($$0);
        this.d();
    }

    public ilc(String $$0, int $$1, int $$2, boolean $$3) {
        this.e = new fyh($$1, $$2, $$3);
        this.a($$0);
    }

    public ilc(Supplier<String> $$0, int $$1, int $$2, boolean $$3) {
        this.e = new fyh($$1, $$2, $$3);
        this.a($$0);
    }

    private void a(Supplier<String> $$0) {
        GpuDevice $$1 = RenderSystem.getDevice();
        this.a = $$1.createTexture($$0, 5, TextureFormat.RGBA8, this.e.a(), this.e.b(), 1, 1);
        this.c = RenderSystem.getSamplerCache().b(FilterMode.NEAREST);
        this.b = $$1.createTextureView(this.a);
    }

    private void a(String $$0) {
        GpuDevice $$1 = RenderSystem.getDevice();
        this.a = $$1.createTexture($$0, 5, TextureFormat.RGBA8, this.e.a(), this.e.b(), 1, 1);
        this.c = RenderSystem.getSamplerCache().b(FilterMode.NEAREST);
        this.b = $$1.createTextureView(this.a);
    }

    public void d() {
        if (this.e != null && this.a != null) {
            RenderSystem.getDevice().createCommandEncoder().writeToTexture(this.a, this.e);
        } else {
            d.warn("Trying to upload disposed texture {}", (Object)this.a().getLabel());
        }
    }

    public @Nullable fyh e() {
        return this.e;
    }

    public void a(fyh $$0) {
        if (this.e != null) {
            this.e.close();
        }
        this.e = $$0;
    }

    @Override
    public void close() {
        if (this.e != null) {
            this.e.close();
            this.e = null;
        }
        super.close();
    }

    @Override
    public void a(amo $$0, Path $$1) throws IOException {
        if (this.e != null) {
            String $$2 = $$0.c() + ".png";
            Path $$3 = $$1.resolve($$2);
            this.e.a($$3);
        }
    }
}

