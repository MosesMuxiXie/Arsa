/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface fjz<P extends fjy> {
    public static final fjz<fjw> a = fjz.a("clear", fjw.a);
    public static final fjz<fjx> b = fjz.a("passthrough", fjx.b);
    public static final fjz<fjv> c = fjz.a("append_static", fjv.a);
    public static final fjz<fju> d = fjz.a("append_loot", fju.a);

    public MapCodec<P> codec();

    private static <P extends fjy> fjz<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.o, $$0, () -> $$1);
    }
}

