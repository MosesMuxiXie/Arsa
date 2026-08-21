/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.GLCapabilities
 *  org.lwjgl.system.MemoryUtil
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.system.MemoryUtil;

public abstract class fwy {
    public static fwy a(GLCapabilities $$0, Set<String> $$1) {
        if ($$0.GL_ARB_buffer_storage && fxe.f) {
            $$1.add("GL_ARB_buffer_storage");
            return new a();
        }
        return new b();
    }

    public abstract fxa a(fwz var1, @Nullable Supplier<String> var2, @GpuBuffer.a int var3, long var4);

    public abstract fxa a(fwz var1, @Nullable Supplier<String> var2, @GpuBuffer.a int var3, ByteBuffer var4);

    public abstract fxa.a a(fwz var1, fxa var2, long var3, long var5, int var7);

    static class a
    extends fwy {
        a() {
        }

        @Override
        public fxa a(fwz $$0, @Nullable Supplier<String> $$1, @GpuBuffer.a int $$2, long $$3) {
            int $$4 = $$0.a();
            $$0.b($$4, $$3, $$2);
            ByteBuffer $$5 = this.a($$0, $$2, $$4, $$3);
            return new fxa($$1, $$0, $$2, $$3, $$4, $$5);
        }

        @Override
        public fxa a(fwz $$0, @Nullable Supplier<String> $$1, @GpuBuffer.a int $$2, ByteBuffer $$3) {
            int $$4 = $$0.a();
            int $$5 = $$3.remaining();
            $$0.b($$4, $$3, $$2);
            ByteBuffer $$6 = this.a($$0, $$2, $$4, (long)$$5);
            return new fxa($$1, $$0, $$2, $$5, $$4, $$6);
        }

        private @Nullable ByteBuffer a(fwz $$0, @GpuBuffer.a int $$1, int $$2, long $$3) {
            ByteBuffer $$6;
            int $$4 = 0;
            if (($$1 & 1) != 0) {
                $$4 |= 1;
            }
            if (($$1 & 2) != 0) {
                $$4 |= 0x12;
            }
            if ($$4 != 0) {
                GlStateManager.clearGlErrors();
                ByteBuffer $$5 = $$0.a($$2, 0L, $$3, $$4 | 0x40, $$1);
                if ($$5 == null) {
                    throw new IllegalStateException("Can't persistently map buffer, opengl error " + GlStateManager._getError());
                }
            } else {
                $$6 = null;
            }
            return $$6;
        }

        @Override
        public fxa.a a(fwz $$0, fxa $$1, long $$2, long $$3, int $$4) {
            if ($$1.e == null) {
                throw new IllegalStateException("Somehow trying to map an unmappable buffer");
            }
            if ($$2 > Integer.MAX_VALUE || $$3 > Integer.MAX_VALUE) {
                throw new IllegalArgumentException("Mapping buffers larger than 2GB is not supported");
            }
            if ($$2 < 0L || $$3 < 0L) {
                throw new IllegalArgumentException("Offset or length must be positive integer values");
            }
            return new fxa.a(() -> {
                if (($$4 & 2) != 0) {
                    $$0.a($$2.d, $$2, $$3, $$1.usage());
                }
            }, $$1, MemoryUtil.memSlice((ByteBuffer)$$1.e, (int)((int)$$2), (int)((int)$$3)));
        }
    }

    static class b
    extends fwy {
        b() {
        }

        @Override
        public fxa a(fwz $$0, @Nullable Supplier<String> $$1, @GpuBuffer.a int $$2, long $$3) {
            int $$4 = $$0.a();
            $$0.a($$4, $$3, $$2);
            return new fxa($$1, $$0, $$2, $$3, $$4, null);
        }

        @Override
        public fxa a(fwz $$0, @Nullable Supplier<String> $$1, @GpuBuffer.a int $$2, ByteBuffer $$3) {
            int $$4 = $$0.a();
            int $$5 = $$3.remaining();
            $$0.a($$4, $$3, $$2);
            return new fxa($$1, $$0, $$2, $$5, $$4, null);
        }

        @Override
        public fxa.a a(fwz $$0, fxa $$1, long $$2, long $$3, int $$4) {
            GlStateManager.clearGlErrors();
            ByteBuffer $$5 = $$0.a($$1.d, $$2, $$3, $$4, $$1.usage());
            if ($$5 == null) {
                throw new IllegalStateException("Can't map buffer, opengl error " + GlStateManager._getError());
            }
            return new fxa.a(() -> $$0.a($$1.d, $$1.usage()), $$1, $$5);
        }
    }
}

