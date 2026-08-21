/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public final class gok
extends Enum<gok>
implements bhh {
    public static final /* enum */ gok a = new gok("bitmap", goh.a.a);
    public static final /* enum */ gok b = new gok("ttf", gom.a);
    public static final /* enum */ gok c = new gok("space", fwr.a.a);
    public static final /* enum */ gok d = new gok("unihex", gon.b.a);
    public static final /* enum */ gok e = new gok("reference", gol.a);
    public static final Codec<gok> f;
    private final String g;
    private final MapCodec<? extends goj> h;
    private static final /* synthetic */ gok[] i;

    public static gok[] values() {
        return (gok[])i.clone();
    }

    public static gok valueOf(String $$0) {
        return Enum.valueOf(gok.class, $$0);
    }

    private gok(String $$0, MapCodec<? extends goj> $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    @Override
    public String c() {
        return this.g;
    }

    public MapCodec<? extends goj> a() {
        return this.h;
    }

    private static /* synthetic */ gok[] b() {
        return new gok[]{a, b, c, d, e};
    }

    static {
        i = gok.b();
        f = bhh.a(gok::values);
    }
}

