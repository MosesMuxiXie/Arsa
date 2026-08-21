/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.lwjgl.opengl.EXTDebugLabel
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLCapabilities
 *  org.lwjgl.opengl.KHRDebug
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.Supplier;
import org.lwjgl.opengl.EXTDebugLabel;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.KHRDebug;
import org.slf4j.Logger;

public abstract class fxd {
    private static final Logger a = LogUtils.getLogger();

    public void a(fxa $$0) {
    }

    public void a(fxl $$0) {
    }

    public void a(fxk $$0) {
    }

    public void a(fxg $$0) {
    }

    public void a(fxp.c $$0) {
    }

    public void a(Supplier<String> $$0) {
    }

    public void a() {
    }

    public static fxd a(GLCapabilities $$0, boolean $$1, Set<String> $$2) {
        if ($$1) {
            if ($$0.GL_KHR_debug && fxe.b) {
                $$2.add("GL_KHR_debug");
                return new a();
            }
            if ($$0.GL_EXT_debug_label && fxe.c) {
                $$2.add("GL_EXT_debug_label");
                return new c();
            }
            a.warn("Debug labels unavailable: neither KHR_debug nor EXT_debug_label are supported");
        }
        return new b();
    }

    public boolean b() {
        return false;
    }

    static class a
    extends fxd {
        private final int a = GL11.glGetInteger((int)33512);

        a() {
        }

        @Override
        public void a(fxa $$0) {
            Supplier<String> $$1 = $$0.c;
            if ($$1 != null) {
                KHRDebug.glObjectLabel((int)33504, (int)$$0.d, (CharSequence)bhi.a($$1.get(), this.a, true));
            }
        }

        @Override
        public void a(fxl $$0) {
            KHRDebug.glObjectLabel((int)5890, (int)$$0.a, (CharSequence)bhi.a($$0.getLabel(), this.a, true));
        }

        @Override
        public void a(fxk $$0) {
            KHRDebug.glObjectLabel((int)33505, (int)$$0.b(), (CharSequence)bhi.a($$0.c(), this.a, true));
        }

        @Override
        public void a(fxg $$0) {
            KHRDebug.glObjectLabel((int)33506, (int)$$0.a(), (CharSequence)bhi.a($$0.b(), this.a, true));
        }

        @Override
        public void a(fxp.c $$0) {
            KHRDebug.glObjectLabel((int)32884, (int)$$0.a, (CharSequence)bhi.a($$0.b.toString(), this.a, true));
        }

        @Override
        public void a(Supplier<String> $$0) {
            KHRDebug.glPushDebugGroup((int)33354, (int)0, (CharSequence)$$0.get());
        }

        @Override
        public void a() {
            KHRDebug.glPopDebugGroup();
        }

        @Override
        public boolean b() {
            return true;
        }
    }

    static class c
    extends fxd {
        c() {
        }

        @Override
        public void a(fxa $$0) {
            Supplier<String> $$1 = $$0.c;
            if ($$1 != null) {
                EXTDebugLabel.glLabelObjectEXT((int)37201, (int)$$0.d, (CharSequence)bhi.a($$1.get(), 256, true));
            }
        }

        @Override
        public void a(fxl $$0) {
            EXTDebugLabel.glLabelObjectEXT((int)5890, (int)$$0.a, (CharSequence)bhi.a($$0.getLabel(), 256, true));
        }

        @Override
        public void a(fxk $$0) {
            EXTDebugLabel.glLabelObjectEXT((int)35656, (int)$$0.b(), (CharSequence)bhi.a($$0.c(), 256, true));
        }

        @Override
        public void a(fxg $$0) {
            EXTDebugLabel.glLabelObjectEXT((int)35648, (int)$$0.a(), (CharSequence)bhi.a($$0.b(), 256, true));
        }

        @Override
        public void a(fxp.c $$0) {
            EXTDebugLabel.glLabelObjectEXT((int)32884, (int)$$0.a, (CharSequence)bhi.a($$0.b.toString(), 256, true));
        }

        @Override
        public boolean b() {
            return true;
        }
    }

    static class b
    extends fxd {
        b() {
        }
    }
}

