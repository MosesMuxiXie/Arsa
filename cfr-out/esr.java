/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Map;
import java.util.UUID;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class esr<T extends esp> {
    private static final Logger a = LogUtils.getLogger();
    private final Int2ObjectMap<T> b = new Int2ObjectLinkedOpenHashMap();
    private final Map<UUID, T> c = Maps.newHashMap();

    public <U extends T> void a(esw<T, U> $$0, bem<U> $$1) {
        for (esp $$2 : this.b.values()) {
            esp $$3 = (esp)$$0.a($$2);
            if ($$3 == null || !$$1.accept($$3).a()) continue;
            return;
        }
    }

    public Iterable<T> a() {
        return Iterables.unmodifiableIterable((Iterable)this.b.values());
    }

    public void a(T $$0) {
        UUID $$1 = $$0.cY();
        if (this.c.containsKey($$1)) {
            a.warn("Duplicate entity UUID {}: {}", (Object)$$1, $$0);
            return;
        }
        this.c.put($$1, $$0);
        this.b.put($$0.aA(), $$0);
    }

    public void b(T $$0) {
        this.c.remove($$0.cY());
        this.b.remove($$0.aA());
    }

    public @Nullable T a(int $$0) {
        return (T)((esp)this.b.get($$0));
    }

    public @Nullable T a(UUID $$0) {
        return (T)((esp)this.c.get($$0));
    }

    public int b() {
        return this.c.size();
    }
}

