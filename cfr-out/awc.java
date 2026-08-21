/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 *  io.netty.handler.codec.http.websocketx.TextWebSocketFrame
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import java.util.List;

public class awc
extends MessageToMessageDecoder<TextWebSocketFrame> {
    protected void a(ChannelHandlerContext $$0, TextWebSocketFrame $$1, List<Object> $$2) {
        JsonElement $$3 = JsonParser.parseString((String)$$1.text());
        $$2.add($$3);
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.a(channelHandlerContext, (TextWebSocketFrame)object, list);
    }
}

