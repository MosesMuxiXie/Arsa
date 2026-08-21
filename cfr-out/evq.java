/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.stream.LongStream;

public class evq {
    private long b;
    private long c;
    public static final Codec<evq> a = Codec.LONG_STREAM.comapFlatMap($$02 -> bhs.a($$02, 2).map($$0 -> new evq($$0[0], $$0[1])), $$0 -> LongStream.of($$0.b, $$0.c));

    public evq(evf.a $$0) {
        this($$0.b(), $$0.c());
    }

    public evq(long $$0, long $$1) {
        this.b = $$0;
        this.c = $$1;
        if ((this.b | this.c) == 0L) {
            this.b = -7046029254386353131L;
            this.c = 7640891576956012809L;
        }
    }

    public long a() {
        long $$0 = this.b;
        long $$1 = this.c;
        long $$2 = Long.rotateLeft($$0 + $$1, 17) + $$0;
        this.b = Long.rotateLeft($$0, 49) ^ ($$1 ^= $$0) ^ $$1 << 21;
        this.c = Long.rotateLeft($$1, 28);
        return $$2;
    }
}

