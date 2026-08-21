/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;

public class axz {
    public static final int a = 250;
    public static final String b = "MC|PingHost";
    public static final int c = 254;
    public static final int d = 1;
    public static final int e = 255;
    public static final int f = 127;

    public static void a(ByteBuf $$0, String $$1) {
        $$0.writeShort($$1.length());
        $$0.writeCharSequence((CharSequence)$$1, StandardCharsets.UTF_16BE);
    }

    public static String a(ByteBuf $$0) {
        short $$1 = $$0.readShort();
        int $$2 = $$1 * 2;
        String $$3 = $$0.toString($$0.readerIndex(), $$2, StandardCharsets.UTF_16BE);
        $$0.skipBytes($$2);
        return $$3;
    }
}

