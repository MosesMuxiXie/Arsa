/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class bev<T>
extends AbstractCollection<T> {
    private final Map<Class<?>, List<T>> a = Maps.newHashMap();
    private final Class<T> b;
    private final List<T> c = Lists.newArrayList();

    public bev(Class<T> $$0) {
        this.b = $$0;
        this.a.put($$0, this.c);
    }

    @Override
    public boolean add(T $$0) {
        boolean $$1 = false;
        for (Map.Entry<Class<?>, List<T>> $$2 : this.a.entrySet()) {
            if (!$$2.getKey().isInstance($$0)) continue;
            $$1 |= $$2.getValue().add($$0);
        }
        return $$1;
    }

    @Override
    public boolean remove(Object $$0) {
        boolean $$1 = false;
        for (Map.Entry<Class<?>, List<T>> $$2 : this.a.entrySet()) {
            if (!$$2.getKey().isInstance($$0)) continue;
            List<T> $$3 = $$2.getValue();
            $$1 |= $$3.remove($$0);
        }
        return $$1;
    }

    @Override
    public boolean contains(Object $$0) {
        return this.a($$0.getClass()).contains($$0);
    }

    public <S> Collection<S> a(Class<S> $$02) {
        if (!this.b.isAssignableFrom($$02)) {
            throw new IllegalArgumentException("Don't know how to search for " + String.valueOf($$02));
        }
        List $$1 = this.a.computeIfAbsent($$02, $$0 -> this.c.stream().filter($$0::isInstance).collect(bhs.b()));
        return Collections.unmodifiableCollection($$1);
    }

    @Override
    public Iterator<T> iterator() {
        if (this.c.isEmpty()) {
            return Collections.emptyIterator();
        }
        return Iterators.unmodifiableIterator(this.c.iterator());
    }

    public List<T> a() {
        return ImmutableList.copyOf(this.c);
    }

    @Override
    public int size() {
        return this.c.size();
    }
}

