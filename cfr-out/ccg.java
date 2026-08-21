/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface ccg<P extends ccf> {
    public static final ccg<ccd> a = ccg.a("constant", ccd.b);
    public static final ccg<ccm> b = ccg.a("uniform", ccm.a);
    public static final ccg<ccb> c = ccg.a("clamped_normal", ccb.a);
    public static final ccg<ccl> d = ccg.a("trapezoid", ccl.a);

    public MapCodec<P> codec();

    public static <P extends ccf> ccg<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.J, $$0, () -> $$1);
    }
}

