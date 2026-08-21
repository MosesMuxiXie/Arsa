/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class edw
extends dzq {
    public static final MapCodec<edw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)mi.e.q().fieldOf("host").forGetter(edw::b), edw.x()).apply((Applicative)$$0, edw::new));
    private final dzq b;
    private static final Map<dzq, dzq> c = Maps.newIdentityHashMap();
    private static final Map<eoh, eoh> d = Maps.newIdentityHashMap();
    private static final Map<eoh, eoh> e = Maps.newIdentityHashMap();

    public MapCodec<? extends edw> a() {
        return a;
    }

    public edw(dzq $$0, eog.d $$1) {
        super($$1.e($$0.B() / 2.0f).f(0.75f));
        this.b = $$0;
        c.put($$0, this);
    }

    public dzq b() {
        return this.b;
    }

    public static boolean p(eoh $$0) {
        return c.containsKey($$0.b());
    }

    private void a(axf $$0, is $$1) {
        daf $$2 = cgu.bm.a($$0, cgt.k);
        if ($$2 != null) {
            $$2.b((double)$$1.u() + 0.5, $$1.v(), (double)$$1.w() + 0.5, 0.0f, 0.0f);
            $$0.b($$2);
            $$2.U();
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dlt $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$1.U().a(eua.d).booleanValue() && !dsq.a($$3, bds.t)) {
            this.a($$1, $$2);
        }
    }

    public static eoh q(eoh $$0) {
        return edw.a(d, $$0, () -> c.get($$0.b()).m());
    }

    public eoh r(eoh $$0) {
        return edw.a(e, $$0, () -> this.b().m());
    }

    private static eoh a(Map<eoh, eoh> $$0, eoh $$12, Supplier<eoh> $$2) {
        return $$0.computeIfAbsent($$12, $$1 -> {
            eoh $$2 = (eoh)$$2.get();
            for (epk<?> $$3 : $$1.F()) {
                $$2 = $$2.b($$3) ? (eoh)$$2.b($$3, $$1.c($$3)) : $$2;
            }
            return $$2;
        });
    }
}

