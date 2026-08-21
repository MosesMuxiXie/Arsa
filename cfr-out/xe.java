/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

public class xe {
    private static final int c = 15;
    private static final int d = Short.MAX_VALUE;
    private static final double e = 32766.0;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final int i = 3;
    private static final int j = 18;
    private static final int k = 33;
    public static final double a = 1.7179869183E10;
    public static final double b = 3.051944088384301E-5;

    public static boolean a(int $$0) {
        return ($$0 & 4) == 4;
    }

    public static ftm a(ByteBuf $$0) {
        short $$1 = $$0.readUnsignedByte();
        if ($$1 == 0) {
            return ftm.c;
        }
        short $$2 = $$0.readUnsignedByte();
        long $$3 = $$0.readUnsignedInt();
        long $$4 = $$3 << 16 | (long)($$2 << 8) | (long)$$1;
        long $$5 = $$1 & 3;
        if (xe.a($$1)) {
            $$5 |= ((long)xy.a($$0) & 0xFFFFFFFFL) << 2;
        }
        return new ftm(xe.a($$4 >> 3) * (double)$$5, xe.a($$4 >> 18) * (double)$$5, xe.a($$4 >> 33) * (double)$$5);
    }

    public static void a(ByteBuf $$0, ftm $$1) {
        double $$4;
        double $$3;
        double $$2 = xe.a($$1.g);
        double $$5 = bgj.a($$2, bgj.a($$3 = xe.a($$1.h), $$4 = xe.a($$1.i)));
        if ($$5 < 3.051944088384301E-5) {
            $$0.writeByte(0);
            return;
        }
        long $$6 = bgj.f($$5);
        boolean $$7 = ($$6 & 3L) != $$6;
        long $$8 = $$7 ? $$6 & 3L | 4L : $$6;
        long $$9 = xe.b($$2 / (double)$$6) << 3;
        long $$10 = xe.b($$3 / (double)$$6) << 18;
        long $$11 = xe.b($$4 / (double)$$6) << 33;
        long $$12 = $$8 | $$9 | $$10 | $$11;
        $$0.writeByte((int)((byte)$$12));
        $$0.writeByte((int)((byte)($$12 >> 8)));
        $$0.writeInt((int)($$12 >> 16));
        if ($$7) {
            xy.a($$0, (int)($$6 >> 2));
        }
    }

    private static double a(double $$0) {
        return Double.isNaN($$0) ? 0.0 : Math.clamp($$0, -1.7179869183E10, 1.7179869183E10);
    }

    private static long b(double $$0) {
        return Math.round(($$0 * 0.5 + 0.5) * 32766.0);
    }

    private static double a(long $$0) {
        return Math.min((double)($$0 & 0x7FFFL), 32766.0) * 2.0 / 32766.0 - 1.0;
    }
}

