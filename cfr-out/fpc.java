/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class fpc
extends fpq {
    private static final Codec<foa<kd>> b = foa.a($$0 -> $$0.a(c::new).b(a::new).c(c::new));
    public static final MapCodec<fpc> a = RecordCodecBuilder.mapCodec($$02 -> fpc.a($$02).and($$02.group((App)b.fieldOf("source").forGetter($$0 -> $$0.c), (App)kh.a.listOf().optionalFieldOf("include").forGetter($$0 -> $$0.d), (App)kh.a.listOf().optionalFieldOf("exclude").forGetter($$0 -> $$0.e))).apply((Applicative)$$02, fpc::new));
    private final foa<kd> c;
    private final Optional<List<kh<?>>> d;
    private final Optional<List<kh<?>>> e;
    private final Predicate<kh<?>> f;

    fpc(List<frm> $$0, foa<kd> $$13, Optional<List<kh<?>>> $$2, Optional<List<kh<?>>> $$3) {
        super($$0);
        this.c = $$13;
        this.d = $$2.map(List::copyOf);
        this.e = $$3.map(List::copyOf);
        ArrayList $$4 = new ArrayList(2);
        $$3.ifPresent($$12 -> $$4.add($$1 -> !$$12.contains($$1)));
        $$2.ifPresent($$1 -> $$4.add($$1::contains));
        this.f = bhs.a($$4);
    }

    public fps<fpc> a() {
        return fpt.J;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(this.c.a());
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        kd $$2 = this.c.a($$1);
        if ($$2 != null) {
            if ($$2 instanceof kf) {
                kf $$32 = (kf)$$2;
                $$0.b($$32.a(this.f));
            } else {
                Collection $$4 = this.e.orElse(List.of());
                this.d.map(Collection::stream).orElse(mi.am.c().map(jd::a)).forEach($$3 -> {
                    if ($$4.contains($$3)) {
                        return;
                    }
                    kk $$4 = $$2.b($$3);
                    if ($$4 != null) {
                        $$0.a($$4);
                    }
                });
            }
        }
        return $$0;
    }

    public static b a(bhv<? extends cgk> $$0) {
        return new b(new c<cgk>($$0));
    }

    public static b b(bhv<? extends elb> $$0) {
        return new b(new a($$0));
    }

    public static class b
    extends fpq.a<b> {
        private final foa<kd> a;
        private Optional<ImmutableList.Builder<kh<?>>> b = Optional.empty();
        private Optional<ImmutableList.Builder<kh<?>>> c = Optional.empty();

        b(foa<kd> $$0) {
            this.a = $$0;
        }

        public b a(kh<?> $$0) {
            if (this.b.isEmpty()) {
                this.b = Optional.of(ImmutableList.builder());
            }
            this.b.get().add($$0);
            return this;
        }

        public b b(kh<?> $$0) {
            if (this.c.isEmpty()) {
                this.c = Optional.of(ImmutableList.builder());
            }
            this.c.get().add($$0);
            return this;
        }

        protected b a() {
            return this;
        }

        @Override
        public fpr b() {
            return new fpc(this.g(), this.a, this.b.map(ImmutableList.Builder::build), this.c.map(ImmutableList.Builder::build));
        }

        @Override
        protected /* synthetic */ fpq.a c() {
            return this.a();
        }
    }

    record c<T extends kd>(bhv<? extends T> a) implements foa.b<T, kd>
    {
        @Override
        public kd a(T $$0) {
            return $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "contextParam", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "contextParam", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "contextParam", "a"}, this, $$0);
        }
    }

    record a(bhv<? extends elb> a) implements foa.b<elb, kd>
    {
        @Override
        public kd a(elb $$0) {
            return $$0.t();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "contextParam", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "contextParam", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "contextParam", "a"}, this, $$0);
        }
    }
}

