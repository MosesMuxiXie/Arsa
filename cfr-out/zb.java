/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.google.common.primitives.Longs
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import java.util.Optional;

public final class zb
extends Record {
    private final String b;
    private final Instant c;
    private final long d;
    private final yp e;
    public static final MapCodec<zb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("content").forGetter(zb::a), (App)bfm.x.fieldOf("time_stamp").forGetter(zb::b), (App)Codec.LONG.fieldOf("salt").forGetter(zb::c), (App)yp.a.optionalFieldOf("last_seen", (Object)yp.b).forGetter(zb::d)).apply((Applicative)$$0, zb::new));

    public zb(String $$0, Instant $$1, long $$2, yp $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public static zb a(String $$0) {
        return new zb($$0, Instant.now(), 0L, yp.b);
    }

    public void a(bgv.a $$0) throws SignatureException {
        $$0.update(Longs.toByteArray((long)this.d));
        $$0.update(Longs.toByteArray((long)this.c.getEpochSecond()));
        byte[] $$1 = this.b.getBytes(StandardCharsets.UTF_8);
        $$0.update(Ints.toByteArray((int)$$1.length));
        $$0.update($$1);
        this.e.a($$0);
    }

    public a a(yv $$0) {
        return new a(this.b, this.c, this.d, this.e.a($$0));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zb.class, "content;timeStamp;salt;lastSeen", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zb.class, "content;timeStamp;salt;lastSeen", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zb.class, "content;timeStamp;salt;lastSeen", "b", "c", "d", "e"}, this, $$0);
    }

    public String a() {
        return this.b;
    }

    public Instant b() {
        return this.c;
    }

    public long c() {
        return this.d;
    }

    public yp d() {
        return this.e;
    }

    public record a(String a, Instant b, long c, yp.a d) {
        public a(wx $$0) {
            this($$0.d(256), $$0.s(), $$0.readLong(), new yp.a($$0));
        }

        public void a(wx $$0) {
            $$0.a(this.a, 256);
            $$0.a(this.b);
            $$0.b(this.c);
            this.d.a($$0);
        }

        public Optional<zb> a(yv $$02) {
            return this.d.a($$02).map($$0 -> new zb(this.a, this.b, this.c, (yp)$$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "content;timeStamp;salt;lastSeen", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "content;timeStamp;salt;lastSeen", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "content;timeStamp;salt;lastSeen", "a", "b", "c", "d"}, this, $$0);
        }
    }
}

