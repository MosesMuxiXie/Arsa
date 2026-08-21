/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 *  io.netty.handler.codec.http.websocketx.TextWebSocketFrame
 */
import com.google.gson.JsonElement;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import java.util.List;

public class awb
extends MessageToMessageEncoder<JsonElement> {
    protected void a(ChannelHandlerContext $$0, JsonElement $$1, List<Object> $$2) {
        $$2.add(new TextWebSocketFrame($$1.toString()));
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.a(channelHandlerContext, (JsonElement)object, list);
    }
}

