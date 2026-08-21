/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ca.weblite.objc.Client
 *  ca.weblite.objc.NSObject
 *  com.sun.jna.Pointer
 *  org.lwjgl.glfw.GLFWNativeCocoa
 */
import ca.weblite.objc.Client;
import ca.weblite.objc.NSObject;
import com.sun.jna.Pointer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Locale;
import java.util.Optional;
import org.lwjgl.glfw.GLFWNativeCocoa;

public class fye {
    public static final boolean a = System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("mac");
    private static final int b = 8;
    private static final int c = 16384;

    public static void a(fyk $$0) {
        fye.c($$0).filter(fye::a).ifPresent(fye::c);
    }

    public static void b(fyk $$02) {
        fye.c($$02).ifPresent($$0 -> {
            long $$1 = fye.b($$0);
            $$0.send("setStyleMask:", new Object[]{$$1 & 0xFFFFFFFFFFFFFFF7L});
        });
    }

    private static Optional<NSObject> c(fyk $$0) {
        long $$1 = GLFWNativeCocoa.glfwGetCocoaWindow((long)$$0.h());
        if ($$1 != 0L) {
            return Optional.of(new NSObject(new Pointer($$1)));
        }
        return Optional.empty();
    }

    private static boolean a(NSObject $$0) {
        return (fye.b($$0) & 0x4000L) != 0L;
    }

    private static long b(NSObject $$0) {
        return (Long)$$0.sendRaw("styleMask", new Object[0]);
    }

    private static void c(NSObject $$0) {
        $$0.send("toggleFullScreen:", new Object[]{Pointer.NULL});
    }

    public static void a(bar<InputStream> $$0) throws IOException {
        try (InputStream $$1 = $$0.get();){
            String $$2 = Base64.getEncoder().encodeToString($$1.readAllBytes());
            Client $$3 = Client.getInstance();
            Object $$4 = $$3.sendProxy("NSData", "alloc", new Object[0]).send("initWithBase64Encoding:", new Object[]{$$2});
            Object $$5 = $$3.sendProxy("NSImage", "alloc", new Object[0]).send("initWithData:", new Object[]{$$4});
            $$3.sendProxy("NSApplication", "sharedApplication", new Object[0]).send("setApplicationIconImage:", new Object[]{$$5});
        }
    }
}

