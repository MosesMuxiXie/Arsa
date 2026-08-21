/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.MessageToMessageDecoder
 *  org.jspecify.annotations.Nullable
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class xg
extends MessageToMessageDecoder<aay<?>> {
    private final aaw a;
    private @Nullable aaw.a b;

    public xg(aaw $$0) {
        this.a = $$0;
    }

    protected void a(ChannelHandlerContext $$0, aay<?> $$1, List<Object> $$2) throws Exception {
        if (this.b != null) {
            xg.a($$1);
            aay<?> $$3 = this.b.a($$1);
            if ($$3 != null) {
                this.b = null;
                $$2.add($$3);
            }
        } else {
            aaw.a $$4 = this.a.a($$1);
            if ($$4 != null) {
                xg.a($$1);
                this.b = $$4;
            } else {
                $$2.add($$1);
                if ($$1.d()) {
                    $$0.pipeline().remove($$0.name());
                }
            }
        }
    }

    private static void a(aay<?> $$0) {
        if ($$0.d()) {
            throw new DecoderException("Terminal message received in bundle");
        }
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) throws Exception {
        this.a(channelHandlerContext, (aay)object, list);
    }
}

