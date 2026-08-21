/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class wp
extends MessageToMessageDecoder<ByteBuf> {
    private final wo a;

    public wp(Cipher $$0) {
        this.a = new wo($$0);
    }

    protected void a(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
        $$2.add(this.a.a($$0, $$1));
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.a(channelHandlerContext, (ByteBuf)object, list);
    }
}

