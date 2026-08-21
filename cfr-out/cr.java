/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public final class cr
extends Record {
    private final Map<jd<cfk>, b> b;
    public static final Codec<cr> a = Codec.unboundedMap(cfk.a, cr$b.a).xmap(cr::new, cr::a);

    public cr(Map<jd<cfk>, b> $$0) {
        this.b = $$0;
    }

    public boolean a(cgk $$0) {
        chl $$1;
        return $$0 instanceof chl && this.a(($$1 = (chl)$$0).eX());
    }

    public boolean a(chl $$0) {
        return this.a($$0.eX());
    }

    public boolean a(Map<jd<cfk>, cfm> $$0) {
        for (Map.Entry<jd<cfk>, b> $$1 : this.b.entrySet()) {
            cfm $$2 = $$0.get($$1.getKey());
            if ($$1.getValue().a($$2)) continue;
            return false;
        }
        return true;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cr.class, "effectMap", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cr.class, "effectMap", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cr.class, "effectMap", "b"}, this, $$0);
    }

    public Map<jd<cfk>, b> a() {
        return this.b;
    }

    public static final class b
    extends Record {
        private final cq.d b;
        private final cq.d c;
        private final Optional<Boolean> d;
        private final Optional<Boolean> e;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cq.d.d.optionalFieldOf("amplifier", (Object)cq.d.c).forGetter(b::a), (App)cq.d.d.optionalFieldOf("duration", (Object)cq.d.c).forGetter(b::b), (App)Codec.BOOL.optionalFieldOf("ambient").forGetter(b::c), (App)Codec.BOOL.optionalFieldOf("visible").forGetter(b::d)).apply((Applicative)$$0, b::new));

        public b() {
            this(cq.d.c, cq.d.c, Optional.empty(), Optional.empty());
        }

        public b(cq.d $$0, cq.d $$1, Optional<Boolean> $$2, Optional<Boolean> $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        public boolean a(@Nullable cfm $$0) {
            if ($$0 == null) {
                return false;
            }
            if (!this.b.d($$0.e())) {
                return false;
            }
            if (!this.c.d($$0.d())) {
                return false;
            }
            if (this.d.isPresent() && this.d.get().booleanValue() != $$0.f()) {
                return false;
            }
            return !this.e.isPresent() || this.e.get().booleanValue() == $$0.g();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "amplifier;duration;ambient;visible", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "amplifier;duration;ambient;visible", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "amplifier;duration;ambient;visible", "b", "c", "d", "e"}, this, $$0);
        }

        public cq.d a() {
            return this.b;
        }

        public cq.d b() {
            return this.c;
        }

        public Optional<Boolean> c() {
            return this.d;
        }

        public Optional<Boolean> d() {
            return this.e;
        }
    }

    public static class a {
        private final ImmutableMap.Builder<jd<cfk>, b> a = ImmutableMap.builder();

        public static a a() {
            return new a();
        }

        public a a(jd<cfk> $$0) {
            this.a.put($$0, (Object)new b());
            return this;
        }

        public a a(jd<cfk> $$0, b $$1) {
            this.a.put($$0, (Object)$$1);
            return this;
        }

        public Optional<cr> b() {
            return Optional.of(new cr((Map<jd<cfk>, b>)this.a.build()));
        }
    }
}

