/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class hrk {
    private static final Map<eld<?>, hrj<?, ?>> a = Maps.newHashMap();

    private static <T extends elb, S extends hsm> void a(eld<? extends T> $$0, hrj<T, S> $$1) {
        a.put($$0, $$1);
    }

    public static Map<eld<?>, hri<?, ?>> a(hrj.a $$0) {
        ImmutableMap.Builder $$1 = ImmutableMap.builder();
        a.forEach(($$2, $$3) -> {
            try {
                $$1.put($$2, $$3.create($$0));
            }
            catch (Exception $$4) {
                throw new IllegalStateException("Failed to create model for " + String.valueOf(mi.k.b((eld<?>)$$2)), $$4);
            }
        });
        return $$1.build();
    }

    static {
        hrk.a(eld.h, hrz::new);
        hrk.a(eld.i, hru::new);
        hrk.a(eld.j, hsb::new);
        hrk.a(eld.l, $$0 -> new hrw());
        hrk.a(eld.b, hrp::new);
        hrk.a(eld.d, hrp::new);
        hrk.a(eld.c, hrp::new);
        hrk.a(eld.n, hrt::new);
        hrk.a(eld.E, hrv::new);
        hrk.a(eld.o, $$0 -> new hse());
        hrk.a(eld.w, $$0 -> new hsd());
        hrk.a(eld.p, $$0 -> new hre());
        hrk.a(eld.q, hsa::new);
        hrk.a(eld.u, hrd::new);
        hrk.a(eld.v, $$0 -> new hrl());
        hrk.a(eld.V, $$0 -> new hsc());
        hrk.a(eld.y, hry::new);
        hrk.a(eld.z, hrf::new);
        hrk.a(eld.A, hrq::new);
        hrk.a(eld.F, hrg::new);
        hrk.a(eld.H, hro::new);
        hrk.a(eld.P, hrn::new);
        hrk.a(eld.Q, hrs::new);
        hrk.a(eld.S, hsf::new);
        hrk.a(eld.T, hsg::new);
        hrk.a(eld.W, hrr::new);
        hrk.a(eld.O, hrx::new);
    }
}

