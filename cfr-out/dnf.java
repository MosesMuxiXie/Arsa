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

public final class dnf
extends Enum<dnf>
implements bhh {
    public static final /* enum */ dnf a = new dnf(0, "none");
    public static final /* enum */ dnf b = new dnf(1, "whack");
    public static final /* enum */ dnf c = new dnf(2, "stab");
    private static final IntFunction<dnf> f;
    public static final Codec<dnf> d;
    public static final aao<ByteBuf, dnf> e;
    private final int g;
    private final String h;
    private static final /* synthetic */ dnf[] i;

    public static dnf[] values() {
        return (dnf[])i.clone();
    }

    public static dnf valueOf(String $$0) {
        return Enum.valueOf(dnf.class, $$0);
    }

    private dnf(int $$0, String $$1) {
        this.g = $$0;
        this.h = $$1;
    }

    public int a() {
        return this.g;
    }

    @Override
    public String c() {
        return this.h;
    }

    private static /* synthetic */ dnf[] b() {
        return new dnf[]{a, b, c};
    }

    static {
        i = dnf.b();
        f = beu.a(dnf::a, dnf.values(), beu.a.a);
        d = bhh.a(dnf::values);
        e = aam.a(f, dnf::a);
    }
}

