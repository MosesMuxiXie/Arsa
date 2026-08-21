/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class dwy
extends Enum<dwy>
implements bhh {
    public static final /* enum */ dwy a = new dwy(0, "full_moon");
    public static final /* enum */ dwy b = new dwy(1, "waning_gibbous");
    public static final /* enum */ dwy c = new dwy(2, "third_quarter");
    public static final /* enum */ dwy d = new dwy(3, "waning_crescent");
    public static final /* enum */ dwy e = new dwy(4, "new_moon");
    public static final /* enum */ dwy f = new dwy(5, "waxing_crescent");
    public static final /* enum */ dwy g = new dwy(6, "first_quarter");
    public static final /* enum */ dwy h = new dwy(7, "waxing_gibbous");
    public static final Codec<dwy> i;
    public static final int j;
    public static final int k = 24000;
    private final int l;
    private final String m;
    private static final /* synthetic */ dwy[] n;

    public static dwy[] values() {
        return (dwy[])n.clone();
    }

    public static dwy valueOf(String $$0) {
        return Enum.valueOf(dwy.class, $$0);
    }

    private dwy(int $$0, String $$1) {
        this.l = $$0;
        this.m = $$1;
    }

    public int a() {
        return this.l;
    }

    public int b() {
        return this.l * 24000;
    }

    @Override
    public String c() {
        return this.m;
    }

    private static /* synthetic */ dwy[] d() {
        return new dwy[]{a, b, c, d, e, f, g, h};
    }

    static {
        n = dwy.d();
        i = bhh.a(dwy::values);
        j = dwy.values().length;
    }
}

