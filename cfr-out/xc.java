/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class xc
extends ChannelInboundHandlerAdapter {
    public void channelRead(ChannelHandlerContext $$0, Object $$1) {
        $$0.fireChannelRead(xb.b($$1));
    }
}

