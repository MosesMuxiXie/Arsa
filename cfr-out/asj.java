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
import java.util.Optional;

public interface asj {
    public static final Codec<Integer> b = bfm.a(1, 1024);
    public static final Codec<asj> c = mi.aH.q().dispatch(asj::a, $$0 -> $$0);
    public static final Codec<jd<asj>> d = amq.a(mj.bc, c);
    public static final Codec<jh<asj>> e = js.a(mj.bc, c);
    public static final aao<xq, jd<asj>> f = aam.a(mj.bc, aam.c(c));
    public static final aao<ByteBuf, asj> g = aam.a(c);

    public ash A_();

    public MapCodec<? extends asj> a();

    public Optional<ast> d();
}

