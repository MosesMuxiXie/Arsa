/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 */
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@FunctionalInterface
public interface fhc {
    public static final fhc a = $$0 -> $$0;

    public amt<fgy> lookup(amt<fgy> var1);

    public static fhc create(List<fha> $$0, is $$1, long $$22) {
        if ($$0.isEmpty()) {
            return a;
        }
        bgr $$3 = bgr.a($$22).e().a($$1);
        ImmutableMap.Builder $$4 = ImmutableMap.builder();
        $$0.forEach($$2 -> $$2.a($$3, (arg_0, arg_1) -> ((ImmutableMap.Builder)$$4).put(arg_0, arg_1)));
        ImmutableMap $$5 = $$4.build();
        return arg_0 -> fhc.a((Map)$$5, arg_0);
    }

    private static /* synthetic */ amt a(Map $$0, amt $$1) {
        return Objects.requireNonNull($$0.getOrDefault($$1, $$1), () -> "alias " + String.valueOf($$1.a()) + " was mapped to null value");
    }
}

