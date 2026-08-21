/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public class fql
extends fpq {
    public static final MapCodec<fql> a = RecordCodecBuilder.mapCodec($$02 -> fql.a($$02).and($$02.group((App)yj.a.sizeLimitedListOf(256).fieldOf("lore").forGetter($$0 -> $$0.b), (App)fpp.a(256).forGetter($$0 -> $$0.c), (App)fnz.c.g.optionalFieldOf("entity").forGetter($$0 -> $$0.d))).apply((Applicative)$$02, fql::new));
    private final List<yh> b;
    private final fpp c;
    private final Optional<fnz.c> d;

    public fql(List<frm> $$0, List<yh> $$1, fpp $$2, Optional<fnz.c> $$3) {
        super($$0);
        this.b = List.copyOf($$1);
        this.c = $$2;
        this.d = $$3;
    }

    public fps<fql> a() {
        return fpt.A;
    }

    @Override
    public Set<bhv<?>> b() {
        return this.d.map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
    }

    @Override
    public dlt a(dlt $$0, fnz $$12) {
        $$0.a(ki.m, dop.a, $$1 -> new dop(this.a((dop)$$1, $$12)));
        return $$0;
    }

    private List<yh> a(@Nullable dop $$0, fnz $$1) {
        if ($$0 == null && this.b.isEmpty()) {
            return List.of();
        }
        UnaryOperator<yh> $$2 = fqm.a($$1, this.d.orElse(null));
        List $$3 = this.b.stream().map($$2).toList();
        return this.c.a($$0.a(), $$3, 256);
    }

    public static a c() {
        return new a();
    }

    public static class a
    extends fpq.a<a> {
        private Optional<fnz.c> a = Optional.empty();
        private final ImmutableList.Builder<yh> b = ImmutableList.builder();
        private fpp c = fpp.a.b;

        public a a(fpp $$0) {
            this.c = $$0;
            return this;
        }

        public a a(fnz.c $$0) {
            this.a = Optional.of($$0);
            return this;
        }

        public a a(yh $$0) {
            this.b.add((Object)$$0);
            return this;
        }

        protected a a() {
            return this;
        }

        @Override
        public fpr b() {
            return new fql(this.g(), (List<yh>)this.b.build(), this.c, this.a);
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }
}

