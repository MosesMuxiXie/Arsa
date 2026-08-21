/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallback
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.system.MemoryUtil
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;

public class fxx {
    public static final int a = 65545;
    private final ByteBuffer b = BufferUtils.createByteBuffer((int)8192);

    public String a(fyk $$0, GLFWErrorCallbackI $$1) {
        GLFWErrorCallback $$2 = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)$$1);
        String $$3 = GLFW.glfwGetClipboardString((long)$$0.h());
        $$3 = $$3 != null ? bhg.a($$3) : "";
        GLFWErrorCallback $$4 = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)$$2);
        if ($$4 != null) {
            $$4.free();
        }
        return $$3;
    }

    private static void a(fyk $$0, ByteBuffer $$1, byte[] $$2) {
        $$1.clear();
        $$1.put($$2);
        $$1.put((byte)0);
        $$1.flip();
        GLFW.glfwSetClipboardString((long)$$0.h(), (ByteBuffer)$$1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(fyk $$0, String $$1) {
        byte[] $$2 = $$1.getBytes(StandardCharsets.UTF_8);
        int $$3 = $$2.length + 1;
        if ($$3 < this.b.capacity()) {
            fxx.a($$0, this.b, $$2);
        } else {
            ByteBuffer $$4 = MemoryUtil.memAlloc((int)$$3);
            try {
                fxx.a($$0, $$4, $$2);
            }
            finally {
                MemoryUtil.memFree((Buffer)$$4);
            }
        }
    }
}

