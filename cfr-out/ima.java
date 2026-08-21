/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Supplier
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntUnaryOperator;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class ima
extends Record
implements ilu {
    private final List<amo> d;
    private final amo e;
    private final Map<String, amo> f;
    private final String g;
    static final Logger h = LogUtils.getLogger();
    public static final String b = "_";
    public static final MapCodec<ima> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.list(amo.a).fieldOf("textures").forGetter(ima::b), (App)amo.a.fieldOf("palette_key").forGetter(ima::c), (App)Codec.unboundedMap((Codec)Codec.STRING, amo.a).fieldOf("permutations").forGetter(ima::d), (App)Codec.STRING.optionalFieldOf("separator", (Object)b).forGetter(ima::e)).apply((Applicative)$$0, ima::new));

    public ima(List<amo> $$0, amo $$1, Map<String, amo> $$2) {
        this($$0, $$1, $$2, b);
    }

    public ima(List<amo> $$0, amo $$1, Map<String, amo> $$2, String $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    public void a(baz $$0, ilu.c $$1) {
        Supplier $$2 = Suppliers.memoize(() -> ima.a($$0, this.e));
        HashMap $$3 = new HashMap();
        this.f.forEach((arg_0, arg_1) -> ima.a($$3, (java.util.function.Supplier)$$2, $$0, arg_0, arg_1));
        for (amo $$4 : this.d) {
            amo $$5 = a.a($$4);
            Optional<bax> $$6 = $$0.getResource($$5);
            if ($$6.isEmpty()) {
                h.warn("Unable to find texture {}", (Object)$$5);
                continue;
            }
            ilz $$7 = new ilz($$5, $$6.get(), $$3.size());
            for (Map.Entry $$8 : $$3.entrySet()) {
                amo $$9 = $$4.g(this.g + (String)$$8.getKey());
                $$1.a($$9, new a($$7, (java.util.function.Supplier)$$8.getValue(), $$9));
            }
        }
    }

    private static IntUnaryOperator a(int[] $$0, int[] $$1) {
        if ($$1.length != $$0.length) {
            h.warn("Palette mapping has different sizes: {} and {}", (Object)$$0.length, (Object)$$1.length);
            throw new IllegalArgumentException();
        }
        Int2IntOpenHashMap $$2 = new Int2IntOpenHashMap($$1.length);
        for (int $$3 = 0; $$3 < $$0.length; ++$$3) {
            int $$4 = $$0[$$3];
            if (bel.b($$4) == 0) continue;
            $$2.put(bel.h($$4), $$1[$$3]);
        }
        return arg_0 -> ima.a((Int2IntMap)$$2, arg_0);
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private static int[] a(baz $$0, amo $$1) {
        Optional<bax> $$2 = $$0.getResource(a.a($$1));
        if ($$2.isEmpty()) {
            h.error("Failed to load palette image {}", (Object)$$1);
            throw new IllegalArgumentException();
        }
        try (InputStream $$3 = $$2.get().d();){
            fyh $$4 = fyh.a($$3);
            try {
                int[] nArray = $$4.e();
                if ($$4 != null) {
                    $$4.close();
                }
                return nArray;
            }
            catch (Throwable throwable) {
                if ($$4 != null) {
                    try {
                        $$4.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                }
                throw throwable;
            }
        }
        catch (Exception $$5) {
            h.error("Couldn't load texture {}", (Object)$$1, (Object)$$5);
            throw new IllegalArgumentException();
        }
    }

    public MapCodec<ima> a() {
        return c;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ima.class, "textures;paletteKey;permutations;separator", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ima.class, "textures;paletteKey;permutations;separator", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ima.class, "textures;paletteKey;permutations;separator", "d", "e", "f", "g"}, this, $$0);
    }

    public List<amo> b() {
        return this.d;
    }

    public amo c() {
        return this.e;
    }

    public Map<String, amo> d() {
        return this.f;
    }

    public String e() {
        return this.g;
    }

    private static /* synthetic */ int a(Int2IntMap $$0, int $$1) {
        int $$2 = bel.b($$1);
        if ($$2 == 0) {
            return $$1;
        }
        int $$3 = bel.h($$1);
        int $$4 = $$0.getOrDefault($$3, bel.g($$3));
        int $$5 = bel.b($$4);
        return bel.f($$2 * $$5 / 255, $$4);
    }

    private static /* synthetic */ void a(Map $$0, java.util.function.Supplier $$1, baz $$2, String $$3, amo $$4) {
        $$0.put($$3, Suppliers.memoize(() -> ima.a((java.util.function.Supplier)$$1, $$2, $$4)));
    }

    private static /* synthetic */ IntUnaryOperator a(java.util.function.Supplier $$0, baz $$1, amo $$2) {
        return ima.a((int[])$$0.get(), ima.a($$1, $$2));
    }

    record a(ilz a, java.util.function.Supplier<IntUnaryOperator> b, amo c) implements ilu.a
    {
        private final ilz a;
        private final java.util.function.Supplier<IntUnaryOperator> b;
        private final amo c;

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public @Nullable ilk get(ilt $$0) {
            try {
                fyh $$1 = this.a.a().a(this.b.get());
                ilk ilk2 = new ilk(this.c, new ina($$1.a(), $$1.b()), $$1);
                return ilk2;
            }
            catch (IOException | IllegalArgumentException $$2) {
                h.error("unable to apply palette to {}", (Object)this.c, (Object)$$2);
                ilk ilk3 = null;
                return ilk3;
            }
            finally {
                this.a.b();
            }
        }

        @Override
        public void a() {
            this.a.b();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "baseImage;palette;permutationLocation", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "baseImage;palette;permutationLocation", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "baseImage;palette;permutationLocation", "a", "b", "c"}, this, $$0);
        }

        public ilz b() {
            return this.a;
        }

        public java.util.function.Supplier<IntUnaryOperator> c() {
            return this.b;
        }

        public amo d() {
            return this.c;
        }
    }
}

