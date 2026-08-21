/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWVidMode
 *  org.lwjgl.glfw.GLFWVidMode$Buffer
 */
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public final class fyf {
    private final long a;
    private final List<fyj> b;
    private fyj c;
    private int d;
    private int e;

    public fyf(long $$0) {
        this.a = $$0;
        this.b = Lists.newArrayList();
        this.a();
    }

    public void a() {
        this.b.clear();
        GLFWVidMode.Buffer $$0 = GLFW.glfwGetVideoModes((long)this.a);
        for (int $$1 = $$0.limit() - 1; $$1 >= 0; --$$1) {
            $$0.position($$1);
            fyj $$2 = new fyj($$0);
            if ($$2.c() < 8 || $$2.d() < 8 || $$2.e() < 8) continue;
            this.b.add($$2);
        }
        int[] $$3 = new int[1];
        int[] $$4 = new int[1];
        GLFW.glfwGetMonitorPos((long)this.a, (int[])$$3, (int[])$$4);
        this.d = $$3[0];
        this.e = $$4[0];
        GLFWVidMode $$5 = GLFW.glfwGetVideoMode((long)this.a);
        this.c = new fyj($$5);
    }

    public fyj a(Optional<fyj> $$0) {
        if ($$0.isPresent()) {
            fyj $$1 = $$0.get();
            for (fyj $$2 : this.b) {
                if (!$$2.equals($$1)) continue;
                return $$2;
            }
        }
        return this.b();
    }

    public int a(fyj $$0) {
        return this.b.indexOf($$0);
    }

    public fyj b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public fyj a(int $$0) {
        return this.b.get($$0);
    }

    public int e() {
        return this.b.size();
    }

    public long f() {
        return this.a;
    }

    public String toString() {
        return String.format(Locale.ROOT, "Monitor[%s %sx%s %s]", this.a, this.d, this.e, this.c);
    }
}

