/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class wq
extends MessageToByteEncoder<ByteBuf> {
    private final wo a;

    public wq(Cipher $$0) {
        this.a = new wo($$0);
    }

    protected void a(ChannelHandlerContext $$0, ByteBuf $$1, ByteBuf $$2) throws Exception {
        this.a.a($$1, $$2);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.a(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}

