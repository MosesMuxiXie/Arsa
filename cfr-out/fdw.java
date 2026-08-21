/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface fdw<P extends fdv> {
    public static final fdw<fdu> a = fdw.a("constant", fdu.b);
    public static final fdw<fdy> b = fdw.a("uniform", fdy.a);
    public static final fdw<fdt> c = fdw.a("biased_to_bottom", fdt.a);
    public static final fdw<fdz> d = fdw.a("very_biased_to_bottom", fdz.a);
    public static final fdw<fdx> e = fdw.a("trapezoid", fdx.a);
    public static final fdw<fea> f = fdw.a("weighted_list", fea.a);

    public MapCodec<P> codec();

    private static <P extends fdv> fdw<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.L, $$0, () -> $$1);
    }
}

