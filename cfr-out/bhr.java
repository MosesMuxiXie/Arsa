/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public final class bhr
extends Enum<bhr> {
    public static final /* enum */ bhr a = new bhr();
    public static final Codec<bhr> b;
    public static final aao<ByteBuf, bhr> c;
    private static final /* synthetic */ bhr[] d;

    public static bhr[] values() {
        return (bhr[])d.clone();
    }

    public static bhr valueOf(String $$0) {
        return Enum.valueOf(bhr.class, $$0);
    }

    private static /* synthetic */ bhr[] a() {
        return new bhr[]{a};
    }

    static {
        d = bhr.a();
        b = MapCodec.unitCodec((Object)((Object)a));
        c = aao.a(a);
    }
}

