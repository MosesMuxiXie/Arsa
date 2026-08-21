/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.ListBuilder
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public abstract class amk<T>
implements DynamicOps<T> {
    protected final DynamicOps<T> a;

    protected amk(DynamicOps<T> $$0) {
        this.a = $$0;
    }

    public T empty() {
        return (T)this.a.empty();
    }

    public T emptyMap() {
        return (T)this.a.emptyMap();
    }

    public T emptyList() {
        return (T)this.a.emptyList();
    }

    public <U> U convertTo(DynamicOps<U> $$0, T $$1) {
        if (Objects.equals($$0, this.a)) {
            return (U)$$1;
        }
        return (U)this.a.convertTo($$0, $$1);
    }

    public DataResult<Number> getNumberValue(T $$0) {
        return this.a.getNumberValue($$0);
    }

    public T createNumeric(Number $$0) {
        return (T)this.a.createNumeric($$0);
    }

    public T createByte(byte $$0) {
        return (T)this.a.createByte($$0);
    }

    public T createShort(short $$0) {
        return (T)this.a.createShort($$0);
    }

    public T createInt(int $$0) {
        return (T)this.a.createInt($$0);
    }

    public T createLong(long $$0) {
        return (T)this.a.createLong($$0);
    }

    public T createFloat(float $$0) {
        return (T)this.a.createFloat($$0);
    }

    public T createDouble(double $$0) {
        return (T)this.a.createDouble($$0);
    }

    public DataResult<Boolean> getBooleanValue(T $$0) {
        return this.a.getBooleanValue($$0);
    }

    public T createBoolean(boolean $$0) {
        return (T)this.a.createBoolean($$0);
    }

    public DataResult<String> getStringValue(T $$0) {
        return this.a.getStringValue($$0);
    }

    public T createString(String $$0) {
        return (T)this.a.createString($$0);
    }

    public DataResult<T> mergeToList(T $$0, T $$1) {
        return this.a.mergeToList($$0, $$1);
    }

    public DataResult<T> mergeToList(T $$0, List<T> $$1) {
        return this.a.mergeToList($$0, $$1);
    }

    public DataResult<T> mergeToMap(T $$0, T $$1, T $$2) {
        return this.a.mergeToMap($$0, $$1, $$2);
    }

    public DataResult<T> mergeToMap(T $$0, MapLike<T> $$1) {
        return this.a.mergeToMap($$0, $$1);
    }

    public DataResult<T> mergeToMap(T $$0, Map<T, T> $$1) {
        return this.a.mergeToMap($$0, $$1);
    }

    public DataResult<T> mergeToPrimitive(T $$0, T $$1) {
        return this.a.mergeToPrimitive($$0, $$1);
    }

    public DataResult<Stream<Pair<T, T>>> getMapValues(T $$0) {
        return this.a.getMapValues($$0);
    }

    public DataResult<Consumer<BiConsumer<T, T>>> getMapEntries(T $$0) {
        return this.a.getMapEntries($$0);
    }

    public T createMap(Map<T, T> $$0) {
        return (T)this.a.createMap($$0);
    }

    public T createMap(Stream<Pair<T, T>> $$0) {
        return (T)this.a.createMap($$0);
    }

    public DataResult<MapLike<T>> getMap(T $$0) {
        return this.a.getMap($$0);
    }

    public DataResult<Stream<T>> getStream(T $$0) {
        return this.a.getStream($$0);
    }

    public DataResult<Consumer<Consumer<T>>> getList(T $$0) {
        return this.a.getList($$0);
    }

    public T createList(Stream<T> $$0) {
        return (T)this.a.createList($$0);
    }

    public DataResult<ByteBuffer> getByteBuffer(T $$0) {
        return this.a.getByteBuffer($$0);
    }

    public T createByteList(ByteBuffer $$0) {
        return (T)this.a.createByteList($$0);
    }

    public DataResult<IntStream> getIntStream(T $$0) {
        return this.a.getIntStream($$0);
    }

    public T createIntList(IntStream $$0) {
        return (T)this.a.createIntList($$0);
    }

    public DataResult<LongStream> getLongStream(T $$0) {
        return this.a.getLongStream($$0);
    }

    public T createLongList(LongStream $$0) {
        return (T)this.a.createLongList($$0);
    }

    public T remove(T $$0, String $$1) {
        return (T)this.a.remove($$0, $$1);
    }

    public boolean compressMaps() {
        return this.a.compressMaps();
    }

    public ListBuilder<T> listBuilder() {
        return new a(this.a.listBuilder());
    }

    public RecordBuilder<T> mapBuilder() {
        return new b(this.a.mapBuilder());
    }

    protected class a
    implements ListBuilder<T> {
        private final ListBuilder<T> b;

        protected a(ListBuilder<T> $$1) {
            this.b = $$1;
        }

        public DynamicOps<T> ops() {
            return amk.this;
        }

        public DataResult<T> build(T $$0) {
            return this.b.build($$0);
        }

        public ListBuilder<T> add(T $$0) {
            this.b.add($$0);
            return this;
        }

        public ListBuilder<T> add(DataResult<T> $$0) {
            this.b.add($$0);
            return this;
        }

        public <E> ListBuilder<T> add(E $$0, Encoder<E> $$1) {
            this.b.add($$1.encodeStart(this.ops(), $$0));
            return this;
        }

        public <E> ListBuilder<T> addAll(Iterable<E> $$0, Encoder<E> $$12) {
            $$0.forEach($$1 -> this.b.add($$12.encode($$1, this.ops(), this.ops().empty())));
            return this;
        }

        public ListBuilder<T> withErrorsFrom(DataResult<?> $$0) {
            this.b.withErrorsFrom($$0);
            return this;
        }

        public ListBuilder<T> mapError(UnaryOperator<String> $$0) {
            this.b.mapError($$0);
            return this;
        }

        public DataResult<T> build(DataResult<T> $$0) {
            return this.b.build($$0);
        }
    }

    protected class b
    implements RecordBuilder<T> {
        private final RecordBuilder<T> b;

        protected b(RecordBuilder<T> $$1) {
            this.b = $$1;
        }

        public DynamicOps<T> ops() {
            return amk.this;
        }

        public RecordBuilder<T> add(T $$0, T $$1) {
            this.b.add($$0, $$1);
            return this;
        }

        public RecordBuilder<T> add(T $$0, DataResult<T> $$1) {
            this.b.add($$0, $$1);
            return this;
        }

        public RecordBuilder<T> add(DataResult<T> $$0, DataResult<T> $$1) {
            this.b.add($$0, $$1);
            return this;
        }

        public RecordBuilder<T> add(String $$0, T $$1) {
            this.b.add($$0, $$1);
            return this;
        }

        public RecordBuilder<T> add(String $$0, DataResult<T> $$1) {
            this.b.add($$0, $$1);
            return this;
        }

        public <E> RecordBuilder<T> add(String $$0, E $$1, Encoder<E> $$2) {
            return this.b.add($$0, $$2.encodeStart(this.ops(), $$1));
        }

        public RecordBuilder<T> withErrorsFrom(DataResult<?> $$0) {
            this.b.withErrorsFrom($$0);
            return this;
        }

        public RecordBuilder<T> setLifecycle(Lifecycle $$0) {
            this.b.setLifecycle($$0);
            return this;
        }

        public RecordBuilder<T> mapError(UnaryOperator<String> $$0) {
            this.b.mapError($$0);
            return this;
        }

        public DataResult<T> build(T $$0) {
            return this.b.build($$0);
        }

        public DataResult<T> build(DataResult<T> $$0) {
            return this.b.build($$0);
        }
    }
}

