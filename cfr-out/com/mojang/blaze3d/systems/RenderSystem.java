/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.IntConsumer
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 */
package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntConsumer;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

@fwa
public class RenderSystem {
    static final Logger LOGGER = LogUtils.getLogger();
    public static final int MINIMUM_ATLAS_TEXTURE_SIZE = 1024;
    public static final int PROJECTION_MATRIX_UBO_SIZE = new Std140SizeCalculator().putMat4f().get();
    private static @Nullable Thread renderThread;
    private static @Nullable GpuDevice DEVICE;
    private static double lastDrawTime;
    private static final a sharedSequential;
    private static final a sharedSequentialQuad;
    private static final a sharedSequentialLines;
    private static fwd projectionType;
    private static fwd savedProjectionType;
    private static final Matrix4fStack modelViewStack;
    private static @Nullable GpuBufferSlice shaderFog;
    private static @Nullable GpuBufferSlice shaderLightDirections;
    private static @Nullable GpuBufferSlice projectionMatrixBuffer;
    private static @Nullable GpuBufferSlice savedProjectionMatrixBuffer;
    private static String apiDescription;
    private static final AtomicLong pollEventsWaitStart;
    private static final AtomicBoolean pollingEvents;
    private static final beo<b> PENDING_FENCES;
    public static @Nullable GpuTextureView outputColorTextureOverride;
    public static @Nullable GpuTextureView outputDepthTextureOverride;
    private static @Nullable GpuBuffer globalSettingsUniform;
    private static @Nullable hny dynamicUniforms;
    private static final fzc scissorStateForRenderTypeDraws;
    private static fzb samplerCache;

    public static fzb getSamplerCache() {
        return samplerCache;
    }

    public static void initRenderThread() {
        if (renderThread != null) {
            throw new IllegalStateException("Could not initialize render thread");
        }
        renderThread = Thread.currentThread();
    }

    public static boolean isOnRenderThread() {
        return Thread.currentThread() == renderThread;
    }

    public static void assertOnRenderThread() {
        if (!RenderSystem.isOnRenderThread()) {
            throw RenderSystem.constructThreadException();
        }
    }

    private static IllegalStateException constructThreadException() {
        return new IllegalStateException("Rendersystem called from wrong thread");
    }

    private static void pollEvents() {
        pollEventsWaitStart.set(bhs.c());
        pollingEvents.set(true);
        GLFW.glfwPollEvents();
        pollingEvents.set(false);
    }

    public static boolean isFrozenAtPollEvents() {
        return pollingEvents.get() && bhs.c() - pollEventsWaitStart.get() > 200L;
    }

    public static void flipFrame(fyk $$0, @Nullable fwf $$1) {
        RenderSystem.pollEvents();
        fzo.b().c();
        GLFW.glfwSwapBuffers((long)$$0.h());
        if ($$1 != null) {
            $$1.b();
        }
        dynamicUniforms.a();
        gfj.V().e.l();
        RenderSystem.pollEvents();
    }

    public static void limitDisplayFPS(int $$0) {
        double $$1 = lastDrawTime + 1.0 / (double)$$0;
        double $$2 = GLFW.glfwGetTime();
        while ($$2 < $$1) {
            GLFW.glfwWaitEventsTimeout((double)($$1 - $$2));
            $$2 = GLFW.glfwGetTime();
        }
        lastDrawTime = $$2;
    }

    public static void setShaderFog(GpuBufferSlice $$0) {
        shaderFog = $$0;
    }

    public static @Nullable GpuBufferSlice getShaderFog() {
        return shaderFog;
    }

    public static void setShaderLights(GpuBufferSlice $$0) {
        shaderLightDirections = $$0;
    }

    public static @Nullable GpuBufferSlice getShaderLights() {
        return shaderLightDirections;
    }

    public static void enableScissorForRenderTypeDraws(int $$0, int $$1, int $$2, int $$3) {
        scissorStateForRenderTypeDraws.a($$0, $$1, $$2, $$3);
    }

    public static void disableScissorForRenderTypeDraws() {
        scissorStateForRenderTypeDraws.a();
    }

