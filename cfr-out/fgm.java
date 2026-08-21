/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface fgm<SP extends fgl> {
    public static final fgm<fgj> a = fgm.a("random_spread", fgj.a);
    public static final fgm<fgi> b = fgm.a("concentric_rings", fgi.a);

    public MapCodec<SP> codec();

    private static <SP extends fgl> fgm<SP> a(String $$0, MapCodec<SP> $$1) {
        return jq.a(mi.P, $$0, () -> $$1);
    }
}

