/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public record frh(Map<String, fny> b, fnz.c c) implements frm
{
    private final Map<String, fny> b;
    private final fnz.c c;
    public static final MapCodec<frh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.unboundedMap((Codec)Codec.STRING, fny.a).fieldOf("scores").forGetter(frh::c), (App)fnz.c.g.fieldOf("entity").forGetter(frh::d)).apply((Applicative)$$0, frh::new));

    @Override
    public frn a() {
        return fro.h;
    }

    @Override
    public Set<bhv<?>> b() {
        return (Set)Stream.concat(Stream.of(this.c.a()), this.b.values().stream().flatMap($$0 -> $$0.a().stream())).collect(ImmutableSet.toImmutableSet());
    }

    public boolean a(fnz $$0) {
        cgk $$1 = $$0.c(this.c.a());
        if ($$1 == null) {
            return false;
        }
        anm $$2 = $$0.d().i();
        for (Map.Entry<String, fny> $$3 : this.b.entrySet()) {
            if (this.a($$0, $$1, $$2, $$3.getKey(), $$3.getValue())) continue;
            return false;
        }
        return true;
    }

    protected boolean a(fnz $$0, cgk $$1, fur $$2, String $$3, fny $$4) {
        fuj $$5 = $$2.a($$3);
        if ($$5 == null) {
            return false;
        }
        fun $$6 = $$2.d($$1, $$5);
        if ($$6 == null) {
            return false;
        }
        return $$4.b($$0, $$6.a());
    }

    public static a a(fnz.c $$0) {
        return new a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frh.class, "scores;entityTarget", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frh.class, "scores;entityTarget", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frh.class, "scores;entityTarget", "b", "c"}, this, $$0);
    }

    public Map<String, fny> c() {
        return this.b;
    }

    public fnz.c d() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }

    public static class a
    implements frm.a {
        private final ImmutableMap.Builder<String, fny> a = ImmutableMap.builder();
        private final fnz.c b;

        public a(fnz.c $$0) {
            this.b = $$0;
        }

        public a a(String $$0, fny $$1) {
            this.a.put((Object)$$0, (Object)$$1);
            return this;
        }

        @Override
        public frm build() {
            return new frh((Map<String, fny>)this.a.build(), this.b);
        }
    }
}

