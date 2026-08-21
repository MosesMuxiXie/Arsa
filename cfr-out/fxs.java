/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class fxs
extends fxt {
    public static final int a = 854;
    public static final int b = 480;
    static final a k = new a(854, 480);

    public fxs(int $$0, int $$1) {
        super("Main", true);
        this.c($$0, $$1);
    }

    private void c(int $$0, int $$1) {
        a $$2 = this.d($$0, $$1);
        if (this.g == null || this.i == null) {
            throw new IllegalStateException("Missing color and/or depth textures");
        }
        this.c = $$2.a;
        this.d = $$2.b;
    }

    private a d(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        for (a $$2 : fxs$a.a($$0, $$1)) {
            if (this.g != null) {
                this.g.close();
                this.g = null;
            }
            if (this.h != null) {
                this.h.close();
                this.h = null;
            }
            if (this.i != null) {
                this.i.close();
                this.i = null;
            }
            if (this.j != null) {
                this.j.close();
                this.j = null;
            }
            this.g = this.a($$2);
            this.i = this.b($$2);
            if (this.g == null || this.i == null) continue;
            this.h = RenderSystem.getDevice().createTextureView(this.g);
            this.j = RenderSystem.getDevice().createTextureView(this.i);
            return $$2;
        }
        throw new RuntimeException("Unrecoverable GL_OUT_OF_MEMORY (" + (this.g == null ? "missing color" : "have color") + ", " + (this.i == null ? "missing depth" : "have depth") + ")");
    }

    private @Nullable GpuTexture a(a $$0) {
        try {
            return RenderSystem.getDevice().createTexture(() -> this.e + " / Color", 15, TextureFormat.RGBA8, $$0.a, $$0.b, 1, 1);
        }
        catch (fwb $$1) {
            return null;
        }
    }

    private @Nullable GpuTexture b(a $$0) {
        try {
            return RenderSystem.getDevice().createTexture(() -> this.e + " / Depth", 15, TextureFormat.DEPTH32, $$0.a, $$0.b, 1, 1);
        }
        catch (fwb $$1) {
            return null;
        }
    }

    static class a {
        public final int a;
        public final int b;

        a(int $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        static List<a> a(int $$0, int $$1) {
            RenderSystem.assertOnRenderThread();
            int $$2 = RenderSystem.getDevice().getMaxTextureSize();
            if ($$0 <= 0 || $$0 > $$2 || $$1 <= 0 || $$1 > $$2) {
                return ImmutableList.of((Object)k);
            }
            return ImmutableList.of((Object)new a($$0, $$1), (Object)k);
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 == null || this.getClass() != $$0.getClass()) {
                return false;
            }
            a $$1 = (a)$$0;
            return this.a == $$1.a && this.b == $$1.b;
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }

        public String toString() {
            return this.a + "x" + this.b;
        }
    }
}

