/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;

public class xj<T extends xk>
extends MessageToByteEncoder<aay<T>> {
    private static final Logger a = LogUtils.getLogger();
    private final xn<T> b;

    public xj(xn<T> $$0) {
        this.b = $$0;
    }

    protected void a(ChannelHandlerContext $$0, aay<T> $$1, ByteBuf $$2) throws Exception {
        aba<aay<T>> $$3 = $$1.a();
        try {
            this.b.c().encode($$2, $$1);
            int $$4 = $$2.readableBytes();
            if (a.isDebugEnabled()) {
                a.debug(wu.d, "OUT: [{}:{}] {} -> {} bytes", new Object[]{this.b.a().a(), $$3, $$1.getClass().getName(), $$4});
            }
            bzu.f.b(this.b.a(), $$3, $$0.channel().remoteAddress(), $$4);
        }
        catch (Throwable $$5) {
            a.error("Error sending packet {}", $$3, (Object)$$5);
            if ($$1.c()) {
                throw new xt($$5);
            }
            throw $$5;
        }
        finally {
            xo.b($$0, $$1);
        }
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.a(channelHandlerContext, (aay)object, byteBuf);
    }
}

