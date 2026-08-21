/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 */
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;

public interface xo {
    public static void a(ChannelHandlerContext $$0, aay<?> $$1) {
        if ($$1.d()) {
            $$0.channel().config().setAutoRead(false);
            $$0.pipeline().addBefore($$0.name(), "inbound_config", (ChannelHandler)new xw.a());
            $$0.pipeline().remove($$0.name());
        }
    }

    public static void b(ChannelHandlerContext $$0, aay<?> $$1) {
        if ($$1.d()) {
            $$0.pipeline().addAfter($$0.name(), "outbound_config", (ChannelHandler)new xw.c());
            $$0.pipeline().remove($$0.name());
        }
    }
}

