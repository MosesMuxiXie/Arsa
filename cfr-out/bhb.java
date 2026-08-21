/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrays
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.annotations.Nullable;

public class bhb<T>
extends AbstractSet<T> {
    private static final int a = 10;
    private final Comparator<T> b;
    T[] c;
    int d;

    private bhb(int $$0, Comparator<T> $$1) {
        this.b = $$1;
        if ($$0 < 0) {
            throw new IllegalArgumentException("Initial capacity (" + $$0 + ") is negative");
        }
        this.c = bhb.a(new Object[$$0]);
    }

    public static <T extends Comparable<T>> bhb<T> a() {
        return bhb.a(10);
    }

    public static <T extends Comparable<T>> bhb<T> a(int $$0) {
        return new bhb($$0, Comparator.naturalOrder());
    }

    public static <T> bhb<T> a(Comparator<T> $$0) {
        return bhb.a($$0, 10);
    }

    public static <T> bhb<T> a(Comparator<T> $$0, int $$1) {
        return new bhb<T>($$1, $$0);
    }

    private static <T> T[] a(Object[] $$0) {
        return $$0;
    }

    private int c(T $$0) {
        return Arrays.binarySearch(this.c, 0, this.d, $$0, this.b);
    }

    private static int b(int $$0) {
        return -$$0 - 1;
    }

    @Override
    public boolean add(T $$0) {
        int $$1 = this.c($$0);
        if ($$1 >= 0) {
            return false;
        }
        int $$2 = bhb.b($$1);
        this.a($$0, $$2);
        return true;
    }

    private void c(int $$0) {
        if ($$0 <= this.c.length) {
            return;
        }
        if (this.c != ObjectArrays.DEFAULT_EMPTY_ARRAY) {
            $$0 = bhs.a(this.c.length, $$0);
        } else if ($$0 < 10) {
            $$0 = 10;
        }
        Object[] $$1 = new Object[$$0];
        System.arraycopy(this.c, 0, $$1, 0, this.d);
        this.c = bhb.a($$1);
    }

    private void a(T $$0, int $$1) {
        this.c(this.d + 1);
        if ($$1 != this.d) {
            System.arraycopy(this.c, $$1, this.c, $$1 + 1, this.d - $$1);
        }
        this.c[$$1] = $$0;
        ++this.d;
    }

    void d(int $$0) {
        --this.d;
        if ($$0 != this.d) {
            System.arraycopy(this.c, $$0 + 1, this.c, $$0, this.d - $$0);
        }
        this.c[this.d] = null;
    }

    private T e(int $$0) {
        return this.c[$$0];
    }

    public T a(T $$0) {
        int $$1 = this.c($$0);
        if ($$1 >= 0) {
            return this.e($$1);
        }
        this.a($$0, bhb.b($$1));
        return $$0;
    }

    @Override
    public boolean remove(Object $$0) {
        int $$1 = this.c($$0);
        if ($$1 >= 0) {
            this.d($$1);
            return true;
        }
        return false;
    }

    public @Nullable T b(T $$0) {
        int $$1 = this.c($$0);
        if ($$1 >= 0) {
            return this.e($$1);
        }
        return null;
    }

    public T b() {
        return this.e(0);
    }

    public T c() {
        return this.e(this.d - 1);
    }

    @Override
    public boolean contains(Object $$0) {
        int $$1 = this.c($$0);
        return $$1 >= 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new a();
    }

    @Override
    public int size() {
        return this.d;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(this.c, this.d, Object[].class);
    }

    @Override
    public <U> U[] toArray(U[] $$0) {
        if ($$0.length < this.d) {
            return Arrays.copyOf(this.c, this.d, $$0.getClass());
        }
        System.arraycopy(this.c, 0, $$0, 0, this.d);
        if ($$0.length > this.d) {
            $$0[this.d] = null;
        }
        return $$0;
    }

    @Override
    public void clear() {
        Arrays.fill(this.c, 0, this.d, null);
        this.d = 0;
    }

    @Override
    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof bhb) {
            bhb $$1 = (bhb)$$0;
            if (this.b.equals($$1.b)) {
                return this.d == $$1.d && Arrays.equals(this.c, $$1.c);
            }
        }
        return super.equals($$0);
    }

    class a
    implements Iterator<T> {
        private int b;
        private int c = -1;

        a() {
        }

        @Override
        public boolean hasNext() {
            return this.b < bhb.this.d;
        }

        @Override
        public T next() {
            if (this.b >= bhb.this.d) {
                throw new NoSuchElementException();
            }
            this.c = this.b++;
            return bhb.this.c[this.c];
        }

        @Override
        public void remove() {
            if (this.c == -1) {
                throw new IllegalStateException();
            }
            bhb.this.d(this.c);
            --this.b;
            this.c = -1;
        }
    }
}

