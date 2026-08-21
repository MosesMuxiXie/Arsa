/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFW
 */
import org.lwjgl.glfw.GLFW;

public class fym {
    public static final fym a = new fym("default", 0L);
    private final String b;
    private final long c;

    private fym(String $$0, long $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public void a(fyk $$0) {
        GLFW.glfwSetCursor((long)$$0.h(), (long)this.c);
    }

    public String toString() {
        return this.b;
    }

    public static fym a(int $$0, String $$1, fym $$2) {
        long $$3 = GLFW.glfwCreateStandardCursor((int)$$0);
        if ($$3 == 0L) {
            return $$2;
        }
        return new fym($$1, $$3);
    }
}

