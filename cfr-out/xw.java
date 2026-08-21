/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelDuplexHandler
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandler
 *  io.netty.channel.ChannelOutboundHandler
 *  io.netty.channel.ChannelOutboundHandlerAdapter
 *  io.netty.channel.ChannelPromise
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  io.netty.util.ReferenceCountUtil
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ReferenceCountUtil;

public class xw {
    public static <T extends xk> b a(xn<T> $$0) {
        return xw.a(new xi<T>($$0));
    }

    private static b a(ChannelInboundHandler $$0) {
        return $$1 -> {
            $$1.pipeline().replace($$1.name(), "decoder", (ChannelHandler)$$0);
            $$1.channel().config().setAutoRead(true);
        };
    }

    public static <T extends xk> d b(xn<T> $$0) {
        return xw.a(new xj<T>($$0));
    }

    private static d a(ChannelOutboundHandler $$0) {
        return $$1 -> $$1.pipeline().replace($$1.name(), "encoder", (ChannelHandler)$$0);
    }

    @FunctionalInterface
    public static interface b {
        public void run(ChannelHandlerContext var1);

        default public b andThen(b $$0) {
            return $$1 -> {
                this.run($$1);
                $$0.run($$1);
            };
        }
    }

    @FunctionalInterface
    public static interface d {
        public void run(ChannelHandlerContext var1);

        default public d andThen(d $$0) {
            return $$1 -> {
                this.run($$1);
                $$0.run($$1);
            };
        }
    }

    public static class c
    extends ChannelOutboundHandlerAdapter {
        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) throws Exception {
            if ($$1 instanceof aay) {
                ReferenceCountUtil.release((Object)$$1);
                throw new EncoderException("Pipeline has no outbound protocol configured, can't process packet " + String.valueOf($$1));
            }
            if ($$1 instanceof d) {
                d $$3 = (d)$$1;
                try {
                    $$3.run($$0);
                }
                finally {
                    ReferenceCountUtil.release((Object)$$1);
                }
                $$2.setSuccess();
            } else {
                $$0.write($$1, $$2);
            }
        }
    }

    public static class a
    extends ChannelDuplexHandler {
        public void channelRead(ChannelHandlerContext $$0, Object $$1) {
            if ($$1 instanceof ByteBuf || $$1 instanceof aay) {
                ReferenceCountUtil.release((Object)$$1);
                throw new DecoderException("Pipeline has no inbound protocol configured, can't process packet " + String.valueOf($$1));
            }
            $$0.fireChannelRead($$1);
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) throws Exception {
            if ($$1 instanceof b) {
                b $$3 = (b)$$1;
                try {
                    $$3.run($$0);
                }
                finally {
                    ReferenceCountUtil.release((Object)$$1);
                }
                $$2.setSuccess();
            } else {
                $$0.write($$1, $$2);
            }
        }
    }
}

