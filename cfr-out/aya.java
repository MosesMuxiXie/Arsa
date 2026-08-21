/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.SocketAddress;
import java.util.Locale;
import org.slf4j.Logger;

public class aya
extends ChannelInboundHandlerAdapter {
    private static final Logger a = LogUtils.getLogger();
    private final anj b;

    public aya(anj $$0) {
        this.b = $$0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void channelRead(ChannelHandlerContext $$0, Object $$1) {
        ByteBuf $$2 = (ByteBuf)$$1;
        $$2.markReaderIndex();
        boolean $$3 = true;
        try {
            if ($$2.readUnsignedByte() != 254) {
                return;
            }
            SocketAddress $$4 = $$0.channel().remoteAddress();
            int $$5 = $$2.readableBytes();
            if ($$5 == 0) {
                a.debug("Ping: (<1.3.x) from {}", (Object)$$4);
                String $$6 = aya.a(this.b);
                aya.a($$0, aya.a($$0.alloc(), $$6));
            } else {
                if ($$2.readUnsignedByte() != 1) {
                    return;
                }
                if ($$2.isReadable()) {
                    if (!aya.a($$2)) {
                        return;
                    }
                    a.debug("Ping: (1.6) from {}", (Object)$$4);
                } else {
                    a.debug("Ping: (1.4-1.5.x) from {}", (Object)$$4);
                }
                String $$7 = aya.b(this.b);
                aya.a($$0, aya.a($$0.alloc(), $$7));
            }
            $$2.release();
            $$3 = false;
        }
        catch (RuntimeException runtimeException) {
        }
        finally {
            if ($$3) {
                $$2.resetReaderIndex();
                $$0.channel().pipeline().remove((ChannelHandler)this);
                $$0.fireChannelRead($$1);
            }
        }
    }

    private static boolean a(ByteBuf $$0) {
        short $$1 = $$0.readUnsignedByte();
        if ($$1 != 250) {
            return false;
        }
        String $$2 = axz.a($$0);
        if (!"MC|PingHost".equals($$2)) {
            return false;
        }
        int $$3 = $$0.readUnsignedShort();
        if ($$0.readableBytes() != $$3) {
            return false;
        }
        short $$4 = $$0.readUnsignedByte();
        if ($$4 < 73) {
            return false;
        }
        String $$5 = axz.a($$0);
        int $$6 = $$0.readInt();
        return $$6 <= 65535;
    }

    private static String a(anj $$0) {
        return String.format(Locale.ROOT, "%s\u00a7%d\u00a7%d", $$0.ah(), $$0.R(), $$0.r());
    }

    private static String b(anj $$0) {
        return String.format(Locale.ROOT, "\u00a71\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, $$0.Q(), $$0.ah(), $$0.R(), $$0.r());
    }

    private static void a(ChannelHandlerContext $$0, ByteBuf $$1) {
        $$0.pipeline().firstContext().writeAndFlush((Object)$$1).addListener((GenericFutureListener)ChannelFutureListener.CLOSE);
    }

    private static ByteBuf a(ByteBufAllocator $$0, String $$1) {
        ByteBuf $$2 = $$0.buffer();
        $$2.writeByte(255);
        axz.a($$2, $$1);
        return $$2;
    }
}

