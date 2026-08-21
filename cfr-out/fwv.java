/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class fwv {
    private final List<d<?>> a = new ArrayList();
    private final List<a<?>> b = new ArrayList();
    private final List<e> c = new ArrayList<e>();

    public fww a(String $$0) {
        e $$1 = new e(this.c.size(), $$0);
        this.c.add($$1);
        return $$1;
    }

    public <T> fyw<T> a(String $$0, T $$1) {
        a<T> $$2 = new a<T>($$0, null, $$1);
        this.b.add($$2);
        return $$2.b;
    }

    public <T> fyw<T> a(String $$0, fyv<T> $$1) {
        return this.a((String)$$0, $$1, null).b;
    }

    <T> d<T> a(String $$0, fyv<T> $$1, @Nullable e $$2) {
        int $$3 = this.a.size();
        d<T> $$4 = new d<T>($$3, $$0, $$2, $$1);
        this.a.add($$4);
        return $$4;
    }

    public void a(fyt $$0) {
        this.a($$0, fwv$c.a);
    }

    public void a(fyt $$0, c $$1) {
        BitSet $$2 = this.a();
        ArrayList<e> $$3 = new ArrayList<e>($$2.cardinality());
        BitSet $$4 = new BitSet(this.c.size());
        for (e $$5 : this.c) {
            this.a($$5, $$2, $$4, $$3);
        }
        this.a($$3);
        for (e $$6 : $$3) {
            for (d<?> $$7 : $$6.h) {
                $$1.a($$7.a);
                $$7.a($$0);
            }
            $$1.c($$6.c);
            $$6.g.run();
            $$1.d($$6.c);
            int $$8 = $$6.i.nextSetBit(0);
            while ($$8 >= 0) {
                d<?> $$9 = this.a.get($$8);
                $$1.b($$9.a);
                $$9.b($$0);
                $$8 = $$6.i.nextSetBit($$8 + 1);
            }
        }
    }

    private BitSet a() {
        ArrayDeque<e> $$0 = new ArrayDeque<e>(this.c.size());
        BitSet $$1 = new BitSet(this.c.size());
        for (f f2 : this.b) {
            e $$3 = f2.b.d;
            if ($$3 == null) continue;
            this.a($$3, $$1, $$0);
        }
        for (e e2 : this.c) {
            if (!e2.j) continue;
            this.a(e2, $$1, $$0);
        }
        return $$1;
    }

    private void a(e $$0, BitSet $$1, Deque<e> $$2) {
        $$2.add($$0);
        while (!$$2.isEmpty()) {
            e $$3 = $$2.poll();
            if ($$1.get($$3.b)) continue;
            $$1.set($$3.b);
            int $$4 = $$3.f.nextSetBit(0);
            while ($$4 >= 0) {
                $$2.add(this.c.get($$4));
                $$4 = $$3.f.nextSetBit($$4 + 1);
            }
        }
    }

    private void a(e $$02, BitSet $$1, BitSet $$2, List<e> $$3) {
        if ($$2.get($$02.b)) {
            String $$4 = $$2.stream().mapToObj($$0 -> this.c.get((int)$$0).c).collect(Collectors.joining(", "));
            throw new IllegalStateException("Frame graph cycle detected between " + $$4);
        }
        if (!$$1.get($$02.b)) {
            return;
        }
        $$2.set($$02.b);
        $$1.clear($$02.b);
        int $$5 = $$02.f.nextSetBit(0);
        while ($$5 >= 0) {
            this.a(this.c.get($$5), $$1, $$2, $$3);
            $$5 = $$02.f.nextSetBit($$5 + 1);
        }
        for (b<?> $$6 : $$02.d) {
            int $$7 = $$6.e.nextSetBit(0);
            while ($$7 >= 0) {
                if ($$7 != $$02.b) {
                    this.a(this.c.get($$7), $$1, $$2, $$3);
                }
                $$7 = $$6.e.nextSetBit($$7 + 1);
            }
        }
        $$3.add($$02);
        $$2.clear($$02.b);
    }

    private void a(Collection<e> $$0) {
        @Nullable e[] $$1 = new e[this.a.size()];
        for (e $$2 : $$0) {
            int $$3 = $$2.e.nextSetBit(0);
            while ($$3 >= 0) {
                d<?> $$4 = this.a.get($$3);
                e $$5 = $$1[$$3];
                $$1[$$3] = $$2;
                if ($$5 == null) {
                    $$2.h.add($$4);
                } else {
                    $$5.i.clear($$3);
                }
                $$2.i.set($$3);
                $$3 = $$2.e.nextSetBit($$3 + 1);
            }
        }
    }

    class e
    implements fww {
        final int b;
        final String c;
        final List<b<?>> d = new ArrayList();
        final BitSet e = new BitSet();
        final BitSet f = new BitSet();
        Runnable g = () -> {};
        final List<d<?>> h = new ArrayList();
        final BitSet i = new BitSet();
        boolean j;

        public e(int $$0, String $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        private <T> void a(b<T> $$0) {
            f f2 = $$0.b;
            if (f2 instanceof d) {
                d $$1 = (d)f2;
                this.e.set($$1.c);
            }
        }

        private void a(e $$0) {
            this.f.set($$0.b);
        }

        @Override
        public <T> fyw<T> a(String $$0, fyv<T> $$1) {
            d<T> $$2 = fwv.this.a($$0, $$1, this);
            this.e.set($$2.c);
            return $$2.b;
        }

        @Override
        public <T> void a(fyw<T> $$0) {
            this.b((b)$$0);
        }

        private <T> void b(b<T> $$0) {
            this.a($$0);
            if ($$0.d != null) {
                this.a($$0.d);
            }
            $$0.e.set(this.b);
        }

        @Override
        public <T> fyw<T> b(fyw<T> $$0) {
            return this.c((b)$$0);
        }

        @Override
        public void a(fww $$0) {
            this.f.set(((e)$$0).b);
        }

        @Override
        public void a() {
            this.j = true;
        }

        private <T> b<T> c(b<T> $$0) {
            this.d.add($$0);
            this.b($$0);
            return $$0.a(this);
        }

        @Override
        public void a(Runnable $$0) {
            this.g = $$0;
        }

        public String toString() {
            return this.c;
        }
    }

    static class a<T>
    extends f<T> {
        private final T c;

        public a(String $$0, @Nullable e $$1, T $$2) {
            super($$0, $$1);
            this.c = $$2;
        }

        @Override
        public T a() {
            return this.c;
        }
    }

    static class b<T>
    implements fyw<T> {
        final f<T> b;
        private final int c;
        final @Nullable e d;
        final BitSet e = new BitSet();
        private @Nullable b<T> f;

        b(f<T> $$0, int $$1, @Nullable e $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public T get() {
            return this.b.a();
        }

        b<T> a(e $$0) {
            if (this.b.b != this) {
                throw new IllegalStateException("Handle " + String.valueOf(this) + " is no longer valid, as its contents were moved into " + String.valueOf(this.f));
            }
            b<T> $$1 = new b<T>(this.b, this.c + 1, $$0);
            this.b.b = $$1;
            this.f = $$1;
            return $$1;
        }

        public String toString() {
            if (this.d != null) {
                return String.valueOf(this.b) + "#" + this.c + " (from " + String.valueOf(this.d) + ")";
            }
            return String.valueOf(this.b) + "#" + this.c;
        }
    }

    static class d<T>
    extends f<T> {
        final int c;
        private final fyv<T> d;
        private @Nullable T e;

        public d(int $$0, String $$1, @Nullable e $$2, fyv<T> $$3) {
            super($$1, $$2);
            this.c = $$0;
            this.d = $$3;
        }

        @Override
        public T a() {
            return Objects.requireNonNull(this.e, "Resource is not currently available");
        }

        public void a(fyt $$0) {
            if (this.e != null) {
                throw new IllegalStateException("Tried to acquire physical resource, but it was already assigned");
            }
            this.e = $$0.a(this.d);
        }

        public void b(fyt $$0) {
            if (this.e == null) {
                throw new IllegalStateException("Tried to release physical resource that was not allocated");
            }
            $$0.a(this.d, this.e);
            this.e = null;
        }
    }

    public static interface c {
        public static final c a = new c(){};

        default public void a(String $$0) {
        }

        default public void b(String $$0) {
        }

        default public void c(String $$0) {
        }

        default public void d(String $$0) {
        }
    }

    static abstract class f<T> {
        public final String a;
        public b<T> b;

        public f(String $$0, @Nullable e $$1) {
            this.a = $$0;
            this.b = new b(this, 0, $$1);
        }

        public abstract T a();

        public String toString() {
            return this.a;
        }
    }
}

