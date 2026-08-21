/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 */
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public final class ddc {
    public static final amt<ddc> a = ddc.a("desert");
    public static final amt<ddc> b = ddc.a("jungle");
    public static final amt<ddc> c = ddc.a("plains");
    public static final amt<ddc> d = ddc.a("savanna");
    public static final amt<ddc> e = ddc.a("snow");
    public static final amt<ddc> f = ddc.a("swamp");
    public static final amt<ddc> g = ddc.a("taiga");
    public static final Codec<jd<ddc>> h = amr.a(mj.aM);
    public static final aao<xq, jd<ddc>> i = aam.b(mj.aM);
    private static final Map<amt<dxo>, amt<ddc>> j = bhs.a(Maps.newHashMap(), (? super T $$0) -> {
        $$0.put(dxv.B, a);
        $$0.put(dxv.f, a);
        $$0.put(dxv.C, a);
        $$0.put(dxv.D, a);
        $$0.put(dxv.A, b);
        $$0.put(dxv.y, b);
        $$0.put(dxv.z, b);
        $$0.put(dxv.t, d);
        $$0.put(dxv.s, d);
        $$0.put(dxv.x, d);
        $$0.put(dxv.Y, e);
        $$0.put(dxv.X, e);
        $$0.put(dxv.M, e);
        $$0.put(dxv.e, e);
        $$0.put(dxv.O, e);
        $$0.put(dxv.r, e);
        $$0.put(dxv.d, e);
        $$0.put(dxv.G, e);
        $$0.put(dxv.H, e);
        $$0.put(dxv.I, e);
        $$0.put(dxv.J, e);
        $$0.put(dxv.g, f);
        $$0.put(dxv.h, f);
        $$0.put(dxv.p, g);
        $$0.put(dxv.o, g);
        $$0.put(dxv.v, g);
        $$0.put(dxv.u, g);
        $$0.put(dxv.q, g);
        $$0.put(dxv.w, g);
    });

    private static amt<ddc> a(String $$0) {
        return amt.a(mj.aM, amo.b($$0));
    }

    private static ddc a(jq<ddc> $$0, amt<ddc> $$1) {
        return jq.a($$0, $$1, new ddc());
    }

    public static ddc a(jq<ddc> $$0) {
        ddc.a($$0, a);
        ddc.a($$0, b);
        ddc.a($$0, c);
        ddc.a($$0, d);
        ddc.a($$0, e);
        ddc.a($$0, f);
        return ddc.a($$0, g);
    }

    public static amt<ddc> a(jd<dxo> $$0) {
        return $$0.e().map(j::get).orElse(c);
    }
}

