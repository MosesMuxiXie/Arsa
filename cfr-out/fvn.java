/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.LongSupplier;

public class fvn {
    public static final Codec<jd<fvn>> a = amr.a(mj.bw);
    private static final Codec<Map<cea<?>, fvl<?, ?>>> d = Codec.dispatchedMap(ceg.T, bhs.b(fvl::a));
    public static final Codec<fvn> b = RecordCodecBuilder.create($$02 -> $$02.group((App)bfm.r.optionalFieldOf("period_ticks").forGetter($$0 -> $$0.e), (App)d.optionalFieldOf("tracks", Map.of()).forGetter($$0 -> $$0.f)).apply((Applicative)$$02, fvn::new)).validate(fvn::b);
    public static final Codec<fvn> c = b.xmap(fvn::a, fvn::a);
    private final Optional<Integer> e;
    private final Map<cea<?>, fvl<?, ?>> f;

    private static fvn a(fvn $$0) {
        Map<cea<?>, fvl<?, ?>> $$1 = Map.copyOf(Maps.filterKeys($$0.f, cea::d));
        return new fvn($$0.e, $$1);
    }

    fvn(Optional<Integer> $$0, Map<cea<?>, fvl<?, ?>> $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    private static DataResult<fvn> b(fvn $$02) {
        if ($$02.e.isEmpty()) {
            return DataResult.success((Object)$$02);
        }
        int $$12 = $$02.e.get();
        DataResult $$2 = DataResult.success((Object)$$02);
        for (fvl<?, ?> $$3 : $$02.f.values()) {
            $$2 = $$2.apply2stable(($$0, $$1) -> $$0, fvl.a($$3, $$12));
        }
        return $$2;
    }

    public static a a() {
        return new a();
    }

    public long a(dwo $$0) {
        long $$1 = this.b($$0);
        if (this.e.isEmpty()) {
            return $$1;
        }
        return $$1 % (long)this.e.get().intValue();
    }

    public long b(dwo $$0) {
        return $$0.al();
    }

    public Optional<Integer> b() {
        return this.e;
    }

    public Set<cea<?>> c() {
        return this.f.keySet();
    }

    public <Value> fvm<Value, ?> a(cea<Value> $$0, LongSupplier $$1) {
        fvl<?, ?> $$2 = this.f.get($$0);
        if ($$2 == null) {
            throw new IllegalStateException("Timeline has no track for " + String.valueOf($$0));
        }
        return $$2.a($$0, this.e, $$1);
    }

    public static class a {
        private Optional<Integer> a = Optional.empty();
        private final ImmutableMap.Builder<cea<?>, fvl<?, ?>> b = ImmutableMap.builder();

        a() {
        }

        public a a(int $$0) {
            this.a = Optional.of($$0);
            return this;
        }

        public <Value, Argument> a a(cea<Value> $$0, cel<Value, Argument> $$1, Consumer<bgc.a<Argument>> $$2) {
            $$0.a().a($$1);
            bgc.a $$3 = new bgc.a();
            $$2.accept($$3);
            this.b.put($$0, new fvl<Value, Argument>($$1, $$3.a()));
            return this;
        }

        public <Value> a a(cea<Value> $$0, Consumer<bgc.a<Value>> $$1) {
            return this.a($$0, cel.a(), $$1);
        }

        public fvn a() {
            return new fvn(this.a, (Map<cea<?>, fvl<?, ?>>)this.b.build());
        }
    }
}

