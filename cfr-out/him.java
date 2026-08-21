/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.util.concurrent.GenericFutureListener
 */
import com.google.common.base.Splitter;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.List;

public class him
extends SimpleChannelInboundHandler<ByteBuf> {
    private static final Splitter a = Splitter.on((char)'\u0000').limit(6);
    private final hjw b;
    private final a c;

    public him(hjw $$0, a $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public void channelActive(ChannelHandlerContext $$0) throws Exception {
        super.channelActive($$0);
        ByteBuf $$1 = $$0.alloc().buffer();
        try {
            $$1.writeByte(254);
            $$1.writeByte(1);
            $$1.writeByte(250);
            axz.a($$1, "MC|PingHost");
            int $$2 = $$1.writerIndex();
            $$1.writeShort(0);
            int $$3 = $$1.writerIndex();
            $$1.writeByte(127);
            axz.a($$1, this.b.a());
            $$1.writeInt(this.b.b());
            int $$4 = $$1.writerIndex() - $$3;
            $$1.setShort($$2, $$4);
            $$0.channel().writeAndFlush((Object)$$1).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
        }
        catch (Exception $$5) {
            $$1.release();
            throw $$5;
        }
    }

    protected void a(ChannelHandlerContext $$0, ByteBuf $$1) {
        String $$3;
        List $$4;
        short $$2 = $$1.readUnsignedByte();
        if ($$2 == 255 && "\u00a71".equals(($$4 = a.splitToList((CharSequence)($$3 = axz.a($$1)))).get(0))) {
            int $$5 = bgj.a((String)$$4.get(1), 0);
            String $$6 = (String)$$4.get(2);
            String $$7 = (String)$$4.get(3);
            int $$8 = bgj.a((String)$$4.get(4), -1);
            int $$9 = bgj.a((String)$$4.get(5), -1);
            this.c.handleResponse($$5, $$6, $$7, $$8, $$9);
        }
        $$0.close();
    }

    public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
        $$0.close();
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        this.a(channelHandlerContext, (ByteBuf)object);
    }

    @FunctionalInterface
    public static interface a {
        public void handleResponse(int var1, String var2, String var3, int var4, int var5);
    }
}

