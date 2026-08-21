/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;

public class dwx {
    private final Long2ObjectMap<List<axg>> a = new Long2ObjectOpenHashMap();
    private final Map<axg, a> b = Maps.newHashMap();
    private final awj c;

    public dwx(awj $$0) {
        this.c = $$0;
    }

    private List<axg> a(dvu $$0) {
        return (List)this.a.computeIfAbsent($$0.b(), $$1 -> this.c.c($$0));
    }

    public void a(dvu $$02, cho $$1) {
        for (axg $$2 : this.a($$02)) {
            this.b.computeIfAbsent($$2, $$0 -> new a()).a($$1);
        }
    }

    public boolean a(cho $$0, dvu $$1) {
        for (axg $$2 : this.a($$1)) {
            a $$3 = this.b.get($$2);
            if ($$3 != null && !$$3.b($$0)) continue;
            return true;
        }
        return false;
    }

    static class a {
        private final Object2IntMap<cho> a = new Object2IntOpenHashMap(cho.values().length);

        a() {
        }

        public void a(cho $$02) {
            this.a.computeInt((Object)$$02, ($$0, $$1) -> $$1 == null ? 1 : $$1 + 1);
        }

        public boolean b(cho $$0) {
            return this.a.getOrDefault((Object)$$0, 0) < $$0.b();
        }
    }
}

