/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class wo {
    private final Cipher a;
    private byte[] b = new byte[0];
    private byte[] c = new byte[0];

    protected wo(Cipher $$0) {
        this.a = $$0;
    }

    private byte[] a(ByteBuf $$0) {
        int $$1 = $$0.readableBytes();
        if (this.b.length < $$1) {
            this.b = new byte[$$1];
        }
        $$0.readBytes(this.b, 0, $$1);
        return this.b;
    }

    protected ByteBuf a(ChannelHandlerContext $$0, ByteBuf $$1) throws ShortBufferException {
        int $$2 = $$1.readableBytes();
        byte[] $$3 = this.a($$1);
        ByteBuf $$4 = $$0.alloc().heapBuffer(this.a.getOutputSize($$2));
        $$4.writerIndex(this.a.update($$3, 0, $$2, $$4.array(), $$4.arrayOffset()));
        return $$4;
    }

    protected void a(ByteBuf $$0, ByteBuf $$1) throws ShortBufferException {
        int $$2 = $$0.readableBytes();
        byte[] $$3 = this.a($$0);
        int $$4 = this.a.getOutputSize($$2);
        if (this.c.length < $$4) {
            this.c = new byte[$$4];
        }
        $$1.writeBytes(this.c, 0, this.a.update($$3, 0, $$2, this.c));
    }
}

