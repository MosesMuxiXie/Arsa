/*
 * Decompiled with CFR 0.152.
 */
import java.util.IllegalFormatException;
import java.util.Locale;

public class imu {
    private static volatile uu a = uu.a();

    private imu() {
    }

    static void a(uu $$0) {
        a = $$0;
    }

    public static String a(String $$0, Object ... $$1) {
        String $$2 = a.a($$0);
        try {
            return String.format(Locale.ROOT, $$2, $$1);
        }
        catch (IllegalFormatException $$3) {
            return "Format error: " + $$2;
        }
    }

    public static boolean a(String $$0) {
        return a.b($$0);
    }
}

