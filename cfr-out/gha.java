/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class gha {
    private static final bfm.b<amo, MapCodec<? extends ggz>> b = new bfm.b();
    public static final Codec<ggz> a = b.a(amo.a).dispatch(ggz::a, $$0 -> $$0);

    public static void a() {
        b.a(amo.b("custom_model_data"), ggv.a);
        b.a(amo.b("constant"), ggu.a);
        b.a(amo.b("dye"), ggw.a);
        b.a(amo.b("grass"), ggy.a);
        b.a(amo.b("firework"), ggx.a);
        b.a(amo.b("potion"), ghc.a);
        b.a(amo.b("map_color"), ghb.a);
        b.a(amo.b("team"), ghd.a);
    }
}

