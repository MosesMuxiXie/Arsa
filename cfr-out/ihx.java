/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ihx {
    private static final bfm.b<amo, MapCodec<? extends ihy>> b = new bfm.b();
    public static final MapCodec<ihy> a = b.a(amo.a).dispatchMap("property", ihy::a, $$0 -> $$0);

    public static void a() {
        b.a(amo.b("custom_model_data"), ihz.a);
        b.a(amo.b("using_item"), iih.a);
        b.a(amo.b("broken"), ihu.a);
        b.a(amo.b("damaged"), iia.a);
        b.a(amo.b("fishing_rod/cast"), iic.a);
        b.a(amo.b("has_component"), iid.a);
        b.a(amo.b("bundle/has_selected_item"), ihv.a);
        b.a(amo.b("selected"), iig.a);
        b.a(amo.b("carried"), iie.a);
        b.a(amo.b("extended_view"), iib.a);
        b.a(amo.b("keybind_down"), iif.a);
        b.a(amo.b("view_entity"), iii.a);
        b.a(amo.b("component"), ihw.a);
    }
}

