/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface ffx<S extends ffo> {
    public static final ffx<fhi> a = ffx.a("buried_treasure", fhi.d);
    public static final ffx<fhk> b = ffx.a("desert_pyramid", fhk.d);
    public static final ffx<fhm> c = ffx.a("end_city", fhm.d);
    public static final ffx<fhv> d = ffx.a("fortress", fhv.e);
    public static final ffx<fho> e = ffx.a("igloo", fho.d);
    public static final ffx<fhp> f = ffx.a("jigsaw", fhp.i);
    public static final ffx<fhr> g = ffx.a("jungle_temple", fhr.d);
    public static final ffx<fht> h = ffx.a("mineshaft", fht.d);
    public static final ffx<fhx> i = ffx.a("nether_fossil", fhx.d);
    public static final ffx<fhz> j = ffx.a("ocean_monument", fhz.d);
    public static final ffx<fib> k = ffx.a("ocean_ruin", fib.d);
    public static final ffx<fid> l = ffx.a("ruined_portal", fid.d);
    public static final ffx<fif> m = ffx.a("shipwreck", fif.d);
    public static final ffx<fih> n = ffx.a("stronghold", fih.d);
    public static final ffx<fij> o = ffx.a("swamp_hut", fij.d);
    public static final ffx<fil> p = ffx.a("woodland_mansion", fil.d);

    public MapCodec<S> codec();

    private static <S extends ffo> ffx<S> a(String $$0, MapCodec<S> $$1) {
        return jq.a(mi.R, $$0, () -> $$1);
    }
}

