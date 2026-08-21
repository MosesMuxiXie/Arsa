/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public record inr(Map<d, List<c>> b) {
    private static final Codec<List<c>> c = bfm.b(inr$c.a.listOf());
    public static final Codec<inr> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.d(Codec.unboundedMap(d.s, c)).fieldOf("layers").forGetter(inr::b)).apply((Applicative)$$0, inr::new));

    public static a a() {
        return new a();
    }

    public List<c> a(d $$0) {
        return this.b.getOrDefault($$0, List.of());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{inr.class, "layers", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{inr.class, "layers", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{inr.class, "layers", "b"}, this, $$0);
    }

    public static class a {
        private final Map<d, List<c>> a = new EnumMap<d, List<c>>(d.class);

        a() {
        }

        public a a(amo $$0) {
            return this.a($$0, false);
        }

        public a a(amo $$0, boolean $$1) {
            this.a(d.b, inr$c.a($$0, $$1));
            this.b($$0, $$1);
            return this;
        }

        public a b(amo $$0, boolean $$1) {
            return this.a(d.a, inr$c.a($$0, $$1));
        }

        public a a(d $$02, c ... $$1) {
            Collections.addAll(this.a.computeIfAbsent($$02, $$0 -> new ArrayList()), $$1);
            return this;
        }

        public inr a() {
            return new inr((Map)this.a.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, $$0 -> List.copyOf((Collection)$$0.getValue()))));
        }
    }

    public static final class d
    extends Enum<d>
    implements bhh {
        public static final /* enum */ d a = new d("humanoid");
        public static final /* enum */ d b = new d("humanoid_leggings");
        public static final /* enum */ d c = new d("wings");
        public static final /* enum */ d d = new d("wolf_body");
        public static final /* enum */ d e = new d("horse_body");
        public static final /* enum */ d f = new d("llama_body");
        public static final /* enum */ d g = new d("pig_saddle");
        public static final /* enum */ d h = new d("strider_saddle");
        public static final /* enum */ d i = new d("camel_saddle");
        public static final /* enum */ d j = new d("camel_husk_saddle");
        public static final /* enum */ d k = new d("horse_saddle");
        public static final /* enum */ d l = new d("donkey_saddle");
        public static final /* enum */ d m = new d("mule_saddle");
        public static final /* enum */ d n = new d("zombie_horse_saddle");
        public static final /* enum */ d o = new d("skeleton_horse_saddle");
        public static final /* enum */ d p = new d("happy_ghast_body");
        public static final /* enum */ d q = new d("nautilus_saddle");
        public static final /* enum */ d r = new d("nautilus_body");
        public static final Codec<d> s;
        private final String t;
        private static final /* synthetic */ d[] u;

        public static d[] values() {
            return (d[])u.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(String $$0) {
            this.t = $$0;
        }

        @Override
        public String c() {
            return this.t;
        }

        public String a() {
            return "trims/entity/" + this.t;
        }

        private static /* synthetic */ d[] b() {
            return new d[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r};
        }

        static {
            u = inr$d.b();
            s = bhh.a(d::values);
        }
    }

    public static final class c
    extends Record {
        private final amo b;
        private final Optional<b> c;
        private final boolean d;
        public static final Codec<c> a = RecordCodecBuilder.create($$0 -> $$0.group((App)amo.a.fieldOf("texture").forGetter(c::a), (App)inr$b.a.optionalFieldOf("dyeable").forGetter(c::b), (App)Codec.BOOL.optionalFieldOf("use_player_texture", (Object)false).forGetter(c::c)).apply((Applicative)$$0, c::new));

        public c(amo $$0) {
            this($$0, Optional.empty(), false);
        }

        public c(amo $$0, Optional<b> $$1, boolean $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static c a(amo $$0, boolean $$1) {
            return new c($$0, $$1 ? Optional.of(new b(Optional.of(-6265536))) : Optional.empty(), false);
        }

        public static c b(amo $$0, boolean $$1) {
            return new c($$0, $$1 ? Optional.of(new b(Optional.empty())) : Optional.empty(), false);
        }

        public amo a(d $$0) {
            return this.b.a($$1 -> "textures/entity/equipment/" + $$0.c() + "/" + $$1 + ".png");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "textureId;dyeable;usePlayerTexture", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "textureId;dyeable;usePlayerTexture", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "textureId;dyeable;usePlayerTexture", "b", "c", "d"}, this, $$0);
        }

        public amo a() {
            return this.b;
        }

        public Optional<b> b() {
            return this.c;
        }

        public boolean c() {
            return this.d;
        }
    }

    public static final class b
    extends Record {
        private final Optional<Integer> b;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.l.optionalFieldOf("color_when_undyed").forGetter(b::a)).apply((Applicative)$$0, b::new));

        public b(Optional<Integer> $$0) {
            this.b = $$0;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "colorWhenUndyed", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "colorWhenUndyed", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "colorWhenUndyed", "b"}, this, $$0);
        }

        public Optional<Integer> a() {
            return this.b;
        }
    }
}

