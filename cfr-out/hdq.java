/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 */
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class hdq {
    private final List<hdj> a;
    private final hdi b;
    private final Map<String, hdq> c = Maps.newHashMap();

    hdq(List<hdj> $$0, hdi $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public hdq a(String $$0, hdl $$1, hdi $$2) {
        hdq $$3 = new hdq($$1.b(), $$2);
        return this.a($$0, $$3);
    }

    public hdq a(String $$0, hdq $$1) {
        hdq $$2 = this.c.put($$0, $$1);
        if ($$2 != null) {
            $$1.c.putAll($$2.c);
        }
        return $$1;
    }

    public hdq a() {
        for (String $$0 : this.c.keySet()) {
            this.a($$0).a();
        }
        return this;
    }

    public hdq a(String $$0) {
        hdq $$1 = this.c.get($$0);
        if ($$1 == null) {
            throw new IllegalArgumentException("No child with name: " + $$0);
        }
        return this.a($$0, hdl.c(), $$1.b);
    }

    public void a(Set<String> $$0) {
        for (Map.Entry<String, hdq> $$1 : this.c.entrySet()) {
            hdq $$2 = $$1.getValue();
            if ($$0.contains($$1.getKey())) continue;
            this.a($$1.getKey(), hdl.c(), $$2.b).a($$0);
        }
    }

    public void b(Set<String> $$0) {
        for (Map.Entry<String, hdq> $$1 : this.c.entrySet()) {
            hdq $$2 = $$1.getValue();
            if ($$0.contains($$1.getKey())) {
                $$2.a();
                continue;
            }
            this.a($$1.getKey(), hdl.c(), $$2.b).b($$0);
        }
    }

    public hdg a(int $$02, int $$12) {
        Object2ObjectArrayMap $$22 = this.c.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, $$2 -> ((hdq)$$2.getValue()).a($$02, $$12), ($$0, $$1) -> $$0, Object2ObjectArrayMap::new));
        List<hdg.a> $$3 = this.a.stream().map($$2 -> $$2.a($$02, $$12)).toList();
        hdg $$4 = new hdg($$3, (Map<String, hdg>)$$22);
        $$4.a(this.b);
        $$4.b(this.b);
        return $$4;
    }

    public hdq b(String $$0) {
        return this.c.get($$0);
    }

    public Set<Map.Entry<String, hdq>> b() {
        return this.c.entrySet();
    }

    public hdq a(UnaryOperator<hdi> $$0) {
        hdq $$1 = new hdq(this.a, (hdi)$$0.apply(this.b));
        $$1.c.putAll(this.c);
        return $$1;
    }
}

