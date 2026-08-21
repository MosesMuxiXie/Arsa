/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class bu {
    public static final MapCodec<cm> a = bu.a("lightning", cm.b);
    public static final MapCodec<by> b = bu.a("fishing_hook", by.c);
    public static final MapCodec<cx> c = bu.a("player", cx.c);
    public static final MapCodec<dh> d = bu.a("slime", dh.b);
    public static final MapCodec<cz> e = bu.a("raider", cz.b);
    public static final MapCodec<dc> f = bu.a("sheep", dc.b);

    private static <T extends bt> MapCodec<T> a(String $$0, MapCodec<T> $$1) {
        return jq.a(mi.ao, $$0, $$1);
    }

    public static MapCodec<? extends bt> a(jq<MapCodec<? extends bt>> $$0) {
        return a;
    }
}

