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

public final class dqf
extends Enum<dqf>
implements bhh {
    public static final /* enum */ dqf a = new dqf("building", 0);
    public static final /* enum */ dqf b = new dqf("redstone", 1);
    public static final /* enum */ dqf c = new dqf("equipment", 2);
    public static final /* enum */ dqf d = new dqf("misc", 3);
    public static final Codec<dqf> e;
    public static final IntFunction<dqf> f;
    public static final aao<ByteBuf, dqf> g;
    private final String h;
    private final int i;
    private static final /* synthetic */ dqf[] j;

    public static dqf[] values() {
        return (dqf[])j.clone();
    }

    public static dqf valueOf(String $$0) {
        return Enum.valueOf(dqf.class, $$0);
    }

    private dqf(String $$0, int $$1) {
        this.h = $$0;
        this.i = $$1;
    }

    @Override
    public String c() {
        return this.h;
    }

    private int a() {
        return this.i;
    }

    private static /* synthetic */ dqf[] b() {
        return new dqf[]{a, b, c, d};
    }

    static {
        j = dqf.b();
        e = bhh.a(dqf::values);
        f = beu.a(dqf::a, dqf.values(), beu.a.a);
        g = aam.a(f, dqf::a);
    }
}

