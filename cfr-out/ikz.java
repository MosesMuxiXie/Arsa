/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import org.jspecify.annotations.Nullable;

public abstract class ikz
implements AutoCloseable {
    protected @Nullable GpuTexture a;
    protected @Nullable GpuTextureView b;
    protected fzf c = RenderSystem.getSamplerCache().a(AddressMode.REPEAT, AddressMode.REPEAT, FilterMode.NEAREST, FilterMode.LINEAR, false);

    @Override
    public void close() {
        if (this.a != null) {
            this.a.close();
            this.a = null;
        }
        if (this.b != null) {
            this.b.close();
            this.b = null;
        }
    }

    public GpuTexture a() {
        if (this.a == null) {
            throw new IllegalStateException("Texture does not exist, can't get it before something initializes it");
        }
        return this.a;
    }

    public GpuTextureView b() {
        if (this.b == null) {
            throw new IllegalStateException("Texture view does not exist, can't get it before something initializes it");
        }
        return this.b;
    }

    public fzf c() {
        return this.c;
    }
}

