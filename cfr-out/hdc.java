/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class hdc {
    public static final hdc a = new hdc(Map.of());
    private final Map<hde, hdm> b;

    public hdc(Map<hde, hdm> $$0) {
        this.b = $$0;
    }

    public hdg a(hde $$0) {
        hdm $$1 = this.b.get($$0);
        if ($$1 == null) {
            throw new IllegalArgumentException("No model for layer " + String.valueOf($$0));
        }
        return $$1.a();
    }

    public static hdc a() {
        return new hdc((Map<hde, hdm>)ImmutableMap.copyOf(hdd.a()));
    }
}

