/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import org.jspecify.annotations.Nullable;

public class bfa<K>
implements ji<K> {
    private static final int b = -1;
    private static final Object c = null;
    private static final float d = 0.8f;
    private @Nullable K[] e;
    private int[] f;
    private @Nullable K[] g;
    private int h;
    private int i;

    private bfa(int $$0) {
        this.e = new Object[$$0];
        this.f = new int[$$0];
        this.g = new Object[$$0];
    }

    private bfa(K[] $$0, int[] $$1, K[] $$2, int $$3, int $$4) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
    }

    public static <A> bfa<A> c(int $$0) {
        return new bfa((int)((float)$$0 / 0.8f));
    }

    @Override
    public int a(@Nullable K $$0) {
        return this.e(this.b($$0, this.e($$0)));
    }

    @Override
    public @Nullable K a(int $$0) {
        if ($$0 < 0 || $$0 >= this.g.length) {
            return null;
        }
        return this.g[$$0];
    }

    private int e(int $$0) {
        if ($$0 == -1) {
            return -1;
        }
        return this.f[$$0];
    }

    public boolean b(K $$0) {
        return this.a($$0) != -1;
    }

    public boolean d(int $$0) {
        return this.a($$0) != null;
    }

    public int d(K $$0) {
        int $$1 = this.c();
        this.a($$0, $$1);
        return $$1;
    }

    private int c() {
        while (this.h < this.g.length && this.g[this.h] != null) {
            ++this.h;
        }
        return this.h;
    }

    private void f(int $$0) {
        K[] $$1 = this.e;
        int[] $$2 = this.f;
        bfa<K> $$3 = new bfa<K>($$0);
        for (int $$4 = 0; $$4 < $$1.length; ++$$4) {
            if ($$1[$$4] == null) continue;
            $$3.a($$1[$$4], $$2[$$4]);
        }
        this.e = $$3.e;
        this.f = $$3.f;
        this.g = $$3.g;
        this.h = $$3.h;
        this.i = $$3.i;
    }

    public void a(K $$0, int $$1) {
        int $$2 = Math.max($$1, this.i + 1);
        if ((float)$$2 >= (float)this.e.length * 0.8f) {
            int $$3;
            for ($$3 = this.e.length << 1; $$3 < $$1; $$3 <<= 1) {
            }
            this.f($$3);
        }
        int $$4 = this.g(this.e($$0));
        this.e[$$4] = $$0;
        this.f[$$4] = $$1;
        this.g[$$1] = $$0;
        ++this.i;
        if ($$1 == this.h) {
            ++this.h;
        }
    }

    private int e(@Nullable K $$0) {
        return (bgj.h(System.identityHashCode($$0)) & Integer.MAX_VALUE) % this.e.length;
    }

    private int b(@Nullable K $$0, int $$1) {
        for (int $$2 = $$1; $$2 < this.e.length; ++$$2) {
            if (this.e[$$2] == $$0) {
                return $$2;
            }
            if (this.e[$$2] != c) continue;
            return -1;
        }
        for (int $$3 = 0; $$3 < $$1; ++$$3) {
            if (this.e[$$3] == $$0) {
                return $$3;
            }
            if (this.e[$$3] != c) continue;
            return -1;
        }
        return -1;
    }

    private int g(int $$0) {
        for (int $$1 = $$0; $$1 < this.e.length; ++$$1) {
            if (this.e[$$1] != c) continue;
            return $$1;
        }
        for (int $$2 = 0; $$2 < $$0; ++$$2) {
            if (this.e[$$2] != c) continue;
            return $$2;
        }
        throw new RuntimeException("Overflowed :(");
    }

    @Override
    public Iterator<K> iterator() {
        return Iterators.filter((Iterator)Iterators.forArray((Object[])this.g), (Predicate)Predicates.notNull());
    }

    public void a() {
        Arrays.fill(this.e, null);
        Arrays.fill(this.g, null);
        this.h = 0;
        this.i = 0;
    }

    @Override
    public int d() {
        return this.i;
    }

    public bfa<K> b() {
        return new bfa<Object>((Object[])this.e.clone(), (int[])this.f.clone(), (Object[])this.g.clone(), this.h, this.i);
    }
}

