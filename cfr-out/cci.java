/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface cci<P extends cch> {
    public static final cci<cce> a = cci.a("constant", cce.b);
    public static final cci<ccn> b = cci.a("uniform", ccn.a);
    public static final cci<cbz> c = cci.a("biased_to_bottom", cbz.a);
    public static final cci<cca> d = cci.a("clamped", cca.a);
    public static final cci<cco> e = cci.a("weighted_list", cco.a);
    public static final cci<ccc> f = cci.a("clamped_normal", ccc.a);

    public MapCodec<P> codec();

    public static <P extends cch> cci<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.K, $$0, () -> $$1);
    }
}

