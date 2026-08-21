/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

class ful {
    private final Reference2ObjectOpenHashMap<fuj, fuo> a = new Reference2ObjectOpenHashMap(16, 0.5f);

    ful() {
    }

    public @Nullable fuo a(fuj $$0) {
        return (fuo)this.a.get((Object)$$0);
    }

    public fuo a(fuj $$0, Consumer<fuo> $$12) {
        return (fuo)this.a.computeIfAbsent((Object)$$0, $$1 -> {
            fuo $$2 = new fuo();
            $$12.accept($$2);
            return $$2;
        });
    }

    public boolean b(fuj $$0) {
        return this.a.remove((Object)$$0) != null;
    }

    public boolean a() {
        return !this.a.isEmpty();
    }

    public Object2IntMap<fuj> b() {
        Object2IntOpenHashMap $$0 = new Object2IntOpenHashMap();
        this.a.forEach((arg_0, arg_1) -> ful.a((Object2IntMap)$$0, arg_0, arg_1));
        return $$0;
    }

    void a(fuj $$0, fuo $$1) {
        this.a.put((Object)$$0, (Object)$$1);
    }

    Map<fuj, fuo> c() {
        return Collections.unmodifiableMap(this.a);
    }

    private static /* synthetic */ void a(Object2IntMap $$0, fuj $$1, fuo $$2) {
        $$0.put((Object)$$1, $$2.a());
    }
}