    public static fzc getScissorStateForRenderTypeDraws() {
        return scissorStateForRenderTypeDraws;
    }

    public static String getBackendDescription() {
        return String.format(Locale.ROOT, "LWJGL version %s", GLX._getLWJGLVersion());
    }

    public static String getApiDescription() {
        return apiDescription;
    }

    public static bhm.a initBackendSystem() {
        return GLX._initGlfw()::getAsLong;
    }

    public static void initRenderer(long $$0, int $$1, boolean $$2, fyy $$3, boolean $$4) {
        DEVICE = new fxe($$0, $$1, $$2, $$3, $$4);
        apiDescription = RenderSystem.getDevice().getImplementationInformation();
        dynamicUniforms = new hny();
        samplerCache.a();
    }

    public static void setErrorCallback(GLFWErrorCallbackI $$0) {
        GLX._setGlfwErrorCallback($$0);
    }

    public static void setupDefaultState() {
        modelViewStack.clear();
    }

    public static void setProjectionMatrix(GpuBufferSlice $$0, fwd $$1) {
        RenderSystem.assertOnRenderThread();
        projectionMatrixBuffer = $$0;
        projectionType = $$1;
    }

    public static void backupProjectionMatrix() {
        RenderSystem.assertOnRenderThread();
        savedProjectionMatrixBuffer = projectionMatrixBuffer;
        savedProjectionType = projectionType;
    }

    public static void restoreProjectionMatrix() {
        RenderSystem.assertOnRenderThread();
        projectionMatrixBuffer = savedProjectionMatrixBuffer;
        projectionType = savedProjectionType;
    }

    public static @Nullable GpuBufferSlice getProjectionMatrixBuffer() {
        RenderSystem.assertOnRenderThread();
        return projectionMatrixBuffer;
    }

    public static Matrix4f getModelViewMatrix() {
        RenderSystem.assertOnRenderThread();
        return modelViewStack;
    }

    public static Matrix4fStack getModelViewStack() {
        RenderSystem.assertOnRenderThread();
        return modelViewStack;
    }

    public static a getSequentialBuffer(VertexFormat.b $$0) {
        RenderSystem.assertOnRenderThread();
        return switch ($$0) {
            case VertexFormat.b.h -> sharedSequentialQuad;
            case VertexFormat.b.a -> sharedSequentialLines;
            default -> sharedSequential;
        };
    }

    public static void setGlobalSettingsUniform(GpuBuffer $$0) {
        globalSettingsUniform = $$0;
    }

    public static @Nullable GpuBuffer getGlobalSettingsUniform() {
        return globalSettingsUniform;
    }

    public static fwd getProjectionType() {
        RenderSystem.assertOnRenderThread();
        return projectionType;
    }

    public static void queueFencedTask(Runnable $$0) {
        PENDING_FENCES.addLast(new b($$0, RenderSystem.getDevice().createCommandEncoder().createFence()));
    }

    public static void executePendingTasks() {
        b $$0 = PENDING_FENCES.peekFirst();
        while ($$0 != null) {
            if ($$0.b.awaitCompletion(0L)) {
                try {
                    $$0.a.run();
                }
                finally {
                    $$0.b.close();
                }
                PENDING_FENCES.removeFirst();
                $$0 = PENDING_FENCES.peekFirst();
                continue;
            }
            return;
        }
    }

    public static GpuDevice getDevice() {
        if (DEVICE == null) {
            throw new IllegalStateException("Can't getDevice() before it was initialized");
        }
        return DEVICE;
    }

    public static @Nullable GpuDevice tryGetDevice() {
        return DEVICE;
    }

    public static hny getDynamicUniforms() {
        if (dynamicUniforms == null) {
            throw new IllegalStateException("Can't getDynamicUniforms() before device was initialized");
        }
        return dynamicUniforms;
    }

