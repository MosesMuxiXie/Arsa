/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface fje<P extends fjd> {
    public static final fje<fjc> a = fje.a("always_true", fjc.a);
    public static final fje<fiz> b = fje.a("linear_pos", fiz.a);
    public static final fje<fio> c = fje.a("axis_aligned_linear_pos", fio.a);

    public MapCodec<P> codec();

    public static <P extends fjd> fje<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.p, $$0, () -> $$1);
    }
}

