/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class xf
extends ChannelInboundHandlerAdapter {
    private final wn a;

    public xf(wn $$0) {
        this.a = $$0;
    }

    public void channelRead(ChannelHandlerContext $$0, Object $$1) {
        if (($$1 = xb.b($$1)) instanceof ByteBuf) {
            ByteBuf $$2 = (ByteBuf)$$1;
            this.a.a($$2.readableBytes());
        }
        $$0.fireChannelRead($$1);
    }
}

