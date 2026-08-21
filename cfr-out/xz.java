/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

public class xz {
    private static final int a = 10;
    private static final int b = 127;
    private static final int c = 128;
    private static final int d = 7;

    public static int a(long $$0) {
        for (int $$1 = 1; $$1 < 10; ++$$1) {
            if (($$0 & -1L << $$1 * 7) != 0L) continue;
            return $$1;
        }
        return 10;
    }

    public static boolean a(byte $$0) {
        return ($$0 & 0x80) == 128;
    }

    public static long a(ByteBuf $$0) {
        byte $$3;
        long $$1 = 0L;
        int $$2 = 0;
        do {
            $$3 = $$0.readByte();
            $$1 |= (long)($$3 & 0x7F) << $$2++ * 7;
            if ($$2 <= 10) continue;
            throw new RuntimeException("VarLong too big");
        } while (xz.a($$3));
        return $$1;
    }

    public static ByteBuf a(ByteBuf $$0, long $$1) {
        while (true) {
            if (($$1 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                $$0.writeByte((int)$$1);
                return $$0;
            }
            $$0.writeByte((int)($$1 & 0x7FL) | 0x80);
            $$1 >>>= 7;
        }
    }
}

