/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface fgx<P extends fgw> {
    public static final fgx<fgv> a = fgx.a("single_pool_element", fgv.b);
    public static final fgx<fgu> b = fgx.a("list_pool_element", fgu.a);
    public static final fgx<fgq> c = fgx.a("feature_pool_element", fgq.a);
    public static final fgx<fgp> d = fgx.a("empty_pool_element", fgp.a);
    public static final fgx<fgt> e = fgx.a("legacy_single_pool_element", fgt.a);

    public MapCodec<P> codec();

    public static <P extends fgw> fgx<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.ag, $$0, () -> $$1);
    }
}

