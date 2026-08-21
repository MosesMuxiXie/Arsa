/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class dsu
implements dpe {
    public static final dsu a = new dsu((Object2IntOpenHashMap<jd<dso>>)new Object2IntOpenHashMap());
    private static final Codec<Integer> d = Codec.intRange((int)1, (int)255);
    public static final Codec<dsu> b = Codec.unboundedMap(dso.c, d).xmap($$0 -> new dsu((Object2IntOpenHashMap<jd<dso>>)new Object2IntOpenHashMap($$0)), $$0 -> $$0.e);
    public static final aao<xq, dsu> c = aao.a(aam.a(Object2IntOpenHashMap::new, dso.d, aam.h), (C $$0) -> $$0.e, dsu::new);
    final Object2IntOpenHashMap<jd<dso>> e;

    dsu(Object2IntOpenHashMap<jd<dso>> $$0) {
        this.e = $$0;
        for (Object2IntMap.Entry $$1 : $$0.object2IntEntrySet()) {
            int $$2 = $$1.getIntValue();
            if ($$2 >= 0 && $$2 <= 255) continue;
            throw new IllegalArgumentException("Enchantment " + String.valueOf($$1.getKey()) + " has invalid level " + $$2);
        }
    }

    public int a(jd<dso> $$0) {
        return this.e.getInt($$0);
    }

    @Override
    public void a(dlp.b $$0, Consumer<yh> $$1, dnj $$2, kd $$3) {
        jf.a $$4 = $$0.a();
        jh<dso> $$5 = dsu.a($$4, mj.bf, bds.a);
        for (jd jd2 : $$5) {
            int $$7 = this.e.getInt((Object)jd2);
            if ($$7 <= 0) continue;
            $$1.accept(dso.a((jd<dso>)jd2, $$7));
        }
        for (Object2IntMap.Entry entry : this.e.object2IntEntrySet()) {
            jd $$9 = (jd)entry.getKey();
            if ($$5.a($$9)) continue;
            $$1.accept(dso.a((jd<dso>)((jd)entry.getKey()), entry.getIntValue()));
        }
    }

    private static <T> jh<T> a(@Nullable jf.a $$0, amt<jq<T>> $$1, bef<T> $$2) {
        Optional<jh.c<T>> $$3;
        if ($$0 != null && ($$3 = $$0.e($$1).a($$2)).isPresent()) {
            return $$3.get();
        }
        return jh.a(new jd[0]);
    }

    public Set<jd<dso>> a() {
        return Collections.unmodifiableSet(this.e.keySet());
    }

    public Set<Object2IntMap.Entry<jd<dso>>> b() {
        return Collections.unmodifiableSet(this.e.object2IntEntrySet());
    }

    public int c() {
        return this.e.size();
    }

    public boolean d() {
        return this.e.isEmpty();
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof dsu) {
            dsu $$1 = (dsu)$$0;
            return this.e.equals($$1.e);
        }
        return false;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return "ItemEnchantments{enchantments=" + String.valueOf(this.e) + "}";
    }

    public static class a {
        private final Object2IntOpenHashMap<jd<dso>> a = new Object2IntOpenHashMap();

        public a(dsu $$0) {
            this.a.putAll($$0.e);
        }

        public void a(jd<dso> $$0, int $$1) {
            if ($$1 <= 0) {
                this.a.removeInt($$0);
            } else {
                this.a.put($$0, Math.min($$1, 255));
            }
        }

        public void b(jd<dso> $$0, int $$1) {
            if ($$1 > 0) {
                this.a.merge($$0, Math.min($$1, 255), Integer::max);
            }
        }

        public void a(Predicate<jd<dso>> $$0) {
            this.a.keySet().removeIf($$0);
        }

        public int a(jd<dso> $$0) {
            return this.a.getOrDefault($$0, 0);
        }

        public Set<jd<dso>> a() {
            return this.a.keySet();
        }

        public dsu b() {
            return new dsu(this.a);
        }
    }
}
