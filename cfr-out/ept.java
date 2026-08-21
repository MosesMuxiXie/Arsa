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

public final class ept
extends Enum<ept>
implements bhh {
    public static final /* enum */ ept a = new ept(0, "start");
    public static final /* enum */ ept b = new ept(1, "log");
    public static final /* enum */ ept c = new ept(2, "fail");
    public static final /* enum */ ept d = new ept(3, "accept");
    private static final IntFunction<ept> g;
    public static final Codec<ept> e;
    public static final aao<ByteBuf, ept> f;
    private final int h;
    private final String i;
    private final yh j;
    private final yh k;
    private static final /* synthetic */ ept[] l;

    public static ept[] values() {
        return (ept[])l.clone();
    }

    public static ept valueOf(String $$0) {
        return Enum.valueOf(ept.class, $$0);
    }

    private ept(int $$0, String $$1) {
        this.h = $$0;
        this.i = $$1;
        this.j = yh.c("test_block.mode." + $$1);
        this.k = yh.c("test_block.mode_info." + $$1);
    }

    @Override
    public String c() {
        return this.i;
    }

    public yh a() {
        return this.j;
    }

    public yh b() {
        return this.k;
    }

    private static /* synthetic */ ept[] d() {
        return new ept[]{a, b, c, d};
    }

    static {
        l = ept.d();
        g = beu.a($$0 -> $$0.h, ept.values(), beu.a.a);
        e = bhh.a(ept::values);
        f = aam.a(g, (T $$0) -> $$0.h);
    }
}

