/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cqs {
    public static final Codec<cqs> a = cqs$b.a.listOf().xmap(cqs::new, $$0 -> $$0.e().toList());
    public static final int b = 2;
    private final Map<UUID, a> c = new HashMap<UUID, a>();

    public cqs() {
    }

    private cqs(List<b> $$02) {
        $$02.forEach($$0 -> this.a((UUID)$$0.b).a.put((Object)$$0.c, $$0.d));
    }

    @bht
    public Map<UUID, Object2IntMap<cqt>> a() {
        HashMap $$0 = Maps.newHashMap();
        this.c.keySet().forEach($$1 -> {
            a $$2 = this.c.get($$1);
            $$0.put($$1, $$2.a);
        });
        return $$0;
    }

    public void b() {
        Iterator<a> $$0 = this.c.values().iterator();
        while ($$0.hasNext()) {
            a $$1 = $$0.next();
            $$1.a();
            if (!$$1.b()) continue;
            $$0.remove();
        }
    }

    private Stream<b> e() {
        return this.c.entrySet().stream().flatMap($$0 -> ((a)$$0.getValue()).a((UUID)$$0.getKey()));
    }

    private Collection<b> a(bgr $$0, int $$1) {
        List<b> $$2 = this.e().toList();
        if ($$2.isEmpty()) {
            return Collections.emptyList();
        }
        int[] $$3 = new int[$$2.size()];
        int $$4 = 0;
        for (int $$5 = 0; $$5 < $$2.size(); ++$$5) {
            b $$6 = $$2.get($$5);
            $$3[$$5] = ($$4 += Math.abs($$6.a())) - 1;
        }
        Set $$7 = Sets.newIdentityHashSet();
        for (int $$8 = 0; $$8 < $$1; ++$$8) {
            int $$9 = $$0.a($$4);
            int $$10 = Arrays.binarySearch($$3, $$9);
            $$7.add($$2.get($$10 < 0 ? -$$10 - 1 : $$10));
        }
        return $$7;
    }

    private a a(UUID $$02) {
        return this.c.computeIfAbsent($$02, $$0 -> new a());
    }

    public void a(cqs $$02, bgr $$1, int $$2) {
        Collection<b> $$3 = $$02.a($$1, $$2);
        $$3.forEach($$0 -> {
            int $$1 = $$0.d - $$0.c.m;
            if ($$1 >= 2) {
                this.a((UUID)$$0.b).a.mergeInt((Object)$$0.c, $$1, cqs::a);
            }
        });
    }

    public int a(UUID $$0, Predicate<cqt> $$1) {
        a $$2 = this.c.get($$0);
        return $$2 != null ? $$2.a($$1) : 0;
    }

    public long a(cqt $$0, DoublePredicate $$1) {
        return this.c.values().stream().filter($$2 -> $$1.test($$2.a.getOrDefault((Object)$$0, 0) * $$1.j)).count();
    }

    public void a(UUID $$0, cqt $$12, int $$22) {
        a $$3 = this.a($$0);
        $$3.a.mergeInt((Object)$$12, $$22, ($$1, $$2) -> this.a($$12, $$1, $$2));
        $$3.a($$12);
        if ($$3.b()) {
            this.c.remove($$0);
        }
    }

    public void b(UUID $$0, cqt $$1, int $$2) {
        this.a($$0, $$1, -$$2);
    }

    public void a(UUID $$0, cqt $$1) {
        a $$2 = this.c.get($$0);
        if ($$2 != null) {
            $$2.b($$1);
            if ($$2.b()) {
                this.c.remove($$0);
            }
        }
    }

    public void a(cqt $$0) {
        Iterator<a> $$1 = this.c.values().iterator();
        while ($$1.hasNext()) {
            a $$2 = $$1.next();
            $$2.b($$0);
            if (!$$2.b()) continue;
            $$1.remove();
        }
    }

    public void c() {
        this.c.clear();
    }

    public void a(cqs $$02) {
        $$02.c.forEach(($$0, $$1) -> this.a((UUID)$$0).a.putAll($$1.a));
    }

    private static int a(int $$0, int $$1) {
        return Math.max($$0, $$1);
    }

    private int a(cqt $$0, int $$1, int $$2) {
        int $$3 = $$1 + $$2;
        return $$3 > $$0.k ? Math.max($$0.k, $$1) : $$3;
    }

    public cqs d() {
        cqs $$0 = new cqs();
        $$0.a(this);
        return $$0;
    }

    static class a {
        final Object2IntMap<cqt> a = new Object2IntOpenHashMap();

        a() {
        }

        public int a(Predicate<cqt> $$02) {
            return this.a.object2IntEntrySet().stream().filter($$1 -> $$02.test((cqt)$$1.getKey())).mapToInt($$0 -> $$0.getIntValue() * ((cqt)$$0.getKey()).j).sum();
        }

        public Stream<b> a(UUID $$0) {
            return this.a.object2IntEntrySet().stream().map($$1 -> new b($$0, (cqt)$$1.getKey(), $$1.getIntValue()));
        }

        public void a() {
            ObjectIterator $$0 = this.a.object2IntEntrySet().iterator();
            while ($$0.hasNext()) {
                Object2IntMap.Entry $$1 = (Object2IntMap.Entry)$$0.next();
                int $$2 = $$1.getIntValue() - ((cqt)$$1.getKey()).l;
                if ($$2 < 2) {
                    $$0.remove();
                    continue;
                }
                $$1.setValue($$2);
            }
        }

        public boolean b() {
            return this.a.isEmpty();
        }

        public void a(cqt $$0) {
            int $$1 = this.a.getInt((Object)$$0);
            if ($$1 > $$0.k) {
                this.a.put((Object)$$0, $$0.k);
            }
            if ($$1 < 2) {
                this.b($$0);
            }
        }

        public void b(cqt $$0) {
            this.a.removeInt((Object)$$0);
        }
    }

    static final class b
    extends Record {
        final UUID b;
        final cqt c;
        final int d;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)jx.a.fieldOf("Target").forGetter(b::b), (App)cqt.n.fieldOf("Type").forGetter(b::c), (App)bfm.r.fieldOf("Value").forGetter(b::d)).apply((Applicative)$$0, b::new));

        b(UUID $$0, cqt $$1, int $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public int a() {
            return this.d * this.c.j;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "target;type;value", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "target;type;value", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "target;type;value", "b", "c", "d"}, this, $$0);
        }

        public UUID b() {
            return this.b;
        }

        public cqt c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }
    }
}

