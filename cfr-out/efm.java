/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public abstract class efm
extends dzq {
    public static final eoy b = eox.N;
    public static final eoy c = eox.O;
    public static final eoy d = eox.P;
    public static final eoy e = eox.Q;
    public static final eoy f = eox.L;
    public static final eoy g = eox.M;
    public static final Map<iz, eoy> h = ImmutableMap.copyOf((Map)Maps.newEnumMap(Map.of(iz.c, b, iz.f, c, iz.d, d, iz.e, e, iz.b, f, iz.a, g)));
    private final Function<eoh, fug> a;

    protected efm(float $$0, eog.d $$1) {
        super($$1);
        this.a = this.a($$0);
    }

    protected abstract MapCodec<? extends efm> a();

    private Function<eoh, fug> a(float $$0) {
        fug $$1 = dzq.a($$0);
        Map<iz, fug> $$22 = fud.d(dzq.c($$0, 0.0, 8.0));
        return this.a((eoh $$2) -> {
            fug $$3 = $$1;
            for (Map.Entry<iz, eoy> $$4 : h.entrySet()) {
                if (!((Boolean)$$2.c($$4.getValue())).booleanValue()) continue;
                $$3 = fud.a((fug)$$22.get($$4.getKey()), $$3);
            }
            return $$3;
        });
    }

    @Override
    protected boolean e_(eoh $$0) {
        return false;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.a.apply($$0);
    }
}

