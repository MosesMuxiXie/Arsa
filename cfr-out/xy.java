/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

public class xy {
    public static final int a = 5;
    private static final int b = 127;
    private static final int c = 128;
    private static final int d = 7;

    public static int a(int $$0) {
        for (int $$1 = 1; $$1 < 5; ++$$1) {
            if (($$0 & -1 << $$1 * 7) != 0) continue;
            return $$1;
        }
        return 5;
    }

    public static boolean a(byte $$0) {
        return ($$0 & 0x80) == 128;
    }

    public static int a(ByteBuf $$0) {
        byte $$3;
        int $$1 = 0;
        int $$2 = 0;
        do {
            $$3 = $$0.readByte();
            $$1 |= ($$3 & 0x7F) << $$2++ * 7;
            if ($$2 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while (xy.a($$3));
        return $$1;
    }

    public static ByteBuf a(ByteBuf $$0, int $$1) {
        while (true) {
            if (($$1 & 0xFFFFFF80) == 0) {
                $$0.writeByte($$1);
                return $$0;
            }
            $$0.writeByte($$1 & 0x7F | 0x80);
            $$1 >>>= 7;
        }
    }
}

