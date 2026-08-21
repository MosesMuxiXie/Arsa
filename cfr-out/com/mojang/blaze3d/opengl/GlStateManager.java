/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.Plot
 *  com.mojang.jtracy.TracyClient
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL20C
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GL32
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 */
package com.mojang.blaze3d.opengl;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.jtracy.Plot;
import com.mojang.jtracy.TracyClient;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL32;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

@fwa
public class GlStateManager {
    private static final Plot PLOT_TEXTURES = TracyClient.createPlot((String)"GPU Textures");
    private static int numTextures = 0;
    private static final Plot PLOT_BUFFERS = TracyClient.createPlot((String)"GPU Buffers");
    private static int numBuffers = 0;
    private static final a BLEND = new a();
    private static final f DEPTH = new f();
    private static final e CULL = new e();
    private static final g POLY_OFFSET = new g();
    private static final c COLOR_LOGIC = new c();
    private static final h SCISSOR = new h();
    private static int activeTexture;
    private static final int TEXTURE_COUNT = 12;
    private static final i[] TEXTURES;
    private static final d COLOR_MASK;
    private static int readFbo;
    private static int writeFbo;

    public static void _disableScissorTest() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.SCISSOR.a.a();
    }

    public static void _enableScissorTest() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.SCISSOR.a.b();
    }

    public static void _scissorBox(int $$0, int $$1, int $$2, int $$3) {
        RenderSystem.assertOnRenderThread();
        GL20.glScissor((int)$$0, (int)$$1, (int)$$2, (int)$$3);
    }

    public static void _disableDepthTest() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.DEPTH.a.a();
    }

    public static void _enableDepthTest() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.DEPTH.a.b();
    }

    public static void _depthFunc(int $$0) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.DEPTH.c) {
            GlStateManager.DEPTH.c = $$0;
            GL11.glDepthFunc((int)$$0);
        }
    }

    public static void _depthMask(boolean $$0) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.DEPTH.b) {
            GlStateManager.DEPTH.b = $$0;
            GL11.glDepthMask((boolean)$$0);
        }
    }

    public static void _disableBlend() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.BLEND.a.a();
    }

    public static void _enableBlend() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.BLEND.a.b();
    }

    public static void _blendFuncSeparate(int $$0, int $$1, int $$2, int $$3) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.BLEND.b || $$1 != GlStateManager.BLEND.c || $$2 != GlStateManager.BLEND.d || $$3 != GlStateManager.BLEND.e) {
            GlStateManager.BLEND.b = $$0;
            GlStateManager.BLEND.c = $$1;
            GlStateManager.BLEND.d = $$2;
            GlStateManager.BLEND.e = $$3;
            GlStateManager.glBlendFuncSeparate($$0, $$1, $$2, $$3);
        }
    }

    public static int glGetProgrami(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetProgrami((int)$$0, (int)$$1);
    }

    public static void glAttachShader(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glAttachShader((int)$$0, (int)$$1);
    }

    public static void glDeleteShader(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glDeleteShader((int)$$0);
    }

    public static int glCreateShader(int $$0) {
        RenderSystem.assertOnRenderThread();
        return GL20.glCreateShader((int)$$0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void glShaderSource(int $$0, String $$1) {
        RenderSystem.assertOnRenderThread();
        byte[] $$2 = $$1.getBytes(StandardCharsets.UTF_8);
        ByteBuffer $$3 = MemoryUtil.memAlloc((int)($$2.length + 1));
        $$3.put($$2);
        $$3.put((byte)0);
        $$3.flip();
        try (MemoryStack $$4 = MemoryStack.stackPush();){
            PointerBuffer $$5 = $$4.mallocPointer(1);
            $$5.put($$3);
            GL20C.nglShaderSource((int)$$0, (int)1, (long)$$5.address0(), (long)0L);
        }
        finally {
            MemoryUtil.memFree((Buffer)$$3);
        }
    }

    public static void glCompileShader(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glCompileShader((int)$$0);
    }

    public static int glGetShaderi(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetShaderi((int)$$0, (int)$$1);
    }

    public static void _glUseProgram(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glUseProgram((int)$$0);
    }

    public static int glCreateProgram() {
        RenderSystem.assertOnRenderThread();
        return GL20.glCreateProgram();
    }

    public static void glDeleteProgram(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glDeleteProgram((int)$$0);
    }

    public static void glLinkProgram(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glLinkProgram((int)$$0);
    }

    public static int _glGetUniformLocation(int $$0, CharSequence $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetUniformLocation((int)$$0, (CharSequence)$$1);
    }

    public static void _glUniform1i(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform1i((int)$$0, (int)$$1);
    }

    public static void _glBindAttribLocation(int $$0, int $$1, CharSequence $$2) {
        RenderSystem.assertOnRenderThread();
        GL20.glBindAttribLocation((int)$$0, (int)$$1, (CharSequence)$$2);
    }

    public static void incrementTrackedBuffers() {
        PLOT_BUFFERS.setValue((double)(++numBuffers));
    }

    public static int _glGenBuffers() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.incrementTrackedBuffers();
        return GL15.glGenBuffers();
    }

    public static int _glGenVertexArrays() {
        RenderSystem.assertOnRenderThread();
        return GL30.glGenVertexArrays();
    }

    public static void _glBindBuffer(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        GL15.glBindBuffer((int)$$0, (int)$$1);
    }

    public static void _glBindVertexArray(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL30.glBindVertexArray((int)$$0);
    }

    public static void _glBufferData(int $$0, ByteBuffer $$1, int $$2) {
        RenderSystem.assertOnRenderThread();
        GL15.glBufferData((int)$$0, (ByteBuffer)$$1, (int)$$2);
    }

    public static void _glBufferSubData(int $$0, long $$1, ByteBuffer $$2) {
        RenderSystem.assertOnRenderThread();
        GL15.glBufferSubData((int)$$0, (long)$$1, (ByteBuffer)$$2);
    }

    public static void _glBufferData(int $$0, long $$1, int $$2) {
        RenderSystem.assertOnRenderThread();
        GL15.glBufferData((int)$$0, (long)$$1, (int)$$2);
    }

    public static @Nullable ByteBuffer _glMapBufferRange(int $$0, long $$1, long $$2, int $$3) {
        RenderSystem.assertOnRenderThread();
        return GL30.glMapBufferRange((int)$$0, (long)$$1, (long)$$2, (int)$$3);
    }

    public static void _glUnmapBuffer(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL15.glUnmapBuffer((int)$$0);
    }

    public static void _glDeleteBuffers(int $$0) {
        RenderSystem.assertOnRenderThread();
        PLOT_BUFFERS.setValue((double)(--numBuffers));
        GL15.glDeleteBuffers((int)$$0);
    }

    public static void _glBindFramebuffer(int $$0, int $$1) {
        if (($$0 == 36008 || $$0 == 36160) && readFbo != $$1) {
            GL30.glBindFramebuffer((int)36008, (int)$$1);
            readFbo = $$1;
        }
        if (($$0 == 36009 || $$0 == 36160) && writeFbo != $$1) {
            GL30.glBindFramebuffer((int)36009, (int)$$1);
            writeFbo = $$1;
        }
    }

    public static int getFrameBuffer(int $$0) {
        if ($$0 == 36008) {
            return readFbo;
        }
        if ($$0 == 36009) {
            return writeFbo;
        }
        return 0;
    }

    public static void _glBlitFrameBuffer(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
        RenderSystem.assertOnRenderThread();
        GL30.glBlitFramebuffer((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (int)$$6, (int)$$7, (int)$$8, (int)$$9);
    }

    public static void _glDeleteFramebuffers(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL30.glDeleteFramebuffers((int)$$0);
        if (readFbo == $$0) {
            readFbo = 0;
        }
        if (writeFbo == $$0) {
            writeFbo = 0;
        }
    }

    public static int glGenFramebuffers() {
        RenderSystem.assertOnRenderThread();
        return GL30.glGenFramebuffers();
    }

    public static void _glFramebufferTexture2D(int $$0, int $$1, int $$2, int $$3, int $$4) {
        RenderSystem.assertOnRenderThread();
        GL30.glFramebufferTexture2D((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4);
    }

    public static void glBlendFuncSeparate(int $$0, int $$1, int $$2, int $$3) {
        RenderSystem.assertOnRenderThread();
        GL14.glBlendFuncSeparate((int)$$0, (int)$$1, (int)$$2, (int)$$3);
    }

    public static String glGetShaderInfoLog(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetShaderInfoLog((int)$$0, (int)$$1);
    }

    public static String glGetProgramInfoLog(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetProgramInfoLog((int)$$0, (int)$$1);
    }

    public static void _enableCull() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.CULL.a.b();
    }

    public static void _disableCull() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.CULL.a.a();
    }

    public static void _polygonMode(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        GL11.glPolygonMode((int)$$0, (int)$$1);
    }

    public static void _enablePolygonOffset() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.POLY_OFFSET.a.b();
    }

    public static void _disablePolygonOffset() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.POLY_OFFSET.a.a();
    }

    public static void _polygonOffset(float $$0, float $$1) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.POLY_OFFSET.b || $$1 != GlStateManager.POLY_OFFSET.c) {
            GlStateManager.POLY_OFFSET.b = $$0;
            GlStateManager.POLY_OFFSET.c = $$1;
            GL11.glPolygonOffset((float)$$0, (float)$$1);
        }
    }

    public static void _enableColorLogicOp() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.COLOR_LOGIC.a.b();
    }

    public static void _disableColorLogicOp() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.COLOR_LOGIC.a.a();
    }

    public static void _logicOp(int $$0) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.COLOR_LOGIC.b) {
            GlStateManager.COLOR_LOGIC.b = $$0;
            GL11.glLogicOp((int)$$0);
        }
    }

    public static void _activeTexture(int $$0) {
        RenderSystem.assertOnRenderThread();
        if (activeTexture != $$0 - 33984) {
            activeTexture = $$0 - 33984;
            GL13.glActiveTexture((int)$$0);
        }
    }

    public static void _texParameter(int $$0, int $$1, int $$2) {
        RenderSystem.assertOnRenderThread();
        GL11.glTexParameteri((int)$$0, (int)$$1, (int)$$2);
    }

    public static int _getTexLevelParameter(int $$0, int $$1, int $$2) {
        return GL11.glGetTexLevelParameteri((int)$$0, (int)$$1, (int)$$2);
    }

    public static int _genTexture() {
        RenderSystem.assertOnRenderThread();
        PLOT_TEXTURES.setValue((double)(++numTextures));
        return GL11.glGenTextures();
    }

    public static void _deleteTexture(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL11.glDeleteTextures((int)$$0);
        for (i $$1 : TEXTURES) {
            if ($$1.a != $$0) continue;
            $$1.a = -1;
        }
        PLOT_TEXTURES.setValue((double)(--numTextures));
    }

    public static void _bindTexture(int $$0) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.TEXTURES[GlStateManager.activeTexture].a) {
            GlStateManager.TEXTURES[GlStateManager.activeTexture].a = $$0;
            GL11.glBindTexture((int)3553, (int)$$0);
        }
    }

    public static void _texImage2D(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, @Nullable ByteBuffer $$8) {
        RenderSystem.assertOnRenderThread();
        GL11.glTexImage2D((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (int)$$6, (int)$$7, (ByteBuffer)$$8);
    }

    public static void _texSubImage2D(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, long $$8) {
        RenderSystem.assertOnRenderThread();
        GL11.glTexSubImage2D((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (int)$$6, (int)$$7, (long)$$8);
    }

    public static void _texSubImage2D(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, ByteBuffer $$8) {
        RenderSystem.assertOnRenderThread();
        GL11.glTexSubImage2D((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (int)$$6, (int)$$7, (ByteBuffer)$$8);
    }

    public static void _viewport(int $$0, int $$1, int $$2, int $$3) {
        GL11.glViewport((int)$$0, (int)$$1, (int)$$2, (int)$$3);
    }

    public static void _colorMask(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
        RenderSystem.assertOnRenderThread();
        if ($$0 != GlStateManager.COLOR_MASK.a || $$1 != GlStateManager.COLOR_MASK.b || $$2 != GlStateManager.COLOR_MASK.c || $$3 != GlStateManager.COLOR_MASK.d) {
            GlStateManager.COLOR_MASK.a = $$0;
            GlStateManager.COLOR_MASK.b = $$1;
            GlStateManager.COLOR_MASK.c = $$2;
            GlStateManager.COLOR_MASK.d = $$3;
            GL11.glColorMask((boolean)$$0, (boolean)$$1, (boolean)$$2, (boolean)$$3);
        }
    }

    public static void _clear(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL11.glClear((int)$$0);
        if (fye.a) {
            GlStateManager._getError();
        }
    }

    public static void _vertexAttribPointer(int $$0, int $$1, int $$2, boolean $$3, int $$4, long $$5) {
        RenderSystem.assertOnRenderThread();
        GL20.glVertexAttribPointer((int)$$0, (int)$$1, (int)$$2, (boolean)$$3, (int)$$4, (long)$$5);
    }

    public static void _vertexAttribIPointer(int $$0, int $$1, int $$2, int $$3, long $$4) {
        RenderSystem.assertOnRenderThread();
        GL30.glVertexAttribIPointer((int)$$0, (int)$$1, (int)$$2, (int)$$3, (long)$$4);
    }

    public static void _enableVertexAttribArray(int $$0) {
        RenderSystem.assertOnRenderThread();
        GL20.glEnableVertexAttribArray((int)$$0);
    }

    public static void _drawElements(int $$0, int $$1, int $$2, long $$3) {
        RenderSystem.assertOnRenderThread();
        GL11.glDrawElements((int)$$0, (int)$$1, (int)$$2, (long)$$3);
    }

    public static void _drawArrays(int $$0, int $$1, int $$2) {
        RenderSystem.assertOnRenderThread();
        GL11.glDrawArrays((int)$$0, (int)$$1, (int)$$2);
    }

    public static void _pixelStore(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        GL11.glPixelStorei((int)$$0, (int)$$1);
    }

    public static void _readPixels(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, long $$6) {
        RenderSystem.assertOnRenderThread();
        GL11.glReadPixels((int)$$0, (int)$$1, (int)$$2, (int)$$3, (int)$$4, (int)$$5, (long)$$6);
    }

    public static int _getError() {
        RenderSystem.assertOnRenderThread();
        return GL11.glGetError();
    }

    public static void clearGlErrors() {
        RenderSystem.assertOnRenderThread();
        while (GL11.glGetError() != 0) {
        }
    }

    public static String _getString(int $$0) {
        RenderSystem.assertOnRenderThread();
        return GL11.glGetString((int)$$0);
    }

    public static int _getInteger(int $$0) {
        RenderSystem.assertOnRenderThread();
        return GL11.glGetInteger((int)$$0);
    }

    public static long _glFenceSync(int $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        return GL32.glFenceSync((int)$$0, (int)$$1);
    }

    public static int _glClientWaitSync(long $$0, int $$1, long $$2) {
        RenderSystem.assertOnRenderThread();
        return GL32.glClientWaitSync((long)$$0, (int)$$1, (long)$$2);
    }

    public static void _glDeleteSync(long $$0) {
        RenderSystem.assertOnRenderThread();
        GL32.glDeleteSync((long)$$0);
    }

    static {
        TEXTURES = (i[])IntStream.range(0, 12).mapToObj($$0 -> new i()).toArray(i[]::new);
        COLOR_MASK = new d();
    }

    static class h {
        public final b a = new b(3089);

        h() {
        }
    }

    static class b {
        private final int a;
        private boolean b;

        public b(int $$0) {
            this.a = $$0;
        }

        public void a() {
            this.a(false);
        }

        public void b() {
            this.a(true);
        }

        public void a(boolean $$0) {
            RenderSystem.assertOnRenderThread();
            if ($$0 != this.b) {
                this.b = $$0;
                if ($$0) {
                    GL11.glEnable((int)this.a);
                } else {
                    GL11.glDisable((int)this.a);
                }
            }
        }
    }

    static class f {
        public final b a = new b(2929);
        public boolean b = true;
        public int c = 513;

        f() {
        }
    }

    static class a {
        public final b a = new b(3042);
        public int b = 1;
        public int c = 0;
        public int d = 1;
        public int e = 0;

        a() {
        }
    }

    static class e {
        public final b a = new b(2884);

        e() {
        }
    }

    static class g {
        public final b a = new b(32823);
        public float b;
        public float c;

        g() {
        }
    }

    static class c {
        public final b a = new b(3058);
        public int b = 5379;

        c() {
        }
    }

    static class i {
        public int a;

        i() {
        }
    }

    static class d {
        public boolean a = true;
        public boolean b = true;
        public boolean c = true;
        public boolean d = true;

        d() {
        }
    }
}

