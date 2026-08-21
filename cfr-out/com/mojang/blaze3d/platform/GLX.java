/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.Version
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallback
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.glfw.GLFWVidMode
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 *  oshi.SystemInfo
 *  oshi.hardware.CentralProcessor
 */
package com.mojang.blaze3d.platform;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.lwjgl.Version;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

@fwa
public class GLX {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static @Nullable String cpuInfo;

    public static int _getRefreshRate(fyk $$0) {
        RenderSystem.assertOnRenderThread();
        long $$1 = GLFW.glfwGetWindowMonitor((long)$$0.h());
        if ($$1 == 0L) {
            $$1 = GLFW.glfwGetPrimaryMonitor();
        }
        GLFWVidMode $$2 = $$1 == 0L ? null : GLFW.glfwGetVideoMode((long)$$1);
        return $$2 == null ? 0 : $$2.refreshRate();
    }

    public static String _getLWJGLVersion() {
        return Version.getVersion();
    }

    /*
     * WARNING - void declaration
     */
    public static LongSupplier _initGlfw() {
        void $$4;
        fyk.a(($$0, $$1) -> {
            throw new IllegalStateException(String.format(Locale.ROOT, "GLFW error before init: [0x%X]%s", $$0, $$1));
        });
        ArrayList $$02 = Lists.newArrayList();
        GLFWErrorCallback $$12 = GLFW.glfwSetErrorCallback(($$1, $$2) -> {
            String $$3 = $$2 == 0L ? "" : MemoryUtil.memUTF8((long)$$2);
            $$02.add(String.format(Locale.ROOT, "GLFW error during init: [0x%X]%s", $$1, $$3));
        });
        if (GLFW.glfwInit()) {
            LongSupplier $$22 = () -> (long)(GLFW.glfwGetTime() * 1.0E9);
            for (String $$3 : $$02) {
                LOGGER.error("GLFW error collected during initialization: {}", (Object)$$3);
            }
        } else {
            throw new IllegalStateException("Failed to initialize GLFW, errors: " + Joiner.on((String)",").join((Iterable)$$02));
        }
        RenderSystem.setErrorCallback((GLFWErrorCallbackI)$$12);
        return $$4;
    }

    public static void _setGlfwErrorCallback(GLFWErrorCallbackI $$0) {
        GLFWErrorCallback $$1 = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)$$0);
        if ($$1 != null) {
            $$1.free();
        }
    }

    public static boolean _shouldClose(fyk $$0) {
        return GLFW.glfwWindowShouldClose((long)$$0.h());
    }

    public static String _getCpuInfo() {
        if (cpuInfo == null) {
            cpuInfo = "<unknown>";
            try {
                CentralProcessor $$0 = new SystemInfo().getHardware().getProcessor();
                cpuInfo = String.format(Locale.ROOT, "%dx %s", $$0.getLogicalProcessorCount(), $$0.getProcessorIdentifier().getName()).replaceAll("\\s+", " ");
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return cpuInfo;
    }

    public static <T> T make(Supplier<T> $$0) {
        return $$0.get();
    }

    public static <T> T make(T $$0, Consumer<T> $$1) {
        $$1.accept($$0);
        return $$0;
    }
}

