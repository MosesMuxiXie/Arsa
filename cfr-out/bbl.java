/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public final class bbl
extends Enum<bbl>
implements bhh {
    public static final /* enum */ bbl a = new bbl("all", 0);
    public static final /* enum */ bbl b = new bbl("moderators", 1);
    public static final /* enum */ bbl c = new bbl("gamemasters", 2);
    public static final /* enum */ bbl d = new bbl("admins", 3);
    public static final /* enum */ bbl e = new bbl("owners", 4);
    public static final Codec<bbl> f;
    private static final IntFunction<bbl> h;
    public static final Codec<bbl> g;
    private final String i;
    private final int j;
    private static final /* synthetic */ bbl[] k;

    public static bbl[] values() {
        return (bbl[])k.clone();
    }

    public static bbl valueOf(String $$0) {
        return Enum.valueOf(bbl.class, $$0);
    }

    private bbl(String $$0, int $$1) {
        this.i = $$0;
        this.j = $$1;
    }

    public boolean a(bbl $$0) {
        return this.j >= $$0.j;
    }

    public static bbl a(int $$0) {
        return h.apply($$0);
    }

    public int a() {
        return this.j;
    }

    @Override
    public String c() {
        return this.i;
    }

    private static /* synthetic */ bbl[] b() {
        return new bbl[]{a, b, c, d, e};
    }

    static {
        k = bbl.b();
        f = bhh.a(bbl::values);
        h = beu.a($$0 -> $$0.j, bbl.values(), beu.a.c);
        g = Codec.INT.xmap(h::apply, $$0 -> $$0.j);
    }
}

