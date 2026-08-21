/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.system.MemoryUtil
 */
import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryUtil;

public class fvz {
    public static void a() {
        MemoryUtil.memSet((long)0L, (int)0, (long)1L);
    }

    public static double b() {
        return GLFW.glfwGetTime();
    }

    private fvz() {
    }
}

