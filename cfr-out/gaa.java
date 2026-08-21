/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.net.Proxy;
import org.jspecify.annotations.Nullable;

public class gaa {
    private static @Nullable Proxy a;

    public static @Nullable Proxy a() {
        return a;
    }

    public static void a(Proxy $$0) {
        if (a == null) {
            a = $$0;
        }
    }
}

