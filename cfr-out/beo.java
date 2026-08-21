/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import java.util.AbstractList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SequencedCollection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public class beo<T>
extends AbstractList<T>
implements bgg<T> {
    private static final int a = 1;
    private @Nullable Object[] b;
    private int c;
    private int d;

    public beo() {
        this(1);
    }

    public beo(int $$0) {
        this.b = new Object[$$0];
        this.c = 0;
        this.d = 0;
    }

    @Override
    public int size() {
        return this.d;
    }

    @VisibleForTesting
    public int a() {
        return this.b.length;
    }

    private int a(int $$0) {
        return ($$0 + this.c) % this.b.length;
    }

    @Override
    public T get(int $$0) {
        this.b($$0);
        return this.c(this.a($$0));
    }

    private static void a(int $$0, int $$1) {
        if ($$0 < 0 || $$0 >= $$1) {
            throw new IndexOutOfBoundsException($$0);
        }
    }

    private void b(int $$0) {
        beo.a($$0, this.d);
    }

    private T c(int $$0) {
        return (T)this.b[$$0];
    }

    @Override
    public T set(int $$0, T $$1) {
        this.b($$0);
        Objects.requireNonNull($$1);
        int $$2 = this.a($$0);
        T $$3 = this.c($$2);
        this.b[$$2] = $$1;
        return $$3;
    }

    @Override
    public void add(int $$0, T $$1) {
        beo.a($$0, this.d + 1);
        Objects.requireNonNull($$1);
        if (this.d == this.b.length) {
            this.c();
        }
        int $$2 = this.a($$0);
        if ($$0 == this.d) {
            this.b[$$2] = $$1;
        } else if ($$0 == 0) {
            --this.c;
            if (this.c < 0) {
                this.c += this.b.length;
            }
            this.b[this.a((int)0)] = $$1;
        } else {
            for (int $$3 = this.d - 1; $$3 >= $$0; --$$3) {
                this.b[this.a((int)($$3 + 1))] = this.b[this.a($$3)];
            }
            this.b[$$2] = $$1;
        }
        ++this.modCount;
        ++this.d;
    }

    private void c() {
        int $$0 = this.b.length + Math.max(this.b.length >> 1, 1);
        Object[] $$1 = new Object[$$0];
        this.a($$1, this.d);
        this.c = 0;
        this.b = $$1;
    }

    @Override
    public T remove(int $$0) {
        this.b($$0);
        int $$1 = this.a($$0);
        T $$2 = this.c($$1);
        if ($$0 == 0) {
            this.b[$$1] = null;
            ++this.c;
        } else if ($$0 == this.d - 1) {
            this.b[$$1] = null;
        } else {
            for (int $$3 = $$0 + 1; $$3 < this.d; ++$$3) {
                this.b[this.a((int)($$3 - 1))] = this.get($$3);
            }
            this.b[this.a((int)(this.d - 1))] = null;
        }
        ++this.modCount;
        --this.d;
        return $$2;
    }

    @Override
    public boolean removeIf(Predicate<? super T> $$0) {
        int $$1 = 0;
        for (int $$2 = 0; $$2 < this.d; ++$$2) {
            T $$3 = this.get($$2);
            if ($$0.test($$3)) {
                ++$$1;
                continue;
            }
            if ($$1 == 0) continue;
            this.b[this.a((int)($$2 - $$1))] = $$3;
            this.b[this.a((int)$$2)] = null;
        }
        this.modCount += $$1;
        this.d -= $$1;
        return $$1 != 0;
    }

    private void a(Object[] $$0, int $$1) {
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            $$0[$$2] = this.get($$2);
        }
    }

    @Override
    public void replaceAll(UnaryOperator<T> $$0) {
        for (int $$1 = 0; $$1 < this.d; ++$$1) {
            int $$2 = this.a($$1);
            this.b[$$2] = Objects.requireNonNull($$0.apply(this.c($$1)));
        }
    }

    @Override
    public void forEach(Consumer<? super T> $$0) {
        for (int $$1 = 0; $$1 < this.d; ++$$1) {
            $$0.accept(this.get($$1));
        }
    }

    @Override
    public void addFirst(T $$0) {
        this.add(0, $$0);
    }

    @Override
    public void addLast(T $$0) {
        this.add(this.d, $$0);
    }

    @Override
    public boolean offerFirst(T $$0) {
        this.addFirst($$0);
        return true;
    }

    @Override
    public boolean offerLast(T $$0) {
        this.addLast($$0);
        return true;
    }

    @Override
    public T removeFirst() {
        if (this.d == 0) {
            throw new NoSuchElementException();
        }
        return this.remove(0);
    }

    @Override
    public T removeLast() {
        if (this.d == 0) {
            throw new NoSuchElementException();
        }
        return this.remove(this.d - 1);
    }

    @Override
    public bgg<T> b() {
        return new b(this);
    }

    @Override
    public @Nullable T pollFirst() {
        if (this.d == 0) {
            return null;
        }
        return this.removeFirst();
    }

    @Override
    public @Nullable T pollLast() {
        if (this.d == 0) {
            return null;
        }
        return this.removeLast();
    }

    @Override
    public T getFirst() {
        if (this.d == 0) {
            throw new NoSuchElementException();
        }
        return this.get(0);
    }

    @Override
    public T getLast() {
        if (this.d == 0) {
            throw new NoSuchElementException();
        }
        return this.get(this.d - 1);
    }

    @Override
    public @Nullable T peekFirst() {
        if (this.d == 0) {
            return null;
        }
        return this.getFirst();
    }

    @Override
    public @Nullable T peekLast() {
        if (this.d == 0) {
            return null;
        }
        return this.getLast();
    }

    @Override
    public boolean removeFirstOccurrence(Object $$0) {
        for (int $$1 = 0; $$1 < this.d; ++$$1) {
            T $$2 = this.get($$1);
            if (!Objects.equals($$0, $$2)) continue;
            this.remove($$1);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object $$0) {
        for (int $$1 = this.d - 1; $$1 >= 0; --$$1) {
            T $$2 = this.get($$1);
            if (!Objects.equals($$0, $$2)) continue;
            this.remove($$1);
            return true;
        }
        return false;
    }

    @Override
    public Iterator<T> descendingIterator() {
        return new a();
    }

    @Override
    public /* synthetic */ List reversed() {
        return this.b();
    }

    @Override
    public /* synthetic */ SequencedCollection reversed() {
        return this.b();
    }

    @Override
    public /* synthetic */ Deque reversed() {
        return this.b();
    }

    class b
    extends AbstractList<T>
    implements bgg<T> {
        private final beo<T> b;

        public b(beo<T> $$0) {
            this.b = $$0;
        }

        @Override
        public bgg<T> b() {
            return this.b;
        }

        @Override
        public T getFirst() {
            return this.b.getLast();
        }

        @Override
        public T getLast() {
            return this.b.getFirst();
        }

        @Override
        public void addFirst(T $$0) {
            this.b.addLast($$0);
        }

        @Override
        public void addLast(T $$0) {
            this.b.addFirst($$0);
        }

        @Override
        public boolean offerFirst(T $$0) {
            return this.b.offerLast($$0);
        }

        @Override
        public boolean offerLast(T $$0) {
            return this.b.offerFirst($$0);
        }

        @Override
        public @Nullable T pollFirst() {
            return this.b.pollLast();
        }

        @Override
        public @Nullable T pollLast() {
            return this.b.pollFirst();
        }

        @Override
        public @Nullable T peekFirst() {
            return this.b.peekLast();
        }

        @Override
        public @Nullable T peekLast() {
            return this.b.peekFirst();
        }

        @Override
        public T removeFirst() {
            return this.b.removeLast();
        }

        @Override
        public T removeLast() {
            return this.b.removeFirst();
        }

        @Override
        public boolean removeFirstOccurrence(Object $$0) {
            return this.b.removeLastOccurrence($$0);
        }

        @Override
        public boolean removeLastOccurrence(Object $$0) {
            return this.b.removeFirstOccurrence($$0);
        }

        @Override
        public Iterator<T> descendingIterator() {
            return this.b.iterator();
        }

        @Override
        public int size() {
            return this.b.size();
        }

        @Override
        public boolean isEmpty() {
            return this.b.isEmpty();
        }

        @Override
        public boolean contains(Object $$0) {
            return this.b.contains($$0);
        }

        @Override
        public T get(int $$0) {
            return this.b.get(this.a($$0));
        }

        @Override
        public T set(int $$0, T $$1) {
            return this.b.set(this.a($$0), $$1);
        }

        @Override
        public void add(int $$0, T $$1) {
            this.b.add(this.a($$0) + 1, $$1);
        }

        @Override
        public T remove(int $$0) {
            return this.b.remove(this.a($$0));
        }

        @Override
        public int indexOf(Object $$0) {
            return this.a(this.b.lastIndexOf($$0));
        }

        @Override
        public int lastIndexOf(Object $$0) {
            return this.a(this.b.indexOf($$0));
        }

        @Override
        public List<T> subList(int $$0, int $$1) {
            return this.b.subList(this.a($$1) + 1, this.a($$0) + 1).reversed();
        }

        @Override
        public Iterator<T> iterator() {
            return this.b.descendingIterator();
        }

        @Override
        public void clear() {
            this.b.clear();
        }

        private int a(int $$0) {
            return $$0 == -1 ? -1 : this.b.size() - 1 - $$0;
        }

        @Override
        public /* synthetic */ List reversed() {
            return this.b();
        }

        @Override
        public /* synthetic */ SequencedCollection reversed() {
            return this.b();
        }

        @Override
        public /* synthetic */ Deque reversed() {
            return this.b();
        }
    }

    class a
    implements Iterator<T> {
        private int b;

        public a() {
            this.b = beo.this.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return this.b >= 0;
        }

        @Override
        public T next() {
            return beo.this.get(this.b--);
        }

        @Override
        public void remove() {
            beo.this.remove(this.b + 1);
        }
    }
}