    public static void bindDefaultUniforms(RenderPass $$0) {
        GpuBufferSlice $$4;
        GpuBuffer $$3;
        GpuBufferSlice $$2;
        GpuBufferSlice $$1 = RenderSystem.getProjectionMatrixBuffer();
        if ($$1 != null) {
            $$0.setUniform("Projection", $$1);
        }
        if (($$2 = RenderSystem.getShaderFog()) != null) {
            $$0.setUniform("Fog", $$2);
        }
        if (($$3 = RenderSystem.getGlobalSettingsUniform()) != null) {
            $$0.setUniform("Globals", $$3);
        }
        if (($$4 = RenderSystem.getShaderLights()) != null) {
            $$0.setUniform("Lighting", $$4);
        }
    }

    static {
        lastDrawTime = Double.MIN_VALUE;
        sharedSequential = new a(1, 1, java.util.function.IntConsumer::accept);
        sharedSequentialQuad = new a(4, 6, ($$0, $$1) -> {
            $$0.accept($$1);
            $$0.accept($$1 + 1);
            $$0.accept($$1 + 2);
            $$0.accept($$1 + 2);
            $$0.accept($$1 + 3);
            $$0.accept($$1);
        });
        sharedSequentialLines = new a(4, 6, ($$0, $$1) -> {
            $$0.accept($$1);
            $$0.accept($$1 + 1);
            $$0.accept($$1 + 2);
            $$0.accept($$1 + 3);
            $$0.accept($$1 + 2);
            $$0.accept($$1 + 1);
        });
        projectionType = fwd.a;
        savedProjectionType = fwd.a;
        modelViewStack = new Matrix4fStack(16);
        shaderFog = null;
        apiDescription = "Unknown";
        pollEventsWaitStart = new AtomicLong();
        pollingEvents = new AtomicBoolean(false);
        PENDING_FENCES = new beo();
        scissorStateForRenderTypeDraws = new fzc();
        samplerCache = new fzb();
    }

    public static final class com.mojang.blaze3d.systems.RenderSystem$a {
        private final int a;
        private final int b;
        private final a c;
        private @Nullable GpuBuffer d;
        private VertexFormat.a e = VertexFormat.a.a;
        private int f;

        com.mojang.blaze3d.systems.RenderSystem$a(int $$0, int $$1, a $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public boolean a(int $$0) {
            return $$0 <= this.f;
        }

        public GpuBuffer b(int $$0) {
            this.c($$0);
            return this.d;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        private void c(int $$0) {
            if (this.a($$0)) {
                return;
            }
            $$0 = bgj.e($$0 * 2, this.b);
            LOGGER.debug("Growing IndexBuffer: Old limit {}, new limit {}.", (Object)this.f, (Object)$$0);
            int $$1 = $$0 / this.b;
            int $$2 = $$1 * this.a;
            VertexFormat.a $$3 = VertexFormat.a.a($$2);
            int $$4 = bgj.e($$0 * $$3.c, 4);
            ByteBuffer $$5 = MemoryUtil.memAlloc((int)$$4);
            try {
                this.e = $$3;
                IntConsumer $$6 = this.a($$5);
                for (int $$7 = 0; $$7 < $$0; $$7 += this.b) {
                    this.c.accept($$6, $$7 * this.a / this.b);
                }
                $$5.flip();
                if (this.d != null) {
                    this.d.close();
                }
                this.d = RenderSystem.getDevice().createBuffer(() -> "Auto Storage index buffer", 64, $$5);
            }
            finally {
                MemoryUtil.memFree((Buffer)$$5);
            }
            this.f = $$0;
        }

        private IntConsumer a(ByteBuffer $$0) {
            switch (this.e) {
                case a: {
                    return $$1 -> $$0.putShort((short)$$1);
                }
            }
            return $$0::putInt;
        }

        public VertexFormat.a a() {
            return this.e;
        }

        static interface a {
            public void accept(IntConsumer var1, int var2);
        }
    }

    static final class b
    extends Record {
        final Runnable a;
        final GpuFence b;

        b(Runnable $$0, GpuFence $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "callback;fence", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "callback;fence", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "callback;fence", "a", "b"}, this, $$0);
        }

        public Runnable a() {
            return this.a;
        }

        public GpuFence b() {
            return this.b;
        }
    }
}

