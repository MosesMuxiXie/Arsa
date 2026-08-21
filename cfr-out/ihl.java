/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class ihl {
    private static final bfm.b<amo, MapCodec<? extends ihj.b>> b = new bfm.b();
    public static final Codec<ihj.b> a = b.a(amo.a).dispatch(ihj.b::a, $$0 -> $$0);

    public static void a() {
        b.a(amo.b("empty"), ihi.a.a);
        b.a(amo.b("model"), ihd.a.a);
        b.a(amo.b("range_dispatch"), ihp.b.a);
        b.a(amo.b("special"), ihr.a.a);
        b.a(amo.b("composite"), ihg.a.a);
        b.a(amo.b("bundle/selected_item"), ihe.a.a);
        b.a(amo.b("select"), ihq.c.a);
        b.a(amo.b("condition"), ihh.a.a);
    }
}

