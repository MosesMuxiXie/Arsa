/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HexFormat;

public record bgo(int a, int b) {
    private static final HexFormat c = HexFormat.of().withUpperCase().withPrefix("0x");
    private static final long d = -8552249625308161526L;
    private static final int e = 1229472850;
    private static final int f = 13;

    public static bgo a(InputStream $$0) throws IOException {
        DataInputStream $$1 = new DataInputStream($$0);
        long $$2 = $$1.readLong();
        if ($$2 != -8552249625308161526L) {
            throw new IOException("Bad PNG Signature: " + c.toHexDigits($$2));
        }
        int $$3 = $$1.readInt();
        if ($$3 != 13) {
            throw new IOException("Bad length for IHDR chunk: " + $$3);
        }
        int $$4 = $$1.readInt();
        if ($$4 != 1229472850) {
            throw new IOException("Bad type for IHDR chunk: " + c.toHexDigits($$4));
        }
        int $$5 = $$1.readInt();
        int $$6 = $$1.readInt();
        return new bgo($$5, $$6);
    }

    public static bgo a(byte[] $$0) throws IOException {
        return bgo.a(new ByteArrayInputStream($$0));
    }

    public static void a(ByteBuffer $$0) throws IOException {
        ByteOrder $$1 = $$0.order();
        $$0.order(ByteOrder.BIG_ENDIAN);
        if ($$0.limit() < 16) {
            throw new IOException("PNG header missing");
        }
        if ($$0.getLong(0) != -8552249625308161526L) {
            throw new IOException("Bad PNG Signature");
        }
        if ($$0.getInt(8) != 13) {
            throw new IOException("Bad length for IHDR chunk!");
        }
        if ($$0.getInt(12) != 1229472850) {
            throw new IOException("Bad type for IHDR chunk!");
        }
        $$0.order($$1);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bgo.class, "width;height", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bgo.class, "width;height", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bgo.class, "width;height", "a", "b"}, this, $$0);
    }
}

