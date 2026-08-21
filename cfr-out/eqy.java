/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArraySet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import org.jspecify.annotations.Nullable;

public class eqy<T>
implements eqx<T>,
era<T> {
    private static final int a = 0;
    private volatile b<T> b;
    private final erd<T> c;
    private final bhk d = new bhk("PalettedContainer");

    public void b() {
        this.d.a();
    }

    public void c() {
        this.d.b();
    }

    public static <T> Codec<eqy<T>> a(Codec<T> $$0, erd<T> $$1, T $$2) {
        era.b $$3 = eqy::a;
        return eqy.a($$0, $$1, $$2, $$3);
    }

    public static <T> Codec<era<T>> b(Codec<T> $$0, erd<T> $$12, T $$2) {
        era.b $$3 = ($$02, $$1) -> eqy.a($$02, $$1).map($$0 -> $$0);
        return eqy.a($$0, $$12, $$2, $$3);
    }

    private static <T, C extends era<T>> Codec<C> a(Codec<T> $$0, erd<T> $$12, T $$22, era.b<T, C> $$3) {
        return RecordCodecBuilder.create($$2 -> $$2.group((App)$$0.mapResult(bfm.a($$22)).listOf().fieldOf("palette").forGetter(era.a::a), (App)Codec.LONG_STREAM.lenientOptionalFieldOf("data").forGetter(era.a::b)).apply((Applicative)$$2, era.a::new)).comapFlatMap($$2 -> $$3.read($$12, (era.a)$$2), $$1 -> $$1.a($$12));
    }

    private eqy(erd<T> $$0, eqk $$1, beq $$2, eqw<T> $$3) {
        this.c = $$0;
        this.b = new b<T>($$1, $$2, $$3);
    }

    private eqy(eqy<T> $$0) {
        this.c = $$0.c;
        this.b = $$0.b.a();
    }

    public eqy(T $$0, erd<T> $$1) {
        this.c = $$1;
        this.b = this.a(null, 0);
        this.b.c.a($$0, this);
    }

    private b<T> a(@Nullable b<T> $$0, int $$1) {
        eqk $$2 = this.c.a($$1);
        if ($$0 != null && $$2.equals($$0.b())) {
            return $$0;
        }
        beq $$3 = $$2.b() == 0 ? new bhu(this.c.a()) : new bgy($$2.b(), this.c.a());
        eqw<T> $$4 = $$2.a(this.c, List.of());
        return new b<T>($$2, $$3, $$4);
    }

    @Override
    public int onResize(int $$0, T $$1) {
        b<T> $$2 = this.b;
        b $$3 = this.a($$2, $$0);
        $$3.a($$2.c, $$2.b);
        this.b = $$3;
        return $$3.c.a($$1, eqx.a());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public T a(int $$0, int $$1, int $$2, T $$3) {
        this.b();
        try {
            T t2 = this.a(this.c.a($$0, $$1, $$2), $$3);
            return t2;
        }
        finally {
            this.c();
        }
    }

    public T b(int $$0, int $$1, int $$2, T $$3) {
        return this.a(this.c.a($$0, $$1, $$2), $$3);
    }

    private T a(int $$0, T $$1) {
        int $$2 = this.b.c.a($$1, this);
        int $$3 = this.b.b.a($$0, $$2);
        return this.b.c.a($$3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c(int $$0, int $$1, int $$2, T $$3) {
        this.b();
        try {
            this.b(this.c.a($$0, $$1, $$2), $$3);
        }
        finally {
            this.c();
        }
    }

    private void b(int $$0, T $$1) {
        int $$2 = this.b.c.a($$1, this);
        this.b.b.b($$0, $$2);
    }

    @Override
    public T a(int $$0, int $$1, int $$2) {
        return this.a(this.c.a($$0, $$1, $$2));
    }

    protected T a(int $$0) {
        b<T> $$1 = this.b;
        return $$1.c.a($$1.b.a($$0));
    }

    @Override
    public void a(Consumer<T> $$0) {
        eqw $$1 = this.b.d();
        IntArraySet $$22 = new IntArraySet();
        this.b.b.a(arg_0 -> ((IntSet)$$22).add(arg_0));
        $$22.forEach($$2 -> $$0.accept($$1.a($$2)));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(wx $$0) {
        this.b();
        try {
            byte $$1 = $$0.readByte();
            b<T> $$2 = this.a(this.b, $$1);
            $$2.c.a($$0, this.c.b());
            $$0.c($$2.b.a());
            this.b = $$2;
        }
        finally {
            this.c();
        }
    }

    @Override
    public void b(wx $$0) {
        this.b();
        try {
            this.b.a($$0, this.c.b());
        }
        finally {
            this.c();
        }
    }

    /*
     * WARNING - void declaration
     */
    @VisibleForTesting
    public static <T> DataResult<eqy<T>> a(erd<T> $$0, era.a<T> $$1) {
        void $$20;
        void $$19;
        List<T> $$2 = $$1.a();
        int $$3 = $$0.a();
        eqk $$4 = $$0.b($$2.size());
        int $$5 = $$4.c();
        if ($$1.c() != -1 && $$5 != $$1.c()) {
            return DataResult.error(() -> "Invalid bit count, calculated " + $$5 + ", but container declared " + $$1.c());
        }
        if ($$4.b() == 0) {
            eqw<T> $$6 = $$4.a($$0, $$2);
            bhu $$7 = new bhu($$3);
        } else {
            Optional<LongStream> $$8 = $$1.b();
            if ($$8.isEmpty()) {
                return DataResult.error(() -> "Missing values for non-zero storage");
            }
            long[] $$9 = $$8.get().toArray();
            try {
                if ($$4.a() || $$4.b() != $$5) {
                    eqo<T> $$10 = new eqo<T>($$5, $$2);
                    bgy $$11 = new bgy($$5, $$3, $$9);
                    eqw<T> $$12 = $$4.a($$0, $$2);
                    int[] $$13 = eqy.a($$11, $$10, $$12);
                    eqw<T> $$14 = $$12;
                    bgy $$15 = new bgy($$4.b(), $$3, $$13);
                } else {
                    eqw<T> $$16 = $$4.a($$0, $$2);
                    bgy $$17 = new bgy($$4.b(), $$3, $$9);
                }
            }
            catch (bgy.a $$18) {
                return DataResult.error(() -> "Failed to read PalettedContainer: " + $$18.getMessage());
            }
        }
        return DataResult.success(new eqy<T>($$0, $$4, (beq)$$19, $$20));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public era.a<T> a(erd<T> $$0) {
        this.b();
        try {
            Optional<LongStream> $$10;
            beq $$1 = this.b.b;
            eqw $$2 = this.b.c;
            eqo $$3 = new eqo($$1.c());
            int $$4 = $$0.a();
            int[] $$5 = eqy.a($$1, $$2, $$3);
            eqk $$6 = $$0.b($$3.a());
            int $$7 = $$6.c();
            if ($$7 != 0) {
                bgy $$8 = new bgy($$7, $$4, $$5);
                Optional<LongStream> $$9 = Optional.of(Arrays.stream($$8.a()));
            } else {
                $$10 = Optional.empty();
            }
            era.a a2 = new era.a($$3.c(), $$10, $$7);
            return a2;
        }
        finally {
            this.c();
        }
    }

    private static <T> int[] a(beq $$0, eqw<T> $$1, eqw<T> $$2) {
        int[] $$3 = new int[$$0.b()];
        $$0.a($$3);
        eqx $$4 = eqx.a();
        int $$5 = -1;
        int $$6 = -1;
        for (int $$7 = 0; $$7 < $$3.length; ++$$7) {
            int $$8 = $$3[$$7];
            if ($$8 != $$5) {
                $$5 = $$8;
                $$6 = $$2.a($$1.a($$8), $$4);
            }
            $$3[$$7] = $$6;
        }
        return $$3;
    }

    @Override
    public int d() {
        return this.b.a(this.c.b());
    }

    @Override
    public int e() {
        return this.b.c().c();
    }

    @Override
    public boolean a(Predicate<T> $$0) {
        return this.b.c.a($$0);
    }

    @Override
    public eqy<T> f() {
        return new eqy<T>(this);
    }

    @Override
    public eqy<T> g() {
        return new eqy(this.b.c.a(0), this.c);
    }

    @Override
    public void a(a<T> $$0) {
        if (this.b.c.a() == 1) {
            $$0.accept(this.b.c.a(0), this.b.b.b());
            return;
        }
        Int2IntOpenHashMap $$12 = new Int2IntOpenHashMap();
        this.b.b.a((int $$1) -> $$12.addTo($$1, 1));
        $$12.int2IntEntrySet().forEach($$1 -> $$0.accept(this.b.c.a($$1.getIntKey()), $$1.getIntValue()));
    }

    static final class b<T>
    extends Record {
        private final eqk a;
        final beq b;
        final eqw<T> c;

        b(eqk $$0, beq $$1, eqw<T> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public void a(eqw<T> $$0, beq $$1) {
            eqx $$2 = eqx.a();
            for (int $$3 = 0; $$3 < $$1.b(); ++$$3) {
                T $$4 = $$0.a($$1.a($$3));
                this.b.b($$3, this.c.a($$4, $$2));
            }
        }

        public int a(ji<T> $$0) {
            return 1 + this.c.a($$0) + this.b.a().length * 8;
        }

        public void a(wx $$0, ji<T> $$1) {
            $$0.l(this.b.c());
            this.c.b($$0, $$1);
            $$0.b(this.b.a());
        }

        public b<T> a() {
            return new b<T>(this.a, this.b.d(), this.c.b());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "configuration;storage;palette", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "configuration;storage;palette", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "configuration;storage;palette", "a", "b", "c"}, this, $$0);
        }

        public eqk b() {
            return this.a;
        }

        public beq c() {
            return this.b;
        }

        public eqw<T> d() {
            return this.c;
        }
    }

    @FunctionalInterface
    public static interface a<T> {
        public void accept(T var1, int var2);
    }
}

