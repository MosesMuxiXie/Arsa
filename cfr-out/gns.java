/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import java.nio.file.Path;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class gns
extends ikz
implements ilb {
    private static final int d = 256;
    private final gnt e;
    private final boolean f;
    private final a g;

    public gns(Supplier<String> $$0, gnt $$1, boolean $$2) {
        this.f = $$2;
        this.g = new a(0, 0, 256, 256);
        GpuDevice $$3 = RenderSystem.getDevice();
        this.a = $$3.createTexture($$0, 7, $$2 ? TextureFormat.RGBA8 : TextureFormat.RED8, 256, 256, 1, 1);
        this.c = RenderSystem.getSamplerCache().b(FilterMode.NEAREST);
        this.b = $$3.createTextureView(this.a);
        this.e = $$1;
    }

    public @Nullable gob a(fwp $$0, fwo $$1) {
        if ($$1.c() != this.f) {
            return null;
        }
        a $$2 = this.g.a($$1);
        if ($$2 != null) {
            $$1.a($$2.a, $$2.b, this.a());
            float $$3 = 256.0f;
            float $$4 = 256.0f;
            float $$5 = 0.01f;
            return new gob($$0, this.e, this.b(), ((float)$$2.a + 0.01f) / 256.0f, ((float)$$2.a - 0.01f + (float)$$1.a()) / 256.0f, ((float)$$2.b + 0.01f) / 256.0f, ((float)$$2.b - 0.01f + (float)$$1.b()) / 256.0f, $$1.e(), $$1.f(), $$1.g(), $$1.h());
        }
        return null;
    }

    @Override
    public void a(amo $$02, Path $$1) {
        if (this.a == null) {
            return;
        }
        String $$2 = $$02.c();
        TextureUtil.writeAsPNG($$1, $$2, this.a, 0, $$0 -> ($$0 & 0xFF000000) == 0 ? -16777216 : $$0);
    }

    static class a {
        final int a;
        final int b;
        private final int c;
        private final int d;
        private @Nullable a e;
        private @Nullable a f;
        private boolean g;

        a(int $$0, int $$1, int $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Nullable a a(fwo $$0) {
            if (this.e != null && this.f != null) {
                a $$1 = this.e.a($$0);
                if ($$1 == null) {
                    $$1 = this.f.a($$0);
                }
                return $$1;
            }
            if (this.g) {
                return null;
            }
            int $$2 = $$0.a();
            int $$3 = $$0.b();
            if ($$2 > this.c || $$3 > this.d) {
                return null;
            }
            if ($$2 == this.c && $$3 == this.d) {
                this.g = true;
                return this;
            }
            int $$4 = this.c - $$2;
            int $$5 = this.d - $$3;
            if ($$4 > $$5) {
                this.e = new a(this.a, this.b, $$2, this.d);
                this.f = new a(this.a + $$2 + 1, this.b, this.c - $$2 - 1, this.d);
            } else {
                this.e = new a(this.a, this.b, this.c, $$3);
                this.f = new a(this.a, this.b + $$3 + 1, this.c, this.d - $$3 - 1);
            }
            return this.e.a($$0);
        }
    }
}

