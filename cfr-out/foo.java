/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class foo {
    public static final Codec<foq> a = mi.D.q().dispatch(foq::a, fos::a);
    public static final fos b = foo.a("empty", fol.a);
    public static final fos c = foo.a("item", fon.a);
    public static final fos d = foo.a("loot_table", fou.a);
    public static final fos e = foo.a("dynamic", fok.a);
    public static final fos f = foo.a("tag", fox.a);
    public static final fos g = foo.a("slots", fow.a);
    public static final fos h = foo.a("alternatives", foh.a);
    public static final fos i = foo.a("sequence", fov.a);
    public static final fos j = foo.a("group", fom.a);

    private static fos a(String $$0, MapCodec<? extends foq> $$1) {
        return jq.a(mi.D, amo.b($$0), new fos($$1));
    }
}

