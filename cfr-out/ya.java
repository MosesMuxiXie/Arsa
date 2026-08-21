/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.CorruptedFrameException
 *  org.jspecify.annotations.Nullable
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class ya
extends ByteToMessageDecoder {
    private static final int a = 3;
    private final ByteBuf b = Unpooled.directBuffer((int)3);
    private final @Nullable wn c;

    public ya(@Nullable wn $$0) {
        this.c = $$0;
    }

    protected void handlerRemoved0(ChannelHandlerContext $$0) {
        this.b.release();
    }

    private static boolean a(ByteBuf $$0, ByteBuf $$1) {
        for (int $$2 = 0; $$2 < 3; ++$$2) {
            if (!$$0.isReadable()) {
                return false;
            }
            byte $$3 = $$0.readByte();
            $$1.writeByte((int)$$3);
            if (xy.a($$3)) continue;
            return true;
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }

    protected void decode(ChannelHandlerContext $$0, ByteBuf $$1, List<Object> $$2) {
        $$1.markReaderIndex();
        this.b.clear();
        if (!ya.a($$1, this.b)) {
            $$1.resetReaderIndex();
            return;
        }
        int $$3 = xy.a(this.b);
        if ($$3 == 0) {
            throw new CorruptedFrameException("Frame length cannot be zero");
        }
        if ($$1.readableBytes() < $$3) {
            $$1.resetReaderIndex();
            return;
        }
        if (this.c != null) {
            this.c.a($$3 + xy.a($$3));
        }
        $$2.add($$1.readBytes($$3));
    }
}

