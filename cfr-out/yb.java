/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.EncoderException
 *  io.netty.handler.codec.MessageToByteEncoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToByteEncoder;

@ChannelHandler.Sharable
public class yb
extends MessageToByteEncoder<ByteBuf> {
    public static final int a = 3;

    protected void a(ChannelHandlerContext $$0, ByteBuf $$1, ByteBuf $$2) {
        int $$3 = $$1.readableBytes();
        int $$4 = xy.a($$3);
        if ($$4 > 3) {
            throw new EncoderException("Packet too large: size " + $$3 + " is over 8");
        }
        $$2.ensureWritable($$4 + $$3);
        xy.a($$2, $$3);
        $$2.writeBytes($$1, $$1.readerIndex(), $$3);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.a(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}

