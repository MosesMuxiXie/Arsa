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
import com.mojang.blaze3d.textures.TextureFormat;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import org.jspecify.annotations.Nullable;

public class fxl
extends GpuTexture {
    private static final int c = -1;
    protected final int a;
    private int d = -1;
    private int e = -1;
    private @Nullable Int2IntMap f;
    protected boolean b;
    private int g;

    protected fxl(@GpuTexture.a int $$0, String $$1, TextureFormat $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        this.a = $$7;
    }

    @Override
    public void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.g == 0) {
            this.d();
        }
    }

    private void d() {
        GlStateManager._deleteTexture(this.a);
        if (this.d != -1) {
            GlStateManager._glDeleteFramebuffers(this.d);
        }
        if (this.f != null) {
            IntIterator intIterator = this.f.values().iterator();
            while (intIterator.hasNext()) {
                int $$0 = (Integer)intIterator.next();
                GlStateManager._glDeleteFramebuffers($$0);
            }
        }
    }

    @Override
    public boolean isClosed() {
        return this.b;
    }

    public int a(fwz $$0, @Nullable GpuTexture $$12) {
        int $$2;
        int n2 = $$2 = $$12 == null ? 0 : ((fxl)$$12).a;
        if (this.e == $$2) {
            return this.d;
        }
        if (this.d == -1) {
            this.d = this.a($$0, $$2);
            this.e = $$2;
            return this.d;
        }
        if (this.f == null) {
            this.f = new Int2IntArrayMap();
        }
        return this.f.computeIfAbsent($$2, $$1 -> this.a($$0, $$1));
    }

    private int a(fwz $$0, int $$1) {
        int $$2 = $$0.b();
        $$0.a($$2, this.a, $$1, 0, 0);
        return $$2;
    }

    public int a() {
        return this.a;
    }

    public void b() {
        ++this.g;
    }

    public void c() {
        --this.g;
        if (this.b && this.g == 0) {
            this.d();
        }
    }
}

