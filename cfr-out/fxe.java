/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLCapabilities
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.slf4j.Logger;

public class fxe
implements GpuDevice {
    private static final Logger g = LogUtils.getLogger();
    protected static boolean a = true;
    protected static boolean b = true;
    protected static boolean c = true;
    protected static boolean d = true;
    protected static boolean e = true;
    protected static boolean f = true;
    private final CommandEncoder h;
    private final @Nullable fxc i;
    private final fxd j;
    private final int k;
    private final fwz l;
    private final fyy m;
    private final Map<RenderPipeline, fxi> n = new IdentityHashMap<RenderPipeline, fxi>();
    private final Map<a, fxk> o = new HashMap<a, fxk>();
    private final fxp p;
    private final fwy q;
    private final Set<String> r = new HashSet<String>();
    private final int s;
    private final int t;

    public fxe(long $$0, int $$1, boolean $$2, fyy $$3, boolean $$4) {
        GLFW.glfwMakeContextCurrent((long)$$0);
        GLCapabilities $$5 = GL.createCapabilities();
        int $$6 = fxe.e();
        GLFW.glfwSetWindowSizeLimits((long)$$0, (int)-1, (int)-1, (int)$$6, (int)$$6);
        fwc $$7 = fwc.a(this);
        this.i = fxc.a($$1, $$2, this.r);
        this.j = fxd.a($$5, $$4, this.r);
        this.p = fxp.a($$5, this.j, this.r);
        this.q = fwy.a($$5, this.r);
        this.l = fwz.a($$5, this.r, $$7);
        this.k = $$6;
        this.m = $$3;
        this.h = new fxb(this);
        this.s = GL11.glGetInteger((int)35380);
        GL11.glEnable((int)34895);
        GL11.glEnable((int)34370);
        if ($$5.GL_EXT_texture_filter_anisotropic) {
            this.t = bgj.b(GL11.glGetFloat((int)34047));
            this.r.add("GL_EXT_texture_filter_anisotropic");
        } else {
            this.t = 1;
        }
    }

    public fxd a() {
        return this.j;
    }

    @Override
    public CommandEncoder createCommandEncoder() {
        return this.h;
    }

    @Override
    public int getMaxSupportedAnisotropy() {
        return this.t;
    }

    @Override
    public fzf createSampler(AddressMode $$0, AddressMode $$1, FilterMode $$2, FilterMode $$3, int $$4, OptionalDouble $$5) {
        if ($$4 < 1 || $$4 > this.t) {
            throw new IllegalArgumentException("maxAnisotropy out of range; must be >= 1 and <= " + this.getMaxSupportedAnisotropy() + ", but was " + $$4);
        }
        return new fxj($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public GpuTexture createTexture(@Nullable Supplier<String> $$0, @GpuTexture.a int $$1, TextureFormat $$2, int $$3, int $$4, int $$5, int $$6) {
        return this.createTexture(this.j.b() && $$0 != null ? $$0.get() : null, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    @Override
    public GpuTexture createTexture(@Nullable String $$0, @GpuTexture.a int $$1, TextureFormat $$2, int $$3, int $$4, int $$5, int $$6) {
        int $$14;
        int $$10;
        boolean $$7;
        if ($$6 < 1) {
            throw new IllegalArgumentException("mipLevels must be at least 1");
        }
        if ($$5 < 1) {
            throw new IllegalArgumentException("depthOrLayers must be at least 1");
        }
        boolean bl2 = $$7 = ($$1 & 0x10) != 0;
        if ($$7) {
            if ($$3 != $$4) {
                throw new IllegalArgumentException("Cubemap compatible textures must be square, but size is " + $$3 + "x" + $$4);
            }
            if ($$5 % 6 != 0) {
                throw new IllegalArgumentException("Cubemap compatible textures must have a layer count with a multiple of 6, was " + $$5);
            }
            if ($$5 > 6) {
                throw new UnsupportedOperationException("Array textures are not yet supported");
            }
        } else if ($$5 > 1) {
            throw new UnsupportedOperationException("Array or 3D textures are not yet supported");
        }
        GlStateManager.clearGlErrors();
        int $$8 = GlStateManager._genTexture();
        if ($$0 == null) {
            $$0 = String.valueOf($$8);
        }
        if ($$7) {
            GL11.glBindTexture((int)34067, (int)$$8);
            int $$9 = 34067;
        } else {
            GlStateManager._bindTexture($$8);
            $$10 = 3553;
        }
        GlStateManager._texParameter($$10, 33085, $$6 - 1);
        GlStateManager._texParameter($$10, 33082, 0);
        GlStateManager._texParameter($$10, 33083, $$6 - 1);
        if ($$2.hasDepthAspect()) {
            GlStateManager._texParameter($$10, 34892, 0);
        }
        if ($$7) {
            for (int $$11 : GlConst.CUBEMAP_TARGETS) {
                for (int $$12 = 0; $$12 < $$6; ++$$12) {
                    GlStateManager._texImage2D($$11, $$12, GlConst.toGlInternalId($$2), $$3 >> $$12, $$4 >> $$12, 0, GlConst.toGlExternalId($$2), GlConst.toGlType($$2), null);
                }
            }
        } else {
            for (int $$13 = 0; $$13 < $$6; ++$$13) {
                GlStateManager._texImage2D($$10, $$13, GlConst.toGlInternalId($$2), $$3 >> $$13, $$4 >> $$13, 0, GlConst.toGlExternalId($$2), GlConst.toGlType($$2), null);
            }
        }
        if (($$14 = GlStateManager._getError()) == 1285) {
            throw new fwb("Could not allocate texture of " + $$3 + "x" + $$4 + " for " + $$0);
        }
        if ($$14 != 0) {
            throw new IllegalStateException("OpenGL error " + $$14);
        }
        fxl $$15 = new fxl($$1, $$0, $$2, $$3, $$4, $$5, $$6, $$8);
        this.j.a($$15);
        return $$15;
    }

    @Override
    public GpuTextureView createTextureView(GpuTexture $$0) {
        return this.createTextureView($$0, 0, $$0.getMipLevels());
    }

    @Override
    public GpuTextureView createTextureView(GpuTexture $$0, int $$1, int $$2) {
        if ($$0.isClosed()) {
            throw new IllegalArgumentException("Can't create texture view with closed texture");
        }
        if ($$1 < 0 || $$1 + $$2 > $$0.getMipLevels()) {
            throw new IllegalArgumentException($$2 + " mip levels starting from " + $$1 + " would be out of range for texture with only " + $$0.getMipLevels() + " mip levels");
        }
        return new fxm((fxl)$$0, $$1, $$2);
    }

    @Override
    public GpuBuffer createBuffer(@Nullable Supplier<String> $$0, @GpuBuffer.a int $$1, long $$2) {
        if ($$2 <= 0L) {
            throw new IllegalArgumentException("Buffer size must be greater than zero");
        }
        GlStateManager.clearGlErrors();
        fxa $$3 = this.q.a(this.l, $$0, $$1, $$2);
        int $$4 = GlStateManager._getError();
        if ($$4 == 1285) {
            throw new fwb("Could not allocate buffer of " + $$2 + " for " + String.valueOf($$0));
        }
        if ($$4 != 0) {
            throw new IllegalStateException("OpenGL error " + $$4);
        }
        this.j.a($$3);
        return $$3;
    }

    @Override
    public GpuBuffer createBuffer(@Nullable Supplier<String> $$0, @GpuBuffer.a int $$1, ByteBuffer $$2) {
        if (!$$2.hasRemaining()) {
            throw new IllegalArgumentException("Buffer source must not be empty");
        }
        GlStateManager.clearGlErrors();
        long $$3 = $$2.remaining();
        fxa $$4 = this.q.a(this.l, $$0, $$1, $$2);
        int $$5 = GlStateManager._getError();
        if ($$5 == 1285) {
            throw new fwb("Could not allocate buffer of " + $$3 + " for " + String.valueOf($$0));
        }
        if ($$5 != 0) {
            throw new IllegalStateException("OpenGL error " + $$5);
        }
        this.j.a($$4);
        return $$4;
    }

    @Override
    public String getImplementationInformation() {
        if (GLFW.glfwGetCurrentContext() == 0L) {
            return "NO CONTEXT";
        }
        return GlStateManager._getString(7937) + " GL version " + GlStateManager._getString(7938) + ", " + GlStateManager._getString(7936);
    }

    @Override
    public List<String> getLastDebugMessages() {
        return this.i == null ? Collections.emptyList() : this.i.a();
    }

    @Override
    public boolean isDebuggingEnabled() {
        return this.i != null;
    }

    @Override
    public String getRenderer() {
        return GlStateManager._getString(7937);
    }

    @Override
    public String getVendor() {
        return GlStateManager._getString(7936);
    }

    @Override
    public String getBackendName() {
        return "OpenGL";
    }

    @Override
    public String getVersion() {
        return GlStateManager._getString(7938);
    }

    private static int e() {
        int $$0 = GlStateManager._getInteger(3379);
        for (int $$1 = Math.max(32768, $$0); $$1 >= 1024; $$1 >>= 1) {
            GlStateManager._texImage2D(32868, 0, 6408, $$1, $$1, 0, 6408, 5121, null);
            int $$2 = GlStateManager._getTexLevelParameter(32868, 0, 4096);
            if ($$2 == 0) continue;
            return $$1;
        }
        int $$3 = Math.max($$0, 1024);
        g.info("Failed to determine maximum texture size by probing, trying GL_MAX_TEXTURE_SIZE = {}", (Object)$$3);
        return $$3;
    }

    @Override
    public int getMaxTextureSize() {
        return this.k;
    }

    @Override
    public int getUniformOffsetAlignment() {
        return this.s;
    }

    @Override
    public void clearPipelineCache() {
        for (fxi $$0 : this.n.values()) {
            if ($$0.b() == fxg.b) continue;
            $$0.b().close();
        }
        this.n.clear();
        for (fxk $$1 : this.o.values()) {
            if ($$1 == fxk.a) continue;
            $$1.close();
        }
        this.o.clear();
        String $$2 = GlStateManager._getString(7937);
        if ($$2.contains("AMD")) {
            fxe.f();
        }
    }

    private static void f() {
        int $$0 = GlStateManager.glCreateShader(35633);
        int $$1 = GlStateManager.glCreateProgram();
        GlStateManager.glAttachShader($$1, $$0);
        GlStateManager.glDeleteShader($$0);
        GlStateManager.glDeleteProgram($$1);
    }

    @Override
    public List<String> getEnabledExtensions() {
        return new ArrayList<String>(this.r);
    }

    @Override
    public void close() {
        this.clearPipelineCache();
    }

    public fwz b() {
        return this.l;
    }

    protected fxi a(RenderPipeline $$02) {
        return this.n.computeIfAbsent($$02, $$0 -> this.c((RenderPipeline)$$0, this.m));
    }

    protected fxk a(amo $$0, ShaderType $$12, hpg $$2, fyy $$3) {
        a $$4 = new a($$0, $$12, $$2);
        return this.o.computeIfAbsent($$4, $$1 -> this.a((a)$$1, $$3));
    }

    public fxi a(RenderPipeline $$0, @Nullable fyy $$12) {
        fyy $$2 = $$12 == null ? this.m : $$12;
        return this.n.computeIfAbsent($$0, $$1 -> this.c((RenderPipeline)$$1, $$2));
    }

    private fxk a(a $$0, fyy $$1) {
        String $$2 = $$1.get($$0.a, $$0.b);
        if ($$2 == null) {
            g.error("Couldn't find source for {} shader ({})", (Object)$$0.b, (Object)$$0.a);
            return fxk.a;
        }
        String $$3 = fyq.a($$2, $$0.c);
        int $$4 = GlStateManager.glCreateShader(GlConst.toGl($$0.b));
        GlStateManager.glShaderSource($$4, $$3);
        GlStateManager.glCompileShader($$4);
        if (GlStateManager.glGetShaderi($$4, 35713) == 0) {
            String $$5 = StringUtils.trim((String)GlStateManager.glGetShaderInfoLog($$4, 32768));
            g.error("Couldn't compile {} shader ({}): {}", new Object[]{$$0.b.getName(), $$0.a, $$5});
            return fxk.a;
        }
        fxk $$6 = new fxk($$4, $$0.a, $$0.b);
        this.j.a($$6);
        return $$6;
    }

    private fxg b(RenderPipeline $$0, fyy $$1) {
        fxk $$2 = this.a($$0.getVertexShader(), ShaderType.VERTEX, $$0.getShaderDefines(), $$1);
        fxk $$3 = this.a($$0.getFragmentShader(), ShaderType.FRAGMENT, $$0.getShaderDefines(), $$1);
        if ($$2 == fxk.a) {
            g.error("Couldn't compile pipeline {}: vertex shader {} was invalid", (Object)$$0.getLocation(), (Object)$$0.getVertexShader());
            return fxg.b;
        }
        if ($$3 == fxk.a) {
            g.error("Couldn't compile pipeline {}: fragment shader {} was invalid", (Object)$$0.getLocation(), (Object)$$0.getFragmentShader());
            return fxg.b;
        }
        try {
            fxg $$4 = fxg.a($$2, $$3, $$0.getVertexFormat(), $$0.getLocation().toString());
            $$4.a($$0.getUniforms(), $$0.getSamplers());
            this.j.a($$4);
            return $$4;
        }
        catch (hph.b $$5) {
            g.error("Couldn't compile program for pipeline {}: {}", (Object)$$0.getLocation(), (Object)$$5);
            return fxg.b;
        }
    }

    private fxi c(RenderPipeline $$0, fyy $$1) {
        return new fxi($$0, this.b($$0, $$1));
    }

    public fxp c() {
        return this.p;
    }

    public fwy d() {
        return this.q;
    }

    @Override
    public /* synthetic */ CompiledRenderPipeline precompilePipeline(RenderPipeline renderPipeline, @Nullable fyy fyy2) {
        return this.a(renderPipeline, fyy2);
    }

    static final class a
    extends Record {
        final amo a;
        final ShaderType b;
        final hpg c;

        a(amo $$0, ShaderType $$1, hpg $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public String toString() {
            String $$0 = String.valueOf(this.a) + " (" + String.valueOf((Object)this.b) + ")";
            if (!this.c.c()) {
                return $$0 + " with " + String.valueOf(this.c);
            }
            return $$0;
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;type;defines", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;type;defines", "a", "b", "c"}, this, $$0);
        }

        public amo a() {
            return this.a;
        }

        public ShaderType b() {
            return this.b;
        }

        public hpg c() {
            return this.c;
        }
    }
}

