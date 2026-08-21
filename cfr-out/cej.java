/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2DoubleArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2DoubleMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2DoubleMaps
 */
import it.unimi.dsi.fastutil.objects.Reference2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMap;
import it.unimi.dsi.fastutil.objects.Reference2DoubleMaps;
import java.util.Objects;

public class cej {
    private final Reference2DoubleArrayMap<cec> a = new Reference2DoubleArrayMap();

    public void a() {
        this.a.clear();
    }

    public cej a(double $$0, cec $$1) {
        this.a.mergeDouble((Object)$$1, $$0, Double::sum);
        return this;
    }

    public <Value> Value a(cea<Value> $$0, Value $$1) {
        if (this.a.isEmpty()) {
            return $$1;
        }
        if (this.a.size() == 1) {
            cec $$2 = (cec)this.a.keySet().iterator().next();
            return $$2.a($$0, $$1);
        }
        cei<Value> $$3 = $$0.a().f();
        Object $$4 = null;
        double $$5 = 0.0;
        for (Reference2DoubleMap.Entry $$6 : Reference2DoubleMaps.fastIterable(this.a)) {
            cec $$7 = (cec)$$6.getKey();
            double $$8 = $$6.getDoubleValue();
            Value $$9 = $$7.a($$0, $$1);
            $$5 += $$8;
            if ($$4 == null) {
                $$4 = $$9;
                continue;
            }
            float $$10 = (float)($$8 / $$5);
            $$4 = $$3.apply($$10, $$4, $$9);
        }
        return Objects.requireNonNull($$4);
    }
}

