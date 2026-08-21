/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public abstract class tx {
    private static final List<tx> a = new ArrayList<tx>();

    public static void a(tx $$0) {
        a.add($$0);
    }

    public static void b(jq<Consumer<sz>> $$0) {
        for (tx $$12 : a) {
            $$12.a(($$1, $$2) -> jq.a($$0, $$1, $$2));
        }
    }

    public abstract void a(BiConsumer<amt<Consumer<sz>>, Consumer<sz>> var1);
}

