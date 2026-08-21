/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  com.mojang.serialization.RecordBuilder$AbstractStringBuilder
 *  it.unimi.dsi.fastutil.bytes.ByteArrayList
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.lang.runtime.SwitchBootstraps;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class vn
implements DynamicOps<vz> {
    public static final vn a = new vn();

    private vn() {
    }

    public vz a() {
        return vb.b;
    }

    public vz b() {
        return new vf();
    }

    public vz c() {
        return new uz();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <U> U a(DynamicOps<U> $$0, vz $$1) {
        Object object;
        vz vz2 = $$1;
        Objects.requireNonNull(vz2);
        vz vz3 = vz2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{vb.class, ux.class, vs.class, ve.class, vh.class, vc.class, va.class, uw.class, vx.class, vf.class, uz.class, vd.class, vg.class}, (Object)vz3, n2)) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                vb $$2 = (vb)vz3;
                object = $$0.empty();
                return (U)object;
            }
            case 1: {
                byte $$3;
                ux ux2 = (ux)vz3;
                try {
                    byte by2;
                    $$3 = by2 = ux2.n();
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
                object = $$0.createByte($$3);
                return (U)object;
            }
            case 2: {
                short $$4;
                vs vs2 = (vs)vz3;
                {
                    short s2;
                    $$4 = s2 = vs2.n();
                }
                object = $$0.createShort($$4);
                return (U)object;
            }
            case 3: {
                int $$5;
                ve ve2 = (ve)vz3;
                {
                    int n3;
                    $$5 = n3 = ve2.n();
                }
                object = $$0.createInt($$5);
                return (U)object;
            }
            case 4: {
                long $$6;
                vh vh2 = (vh)vz3;
                {
                    long l2;
                    $$6 = l2 = vh2.n();
                }
                object = $$0.createLong($$6);
                return (U)object;
            }
            case 5: {
                float $$7;
                vc vc2 = (vc)vz3;
                {
                    float f2;
                    $$7 = f2 = vc2.n();
                }
                object = $$0.createFloat($$7);
                return (U)object;
            }
            case 6: {
                double $$8;
                va va2 = (va)vz3;
                {
                    double d2;
                    $$8 = d2 = va2.n();
                }
                object = $$0.createDouble($$8);
                return (U)object;
            }
            case 7: {
                uw $$9 = (uw)vz3;
                object = $$0.createByteList(ByteBuffer.wrap($$9.e()));
                return (U)object;
            }
            case 8: {
                String $$10;
                vx vx2 = (vx)vz3;
                {
                    String string;
                    $$10 = string = vx2.k();
                }
                object = $$0.createString($$10);
                return (U)object;
            }
            case 9: {
                vf $$11 = (vf)vz3;
                object = this.convertList($$0, $$11);
                return (U)object;
            }
            case 10: {
                uz $$12 = (uz)vz3;
                object = this.convertMap($$0, $$12);
                return (U)object;
            }
            case 11: {
                vd $$13 = (vd)vz3;
                object = $$0.createIntList(Arrays.stream($$13.g()));
                return (U)object;
            }
            case 12: 
        }
        vg $$14 = (vg)vz3;
        object = $$0.createLongList(Arrays.stream($$14.g()));
        return (U)object;
    }

    public DataResult<Number> a(vz $$0) {
        return $$0.o().map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Not a number"));
    }

    public vz a(Number $$0) {
        return va.a($$0.doubleValue());
    }

    public vz a(byte $$0) {
        return ux.a($$0);
    }

    public vz a(short $$0) {
        return vs.a($$0);
    }

    public vz a(int $$0) {
        return ve.a($$0);
    }

    public vz a(long $$0) {
        return vh.a($$0);
    }

    public vz a(float $$0) {
        return vc.a($$0);
    }

    public vz a(double $$0) {
        return va.a($$0);
    }

    public vz a(boolean $$0) {
        return ux.a($$0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public DataResult<String> b(vz $$0) {
        String $$1;
        if (!($$0 instanceof vx)) return DataResult.error(() -> "Not a string");
        vx vx2 = (vx)$$0;
        try {
            String string;
            $$1 = string = vx2.k();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        return DataResult.success((Object)$$1);
    }

    public vz a(String $$0) {
        return vx.a($$0);
    }

    public DataResult<vz> a(vz $$0, vz $$12) {
        return vn.k($$0).map($$1 -> DataResult.success((Object)$$1.a($$12).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + String.valueOf($$0), (Object)$$0));
    }

    public DataResult<vz> a(vz $$0, List<vz> $$12) {
        return vn.k($$0).map($$1 -> DataResult.success((Object)$$1.a($$12).a())).orElseGet(() -> DataResult.error(() -> "mergeToList called with not a list: " + String.valueOf($$0), (Object)$$0));
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public DataResult<vz> a(vz $$0, vz $$1, vz $$2) {
        void $$4;
        uz uz2;
        if (!($$0 instanceof uz) && !($$0 instanceof vb)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + String.valueOf($$0), (Object)$$0);
        }
        if (!($$1 instanceof vx)) return DataResult.error(() -> "key is not a string: " + String.valueOf($$1), (Object)$$0);
        vx vx2 = (vx)$$1;
        try {
            String string;
            String $$3 = string = vx2.k();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
        if ($$0 instanceof uz) {
            uz $$5 = (uz)$$0;
            uz2 = $$5.k();
        } else {
            uz2 = new uz();
        }
        uz $$6 = uz2;
        $$6.a((String)$$4, $$2);
        return DataResult.success((Object)$$6);
    }

    public DataResult<vz> a(vz $$0, MapLike<vz> $$1) {
        uz uz2;
        if (!($$0 instanceof uz) && !($$0 instanceof vb)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + String.valueOf($$0), (Object)$$0);
        }
        Iterator $$22 = $$1.entries().iterator();
        if (!$$22.hasNext()) {
            if ($$0 == this.a()) {
                return DataResult.success((Object)this.c());
            }
            return DataResult.success((Object)$$0);
        }
        if ($$0 instanceof uz) {
            uz $$3 = (uz)$$0;
            uz2 = $$3.k();
        } else {
            uz2 = new uz();
        }
        uz $$4 = uz2;
        ArrayList $$5 = new ArrayList();
        $$22.forEachRemaining($$2 -> {
            void $$7;
            vz $$3 = (vz)$$2.getFirst();
            if (!($$3 instanceof vx)) {
                $$5.add($$3);
                return;
            }
            vx $$4 = (vx)$$3;
            try {
                String $$5;
                String $$6 = $$5 = $$4.k();
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
            $$4.a((String)$$7, (vz)$$2.getSecond());
        });
        if (!$$5.isEmpty()) {
            return DataResult.error(() -> "some keys are not strings: " + String.valueOf($$5), (Object)$$4);
        }
        return DataResult.success((Object)$$4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public DataResult<vz> a(vz $$0, Map<vz, vz> $$1) {
        uz uz2;
        if (!($$0 instanceof uz) && !($$0 instanceof vb)) {
            return DataResult.error(() -> "mergeToMap called with not a map: " + String.valueOf($$0), (Object)$$0);
        }
        if ($$1.isEmpty()) {
            if ($$0 == this.a()) {
                return DataResult.success((Object)this.c());
            }
            return DataResult.success((Object)$$0);
        }
        if ($$0 instanceof uz) {
            uz $$2 = (uz)$$0;
            uz2 = $$2.k();
        } else {
            uz2 = new uz();
        }
        uz $$3 = uz2;
        ArrayList<vz> $$4 = new ArrayList<vz>();
        for (Map.Entry<vz, vz> $$5 : $$1.entrySet()) {
            vz $$6 = $$5.getKey();
            if ($$6 instanceof vx) {
                vx vx2 = (vx)$$6;
                try {
                    String string;
                    String $$7 = string = vx2.k();
                    $$3.a($$7, $$5.getValue());
                    continue;
                }
                catch (Throwable throwable) {
                    throw new MatchException(throwable.toString(), throwable);
                }
            }
            $$4.add($$6);
        }
        if (!$$4.isEmpty()) {
            return DataResult.error(() -> "some keys are not strings: " + String.valueOf($$4), (Object)$$3);
        }
        return DataResult.success((Object)$$3);
    }

    public DataResult<Stream<Pair<vz, vz>>> c(vz $$02) {
        if ($$02 instanceof uz) {
            uz $$1 = (uz)$$02;
            return DataResult.success($$1.g().stream().map($$0 -> Pair.of((Object)this.a((String)$$0.getKey()), (Object)((vz)$$0.getValue()))));
        }
        return DataResult.error(() -> "Not a map: " + String.valueOf($$02));
    }

    public DataResult<Consumer<BiConsumer<vz, vz>>> d(vz $$0) {
        if ($$0 instanceof uz) {
            uz $$12 = (uz)$$0;
            return DataResult.success($$1 -> {
                for (Map.Entry<String, vz> $$2 : $$12.g()) {
                    $$1.accept(this.a($$2.getKey()), $$2.getValue());
                }
            });
        }
        return DataResult.error(() -> "Not a map: " + String.valueOf($$0));
    }

    public DataResult<MapLike<vz>> e(vz $$0) {
        if ($$0 instanceof uz) {
            final uz $$1 = (uz)$$0;
            return DataResult.success((Object)new MapLike<vz>(){

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                public @Nullable vz a(vz $$0) {
                    if (!($$0 instanceof vx)) throw new UnsupportedOperationException("Cannot get map entry with non-string key: " + String.valueOf($$0));
                    vx vx2 = (vx)$$0;
                    try {
                        String string;
                        String $$12 = string = vx2.k();
                        return $$1.a($$12);
                    }
                    catch (Throwable throwable) {
                        throw new MatchException(throwable.toString(), throwable);
                    }
                }

                public @Nullable vz a(String $$0) {
                    return $$1.a($$0);
                }

                public Stream<Pair<vz, vz>> entries() {
                    return $$1.g().stream().map($$0 -> Pair.of((Object)vn.this.a((String)$$0.getKey()), (Object)((vz)$$0.getValue())));
                }

                public String toString() {
                    return "MapLike[" + String.valueOf($$1) + "]";
                }

                public /* synthetic */ @Nullable Object get(String string) {
                    return this.a(string);
                }

                public /* synthetic */ @Nullable Object get(Object object) {
                    return this.a((vz)object);
                }
            });
        }
        return DataResult.error(() -> "Not a map: " + String.valueOf($$0));
    }

    public vz a(Stream<Pair<vz, vz>> $$0) {
        uz $$12 = new uz();
        $$0.forEach($$1 -> {
            vz $$2 = (vz)$$1.getFirst();
            vz $$3 = (vz)$$1.getSecond();
            if (!($$2 instanceof vx)) throw new UnsupportedOperationException("Cannot create map with non-string key: " + String.valueOf($$2));
            vx $$4 = (vx)$$2;
            try {
                String $$5;
                String $$6 = $$5 = $$4.k();
                $$12.a($$6, $$3);
            }
            catch (Throwable throwable) {
                throw new MatchException(throwable.toString(), throwable);
            }
        });
        return $$12;
    }

    public DataResult<Stream<vz>> f(vz $$0) {
        if ($$0 instanceof uy) {
            uy $$1 = (uy)$$0;
            return DataResult.success($$1.stream());
        }
        return DataResult.error(() -> "Not a list");
    }

    public DataResult<Consumer<Consumer<vz>>> g(vz $$0) {
        if ($$0 instanceof uy) {
            uy $$1 = (uy)$$0;
            return DataResult.success($$1::forEach);
        }
        return DataResult.error(() -> "Not a list: " + String.valueOf($$0));
    }

    public DataResult<ByteBuffer> h(vz $$0) {
        if ($$0 instanceof uw) {
            uw $$1 = (uw)$$0;
            return DataResult.success((Object)ByteBuffer.wrap($$1.e()));
        }
        return super.getByteBuffer((Object)$$0);
    }

    public vz a(ByteBuffer $$0) {
        ByteBuffer $$1 = $$0.duplicate().clear();
        byte[] $$2 = new byte[$$0.capacity()];
        $$1.get(0, $$2, 0, $$2.length);
        return new uw($$2);
    }

    public DataResult<IntStream> i(vz $$0) {
        if ($$0 instanceof vd) {
            vd $$1 = (vd)$$0;
            return DataResult.success((Object)Arrays.stream($$1.g()));
        }
        return super.getIntStream((Object)$$0);
    }

    public vz a(IntStream $$0) {
        return new vd($$0.toArray());
    }

    public DataResult<LongStream> j(vz $$0) {
        if ($$0 instanceof vg) {
            vg $$1 = (vg)$$0;
            return DataResult.success((Object)Arrays.stream($$1.g()));
        }
        return super.getLongStream((Object)$$0);
    }

    public vz a(LongStream $$0) {
        return new vg($$0.toArray());
    }

    public vz b(Stream<vz> $$0) {
        return new vf($$0.collect(bhs.b()));
    }

    public vz a(vz $$0, String $$1) {
        if ($$0 instanceof uz) {
            uz $$2 = (uz)$$0;
            uz $$3 = $$2.k();
            $$3.r($$1);
            return $$3;
        }
        return $$0;
    }

    public String toString() {
        return "NBT";
    }

    public RecordBuilder<vz> mapBuilder() {
        return new f(this);
    }

    private static Optional<d> k(vz $$0) {
        if ($$0 instanceof vb) {
            return Optional.of(new b());
        }
        if ($$0 instanceof uy) {
            uy $$1 = (uy)$$0;
            if ($$1.isEmpty()) {
                return Optional.of(new b());
            }
            uy uy2 = $$1;
            Objects.requireNonNull(uy2);
            uy uy3 = uy2;
            int n2 = 0;
            return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{vf.class, uw.class, vd.class, vg.class}, (Object)uy3, n2)) {
                default -> throw new MatchException(null, null);
                case 0 -> {
                    vf $$2 = (vf)uy3;
                    yield Optional.of(new b($$2));
                }
                case 1 -> {
                    uw $$3 = (uw)uy3;
                    yield Optional.of(new a($$3.e()));
                }
                case 2 -> {
                    vd $$4 = (vd)uy3;
                    yield Optional.of(new c($$4.g()));
                }
                case 3 -> {
                    vg $$5 = (vg)uy3;
                    yield Optional.of(new e($$5.g()));
                }
            };
        }
        return Optional.empty();
    }

    public /* synthetic */ Object remove(Object object, String string) {
        return this.a((vz)object, string);
    }

    public /* synthetic */ Object createLongList(LongStream longStream) {
        return this.a(longStream);
    }

    public /* synthetic */ DataResult getLongStream(Object object) {
        return this.j((vz)object);
    }

    public /* synthetic */ Object createIntList(IntStream intStream) {
        return this.a(intStream);
    }

    public /* synthetic */ DataResult getIntStream(Object object) {
        return this.i((vz)object);
    }

    public /* synthetic */ Object createByteList(ByteBuffer byteBuffer) {
        return this.a(byteBuffer);
    }

    public /* synthetic */ DataResult getByteBuffer(Object object) {
        return this.h((vz)object);
    }

    public /* synthetic */ Object createList(Stream stream) {
        return this.b(stream);
    }

    public /* synthetic */ DataResult getList(Object object) {
        return this.g((vz)object);
    }

    public /* synthetic */ DataResult getStream(Object object) {
        return this.f((vz)object);
    }

    public /* synthetic */ DataResult getMap(Object object) {
        return this.e((vz)object);
    }

    public /* synthetic */ Object createMap(Stream stream) {
        return this.a(stream);
    }

    public /* synthetic */ DataResult getMapEntries(Object object) {
        return this.d((vz)object);
    }

    public /* synthetic */ DataResult getMapValues(Object object) {
        return this.c((vz)object);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, MapLike mapLike) {
        return this.a((vz)object, (MapLike<vz>)mapLike);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, Map map) {
        return this.a((vz)object, map);
    }

    public /* synthetic */ DataResult mergeToMap(Object object, Object object2, Object object3) {
        return this.a((vz)object, (vz)object2, (vz)object3);
    }

    public /* synthetic */ DataResult mergeToList(Object object, List list) {
        return this.a((vz)object, list);
    }

    public /* synthetic */ DataResult mergeToList(Object object, Object object2) {
        return this.a((vz)object, (vz)object2);
    }

    public /* synthetic */ Object createString(String string) {
        return this.a(string);
    }

    public /* synthetic */ DataResult getStringValue(Object object) {
        return this.b((vz)object);
    }

    public /* synthetic */ Object createBoolean(boolean bl2) {
        return this.a(bl2);
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
        return this.a((vz)object);
    }

    public /* synthetic */ Object convertTo(DynamicOps dynamicOps, Object object) {
        return this.a(dynamicOps, (vz)object);
    }

    public /* synthetic */ Object emptyList() {
        return this.b();
    }

    public /* synthetic */ Object emptyMap() {
        return this.c();
    }

    public /* synthetic */ Object empty() {
        return this.a();
    }

    class f
    extends RecordBuilder.AbstractStringBuilder<vz, uz> {
        protected f(vn vn2) {
            super((DynamicOps)vn2);
        }

        protected uz a() {
            return new uz();
        }

        protected uz a(String $$0, vz $$1, uz $$2) {
            $$2.a($$0, $$1);
            return $$2;
        }

        protected DataResult<vz> a(uz $$0, vz $$1) {
            if ($$1 == null || $$1 == vb.b) {
                return DataResult.success((Object)$$0);
            }
            if ($$1 instanceof uz) {
                uz $$2 = (uz)$$1;
                uz $$3 = $$2.k();
                for (Map.Entry<String, vz> $$4 : $$0.g()) {
                    $$3.a($$4.getKey(), $$4.getValue());
                }
                return DataResult.success((Object)$$3);
            }
            return DataResult.error(() -> "mergeToMap called with not a map: " + String.valueOf($$1), (Object)$$1);
        }

        protected /* synthetic */ Object append(String string, Object object, Object object2) {
            return this.a(string, (vz)object, (uz)object2);
        }

        protected /* synthetic */ DataResult build(Object object, Object object2) {
            return this.a((uz)object, (vz)object2);
        }

        protected /* synthetic */ Object initBuilder() {
            return this.a();
        }
    }

    static class b
    implements d {
        private final vf a = new vf();

        b() {
        }

        b(vf $$0) {
            this.a.addAll($$0);
        }

        public b(IntArrayList $$02) {
            $$02.forEach($$0 -> this.a.add(ve.a($$0)));
        }

        public b(ByteArrayList $$02) {
            $$02.forEach($$0 -> this.a.add(ux.a($$0)));
        }

        public b(LongArrayList $$02) {
            $$02.forEach($$0 -> this.a.add(vh.a($$0)));
        }

        @Override
        public d a(vz $$0) {
            this.a.add($$0);
            return this;
        }

        @Override
        public vz a() {
            return this.a;
        }
    }

    static class a
    implements d {
        private final ByteArrayList a = new ByteArrayList();

        public a(byte[] $$0) {
            this.a.addElements(0, $$0);
        }

        @Override
        public d a(vz $$0) {
            if ($$0 instanceof ux) {
                ux $$1 = (ux)$$0;
                this.a.add($$1.j());
                return this;
            }
            return new b(this.a).a($$0);
        }

        @Override
        public vz a() {
            return new uw(this.a.toByteArray());
        }
    }

    static class c
    implements d {
        private final IntArrayList a = new IntArrayList();

        public c(int[] $$0) {
            this.a.addElements(0, $$0);
        }

        @Override
        public d a(vz $$0) {
            if ($$0 instanceof ve) {
                ve $$1 = (ve)$$0;
                this.a.add($$1.h());
                return this;
            }
            return new b(this.a).a($$0);
        }

        @Override
        public vz a() {
            return new vd(this.a.toIntArray());
        }
    }

    static class e
    implements d {
        private final LongArrayList a = new LongArrayList();

        public e(long[] $$0) {
            this.a.addElements(0, $$0);
        }

        @Override
        public d a(vz $$0) {
            if ($$0 instanceof vh) {
                vh $$1 = (vh)$$0;
                this.a.add($$1.g());
                return this;
            }
            return new b(this.a).a($$0);
        }

        @Override
        public vz a() {
            return new vg(this.a.toLongArray());
        }
    }

    static interface d {
        public d a(vz var1);

        default public d a(Iterable<vz> $$0) {
            d $$1 = this;
            for (vz $$2 : $$0) {
                $$1 = $$1.a($$2);
            }
            return $$1;
        }

        default public d a(Stream<vz> $$0) {
            return this.a($$0::iterator);
        }

        public vz a();
    }
}

