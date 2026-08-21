/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class hvn
extends hvh<ctr, icl, gzy> {
    private static final Map<ctr.e, amo> a = bhs.a(Maps.newHashMap(), (? super T $$0) -> {
        for (ctr.e $$1 : ctr.e.values()) {
            $$0.put($$1, amo.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
        }
    });

    public hvn(hwq.a $$0) {
        super($$0, new gzy($$0.a(hdf.k)), new gzy($$0.a(hdf.l)), 0.5f);
    }

    public amo a(icl $$0) {
        return a.get($$0.a);
    }

    public icl a() {
        return new icl();
    }

    @Override
    public void a(ctr $$0, icl $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.gP();
        $$1.b = $$0.cC.a($$2);
        $$1.d = $$0.cD.a($$2);
        $$1.e = $$0.cE.a($$2);
        $$1.c = $$0.cF.a($$2);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icl)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

