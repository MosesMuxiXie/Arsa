/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public final class dlr
extends Enum<dlr>
implements bhh {
    public static final /* enum */ dlr a = new dlr(0, "none");
    public static final /* enum */ dlr b = new dlr(1, "thirdperson_lefthand");
    public static final /* enum */ dlr c = new dlr(2, "thirdperson_righthand");
    public static final /* enum */ dlr d = new dlr(3, "firstperson_lefthand");
    public static final /* enum */ dlr e = new dlr(4, "firstperson_righthand");
    public static final /* enum */ dlr f = new dlr(5, "head");
    public static final /* enum */ dlr g = new dlr(6, "gui");
    public static final /* enum */ dlr h = new dlr(7, "ground");
    public static final /* enum */ dlr i = new dlr(8, "fixed");
    public static final /* enum */ dlr j = new dlr(9, "on_shelf");
    public static final Codec<dlr> k;
    public static final IntFunction<dlr> l;
    private final byte m;
    private final String n;
    private static final /* synthetic */ dlr[] o;

    public static dlr[] values() {
        return (dlr[])o.clone();
    }

    public static dlr valueOf(String $$0) {
        return Enum.valueOf(dlr.class, $$0);
    }

    private dlr(int $$0, String $$1) {
        this.n = $$1;
        this.m = (byte)$$0;
    }

    @Override
    public String c() {
        return this.n;
    }

    public byte a() {
        return this.m;
    }

    public boolean b() {
        return this == d || this == e;
    }

    public boolean d() {
        return this == d || this == b;
    }

    private static /* synthetic */ dlr[] e() {
        return new dlr[]{a, b, c, d, e, f, g, h, i, j};
    }

    static {
        o = dlr.e();
        k = bhh.a(dlr::values);
        l = beu.a(dlr::a, dlr.values(), beu.a.a);
    }
}

