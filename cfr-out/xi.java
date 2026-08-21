/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;

public class xi<T extends xk>
extends ByteToMessageDecoder
implements xo {
    private static final Logger a = LogUtils.getLogger();
    private final xn<T> b;

    public xi(xn<T> $$0) {
        this.b = $$0;
    }

    /*
     * WARNING - void declaration
     */
    protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) throws Exception {
        void $$6;
        int $$3 = $$1.readableBytes();
        try {
            aay $$4 = (aay)this.b.c().decode($$1);
        }
        catch (Exception $$5) {
            if ($$5 instanceof xu) {
                $$1.skipBytes($$1.readableBytes());
            }
            throw $$5;
        }
        aba $$7 = $$6.a();
        bzu.f.a(this.b.a(), $$7, $$0.channel().remoteAddress(), $$3);
        if ($$1.readableBytes() > 0) {
            throw new IOException("Packet " + this.b.a().a() + "/" + String.valueOf($$7) + " (" + $$6.getClass().getSimpleName() + ") was larger than I expected, found " + $$1.readableBytes() + " bytes extra whilst reading packet " + String.valueOf($$7));
        }
        $$2.add($$6);
        if (a.isDebugEnabled()) {
            a.debug(wu.c, " IN: [{}:{}] {} -> {} bytes", new Object[]{this.b.a().a(), $$7, $$6.getClass().getName(), $$3});
        }
        xo.a($$0, $$6);
    }
}

