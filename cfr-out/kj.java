/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMaps
 *  it.unimi.dsi.fastutil.objects.ReferenceArraySet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public final class kj
implements kf {
    private final kf c;
    private Reference2ObjectMap<kh<?>, Optional<?>> d;
    private boolean e;

    public kj(kf $$0) {
        this($$0, Reference2ObjectMaps.emptyMap(), true);
    }

    private kj(kf $$0, Reference2ObjectMap<kh<?>, Optional<?>> $$1, boolean $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public static kj a(kf $$0, kg $$1) {
        if (kj.a($$0, $$1.e)) {
            return new kj($$0, $$1.e, true);
        }
        kj $$2 = new kj($$0);
        $$2.a($$1);
        return $$2;
    }

    private static boolean a(kf $$0, Reference2ObjectMap<kh<?>, Optional<?>> $$1) {
        for (Map.Entry $$2 : Reference2ObjectMaps.fastIterable($$1)) {
            Object $$3 = $$0.a((kh)$$2.getKey());
            Optional $$4 = (Optional)$$2.getValue();
            if ($$4.isPresent() && $$4.get().equals($$3)) {
                return false;
            }
            if (!$$4.isEmpty() || $$3 != null) continue;
            return false;
        }
        return true;
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        Optional $$1 = (Optional)this.d.get($$0);
        if ($$1 != null) {
            return $$1.orElse(null);
        }
        return this.c.a($$0);
    }

    public boolean d(kh<?> $$0) {
        return this.d.containsKey($$0);
    }

    public <T> @Nullable T b(kh<T> $$0, @Nullable T $$1) {
        Optional $$4;
        this.j();
        T $$2 = this.c.a($$0);
        if (Objects.equals($$1, $$2)) {
            Optional $$3 = (Optional)this.d.remove($$0);
        } else {
            $$4 = (Optional)this.d.put($$0, Optional.ofNullable($$1));
        }
        if ($$4 != null) {
            return $$4.orElse($$2);
        }
        return $$2;
    }

    public <T> @Nullable T a(kk<T> $$0) {
        return this.b($$0.a(), $$0.b());
    }

    public <T> @Nullable T e(kh<? extends T> $$0) {
        Optional $$3;
        this.j();
        T $$1 = this.c.a($$0);
        if ($$1 != null) {
            Optional $$2 = (Optional)this.d.put($$0, Optional.empty());
        } else {
            $$3 = (Optional)this.d.remove($$0);
        }
        if ($$3 != null) {
            return $$3.orElse(null);
        }
        return $$1;
    }

    public void a(kg $$0) {
        this.j();
        for (Map.Entry $$1 : Reference2ObjectMaps.fastIterable($$0.e)) {
            this.a((kh)$$1.getKey(), (Optional)$$1.getValue());
        }
    }

    private void a(kh<?> $$0, Optional<?> $$1) {
        Object $$2 = this.c.a($$0);
        if ($$1.isPresent()) {
            if ($$1.get().equals($$2)) {
                this.d.remove($$0);
            } else {
                this.d.put($$0, $$1);
            }
        } else if ($$2 != null) {
            this.d.put($$0, Optional.empty());
        } else {
            this.d.remove($$0);
        }
    }

    public void b(kg $$0) {
        this.j();
        this.d.clear();
        this.d.putAll($$0.e);
    }

    public void f() {
        this.j();
        this.d.clear();
    }

    public void a(kf $$0) {
        for (kk<?> $$1 : $$0) {
            $$1.a(this);
        }
    }

    private void j() {
        if (this.e) {
            this.d = new Reference2ObjectArrayMap(this.d);
            this.e = false;
        }
    }

    @Override
    public Set<kh<?>> b() {
        if (this.d.isEmpty()) {
            return this.c.b();
        }
        ReferenceArraySet $$0 = new ReferenceArraySet(this.c.b());
        for (Reference2ObjectMap.Entry $$1 : Reference2ObjectMaps.fastIterable(this.d)) {
            Optional $$2 = (Optional)$$1.getValue();
            if ($$2.isPresent()) {
                $$0.add((kh)$$1.getKey());
                continue;
            }
            $$0.remove($$1.getKey());
        }
        return $$0;
    }

    @Override
    public Iterator<kk<?>> iterator() {
        if (this.d.isEmpty()) {
            return this.c.iterator();
        }
        ArrayList<kk> $$0 = new ArrayList<kk>(this.d.size() + this.c.d());
        for (Reference2ObjectMap.Entry $$1 : Reference2ObjectMaps.fastIterable(this.d)) {
            if (!((Optional)$$1.getValue()).isPresent()) continue;
            $$0.add(kk.a((kh)$$1.getKey(), ((Optional)$$1.getValue()).get()));
        }
        for (kk $$2 : this.c) {
            if (this.d.containsKey($$2.a())) continue;
            $$0.add($$2);
        }
        return $$0.iterator();
    }

    @Override
    public int d() {
        int $$0 = this.c.d();
        for (Reference2ObjectMap.Entry $$1 : Reference2ObjectMaps.fastIterable(this.d)) {
            boolean $$3;
            boolean $$2 = ((Optional)$$1.getValue()).isPresent();
            if ($$2 == ($$3 = this.c.c((kh)$$1.getKey()))) continue;
            $$0 += $$2 ? 1 : -1;
        }
        return $$0;
    }

    public kg g() {
        if (this.d.isEmpty()) {
            return kg.a;
        }
        this.e = true;
        return new kg(this.d);
    }

    public kj h() {
        this.e = true;
        return new kj(this.c, this.d, true);
    }

    public kf i() {
        if (this.d.isEmpty()) {
            return this.c;
        }
        return this.h();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if (!($$0 instanceof kj)) return false;
        kj $$1 = (kj)$$0;
        if (!this.c.equals($$1.c)) return false;
        if (!this.d.equals($$1.d)) return false;
        return true;
    }

    public int hashCode() {
        return this.c.hashCode() + this.d.hashCode() * 31;
    }

    public String toString() {
        return "{" + this.c().map(kk::toString).collect(Collectors.joining(", ")) + "}";
    }
}

