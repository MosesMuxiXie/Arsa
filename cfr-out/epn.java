/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class epn {
    private static final bgt a = new bgt(4);
    private static final int b = a.a();
    private static final int c = 0;
    private static final int d = 4;
    private static final int e = 8;
    private static final int f = 12;

    public static int a() {
        return b;
    }

    public static int a(iz $$0) {
        return a.a($$0);
    }

    public static int a(float $$0) {
        return a.b($$0);
    }

    public static Optional<iz> a(int $$0) {
        iz $$1 = switch ($$0) {
            case 0 -> iz.c;
            case 4 -> iz.f;
            case 8 -> iz.d;
            case 12 -> iz.e;
            default -> null;
        };
        return Optional.ofNullable($$1);
    }

    public static float b(int $$0) {
        return a.b($$0);
    }
}

