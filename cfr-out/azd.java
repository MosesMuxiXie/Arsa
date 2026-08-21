/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class azd {
    private static final azd a = new azd(Map.of());
    private final Map<azy<?>, ?> b;

    private azd(Map<azy<?>, ?> $$0) {
        this.b = $$0;
    }

    public <T> T a(azy<T> $$0) {
        return (T)this.b.get($$0);
    }

    public static azd a() {
        return a;
    }

    public static <T> azd a(azy<T> $$0, T $$1) {
        return new azd(Map.of($$0, $$1));
    }

    public static <T1, T2> azd a(azy<T1> $$0, T1 $$1, azy<T2> $$2, T2 $$3) {
        return new azd(Map.of($$0, $$1, $$2, $$3));
    }
}

