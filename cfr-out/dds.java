/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.UUID;

public final class dds
extends Record {
    private final a d;
    public static final yh a = yh.c("multiplayer.disconnect.expired_public_key");
    private static final yh e = yh.c("multiplayer.disconnect.invalid_public_key_signature");
    public static final Duration b = Duration.ofHours(8L);
    public static final Codec<dds> c = dds$a.a.xmap(dds::new, dds::b);

    public dds(a $$0) {
        this.d = $$0;
    }

    public static dds a(bgw $$0, UUID $$1, a $$2) throws b {
        if (!$$2.a($$0, $$1)) {
            throw new b(e);
        }
        return new dds($$2);
    }

    public bgw a() {
        return bgw.a(this.d.c, "SHA256withRSA");
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dds.class, "data", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dds.class, "data", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dds.class, "data", "d"}, this, $$0);
    }

    public a b() {
        return this.d;
    }

    public static final class a
    extends Record {
        private final Instant b;
        final PublicKey c;
        private final byte[] d;
        private static final int e = 4096;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.x.fieldOf("expires_at").forGetter(a::b), (App)bfb.f.fieldOf("key").forGetter(a::c), (App)bfm.y.fieldOf("signature_v2").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(wx $$0) {
            this($$0.s(), $$0.t(), $$0.a(4096));
        }

        public a(Instant $$0, PublicKey $$1, byte[] $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public void a(wx $$0) {
            $$0.a(this.b);
            $$0.a(this.c);
            $$0.a(this.d);
        }

        boolean a(bgw $$0, UUID $$1) {
            return $$0.a(this.a($$1), this.d);
        }

        private byte[] a(UUID $$0) {
            byte[] $$1 = this.c.getEncoded();
            byte[] $$2 = new byte[24 + $$1.length];
            ByteBuffer $$3 = ByteBuffer.wrap($$2).order(ByteOrder.BIG_ENDIAN);
            $$3.putLong($$0.getMostSignificantBits()).putLong($$0.getLeastSignificantBits()).putLong(this.b.toEpochMilli()).put($$1);
            return $$2;
        }

        public boolean a() {
            return this.b.isBefore(Instant.now());
        }

        public boolean a(Duration $$0) {
            return this.b.plus($$0).isBefore(Instant.now());
        }

        @Override
        public boolean equals(Object $$0) {
            if ($$0 instanceof a) {
                a $$1 = (a)$$0;
                return this.b.equals($$1.b) && this.c.equals($$1.c) && Arrays.equals(this.d, $$1.d);
            }
            return false;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "expiresAt;key;keySignature", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "expiresAt;key;keySignature", "b", "c", "d"}, this);
        }

        public Instant b() {
            return this.b;
        }

        public PublicKey c() {
            return this.c;
        }

        public byte[] d() {
            return this.d;
        }
    }

    public static class b
    extends zi {
        public b(yh $$0) {
            super($$0);
        }
    }
}

