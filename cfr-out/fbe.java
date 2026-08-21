/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fbe<P extends fbd> {
    public static final fbe<fbg> a = fbe.a("two_layers_feature_size", fbg.d);
    public static final fbe<fbf> b = fbe.a("three_layers_feature_size", fbf.d);
    private final MapCodec<P> c;

    private static <P extends fbd> fbe<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.Y, $$0, new fbe<P>($$1));
    }

    private fbe(MapCodec<P> $$0) {
        this.c = $$0;
    }

    public MapCodec<P> a() {
        return this.c;
    }
}

