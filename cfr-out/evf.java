/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.hash.HashFunction
 *  com.google.common.hash.Hashing
 *  com.google.common.primitives.Longs
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Longs;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLong;

public final class evf {
    public static final long a = -7046029254386353131L;
    public static final long b = 7640891576956012809L;
    private static final HashFunction c = Hashing.md5();
    private static final AtomicLong d = new AtomicLong(8682522807148012L);

    @VisibleForTesting
    public static long a(long $$0) {
        $$0 = ($$0 ^ $$0 >>> 30) * -4658895280553007687L;
        $$0 = ($$0 ^ $$0 >>> 27) * -7723592293110705685L;
        return $$0 ^ $$0 >>> 31;
    }

    public static a b(long $$0) {
        long $$1 = $$0 ^ 0x6A09E667F3BCC909L;
        long $$2 = $$1 + -7046029254386353131L;
        return new a($$1, $$2);
    }

    public static a c(long $$0) {
        return evf.b($$0).a();
    }

    public static a a(String $$0) {
        byte[] $$1 = c.hashString((CharSequence)$$0, StandardCharsets.UTF_8).asBytes();
        long $$2 = Longs.fromBytes((byte)$$1[0], (byte)$$1[1], (byte)$$1[2], (byte)$$1[3], (byte)$$1[4], (byte)$$1[5], (byte)$$1[6], (byte)$$1[7]);
        long $$3 = Longs.fromBytes((byte)$$1[8], (byte)$$1[9], (byte)$$1[10], (byte)$$1[11], (byte)$$1[12], (byte)$$1[13], (byte)$$1[14], (byte)$$1[15]);
        return new a($$2, $$3);
    }

    public static long a() {
        return d.updateAndGet($$0 -> $$0 * 1181783497276652981L) ^ System.nanoTime();
    }

    public record a(long a, long b) {
        private final long a;
        private final long b;

        public a a(long $$0, long $$1) {
            return new a(this.a ^ $$0, this.b ^ $$1);
        }

        public a a(a $$0) {
            return this.a($$0.a, $$0.b);
        }

        public a a() {
            return new a(evf.a(this.a), evf.a(this.b));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "seedLo;seedHi", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "seedLo;seedHi", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "seedLo;seedHi", "a", "b"}, this, $$0);
        }

        public long b() {
            return this.a;
        }

        public long c() {
            return this.b;
        }
    }
}

