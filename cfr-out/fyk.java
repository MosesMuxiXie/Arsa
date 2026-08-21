/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.glfw.Callbacks
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallback
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.glfw.GLFWImage
 *  org.lwjgl.glfw.GLFWImage$Buffer
 *  org.lwjgl.glfw.GLFWWindowCloseCallback
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 *  org.slf4j.Logger
 */
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWWindowCloseCallback;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public final class fyk
implements AutoCloseable {
    private static final Logger c = LogUtils.getLogger();
    public static final int a = 320;
    public static final int b = 240;
    private final GLFWErrorCallback d = GLFWErrorCallback.create(this::a);
    private final fyl e;
    private final fyi f;
    private final long g;
    private int h;
    private int i;
    private int j;
    private int k;
    private Optional<fyj> l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private String x = "";
    private boolean y;
    private boolean z;
    private boolean A;
    private boolean B;
    private boolean C;
    private fym D = fym.a;

    public fyk(fyl $$0, fyi $$1, fxz $$2, @Nullable String $$3, String $$4) {
        this.f = $$1;
        this.w();
        this.a("Pre startup");
        this.e = $$0;
        Optional<fyj> $$5 = fyj.a($$3);
        this.l = $$5.isPresent() ? $$5 : ($$2.c().isPresent() && $$2.d().isPresent() ? Optional.of(new fyj($$2.c().getAsInt(), $$2.d().getAsInt(), 8, 8, 8, 60)) : Optional.empty());
        this.n = this.m = $$2.e();
        fyf $$6 = $$1.a(GLFW.glfwGetPrimaryMonitor());
        this.j = this.q = Math.max($$2.a(), 1);
        this.k = this.r = Math.max($$2.b(), 1);
        GLFW.glfwDefaultWindowHints();
        GLFW.glfwWindowHint((int)139265, (int)196609);
        GLFW.glfwWindowHint((int)139275, (int)221185);
        GLFW.glfwWindowHint((int)139266, (int)3);
        GLFW.glfwWindowHint((int)139267, (int)3);
        GLFW.glfwWindowHint((int)139272, (int)204801);
        GLFW.glfwWindowHint((int)139270, (int)1);
        this.g = GLFW.glfwCreateWindow((int)this.q, (int)this.r, (CharSequence)$$4, (long)(this.m && $$6 != null ? $$6.f() : 0L), (long)0L);
        if ($$6 != null) {
            fyj $$7 = $$6.a(this.m ? this.l : Optional.empty());
            this.h = this.o = $$6.c() + $$7.a() / 2 - this.q / 2;
            this.i = this.p = $$6.d() + $$7.b() / 2 - this.r / 2;
        } else {
            int[] $$8 = new int[1];
            int[] $$9 = new int[1];
            GLFW.glfwGetWindowPos((long)this.g, (int[])$$8, (int[])$$9);
            this.h = this.o = $$8[0];
            this.i = this.p = $$9[0];
        }
        this.y();
        this.x();
        GLFW.glfwSetFramebufferSizeCallback((long)this.g, this::b);
        GLFW.glfwSetWindowPosCallback((long)this.g, this::a);
        GLFW.glfwSetWindowSizeCallback((long)this.g, this::c);
        GLFW.glfwSetWindowFocusCallback((long)this.g, this::a);
        GLFW.glfwSetCursorEnterCallback((long)this.g, this::b);
        GLFW.glfwSetWindowIconifyCallback((long)this.g, this::c);
    }

    public static String a() {
        int $$0 = GLFW.glfwGetPlatform();
        return switch ($$0) {
            case 0 -> "<error>";
            case 393217 -> "win32";
            case 393218 -> "cocoa";
            case 393219 -> "wayland";
            case 393220 -> "x11";
            case 393221 -> "null";
            default -> String.format(Locale.ROOT, "unknown (%08X)", $$0);
        };
    }

    public int b() {
        RenderSystem.assertOnRenderThread();
        return GLX._getRefreshRate(this);
    }

    public boolean c() {
        return GLX._shouldClose(this);
    }

    public static void a(BiConsumer<Integer, String> $$0) {
        try (MemoryStack $$1 = MemoryStack.stackPush();){
            PointerBuffer $$2 = $$1.mallocPointer(1);
            int $$3 = GLFW.glfwGetError((PointerBuffer)$$2);
            if ($$3 != 0) {
                long $$4 = $$2.get();
                String $$5 = $$4 == 0L ? "" : MemoryUtil.memUTF8((long)$$4);
                $$0.accept($$3, $$5);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(azl $$0, fyb $$1) throws IOException {
        int $$2 = GLFW.glfwGetPlatform();
        switch ($$2) {
            case 393217: 
            case 393220: {
                List<bar<InputStream>> $$3 = $$1.a($$0);
                ArrayList<ByteBuffer> $$4 = new ArrayList<ByteBuffer>($$3.size());
                try (MemoryStack $$5 = MemoryStack.stackPush();){
                    GLFWImage.Buffer $$6 = GLFWImage.malloc((int)$$3.size(), (MemoryStack)$$5);
                    for (int $$7 = 0; $$7 < $$3.size(); ++$$7) {
                        try (fyh $$8 = fyh.a($$3.get($$7).get());){
                            ByteBuffer $$9 = MemoryUtil.memAlloc((int)($$8.a() * $$8.b() * 4));
                            $$4.add($$9);
                            $$9.asIntBuffer().put($$8.d());
                            $$6.position($$7);
                            $$6.width($$8.a());
                            $$6.height($$8.b());
                            $$6.pixels($$9);
                            continue;
                        }
                    }
                    GLFW.glfwSetWindowIcon((long)this.g, (GLFWImage.Buffer)((GLFWImage.Buffer)$$6.position(0)));
                    break;
                }
                finally {
                    $$4.forEach(MemoryUtil::memFree);
                }
            }
            case 393218: {
                fye.a($$1.b($$0));
                break;
            }
            case 393219: 
            case 393221: {
                break;
            }
            default: {
                c.warn("Not setting icon for unrecognized platform: {}", (Object)$$2);
            }
        }
    }

    public void a(String $$0) {
        this.x = $$0;
    }

    private void w() {
        GLFW.glfwSetErrorCallback(fyk::b);
    }

    private static void b(int $$0, long $$1) {
        String $$2 = "GLFW error " + $$0 + ": " + MemoryUtil.memUTF8((long)$$1);
        TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)($$2 + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."), (CharSequence)"ok", (CharSequence)"error", (boolean)false);
        throw new a($$2);
    }

    public void a(int $$0, long $$1) {
        RenderSystem.assertOnRenderThread();
        String $$2 = MemoryUtil.memUTF8((long)$$1);
        c.error("########## GL ERROR ##########");
        c.error("@ {}", (Object)this.x);
        c.error("{}: {}", (Object)$$0, (Object)$$2);
    }

    public void d() {
        GLFWErrorCallback $$0 = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)this.d);
        if ($$0 != null) {
            $$0.free();
        }
    }

    public void a(boolean $$0) {
        RenderSystem.assertOnRenderThread();
        this.z = $$0;
        GLFW.glfwSwapInterval((int)($$0 ? 1 : 0));
    }

    @Override
    public void close() {
        RenderSystem.assertOnRenderThread();
        Callbacks.glfwFreeCallbacks((long)this.g);
        this.d.close();
        GLFW.glfwDestroyWindow((long)this.g);
        GLFW.glfwTerminate();
    }

    private void a(long $$0, int $$1, int $$2) {
        this.o = $$1;
        this.p = $$2;
    }

    private void b(long $$0, int $$1, int $$2) {
        if ($$0 != this.g) {
            return;
        }
        int $$3 = this.k();
        int $$4 = this.l();
        if ($$1 == 0 || $$2 == 0) {
            this.B = true;
            return;
        }
        this.B = false;
        this.s = $$1;
        this.t = $$2;
        if (this.k() != $$3 || this.l() != $$4) {
            try {
                this.e.a();
            }
            catch (Exception $$5) {
                m $$6 = m.a($$5, "Window resize");
                n $$7 = $$6.a("Window Dimensions");
                $$7.a("Old", $$3 + "x" + $$4);
                $$7.a("New", $$1 + "x" + $$2);
                throw new v($$6);
            }
        }
    }

    private void x() {
        int[] $$0 = new int[1];
        int[] $$1 = new int[1];
        GLFW.glfwGetFramebufferSize((long)this.g, (int[])$$0, (int[])$$1);
        this.s = $$0[0] > 0 ? $$0[0] : 1;
        this.t = $$1[0] > 0 ? $$1[0] : 1;
    }

    private void c(long $$0, int $$1, int $$2) {
        this.q = $$1;
        this.r = $$2;
    }

    private void a(long $$0, boolean $$1) {
        if ($$0 == this.g) {
            this.e.a($$1);
        }
    }

    private void b(long $$0, boolean $$1) {
        if ($$1) {
            this.e.b();
        }
    }

    private void c(long $$0, boolean $$1) {
        this.A = $$1;
    }

    public void a(@Nullable fwf $$0) {
        RenderSystem.flipFrame(this, $$0);
        if (this.m != this.n) {
            this.n = this.m;
            this.a(this.z, $$0);
        }
    }

    public Optional<fyj> e() {
        return this.l;
    }

    public void a(Optional<fyj> $$0) {
        boolean $$1 = !$$0.equals(this.l);
        this.l = $$0;
        if ($$1) {
            this.y = true;
        }
    }

    public void f() {
        if (this.m && this.y) {
            this.y = false;
            this.y();
            this.e.a();
        }
    }

    private void y() {
        boolean $$0;
        boolean bl2 = $$0 = GLFW.glfwGetWindowMonitor((long)this.g) != 0L;
        if (this.m) {
            fyf $$1 = this.f.a(this);
            if ($$1 == null) {
                c.warn("Failed to find suitable monitor for fullscreen mode");
                this.m = false;
            } else {
                if (fye.a) {
                    fye.a(this);
                }
                fyj $$2 = $$1.a(this.l);
                if (!$$0) {
                    this.h = this.o;
                    this.i = this.p;
                    this.j = this.q;
                    this.k = this.r;
                }
                this.o = 0;
                this.p = 0;
                this.q = $$2.a();
                this.r = $$2.b();
                GLFW.glfwSetWindowMonitor((long)this.g, (long)$$1.f(), (int)this.o, (int)this.p, (int)this.q, (int)this.r, (int)$$2.f());
                if (fye.a) {
                    fye.b(this);
                }
            }
        } else {
            this.o = this.h;
            this.p = this.i;
            this.q = this.j;
            this.r = this.k;
            GLFW.glfwSetWindowMonitor((long)this.g, (long)0L, (int)this.o, (int)this.p, (int)this.q, (int)this.r, (int)-1);
        }
    }

    public void g() {
        this.m = !this.m;
    }

    public void a(int $$0, int $$1) {
        this.j = $$0;
        this.k = $$1;
        this.m = false;
        this.y();
    }

    private void a(boolean $$0, @Nullable fwf $$1) {
        RenderSystem.assertOnRenderThread();
        try {
            this.y();
            this.e.a();
            this.a($$0);
            this.a($$1);
        }
        catch (Exception $$2) {
            c.error("Couldn't toggle fullscreen", (Throwable)$$2);
        }
    }

    public int a(int $$0, boolean $$1) {
        int $$2;
        for ($$2 = 1; $$2 != $$0 && $$2 < this.s && $$2 < this.t && this.s / ($$2 + 1) >= 320 && this.t / ($$2 + 1) >= 240; ++$$2) {
        }
        if ($$1 && $$2 % 2 != 0) {
            ++$$2;
        }
        return $$2;
    }

    public void a(int $$0) {
        this.w = $$0;
        double $$1 = $$0;
        int $$2 = (int)((double)this.s / $$1);
        this.u = (double)this.s / $$1 > (double)$$2 ? $$2 + 1 : $$2;
        int $$3 = (int)((double)this.t / $$1);
        this.v = (double)this.t / $$1 > (double)$$3 ? $$3 + 1 : $$3;
    }

    public void b(String $$0) {
        GLFW.glfwSetWindowTitle((long)this.g, (CharSequence)$$0);
    }

    public long h() {
        return this.g;
    }

    public boolean i() {
        return this.m;
    }

    public boolean j() {
        return this.A;
    }

    public int k() {
        return this.s;
    }

    public int l() {
        return this.t;
    }

    public void b(int $$0) {
        this.s = $$0;
    }

    public void c(int $$0) {
        this.t = $$0;
    }

    public int m() {
        return this.q;
    }

    public int n() {
        return this.r;
    }

    public int o() {
        return this.u;
    }

    public int p() {
        return this.v;
    }

    public int q() {
        return this.o;
    }

    public int r() {
        return this.p;
    }

    public int s() {
        return this.w;
    }

    public @Nullable fyf t() {
        return this.f.a(this);
    }

    public void b(boolean $$0) {
        fyc.a(this, $$0);
    }

    public void a(Runnable $$0) {
        GLFWWindowCloseCallback $$12 = GLFW.glfwSetWindowCloseCallback((long)this.g, $$1 -> $$0.run());
        if ($$12 != null) {
            $$12.free();
        }
    }

    public boolean u() {
        return this.B;
    }

    public void c(boolean $$0) {
        this.C = $$0;
    }

    public void a(fym $$0) {
        fym $$1;
        fym fym2 = $$1 = this.C ? $$0 : fym.a;
        if (this.D != $$1) {
            this.D = $$1;
            $$1.a(this);
        }
    }

    public float v() {
        return Math.max(2.5f, (float)this.k() / 1920.0f * 2.5f);
    }

    public static class a
    extends gzg {
        a(String $$0) {
            super($$0);
        }
    }
}

