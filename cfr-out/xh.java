/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

public class xh
extends MessageToMessageEncoder<aay<?>> {
    private final aaw a;

    public xh(aaw $$0) {
        this.a = $$0;
    }

    protected void a(ChannelHandlerContext $$0, aay<?> $$1, List<Object> $$2) throws Exception {
        this.a.a($$1, $$2::add);
        if ($$1.d()) {
            $$0.pipeline().remove($$0.name());
        }
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.a(channelHandlerContext, (aay)object, list);
    }
}

