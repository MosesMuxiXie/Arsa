/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public final class cqt
extends Enum<cqt>
implements bhh {
    public static final /* enum */ cqt a = new cqt("major_negative", -5, 100, 10, 10);
    public static final /* enum */ cqt b = new cqt("minor_negative", -1, 200, 20, 20);
    public static final /* enum */ cqt c = new cqt("minor_positive", 1, 25, 1, 5);
    public static final /* enum */ cqt d = new cqt("major_positive", 5, 20, 0, 20);
    public static final /* enum */ cqt e = new cqt("trading", 1, 25, 2, 20);
    public static final int f = 25;
    public static final int g = 20;
    public static final int h = 2;
    public final String i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public static final Codec<cqt> n;
    private static final /* synthetic */ cqt[] o;

    public static cqt[] values() {
        return (cqt[])o.clone();
    }

    public static cqt valueOf(String $$0) {
        return Enum.valueOf(cqt.class, $$0);
    }

    private cqt(String $$0, int $$1, int $$2, int $$3, int $$4) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
        this.l = $$3;
        this.m = $$4;
    }

    @Override
    public String c() {
        return this.i;
    }

    private static /* synthetic */ cqt[] a() {
        return new cqt[]{a, b, c, d, e};
    }

    static {
        o = cqt.a();
        n = bhh.a(cqt::values);
    }
}

