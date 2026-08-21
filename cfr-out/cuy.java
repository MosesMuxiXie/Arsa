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

public final class cuy
extends Enum<cuy>
implements bhh {
    public static final /* enum */ cuy a = new cuy(0, "white");
    public static final /* enum */ cuy b = new cuy(1, "creamy");
    public static final /* enum */ cuy c = new cuy(2, "chestnut");
    public static final /* enum */ cuy d = new cuy(3, "brown");
    public static final /* enum */ cuy e = new cuy(4, "black");
    public static final /* enum */ cuy f = new cuy(5, "gray");
    public static final /* enum */ cuy g = new cuy(6, "dark_brown");
    public static final Codec<cuy> h;
    private static final IntFunction<cuy> j;
    public static final aao<ByteBuf, cuy> i;
    private final int k;
    private final String l;
    private static final /* synthetic */ cuy[] m;

    public static cuy[] values() {
        return (cuy[])m.clone();
    }

    public static cuy valueOf(String $$0) {
        return Enum.valueOf(cuy.class, $$0);
    }

    private cuy(int $$0, String $$1) {
        this.k = $$0;
        this.l = $$1;
    }

    public int a() {
        return this.k;
    }

    public static cuy a(int $$0) {
        return j.apply($$0);
    }

    @Override
    public String c() {
        return this.l;
    }

    private static /* synthetic */ cuy[] b() {
        return new cuy[]{a, b, c, d, e, f, g};
    }

    static {
        m = cuy.b();
        h = bhh.a(cuy::values);
        j = beu.a(cuy::a, cuy.values(), beu.a.b);
        i = aam.a(j, cuy::a);
    }
}

