/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class iiu {
    private static final bfm.b<amo, MapCodec<? extends iiv>> b = new bfm.b();
    public static final MapCodec<iiv> a = b.a(amo.a).dispatchMap("property", iiv::a, $$0 -> $$0);

    public static void a() {
        b.a(amo.b("custom_model_data"), iir.a);
        b.a(amo.b("bundle/fullness"), iil.a);
        b.a(amo.b("damage"), iis.a);
        b.a(amo.b("cooldown"), iio.a);
        b.a(amo.b("time"), iiw.a);
        b.a(amo.b("compass"), iim.a);
        b.a(amo.b("crossbow/pull"), iiq.a);
        b.a(amo.b("use_cycle"), iix.a);
        b.a(amo.b("use_duration"), iiy.a);
        b.a(amo.b("count"), iip.a);
    }
}

