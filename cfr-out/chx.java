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

public final class chx
extends Enum<chx>
implements bhh {
    public static final /* enum */ chx a = new chx(0, "standing");
    public static final /* enum */ chx b = new chx(1, "fall_flying");
    public static final /* enum */ chx c = new chx(2, "sleeping");
    public static final /* enum */ chx d = new chx(3, "swimming");
    public static final /* enum */ chx e = new chx(4, "spin_attack");
    public static final /* enum */ chx f = new chx(5, "crouching");
    public static final /* enum */ chx g = new chx(6, "long_jumping");
    public static final /* enum */ chx h = new chx(7, "dying");
    public static final /* enum */ chx i = new chx(8, "croaking");
    public static final /* enum */ chx j = new chx(9, "using_tongue");
    public static final /* enum */ chx k = new chx(10, "sitting");
    public static final /* enum */ chx l = new chx(11, "roaring");
    public static final /* enum */ chx m = new chx(12, "sniffing");
    public static final /* enum */ chx n = new chx(13, "emerging");
    public static final /* enum */ chx o = new chx(14, "digging");
    public static final /* enum */ chx p = new chx(15, "sliding");
    public static final /* enum */ chx q = new chx(16, "shooting");
    public static final /* enum */ chx r = new chx(17, "inhaling");
    public static final IntFunction<chx> s;
    public static final Codec<chx> t;
    public static final aao<ByteBuf, chx> u;
    private final int v;
    private final String w;
    private static final /* synthetic */ chx[] x;

    public static chx[] values() {
        return (chx[])x.clone();
    }

    public static chx valueOf(String $$0) {
        return Enum.valueOf(chx.class, $$0);
    }

    private chx(int $$0, String $$1) {
        this.v = $$0;
        this.w = $$1;
    }

    public int a() {
        return this.v;
    }

    @Override
    public String c() {
        return this.w;
    }

    private static /* synthetic */ chx[] b() {
        return new chx[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r};
    }

    static {
        x = chx.b();
        s = beu.a(chx::a, chx.values(), beu.a.a);
        t = bhh.a(chx::values);
        u = aam.a(s, chx::a);
    }
}

