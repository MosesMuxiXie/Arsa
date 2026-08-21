/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fbp<P extends fbo> {
    public static final fbp<fbj> a = fbp.a("blob_foliage_placer", fbj.a);
    public static final fbp<fbu> b = fbp.a("spruce_foliage_placer", fbu.a);
    public static final fbp<fbs> c = fbp.a("pine_foliage_placer", fbs.a);
    public static final fbp<fbi> d = fbp.a("acacia_foliage_placer", fbi.a);
    public static final fbp<fbk> e = fbp.a("bush_foliage_placer", fbk.c);
    public static final fbp<fbn> f = fbp.a("fancy_foliage_placer", fbn.c);
    public static final fbp<fbq> g = fbp.a("jungle_foliage_placer", fbq.a);
    public static final fbp<fbr> h = fbp.a("mega_pine_foliage_placer", fbr.a);
    public static final fbp<fbm> i = fbp.a("dark_oak_foliage_placer", fbm.a);
    public static final fbp<fbt> j = fbp.a("random_spread_foliage_placer", fbt.a);
    public static final fbp<fbl> k = fbp.a("cherry_foliage_placer", fbl.a);
    private final MapCodec<P> l;

    private static <P extends fbo> fbp<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.U, $$0, new fbp<P>($$1));
    }

    private fbp(MapCodec<P> $$0) {
        this.l = $$0;
    }

    public MapCodec<P> a() {
        return this.l;
    }
}

