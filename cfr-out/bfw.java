/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.HashFunction
 *  com.google.common.hash.Hasher
 *  com.google.common.hash.Hashing
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.ListBuilder
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  com.mojang.serialization.RecordBuilder$AbstractUniversalBuilder
 */
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.lang.runtime.SwitchBootstraps;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class bfw
implements DynamicOps<HashCode> {
    private static final byte d = 1;
    private static final byte e = 2;
    private static final byte f = 3;
    private static final byte g = 4;
    private static final byte h = 5;
    private static final byte i = 6;
    private static final byte j = 7;
    private static final byte k = 8;
    private static final byte l = 9;
    private static final byte m = 10;
    private static final byte n = 11;
    private static final byte o = 12;
    private static final byte p = 13;
    private static final byte q = 14;
    private static final byte r = 15;
    private static final byte s = 16;
    private static final byte t = 17;
    private static final byte u = 18;
    private static final byte v = 19;
    private static final byte[] w = new byte[]{1};
    private static final byte[] x = new byte[]{13, 0};
    private static final byte[] y = new byte[]{13, 1};
    public static final byte[] a = new byte[]{2, 3};
    public static final byte[] b = new byte[]{4, 5};
    private static final DataResult<Object> z = DataResult.error(() -> "Unsupported operation");
    private static final Comparator<HashCode> A = Comparator.comparingLong(HashCode::padToLong);
    private static final Comparator<Map.Entry<HashCode, HashCode>> B = Map.Entry.comparingByKey(A).thenComparing(Map.Entry.comparingByValue(A));
    private static final Comparator<Pair<HashCode, HashCode>> C = Comparator.comparing(Pair::getFirst, A).thenComparing(Pair::getSecond, A);
    public static final bfw c = new bfw(Hashing.crc32c());
    final HashFunction D;
    final HashCode E;
    private final HashCode F;
    private final HashCode G;
    private final HashCode H;
    private final HashCode I;

    public bfw(HashFunction $$0) {
        this.D = $$0;
        this.E = $$0.hashBytes(w);
        this.F = $$0.hashBytes(a);
        this.G = $$0.hashBytes(b);
        this.I = $$0.hashBytes(x);
        this.H = $$0.hashBytes(y);
    }

    public HashCode a() {
        return this.E;
    }

    public HashCode b() {
        return this.F;
    }

    public HashCode c() {
        return this.G;
    }

    public HashCode a(Number $$0) {
        Number number = $$0;
        Objects.requireNonNull(number);
        Number number2 = number;
        int n2 = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{Byte.class, Short.class, Integer.class, Long.class, Double.class, Float.class}, (Object)number2, n2)) {
            case 0 -> {
                Byte $$1 = (Byte)number2;
                yield this.a($$1);
            }
            case 1 -> {
                Short $$2 = (Short)number2;
                yield this.a($$2);
            }
            case 2 -> {
                Integer $$3 = (Integer)number2;
                yield this.a($$3);
            }
            case 3 -> {
                Long $$4 = (Long)number2;
                yield this.a($$4);
            }
            case 4 -> {
                Double $$5 = (Double)number2;
                yield this.a($$5);
            }
            case 5 -> {
                Float $$6 = (Float)number2;
                yield this.a($$6.floatValue());
            }
            default -> this.a($$0.doubleValue());
        };
    }

    public HashCode a(byte $$0) {
        return this.D.newHasher(2).putByte((byte)6).putByte($$0).hash();
    }

    public HashCode a(short $$0) {
        return this.D.newHasher(3).putByte((byte)7).putShort($$0).hash();
    }

    public HashCode a(int $$0) {
        return this.D.newHasher(5).putByte((byte)8).putInt($$0).hash();
    }

    public HashCode a(long $$0) {
        return this.D.newHasher(9).putByte((byte)9).putLong($$0).hash();
    }

    public HashCode a(float $$0) {
        return this.D.newHasher(5).putByte((byte)10).putFloat($$0).hash();
    }

    public HashCode a(double $$0) {
        return this.D.newHasher(9).putByte((byte)11).putDouble($$0).hash();
    }

    public HashCode a(String $$0) {
        return this.D.newHasher().putByte((byte)12).putInt($$0.length()).putUnencodedChars((CharSequence)$$0).hash();
    }

    public HashCode a(boolean $$0) {
        return $$0 ? this.H : this.I;
    }

    private static Hasher a(Hasher $$0, Map<HashCode, HashCode> $$12) {
        $$0.putByte((byte)2);
        $$12.entrySet().stream().sorted(B).forEach($$1 -> $$0.putBytes(((HashCode)$$1.getKey()).asBytes()).putBytes(((HashCode)$$1.getValue()).asBytes()));
        $$0.putByte((byte)3);
        return $$0;
    }

    static Hasher a(Hasher $$0, Stream<Pair<HashCode, HashCode>> $$12) {
        $$0.putByte((byte)2);
        $$12.sorted(C).forEach($$1 -> $$0.putBytes(((HashCode)$$1.getFirst()).asBytes()).putBytes(((HashCode)$$1.getSecond()).asBytes()));
        $$0.putByte((byte)3);
        return $$0;
    }

    public HashCode a(Stream<Pair<HashCode, HashCode>> $$0) {
        return bfw.a(this.D.newHasher(), $$0).hash();
    }

    public HashCode a(Map<HashCode, HashCode> $$0) {
        return bfw.a(this.D.newHasher(), $$0).hash();
    }

    public HashCode b(Stream<HashCode> $$0) {
        Hasher $$12 = this.D.newHasher();
        $$12.putByte((byte)4);
        $$0.forEach($$1 -> $$12.putBytes($$1.asBytes()));
        $$12.putByte((byte)5);
        return $$12.hash();
    }

    public HashCode a(ByteBuffer $$0) {
        Hasher $$1 = this.D.newHasher();
        $$1.putByte((byte)14);
        $$1.putBytes($$0);
        $$1.putByte((byte)15);
        return $$1.hash();
    }

    public HashCode a(IntStream $$0) {
        Hasher $$1 = this.D.newHasher();
        $$1.putByte((byte)16);
        $$0.forEach(arg_0 -> ((Hasher)$$1).putInt(arg_0));
        $$1.putByte((byte)17);
        return $$1.hash();
    }

    public HashCode a(LongStream $$0) {
        Hasher $$1 = this.D.newHasher();
        $$1.putByte((byte)18);
        $$0.forEach(arg_0 -> ((Hasher)$$1).putLong(arg_0));
        $$1.putByte((byte)19);
        return $$1.hash();
    }

    public HashCode a(HashCode $$0, String $$1) {
        return $$0;
    }

    public RecordBuilder<HashCode> mapBuilder() {
        return new b();
    }

    public ListBuilder<HashCode> listBuilder() {
        return new a();
    }

    public String toString() {
        return "Hash " + String.valueOf(this.D);
    }

    public <U> U a(DynamicOps<U> $$0, HashCode $$1) {
        throw new UnsupportedOperationException("Can't convert from this type");
    }

    public Number a(HashCode $$0, Number $$1) {
        return $$1;
    }

    public HashCode a(HashCode $$0, String $$1, HashCode $$2) {
        return $$0;
    }

    public HashCode a(HashCode $$0, String $$1, Function<HashCode, HashCode> $$2) {
        return $$0;
    }

    public HashCode a(HashCode $$0, HashCode $$1, Function<HashCode, HashCode> $$2) {
        return $$0;
    }

    private static <T> DataResult<T> d() {
        return z;
    }

    public DataResult<HashCode> b(HashCode $$0, String $$1) {
        return bfw.d();
    }

    public DataResult<HashCode> a(HashCode $$0, HashCode $$1) {
        return bfw.d();
    }

    public DataResult<Number> a(HashCode $$0) {
        return bfw.d();
    }

    public DataResult<Boolean> b(HashCode $$0) {
        return bfw.d();
    }

    public DataResult<String> c(HashCode $$0) {
        return bfw.d();
    }

    boolean l(HashCode $$0) {
        return $$0.equals((Object)this.E);
    }

    public DataResult<HashCode> b(HashCode $$0, HashCode $$1) {
        if (this.l($$0)) {
            return DataResult.success((Object)this.b(Stream.of($$1)));
        }
        return bfw.d();
    }

    public DataResult<HashCode> a(HashCode $$0, List<HashCode> $$1) {
        if (this.l($$0)) {
            return DataResult.success((Object)this.b($$1.stream()));
        }
        return bfw.d();
    }

    public DataResult<HashCode> a(HashCode $$0, HashCode $$1, HashCode $$2) {
        if (this.l($$0)) {
            return DataResult.success((Object)this.a(Map.of($$1, $$2)));
        }
        return bfw.d();
    }

    public DataResult<HashCode> a(HashCode $$0, Map<HashCode, HashCode> $$1) {
        if (this.l($$0)) {
            return DataResult.success((Object)this.a($$1));
        }
        return bfw.d();
    }

    public DataResult<HashCode> a(HashCode $$0, MapLike<HashCode> $$1) {
        if (this.l($$0)) {
            return DataResult.success((Object)this.a($$1.entries()));
        }
        return bfw.d();
    }

    public DataResult<Stream<Pair<HashCode, HashCode>>> d(HashCode $$0) {
        return bfw.d();
    }

    public DataResult<Consumer<BiConsumer<HashCode, HashCode>>> e(HashCode $$0) {
        return bfw.d();
    }

    public DataResult<Stream<HashCode>> f(HashCode $$0) {
        return bfw.d();
    }

    public DataResult<Consumer<Consumer<HashCode>>> g(HashCode $$0) {
        return bfw.d();
    }

    public DataResult<MapLike<HashCode>> h(HashCode $$0) {
        return bfw.d();
    }

    public DataResult<ByteBuffer> i(HashCode $$0) {
        return bfw.d();
    }

    public DataResult<IntStream> j(HashCode $$0) {
        return bfw.d();
    }

    public DataResult<LongStream> k(HashCode $$0) {
        return bfw.d();
    }

    public /* synthetic */ Object updateGeneric(Object object, Object object2, Function function) {
        return this.a((HashCode)object, (HashCode)object2, (Function<HashCode, HashCode>)function);
    }

    public /* synthetic */ Object update(Object object, String string, Function function) {
        return this.a((HashCode)object, string, (Function<HashCode, HashCode>)function);
    }

    public /* synthetic */ Object set(Object object, String string, Object object2) {
        return this.a((HashCode)object, string, (HashCode)object2);
    }

    public /* synthetic */ DataResult getGeneric(Object object, Object object2) {
        return this.a((HashCode)object, (HashCode)object2);
    }

    public /* synthetic */ DataResult get(Object object, String string) {
        return this.b((HashCode)object, string);
    }

    public /* synthetic */ Object remove(Object object, String string) {
        return this.a((HashCode)object, string);
    }

    public /* synthetic */ Object createLongList(LongStream longStream) {
        return this.a(longStream);
    }

    public /* synthetic */ DataResult getLongStream(Object object) {
        return this.k((HashCode)object);
    }

    public /* synthetic */ Object createIntList(IntStream intStream) {
        return this.a(intStream);
    }

    public /* synthetic */ DataResult getIntStream(Object object) {
        return this.j((HashCode)object);
    }

    public /* synthetic */ Object createByteList(ByteBuffer byteBuffer) {
        return this.a(byteBuffer);
    }

    public /* synthetic */ DataResult getByteBuffer(Object object) {
        return this.i((HashCode)object);
    }

    public /* synthetic */ Object createList(Stream stream) {
        return this.b(stream);
    }

    public /* synthetic */ DataResult getList(Object object) {
        return this.g((HashCode)object);
    }

    public /* synthetic */ DataResult getStream(Object object) {
        return this.f((HashCode)object);
    }

    public /* synthetic */ Object createMap(Map map) {
        return this.a(map);
    }

    public /* synthetic */ DataResult getMap(Object object) {
        return this.h((HashCode)object);
    }

    public /* synthetic */ Object createMap(Stream stream) {
        return this.a(stream);
    }

    public /* synthetic */ DataResult getMapEntries(Object object) {
        return this.e((HashCode)object);
    }

    public /* synthetic */ DataResult getMapValues(Object object) {
        return this.d((HashCode)object);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, MapLike mapLike) {
        return this.a((HashCode)object, (MapLike<HashCode>)mapLike);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, Map map) {
        return this.a((HashCode)object, map);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, Object object2, Object object3) {
        return this.a((HashCode)object, (HashCode)object2, (HashCode)object3);
    }

    public /* synthetic */ DataResult mergeToList(Object object, List list) {
        return this.a((HashCode)object, list);
    }

    public /* synthetic */ DataResult mergeToList(Object object, Object object2) {
        return this.b((HashCode)object, (HashCode)object2);
    }

    public /* synthetic */ Object createString(String string) {
        return this.a(string);
    }

    public /* synthetic */ DataResult getStringValue(Object object) {
        return this.c((HashCode)object);
    }

    public /* synthetic */ Object createBoolean(boolean bl2) {
        return this.a(bl2);
    }

    public /* synthetic */ DataResult getBooleanValue(Object object) {
        return this.b((HashCode)object);
    }

    public /* synthetic */ Object createDouble(double d2) {
        return this.a(d2);
    }

    public /* synthetic */ Object createFloat(float f2) {
        return this.a(f2);
    }

    public /* synthetic */ Object createLong(long l2) {
        return this.a(l2);
    }

    public /* synthetic */ Object createInt(int n2) {
        return this.a(n2);
    }

    public /* synthetic */ Object createShort(short s2) {
        return this.a(s2);
    }

    public /* synthetic */ Object createByte(byte by2) {
        return this.a(by2);
    }

    public /* synthetic */ Object createNumeric(Number number) {
        return this.a(number);
    }

    public /* synthetic */ Number getNumberValue(Object object, Number number) {
        return this.a((HashCode)object, number);
    }

    public /* synthetic */ DataResult getNumberValue(Object object) {
        return this.a((HashCode)object);
    }

    public /* synthetic */ Object convertTo(DynamicOps dynamicOps, Object object) {
        return this.a(dynamicOps, (HashCode)object);
    }

    public /* synthetic */ Object emptyList() {
        return this.c();
    }

    public /* synthetic */ Object emptyMap() {
        return this.b();
    }

    public /* synthetic */ Object empty() {
        return this.a();
    }

    final class b
    extends RecordBuilder.AbstractUniversalBuilder<HashCode, List<Pair<HashCode, HashCode>>> {
        public b() {
            super((DynamicOps)bfw.this);
        }

        protected List<Pair<HashCode, HashCode>> a() {
            return new ArrayList<Pair<HashCode, HashCode>>();
        }

        protected List<Pair<HashCode, HashCode>> a(HashCode $$0, HashCode $$1, List<Pair<HashCode, HashCode>> $$2) {
            $$2.add((Pair<HashCode, HashCode>)Pair.of((Object)$$0, (Object)$$1));
            return $$2;
        }

        protected DataResult<HashCode> a(List<Pair<HashCode, HashCode>> $$0, HashCode $$1) {
            assert (bfw.this.l($$1));
            return DataResult.success((Object)bfw.a(bfw.this.D.newHasher(), $$0.stream()).hash());
        }

        protected /* synthetic */ Object append(Object object, Object object2, Object object3) {
            return this.a((HashCode)object, (HashCode)object2, (List)object3);
        }

        protected /* synthetic */ DataResult build(Object object, Object object2) {
            return this.a((List)object, (HashCode)object2);
        }

        protected /* synthetic */ Object initBuilder() {
            return this.a();
        }
    }

    class a
    extends ben<HashCode, Hasher> {
        public a() {
            super(bfw.this);
        }

        protected Hasher b() {
            return bfw.this.D.newHasher().putByte((byte)4);
        }

        @Override
        protected Hasher a(Hasher $$0, HashCode $$1) {
            return $$0.putBytes($$1.asBytes());
        }

        @Override
        protected DataResult<HashCode> b(Hasher $$0, HashCode $$1) {
            assert ($$1.equals((Object)bfw.this.E));
            $$0.putByte((byte)5);
            return DataResult.success((Object)$$0.hash());
        }

        @Override
        protected /* synthetic */ Object a() {
            return this.b();
        }
    }
}

