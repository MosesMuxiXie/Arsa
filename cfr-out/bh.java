/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.Predicate;

public final class bh
extends Record
implements Predicate<kd> {
    private final kc d;
    private final Map<ks.d<?>, ks> e;
    public static final bh a = new bh(kc.c, Map.of());
    public static final MapCodec<bh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)kc.a.optionalFieldOf("components", (Object)kc.c).forGetter(bh::b), (App)ks.b.optionalFieldOf("predicates", Map.of()).forGetter(bh::c)).apply((Applicative)$$0, bh::new));
    public static final aao<xq, bh> c = aao.a(kc.b, bh::b, ks.d, bh::c, bh::new);

    public bh(kc $$0, Map<ks.d<?>, ks> $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public boolean a(kd $$0) {
        if (!this.d.a($$0)) {
            return false;
        }
        for (ks $$1 : this.e.values()) {
            if ($$1.a($$0)) continue;
            return false;
        }
        return true;
    }

    public boolean a() {
        return this.d.b() && this.e.isEmpty();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bh.class, "exact;partial", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bh.class, "exact;partial", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bh.class, "exact;partial", "d", "e"}, this, $$0);
    }

    public kc b() {
        return this.d;
    }

    public Map<ks.d<?>, ks> c() {
        return this.e;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((kd)object);
    }

    public static class a {
        private kc a = kc.c;
        private final ImmutableMap.Builder<ks.d<?>, ks> b = ImmutableMap.builder();

        private a() {
        }

        public static a a() {
            return new a();
        }

        public <T extends kh<?>> a a(kh<?> $$0) {
            ks.a $$1 = ks.a.a($$0);
            this.b.put((Object)$$1, (Object)$$1.a());
            return this;
        }

        public <T extends ks> a a(ks.d<T> $$0, T $$1) {
            this.b.put($$0, $$1);
            return this;
        }

        public a a(kc $$0) {
            this.a = $$0;
            return this;
        }

        public bh b() {
            return new bh(this.a, (Map<ks.d<?>, ks>)this.b.buildOrThrow());
        }
    }
}

