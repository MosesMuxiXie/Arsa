/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public interface abe<T extends xk, B extends ByteBuf>
extends xn.b {
    public xn<T> a(Function<ByteBuf, B> var1);
}

