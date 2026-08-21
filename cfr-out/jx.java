/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.util.UndashedUuid
 *  io.netty.buffer.ByteBuf
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.Lifecycle;
import com.mojang.util.UndashedUuid;
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

public final class jx {
    public static final Codec<UUID> a = Codec.INT_STREAM.comapFlatMap($$0 -> bhs.a($$0, 4).map(jx::a), $$0 -> Arrays.stream(jx.a($$0)));
    public static final Codec<Set<UUID>> b = Codec.list(a).xmap(Sets::newHashSet, Lists::newArrayList);
    public static final Codec<Set<UUID>> c = Codec.list(a).xmap(Sets::newLinkedHashSet, Lists::newArrayList);
    public static final Codec<UUID> d = Codec.STRING.comapFlatMap($$0 -> {
        try {
            return DataResult.success((Object)UUID.fromString($$0), (Lifecycle)Lifecycle.stable());
        }
        catch (IllegalArgumentException $$1) {
            return DataResult.error(() -> "Invalid UUID " + $$0 + ": " + $$1.getMessage());
        }
    }, UUID::toString);
    public static final Codec<UUID> e = Codec.withAlternative((Codec)Codec.STRING.comapFlatMap($$0 -> {
        try {
            return DataResult.success((Object)UndashedUuid.fromStringLenient((String)$$0), (Lifecycle)Lifecycle.stable());
        }
        catch (IllegalArgumentException $$1) {
            return DataResult.error(() -> "Invalid UUID " + $$0 + ": " + $$1.getMessage());
        }
    }, UndashedUuid::toString), a);
    public static final Codec<UUID> f = Codec.withAlternative(a, d);
    public static final aao<ByteBuf, UUID> g = new aao<ByteBuf, UUID>(){

        public UUID a(ByteBuf $$0) {
            return wx.h($$0);
        }

        public void a(ByteBuf $$0, UUID $$1) {
            wx.a($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (UUID)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final int h = 16;
    private static final String i = "OfflinePlayer:";

    private jx() {
    }

    public static UUID a(int[] $$0) {
        return new UUID((long)$$0[0] << 32 | (long)$$0[1] & 0xFFFFFFFFL, (long)$$0[2] << 32 | (long)$$0[3] & 0xFFFFFFFFL);
    }

    public static int[] a(UUID $$0) {
        long $$1 = $$0.getMostSignificantBits();
        long $$2 = $$0.getLeastSignificantBits();
        return jx.a($$1, $$2);
    }

    private static int[] a(long $$0, long $$1) {
        return new int[]{(int)($$0 >> 32), (int)$$0, (int)($$1 >> 32), (int)$$1};
    }

    public static byte[] b(UUID $$0) {
        byte[] $$1 = new byte[16];
        ByteBuffer.wrap($$1).order(ByteOrder.BIG_ENDIAN).putLong($$0.getMostSignificantBits()).putLong($$0.getLeastSignificantBits());
        return $$1;
    }

    public static UUID a(Dynamic<?> $$0) {
        int[] $$1 = $$0.asIntStream().toArray();
        if ($$1.length != 4) {
            throw new IllegalArgumentException("Could not read UUID. Expected int-array of length 4, got " + $$1.length + ".");
        }
        return jx.a($$1);
    }

    public static UUID a(String $$0) {
        return UUID.nameUUIDFromBytes((i + $$0).getBytes(StandardCharsets.UTF_8));
    }

    public static GameProfile b(String $$0) {
        UUID $$1 = jx.a($$0);
        return new GameProfile($$1, $$0);
    }
}

