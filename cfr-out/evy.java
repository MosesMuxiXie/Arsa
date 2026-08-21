/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface evy<P extends evx> {
    public static final evy<ewd> a = evy.a("matching_blocks", ewd.a);
    public static final evy<ewc> b = evy.a("matching_block_tag", ewc.e);
    public static final evy<ewe> c = evy.a("matching_fluids", ewe.a);
    public static final evy<ewa> d = evy.a("has_sturdy_face", ewa.a);
    public static final evy<ewh> e = evy.a("solid", ewh.a);
    public static final evy<ewg> f = evy.a("replaceable", ewg.a);
    public static final evy<ewl> g = evy.a("would_survive", ewl.a);
    public static final evy<ewb> h = evy.a("inside_world_bounds", ewb.a);
    public static final evy<evw> i = evy.a("any_of", evw.a);
    public static final evy<evv> j = evy.a("all_of", evv.a);
    public static final evy<ewf> k = evy.a("not", ewf.a);
    public static final evy<ewj> l = evy.a("true", ewj.e);
    public static final evy<ewk> m = evy.a("unobstructed", ewk.a);

    public MapCodec<P> codec();

    private static <P extends evx> evy<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.M, $$0, () -> $$1);
    }
}

