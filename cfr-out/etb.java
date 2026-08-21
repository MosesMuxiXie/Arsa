/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectFunction
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class etb<T extends esp> {
    static final Logger a = LogUtils.getLogger();
    final esx<T> b;
    final esr<T> c;
    final esu<T> d;
    private final LongSet e = new LongOpenHashSet();
    private final esy<T> f;

    public etb(Class<T> $$02, esx<T> $$1) {
        this.c = new esr();
        this.d = new esu<T>($$02, (Long2ObjectFunction<ete>)((Long2ObjectFunction)$$0 -> this.e.contains($$0) ? ete.c : ete.b));
        this.b = $$1;
        this.f = new esz<T>(this.c, this.d);
    }

    public void a(dvu $$0) {
        long $$1 = $$0.b();
        this.e.add($$1);
        this.d.b($$1).forEach($$02 -> {
            ete $$1 = $$02.a(ete.c);
            if (!$$1.a()) {
                $$02.b().filter($$0 -> !$$0.el()).forEach(this.b::e);
            }
        });
    }

    public void b(dvu $$0) {
        long $$1 = $$0.b();
        this.e.remove($$1);
        this.d.b($$1).forEach($$02 -> {
            ete $$1 = $$02.a(ete.b);
            if ($$1.a()) {
                $$02.b().filter($$0 -> !$$0.el()).forEach(this.b::d);
            }
        });
    }

    public esy<T> a() {
        return this.f;
    }

    public void a(T $$0) {
        this.c.a($$0);
        long $$1 = jw.c($$0.dK());
        est<T> $$2 = this.d.c($$1);
        $$2.a($$0);
        $$0.a(new a(this, $$0, $$1, $$2));
        this.b.g($$0);
        this.b.c($$0);
        if ($$0.el() || $$2.c().a()) {
            this.b.e($$0);
        }
    }

    @bht
    public int b() {
        return this.c.b();
    }

    void a(long $$0, est<T> $$1) {
        if ($$1.a()) {
            this.d.e($$0);
        }
    }

    @bht
    public String c() {
        return this.c.b() + "," + this.d.b() + "," + this.e.size();
    }

    class a
    implements esq {
        private final T c;
        private long d;
        private est<T> e;
        final /* synthetic */ etb b;

        /*
         * WARNING - Possible parameter corruption
         * WARNING - void declaration
         */
        a(T t2, long $$2, est<T> est2) {
            void var3_3;
            void $$0;
            this.b = (etb)l2;
            this.c = $$0;
            this.d = var3_3;
            this.e = (est)$$2;
        }

        @Override
        public void a() {
            is $$0 = this.c.dK();
            long $$1 = jw.c($$0);
            if ($$1 != this.d) {
                ete $$2 = this.e.c();
                if (!this.e.b(this.c)) {
                    a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jw.a(this.d), $$1});
                }
                this.b.a(this.d, this.e);
                est $$3 = this.b.d.c($$1);
                $$3.a(this.c);
                this.e = $$3;
                this.d = $$1;
                this.b.b.a(this.c);
                if (!this.c.el()) {
                    boolean $$4 = $$2.a();
                    boolean $$5 = $$3.c().a();
                    if ($$4 && !$$5) {
                        this.b.b.d(this.c);
                    } else if (!$$4 && $$5) {
                        this.b.b.e(this.c);
                    }
                }
            }
        }

        @Override
        public void a(cgk.e $$0) {
            ete $$1;
            if (!this.e.b(this.c)) {
                a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jw.a(this.d), $$0});
            }
            if (($$1 = this.e.c()).a() || this.c.el()) {
                this.b.b.d(this.c);
            }
            this.b.b.b(this.c);
            this.b.b.f(this.c);
            this.b.c.b(this.c);
            this.c.a(a);
            this.b.a(this.d, this.e);
        }
    }
}

