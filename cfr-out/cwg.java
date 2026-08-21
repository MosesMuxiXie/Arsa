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

public final class cwg
extends Enum<cwg>
implements bhh {
    public static final /* enum */ cwg a = new cwg("idle", 0);
    public static final /* enum */ cwg b = new cwg("getting_item", 1);
    public static final /* enum */ cwg c = new cwg("getting_no_item", 2);
    public static final /* enum */ cwg d = new cwg("dropping_item", 3);
    public static final /* enum */ cwg e = new cwg("dropping_no_item", 4);
    public static final Codec<cwg> f;
    private static final IntFunction<cwg> h;
    public static final aao<ByteBuf, cwg> g;
    private final String i;
    private final int j;
    private static final /* synthetic */ cwg[] k;

    public static cwg[] values() {
        return (cwg[])k.clone();
    }

    public static cwg valueOf(String $$0) {
        return Enum.valueOf(cwg.class, $$0);
    }

    private cwg(String $$0, int $$1) {
        this.i = $$0;
        this.j = $$1;
    }

    @Override
    public String c() {
        return this.i;
    }

    private int a() {
        return this.j;
    }

    private static /* synthetic */ cwg[] b() {
        return new cwg[]{a, b, c, d, e};
    }

    static {
        k = cwg.b();
        f = bhh.a(cwg::values);
        h = beu.a(cwg::a, cwg.values(), beu.a.a);
        g = aam.a(h, cwg::a);
    }
}

