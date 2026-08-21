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

public final class chb
extends Enum<chb>
implements bhh {
    public static final /* enum */ chb a = new chb(0, "left", "options.mainHand.left");
    public static final /* enum */ chb b = new chb(1, "right", "options.mainHand.right");
    public static final Codec<chb> c;
    private static final IntFunction<chb> e;
    public static final aao<ByteBuf, chb> d;
    private final int f;
    private final String g;
    private final yh h;
    private static final /* synthetic */ chb[] i;

    public static chb[] values() {
        return (chb[])i.clone();
    }

    public static chb valueOf(String $$0) {
        return Enum.valueOf(chb.class, $$0);
    }

    private chb(int $$0, String $$1, String $$2) {
        this.f = $$0;
        this.g = $$1;
        this.h = yh.c($$2);
    }

    public chb a() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> b;
            case 1 -> a;
        };
    }

    public yh b() {
        return this.h;
    }

    @Override
    public String c() {
        return this.g;
    }

    private static /* synthetic */ chb[] d() {
        return new chb[]{a, b};
    }

    static {
        i = chb.d();
        c = bhh.a(chb::values);
        e = beu.a($$0 -> $$0.f, chb.values(), beu.a.a);
        d = aam.a(e, (T $$0) -> $$0.f);
    }
}

