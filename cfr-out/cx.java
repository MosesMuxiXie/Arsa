/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMaps
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMaps;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public final class cx
extends Record
implements bt {
    private final cq.d d;
    private final cb e;
    private final List<e<?>> f;
    private final Object2BooleanMap<amt<dqs<?>>> g;
    private final Map<amo, c> h;
    private final Optional<bs> i;
    private final Optional<cd> j;
    public static final int b = 100;
    public static final MapCodec<cx> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)cq.d.d.optionalFieldOf("level", (Object)cq.d.c).forGetter(cx::b), (App)cb.c.optionalFieldOf("gamemode", (Object)cb.a).forGetter(cx::c), (App)cx$e.a.listOf().optionalFieldOf("stats", List.of()).forGetter(cx::d), (App)bfm.f(dqs.b).optionalFieldOf("recipes", (Object)Object2BooleanMaps.emptyMap()).forGetter(cx::e), (App)Codec.unboundedMap(amo.a, cx$c.b).optionalFieldOf("advancements", Map.of()).forGetter(cx::f), (App)bs.a.optionalFieldOf("looking_at").forGetter(cx::g), (App)cd.a.optionalFieldOf("input").forGetter(cx::h)).apply((Applicative)$$0, cx::new));

    public cx(cq.d $$0, cb $$1, List<e<?>> $$2, Object2BooleanMap<amt<dqs<?>>> $$3, Map<amo, c> $$4, Optional<bs> $$5, Optional<cd> $$6) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
        this.j = $$6;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(cgk $$02, axf $$1, @Nullable ftm $$2) {
        void $$4;
        if (!($$02 instanceof axg)) {
            return false;
        }
        axg $$3 = (axg)$$02;
        if (!this.d.d($$4.cs)) {
            return false;
        }
        if (!this.e.a($$4.a())) {
            return false;
        }
        bdg $$5 = $$4.K();
        for (e<?> e2 : this.f) {
            if (e2.a($$5)) continue;
            return false;
        }
        bdf $$7 = $$4.L();
        for (Object2BooleanMap.Entry $$8 : this.g.object2BooleanEntrySet()) {
            if ($$7.b((amt)$$8.getKey()) == $$8.getBooleanValue()) continue;
            return false;
        }
        if (!this.h.isEmpty()) {
            anb anb2 = $$4.U();
            ang $$10 = $$4.A().s().aB();
            for (Map.Entry<amo, c> $$11 : this.h.entrySet()) {
                ac $$12 = $$10.a($$11.getKey());
                if ($$12 != null && $$11.getValue().test(anb2.b($$12))) continue;
                return false;
            }
        }
        if (this.i.isPresent()) {
            ftm ftm2 = $$4.bV();
            ftm $$14 = $$4.h(1.0f);
            ftm $$15 = ftm2.b($$14.g * 100.0, $$14.h * 100.0, $$14.i * 100.0);
            ftj $$16 = dee.a((dwo)$$4.A(), (cgk)$$4, ftm2, $$15, new fth(ftm2, $$15).g(1.0), $$0 -> !$$0.au(), 0.0f);
            if ($$16 == null || $$16.d() != ftk.a.c) {
                return false;
            }
            cgk $$17 = $$16.a();
            if (!this.i.get().a((axg)$$4, $$17) || !$$4.G($$17)) {
                return false;
            }
        }
        return !this.j.isPresent() || this.j.get().a($$4.ai());
    }

    public MapCodec<cx> a() {
        return bu.c;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cx.class, "level;gameType;stats;recipes;advancements;lookingAt;input", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cx.class, "level;gameType;stats;recipes;advancements;lookingAt;input", "d", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cx.class, "level;gameType;stats;recipes;advancements;lookingAt;input", "d", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public cq.d b() {
        return this.d;
    }

    public cb c() {
        return this.e;
    }

    public List<e<?>> d() {
        return this.f;
    }

    public Object2BooleanMap<amt<dqs<?>>> e() {
        return this.g;
    }

    public Map<amo, c> f() {
        return this.h;
    }

    public Optional<bs> g() {
        return this.i;
    }

    public Optional<cd> h() {
        return this.j;
    }

    static final class e<T>
    extends Record {
        private final bdj<T> b;
        private final jd<T> c;
        private final cq.d d;
        private final Supplier<bdh<T>> e;
        public static final Codec<e<?>> a = mi.w.q().dispatch(e::a, e::a);

        public e(bdj<T> $$0, jd<T> $$1, cq.d $$2) {
            this($$0, $$1, $$2, (Supplier<bdh<T>>)Suppliers.memoize(() -> $$0.b($$1.a())));
        }

        private e(bdj<T> $$0, jd<T> $$1, cq.d $$2, Supplier<bdh<T>> $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        private static <T> MapCodec<e<T>> a(bdj<T> $$0) {
            return RecordCodecBuilder.mapCodec($$12 -> $$12.group((App)$$0.b().r().fieldOf("stat").forGetter(e::b), (App)cq.d.d.optionalFieldOf("value", (Object)cq.d.c).forGetter(e::c)).apply((Applicative)$$12, ($$1, $$2) -> new e($$0, $$1, (cq.d)$$2)));
        }

        public boolean a(bdl $$0) {
            return this.d.d($$0.a(this.e.get()));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "type;value;range;stat", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "type;value;range;stat", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "type;value;range;stat", "b", "c", "d", "e"}, this, $$0);
        }

        public bdj<T> a() {
            return this.b;
        }

        public jd<T> b() {
            return this.c;
        }

        public cq.d c() {
            return this.d;
        }

        public Supplier<bdh<T>> d() {
            return this.e;
        }
    }

    static interface c
    extends Predicate<ae> {
        public static final Codec<c> b = Codec.either(cx$b.a, a.a).xmap(Either::unwrap, $$0 -> {
            if ($$0 instanceof b) {
                b $$1 = (b)$$0;
                return Either.left((Object)$$1);
            }
            if ($$0 instanceof a) {
                a $$2 = (a)$$0;
                return Either.right((Object)$$2);
            }
            throw new UnsupportedOperationException();
        });
    }

    public static class d {
        private cq.d a = cq.d.c;
        private cb b = cb.a;
        private final ImmutableList.Builder<e<?>> c = ImmutableList.builder();
        private final Object2BooleanMap<amt<dqs<?>>> d = new Object2BooleanOpenHashMap();
        private final Map<amo, c> e = Maps.newHashMap();
        private Optional<bs> f = Optional.empty();
        private Optional<cd> g = Optional.empty();

        public static d a() {
            return new d();
        }

        public d a(cq.d $$0) {
            this.a = $$0;
            return this;
        }

        public <T> d a(bdj<T> $$0, jd.c<T> $$1, cq.d $$2) {
            this.c.add(new e<T>($$0, $$1, $$2));
            return this;
        }

        public d a(amt<dqs<?>> $$0, boolean $$1) {
            this.d.put($$0, $$1);
            return this;
        }

        public d a(cb $$0) {
            this.b = $$0;
            return this;
        }

        public d a(bs.a $$0) {
            this.f = Optional.of($$0.b());
            return this;
        }

        public d a(amo $$0, boolean $$1) {
            this.e.put($$0, new b($$1));
            return this;
        }

        public d a(amo $$0, Map<String, Boolean> $$1) {
            this.e.put($$0, new a((Object2BooleanMap<String>)new Object2BooleanOpenHashMap($$1)));
            return this;
        }

        public d a(cd $$0) {
            this.g = Optional.of($$0);
            return this;
        }

        public cx b() {
            return new cx(this.a, this.b, (List<e<?>>)this.c.build(), this.d, this.e, this.f, this.g);
        }
    }

    static final class a
    extends Record
    implements c {
        private final Object2BooleanMap<String> c;
        public static final Codec<a> a = bfm.f(Codec.STRING).xmap(a::new, a::a);

        a(Object2BooleanMap<String> $$0) {
            this.c = $$0;
        }

        public boolean a(ae $$0) {
            for (Object2BooleanMap.Entry $$1 : this.c.object2BooleanEntrySet()) {
                al $$2 = $$0.c((String)$$1.getKey());
                if ($$2 != null && $$2.a() == $$1.getBooleanValue()) continue;
                return false;
            }
            return true;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "criterions", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "criterions", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "criterions", "c"}, this, $$0);
        }

        public Object2BooleanMap<String> a() {
            return this.c;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((ae)object);
        }
    }

    static final class b
    extends Record
    implements c {
        private final boolean c;
        public static final Codec<b> a = Codec.BOOL.xmap(b::new, b::a);

        b(boolean $$0) {
            this.c = $$0;
        }

        public boolean a(ae $$0) {
            return $$0.a() == this.c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "state", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "state", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "state", "c"}, this, $$0);
        }

        public boolean a() {
            return this.c;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((ae)object);
        }
    }
}

