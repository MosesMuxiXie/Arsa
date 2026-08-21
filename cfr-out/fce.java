/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fce<P extends fcd> {
    public static final fce<fcm> a = fce.a("simple_state_provider", fcm.b);
    public static final fce<fcn> b = fce.a("weighted_state_provider", fcn.b);
    public static final fce<fci> c = fce.a("noise_threshold_provider", fci.b);
    public static final fce<fch> d = fce.a("noise_provider", fch.g);
    public static final fce<fcf> e = fce.a("dual_noise_provider", fcf.b);
    public static final fce<fck> f = fce.a("rotated_block_provider", fck.b);
    public static final fce<fcj> g = fce.a("randomized_int_state_provider", fcj.b);
    private final MapCodec<P> h;

    private static <P extends fcd> fce<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.T, $$0, new fce<P>($$1));
    }

    private fce(MapCodec<P> $$0) {
        this.h = $$0;
    }

    public MapCodec<P> a() {
        return this.h;
    }
}

