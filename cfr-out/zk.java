/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Function;
import java.util.function.Supplier;

public class zk {
    static Function<String, Supplier<yh>> a = $$0 -> () -> yh.b($$0);

    public static void a(Function<String, Supplier<yh>> $$0) {
        a = $$0;
    }
}

