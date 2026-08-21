/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Set;

public record hpg(Map<String, String> c, Set<String> d) {
    private final Map<String, String> c;
    private final Set<String> d;
    public static final hpg a = new hpg(Map.of(), Set.of());
    public static final Codec<hpg> b = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.unboundedMap((Codec)Codec.STRING, (Codec)Codec.STRING).optionalFieldOf("values", Map.of()).forGetter(hpg::d), (App)Codec.STRING.listOf().xmap(Set::copyOf, List::copyOf).optionalFieldOf("flags", Set.of()).forGetter(hpg::e)).apply((Applicative)$$0, hpg::new));

    public static a a() {
        return new a();
    }

    public hpg a(hpg $$0) {
        if (this.c()) {
            return $$0;
        }
        if ($$0.c()) {
            return this;
        }
        ImmutableMap.Builder $$1 = ImmutableMap.builderWithExpectedSize((int)(this.c.size() + $$0.c.size()));
        $$1.putAll(this.c);
        $$1.putAll($$0.c);
        ImmutableSet.Builder $$2 = ImmutableSet.builderWithExpectedSize((int)(this.d.size() + $$0.d.size()));
        $$2.addAll(this.d);
        $$2.addAll($$0.d);
        return new hpg((Map<String, String>)$$1.buildKeepingLast(), (Set<String>)$$2.build());
    }

    public String b() {
        StringBuilder $$0 = new StringBuilder();
        for (Map.Entry<String, String> $$1 : this.c.entrySet()) {
            String $$2 = $$1.getKey();
            String $$3 = $$1.getValue();
            $$0.append("#define ").append($$2).append(" ").append($$3).append('\n');
        }
        for (String $$4 : this.d) {
            $$0.append("#define ").append($$4).append('\n');
        }
        return $$0.toString();
    }

    public boolean c() {
        return this.c.isEmpty() && this.d.isEmpty();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hpg.class, "values;flags", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hpg.class, "values;flags", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hpg.class, "values;flags", "c", "d"}, this, $$0);
    }

    public Map<String, String> d() {
        return this.c;
    }

    public Set<String> e() {
        return this.d;
    }

    public static class a {
        private final ImmutableMap.Builder<String, String> a = ImmutableMap.builder();
        private final ImmutableSet.Builder<String> b = ImmutableSet.builder();

        a() {
        }

        public a a(String $$0, String $$1) {
            if ($$1.isBlank()) {
                throw new IllegalArgumentException("Cannot define empty string");
            }
            this.a.put((Object)$$0, (Object)hpg$a.b($$1));
            return this;
        }

        private static String b(String $$0) {
            return $$0.replaceAll("\n", "\\\\\n");
        }

        public a a(String $$0, float $$1) {
            this.a.put((Object)$$0, (Object)String.valueOf($$1));
            return this;
        }

        public a a(String $$0, int $$1) {
            this.a.put((Object)$$0, (Object)String.valueOf($$1));
            return this;
        }

        public a a(String $$0) {
            this.b.add((Object)$$0);
            return this;
        }

        public hpg a() {
            return new hpg((Map<String, String>)this.a.build(), (Set<String>)this.b.build());
        }
    }
}

