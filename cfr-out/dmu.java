/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Map;

public class dmu
extends dlp {
    protected static final Map<dzq, eoh> a = Maps.newHashMap((Map)new ImmutableMap.Builder().put((Object)dzs.i, (Object)dzs.lA.m()).put((Object)dzs.j, (Object)dzs.lA.m()).put((Object)dzs.l, (Object)dzs.lA.m()).put((Object)dzs.k, (Object)dzs.lA.m()).put((Object)dzs.fU, (Object)dzs.lA.m()).put((Object)dzs.ug, (Object)dzs.lA.m()).build());

    public dmu(dni $$0, float $$1, float $$2, dlp.a $$3) {
        super($$3.d($$0, $$1, $$2));
    }

    @Override
    public cdc a(dpw $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        eoh $$3 = $$1.a_($$2);
        if ($$0.k() != iz.a) {
            ddm $$4 = $$0.o();
            eoh $$5 = a.get($$3.b());
            eoh $$6 = null;
            if ($$5 != null && $$1.a_($$2.d()).l()) {
                $$1.a((cgk)$$4, $$2, bda.zR, bdb.e, 1.0f, 1.0f);
                $$6 = $$5;
            } else if ($$3.b() instanceof eag && $$3.c(eag.b).booleanValue()) {
                if (!$$1.B_()) {
                    $$1.a(null, 1009, $$2, 0);
                }
                eag.a($$0.o(), (dwp)$$1, $$2, $$3);
                $$6 = (eoh)$$3.b(eag.b, false);
            }
            if ($$6 != null) {
                if (!$$1.B_()) {
                    $$1.a($$2, $$6, 11);
                    $$1.a(etk.c, $$2, etk.a.a($$4, $$6));
                    if ($$4 != null) {
                        $$0.n().a(1, (chl)$$4, $$0.p().a());
                    }
                }
                return cdc.a;
            }
            return cdc.e;
        }
        return cdc.e;
    }
}

