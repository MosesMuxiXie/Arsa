/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWMonitorCallback
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMonitorCallback;
import org.slf4j.Logger;

public class fyi {
    private static final Logger a = LogUtils.getLogger();
    private final Long2ObjectMap<fyf> b = new Long2ObjectOpenHashMap();
    private final fyg c;

    public fyi(fyg $$0) {
        this.c = $$0;
        GLFW.glfwSetMonitorCallback(this::a);
        PointerBuffer $$1 = GLFW.glfwGetMonitors();
        if ($$1 != null) {
            for (int $$2 = 0; $$2 < $$1.limit(); ++$$2) {
                long $$3 = $$1.get($$2);
                this.b.put($$3, (Object)$$0.createMonitor($$3));
            }
        }
    }

    private void a(long $$0, int $$1) {
        RenderSystem.assertOnRenderThread();
        if ($$1 == 262145) {
            this.b.put($$0, (Object)this.c.createMonitor($$0));
            a.debug("Monitor {} connected. Current monitors: {}", (Object)$$0, this.b);
        } else if ($$1 == 262146) {
            this.b.remove($$0);
            a.debug("Monitor {} disconnected. Current monitors: {}", (Object)$$0, this.b);
        }
    }

    public @Nullable fyf a(long $$0) {
        return (fyf)this.b.get($$0);
    }

    public @Nullable fyf a(fyk $$0) {
        long $$1 = GLFW.glfwGetWindowMonitor((long)$$0.h());
        if ($$1 != 0L) {
            return this.a($$1);
        }
        int $$2 = $$0.q();
        int $$3 = $$2 + $$0.m();
        int $$4 = $$0.r();
        int $$5 = $$4 + $$0.n();
        int $$6 = -1;
        fyf $$7 = null;
        long $$8 = GLFW.glfwGetPrimaryMonitor();
        a.debug("Selecting monitor - primary: {}, current monitors: {}", (Object)$$8, this.b);
        for (fyf $$9 : this.b.values()) {
            int $$19;
            int $$10 = $$9.c();
            int $$11 = $$10 + $$9.b().a();
            int $$12 = $$9.d();
            int $$13 = $$12 + $$9.b().b();
            int $$14 = fyi.a($$2, $$10, $$11);
            int $$15 = fyi.a($$3, $$10, $$11);
            int $$16 = fyi.a($$4, $$12, $$13);
            int $$17 = fyi.a($$5, $$12, $$13);
            int $$18 = Math.max(0, $$15 - $$14);
            int $$20 = $$18 * ($$19 = Math.max(0, $$17 - $$16));
            if ($$20 > $$6) {
                $$7 = $$9;
                $$6 = $$20;
                continue;
            }
            if ($$20 != $$6 || $$8 != $$9.f()) continue;
            a.debug("Primary monitor {} is preferred to monitor {}", (Object)$$9, (Object)$$7);
            $$7 = $$9;
        }
        a.debug("Selected monitor: {}", $$7);
        return $$7;
    }

    public static int a(int $$0, int $$1, int $$2) {
        if ($$0 < $$1) {
            return $$1;
        }
        if ($$0 > $$2) {
            return $$2;
        }
        return $$0;
    }

    public void a() {
        RenderSystem.assertOnRenderThread();
        GLFWMonitorCallback $$0 = GLFW.glfwSetMonitorCallback(null);
        if ($$0 != null) {
            $$0.free();
        }
    }
}

