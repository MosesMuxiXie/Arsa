/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class bak {
    private final Set<bam> a;
    private Map<String, bah> b = ImmutableMap.of();
    private List<bah> c = ImmutableList.of();

    public bak(bam ... $$0) {
        this.a = ImmutableSet.copyOf((Object[])$$0);
    }

    public static String a(Collection<bah> $$02) {
        return $$02.stream().map($$0 -> $$0.g() + ($$0.d().a() ? "" : " (incompatible)")).collect(Collectors.joining(", "));
    }

    public void a() {
        List $$0 = (List)this.c.stream().map(bah::g).collect(ImmutableList.toImmutableList());
        this.b = this.i();
        this.c = this.c($$0);
    }

    private Map<String, bah> i() {
        TreeMap $$0 = Maps.newTreeMap();
        for (bam $$12 : this.a) {
            $$12.loadPacks($$1 -> $$0.put($$1.g(), $$1));
        }
        return ImmutableMap.copyOf((Map)$$0);
    }

    public boolean b() {
        List<bah> $$0 = this.c(List.of());
        return !this.c.equals($$0);
    }

    public void b(Collection<String> $$0) {
        this.c = this.c($$0);
    }

    public boolean a(String $$0) {
        bah $$1 = this.b.get($$0);
        if ($$1 != null && !this.c.contains($$1)) {
            ArrayList $$2 = Lists.newArrayList(this.c);
            $$2.add($$1);
            this.c = $$2;
            return true;
        }
        return false;
    }

    public boolean b(String $$0) {
        bah $$1 = this.b.get($$0);
        if ($$1 != null && this.c.contains($$1)) {
            ArrayList $$2 = Lists.newArrayList(this.c);
            $$2.remove($$1);
            this.c = $$2;
            return true;
        }
        return false;
    }

    private List<bah> c(Collection<String> $$0) {
        List $$1 = this.d($$0).collect(bhs.b());
        for (bah $$2 : this.b.values()) {
            if (!$$2.i() || $$1.contains($$2)) continue;
            $$2.k().a($$1, $$2, bah::h, false);
        }
        return ImmutableList.copyOf($$1);
    }

    private Stream<bah> d(Collection<String> $$0) {
        return $$0.stream().map(this.b::get).filter(Objects::nonNull);
    }

    public Collection<String> c() {
        return this.b.keySet();
    }

    public Collection<bah> d() {
        return this.b.values();
    }

    public Collection<String> e() {
        return (Collection)this.c.stream().map(bah::g).collect(ImmutableSet.toImmutableSet());
    }

    public dgz f() {
        return this.g().stream().map(bah::e).reduce(dgz::c).orElse(dgz.a());
    }

    public Collection<bah> g() {
        return this.c;
    }

    public @Nullable bah c(String $$0) {
        return this.b.get($$0);
    }

    public boolean d(String $$0) {
        return this.b.containsKey($$0);
    }

    public List<azl> h() {
        return (List)this.c.stream().map(bah::f).collect(ImmutableList.toImmutableList());
    }
}

