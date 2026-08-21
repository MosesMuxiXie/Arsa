/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public final class dlv
extends Enum<dlv>
implements bhh {
    public static final /* enum */ dlv a = new dlv(0, "none");
    public static final /* enum */ dlv b = new dlv(1, "eat", true);
    public static final /* enum */ dlv c = new dlv(2, "drink", true);
    public static final /* enum */ dlv d = new dlv(3, "block");
    public static final /* enum */ dlv e = new dlv(4, "bow");
    public static final /* enum */ dlv f = new dlv(5, "trident");
    public static final /* enum */ dlv g = new dlv(6, "crossbow");
    public static final /* enum */ dlv h = new dlv(7, "spyglass");
    public static final /* enum */ dlv i = new dlv(8, "toot_horn");
    public static final /* enum */ dlv j = new dlv(9, "brush");
    public static final /* enum */ dlv k = new dlv(10, "bundle");
    public static final /* enum */ dlv l = new dlv(11, "spear", true);
    private static final IntFunction<dlv> o;
    public static final Codec<dlv> m;
    public static final aao<ByteBuf, dlv> n;
    private final int p;
    private final String q;
    private final boolean r;
    private static final /* synthetic */ dlv[] s;

    public static dlv[] values() {
        return (dlv[])s.clone();
    }

    public static dlv valueOf(String $$0) {
        return Enum.valueOf(dlv.class, $$0);
    }

    private dlv(int $$0, String $$1) {
        this($$0, $$1, false);
    }

    private dlv(int $$0, String $$1, boolean $$2) {
        this.p = $$0;
        this.q = $$1;
        this.r = $$2;
    }

    public int a() {
        return this.p;
    }

    @Override
    public String c() {
        return this.q;
    }

    public boolean b() {
        return this.r;
    }

    private static /* synthetic */ dlv[] d() {
        return new dlv[]{a, b, c, d, e, f, g, h, i, j, k, l};
    }

    static {
        s = dlv.d();
        o = beu.a(dlv::a, dlv.values(), beu.a.a);
        m = bhh.a(dlv::values);
        n = aam.a(o, dlv::a);
    }
}

