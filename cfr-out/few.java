/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface few<P extends fev> {
    public static final few<feh> a = few.a("block_predicate_filter", feh.a);
    public static final few<fey> b = few.a("rarity_filter", fey.a);
    public static final few<ffa> c = few.a("surface_relative_threshold_filter", ffa.a);
    public static final few<ffb> d = few.a("surface_water_depth_filter", ffb.a);
    public static final few<feg> e = few.a("biome", feg.a);
    public static final few<fek> f = few.a("count", fek.a);
    public static final few<feq> g = few.a("noise_based_count", feq.a);
    public static final few<fer> h = few.a("noise_threshold_count", fer.a);
    public static final few<fej> i = few.a("count_on_every_layer", fej.a);
    public static final few<fel> j = few.a("environment_scan", fel.a);
    public static final few<feo> k = few.a("heightmap", feo.a);
    public static final few<fen> l = few.a("height_range", fen.a);
    public static final few<fep> m = few.a("in_square", fep.a);
    public static final few<fex> n = few.a("random_offset", fex.a);
    public static final few<fem> o = few.a("fixed_placement", fem.a);

    public MapCodec<P> codec();

    private static <P extends fev> few<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.S, $$0, () -> $$1);
    }
}

