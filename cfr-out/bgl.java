/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.ListBuilder
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  com.mojang.serialization.RecordBuilder$AbstractUniversalBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class bgl
implements DynamicOps<bhr> {
    public static final bgl a = new bgl();
    private static final MapLike<bhr> b = new MapLike<bhr>(){

        public @Nullable bhr a(bhr $$0) {
            return null;
        }

        public @Nullable bhr a(String $$0) {
            return null;
        }

        public Stream<Pair<bhr, bhr>> entries() {
            return Stream.empty();
        }

        public /* synthetic */ @Nullable Object get(String string) {
            return this.a(string);
        }

        public /* synthetic */ @Nullable Object get(Object object) {
            return this.a((bhr)((Object)object));
        }
    };

    private bgl() {
    }

    public <U> U a(DynamicOps<U> $$0, bhr $$1) {
        return (U)$$0.empty();
    }

    public bhr a() {
        return bhr.a;
    }

    public bhr b() {
        return bhr.a;
    }

    public bhr c() {
        return bhr.a;
    }

    public bhr a(Number $$0) {
        return bhr.a;
    }

    public bhr a(byte $$0) {
        return bhr.a;
    }

    public bhr a(short $$0) {
        return bhr.a;
    }

    public bhr a(int $$0) {
        return bhr.a;
    }

    public bhr a(long $$0) {
        return bhr.a;
    }

    public bhr a(float $$0) {
        return bhr.a;
    }

    public bhr a(double $$0) {
        return bhr.a;
    }

    public bhr a(boolean $$0) {
        return bhr.a;
    }

    public bhr a(String $$0) {
        return bhr.a;
    }

    public DataResult<Number> a(bhr $$0) {
        return DataResult.success((Object)0);
    }

    public DataResult<Boolean> b(bhr $$0) {
        return DataResult.success((Object)false);
    }

    public DataResult<String> c(bhr $$0) {
        return DataResult.success((Object)"");
    }

    public DataResult<bhr> a(bhr $$0, bhr $$1) {
        return DataResult.success((Object)((Object)bhr.a));
    }

    public DataResult<bhr> a(bhr $$0, List<bhr> $$1) {
        return DataResult.success((Object)((Object)bhr.a));
    }

    public DataResult<bhr> a(bhr $$0, bhr $$1, bhr $$2) {
        return DataResult.success((Object)((Object)bhr.a));
    }

    public DataResult<bhr> a(bhr $$0, Map<bhr, bhr> $$1) {
        return DataResult.success((Object)((Object)bhr.a));
    }

    public DataResult<bhr> a(bhr $$0, MapLike<bhr> $$1) {
        return DataResult.success((Object)((Object)bhr.a));
    }

    public DataResult<Stream<Pair<bhr, bhr>>> d(bhr $$0) {
        return DataResult.success(Stream.empty());
    }

    public DataResult<Consumer<BiConsumer<bhr, bhr>>> e(bhr $$02) {
        return DataResult.success($$0 -> {});
    }

    public DataResult<MapLike<bhr>> f(bhr $$0) {
        return DataResult.success(b);
    }

    public DataResult<Stream<bhr>> g(bhr $$0) {
        return DataResult.success(Stream.empty());
    }

    public DataResult<Consumer<Consumer<bhr>>> h(bhr $$02) {
        return DataResult.success($$0 -> {});
    }

    public DataResult<ByteBuffer> i(bhr $$0) {
        return DataResult.success((Object)ByteBuffer.wrap(new byte[0]));
    }

    public DataResult<IntStream> j(bhr $$0) {
        return DataResult.success((Object)IntStream.empty());
    }

    public DataResult<LongStream> k(bhr $$0) {
        return DataResult.success((Object)LongStream.empty());
    }

    public bhr a(Stream<Pair<bhr, bhr>> $$0) {
        return bhr.a;
    }

    public bhr a(Map<bhr, bhr> $$0) {
        return bhr.a;
    }

    public bhr b(Stream<bhr> $$0) {
        return bhr.a;
    }

    public bhr a(ByteBuffer $$0) {
        return bhr.a;
    }

    public bhr a(IntStream $$0) {
        return bhr.a;
    }

    public bhr a(LongStream $$0) {
        return bhr.a;
    }

    public bhr a(bhr $$0, String $$1) {
        return $$0;
    }

    public RecordBuilder<bhr> mapBuilder() {
        return new b(this);
    }

    public ListBuilder<bhr> listBuilder() {
        return new a(this);
    }

    public String toString() {
        return "Null";
    }

    public /* synthetic */ Object remove(Object object, String string) {
        return this.a((bhr)((Object)object), string);
    }

    public /* synthetic */ Object createLongList(LongStream longStream) {
        return this.a(longStream);
    }

    public /* synthetic */ DataResult getLongStream(Object object) {
        return this.k((bhr)((Object)object));
    }

    public /* synthetic */ Object createIntList(IntStream intStream) {
        return this.a(intStream);
    }

    public /* synthetic */ DataResult getIntStream(Object object) {
        return this.j((bhr)((Object)object));
    }

    public /* synthetic */ Object createByteList(ByteBuffer byteBuffer) {
        return this.a(byteBuffer);
    }

    public /* synthetic */ DataResult getByteBuffer(Object object) {
        return this.i((bhr)((Object)object));
    }

    public /* synthetic */ Object createList(Stream stream) {
        return this.b(stream);
    }

    public /* synthetic */ DataResult getList(Object object) {
        return this.h((bhr)((Object)object));
    }

    public /* synthetic */ DataResult getStream(Object object) {
        return this.g((bhr)((Object)object));
    }

    public /* synthetic */ Object createMap(Map map) {
        return this.a(map);
    }

    public /* synthetic */ DataResult getMap(Object object) {
        return this.f((bhr)((Object)object));
    }

    public /* synthetic */ Object createMap(Stream stream) {
        return this.a(stream);
    }

    public /* synthetic */ DataResult getMapEntries(Object object) {
        return this.e((bhr)((Object)object));
    }

    public /* synthetic */ DataResult getMapValues(Object object) {
        return this.d((bhr)((Object)object));
    }

    public /* synthetic */ DataResult mergeToMap(Object object, MapLike mapLike) {
        return this.a((bhr)((Object)object), (MapLike<bhr>)mapLike);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, Map map) {
        return this.a((bhr)((Object)object), map);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, Object object2, Object object3) {
        return this.a((bhr)((Object)object), (bhr)((Object)object2), (bhr)((Object)object3));
    }

    public /* synthetic */ DataResult mergeToList(Object object, List list) {
        return this.a((bhr)((Object)object), list);
    }

    public /* synthetic */ DataResult mergeToList(Object object, Object object2) {
        return this.a((bhr)((Object)object), (bhr)((Object)object2));
    }

    public /* synthetic */ Object createString(String string) {
        return this.a(string);
    }

    public /* synthetic */ DataResult getStringValue(Object object) {
        return this.c((bhr)((Object)object));
    }

    public /* synthetic */ Object createBoolean(boolean bl2) {
        return this.a(bl2);
    }

    public /* synthetic */ DataResult getBooleanValue(Object object) {
        return this.b((bhr)((Object)object));
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

    public /* synthetic */ DataResult getNumberValue(Object object) {
        return this.a((bhr)((Object)object));
    }

    public /* synthetic */ Object convertTo(DynamicOps dynamicOps, Object object) {
        return this.a(dynamicOps, (bhr)((Object)object));
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

    static final class b
    extends RecordBuilder.AbstractUniversalBuilder<bhr, bhr> {
        public b(DynamicOps<bhr> $$0) {
            super($$0);
        }

        protected bhr a() {
            return bhr.a;
        }

        protected bhr a(bhr $$0, bhr $$1, bhr $$2) {
            return $$2;
        }

        protected DataResult<bhr> a(bhr $$0, bhr $$1) {
            return DataResult.success((Object)((Object)$$1));
        }

        protected /* synthetic */ Object append(Object object, Object object2, Object object3) {
            return this.a((bhr)((Object)object), (bhr)((Object)object2), (bhr)((Object)object3));
        }

        protected /* synthetic */ DataResult build(Object object, Object object2) {
            return this.a((bhr)((Object)object), (bhr)((Object)object2));
        }

        protected /* synthetic */ Object initBuilder() {
            return this.a();
        }
    }

    static final class a
    extends ben<bhr, bhr> {
        public a(DynamicOps<bhr> $$0) {
            super($$0);
        }

        protected bhr b() {
            return bhr.a;
        }

        @Override
        protected bhr a(bhr $$0, bhr $$1) {
            return $$0;
        }

        @Override
        protected DataResult<bhr> b(bhr $$0, bhr $$1) {
            return DataResult.success((Object)((Object)$$0));
        }

        @Override
        protected /* synthetic */ Object a() {
            return this.b();
        }
    }
}

