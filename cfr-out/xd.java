/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelOutboundHandlerAdapter
 *  io.netty.channel.ChannelPromise
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

public class xd
extends ChannelOutboundHandlerAdapter {
    public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) {
        $$0.write(xb.a($$1), $$2);
    }
}

