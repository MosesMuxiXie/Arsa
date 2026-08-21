/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public final class duq
extends Record {
    private final a o;
    private final Map<amt<dul>, a> p;
    public static final String a = "_";
    public static final MapCodec<duq> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)duq$a.a.fieldOf("asset_name").forGetter(duq::a), (App)Codec.unboundedMap(amt.a(dum.a), duq$a.a).optionalFieldOf("override_armor_assets", Map.of()).forGetter(duq::b)).apply((Applicative)$$0, duq::new));
    public static final aao<ByteBuf, duq> c = aao.a(duq$a.b, duq::a, aam.a(Object2ObjectOpenHashMap::new, amt.b(dum.a), duq$a.b), duq::b, duq::new);
    public static final duq d = duq.a("quartz");
    public static final duq e = duq.a("iron", Map.of(dum.e, "iron_darker"));
    public static final duq f = duq.a("netherite", Map.of(dum.i, "netherite_darker"));
    public static final duq g = duq.a("redstone");
    public static final duq h = duq.a("copper", Map.of(dum.c, "copper_darker"));
    public static final duq i = duq.a("gold", Map.of(dum.f, "gold_darker"));
    public static final duq j = duq.a("emerald");
    public static final duq k = duq.a("diamond", Map.of(dum.g, "diamond_darker"));
    public static final duq l = duq.a("lapis");
    public static final duq m = duq.a("amethyst");
    public static final duq n = duq.a("resin");

    public duq(a $$0, Map<amt<dul>, a> $$1) {
        this.o = $$0;
        this.p = $$1;
    }

    public static duq a(String $$0) {
        return new duq(new a($$0), Map.of());
    }

    public static duq a(String $$0, Map<amt<dul>, String> $$1) {
        return new duq(new a($$0), Map.copyOf(Maps.transformValues($$1, a::new)));
    }

    public a a(amt<dul> $$0) {
        return this.p.getOrDefault($$0, this.o);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{duq.class, "base;overrides", "o", "p"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{duq.class, "base;overrides", "o", "p"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{duq.class, "base;overrides", "o", "p"}, this, $$0);
    }

    public a a() {
        return this.o;
    }

    public Map<amt<dul>, a> b() {
        return this.p;
    }

    public static final class a
    extends Record {
        private final String c;
        public static final Codec<a> a = bfm.O.xmap(a::new, a::a);
        public static final aao<ByteBuf, a> b = aam.p.a(a::new, a::a);

        public a(String $$0) {
            if (!amo.i($$0)) {
                throw new IllegalArgumentException("Invalid string to use as a resource path element: " + $$0);
            }
            this.c = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "suffix", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "suffix", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "suffix", "c"}, this, $$0);
        }

        public String a() {
            return this.c;
        }
    }
}

