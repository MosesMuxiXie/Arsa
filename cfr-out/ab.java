/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public final class ab
extends Record {
    private final Optional<amo> c;
    private final Optional<ao> d;
    private final ag e;
    private final Map<String, ak<?>> f;
    private final af g;
    private final boolean h;
    private final Optional<yh> i;
    private static final Codec<Map<String, ak<?>>> j = Codec.unboundedMap((Codec)Codec.STRING, ak.a).validate($$0 -> $$0.isEmpty() ? DataResult.error(() -> "Advancement criteria cannot be empty") : DataResult.success((Object)$$0));
    public static final Codec<ab> a = RecordCodecBuilder.create($$02 -> $$02.group((App)amo.a.optionalFieldOf("parent").forGetter(ab::b), (App)ao.a.optionalFieldOf("display").forGetter(ab::c), (App)ag.a.optionalFieldOf("rewards", (Object)ag.b).forGetter(ab::d), (App)j.fieldOf("criteria").forGetter(ab::e), (App)af.a.optionalFieldOf("requirements").forGetter($$0 -> Optional.of($$0.f())), (App)Codec.BOOL.optionalFieldOf("sends_telemetry_event", (Object)false).forGetter(ab::g)).apply((Applicative)$$02, ($$0, $$1, $$2, $$3, $$4, $$5) -> {
        af $$6 = $$4.orElseGet(() -> af.a($$3.keySet()));
        return new ab((Optional<amo>)$$0, (Optional<ao>)$$1, (ag)$$2, (Map<String, ak<?>>)$$3, $$6, (boolean)$$5);
    })).validate(ab::a);
    public static final aao<xq, ab> b = aao.a(ab::a, ab::b);

    public ab(Optional<amo> $$0, Optional<ao> $$1, ag $$2, Map<String, ak<?>> $$3, af $$4, boolean $$5) {
        this($$0, $$1, $$2, Map.copyOf($$3), $$4, $$5, $$1.map(ab::a));
    }

    public ab(Optional<amo> $$0, Optional<ao> $$1, ag $$2, Map<String, ak<?>> $$3, af $$4, boolean $$5, Optional<yh> $$6) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
        this.g = $$4;
        this.h = $$5;
        this.i = $$6;
    }

    private static DataResult<ab> a(ab $$0) {
        return $$0.f().a($$0.e().keySet()).map($$1 -> $$0);
    }

    private static yh a(ao $$0) {
        yh $$12 = $$0.a();
        l $$2 = $$0.e().a();
        yw $$3 = yk.a($$12.f(), zf.a.a($$2)).f("\n").b($$0.b());
        yw $$4 = $$12.f().a($$1 -> $$1.a(new yo.e($$3)));
        return yk.a($$4).a($$2);
    }

    public static yh a(ac $$0) {
        return $$0.b().h().orElseGet(() -> yh.b($$0.a().toString()));
    }

    private void a(xq $$0) {
        $$0.a(this.c, wx::a);
        ao.b.a(aam::a).encode($$0, this.d);
        this.g.a($$0);
        $$0.a(this.h);
    }

    private static ab b(xq $$0) {
        return new ab($$0.b(wx::q), (Optional)ao.b.a(aam::a).decode($$0), ag.b, Map.of(), new af($$0), $$0.readBoolean());
    }

    public boolean a() {
        return this.c.isEmpty();
    }

    public void a(bgp $$0, je.a $$1) {
        this.f.forEach(($$2, $$3) -> {
            bd $$4 = new bd($$0.a(new bgp.i((String)$$2)), $$1);
            $$3.b().a($$4);
        });
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ab.class, "parent;display;rewards;criteria;requirements;sendsTelemetryEvent;name", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ab.class, "parent;display;rewards;criteria;requirements;sendsTelemetryEvent;name", "c", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ab.class, "parent;display;rewards;criteria;requirements;sendsTelemetryEvent;name", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public Optional<amo> b() {
        return this.c;
    }

    public Optional<ao> c() {
        return this.d;
    }

    public ag d() {
        return this.e;
    }

    public Map<String, ak<?>> e() {
        return this.f;
    }

    public af f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public Optional<yh> h() {
        return this.i;
    }

    public static class a {
        private Optional<amo> a = Optional.empty();
        private Optional<ao> b = Optional.empty();
        private ag c = ag.b;
        private final ImmutableMap.Builder<String, ak<?>> d = ImmutableMap.builder();
        private Optional<af> e = Optional.empty();
        private af.a f = af.a.a;
        private boolean g;

        public static a a() {
            return new a().c();
        }

        public static a b() {
            return new a();
        }

        public a a(ac $$0) {
            this.a = Optional.of($$0.a());
            return this;
        }

        @Deprecated(forRemoval=true)
        public a a(amo $$0) {
            this.a = Optional.of($$0);
            return this;
        }

        public a a(dlt $$0, yh $$1, yh $$2, @Nullable amo $$3, ai $$4, boolean $$5, boolean $$6, boolean $$7) {
            return this.a(new ao($$0, $$1, $$2, Optional.ofNullable($$3).map(iu.b::new), $$4, $$5, $$6, $$7));
        }

        public a a(dwn $$0, yh $$1, yh $$2, @Nullable amo $$3, ai $$4, boolean $$5, boolean $$6, boolean $$7) {
            return this.a(new ao(new dlt($$0.h()), $$1, $$2, Optional.ofNullable($$3).map(iu.b::new), $$4, $$5, $$6, $$7));
        }

        public a a(ao $$0) {
            this.b = Optional.of($$0);
            return this;
        }

        public a a(ag.a $$0) {
            return this.a($$0.a());
        }

        public a a(ag $$0) {
            this.c = $$0;
            return this;
        }

        public a a(String $$0, ak<?> $$1) {
            this.d.put((Object)$$0, $$1);
            return this;
        }

        public a a(af.a $$0) {
            this.f = $$0;
            return this;
        }

        public a a(af $$0) {
            this.e = Optional.of($$0);
            return this;
        }

        public a c() {
            this.g = true;
            return this;
        }

        public ac b(amo $$0) {
            ImmutableMap $$1 = this.d.buildOrThrow();
            af $$2 = this.e.orElseGet(() -> this.a((Map)$$1));
            return new ac($$0, new ab(this.a, this.b, this.c, (Map<String, ak<?>>)$$1, $$2, this.g));
        }

        public ac a(Consumer<ac> $$0, String $$1) {
            ac $$2 = this.b(amo.a($$1));
            $$0.accept($$2);
            return $$2;
        }

        private /* synthetic */ af a(Map $$0) {
            return this.f.create($$0.keySet());
        }
    }
}

