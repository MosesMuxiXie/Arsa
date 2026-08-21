/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.Pointer
 */
import com.mojang.blaze3d.platform.GLX;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.Pointer;

public class fxy {
    private static final @Nullable MethodHandle a = GLX.make(() -> {
        try {
            MethodHandles.Lookup $$0 = MethodHandles.lookup();
            Class<?> $$1 = Class.forName("org.lwjgl.system.MemoryManage$DebugAllocator");
            Method $$2 = $$1.getDeclaredMethod("untrack", Long.TYPE);
            $$2.setAccessible(true);
            Field $$3 = Class.forName("org.lwjgl.system.MemoryUtil$LazyInit").getDeclaredField("ALLOCATOR");
            $$3.setAccessible(true);
            Object $$4 = $$3.get(null);
            if ($$1.isInstance($$4)) {
                return $$0.unreflect($$2);
            }
            return null;
        }
        catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException $$5) {
            throw new RuntimeException($$5);
        }
    });

    public static void a(long $$0) {
        if (a == null) {
            return;
        }
        try {
            a.invoke($$0);
        }
        catch (Throwable $$1) {
            throw new RuntimeException($$1);
        }
    }

    public static void a(Pointer $$0) {
        fxy.a($$0.address());
    }
}

