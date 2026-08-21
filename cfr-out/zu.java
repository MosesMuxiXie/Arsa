/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class zu {
    private static final bfm.b<String, MapCodec<? extends zt>> b = new bfm.b();
    public static final MapCodec<zt> a = yj.a(b, zt::a, "source");

    static {
        b.a("entity", zv.a);
        b.a("block", zs.a);
        b.a("storage", zw.a);
    }
}

