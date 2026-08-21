/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class bfg<K, V extends a<K>> {
    private final Map<K, V> a = new HashMap();

    public bfg<K, V> a(K $$0, V $$1) {
        this.a.put($$0, $$1);
        return this;
    }

    private void a(Multimap<K, K> $$0, Set<K> $$1, K $$2, BiConsumer<K, V> $$32) {
        if (!$$1.add($$2)) {
            return;
        }
        $$0.get($$2).forEach($$3 -> this.a($$0, $$1, $$3, $$32));
        a $$4 = (a)this.a.get($$2);
        if ($$4 != null) {
            $$32.accept($$2, $$4);
        }
    }

    private static <K> boolean a(Multimap<K, K> $$0, K $$1, K $$22) {
        Collection $$3 = $$0.get($$22);
        if ($$3.contains($$1)) {
            return true;
        }
        return $$3.stream().anyMatch($$2 -> bfg.a($$0, $$1, $$2));
    }

    private static <K> void b(Multimap<K, K> $$0, K $$1, K $$2) {
        if (!bfg.a($$0, $$1, $$2)) {
            $$0.put($$1, $$2);
        }
    }

    public void a(BiConsumer<K, V> $$0) {
        HashMultimap $$1 = HashMultimap.create();
        this.a.forEach((arg_0, arg_1) -> bfg.b((Multimap)$$1, arg_0, arg_1));
        this.a.forEach((arg_0, arg_1) -> bfg.a((Multimap)$$1, arg_0, arg_1));
        HashSet $$2 = new HashSet();
        this.a.keySet().forEach(arg_0 -> this.a((Multimap)$$1, $$2, $$0, arg_0));
    }

    private /* synthetic */ void a(Multimap $$0, Set $$1, BiConsumer $$2, Object $$3) {
        this.a($$0, $$1, $$3, $$2);
    }

    private static /* synthetic */ void a(Multimap $$0, Object $$1, a $$22) {
        $$22.b($$2 -> bfg.b($$0, $$1, $$2));
    }

    private static /* synthetic */ void b(Multimap $$0, Object $$1, a $$22) {
        $$22.a((K $$2) -> bfg.b($$0, $$1, $$2));
    }

    public static interface a<K> {
        public void a(Consumer<K> var1);

        public void b(Consumer<K> var1);
    }
}

