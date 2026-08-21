/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  io.netty.util.ByteProcessor
 *  io.netty.util.ReferenceCounted
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ByteProcessor;
import io.netty.util.ReferenceCounted;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class wx
extends ByteBuf {
    private final ByteBuf c;
    public static final short a = Short.MAX_VALUE;
    public static final int b = 262144;
    private static final int d = 256;
    private static final int e = 256;
    private static final int f = 512;
    private static final Gson g = new Gson();

    public wx(ByteBuf $$0) {
        this.c = $$0;
    }

    @Deprecated
    public <T> T a(DynamicOps<vz> $$0, Codec<T> $$1) {
        return this.a($$0, $$1, vi.c());
    }

    @Deprecated
    public <T> T a(DynamicOps<vz> $$0, Codec<T> $$12, vi $$2) {
        vz $$3 = this.a($$2);
        return (T)$$12.parse($$0, (Object)$$3).getOrThrow($$1 -> new DecoderException("Failed to decode: " + $$1 + " " + String.valueOf($$3)));
    }

    @Deprecated
    public <T> wx a(DynamicOps<vz> $$0, Codec<T> $$12, T $$2) {
        vz $$3 = (vz)$$12.encodeStart($$0, $$2).getOrThrow($$1 -> new EncoderException("Failed to encode: " + $$1 + " " + String.valueOf($$2)));
        this.a($$3);
        return this;
    }

    public <T> T a(Codec<T> $$02) {
        JsonElement $$1 = bge.a(this.p());
        DataResult $$2 = $$02.parse((DynamicOps)JsonOps.INSTANCE, (Object)$$1);
        return (T)$$2.getOrThrow($$0 -> new DecoderException("Failed to decode JSON: " + $$0));
    }

    public <T> void a(Codec<T> $$0, T $$12) {
        DataResult $$2 = $$0.encodeStart((DynamicOps)JsonOps.INSTANCE, $$12);
        this.a(g.toJson((JsonElement)$$2.getOrThrow($$1 -> new EncoderException("Failed to encode: " + $$1 + " " + String.valueOf($$12)))));
    }

    public static <T> IntFunction<T> a(IntFunction<T> $$0, int $$1) {
        return $$2 -> {
            if ($$2 > $$1) {
                throw new DecoderException("Value " + $$2 + " is larger than limit " + $$1);
            }
            return $$0.apply($$2);
        };
    }

    public <T, C extends Collection<T>> C a(IntFunction<C> $$0, aap<? super wx, T> $$1) {
        int $$2 = this.l();
        Collection $$3 = (Collection)$$0.apply($$2);
        for (int $$4 = 0; $$4 < $$2; ++$$4) {
            $$3.add($$1.decode(this));
        }
        return (C)$$3;
    }

    public <T> void a(Collection<T> $$0, aaq<? super wx, T> $$1) {
        this.c($$0.size());
        for (T $$2 : $$0) {
            $$1.encode(this, $$2);
        }
    }

    public <T> List<T> a(aap<? super wx, T> $$0) {
        return (List)this.a((ByteBuf)((IntFunction<ArrayList>)Lists::newArrayListWithCapacity), (aap)$$0);
    }

    public IntList a() {
        int $$0 = this.l();
        IntArrayList $$1 = new IntArrayList();
        for (int $$2 = 0; $$2 < $$0; ++$$2) {
            $$1.add(this.l());
        }
        return $$1;
    }

    public void a(IntList $$0) {
        this.c($$0.size());
        $$0.forEach(this::c);
    }

    public <K, V, M extends Map<K, V>> M a(IntFunction<M> $$0, aap<? super wx, K> $$1, aap<? super wx, V> $$2) {
        int $$3 = this.l();
        Map $$4 = (Map)$$0.apply($$3);
        for (int $$5 = 0; $$5 < $$3; ++$$5) {
            K $$6 = $$1.decode(this);
            V $$7 = $$2.decode(this);
            $$4.put($$6, $$7);
        }
        return (M)$$4;
    }

    public <K, V> Map<K, V> a(aap<? super wx, K> $$0, aap<? super wx, V> $$1) {
        return this.a(Maps::newHashMapWithExpectedSize, $$0, $$1);
    }

    public <K, V> void a(Map<K, V> $$0, aaq<? super wx, K> $$1, aaq<? super wx, V> $$22) {
        this.c($$0.size());
        $$0.forEach(($$2, $$3) -> {
            $$1.encode(this, $$2);
            $$22.encode(this, $$3);
        });
    }

    public void a(Consumer<wx> $$0) {
        int $$1 = this.l();
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            $$0.accept(this);
        }
    }

    public <E extends Enum<E>> void a(EnumSet<E> $$0, Class<E> $$1) {
        Enum[] $$2 = (Enum[])$$1.getEnumConstants();
        BitSet $$3 = new BitSet($$2.length);
        for (int $$4 = 0; $$4 < $$2.length; ++$$4) {
            $$3.set($$4, $$0.contains($$2[$$4]));
        }
        this.a($$3, $$2.length);
    }

    public <E extends Enum<E>> EnumSet<E> a(Class<E> $$0) {
        Enum[] $$1 = (Enum[])$$0.getEnumConstants();
        BitSet $$2 = this.e($$1.length);
        EnumSet<Enum> $$3 = EnumSet.noneOf($$0);
        for (int $$4 = 0; $$4 < $$1.length; ++$$4) {
            if (!$$2.get($$4)) continue;
            $$3.add($$1[$$4]);
        }
        return $$3;
    }

    public <T> void a(Optional<T> $$0, aaq<? super wx, T> $$1) {
        if ($$0.isPresent()) {
            this.a(true);
            $$1.encode(this, $$0.get());
        } else {
            this.a(false);
        }
    }

    public <T> Optional<T> b(aap<? super wx, T> $$0) {
        if (this.readBoolean()) {
            return Optional.of($$0.decode(this));
        }
        return Optional.empty();
    }

    public <L, R> void a(Either<L, R> $$0, aaq<? super wx, L> $$12, aaq<? super wx, R> $$2) {
        $$0.ifLeft($$1 -> {
            this.a(true);
            $$12.encode(this, $$1);
        }).ifRight($$1 -> {
            this.a(false);
            $$2.encode(this, $$1);
        });
    }

    public <L, R> Either<L, R> b(aap<? super wx, L> $$0, aap<? super wx, R> $$1) {
        if (this.readBoolean()) {
            return Either.left($$0.decode(this));
        }
        return Either.right($$1.decode(this));
    }

    public <T> @Nullable T c(aap<? super wx, T> $$0) {
        return wx.a(this, $$0);
    }

    public static <T, B extends ByteBuf> @Nullable T a(B $$0, aap<? super B, T> $$1) {
        if ($$0.readBoolean()) {
            return $$1.decode($$0);
        }
        return null;
    }

    public <T> void a(@Nullable T $$0, aaq<? super wx, T> $$1) {
        wx.a(this, $$0, $$1);
    }

    public static <T, B extends ByteBuf> void a(B $$0, @Nullable T $$1, aaq<? super B, T> $$2) {
        if ($$1 != null) {
            $$0.writeBoolean(true);
            $$2.encode($$0, $$1);
        } else {
            $$0.writeBoolean(false);
        }
    }

    public byte[] b() {
        return wx.a(this);
    }

    public static byte[] a(ByteBuf $$0) {
        return wx.a($$0, $$0.readableBytes());
    }

    public wx a(byte[] $$0) {
        wx.a((ByteBuf)this, $$0);
        return this;
    }

    public static void a(ByteBuf $$0, byte[] $$1) {
        xy.a($$0, $$1.length);
        $$0.writeBytes($$1);
    }

    public byte[] a(int $$0) {
        return wx.a((ByteBuf)this, $$0);
    }

    public static byte[] a(ByteBuf $$0, int $$1) {
        int $$2 = xy.a($$0);
        if ($$2 > $$1) {
            throw new DecoderException("ByteArray with size " + $$2 + " is bigger than allowed " + $$1);
        }
        byte[] $$3 = new byte[$$2];
        $$0.readBytes($$3);
        return $$3;
    }

    public wx a(int[] $$0) {
        this.c($$0.length);
        for (int $$1 : $$0) {
            this.c($$1);
        }
        return this;
    }

    public int[] c() {
        return this.b(this.readableBytes());
    }

    public int[] b(int $$0) {
        int $$1 = this.l();
        if ($$1 > $$0) {
            throw new DecoderException("VarIntArray with size " + $$1 + " is bigger than allowed " + $$0);
        }
        int[] $$2 = new int[$$1];
        for (int $$3 = 0; $$3 < $$2.length; ++$$3) {
            $$2[$$3] = this.l();
        }
        return $$2;
    }

    public wx a(long[] $$0) {
        wx.a((ByteBuf)this, $$0);
        return this;
    }

    public static void a(ByteBuf $$0, long[] $$1) {
        xy.a($$0, $$1.length);
        wx.b($$0, $$1);
    }

    public wx b(long[] $$0) {
        wx.b((ByteBuf)this, $$0);
        return this;
    }

    public static void b(ByteBuf $$0, long[] $$1) {
        for (long $$2 : $$1) {
            $$0.writeLong($$2);
        }
    }

    public long[] d() {
        return wx.b(this);
    }

    public long[] c(long[] $$0) {
        return wx.c(this, $$0);
    }

    public static long[] b(ByteBuf $$0) {
        int $$2;
        int $$1 = xy.a($$0);
        if ($$1 > ($$2 = $$0.readableBytes() / 8)) {
            throw new DecoderException("LongArray with size " + $$1 + " is bigger than allowed " + $$2);
        }
        return wx.c($$0, new long[$$1]);
    }

    public static long[] c(ByteBuf $$0, long[] $$1) {
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            $$1[$$2] = $$0.readLong();
        }
        return $$1;
    }

    public is e() {
        return wx.c(this);
    }

    public static is c(ByteBuf $$0) {
        return is.d($$0.readLong());
    }

    public wx a(is $$0) {
        wx.a((ByteBuf)this, $$0);
        return this;
    }

    public static void a(ByteBuf $$0, is $$1) {
        $$0.writeLong($$1.a());
    }

    public dvu f() {
        return new dvu(this.readLong());
    }

    public wx a(dvu $$0) {
        this.b($$0.b());
        return this;
    }

    public static dvu d(ByteBuf $$0) {
        return new dvu($$0.readLong());
    }

    public static void a(ByteBuf $$0, dvu $$1) {
        $$0.writeLong($$1.b());
    }

    public jc g() {
        amt<dwo> $$0 = this.a(mj.bE);
        is $$1 = this.e();
        return jc.a($$0, $$1);
    }

    public void a(jc $$0) {
        this.b($$0.a());
        this.a($$0.b());
    }

    public Vector3f h() {
        return wx.e(this);
    }

    public static Vector3f e(ByteBuf $$0) {
        return new Vector3f($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
    }

    public void a(Vector3f $$0) {
        wx.a((ByteBuf)this, (Vector3fc)$$0);
    }

    public static void a(ByteBuf $$0, Vector3fc $$1) {
        $$0.writeFloat($$1.x());
        $$0.writeFloat($$1.y());
        $$0.writeFloat($$1.z());
    }

    public Quaternionf i() {
        return wx.f(this);
    }

    public static Quaternionf f(ByteBuf $$0) {
        return new Quaternionf($$0.readFloat(), $$0.readFloat(), $$0.readFloat(), $$0.readFloat());
    }

    public void a(Quaternionf $$0) {
        wx.a((ByteBuf)this, (Quaternionfc)$$0);
    }

    public static void a(ByteBuf $$0, Quaternionfc $$1) {
        $$0.writeFloat($$1.x());
        $$0.writeFloat($$1.y());
        $$0.writeFloat($$1.z());
        $$0.writeFloat($$1.w());
    }

    public static ftm g(ByteBuf $$0) {
        return new ftm($$0.readDouble(), $$0.readDouble(), $$0.readDouble());
    }

    public ftm j() {
        return wx.g(this);
    }

    public static void a(ByteBuf $$0, ftm $$1) {
        $$0.writeDouble($$1.a());
        $$0.writeDouble($$1.b());
        $$0.writeDouble($$1.c());
    }

    public void a(ftm $$0) {
        wx.a((ByteBuf)this, $$0);
    }

    public ftm k() {
        return xe.a(this);
    }

    public void b(ftm $$0) {
        xe.a(this, $$0);
    }

    public <T extends Enum<T>> T b(Class<T> $$0) {
        return (T)((Enum[])$$0.getEnumConstants())[this.l()];
    }

    public wx a(Enum<?> $$0) {
        return this.c($$0.ordinal());
    }

    public <T> T a(IntFunction<T> $$0) {
        int $$1 = this.l();
        return $$0.apply($$1);
    }

    public <T> wx a(ToIntFunction<T> $$0, T $$1) {
        int $$2 = $$0.applyAsInt($$1);
        return this.c($$2);
    }

    public int l() {
        return xy.a(this.c);
    }

    public long m() {
        return xz.a(this.c);
    }

    public wx a(UUID $$0) {
        wx.a((ByteBuf)this, $$0);
        return this;
    }

    public static void a(ByteBuf $$0, UUID $$1) {
        $$0.writeLong($$1.getMostSignificantBits());
        $$0.writeLong($$1.getLeastSignificantBits());
    }

    public UUID n() {
        return wx.h(this);
    }

    public static UUID h(ByteBuf $$0) {
        return new UUID($$0.readLong(), $$0.readLong());
    }

    public wx c(int $$0) {
        xy.a(this.c, $$0);
        return this;
    }

    public wx a(long $$0) {
        xz.a(this.c, $$0);
        return this;
    }

    public wx a(@Nullable vz $$0) {
        wx.a((ByteBuf)this, $$0);
        return this;
    }

    public static void a(ByteBuf $$0, @Nullable vz $$1) {
        if ($$1 == null) {
            $$1 = vb.b;
        }
        try {
            vm.a($$1, (DataOutput)new ByteBufOutputStream($$0));
        }
        catch (IOException $$2) {
            throw new EncoderException((Throwable)$$2);
        }
    }

    public @Nullable uz o() {
        return wx.i(this);
    }

    public static @Nullable uz i(ByteBuf $$0) {
        vz $$1 = wx.a($$0, vi.a());
        if ($$1 == null || $$1 instanceof uz) {
            return (uz)$$1;
        }
        throw new DecoderException("Not a compound tag: " + String.valueOf($$1));
    }

    public static @Nullable vz a(ByteBuf $$0, vi $$1) {
        try {
            vz $$2 = vm.b((DataInput)new ByteBufInputStream($$0), $$1);
            if ($$2.b() == 0) {
                return null;
            }
            return $$2;
        }
        catch (IOException $$3) {
            throw new EncoderException((Throwable)$$3);
        }
    }

    public @Nullable vz a(vi $$0) {
        return wx.a((ByteBuf)this, $$0);
    }

    public String p() {
        return this.d(Short.MAX_VALUE);
    }

    public String d(int $$0) {
        return xx.a(this.c, $$0);
    }

    public wx a(String $$0) {
        return this.a($$0, Short.MAX_VALUE);
    }

    public wx a(String $$0, int $$1) {
        xx.a(this.c, $$0, $$1);
        return this;
    }

    public amo q() {
        return amo.a(this.d(Short.MAX_VALUE));
    }

    public wx a(amo $$0) {
        this.a($$0.toString());
        return this;
    }

    public <T> amt<T> a(amt<? extends jq<T>> $$0) {
        amo $$1 = this.q();
        return amt.a($$0, $$1);
    }

    public void b(amt<?> $$0) {
        this.a($$0.a());
    }

    public <T> amt<? extends jq<T>> r() {
        amo $$0 = this.q();
        return amt.a($$0);
    }

    public Instant s() {
        return Instant.ofEpochMilli(this.readLong());
    }

    public void a(Instant $$0) {
        this.b($$0.toEpochMilli());
    }

    public PublicKey t() {
        try {
            return bfb.a(this.a(512));
        }
        catch (bfc $$0) {
            throw new DecoderException("Malformed public key bytes", (Throwable)$$0);
        }
    }

    public wx a(PublicKey $$0) {
        this.a($$0.getEncoded());
        return this;
    }

    public fti u() {
        is $$0 = this.e();
        iz $$1 = this.b(iz.class);
        float $$2 = this.readFloat();
        float $$3 = this.readFloat();
        float $$4 = this.readFloat();
        boolean $$5 = this.readBoolean();
        boolean $$6 = this.readBoolean();
        return new fti(new ftm((double)$$0.u() + (double)$$2, (double)$$0.v() + (double)$$3, (double)$$0.w() + (double)$$4), $$1, $$0, $$5, $$6);
    }

    public void a(fti $$0) {
        is $$1 = $$0.b();
        this.a($$1);
        this.a($$0.c());
        ftm $$2 = $$0.g();
        this.a((float)($$2.g - (double)$$1.u()));
        this.a((float)($$2.h - (double)$$1.v()));
        this.a((float)($$2.i - (double)$$1.w()));
        this.a($$0.e());
        this.a($$0.f());
    }

    public BitSet v() {
        return BitSet.valueOf(this.d());
    }

    public void a(BitSet $$0) {
        this.a($$0.toLongArray());
    }

    public BitSet e(int $$0) {
        byte[] $$1 = new byte[bgj.f($$0, 8)];
        this.b($$1);
        return BitSet.valueOf($$1);
    }

    public void a(BitSet $$0, int $$1) {
        if ($$0.length() > $$1) {
            throw new EncoderException("BitSet is larger than expected size (" + $$0.length() + ">" + $$1 + ")");
        }
        byte[] $$2 = $$0.toByteArray();
        this.c(Arrays.copyOf($$2, bgj.f($$1, 8)));
    }

    public static int j(ByteBuf $$0) {
        return xy.a($$0);
    }

    public int w() {
        return wx.j(this.c);
    }

    public static void b(ByteBuf $$0, int $$1) {
        xy.a($$0, $$1);
    }

    public void f(int $$0) {
        wx.b(this.c, $$0);
    }

    public boolean isContiguous() {
        return this.c.isContiguous();
    }

    public int maxFastWritableBytes() {
        return this.c.maxFastWritableBytes();
    }

    public int capacity() {
        return this.c.capacity();
    }

    public wx g(int $$0) {
        this.c.capacity($$0);
        return this;
    }

    public int maxCapacity() {
        return this.c.maxCapacity();
    }

    public ByteBufAllocator alloc() {
        return this.c.alloc();
    }

    public ByteOrder order() {
        return this.c.order();
    }

    public ByteBuf order(ByteOrder $$0) {
        return this.c.order($$0);
    }

    public ByteBuf unwrap() {
        return this.c;
    }

    public boolean isDirect() {
        return this.c.isDirect();
    }

    public boolean isReadOnly() {
        return this.c.isReadOnly();
    }

    public ByteBuf asReadOnly() {
        return this.c.asReadOnly();
    }

    public int readerIndex() {
        return this.c.readerIndex();
    }

    public wx h(int $$0) {
        this.c.readerIndex($$0);
        return this;
    }

    public int writerIndex() {
        return this.c.writerIndex();
    }

    public wx i(int $$0) {
        this.c.writerIndex($$0);
        return this;
    }

    public wx a(int $$0, int $$1) {
        this.c.setIndex($$0, $$1);
        return this;
    }

    public int readableBytes() {
        return this.c.readableBytes();
    }

    public int writableBytes() {
        return this.c.writableBytes();
    }

    public int maxWritableBytes() {
        return this.c.maxWritableBytes();
    }

    public boolean isReadable() {
        return this.c.isReadable();
    }

    public boolean isReadable(int $$0) {
        return this.c.isReadable($$0);
    }

    public boolean isWritable() {
        return this.c.isWritable();
    }

    public boolean isWritable(int $$0) {
        return this.c.isWritable($$0);
    }

    public wx x() {
        this.c.clear();
        return this;
    }

    public wx y() {
        this.c.markReaderIndex();
        return this;
    }

    public wx z() {
        this.c.resetReaderIndex();
        return this;
    }

    public wx A() {
        this.c.markWriterIndex();
        return this;
    }

    public wx B() {
        this.c.resetWriterIndex();
        return this;
    }

    public wx C() {
        this.c.discardReadBytes();
        return this;
    }

    public wx D() {
        this.c.discardSomeReadBytes();
        return this;
    }

    public wx j(int $$0) {
        this.c.ensureWritable($$0);
        return this;
    }

    public int ensureWritable(int $$0, boolean $$1) {
        return this.c.ensureWritable($$0, $$1);
    }

    public boolean getBoolean(int $$0) {
        return this.c.getBoolean($$0);
    }

    public byte getByte(int $$0) {
        return this.c.getByte($$0);
    }

    public short getUnsignedByte(int $$0) {
        return this.c.getUnsignedByte($$0);
    }

    public short getShort(int $$0) {
        return this.c.getShort($$0);
    }

    public short getShortLE(int $$0) {
        return this.c.getShortLE($$0);
    }

    public int getUnsignedShort(int $$0) {
        return this.c.getUnsignedShort($$0);
    }

    public int getUnsignedShortLE(int $$0) {
        return this.c.getUnsignedShortLE($$0);
    }

    public int getMedium(int $$0) {
        return this.c.getMedium($$0);
    }

    public int getMediumLE(int $$0) {
        return this.c.getMediumLE($$0);
    }

    public int getUnsignedMedium(int $$0) {
        return this.c.getUnsignedMedium($$0);
    }

    public int getUnsignedMediumLE(int $$0) {
        return this.c.getUnsignedMediumLE($$0);
    }

    public int getInt(int $$0) {
        return this.c.getInt($$0);
    }

    public int getIntLE(int $$0) {
        return this.c.getIntLE($$0);
    }

    public long getUnsignedInt(int $$0) {
        return this.c.getUnsignedInt($$0);
    }

    public long getUnsignedIntLE(int $$0) {
        return this.c.getUnsignedIntLE($$0);
    }

    public long getLong(int $$0) {
        return this.c.getLong($$0);
    }

    public long getLongLE(int $$0) {
        return this.c.getLongLE($$0);
    }

    public char getChar(int $$0) {
        return this.c.getChar($$0);
    }

    public float getFloat(int $$0) {
        return this.c.getFloat($$0);
    }

    public double getDouble(int $$0) {
        return this.c.getDouble($$0);
    }

    public wx a(int $$0, ByteBuf $$1) {
        this.c.getBytes($$0, $$1);
        return this;
    }

    public wx a(int $$0, ByteBuf $$1, int $$2) {
        this.c.getBytes($$0, $$1, $$2);
        return this;
    }

    public wx a(int $$0, ByteBuf $$1, int $$2, int $$3) {
        this.c.getBytes($$0, $$1, $$2, $$3);
        return this;
    }

    public wx a(int $$0, byte[] $$1) {
        this.c.getBytes($$0, $$1);
        return this;
    }

    public wx a(int $$0, byte[] $$1, int $$2, int $$3) {
        this.c.getBytes($$0, $$1, $$2, $$3);
        return this;
    }

    public wx a(int $$0, ByteBuffer $$1) {
        this.c.getBytes($$0, $$1);
        return this;
    }

    public wx a(int $$0, OutputStream $$1, int $$2) throws IOException {
        this.c.getBytes($$0, $$1, $$2);
        return this;
    }

    public int getBytes(int $$0, GatheringByteChannel $$1, int $$2) throws IOException {
        return this.c.getBytes($$0, $$1, $$2);
    }

    public int getBytes(int $$0, FileChannel $$1, long $$2, int $$3) throws IOException {
        return this.c.getBytes($$0, $$1, $$2, $$3);
    }

    public CharSequence getCharSequence(int $$0, int $$1, Charset $$2) {
        return this.c.getCharSequence($$0, $$1, $$2);
    }

    public wx a(int $$0, boolean $$1) {
        this.c.setBoolean($$0, $$1);
        return this;
    }

    public wx b(int $$0, int $$1) {
        this.c.setByte($$0, $$1);
        return this;
    }

    public wx c(int $$0, int $$1) {
        this.c.setShort($$0, $$1);
        return this;
    }

    public wx d(int $$0, int $$1) {
        this.c.setShortLE($$0, $$1);
        return this;
    }

    public wx e(int $$0, int $$1) {
        this.c.setMedium($$0, $$1);
        return this;
    }

    public wx f(int $$0, int $$1) {
        this.c.setMediumLE($$0, $$1);
        return this;
    }

    public wx g(int $$0, int $$1) {
        this.c.setInt($$0, $$1);
        return this;
    }

    public wx h(int $$0, int $$1) {
        this.c.setIntLE($$0, $$1);
        return this;
    }

    public wx a(int $$0, long $$1) {
        this.c.setLong($$0, $$1);
        return this;
    }

    public wx b(int $$0, long $$1) {
        this.c.setLongLE($$0, $$1);
        return this;
    }

    public wx i(int $$0, int $$1) {
        this.c.setChar($$0, $$1);
        return this;
    }

    public wx a(int $$0, float $$1) {
        this.c.setFloat($$0, $$1);
        return this;
    }

    public wx a(int $$0, double $$1) {
        this.c.setDouble($$0, $$1);
        return this;
    }

    public wx b(int $$0, ByteBuf $$1) {
        this.c.setBytes($$0, $$1);
        return this;
    }

    public wx b(int $$0, ByteBuf $$1, int $$2) {
        this.c.setBytes($$0, $$1, $$2);
        return this;
    }

    public wx b(int $$0, ByteBuf $$1, int $$2, int $$3) {
        this.c.setBytes($$0, $$1, $$2, $$3);
        return this;
    }

    public wx b(int $$0, byte[] $$1) {
        this.c.setBytes($$0, $$1);
        return this;
    }

    public wx b(int $$0, byte[] $$1, int $$2, int $$3) {
        this.c.setBytes($$0, $$1, $$2, $$3);
        return this;
    }

    public wx b(int $$0, ByteBuffer $$1) {
        this.c.setBytes($$0, $$1);
        return this;
    }

    public int setBytes(int $$0, InputStream $$1, int $$2) throws IOException {
        return this.c.setBytes($$0, $$1, $$2);
    }

    public int setBytes(int $$0, ScatteringByteChannel $$1, int $$2) throws IOException {
        return this.c.setBytes($$0, $$1, $$2);
    }

    public int setBytes(int $$0, FileChannel $$1, long $$2, int $$3) throws IOException {
        return this.c.setBytes($$0, $$1, $$2, $$3);
    }

    public wx j(int $$0, int $$1) {
        this.c.setZero($$0, $$1);
        return this;
    }

    public int setCharSequence(int $$0, CharSequence $$1, Charset $$2) {
        return this.c.setCharSequence($$0, $$1, $$2);
    }

    public boolean readBoolean() {
        return this.c.readBoolean();
    }

    public byte readByte() {
        return this.c.readByte();
    }

    public short readUnsignedByte() {
        return this.c.readUnsignedByte();
    }

    public short readShort() {
        return this.c.readShort();
    }

    public short readShortLE() {
        return this.c.readShortLE();
    }

    public int readUnsignedShort() {
        return this.c.readUnsignedShort();
    }

    public int readUnsignedShortLE() {
        return this.c.readUnsignedShortLE();
    }

    public int readMedium() {
        return this.c.readMedium();
    }

    public int readMediumLE() {
        return this.c.readMediumLE();
    }

    public int readUnsignedMedium() {
        return this.c.readUnsignedMedium();
    }

    public int readUnsignedMediumLE() {
        return this.c.readUnsignedMediumLE();
    }

    public int readInt() {
        return this.c.readInt();
    }

    public int readIntLE() {
        return this.c.readIntLE();
    }

    public long readUnsignedInt() {
        return this.c.readUnsignedInt();
    }

    public long readUnsignedIntLE() {
        return this.c.readUnsignedIntLE();
    }

    public long readLong() {
        return this.c.readLong();
    }

    public long readLongLE() {
        return this.c.readLongLE();
    }

    public char readChar() {
        return this.c.readChar();
    }

    public float readFloat() {
        return this.c.readFloat();
    }

    public double readDouble() {
        return this.c.readDouble();
    }

    public ByteBuf readBytes(int $$0) {
        return this.c.readBytes($$0);
    }

    public ByteBuf readSlice(int $$0) {
        return this.c.readSlice($$0);
    }

    public ByteBuf readRetainedSlice(int $$0) {
        return this.c.readRetainedSlice($$0);
    }

    public wx k(ByteBuf $$0) {
        this.c.readBytes($$0);
        return this;
    }

    public wx c(ByteBuf $$0, int $$1) {
        this.c.readBytes($$0, $$1);
        return this;
    }

    public wx a(ByteBuf $$0, int $$1, int $$2) {
        this.c.readBytes($$0, $$1, $$2);
        return this;
    }

    public wx b(byte[] $$0) {
        this.c.readBytes($$0);
        return this;
    }

    public wx a(byte[] $$0, int $$1, int $$2) {
        this.c.readBytes($$0, $$1, $$2);
        return this;
    }

    public wx a(ByteBuffer $$0) {
        this.c.readBytes($$0);
        return this;
    }

    public wx a(OutputStream $$0, int $$1) throws IOException {
        this.c.readBytes($$0, $$1);
        return this;
    }

    public int readBytes(GatheringByteChannel $$0, int $$1) throws IOException {
        return this.c.readBytes($$0, $$1);
    }

    public CharSequence readCharSequence(int $$0, Charset $$1) {
        return this.c.readCharSequence($$0, $$1);
    }

    public String readString(int $$0, Charset $$1) {
        return this.c.readString($$0, $$1);
    }

    public int readBytes(FileChannel $$0, long $$1, int $$2) throws IOException {
        return this.c.readBytes($$0, $$1, $$2);
    }

    public wx k(int $$0) {
        this.c.skipBytes($$0);
        return this;
    }

    public wx a(boolean $$0) {
        this.c.writeBoolean($$0);
        return this;
    }

    public wx l(int $$0) {
        this.c.writeByte($$0);
        return this;
    }

    public wx m(int $$0) {
        this.c.writeShort($$0);
        return this;
    }

    public wx n(int $$0) {
        this.c.writeShortLE($$0);
        return this;
    }

    public wx o(int $$0) {
        this.c.writeMedium($$0);
        return this;
    }

    public wx p(int $$0) {
        this.c.writeMediumLE($$0);
        return this;
    }

    public wx q(int $$0) {
        this.c.writeInt($$0);
        return this;
    }

    public wx r(int $$0) {
        this.c.writeIntLE($$0);
        return this;
    }

    public wx b(long $$0) {
        this.c.writeLong($$0);
        return this;
    }

    public wx c(long $$0) {
        this.c.writeLongLE($$0);
        return this;
    }

    public wx s(int $$0) {
        this.c.writeChar($$0);
        return this;
    }

    public wx a(float $$0) {
        this.c.writeFloat($$0);
        return this;
    }

    public wx a(double $$0) {
        this.c.writeDouble($$0);
        return this;
    }

    public wx l(ByteBuf $$0) {
        this.c.writeBytes($$0);
        return this;
    }

    public wx d(ByteBuf $$0, int $$1) {
        this.c.writeBytes($$0, $$1);
        return this;
    }

    public wx b(ByteBuf $$0, int $$1, int $$2) {
        this.c.writeBytes($$0, $$1, $$2);
        return this;
    }

    public wx c(byte[] $$0) {
        this.c.writeBytes($$0);
        return this;
    }

    public wx b(byte[] $$0, int $$1, int $$2) {
        this.c.writeBytes($$0, $$1, $$2);
        return this;
    }

    public wx b(ByteBuffer $$0) {
        this.c.writeBytes($$0);
        return this;
    }

    public int writeBytes(InputStream $$0, int $$1) throws IOException {
        return this.c.writeBytes($$0, $$1);
    }

    public int writeBytes(ScatteringByteChannel $$0, int $$1) throws IOException {
        return this.c.writeBytes($$0, $$1);
    }

    public int writeBytes(FileChannel $$0, long $$1, int $$2) throws IOException {
        return this.c.writeBytes($$0, $$1, $$2);
    }

    public wx t(int $$0) {
        this.c.writeZero($$0);
        return this;
    }

    public int writeCharSequence(CharSequence $$0, Charset $$1) {
        return this.c.writeCharSequence($$0, $$1);
    }

    public int indexOf(int $$0, int $$1, byte $$2) {
        return this.c.indexOf($$0, $$1, $$2);
    }

    public int bytesBefore(byte $$0) {
        return this.c.bytesBefore($$0);
    }

    public int bytesBefore(int $$0, byte $$1) {
        return this.c.bytesBefore($$0, $$1);
    }

    public int bytesBefore(int $$0, int $$1, byte $$2) {
        return this.c.bytesBefore($$0, $$1, $$2);
    }

    public int forEachByte(ByteProcessor $$0) {
        return this.c.forEachByte($$0);
    }

    public int forEachByte(int $$0, int $$1, ByteProcessor $$2) {
        return this.c.forEachByte($$0, $$1, $$2);
    }

    public int forEachByteDesc(ByteProcessor $$0) {
        return this.c.forEachByteDesc($$0);
    }

    public int forEachByteDesc(int $$0, int $$1, ByteProcessor $$2) {
        return this.c.forEachByteDesc($$0, $$1, $$2);
    }

    public ByteBuf copy() {
        return this.c.copy();
    }

    public ByteBuf copy(int $$0, int $$1) {
        return this.c.copy($$0, $$1);
    }

    public ByteBuf slice() {
        return this.c.slice();
    }

    public ByteBuf retainedSlice() {
        return this.c.retainedSlice();
    }

    public ByteBuf slice(int $$0, int $$1) {
        return this.c.slice($$0, $$1);
    }

    public ByteBuf retainedSlice(int $$0, int $$1) {
        return this.c.retainedSlice($$0, $$1);
    }

    public ByteBuf duplicate() {
        return this.c.duplicate();
    }

    public ByteBuf retainedDuplicate() {
        return this.c.retainedDuplicate();
    }

    public int nioBufferCount() {
        return this.c.nioBufferCount();
    }

    public ByteBuffer nioBuffer() {
        return this.c.nioBuffer();
    }

    public ByteBuffer nioBuffer(int $$0, int $$1) {
        return this.c.nioBuffer($$0, $$1);
    }

    public ByteBuffer internalNioBuffer(int $$0, int $$1) {
        return this.c.internalNioBuffer($$0, $$1);
    }

    public ByteBuffer[] nioBuffers() {
        return this.c.nioBuffers();
    }

    public ByteBuffer[] nioBuffers(int $$0, int $$1) {
        return this.c.nioBuffers($$0, $$1);
    }

    public boolean hasArray() {
        return this.c.hasArray();
    }

    public byte[] array() {
        return this.c.array();
    }

    public int arrayOffset() {
        return this.c.arrayOffset();
    }

    public boolean hasMemoryAddress() {
        return this.c.hasMemoryAddress();
    }

    public long memoryAddress() {
        return this.c.memoryAddress();
    }

    public String toString(Charset $$0) {
        return this.c.toString($$0);
    }

    public String toString(int $$0, int $$1, Charset $$2) {
        return this.c.toString($$0, $$1, $$2);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public boolean equals(Object $$0) {
        return this.c.equals($$0);
    }

    public int compareTo(ByteBuf $$0) {
        return this.c.compareTo($$0);
    }

    public String toString() {
        return this.c.toString();
    }

    public wx u(int $$0) {
        this.c.retain($$0);
        return this;
    }

    public wx E() {
        this.c.retain();
        return this;
    }

    public wx F() {
        this.c.touch();
        return this;
    }

    public wx a(Object $$0) {
        this.c.touch($$0);
        return this;
    }

    public int refCnt() {
        return this.c.refCnt();
    }

    public boolean release() {
        return this.c.release();
    }

    public boolean release(int $$0) {
        return this.c.release($$0);
    }

    public /* synthetic */ ByteBuf touch(Object object) {
        return this.a(object);
    }

    public /* synthetic */ ByteBuf touch() {
        return this.F();
    }

    public /* synthetic */ ByteBuf retain() {
        return this.E();
    }

    public /* synthetic */ ByteBuf retain(int n2) {
        return this.u(n2);
    }

    public /* synthetic */ ByteBuf writeZero(int n2) {
        return this.t(n2);
    }

    public /* synthetic */ ByteBuf writeBytes(ByteBuffer byteBuffer) {
        return this.b(byteBuffer);
    }

    public /* synthetic */ ByteBuf writeBytes(byte[] byArray, int n2, int n3) {
        return this.b(byArray, n2, n3);
    }

    public /* synthetic */ ByteBuf writeBytes(byte[] byArray) {
        return this.c(byArray);
    }

    public /* synthetic */ ByteBuf writeBytes(ByteBuf byteBuf, int n2, int n3) {
        return this.b(byteBuf, n2, n3);
    }

    public /* synthetic */ ByteBuf writeBytes(ByteBuf byteBuf, int n2) {
        return this.d(byteBuf, n2);
    }

    public /* synthetic */ ByteBuf writeBytes(ByteBuf byteBuf) {
        return this.l(byteBuf);
    }

    public /* synthetic */ ByteBuf writeDouble(double d2) {
        return this.a(d2);
    }

    public /* synthetic */ ByteBuf writeFloat(float f2) {
        return this.a(f2);
    }

    public /* synthetic */ ByteBuf writeChar(int n2) {
        return this.s(n2);
    }

    public /* synthetic */ ByteBuf writeLongLE(long l2) {
        return this.c(l2);
    }

    public /* synthetic */ ByteBuf writeLong(long l2) {
        return this.b(l2);
    }

    public /* synthetic */ ByteBuf writeIntLE(int n2) {
        return this.r(n2);
    }

    public /* synthetic */ ByteBuf writeInt(int n2) {
        return this.q(n2);
    }

    public /* synthetic */ ByteBuf writeMediumLE(int n2) {
        return this.p(n2);
    }

    public /* synthetic */ ByteBuf writeMedium(int n2) {
        return this.o(n2);
    }

    public /* synthetic */ ByteBuf writeShortLE(int n2) {
        return this.n(n2);
    }

    public /* synthetic */ ByteBuf writeShort(int n2) {
        return this.m(n2);
    }

    public /* synthetic */ ByteBuf writeByte(int n2) {
        return this.l(n2);
    }

    public /* synthetic */ ByteBuf writeBoolean(boolean bl2) {
        return this.a(bl2);
    }

    public /* synthetic */ ByteBuf skipBytes(int n2) {
        return this.k(n2);
    }

    public /* synthetic */ ByteBuf readBytes(OutputStream outputStream, int n2) throws IOException {
        return this.a(outputStream, n2);
    }

    public /* synthetic */ ByteBuf readBytes(ByteBuffer byteBuffer) {
        return this.a(byteBuffer);
    }

    public /* synthetic */ ByteBuf readBytes(byte[] byArray, int n2, int n3) {
        return this.a(byArray, n2, n3);
    }

    public /* synthetic */ ByteBuf readBytes(byte[] byArray) {
        return this.b(byArray);
    }

    public /* synthetic */ ByteBuf readBytes(ByteBuf byteBuf, int n2, int n3) {
        return this.a(byteBuf, n2, n3);
    }

    public /* synthetic */ ByteBuf readBytes(ByteBuf byteBuf, int n2) {
        return this.c(byteBuf, n2);
    }

    public /* synthetic */ ByteBuf readBytes(ByteBuf byteBuf) {
        return this.k(byteBuf);
    }

    public /* synthetic */ ByteBuf setZero(int n2, int n3) {
        return this.j(n2, n3);
    }

    public /* synthetic */ ByteBuf setBytes(int n2, ByteBuffer byteBuffer) {
        return this.b(n2, byteBuffer);
    }

    public /* synthetic */ ByteBuf setBytes(int n2, byte[] byArray, int n3, int n4) {
        return this.b(n2, byArray, n3, n4);
    }

    public /* synthetic */ ByteBuf setBytes(int n2, byte[] byArray) {
        return this.b(n2, byArray);
    }

    public /* synthetic */ ByteBuf setBytes(int n2, ByteBuf byteBuf, int n3, int n4) {
        return this.b(n2, byteBuf, n3, n4);
    }

    public /* synthetic */ ByteBuf setBytes(int n2, ByteBuf byteBuf, int n3) {
        return this.b(n2, byteBuf, n3);
    }

    public /* synthetic */ ByteBuf setBytes(int n2, ByteBuf byteBuf) {
        return this.b(n2, byteBuf);
    }

    public /* synthetic */ ByteBuf setDouble(int n2, double d2) {
        return this.a(n2, d2);
    }

    public /* synthetic */ ByteBuf setFloat(int n2, float f2) {
        return this.a(n2, f2);
    }

    public /* synthetic */ ByteBuf setChar(int n2, int n3) {
        return this.i(n2, n3);
    }

    public /* synthetic */ ByteBuf setLongLE(int n2, long l2) {
        return this.b(n2, l2);
    }

    public /* synthetic */ ByteBuf setLong(int n2, long l2) {
        return this.a(n2, l2);
    }

    public /* synthetic */ ByteBuf setIntLE(int n2, int n3) {
        return this.h(n2, n3);
    }

    public /* synthetic */ ByteBuf setInt(int n2, int n3) {
        return this.g(n2, n3);
    }

    public /* synthetic */ ByteBuf setMediumLE(int n2, int n3) {
        return this.f(n2, n3);
    }

    public /* synthetic */ ByteBuf setMedium(int n2, int n3) {
        return this.e(n2, n3);
    }

    public /* synthetic */ ByteBuf setShortLE(int n2, int n3) {
        return this.d(n2, n3);
    }

    public /* synthetic */ ByteBuf setShort(int n2, int n3) {
        return this.c(n2, n3);
    }

    public /* synthetic */ ByteBuf setByte(int n2, int n3) {
        return this.b(n2, n3);
    }

    public /* synthetic */ ByteBuf setBoolean(int n2, boolean bl2) {
        return this.a(n2, bl2);
    }

    public /* synthetic */ ByteBuf getBytes(int n2, OutputStream outputStream, int n3) throws IOException {
        return this.a(n2, outputStream, n3);
    }

    public /* synthetic */ ByteBuf getBytes(int n2, ByteBuffer byteBuffer) {
        return this.a(n2, byteBuffer);
    }

    public /* synthetic */ ByteBuf getBytes(int n2, byte[] byArray, int n3, int n4) {
        return this.a(n2, byArray, n3, n4);
    }

    public /* synthetic */ ByteBuf getBytes(int n2, byte[] byArray) {
        return this.a(n2, byArray);
    }

    public /* synthetic */ ByteBuf getBytes(int n2, ByteBuf byteBuf, int n3, int n4) {
        return this.a(n2, byteBuf, n3, n4);
    }

    public /* synthetic */ ByteBuf getBytes(int n2, ByteBuf byteBuf, int n3) {
        return this.a(n2, byteBuf, n3);
    }

    public /* synthetic */ ByteBuf getBytes(int n2, ByteBuf byteBuf) {
        return this.a(n2, byteBuf);
    }

    public /* synthetic */ ByteBuf ensureWritable(int n2) {
        return this.j(n2);
    }

    public /* synthetic */ ByteBuf discardSomeReadBytes() {
        return this.D();
    }

    public /* synthetic */ ByteBuf discardReadBytes() {
        return this.C();
    }

    public /* synthetic */ ByteBuf resetWriterIndex() {
        return this.B();
    }

    public /* synthetic */ ByteBuf markWriterIndex() {
        return this.A();
    }

    public /* synthetic */ ByteBuf resetReaderIndex() {
        return this.z();
    }

    public /* synthetic */ ByteBuf markReaderIndex() {
        return this.y();
    }

    public /* synthetic */ ByteBuf clear() {
        return this.x();
    }

    public /* synthetic */ ByteBuf setIndex(int n2, int n3) {
        return this.a(n2, n3);
    }

    public /* synthetic */ ByteBuf writerIndex(int n2) {
        return this.i(n2);
    }

    public /* synthetic */ ByteBuf readerIndex(int n2) {
        return this.h(n2);
    }

    public /* synthetic */ ByteBuf capacity(int n2) {
        return this.g(n2);
    }

    public /* synthetic */ ReferenceCounted touch(Object object) {
        return this.a(object);
    }

    public /* synthetic */ ReferenceCounted touch() {
        return this.F();
    }

    public /* synthetic */ ReferenceCounted retain(int n2) {
        return this.u(n2);
    }

    public /* synthetic */ ReferenceCounted retain() {
        return this.E();
    }
}

