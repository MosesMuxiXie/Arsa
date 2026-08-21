/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public interface abf<T extends xk, B extends ByteBuf, C>
extends xn.b {
    public xn<T> a(Function<ByteBuf, B> var1, C var2);
}

