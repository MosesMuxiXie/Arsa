/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

public class cgo {
    public static final Codec<cgo> a = Codec.unboundedMap(cgv.l, dlt.b).xmap($$0 -> {
        EnumMap<cgv, dlt> $$1 = new EnumMap<cgv, dlt>(cgv.class);
        $$1.putAll((Map<cgv, dlt>)$$0);
        return new cgo($$1);
    }, $$0 -> {
        EnumMap<cgv, dlt> $$1 = new EnumMap<cgv, dlt>($$0.b);
        $$1.values().removeIf(dlt::f);
        return $$1;
    });
    private final EnumMap<cgv, dlt> b;

    private cgo(EnumMap<cgv, dlt> $$0) {
        this.b = $$0;
    }

    public cgo() {
        this(new EnumMap<cgv, dlt>(cgv.class));
    }

    public dlt a(cgv $$0, dlt $$1) {
        return Objects.requireNonNullElse(this.b.put($$0, $$1), dlt.l);
    }

    public dlt a(cgv $$0) {
        return this.b.getOrDefault($$0, dlt.l);
    }

    public boolean a() {
        for (dlt $$0 : this.b.values()) {
            if ($$0.f()) continue;
            return false;
        }
        return true;
    }

    public void a(cgk $$0) {
        for (Map.Entry<cgv, dlt> $$1 : this.b.entrySet()) {
            dlt $$2 = $$1.getValue();
            if ($$2.f()) continue;
            $$2.a($$0.ao(), $$0, $$1.getKey());
        }
    }

    public void a(cgo $$0) {
        this.b.clear();
        this.b.putAll($$0.b);
    }

    public void a(chl $$0) {
        for (dlt $$1 : this.b.values()) {
            $$0.a($$1, true, false);
        }
        this.b();
    }

    public void b() {
        this.b.replaceAll(($$0, $$1) -> dlt.l);
    }
}

