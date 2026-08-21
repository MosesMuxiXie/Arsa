/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class jm<E>
extends AbstractList<E> {
    private final List<E> a;
    private final @Nullable E b;

    public static <E> jm<E> a() {
        return new jm<Object>(Lists.newArrayList(), null);
    }

    public static <E> jm<E> a(int $$0) {
        return new jm<Object>(Lists.newArrayListWithCapacity((int)$$0), null);
    }

    public static <E> jm<E> a(int $$0, E $$1) {
        Objects.requireNonNull($$1);
        Object[] $$2 = new Object[$$0];
        Arrays.fill($$2, $$1);
        return new jm<Object>(Arrays.asList($$2), $$1);
    }

    @SafeVarargs
    public static <E> jm<E> a(E $$0, E ... $$1) {
        return new jm<E>(Arrays.asList($$1), $$0);
    }

    protected jm(List<E> $$0, @Nullable E $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public E get(int $$0) {
        return this.a.get($$0);
    }

    @Override
    public E set(int $$0, E $$1) {
        Objects.requireNonNull($$1);
        return this.a.set($$0, $$1);
    }

    @Override
    public void add(int $$0, E $$1) {
        Objects.requireNonNull($$1);
        this.a.add($$0, $$1);
    }

    @Override
    public E remove(int $$0) {
        return this.a.remove($$0);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public void clear() {
        if (this.b == null) {
            super.clear();
        } else {
            for (int $$0 = 0; $$0 < this.size(); ++$$0) {
                this.set($$0, this.b);
            }
        }
    }
}

