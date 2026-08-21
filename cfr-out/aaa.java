/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class aaa {
    private static final bfm.b<String, MapCodec<? extends zz>> b = new bfm.b();
    public static final MapCodec<zz> a = yj.a(b, zz::a, "object");

    static {
        b.a("atlas", zy.b);
        b.a("player", aab.a);
    }
}

