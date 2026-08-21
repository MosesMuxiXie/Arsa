/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL11C
 *  org.lwjgl.opengl.GL31
 *  org.lwjgl.opengl.GL32
 *  org.lwjgl.opengl.GL32C
 *  org.lwjgl.opengl.GL33C
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuQuery;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import java.lang.runtime.SwitchBootstraps;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL11C;
import org.lwjgl.opengl.GL31;
import org.lwjgl.opengl.GL32;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.opengl.GL33C;
import org.slf4j.Logger;

public class fxb
implements CommandEncoder {
    private static final Logger a = LogUtils.getLogger();
    private final fxe b;
    private final int c;
    private final int d;
    private @Nullable RenderPipeline e;
    private boolean f;
    private @Nullable fxg g;
    private @Nullable fxn h;

    protected fxb(fxe $$0) {
        this.b = $$0;
        this.c = $$0.b().b();
        this.d = $$0.b().b();
    }

    @Override
    public RenderPass createRenderPass(Supplier<String> $$0, GpuTextureView $$1, OptionalInt $$2) {
        return this.createRenderPass($$0, $$1, $$2, null, OptionalDouble.empty());
    }

    @Override
    public RenderPass createRenderPass(Supplier<String> $$0, GpuTextureView $$1, OptionalInt $$2, @Nullable GpuTextureView $$3, OptionalDouble $$4) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before creating a new one!");
        }
        if ($$4.isPresent() && $$3 == null) {
            a.warn("Depth clear value was provided but no depth texture is being used");
        }
        if ($$1.isClosed()) {
            throw new IllegalStateException("Color texture is closed");
        }
        if (($$1.texture().usage() & 8) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT");
        }
        if ($$1.texture().getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported as an attachment");
        }
        if ($$3 != null) {
            if ($$3.isClosed()) {
                throw new IllegalStateException("Depth texture is closed");
            }
            if (($$3.texture().usage() & 8) == 0) {
                throw new IllegalStateException("Depth texture must have USAGE_RENDER_ATTACHMENT");
            }
            if ($$3.texture().getDepthOrLayers() > 1) {
                throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported as an attachment");
            }
        }
        this.f = true;
        this.b.a().a($$0);
        int $$5 = ((fxm)$$1).a(this.b.b(), $$3 == null ? null : $$3.texture());
        GlStateManager._glBindFramebuffer(36160, $$5);
        int $$6 = 0;
        if ($$2.isPresent()) {
            int $$7 = $$2.getAsInt();
            GL11.glClearColor((float)bel.n($$7), (float)bel.o($$7), (float)bel.p($$7), (float)bel.m($$7));
            $$6 |= 0x4000;
        }
        if ($$3 != null && $$4.isPresent()) {
            GL11.glClearDepth((double)$$4.getAsDouble());
            $$6 |= 0x100;
        }
        if ($$6 != 0) {
            GlStateManager._disableScissorTest();
            GlStateManager._depthMask(true);
            GlStateManager._colorMask(true, true, true, true);
            GlStateManager._clear($$6);
        }
        GlStateManager._viewport(0, 0, $$1.getWidth(0), $$1.getHeight(0));
        this.e = null;
        return new fxh(this, $$3 != null);
    }

    @Override
    public void clearColorTexture(GpuTexture $$0, int $$1) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before creating a new one!");
        }
        this.a($$0);
        this.b.b().a(this.d, ((fxl)$$0).a, 0, 0, 36160);
        GL11.glClearColor((float)bel.n($$1), (float)bel.o($$1), (float)bel.p($$1), (float)bel.m($$1));
        GlStateManager._disableScissorTest();
        GlStateManager._colorMask(true, true, true, true);
        GlStateManager._clear(16384);
        GlStateManager._glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GlStateManager._glBindFramebuffer(36160, 0);
    }

    @Override
    public void clearColorAndDepthTextures(GpuTexture $$0, int $$1, GpuTexture $$2, double $$3) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before creating a new one!");
        }
        this.a($$0);
        this.b($$2);
        int $$4 = ((fxl)$$0).a(this.b.b(), $$2);
        GlStateManager._glBindFramebuffer(36160, $$4);
        GlStateManager._disableScissorTest();
        GL11.glClearDepth((double)$$3);
        GL11.glClearColor((float)bel.n($$1), (float)bel.o($$1), (float)bel.p($$1), (float)bel.m($$1));
        GlStateManager._depthMask(true);
        GlStateManager._colorMask(true, true, true, true);
        GlStateManager._clear(16640);
        GlStateManager._glBindFramebuffer(36160, 0);
    }

    @Override
    public void clearColorAndDepthTextures(GpuTexture $$0, int $$1, GpuTexture $$2, double $$3, int $$4, int $$5, int $$6, int $$7) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before creating a new one!");
        }
        this.a($$0);
        this.b($$2);
        this.a($$0, $$4, $$5, $$6, $$7);
        int $$8 = ((fxl)$$0).a(this.b.b(), $$2);
        GlStateManager._glBindFramebuffer(36160, $$8);
        GlStateManager._scissorBox($$4, $$5, $$6, $$7);
        GlStateManager._enableScissorTest();
        GL11.glClearDepth((double)$$3);
        GL11.glClearColor((float)bel.n($$1), (float)bel.o($$1), (float)bel.p($$1), (float)bel.m($$1));
        GlStateManager._depthMask(true);
        GlStateManager._colorMask(true, true, true, true);
        GlStateManager._clear(16640);
        GlStateManager._glBindFramebuffer(36160, 0);
    }

    private void a(GpuTexture $$0, int $$1, int $$2, int $$3, int $$4) {
        if ($$1 < 0 || $$1 >= $$0.getWidth(0)) {
            throw new IllegalArgumentException("regionX should not be outside of the texture");
        }
        if ($$2 < 0 || $$2 >= $$0.getHeight(0)) {
            throw new IllegalArgumentException("regionY should not be outside of the texture");
        }
        if ($$3 <= 0) {
            throw new IllegalArgumentException("regionWidth should be greater than 0");
        }
        if ($$1 + $$3 > $$0.getWidth(0)) {
            throw new IllegalArgumentException("regionWidth + regionX should be less than the texture width");
        }
        if ($$4 <= 0) {
            throw new IllegalArgumentException("regionHeight should be greater than 0");
        }
        if ($$2 + $$4 > $$0.getHeight(0)) {
            throw new IllegalArgumentException("regionWidth + regionX should be less than the texture height");
        }
    }

    @Override
    public void clearDepthTexture(GpuTexture $$0, double $$1) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before creating a new one!");
        }
        this.b($$0);
        this.b.b().a(this.d, 0, ((fxl)$$0).a, 0, 36160);
        GL11.glDrawBuffer((int)0);
        GL11.glClearDepth((double)$$1);
        GlStateManager._depthMask(true);
        GlStateManager._disableScissorTest();
        GlStateManager._clear(256);
        GL11.glDrawBuffer((int)36064);
        GlStateManager._glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
        GlStateManager._glBindFramebuffer(36160, 0);
    }

    private void a(GpuTexture $$0) {
        if (!$$0.getFormat().hasColorAspect()) {
            throw new IllegalStateException("Trying to clear a non-color texture as color");
        }
        if ($$0.isClosed()) {
            throw new IllegalStateException("Color texture is closed");
        }
        if (($$0.usage() & 8) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT");
        }
        if ($$0.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Clearing a texture with multiple layers or depths is not yet supported");
        }
    }

    private void b(GpuTexture $$0) {
        if (!$$0.getFormat().hasDepthAspect()) {
            throw new IllegalStateException("Trying to clear a non-depth texture as depth");
        }
        if ($$0.isClosed()) {
            throw new IllegalStateException("Depth texture is closed");
        }
        if (($$0.usage() & 8) == 0) {
            throw new IllegalStateException("Depth texture must have USAGE_RENDER_ATTACHMENT");
        }
        if ($$0.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Clearing a texture with multiple layers or depths is not yet supported");
        }
    }

    @Override
    public void writeToBuffer(GpuBufferSlice $$0, ByteBuffer $$1) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        fxa $$2 = (fxa)$$0.buffer();
        if ($$2.b) {
            throw new IllegalStateException("Buffer already closed");
        }
        if (($$2.usage() & 8) == 0) {
            throw new IllegalStateException("Buffer needs USAGE_COPY_DST to be a destination for a copy");
        }
        int $$3 = $$1.remaining();
        if ((long)$$3 > $$0.length()) {
            throw new IllegalArgumentException("Cannot write more data than the slice allows (attempting to write " + $$3 + " bytes into a slice of length " + $$0.length() + ")");
        }
        if ($$0.length() + $$0.offset() > $$2.size()) {
            throw new IllegalArgumentException("Cannot write more data than this buffer can hold (attempting to write " + $$3 + " bytes at offset " + $$0.offset() + " to " + $$2.size() + " size buffer)");
        }
        this.b.b().a($$2.d, $$0.offset(), $$1, $$2.usage());
    }

    @Override
    public GpuBuffer.MappedView mapBuffer(GpuBuffer $$0, boolean $$1, boolean $$2) {
        return this.mapBuffer($$0.slice(), $$1, $$2);
    }

    @Override
    public GpuBuffer.MappedView mapBuffer(GpuBufferSlice $$0, boolean $$1, boolean $$2) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        fxa $$3 = (fxa)$$0.buffer();
        if ($$3.b) {
            throw new IllegalStateException("Buffer already closed");
        }
        if (!$$1 && !$$2) {
            throw new IllegalArgumentException("At least read or write must be true");
        }
        if ($$1 && ($$3.usage() & 1) == 0) {
            throw new IllegalStateException("Buffer is not readable");
        }
        if ($$2 && ($$3.usage() & 2) == 0) {
            throw new IllegalStateException("Buffer is not writable");
        }
        if ($$0.offset() + $$0.length() > $$3.size()) {
            throw new IllegalArgumentException("Cannot map more data than this buffer can hold (attempting to map " + $$0.length() + " bytes at offset " + $$0.offset() + " from " + $$3.size() + " size buffer)");
        }
        int $$4 = 0;
        if ($$1) {
            $$4 |= 1;
        }
        if ($$2) {
            $$4 |= 0x22;
        }
        return this.b.d().a(this.b.b(), $$3, $$0.offset(), $$0.length(), $$4);
    }

    @Override
    public void copyToBuffer(GpuBufferSlice $$0, GpuBufferSlice $$1) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        fxa $$2 = (fxa)$$0.buffer();
        if ($$2.b) {
            throw new IllegalStateException("Source buffer already closed");
        }
        if (($$2.usage() & 0x10) == 0) {
            throw new IllegalStateException("Source buffer needs USAGE_COPY_SRC to be a source for a copy");
        }
        fxa $$3 = (fxa)$$1.buffer();
        if ($$3.b) {
            throw new IllegalStateException("Target buffer already closed");
        }
        if (($$3.usage() & 8) == 0) {
            throw new IllegalStateException("Target buffer needs USAGE_COPY_DST to be a destination for a copy");
        }
        if ($$0.length() != $$1.length()) {
            throw new IllegalArgumentException("Cannot copy from slice of size " + $$0.length() + " to slice of size " + $$1.length() + ", they must be equal");
        }
        if ($$0.offset() + $$0.length() > $$2.size()) {
            throw new IllegalArgumentException("Cannot copy more data than the source buffer holds (attempting to copy " + $$0.length() + " bytes at offset " + $$0.offset() + " from " + $$2.size() + " size buffer)");
        }
        if ($$1.offset() + $$1.length() > $$3.size()) {
            throw new IllegalArgumentException("Cannot copy more data than the target buffer can hold (attempting to copy " + $$1.length() + " bytes at offset " + $$1.offset() + " to " + $$3.size() + " size buffer)");
        }
        this.b.b().a($$2.d, $$3.d, $$0.offset(), $$1.offset(), $$0.length());
    }

    @Override
    public void writeToTexture(GpuTexture $$0, fyh $$1) {
        int $$2 = $$0.getWidth(0);
        int $$3 = $$0.getHeight(0);
        if ($$1.a() != $$2 || $$1.b() != $$3) {
            throw new IllegalArgumentException("Cannot replace texture of size " + $$2 + "x" + $$3 + " with image of size " + $$1.a() + "x" + $$1.b());
        }
        if ($$0.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
        }
        if (($$0.usage() & 1) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
        }
        this.writeToTexture($$0, $$1, 0, 0, 0, 0, $$2, $$3, 0, 0);
    }

    @Override
    public void writeToTexture(GpuTexture $$0, fyh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
        int $$11;
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        if ($$2 < 0 || $$2 >= $$0.getMipLevels()) {
            throw new IllegalArgumentException("Invalid mipLevel " + $$2 + ", must be >= 0 and < " + $$0.getMipLevels());
        }
        if ($$8 + $$6 > $$1.a() || $$9 + $$7 > $$1.b()) {
            throw new IllegalArgumentException("Copy source (" + $$1.a() + "x" + $$1.b() + ") is not large enough to read a rectangle of " + $$6 + "x" + $$7 + " from " + $$8 + "x" + $$9);
        }
        if ($$4 + $$6 > $$0.getWidth($$2) || $$5 + $$7 > $$0.getHeight($$2)) {
            throw new IllegalArgumentException("Dest texture (" + $$6 + "x" + $$7 + ") is not large enough to write a rectangle of " + $$6 + "x" + $$7 + " at " + $$4 + "x" + $$5 + " (at mip level " + $$2 + ")");
        }
        if ($$0.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
        }
        if (($$0.usage() & 1) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
        }
        if ($$3 >= $$0.getDepthOrLayers()) {
            throw new UnsupportedOperationException("Depth or layer is out of range, must be >= 0 and < " + $$0.getDepthOrLayers());
        }
        if (($$0.usage() & 0x10) != 0) {
            int $$10 = GlConst.CUBEMAP_TARGETS[$$3 % 6];
            GL11.glBindTexture((int)34067, (int)((fxl)$$0).a);
        } else {
            $$11 = 3553;
            GlStateManager._bindTexture(((fxl)$$0).a);
        }
        GlStateManager._pixelStore(3314, $$1.a());
        GlStateManager._pixelStore(3316, $$8);
        GlStateManager._pixelStore(3315, $$9);
        GlStateManager._pixelStore(3317, $$1.c().a());
        GlStateManager._texSubImage2D($$11, $$2, $$4, $$5, $$6, $$7, GlConst.toGl($$1.c()), 5121, $$1.h());
    }

    @Override
    public void writeToTexture(GpuTexture $$0, ByteBuffer $$1, fyh.a $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
        int $$10;
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        if ($$3 < 0 || $$3 >= $$0.getMipLevels()) {
            throw new IllegalArgumentException("Invalid mipLevel, must be >= 0 and < " + $$0.getMipLevels());
        }
        if ($$7 * $$8 * $$2.a() > $$1.remaining()) {
            throw new IllegalArgumentException("Copy would overrun the source buffer (remaining length of " + $$1.remaining() + ", but copy is " + $$7 + "x" + $$8 + " of format " + String.valueOf((Object)$$2) + ")");
        }
        if ($$5 + $$7 > $$0.getWidth($$3) || $$6 + $$8 > $$0.getHeight($$3)) {
            throw new IllegalArgumentException("Dest texture (" + $$0.getWidth($$3) + "x" + $$0.getHeight($$3) + ") is not large enough to write a rectangle of " + $$7 + "x" + $$8 + " at " + $$5 + "x" + $$6);
        }
        if ($$0.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
        }
        if (($$0.usage() & 1) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_COPY_DST to be a destination for a write");
        }
        if ($$4 >= $$0.getDepthOrLayers()) {
            throw new UnsupportedOperationException("Depth or layer is out of range, must be >= 0 and < " + $$0.getDepthOrLayers());
        }
        if (($$0.usage() & 0x10) != 0) {
            int $$9 = GlConst.CUBEMAP_TARGETS[$$4 % 6];
            GL11.glBindTexture((int)34067, (int)((fxl)$$0).a);
        } else {
            $$10 = 3553;
            GlStateManager._bindTexture(((fxl)$$0).a);
        }
        GlStateManager._pixelStore(3314, $$7);
        GlStateManager._pixelStore(3316, 0);
        GlStateManager._pixelStore(3315, 0);
        GlStateManager._pixelStore(3317, $$2.a());
        GlStateManager._texSubImage2D($$10, $$3, $$5, $$6, $$7, $$8, GlConst.toGl($$2), 5121, $$1);
    }

    @Override
    public void copyTextureToBuffer(GpuTexture $$0, GpuBuffer $$1, long $$2, Runnable $$3, int $$4) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        this.copyTextureToBuffer($$0, $$1, $$2, $$3, $$4, 0, 0, $$0.getWidth($$4), $$0.getHeight($$4));
    }

    @Override
    public void copyTextureToBuffer(GpuTexture $$0, GpuBuffer $$1, long $$2, Runnable $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        if ($$4 < 0 || $$4 >= $$0.getMipLevels()) {
            throw new IllegalArgumentException("Invalid mipLevel " + $$4 + ", must be >= 0 and < " + $$0.getMipLevels());
        }
        if ((long)($$0.getWidth($$4) * $$0.getHeight($$4) * $$0.getFormat().pixelSize()) + $$2 > $$1.size()) {
            throw new IllegalArgumentException("Buffer of size " + $$1.size() + " is not large enough to hold " + $$7 + "x" + $$8 + " pixels (" + $$0.getFormat().pixelSize() + " bytes each) starting from offset " + $$2);
        }
        if (($$0.usage() & 2) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_SRC to be a source for a copy");
        }
        if (($$1.usage() & 8) == 0) {
            throw new IllegalArgumentException("Buffer needs USAGE_COPY_DST to be a destination for a copy");
        }
        if ($$5 + $$7 > $$0.getWidth($$4) || $$6 + $$8 > $$0.getHeight($$4)) {
            throw new IllegalArgumentException("Copy source texture (" + $$0.getWidth($$4) + "x" + $$0.getHeight($$4) + ") is not large enough to read a rectangle of " + $$7 + "x" + $$8 + " from " + $$5 + "," + $$6);
        }
        if ($$0.isClosed()) {
            throw new IllegalStateException("Source texture is closed");
        }
        if ($$1.isClosed()) {
            throw new IllegalStateException("Destination buffer is closed");
        }
        if ($$0.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
        }
        GlStateManager.clearGlErrors();
        this.b.b().a(this.c, ((fxl)$$0).a(), 0, $$4, 36008);
        GlStateManager._glBindBuffer(35051, ((fxa)$$1).d);
        GlStateManager._pixelStore(3330, $$7);
        GlStateManager._readPixels($$5, $$6, $$7, $$8, GlConst.toGlExternalId($$0.getFormat()), GlConst.toGlType($$0.getFormat()), $$2);
        RenderSystem.queueFencedTask($$3);
        GlStateManager._glFramebufferTexture2D(36008, 36064, 3553, 0, $$4);
        GlStateManager._glBindFramebuffer(36008, 0);
        GlStateManager._glBindBuffer(35051, 0);
        int $$9 = GlStateManager._getError();
        if ($$9 != 0) {
            throw new IllegalStateException("Couldn't perform copyTobuffer for texture " + $$0.getLabel() + ": GL error " + $$9);
        }
    }

    @Override
    public void copyTextureToTexture(GpuTexture $$0, GpuTexture $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        if ($$2 < 0 || $$2 >= $$0.getMipLevels() || $$2 >= $$1.getMipLevels()) {
            throw new IllegalArgumentException("Invalid mipLevel " + $$2 + ", must be >= 0 and < " + $$0.getMipLevels() + " and < " + $$1.getMipLevels());
        }
        if ($$3 + $$7 > $$1.getWidth($$2) || $$4 + $$8 > $$1.getHeight($$2)) {
            throw new IllegalArgumentException("Dest texture (" + $$1.getWidth($$2) + "x" + $$1.getHeight($$2) + ") is not large enough to write a rectangle of " + $$7 + "x" + $$8 + " at " + $$3 + "x" + $$4);
        }
        if ($$5 + $$7 > $$0.getWidth($$2) || $$6 + $$8 > $$0.getHeight($$2)) {
            throw new IllegalArgumentException("Source texture (" + $$0.getWidth($$2) + "x" + $$0.getHeight($$2) + ") is not large enough to read a rectangle of " + $$7 + "x" + $$8 + " at " + $$5 + "x" + $$6);
        }
        if ($$0.isClosed()) {
            throw new IllegalStateException("Source texture is closed");
        }
        if ($$1.isClosed()) {
            throw new IllegalStateException("Destination texture is closed");
        }
        if (($$0.usage() & 2) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_SRC to be a source for a copy");
        }
        if (($$1.usage() & 1) == 0) {
            throw new IllegalArgumentException("Texture needs USAGE_COPY_DST to be a destination for a copy");
        }
        if ($$0.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
        }
        if ($$1.getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for copying");
        }
        GlStateManager.clearGlErrors();
        GlStateManager._disableScissorTest();
        boolean $$9 = $$0.getFormat().hasDepthAspect();
        int $$10 = ((fxl)$$0).a();
        int $$11 = ((fxl)$$1).a();
        this.b.b().a(this.c, $$9 ? 0 : $$10, $$9 ? $$10 : 0, 0, 0);
        this.b.b().a(this.d, $$9 ? 0 : $$11, $$9 ? $$11 : 0, 0, 0);
        this.b.b().a(this.c, this.d, $$5, $$6, $$7, $$8, $$3, $$4, $$7, $$8, $$9 ? 256 : 16384, 9728);
        int $$12 = GlStateManager._getError();
        if ($$12 != 0) {
            throw new IllegalStateException("Couldn't perform copyToTexture for texture " + $$0.getLabel() + " to " + $$1.getLabel() + ": GL error " + $$12);
        }
    }

    @Override
    public void presentTexture(GpuTextureView $$0) {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        if (!$$0.texture().getFormat().hasColorAspect()) {
            throw new IllegalStateException("Cannot present a non-color texture!");
        }
        if (($$0.texture().usage() & 8) == 0) {
            throw new IllegalStateException("Color texture must have USAGE_RENDER_ATTACHMENT to presented to the screen");
        }
        if ($$0.texture().getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported for presentation");
        }
        GlStateManager._disableScissorTest();
        GlStateManager._viewport(0, 0, $$0.getWidth(0), $$0.getHeight(0));
        GlStateManager._depthMask(true);
        GlStateManager._colorMask(true, true, true, true);
        this.b.b().a(this.d, ((fxl)$$0.texture()).a(), 0, 0, 0);
        this.b.b().a(this.d, 0, 0, 0, $$0.getWidth(0), $$0.getHeight(0), 0, 0, $$0.getWidth(0), $$0.getHeight(0), 16384, 9728);
    }

    @Override
    public GpuFence createFence() {
        if (this.f) {
            throw new IllegalStateException("Close the existing render pass before performing additional commands");
        }
        return new fxf();
    }

    protected <T> void a(fxh $$0, Collection<RenderPass.a<T>> $$12, @Nullable GpuBuffer $$22, @Nullable VertexFormat.a $$3, Collection<String> $$4, T $$5) {
        if (!this.a($$0, $$4)) {
            return;
        }
        if ($$3 == null) {
            $$3 = VertexFormat.a.a;
        }
        for (RenderPass.a<T> $$6 : $$12) {
            BiConsumer<T, RenderPass.b> $$8;
            VertexFormat.a $$7 = $$6.d() == null ? $$3 : $$6.d();
            $$0.setIndexBuffer($$6.c() == null ? $$22 : $$6.c(), $$7);
            $$0.setVertexBuffer($$6.a(), $$6.b());
            if (fxh.b) {
                if ($$0.e == null) {
                    throw new IllegalStateException("Missing index buffer");
                }
                if ($$0.e.isClosed()) {
                    throw new IllegalStateException("Index buffer has been closed!");
                }
                if ($$0.d[0] == null) {
                    throw new IllegalStateException("Missing vertex buffer at slot 0");
                }
                if ($$0.d[0].isClosed()) {
                    throw new IllegalStateException("Vertex buffer at slot 0 has been closed!");
                }
            }
            if (($$8 = $$6.g()) != null) {
                $$8.accept($$5, ($$1, $$2) -> {
                    fxo $$3 = $$0.c.b().a($$1);
                    if ($$3 instanceof fxo.b) {
                        int $$6;
                        fxo.b $$4 = (fxo.b)$$3;
                        try {
                            int $$5;
                            $$6 = $$5 = $$4.a();
                        }
                        catch (Throwable throwable) {
                            throw new MatchException(throwable.toString(), throwable);
                        }
                        GL32.glBindBufferRange((int)35345, (int)$$6, (int)((fxa)$$2.buffer()).d, (long)$$2.offset(), (long)$$2.length());
                    }
                });
            }
            this.a($$0, 0, $$6.e(), $$6.f(), $$7, $$0.c, 1);
        }
    }

    protected void a(fxh $$0, int $$1, int $$2, int $$3, @Nullable VertexFormat.a $$4, int $$5) {
        if (!this.a($$0, Collections.emptyList())) {
            return;
        }
        if (fxh.b) {
            if ($$4 != null) {
                if ($$0.e == null) {
                    throw new IllegalStateException("Missing index buffer");
                }
                if ($$0.e.isClosed()) {
                    throw new IllegalStateException("Index buffer has been closed!");
                }
                if (($$0.e.usage() & 0x40) == 0) {
                    throw new IllegalStateException("Index buffer must have GpuBuffer.USAGE_INDEX!");
                }
            }
            fxi $$6 = $$0.c;
            if ($$0.d[0] == null && $$6 != null && !$$6.a().getVertexFormat().getElements().isEmpty()) {
                throw new IllegalStateException("Vertex format contains elements but vertex buffer at slot 0 is null");
            }
            if ($$0.d[0] != null && $$0.d[0].isClosed()) {
                throw new IllegalStateException("Vertex buffer at slot 0 has been closed!");
            }
            if ($$0.d[0] != null && ($$0.d[0].usage() & 0x20) == 0) {
                throw new IllegalStateException("Vertex buffer must have GpuBuffer.USAGE_VERTEX!");
            }
        }
        this.a($$0, $$1, $$2, $$3, $$4, $$0.c, $$5);
    }

    private void a(fxh $$0, int $$1, int $$2, int $$3, @Nullable VertexFormat.a $$4, fxi $$5, int $$6) {
        this.b.c().a($$5.a().getVertexFormat(), (fxa)$$0.d[0]);
        if ($$4 != null) {
            GlStateManager._glBindBuffer(34963, ((fxa)$$0.e).d);
            if ($$6 > 1) {
                if ($$1 > 0) {
                    GL32.glDrawElementsInstancedBaseVertex((int)GlConst.toGl($$5.a().getVertexFormatMode()), (int)$$3, (int)GlConst.toGl($$4), (long)((long)$$2 * (long)$$4.c), (int)$$6, (int)$$1);
                } else {
                    GL31.glDrawElementsInstanced((int)GlConst.toGl($$5.a().getVertexFormatMode()), (int)$$3, (int)GlConst.toGl($$4), (long)((long)$$2 * (long)$$4.c), (int)$$6);
                }
            } else if ($$1 > 0) {
                GL32.glDrawElementsBaseVertex((int)GlConst.toGl($$5.a().getVertexFormatMode()), (int)$$3, (int)GlConst.toGl($$4), (long)((long)$$2 * (long)$$4.c), (int)$$1);
            } else {
                GlStateManager._drawElements(GlConst.toGl($$5.a().getVertexFormatMode()), $$3, GlConst.toGl($$4), (long)$$2 * (long)$$4.c);
            }
        } else if ($$6 > 1) {
            GL31.glDrawArraysInstanced((int)GlConst.toGl($$5.a().getVertexFormatMode()), (int)$$1, (int)$$3, (int)$$6);
        } else {
            GlStateManager._drawArrays(GlConst.toGl($$5.a().getVertexFormatMode()), $$1, $$3);
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private boolean a(fxh $$0, Collection<String> $$1) {
        if (fxh.b) {
            if ($$0.c == null) {
                throw new IllegalStateException("Can't draw without a render pipeline");
            }
            if ($$0.c.b() == fxg.b) {
                throw new IllegalStateException("Pipeline contains invalid shader program");
            }
            for (RenderPipeline.UniformDescription $$2 : $$0.c.a().getUniforms()) {
                $$3 = $$0.g.get($$2.name());
                if ($$1.contains($$2.name())) continue;
                if ($$3 == null) {
                    throw new IllegalStateException("Missing uniform " + $$2.name() + " (should be " + String.valueOf((Object)$$2.type()) + ")");
                }
                if ($$2.type() == fyz.a) {
                    if ($$3.buffer().isClosed()) {
                        throw new IllegalStateException("Uniform buffer " + $$2.name() + " is already closed");
                    }
                    if (($$3.buffer().usage() & 128) == 0) {
                        throw new IllegalStateException("Uniform buffer " + $$2.name() + " must have GpuBuffer.USAGE_UNIFORM");
                    }
                }
                if ($$2.type() != fyz.b) continue;
                if ($$3.offset() != 0L || $$3.length() != $$3.buffer().size()) {
                    throw new IllegalStateException("Uniform texel buffers do not support a slice of a buffer, must be entire buffer");
                }
                if ($$2.textureFormat() != null) continue;
                throw new IllegalStateException("Invalid uniform texel buffer " + $$2.name() + " (missing a texture format)");
            }
            for (Map.Entry $$4 : $$0.c.b().c().entrySet()) {
                if (!($$4.getValue() instanceof fxo.a)) continue;
                $$5 = (String)$$4.getKey();
                $$6 = $$0.h.get($$5);
                if ($$6 == null) {
                    throw new IllegalStateException("Missing sampler " + $$5);
                }
                $$7 = $$6.a();
                if ($$7.isClosed()) {
                    throw new IllegalStateException("Texture view " + $$5 + " (" + $$7.a().getLabel() + ") has been closed!");
                }
                if (($$7.a().usage() & 4) == 0) {
                    throw new IllegalStateException("Texture view " + $$5 + " (" + $$7.a().getLabel() + ") must have USAGE_TEXTURE_BINDING!");
                }
                if (!$$6.b().h()) continue;
                throw new IllegalStateException("Sampler for " + $$5 + " (" + $$7.a().getLabel() + ") has been closed!");
            }
            if ($$0.c.a().wantsDepthTexture() && !$$0.a()) {
                fxb.a.warn("Render pipeline {} wants a depth texture but none was provided - this is probably a bug", (Object)$$0.c.a().getLocation());
            }
        } else if ($$0.c == null || $$0.c.b() == fxg.b) {
            return false;
        }
        $$8 = $$0.c.a();
        $$9 = $$0.c.b();
        this.a($$8);
        v0 = $$10 = this.g != $$9;
        if ($$10) {
            GlStateManager._glUseProgram($$9.a());
            this.g = $$9;
        }
        block15: for (Map.Entry<String, fxo> $$11 : $$9.c().entrySet()) {
            block35: {
                $$12 = $$11.getKey();
                $$13 = $$0.i.contains($$12);
                Objects.requireNonNull($$11.getValue());
                var11_13 = 0;
                switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{fxo.b.class, fxo.c.class, fxo.a.class}, (Object)var10_12, var11_13)) {
                    default: {
                        throw new MatchException(null, null);
                    }
                    case 0: {
                        var12_14 = (fxo.b)var10_12;
                        $$14 = var14_16 = var12_14.a();
                        if (!$$13) continue block15;
                        $$15 = $$0.g.get($$12);
                        GL32.glBindBufferRange((int)35345, (int)$$14, (int)((fxa)$$15.buffer()).d, (long)$$15.offset(), (long)$$15.length());
                        continue block15;
                    }
                    case 1: {
                        var14_18 = (fxo.c)var10_12;
                        $$16 = var19_23 = var14_18.a();
                        $$17 = var19_23 = var14_18.b();
                        $$18 = var19_24 = var14_18.c();
                        $$19 = var19_25 = var14_18.d();
                        if (!$$10 && !$$13) ** GOTO lbl75
                        GlStateManager._glUniform1i($$16, $$17);
lbl75:
                        // 2 sources

                        GlStateManager._activeTexture(33984 + $$17);
                        GL11C.glBindTexture((int)35882, (int)$$19);
                        if (!$$13) continue block15;
                        $$20 = $$0.g.get($$12);
                        GL31.glTexBuffer((int)35882, (int)GlConst.toGlInternalId($$18), (int)((fxa)$$20.buffer()).d);
                        continue block15;
                    }
                    case 2: 
                }
                var19_27 = (fxo.a)var10_12;
                $$21 = var22_31 = var19_27.a();
                $$22 = var22_31 = var19_27.b();
                $$23 = $$0.h.get($$12);
                if ($$23 == null) continue;
                $$24 = $$23.a();
                if (!$$10 && !$$13) break block35;
                GlStateManager._glUniform1i($$21, $$22);
            }
            GlStateManager._activeTexture(33984 + $$22);
            $$25 = $$24.a();
            if (($$25.usage() & 16) != 0) {
                $$26 = 34067;
                GL11.glBindTexture((int)34067, (int)$$25.a);
            } else {
                $$27 = 3553;
                GlStateManager._bindTexture($$25.a);
            }
            GL33C.glBindSampler((int)$$22, (int)$$23.b().a());
            GlStateManager._texParameter($$27, 33084, $$24.baseMipLevel());
            GlStateManager._texParameter($$27, 33085, $$24.baseMipLevel() + $$24.mipLevels() - 1);
        }
        $$0.i.clear();
        if ($$0.b()) {
            GlStateManager._enableScissorTest();
            GlStateManager._scissorBox($$0.c(), $$0.d(), $$0.e(), $$0.f());
        } else {
            GlStateManager._disableScissorTest();
        }
        return true;
        catch (Throwable var6_8) {
            throw new MatchException(var6_8.toString(), var6_8);
        }
    }

    private void a(RenderPipeline $$0) {
        if (this.e == $$0) {
            return;
        }
        this.e = $$0;
        if ($$0.getDepthTestFunction() != DepthTestFunction.NO_DEPTH_TEST) {
            GlStateManager._enableDepthTest();
            GlStateManager._depthFunc(GlConst.toGl($$0.getDepthTestFunction()));
        } else {
            GlStateManager._disableDepthTest();
        }
        if ($$0.isCull()) {
            GlStateManager._enableCull();
        } else {
            GlStateManager._disableCull();
        }
        if ($$0.getBlendFunction().isPresent()) {
            GlStateManager._enableBlend();
            BlendFunction $$1 = $$0.getBlendFunction().get();
            GlStateManager._blendFuncSeparate(GlConst.toGl($$1.sourceColor()), GlConst.toGl($$1.destColor()), GlConst.toGl($$1.sourceAlpha()), GlConst.toGl($$1.destAlpha()));
        } else {
            GlStateManager._disableBlend();
        }
        GlStateManager._polygonMode(1032, GlConst.toGl($$0.getPolygonMode()));
        GlStateManager._depthMask($$0.isWriteDepth());
        GlStateManager._colorMask($$0.isWriteColor(), $$0.isWriteColor(), $$0.isWriteColor(), $$0.isWriteAlpha());
        if ($$0.getDepthBiasConstant() != 0.0f || $$0.getDepthBiasScaleFactor() != 0.0f) {
            GlStateManager._polygonOffset($$0.getDepthBiasScaleFactor(), $$0.getDepthBiasConstant());
            GlStateManager._enablePolygonOffset();
        } else {
            GlStateManager._disablePolygonOffset();
        }
        switch ($$0.getColorLogic()) {
            case NONE: {
                GlStateManager._disableColorLogicOp();
                break;
            }
            case OR_REVERSE: {
                GlStateManager._enableColorLogicOp();
                GlStateManager._logicOp(5387);
            }
        }
    }

    public void a() {
        this.f = false;
        GlStateManager._glBindFramebuffer(36160, 0);
        this.b.a().a();
    }

    protected fxe b() {
        return this.b;
    }

    @Override
    public GpuQuery timerQueryBegin() {
        RenderSystem.assertOnRenderThread();
        if (this.h != null) {
            throw new IllegalStateException("A GL_TIME_ELAPSED query is already active");
        }
        int $$0 = GL32C.glGenQueries();
        GL32C.glBeginQuery((int)35007, (int)$$0);
        this.h = new fxn($$0);
        return this.h;
    }

    @Override
    public void timerQueryEnd(GpuQuery $$0) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != this.h) {
            throw new IllegalStateException("Mismatched or duplicate GpuQuery when ending timerQuery");
        }
        GL32C.glEndQuery((int)35007);
        this.h = null;
    }
}

