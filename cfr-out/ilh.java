/*
 * Decompiled with CFR 0.152.
 */
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import java.io.IOException;

public abstract class ilh
extends ikz {
    private final amo d;

    public ilh(amo $$0) {
        this.d = $$0;
    }

    public amo d() {
        return this.d;
    }

    public void a(ilq $$0) {
        boolean $$1 = $$0.c();
        boolean $$2 = $$0.b();
        AddressMode $$3 = $$1 ? AddressMode.CLAMP_TO_EDGE : AddressMode.REPEAT;
        FilterMode $$4 = $$2 ? FilterMode.LINEAR : FilterMode.NEAREST;
        this.c = RenderSystem.getSamplerCache().a($$3, $$3, $$4, $$4, false);
        try (fyh $$5 = $$0.d();){
            this.a($$5);
        }
    }

    protected void a(fyh $$0) {
        GpuDevice $$1 = RenderSystem.getDevice();
        this.close();
        this.a = $$1.createTexture(this.d::toString, 5, TextureFormat.RGBA8, $$0.a(), $$0.b(), 1, 1);
        this.b = $$1.createTextureView(this.a);
        $$1.createCommandEncoder().writeToTexture(this.a, $$0);
    }

    public abstract ilq a(baz var1) throws IOException;
}

