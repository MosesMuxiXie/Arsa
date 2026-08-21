/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import org.jspecify.annotations.Nullable;

public class fxm
extends GpuTextureView {
    private static final int a = -1;
    private boolean b;
    private int c = -1;
    private int d = -1;
    private @Nullable Int2IntMap e;

    protected fxm(fxl $$0, int $$1, int $$2) {
        super($$0, $$1, $$2);
        $$0.b();
    }

    @Override
    public boolean isClosed() {
        return this.b;
    }

    @Override
    public void close() {
        if (!this.b) {
            this.b = true;
            this.a().c();
            if (this.c != -1) {
                GlStateManager._glDeleteFramebuffers(this.c);
            }
            if (this.e != null) {
                IntIterator intIterator = this.e.values().iterator();
                while (intIterator.hasNext()) {
                    int $$0 = (Integer)intIterator.next();
                    GlStateManager._glDeleteFramebuffers($$0);
                }
            }
        }
    }

    public int a(fwz $$0, @Nullable GpuTexture $$12) {
        int $$2;
        int n2 = $$2 = $$12 == null ? 0 : ((fxl)$$12).a;
        if (this.d == $$2) {
            return this.c;
        }
        if (this.c == -1) {
            this.c = this.a($$0, $$2);
            this.d = $$2;
            return this.c;
        }
        if (this.e == null) {
            this.e = new Int2IntArrayMap();
        }
        return this.e.computeIfAbsent($$2, $$1 -> this.a($$0, $$1));
    }

    private int a(fwz $$0, int $$1) {
        int $$2 = $$0.b();
        $$0.a($$2, this.a().a, $$1, this.baseMipLevel(), 0);
        return $$2;
    }

    public fxl a() {
        return (fxl)super.texture();
    }

    @Override
    public /* synthetic */ GpuTexture texture() {
        return this.a();
    }
}

