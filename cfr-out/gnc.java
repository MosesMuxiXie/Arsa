/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

public class gnc {
    private static final int a = 5;
    private static final int b = -1;
    final gfj c;
    private final List<a<?>> d = new ArrayList();
    private final BitSet e = new BitSet(5);
    private final Deque<gnb> f = Queues.newArrayDeque();
    private final Set<bcz> g = new HashSet<bcz>();
    private @Nullable a<gmy> h;

    public gnc(gfj $$0, gfo $$1) {
        this.c = $$0;
        this.b($$1.aO().b());
    }

    public void a() {
        MutableBoolean $$02 = new MutableBoolean(false);
        this.d.removeIf($$1 -> {
            gnb.a $$2 = $$1.i;
            $$1.d();
            if ($$1.i != $$2 && $$02.isFalse()) {
                $$02.setTrue();
                $$1.i.a(this.c.ap());
            }
            if ($$1.c()) {
                this.e.clear($$1.e, $$1.e + $$1.f);
                return true;
            }
            return false;
        });
        if (!this.f.isEmpty() && this.g() > 0) {
            this.f.removeIf($$0 -> {
                int $$1 = $$0.i();
                int $$2 = this.a($$1);
                if ($$2 == -1) {
                    return false;
                }
                this.d.add(new a(this, $$0, $$2, $$1));
                this.e.set($$2, $$2 + $$1);
                bcz $$3 = $$0.b();
                if ($$3 != null && this.g.add($$3)) {
                    this.c.ap().a(iph.a($$3, 1.0f, 1.0f));
                }
                return true;
            });
        }
        this.g.clear();
        if (this.h != null) {
            this.h.d();
        }
    }

    public void a(gir $$0) {
        if (this.c.k.au) {
            return;
        }
        int $$1 = $$0.a();
        if (!this.d.isEmpty()) {
            $$0.c();
        }
        for (a<?> $$2 : this.d) {
            $$2.a($$0, $$1);
        }
        if (this.c.k.aO().b().e() && this.h != null && (this.c.x == null || !(this.c.x instanceof grx))) {
            this.h.a($$0, $$1);
        }
    }

    private int a(int $$0) {
        if (this.g() >= $$0) {
            int $$1 = 0;
            for (int $$2 = 0; $$2 < 5; ++$$2) {
                if (this.e.get($$2)) {
                    $$1 = 0;
                    continue;
                }
                if (++$$1 != $$0) continue;
                return $$2 + 1 - $$1;
            }
        }
        return -1;
    }

    private int g() {
        return 5 - this.e.cardinality();
    }

    public <T extends gnb> @Nullable T a(Class<? extends T> $$0, Object $$1) {
        for (a<?> $$2 : this.d) {
            if (!$$0.isAssignableFrom($$2.a().getClass()) || !$$2.a().h().equals($$1)) continue;
            return (T)$$2.a();
        }
        for (gnb $$3 : this.f) {
            if (!$$0.isAssignableFrom($$3.getClass()) || !$$3.h().equals($$1)) continue;
            return (T)$$3;
        }
        return null;
    }

    public void b() {
        this.e.clear();
        this.d.clear();
        this.f.clear();
    }

    public void a(gnb $$0) {
        this.f.add($$0);
    }

    public void c() {
        if (this.h != null) {
            this.h.b();
            this.h.a().a(this.c.k);
        }
    }

    public void d() {
        if (this.h != null) {
            this.h.a().a(gnb.a.b);
        }
    }

    public gfj e() {
        return this.c;
    }

    public double f() {
        return this.c.k.J().b();
    }

    private void b(gfl $$0) {
        switch ($$0) {
            case b: 
            case c: {
                this.h = new a(this, (gnb)new gmy(), 0, 0);
            }
        }
    }

    public void a(gfl $$0) {
        switch ($$0) {
            case a: {
                this.h = null;
                break;
            }
            case b: {
                this.h = new a(this, (gnb)new gmy(), 0, 0);
                break;
            }
            case c: {
                this.h = new a(this, (gnb)new gmy(), 0, 0);
                if (!(this.c.k.a(bdb.b) > 0.0f)) break;
                this.h.a().a(this.c.k);
            }
        }
    }

    class a<T extends gnb> {
        private static final long c = 600L;
        private final T d;
        final int e;
        final int f;
        private long g;
        private long h;
        gnb.a i;
        private long j;
        private float k;
        protected boolean a;
        final /* synthetic */ gnc b;

        /*
         * WARNING - Possible parameter corruption
         */
        a(T $$0, int $$1, int $$2) {
            this.b = (gnc)n2;
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
            this.b();
        }

        public T a() {
            return this.d;
        }

        public void b() {
            this.g = -1L;
            this.h = -1L;
            this.i = gnb.a.b;
            this.j = 0L;
            this.k = 0.0f;
            this.a = false;
        }

        public boolean c() {
            return this.a;
        }

        private void a(long $$0) {
            float $$1 = bgj.a((float)($$0 - this.g) / 600.0f, 0.0f, 1.0f);
            $$1 *= $$1;
            this.k = this.i == gnb.a.b ? 1.0f - $$1 : $$1;
        }

        public void d() {
            long $$0 = bhs.c();
            if (this.g == -1L) {
                this.g = $$0;
                this.i = gnb.a.a;
            }
            if (this.i == gnb.a.a && $$0 - this.g <= 600L) {
                this.h = $$0;
            }
            this.j = $$0 - this.h;
            this.a($$0);
            this.d.a(this.b, this.j);
            gnb.a $$1 = this.d.a();
            if ($$1 != this.i) {
                this.g = $$0 - (long)((int)((1.0f - this.k) * 600.0f));
                this.i = $$1;
            }
            boolean $$2 = this.a;
            boolean bl2 = this.a = this.i == gnb.a.b && $$0 - this.g > 600L;
            if (this.a && !$$2) {
                this.d.d();
            }
        }

        public void a(gir $$0, int $$1) {
            if (this.a) {
                return;
            }
            $$0.e().pushMatrix();
            $$0.e().translate(this.d.a($$1, this.k), this.d.a(this.e));
            this.d.a($$0, this.b.c.g, this.j);
            $$0.e().popMatrix();
        }
    }
}

