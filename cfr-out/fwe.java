/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogListeners
 *  org.slf4j.event.Level
 */
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogListeners;
import org.slf4j.event.Level;

public class fwe {
    private static boolean a;

    public static void a() {
        if (a) {
            return;
        }
        TracyClient.load();
        if (!TracyClient.isAvailable()) {
            return;
        }
        LogListeners.addListener((String)"Tracy", ($$0, $$1) -> TracyClient.message((String)$$0, (int)fwe.a($$1)));
        a = true;
    }

    private static int a(Level $$0) {
        return switch ($$0) {
            default -> 0xFFFFFF;
            case Level.DEBUG -> 0xAAAAAA;
            case Level.WARN -> 0xFFFFAA;
            case Level.ERROR -> 0xFFAAAA;
        };
    }
}

