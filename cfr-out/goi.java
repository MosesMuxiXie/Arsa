/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.util.freetype.FT_Vector
 *  org.lwjgl.util.freetype.FreeType
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;
import org.slf4j.Logger;

public class goi {
    private static final Logger b = LogUtils.getLogger();
    public static final Object a = new Object();
    private static long c = 0L;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static long a() {
        Object object = a;
        synchronized (object) {
            if (c == 0L) {
                try (MemoryStack $$0 = MemoryStack.stackPush();){
                    PointerBuffer $$1 = $$0.mallocPointer(1);
                    goi.a(FreeType.FT_Init_FreeType((PointerBuffer)$$1), "Initializing FreeType library");
                    c = $$1.get();
                }
            }
            return c;
        }
    }

    public static void a(int $$0, String $$1) {
        if ($$0 != 0) {
            throw new IllegalStateException("FreeType error: " + goi.a($$0) + " (" + $$1 + ")");
        }
    }

    public static boolean b(int $$0, String $$1) {
        if ($$0 != 0) {
            b.error("FreeType error: {} ({})", (Object)goi.a($$0), (Object)$$1);
            return true;
        }
        return false;
    }

    private static String a(int $$0) {
        String $$1 = FreeType.FT_Error_String((int)$$0);
        if ($$1 != null) {
            return $$1;
        }
        return "Unrecognized error: 0x" + Integer.toHexString($$0);
    }

    public static FT_Vector a(FT_Vector $$0, float $$1, float $$2) {
        long $$3 = Math.round($$1 * 64.0f);
        long $$4 = Math.round($$2 * 64.0f);
        return $$0.set($$3, $$4);
    }

    public static float a(FT_Vector $$0) {
        return (float)$$0.x() / 64.0f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b() {
        Object object = a;
        synchronized (object) {
            if (c != 0L) {
                FreeType.FT_Done_Library((long)c);
                c = 0L;
            }
        }
    }
}

