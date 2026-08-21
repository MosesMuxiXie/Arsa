/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fcb<P extends fca> {
    public static final fcb<fbz> a = fcb.a("mangrove_root_placer", fbz.c);
    private final MapCodec<P> b;

    private static <P extends fca> fcb<P> a(String $$0, MapCodec<P> $$1) {
        return jq.a(mi.W, $$0, new fcb<P>($$1));
    }

    private fcb(MapCodec<P> $$0) {
        this.b = $$0;
    }

    public MapCodec<P> a() {
        return this.b;
    }
}

